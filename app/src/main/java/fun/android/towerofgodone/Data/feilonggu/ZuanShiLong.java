package fun.android.towerofgodone.Data.feilonggu;

import fun.android.towerofgodone.Data.Enemy_Object;

//钻石龙
public class ZuanShiLong extends Enemy_Object {
    public ZuanShiLong() {
        this.HP = 1950;
        this.Attack = 205;
        this.Defense = 45;
        this.Critical = 12;
        this.Speed = 22;
        this.img_path = "feilonggu/zuanshilong.png";
        this.Value = 32;
        this.Gold = 31;
    }
}
