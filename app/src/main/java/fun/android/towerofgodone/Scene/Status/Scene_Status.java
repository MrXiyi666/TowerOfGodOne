package fun.android.towerofgodone.Scene.Status;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.arms.PoHuaiMoJian;
import fun.android.towerofgodone.Data.shop.goods.arms.XingBaoJian;
import fun.android.towerofgodone.Data.shop.goods.arms.XuanTieZhongJian;
import fun.android.towerofgodone.Data.shop.goods.arms.YiTianJian;
import fun.android.towerofgodone.Data.shop.goods.arms.YingGuangJian;
import fun.android.towerofgodone.Data.shop.goods.arms.ZhanHunDao;
import fun.android.towerofgodone.Data.shop.goods.dress.EMoChangPao;
import fun.android.towerofgodone.Data.shop.goods.dress.HuanYingChangPao;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.Scene.Scene_Base;
import fun.android.towerofgodone.Scene.Scene_Map;
import fun.android.towerofgodone.Window.Window_Boundary;

public class Scene_Status extends Scene_Base {
    TextView bounday, value, actor_hp_text, actor_attack_text, actor_defense_text, actor_critical_text, actor_speed_text, actor_arms_text, actor_dress_text;
    public Scene_Status(Context context) {
        super(context);

        view = LayoutInflater.from(context).inflate(R.layout.scene_status, null);
        ImageView actor_avatar_img = view.findViewById(R.id.actor_avatar_img);
        actor_avatar_img.setImageBitmap(fun.loadBitmapFromAssets(context, "actor/avatar.png"));
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
        });
        create_view();
        refresh(context);
        view.findViewById(R.id.button_up_boundary).setOnClickListener(V->{
            new Window_Boundary(context, Scene_Status.this);
        });

    }
    public void create_view(){
        bounday = view.findViewById(R.id.boundary);
        value = view.findViewById(R.id.value);
        actor_hp_text = view.findViewById(R.id.actor_hp_text);
        actor_attack_text = view.findViewById(R.id.actor_attack_text);
        actor_defense_text = view.findViewById(R.id.actor_defense_text);
        actor_critical_text = view.findViewById(R.id.actor_critical_text);
        actor_speed_text = view.findViewById(R.id.actor_speed_text);
        actor_arms_text = view.findViewById(R.id.actor_arms_text);
        actor_dress_text = view.findViewById(R.id.actor_dress_text);
    }
    public void refresh(Context context){
        bounday.setText(Actor_Object.getBoundary());
        value.setText(Actor_Object.Value + "");
        switch(Actor_Object.Arms){
            case 1:
                actor_attack_text.setText(Actor_Object.getAttack() + " + " + new XuanTieZhongJian().Attack +  (fun.attack_hoist != 0 ? " + " + fun.attack_hoist : ""));
                break;
            case 2:
                actor_attack_text.setText(Actor_Object.getAttack() + " + " + new YiTianJian().Attack +  (fun.attack_hoist != 0 ? " + " + fun.attack_hoist : ""));
                break;
            case 7:
                actor_attack_text.setText(Actor_Object.getAttack() + " + " + (int)(new YingGuangJian().Attack + new YingGuangJian().Attack_Ratio * Actor_Object.getAttack()) +  (fun.attack_hoist != 0 ? " + " + fun.attack_hoist : ""));
                break;
            case 8:
                actor_attack_text.setText(Actor_Object.getAttack() + " + " + (int)(new ZhanHunDao().Attack + new ZhanHunDao().Attack_Ratio * Actor_Object.getAttack()) +  (fun.attack_hoist != 0 ? " + " + fun.attack_hoist : ""));
                break;
            case 9:
                actor_attack_text.setText(Actor_Object.getAttack() + " + " + (int)(new XingBaoJian().Attack + new XingBaoJian().Attack_Ratio * Actor_Object.getAttack()) +  (fun.attack_hoist != 0 ? " + " + fun.attack_hoist : ""));
                break;
            case 10:
                actor_attack_text.setText(Actor_Object.getAttack() + " + " + (int)(new PoHuaiMoJian().Attack + new PoHuaiMoJian().Attack_Ratio * Actor_Object.getAttack()) +  (fun.attack_hoist != 0 ? " + " + fun.attack_hoist : ""));
                break;
            default:
                actor_attack_text.setText(Actor_Object.getAttack() +  (fun.attack_hoist != 0 ? " + " + fun.attack_hoist : ""));
        }
        switch(Actor_Object.Dress){
            case 1:
                actor_defense_text.setText(Actor_Object.getDefense() + " + " + (int)(new HuanYingChangPao().Defense + new HuanYingChangPao().Defense_Ratio * Actor_Object.getDefense()) + (fun.defense_hoist != 0 ? " + " + fun.defense_hoist : ""));
                break;
            case 7:
                actor_defense_text.setText(Actor_Object.getDefense() + " + " + (int)(new EMoChangPao().Defense + new EMoChangPao().Defense_Ratio * Actor_Object.getDefense()) + (fun.defense_hoist != 0 ? " + " + fun.defense_hoist : ""));
                actor_hp_text.setText(Actor_Object.getHP() + " + " + new EMoChangPao().HP);
                break;
            default:
                actor_defense_text.setText(Actor_Object.getDefense() + "" +  (fun.defense_hoist != 0 ? " + " + fun.defense_hoist : ""));
                actor_hp_text.setText(Actor_Object.getHP() + "");
        }

        actor_critical_text.setText(Actor_Object.getCritical() + "" +  (fun.critical_hoist != 0 ? " + " + fun.critical_hoist : ""));

        actor_speed_text.setText(Actor_Object.getSpeed() + "" +  (fun.speed_hoist != 0 ? " + " + fun.speed_hoist : ""));

        actor_arms_text.setText(Actor_Object.getArms());

        actor_dress_text.setText(Actor_Object.getDress());


        actor_arms_text.setOnClickListener(V->{
            actor_arms_text.setText("");
            actor_attack_text.setText(Actor_Object.getAttack() +  (fun.attack_hoist != 0 ? " + " + fun.attack_hoist : ""));
            Actor_Object.Arms=0;
            fun.Mess(context,"卸掉武器");
        });

        actor_dress_text.setOnClickListener(V->{
            actor_dress_text.setText("");
            actor_hp_text.setText(Actor_Object.getHP() + "");
            actor_defense_text.setText(Actor_Object.getDefense() + "" +  (fun.defense_hoist != 0 ? " + " + fun.defense_hoist : ""));
            Actor_Object.Dress=0;
            fun.Mess(context,"卸掉衣服");
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