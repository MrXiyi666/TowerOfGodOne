package fun.android.towerofgodone.Data.feilonggu;

import fun.android.towerofgodone.Data.Enemy_Object;

//冰晶龙
public class BingJingLong extends Enemy_Object {
    public BingJingLong() {
        this.HP = 1800;
        this.Attack = 210;
        this.Defense = 22;
        this.Critical = 20;
        this.Speed = 30;
        this.img_path = "feilonggu/bingjinglong.png";
        this.Value = 31;
        this.Gold = 32;
    }
}
