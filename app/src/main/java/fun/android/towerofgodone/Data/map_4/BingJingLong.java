package fun.android.towerofgodone.Data.map_4;

import fun.android.towerofgodone.Data.Enemy_Object;

public class BingJingLong extends Enemy_Object {
    public BingJingLong() {
        this.HP = 4800; // 极高的生命值
        this.Attack = 490; // 强大的攻击力
        this.Defense = 380; // 高防御力
        this.Critical = 24; // 较高的暴击率
        this.Speed = 195; // 较快的速度
        this.img_path = "map_4/bingjinglong.png";
        this.Value = 190; // 高经验值
        this.Gold = 250; // 高掉落金钱数
    }
}
