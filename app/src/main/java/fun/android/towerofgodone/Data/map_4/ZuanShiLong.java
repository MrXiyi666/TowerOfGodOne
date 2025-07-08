package fun.android.towerofgodone.Data.map_4;

import fun.android.towerofgodone.Data.Enemy_Object;

public class ZuanShiLong extends Enemy_Object {
    public ZuanShiLong() {
        this.HP = 5400; // 极高的生命值，体现其强大的生命力
        this.Attack = 490; // 较高的攻击力，擅长宝石系技能
        this.Defense = 440; // 极高的防御力，能够抵御强大的攻击
        this.Critical = 18; // 适中的暴击率，但防御力极高
        this.Speed = 210; // 较快的速度，能够快速移动和发动攻击
        this.img_path = "map_4/zuanshilong.png";
        this.Value = 220; // 高经验值，击败它可以获得大量的经验
        this.Gold = 275; // 高掉落金钱数，击败它可以获得大量的金币
    }
}
