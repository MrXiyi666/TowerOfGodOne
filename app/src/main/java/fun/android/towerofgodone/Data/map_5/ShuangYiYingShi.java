package fun.android.towerofgodone.Data.map_5;

import fun.android.towerofgodone.Data.Enemy_Object;

public class ShuangYiYingShi extends Enemy_Object {
    public ShuangYiYingShi() {
        this.HP = 5000; // 极高的生命值，体现其强大的生命力
        this.Attack = 530; // 极高的攻击力，能够造成巨大的物理伤害
        this.Defense = 410; // 高防御力，能够抵御强大的攻击
        this.Critical = 30; // 非常高的暴击率，能够频繁打出高额暴击伤害
        this.Speed = 230; // 非常快的速度，能够快速移动和发动攻击
        this.img_path = "map_5/shuangyiyingshi.png";
        this.Value = 220; // 高经验值，击败它可以获得大量的经验
        this.Gold = 280; // 高掉落金钱数，击败它可以获得大量的金币
    }
}
