package fun.android.towerofgodone.Data.feilonggu;

import fun.android.towerofgodone.Data.Enemy_Object;

//炎翼魔龙
public class YanYiMoLong extends Enemy_Object {
    public YanYiMoLong() {
        this.HP = 2000;
        this.Attack = 210;
        this.Defense = 22;
        this.Critical = 20;
        this.Speed = 30;
        this.img_path = "feilonggu/yanyimolong.png";
        this.Value = 32;
        this.Gold = 31;
    }
}
