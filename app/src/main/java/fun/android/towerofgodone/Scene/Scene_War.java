package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
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
import fun.android.towerofgodone.Data.shop.goods.arms.YingGuangJian;
import fun.android.towerofgodone.Data.shop.goods.arms.ZhanHunDao;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.View.Blood_View;

public class Scene_War extends Scene_Base{
    private ImageView enemy_attack_img;
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
    private int 回合 = 0;
    private int enemy_hp_text=0;
    private int actor_hp_text=0;
    private int 伤害值 = 0;
    private int 胜负=0;
    private Bitmap back=null;
    private String 是否暴击 = "触发暴击";
    private int handler_time = 1000;
    private int 武器攻击力=0;
    public Scene_War(Context context) {
        super(context);

        enemy_war_img = fun.loadBitmapFromAssets(context, "war/war_img.png");
        switch(Actor_Object.Arms){
            case "荧光剑":
                actor_war_img = fun.loadBitmapFromAssets(context, "war/yingguangjian.png");
                break;
            case "战魂刀":
                actor_war_img = fun.loadBitmapFromAssets(context, "war/zhanhundao.png");
                break;
            case "星爆剑":
                actor_war_img = fun.loadBitmapFromAssets(context, "war/xingbaojian.png");
                break;
            case "破坏魔剑":
                actor_war_img = fun.loadBitmapFromAssets(context, "war/pohuaimojian.png");
                break;
            default:
                actor_war_img = fun.loadBitmapFromAssets(context, "war/war_img.png");
        }
        view = LayoutInflater.from(context).inflate(R.layout.scene_war, null);
        ImageView enemy_img = view.findViewById(R.id.enemy_img);
        enemy_img.setImageBitmap(fun.loadBitmapFromAssets(context, fun.enemy_object.img_path));
        enemy_hp = view.findViewById(R.id.enemy_hp);
        enemy_hp.setText("生命值：" + fun.enemy_object.HP);
        enemy_attack_img = view.findViewById(R.id.enemy_attack_img);
        enemy_xhp = view.findViewById(R.id.enemy_xhp);

        actor_img = view.findViewById(R.id.actor_img);
        actor_img.setImageBitmap(fun.loadBitmapFromAssets(context, Actor_Object.img_path));
        actor_hp = view.findViewById(R.id.actor_hp);
        actor_hp.setText("生命值：" + Actor_Object.HP);
        actor_attack_img = view.findViewById(R.id.actor_attack_img);
        actor_xhp = view.findViewById(R.id.actor_xhp);

        settled_layout = view.findViewById(R.id.settled_layout);
        settled_text = view.findViewById(R.id.settled_text);
        button_cancel = view.findViewById(R.id.button_cancel);
        logo_img = view.findViewById(R.id.logo_img);
        hasten_text = view.findViewById(R.id.hasten_text);

        enemy_hp_text = fun.enemy_object.HP;
        actor_hp_text = Actor_Object.HP;
        enemy_hp.currentValue = enemy_hp_text;
        enemy_hp.maxValue = enemy_hp_text;
        actor_hp.currentValue = Actor_Object.HP;
        actor_hp.maxValue = Actor_Object.HP;
        if(fun.enemy_object.Speed > Actor_Object.Speed){
            回合 = 2;
        }else{
            回合 = 1;
        }
        胜负=0;
        switch(Actor_Object.Arms){
            case "荧光剑":
                武器攻击力 = (int)(new YingGuangJian().Attack + Actor_Object.Attack * new YingGuangJian().Attack_Ratio);
                break;
            case "战魂刀":
                武器攻击力 = (int)(new ZhanHunDao().Attack + Actor_Object.Attack * new ZhanHunDao().Attack_Ratio);
                break;
            case "星爆剑":
                武器攻击力 = (int)(new XingBaoJian().Attack + Actor_Object.Attack * new XingBaoJian().Attack_Ratio);
                break;
            case "破坏魔剑":
                武器攻击力 = (int)(new PoHuaiMoJian().Attack + Actor_Object.Attack * new PoHuaiMoJian().Attack_Ratio);
                break;
        }

        view.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(胜负==1){
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
                    Fun_File.Save(context);
                    Fun_File.SaveDrug(context);
                    button_cancel.postDelayed(()->{
                        cancel_fun(context);
                    },3000);
                    return;
                }
                if(胜负==2){
                    enemy_img.setAlpha(1f);
                    actor_img.setAlpha(0f);
                    logo_img.setImageBitmap(fun.loadBitmapFromAssets(context, "war/war_false.png"));
                    actor_attack_img.setImageBitmap(null);
                    enemy_attack_img.setImageBitmap(null);
                    enemy_xhp.setVisibility(View.INVISIBLE);
                    actor_xhp.setVisibility(View.INVISIBLE);
                    settled_layout.setVisibility(TextView.VISIBLE);
                    settled_text.setText("提升自己的实力 再来挑战吧");
                    button_cancel.postDelayed(()->{
                        cancel_fun(context);
                    },3000);
                    return;
                }
                switch(回合){
                    case 1:  //我方攻击
                        actor_img.setAlpha(1f);
                        enemy_img.setAlpha(0.8f);
                        是否暴击="";
                        actor_xhp.setVisibility(View.INVISIBLE);
                        actor_attack_img.setImageBitmap(null);
                        伤害值 = (Actor_Object.Attack + 武器攻击力) - fun.enemy_object.Defense;
                        if(伤害值 <= 0){
                            伤害值 = 1;
                        }

                        if(fun.Random(101) <= Actor_Object.Critical){
                            伤害值 = 伤害值 + 伤害值;
                            是否暴击="暴击";
                        }
                        enemy_hp_text = enemy_hp_text - 伤害值;
                        if(enemy_hp_text<=0){
                            enemy_hp_text=0;
                            enemy_img.setAlpha(0f);
                            胜负=1;
                        }
                        enemy_hp.currentValue = enemy_hp_text;
                        enemy_hp.invalidate();
                        enemy_xhp.setVisibility(View.VISIBLE);
                        enemy_xhp.setText(是否暴击 + "     伤害值：" + 伤害值);
                        enemy_attack_img.setImageBitmap(actor_war_img);
                        enemy_hp.setText("生命值：" + enemy_hp_text);
                        break;
                    case 2:  //敌人攻击
                        是否暴击="";
                        actor_img.setAlpha(0.8f);
                        enemy_img.setAlpha(1f);
                        enemy_xhp.setVisibility(View.INVISIBLE);
                        enemy_attack_img.setImageBitmap(null);
                        伤害值 = fun.enemy_object.Attack - Actor_Object.Defense;
                        if(伤害值 <= 0){
                            伤害值 = 1;
                        }
                        if(fun.Random(101) <= fun.enemy_object.Critical){
                            伤害值 = 伤害值 + 伤害值;
                            是否暴击="暴击";
                        }
                        actor_hp_text = actor_hp_text - 伤害值;
                        if(actor_hp_text <= 0){
                            actor_hp_text=0;
                            actor_img.setAlpha(0f);
                            胜负=2;
                        }
                        actor_hp.currentValue = actor_hp_text;
                        actor_hp.invalidate();
                        actor_xhp.setVisibility(View.VISIBLE);
                        actor_xhp.setText(是否暴击 + "     伤害值：" + 伤害值);
                        actor_attack_img.setImageBitmap(enemy_war_img);
                        actor_hp.setText("生命值：" + actor_hp_text);
                        break;
                }
                回合 = 回合 + 1;
                伤害值=0;
                if(回合 > 2){
                    回合=1;
                }
                view.postDelayed(this,handler_time);
            }
        },handler_time);


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
        switch(fun.Map_Index){
            case 0:
                fun.view_transition.start(new Scene_Map(context));
                break;
            case 1:
                fun.view_transition.start(new Scene_Map_1(context));
                break;
            case 2:
                fun.view_transition.start(new Scene_Map_2(context));
                break;
            case 3:
                fun.view_transition.start(new Scene_Map_3(context));
                break;
            case 4:
                fun.view_transition.start(new Scene_Map_4(context));
                break;
            case 5:
                fun.view_transition.start(new Scene_Map_5(context));
                break;
        }
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        switch (fun.Map_Index){
            case 1:
                back = fun.loadBitmapFromAssets(context, "map_1/back_" + fun.Random(3) + ".png");
                break;
            case 2:
                back = fun.loadBitmapFromAssets(context, "map_2/back_" + fun.Random(2) + ".png");
                break;
            case 3:
                back = fun.loadBitmapFromAssets(context, "map_3/back_" + fun.Random(5) + ".png");
                break;
            case 4:
                back = fun.loadBitmapFromAssets(context, "map_4/back_" + fun.Random(7) + ".png");
                break;
            case 5:
                back = fun.loadBitmapFromAssets(context, "map_5/back_" + fun.Random(7) + ".png");
                break;
        }

        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();
    }
}
