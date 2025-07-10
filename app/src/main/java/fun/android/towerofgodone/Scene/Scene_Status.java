package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
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
import fun.android.towerofgodone.Window.Window_Boundary;

public class Scene_Status extends Scene_Base{
    public Scene_Status(Context context) {
        super(context);

        view = LayoutInflater.from(context).inflate(R.layout.scene_status, null);
        ImageView actor_avatar_img = view.findViewById(R.id.actor_avatar_img);
        actor_avatar_img.setImageBitmap(fun.loadBitmapFromAssets(context, "actor/avatar.png"));
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
        });
        refresh(context);
        AppCompatButton button_up_boundary = view.findViewById(R.id.button_up_boundary);
        button_up_boundary.setOnClickListener(V->{
            new Window_Boundary(context, Scene_Status.this);
        });

    }

    public void refresh(Context context){
        TextView bounday = view.findViewById(R.id.boundary);
        bounday.setText(Actor_Object.Boundary + "");
        TextView value = view.findViewById(R.id.value);
        value.setText(Actor_Object.Value + "");
        TextView actor_hp_text = view.findViewById(R.id.actor_hp_text);
        actor_hp_text.setText(Actor_Object.HP + "");
        TextView actor_attack_text = view.findViewById(R.id.actor_attack_text);
        switch(Actor_Object.Arms){
            case "荧光剑":
                actor_attack_text.setText(Actor_Object.Attack + " + " + (int)(new YingGuangJian().Attack + new YingGuangJian().Attack_Ratio * Actor_Object.Attack));
                break;
            case "战魂刀":
                actor_attack_text.setText(Actor_Object.Attack + " + " + (int)(new ZhanHunDao().Attack + new ZhanHunDao().Attack_Ratio * Actor_Object.Attack));
                break;
            case "星爆剑":
                actor_attack_text.setText(Actor_Object.Attack + " + " + (int)(new XingBaoJian().Attack + new XingBaoJian().Attack_Ratio * Actor_Object.Attack));
                break;
            case "破坏魔剑":
                actor_attack_text.setText(Actor_Object.Attack + " + " + (int)(new PoHuaiMoJian().Attack + new PoHuaiMoJian().Attack_Ratio * Actor_Object.Attack));
                break;
            default:
                actor_attack_text.setText(Actor_Object.Attack + "");
        }
        TextView actor_defense_text = view.findViewById(R.id.actor_defense_text);
        actor_defense_text.setText(Actor_Object.Defense + "");
        TextView actor_critical_text = view.findViewById(R.id.actor_critical_text);
        actor_critical_text.setText(Actor_Object.Critical + "");
        TextView actor_speed_text = view.findViewById(R.id.actor_speed_text);
        actor_speed_text.setText(Actor_Object.Speed + "");
        TextView actor_arms_text = view.findViewById(R.id.actor_arms_text);

        actor_arms_text.setText(Actor_Object.Arms);
        TextView actor_dress_text = view.findViewById(R.id.actor_dress_text);
        actor_dress_text.setText(Actor_Object.Dress);


        actor_arms_text.setOnClickListener(V->{
            actor_arms_text.setText("");
            actor_attack_text.setText(Actor_Object.Attack + "");
            Actor_Object.Arms="";
            Fun_File.Save(context);
            fun.Mess(context,"卸掉武器");
        });
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "status/back_" + fun.Random(7) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();
    }

}