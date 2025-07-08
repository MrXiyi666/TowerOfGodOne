package fun.android.towerofgodone.Data.map_4;

import fun.android.towerofgodone.Data.Enemy_Object;

public class AnYan extends Enemy_Object {
    public AnYan() {
        this.HP = 5200; // 极高的生命值，体现其强大的生命力
        this.Attack = 520; // 极高的攻击力，能够造成巨大的火焰和黑暗伤害
        this.Defense = 400; // 高防御力，能够抵御强大的攻击
        this.Critical = 26; // 较高的暴击率，能够打出高额的暴击伤害
        this.Speed = 205; // 较快的速度，能够快速移动和发动攻击
        this.img_path = "map_4/anyan.png";
        this.Value = 210; // 高经验值，击败它可以获得大量的经验
        this.Gold = 265; // 高掉落金钱数，击败它可以获得大量的金币
    }
}
