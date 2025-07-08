package fun.android.towerofgodone.Data.map_4;

import fun.android.towerofgodone.Data.Enemy_Object;

public class HuangJinSanTouLong extends Enemy_Object {
    public HuangJinSanTouLong() {
        this.HP = 5500; // 极高的生命值，体现其强大的生命力
        this.Attack = 540; // 极高的攻击力，能够造成巨大的伤害
        this.Defense = 430; // 极高的防御力，能够抵御强大的攻击
        this.Critical = 27; // 较高的暴击率，能够打出高额的暴击伤害
        this.Speed = 210; // 较快的速度，能够快速移动和发动攻击
        this.img_path = "map_4/huangjinsantoulong.png";
        this.Value = 220; // 高经验值，击败它可以获得大量的经验
        this.Gold = 280; // 高掉落金钱数，击败它可以获得大量的金币
    }
}
