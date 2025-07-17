package fun.android.towerofgodone.Scene.War;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.arms.PoHuaiMoJian;
import fun.android.towerofgodone.Data.shop.goods.arms.XingBaoJian;
import fun.android.towerofgodone.Data.shop.goods.arms.XuanTieZhongJian;
import fun.android.towerofgodone.Data.shop.goods.arms.YiTianJian;
import fun.android.towerofgodone.Data.shop.goods.arms.YingGuangJian;
import fun.android.towerofgodone.Data.shop.goods.arms.ZhanHunDao;
import fun.android.towerofgodone.Data.shop.goods.dress.EMoChangPao;
import fun.android.towerofgodone.Data.shop.goods.dress.HuanYingChangPao;
import fun.android.towerofgodone.Data.shop.goods.dress.XuanLingTianYi;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.Scene.Scene_Base;
import fun.android.towerofgodone.View.Blood_View;

public class Scene_War extends Scene_Base {
    private ImageView enemy_attack_img, enemy_img;
    private ImageView actor_img;
    private ImageView actor_attack_img;
    private ImageView logo_img;
    private LinearLayout settled_layout;
    private AppCompatButton button_cancel;
    private TextView settled_text, actor_xhp, hasten_text;
    private TextView enemy_xhp;
    private Blood_View enemy_hp, actor_hp;
    private Bitmap  enemy_war_img;
    private Bitmap actor_war_img;
    private int 攻击编号 = 0;
    private int 事件流程 = 0;
    private int enemy_hp_text=0;
    private int actor_hp_text=0;
    private int 伤害值 = 0;
    private int handler_time = 1000;
    private int 攻击力加成=0, 生命值加成=0, 防御力加成=0, 暴击率加成, 速度加成;
    private int 攻击次数=0, 回合数=1;
    private int war_se, actor_se;
    private Runnable cancel_runnable;
    private TextView round_text;

    public Scene_War(Context context) {
        super(context);
        war_se = Fun_File.loadSE(context, "war/se/war_se.mp3");
        enemy_war_img = fun.loadBitmapFromAssets(context, "war/war_img.png");
        初始化武器衣服属性(context);
        view = LayoutInflater.from(context).inflate(R.layout.scene_war, null);
        enemy_img = view.findViewById(R.id.enemy_img);
        enemy_img.setImageBitmap(fun.loadBitmapFromAssets(context, fun.enemy_object.img_path));
        enemy_hp = view.findViewById(R.id.enemy_hp);
        enemy_attack_img = view.findViewById(R.id.enemy_attack_img);
        enemy_xhp = view.findViewById(R.id.enemy_xhp);

        actor_img = view.findViewById(R.id.actor_img);
        actor_img.setImageBitmap(fun.loadBitmapFromAssets(context, Actor_Object.img_path));
        actor_hp = view.findViewById(R.id.actor_hp);
        actor_attack_img = view.findViewById(R.id.actor_attack_img);
        actor_xhp = view.findViewById(R.id.actor_xhp);

        settled_layout = view.findViewById(R.id.settled_layout);
        settled_text = view.findViewById(R.id.settled_text);
        button_cancel = view.findViewById(R.id.button_cancel);
        logo_img = view.findViewById(R.id.logo_img);
        hasten_text = view.findViewById(R.id.hasten_text);
        round_text = view.findViewById(R.id.round_text);

        enemy_hp.setText("生命值：" + fun.enemy_object.HP);
        enemy_hp_text = fun.enemy_object.HP;
        enemy_hp.currentValue = enemy_hp_text;
        enemy_hp.maxValue = enemy_hp_text;

        actor_hp_text = Actor_Object.getHP() + 生命值加成;
        actor_hp.currentValue = actor_hp_text;
        actor_hp.maxValue = actor_hp_text;
        actor_hp.setText("生命值：" + actor_hp_text);

        round_text.setText("战斗开始");
        事件流程处理(context);
        事件处理(context);
    }
    public void 初始化武器衣服属性(Context context){
        switch(Actor_Object.Arms){
            case 1:
                actor_war_img = fun.loadBitmapFromAssets(context, "war/yingguangjian.png");
                actor_se = Fun_File.loadSE(context, "war/se/jian_se.mp3");
            case 2:
                actor_war_img = fun.loadBitmapFromAssets(context, "war/yingguangjian.png");
                actor_se = Fun_File.loadSE(context, "war/se/jian_se.mp3");
                break;
            case 7:
                actor_war_img = fun.loadBitmapFromAssets(context, "war/yingguangjian.png");
                actor_se = Fun_File.loadSE(context, "war/se/jian_se.mp3");
                break;
            case 8:
                actor_war_img = fun.loadBitmapFromAssets(context, "war/zhanhundao.png");
                actor_se = Fun_File.loadSE(context, "war/se/jian_se.mp3");
                break;
            case 9:
                actor_war_img = fun.loadBitmapFromAssets(context, "war/xingbaojian.png");
                actor_se = Fun_File.loadSE(context, "war/se/xingbaojian_se.mp3");
                break;
            case 10:
                actor_war_img = fun.loadBitmapFromAssets(context, "war/pohuaimojian.png");
                actor_se = Fun_File.loadSE(context, "war/se/pohuaimojian_se.mp3");
                break;
            default:
                actor_war_img = fun.loadBitmapFromAssets(context, "war/war_img.png");
                actor_se = Fun_File.loadSE(context, "war/se/war_se.mp3");
        }
        switch(Actor_Object.Arms){
            case 1:
                攻击力加成 = new XuanTieZhongJian().Attack;
                break;
            case 2:
                攻击力加成 = new YiTianJian().Attack;
                break;
            case 7:
                攻击力加成 = (int)(new YingGuangJian().Attack + Actor_Object.getAttack() * new YingGuangJian().Attack_Ratio);
                break;
            case 8:
                攻击力加成 = (int)(new ZhanHunDao().Attack + Actor_Object.getAttack() * new ZhanHunDao().Attack_Ratio);
                break;
            case 9:
                攻击力加成 = (int)(new XingBaoJian().Attack + Actor_Object.getAttack() * new XingBaoJian().Attack_Ratio);
                break;
            case 10:
                攻击力加成 = (int)(new PoHuaiMoJian().Attack + Actor_Object.getAttack() * new PoHuaiMoJian().Attack_Ratio);
                break;
        }


        switch(Actor_Object.Dress){
            case 1:
                防御力加成 = new HuanYingChangPao().Defense;
                break;
            case 2:
                防御力加成 = new XuanLingTianYi().Defense;
                break;
            case 7:
                生命值加成 = new EMoChangPao().HP;
                防御力加成 = (int) (new EMoChangPao().Defense + Actor_Object.Defense * new EMoChangPao().Defense_Ratio);
                break;
            default:
                生命值加成=0;
                防御力加成=0;
        }
        攻击力加成 = 攻击力加成 + fun.attack_hoist;
        防御力加成 = 防御力加成 + fun.defense_hoist;
        暴击率加成 = 暴击率加成 + fun.critical_hoist;
        速度加成 = 速度加成 + fun.speed_hoist;
    }

    public void 事件流程处理(Context context){
        view.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(事件流程==0){
                    战斗回合事件(this);
                    return;
                }
                if(事件流程==1){
                    战斗过程事件(this);
                    return;
                }
                if(事件流程==2){
                    胜利事件(context);
                    return;
                }
                if(事件流程==3){
                    失败事件(context);
                }
            }
        },handler_time);

    }

    public void 战斗回合事件(Runnable runnable){
        round_text.setAlpha(1f);
        round_text.setText("第 " + 回合数 + " 回");
        actor_attack_img.setImageBitmap(null);
        enemy_attack_img.setImageBitmap(null);
        enemy_xhp.setVisibility(View.GONE);
        actor_xhp.setVisibility(View.GONE);
        actor_img.setAlpha(1f);
        enemy_img.setAlpha(1f);
        round_text.postDelayed(() -> round_text.setAlpha(0.3f),handler_time/2);
        事件流程=1;
        攻击次数=0;
        if(fun.enemy_object.Speed >= Actor_Object.getSpeed() + fun.speed_hoist){
            攻击编号 = 2;
        }else{
            攻击编号 = 1;
        }
        view.postDelayed(runnable, handler_time);
    }

    public void 战斗过程事件(Runnable runnable){
        round_text.setAlpha(0.3f);
        round_text.setText("第 " + 回合数 + " 回");
        if(攻击编号==1){
            //我方攻击
            我方攻击事件();
            攻击编号=2;
        }else if(攻击编号==2){
            //敌人攻击
            敌方攻击事件();
            攻击编号=1;
        }
        攻击次数++;
        if(事件流程 == 1 && 攻击次数 > 1){
            事件流程=0;
            回合数++;
        }
        view.postDelayed(runnable, handler_time);
    }

    public void 我方攻击事件(){
        round_text.setAlpha(0.3f);
        round_text.setText("第 " + 回合数 + " 回");
        fun.play_SE(actor_se);
        actor_img.setAlpha(1f);
        enemy_img.setAlpha(0.8f);
        actor_xhp.setVisibility(View.INVISIBLE);
        actor_attack_img.setImageBitmap(null);
        int 我方攻击数值 = (Actor_Object.getAttack() + 攻击力加成);
        int 我方暴击率 = Actor_Object.getCritical() + 暴击率加成;
        StringBuilder sb=new StringBuilder();
        if(fun.Random(101) <= 我方暴击率){
            我方攻击数值 = (int) (我方攻击数值 + 我方攻击数值 * (我方暴击率 / 100.0));

            sb.append("攻击 暴击");
        }
        int 敌人防御数值 = fun.enemy_object.Defense;
        if(fun.Random(101) <= fun.enemy_object.Critical){
            敌人防御数值 = (int) (敌人防御数值 + 敌人防御数值 * (fun.enemy_object.Critical / 100.0));
            sb.append("   防御 暴击");
        }
        伤害值 = 我方攻击数值 - 敌人防御数值;
        if(伤害值 <= 0){
            伤害值 = 1;
        }
        if(!sb.toString().isEmpty()){
            round_text.setVisibility(View.VISIBLE);
            round_text.setText(sb);
            round_text.setAlpha(1f);
            round_text.postDelayed(() -> round_text.setAlpha(0.6f),handler_time/2);
        }
        enemy_hp_text = enemy_hp_text - 伤害值;
        if(enemy_hp_text<=0){
            enemy_hp_text=0;
            enemy_img.setAlpha(0f);
            事件流程=2;
        }
        enemy_hp.currentValue = enemy_hp_text;
        enemy_hp.invalidate();
        enemy_xhp.setVisibility(View.VISIBLE);
        enemy_xhp.setText("伤害值：" + 伤害值);
        enemy_attack_img.setImageBitmap(actor_war_img);
        enemy_hp.setText("生命值：" + enemy_hp_text);
    }

    public void 敌方攻击事件(){
        round_text.setAlpha(0.3f);
        round_text.setText("第 " + 回合数 + " 回");
        fun.play_SE(war_se);
        actor_img.setAlpha(0.8f);
        enemy_img.setAlpha(1f);
        enemy_xhp.setVisibility(View.INVISIBLE);
        enemy_attack_img.setImageBitmap(null);
        int 敌方攻击数值 = fun.enemy_object.Attack;
        StringBuilder sb=new StringBuilder();
        if(fun.Random(101) <= fun.enemy_object.Critical){
            敌方攻击数值 = (int) (敌方攻击数值 + 敌方攻击数值 * (fun.enemy_object.Critical / 100.0));
            sb.append("攻击 暴击");
        }
        int 我方防御数值 = (Actor_Object.getDefense() + 防御力加成);
        int 我方暴击率 = Actor_Object.getCritical() + 暴击率加成;
        if(fun.Random(101) <= 我方暴击率){
            我方防御数值 = (int) (我方防御数值 + 我方防御数值 * (我方暴击率 / 100.0));
            sb.append("   防御 暴击");
        }
        伤害值 = 敌方攻击数值 - 我方防御数值;
        if(伤害值 <= 0){
            伤害值 = 1;
        }
        if(!sb.toString().isEmpty()){
            round_text.setVisibility(View.VISIBLE);
            round_text.setText(sb);
            round_text.setAlpha(1f);
            round_text.postDelayed(() -> round_text.setAlpha(0.6f),handler_time/2);
        }
        actor_hp_text = actor_hp_text - 伤害值;
        if(actor_hp_text<=0){
            actor_hp_text=0;
            actor_img.setAlpha(0f);
            事件流程=3;
        }

        actor_hp.currentValue = actor_hp_text;
        actor_hp.invalidate();
        actor_xhp.setVisibility(View.VISIBLE);
        actor_xhp.setText("伤害值：" + 伤害值);
        actor_attack_img.setImageBitmap(enemy_war_img);
        actor_hp.setText("生命值：" + actor_hp_text);

    }

    public void 胜利事件(Context context){
        handler_time=3000;
        round_text.setAlpha(0f);
        enemy_img.setAlpha(0f);
        actor_img.setAlpha(1f);
        logo_img.setImageBitmap(fun.loadBitmapFromAssets(context, "war/war_true.png"));
        actor_attack_img.setImageBitmap(null);
        enemy_attack_img.setImageBitmap(null);
        enemy_xhp.setVisibility(View.INVISIBLE);
        actor_xhp.setVisibility(View.INVISIBLE);
        settled_layout.setVisibility(TextView.VISIBLE);
        String text = "能量：" + fun.enemy_object.Value + "\n金币：" + fun.enemy_object.Gold;
        for(String name : fun.enemy_object.item){
            text = text + "\n"+name;
        }
        settled_text.setText(text);
        Actor_Object.Value = Actor_Object.Value + fun.enemy_object.Value;
        Actor_Object.Gold = Actor_Object.Gold + fun.enemy_object.Gold;
        fun.drug_list.addAll(fun.enemy_object.item);

        Fun_File.SaveValue(context);
        Fun_File.SaveGold(context);
        Fun_File.SaveDrugList(context);
        view.postDelayed(cancel_runnable, handler_time);
    }

    public void 失败事件(Context context){
        handler_time=3000;
        round_text.setAlpha(0f);
        enemy_img.setAlpha(1f);
        actor_img.setAlpha(0f);
        logo_img.setImageBitmap(fun.loadBitmapFromAssets(context, "war/war_false.png"));
        actor_attack_img.setImageBitmap(null);
        enemy_attack_img.setImageBitmap(null);
        enemy_xhp.setVisibility(View.INVISIBLE);
        actor_xhp.setVisibility(View.INVISIBLE);
        settled_layout.setVisibility(TextView.VISIBLE);
        settled_text.setText("提升实力 再来挑战吧");
        view.postDelayed(cancel_runnable, handler_time);
    }

    public void 事件处理(Context context){
        cancel_runnable = new Runnable() {
            @Override
            public void run() {
                cancel_fun(context);
            }
        };
        button_cancel.setOnClickListener(V->{
            cancel_fun(context);
        });
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getActionMasked();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // 按下事件
                        handler_time = 300;
                        hasten_text.setVisibility(View.VISIBLE);
                        break;
                    case MotionEvent.ACTION_MOVE:
                        break;
                    case MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL:
                        hasten_text.setVisibility(View.INVISIBLE);
                        handler_time = 1000;
                        break;
                }
                return true;
            }
        });
    }

    public void cancel_fun(Context context){
        fun.view_transition.start(fun.Scene_War_Cancel);
        //清除属性增加效果
        fun.attack_hoist = 0;
        Fun_File.SaveAttackHoist(context);
        fun.defense_hoist = 0;
        Fun_File.SaveDefenseHoist(context);
        fun.critical_hoist = 0;
        Fun_File.SaveCriticalHoist(context);
        fun.speed_hoist = 0;
        Fun_File.SaveSpeedHoist(context);
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
    }

    @Override
    public void Release() {
        super.Release();
        view.removeCallbacks(cancel_runnable);
        cancel_runnable=null;
        Fun_File.release_SE(war_se);
        Fun_File.release_SE(actor_se);
        fun.ClearImageView(enemy_attack_img);
        fun.ClearImageView(enemy_img);
        fun.ClearImageView(actor_img);
        fun.ClearImageView(actor_attack_img);
        fun.ClearImageView(logo_img);
    }
}