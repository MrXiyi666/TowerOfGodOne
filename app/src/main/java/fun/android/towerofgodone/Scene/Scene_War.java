package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Scene_War extends Scene_Base{
    private ImageView enemy_img, enemy_attack_img, actor_img, actor_attack_img, logo_img;
    private RelativeLayout settled_layout;
    private AppCompatButton button_cancel;
    private TextView settled_text, actor_xhp, enemy_xhp;
    private Bitmap  attack_img_0, attack_img_1, attack_img_2;
    private int 回合 = 0;
    private Handler handler;
    private Runnable runnable;
    private int enemy_hp_text=0;
    private int actor_hp_text=0;
    private int 伤害值 = 0;
    private int 胜负=0;
    private Bitmap back=null;
    private String 是否暴击 = "触发暴击";
    public Scene_War(Context context) {
        super(context);

        attack_img_0 = fun.loadBitmapFromAssets(context, "war/attack_0.png");
        attack_img_1 = fun.loadBitmapFromAssets(context, "war/attack_1.png");
        attack_img_2 = fun.loadBitmapFromAssets(context, "war/attack_2.png");
        switch (fun.Map_Index){
            case 1:
                back = fun.loadBitmapFromAssets(context, "map_1/back_" + fun.Random(3) + ".png");
                break;
            case 2:
                back = fun.loadBitmapFromAssets(context, "map_2/back_" + fun.Random(2) + ".png");
                break;
        }

        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
        view = LayoutInflater.from(context).inflate(R.layout.scene_war, null);
        enemy_img = view.findViewById(R.id.enemy_img);
        enemy_img.setImageBitmap(fun.loadBitmapFromAssets(context, fun.enemy_object.img_path));
        TextView enemy_hp = view.findViewById(R.id.enemy_hp);
        enemy_hp.setText("生命值：" + fun.enemy_object.HP);
        enemy_attack_img = view.findViewById(R.id.enemy_attack_img);
        enemy_xhp = view.findViewById(R.id.enemy_xhp);

        actor_img = view.findViewById(R.id.actor_img);
        actor_img.setImageBitmap(fun.loadBitmapFromAssets(context, Actor_Object.img_path));
        TextView actor_hp = view.findViewById(R.id.actor_hp);
        actor_hp.setText("生命值：" + Actor_Object.HP);
        actor_attack_img = view.findViewById(R.id.actor_attack_img);
        actor_xhp = view.findViewById(R.id.actor_xhp);

        settled_layout = view.findViewById(R.id.settled_layout);
        settled_text = view.findViewById(R.id.settled_text);
        button_cancel = view.findViewById(R.id.button_cancel);
        logo_img = view.findViewById(R.id.logo_img);

        enemy_hp_text = fun.enemy_object.HP;
        actor_hp_text = Actor_Object.HP;
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                switch(胜负){
                    case 0:
                        switch(回合){

                            case 0:  //准备阶段
                                if(fun.enemy_object.Speed > Actor_Object.Speed){
                                    回合 = 2;
                                }else{
                                    回合 = 1;
                                }
                                胜负=0;
                                break;
                            case 1:  //我方攻击
                                是否暴击="";
                                actor_xhp.setVisibility(View.INVISIBLE);
                                actor_attack_img.setImageBitmap(null);
                                伤害值 = Actor_Object.Attack - fun.enemy_object.Defense;
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
                                    胜负=1;
                                }
                                enemy_xhp.setVisibility(View.VISIBLE);
                                enemy_xhp.setText(是否暴击 + "     伤害值：" + 伤害值);
                                enemy_attack_img.setImageBitmap(attack_img_0);
                                enemy_hp.setText("生命值：" + enemy_hp_text);
                                break;
                            case 2:  //敌人攻击
                                是否暴击="";
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
                                    胜负=2;
                                }
                                actor_xhp.setVisibility(View.VISIBLE);
                                actor_xhp.setText(是否暴击 + "     伤害值：" + 伤害值);
                                actor_attack_img.setImageBitmap(attack_img_0);
                                actor_hp.setText("生命值：" + actor_hp_text);
                                break;
                        }
                        回合 = 回合 + 1;
                        伤害值=0;
                        if(回合 > 2){
                            回合=1;
                        }
                        break;
                    case 1:
                        logo_img.setImageBitmap(fun.loadBitmapFromAssets(context, "war/war_true.png"));
                        actor_attack_img.setImageBitmap(null);
                        enemy_attack_img.setImageBitmap(null);
                        enemy_xhp.setVisibility(View.INVISIBLE);
                        actor_xhp.setVisibility(View.INVISIBLE);
                        settled_layout.setVisibility(TextView.VISIBLE);
                        settled_text.setText("胜利啦");
                        break;
                    case 2:
                        logo_img.setImageBitmap(fun.loadBitmapFromAssets(context, "war/war_false.png"));
                        actor_attack_img.setImageBitmap(null);
                        enemy_attack_img.setImageBitmap(null);
                        enemy_xhp.setVisibility(View.INVISIBLE);
                        actor_xhp.setVisibility(View.INVISIBLE);
                        settled_layout.setVisibility(TextView.VISIBLE);
                        settled_text.setText("失败了");
                        break;
                }
                handler.postDelayed(this, 1000);
            }
        };

        // 启动计时器
        handler.post(runnable);

        button_cancel.setOnClickListener(V->{
            switch(fun.Map_Index){
                case 0:
                    fun.scene = new Scene_Map(context);
                    fun.scene.enable_scene();
                    break;
                case 1:
                    fun.scene = new Scene_Map_1(context);
                    fun.scene.enable_scene();
                    break;
                case 2:
                    fun.scene = new Scene_Map_2(context);
                    fun.scene.enable_scene();
                    break;
            }

        });
    }

    @Override
    public void Release() {
        super.Release();
    }
}
