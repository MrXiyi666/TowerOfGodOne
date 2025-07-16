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
import fun.android.towerofgodone.Data.shop.goods.dress.XuanLingTianYi;
import fun.android.towerofgodone.Fun.Fun_File;
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
        create_view(context);
        refresh();

    }
    public void create_view(Context context){
        bounday = view.findViewById(R.id.boundary);
        value = view.findViewById(R.id.value);
        actor_hp_text = view.findViewById(R.id.actor_hp_text);
        actor_attack_text = view.findViewById(R.id.actor_attack_text);
        actor_defense_text = view.findViewById(R.id.actor_defense_text);
        actor_critical_text = view.findViewById(R.id.actor_critical_text);
        actor_speed_text = view.findViewById(R.id.actor_speed_text);
        actor_arms_text = view.findViewById(R.id.actor_arms_text);
        actor_dress_text = view.findViewById(R.id.actor_dress_text);

        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
        });

        actor_arms_text.setOnClickListener(V->{
            Actor_Object.Arms=0;
            Fun_File.SaveArms(context);
            fun.Mess(context,"卸掉武器");
            refresh();
        });

        actor_dress_text.setOnClickListener(V->{
            Actor_Object.Dress=0;
            Fun_File.SaveDress(context);
            fun.Mess(context,"卸掉衣服");
            refresh();
        });

        view.findViewById(R.id.button_up_boundary).setOnClickListener(V->{
            new Window_Boundary(context, Scene_Status.this);
        });

    }
    public void refresh(){
        bounday.setText(Actor_Object.getBoundary());
        value.setText(Actor_Object.Value + "");
        actor_arms_text.setText(Actor_Object.getArms());
        actor_dress_text.setText(Actor_Object.getDress());
        actor_hp_text.setText(Actor_Object.getHP() + "");
        actor_attack_text.setText(Actor_Object.getAttack() + "");
        actor_defense_text.setText(Actor_Object.getDefense()+"");
        actor_critical_text.setText(Actor_Object.getCritical()+"");
        actor_speed_text.setText(Actor_Object.getSpeed()+"");

        switch(Actor_Object.Arms){
            case 1:
                actor_attack_text.setText(actor_attack_text.getText() + " + " + new XuanTieZhongJian().Attack );
                break;
            case 2:
                actor_attack_text.setText(actor_attack_text.getText() + " + " + new YiTianJian().Attack);
                break;
            case 7:
                actor_attack_text.setText(actor_attack_text.getText() + " + " + (int)(new YingGuangJian().Attack + new YingGuangJian().Attack_Ratio * Actor_Object.getAttack()));
                break;
            case 8:
                actor_attack_text.setText(actor_attack_text.getText() + " + " + (int)(new ZhanHunDao().Attack + new ZhanHunDao().Attack_Ratio * Actor_Object.getAttack()));
                break;
            case 9:
                actor_attack_text.setText(actor_attack_text.getText() + " + " + (int)(new XingBaoJian().Attack + new XingBaoJian().Attack_Ratio * Actor_Object.getAttack()));
                break;
            case 10:
                actor_attack_text.setText(actor_attack_text.getText() + " + " + (int)(new PoHuaiMoJian().Attack + new PoHuaiMoJian().Attack_Ratio * Actor_Object.getAttack()));
                break;
        }

        switch(Actor_Object.Dress){
            case 1:
                actor_defense_text.setText(actor_defense_text.getText() + " + " + new HuanYingChangPao().Defense);
                break;
            case 2:
                actor_defense_text.setText(actor_defense_text.getText() + " + " + new XuanLingTianYi().Defense);
                break;
            case 7:
                actor_defense_text.setText(actor_defense_text.getText() + " + " + (int)(new EMoChangPao().Defense + new EMoChangPao().Defense_Ratio * Actor_Object.getDefense()));
                actor_hp_text.setText(actor_hp_text.getText() + " + " + new EMoChangPao().HP);
                break;
        }

        actor_attack_text.setText(actor_attack_text.getText() +  (fun.attack_hoist != 0 ? " + " + fun.attack_hoist : ""));

        actor_defense_text.setText(actor_defense_text.getText() +  (fun.defense_hoist != 0 ? " + " + fun.defense_hoist : ""));

        actor_critical_text.setText(actor_critical_text.getText() + "" +  (fun.critical_hoist != 0 ? " + " + fun.critical_hoist : ""));

        actor_speed_text.setText(actor_speed_text.getText() + "" +  (fun.speed_hoist != 0 ? " + " + fun.speed_hoist : ""));

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