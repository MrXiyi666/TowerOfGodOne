package fun.android.towerofgodone.Data.map_4;

import fun.android.towerofgodone.Data.Enemy_Object;

//金鳞圣龙
public class JinLingShengLong extends Enemy_Object {
    public JinLingShengLong() {
        this.HP = 5000; // 极高的生命值，体现其强大的生命力
        this.Attack = 490; // 强大的攻击力，能够造成巨大的神圣伤害
        this.Defense = 400; // 极高的防御力，能够抵御强大的攻击
        this.Critical = 22; // 适中的暴击率，但攻击力极高
        this.Speed = 190; // 较快的速度，能够快速移动和发动攻击
        this.img_path = "map_4/jinlingshenglong.png";
        this.Value = 200; // 高经验值，击败它可以获得大量的经验
        this.Gold = 260; // 高掉落金钱数，击败它可以获得大量的金币
    }
}
