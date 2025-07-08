package fun.android.towerofgodone.Data.map_4;

import fun.android.towerofgodone.Data.Enemy_Object;

//翠影灵龙
public class CuiYingLingLong extends Enemy_Object {
    public CuiYingLingLong() {
        this.HP = 4500; // 较高的生命值，体现其耐力
        this.Attack = 480; // 强大的攻击力，擅长远程攻击
        this.Defense = 360; // 较高的防御力，能够抵御一定的伤害
        this.Critical = 28; // 较高的暴击率，能够打出高额伤害
        this.Speed = 230; // 非常快的速度，能够快速移动和发动攻击
        this.img_path = "map_4/cuiyinglinglong.png";
        this.Value = 190; // 高经验值，击败它可以获得大量的经验
        this.Gold = 240; // 高掉落金钱数，击败它可以获得大量的金币
    }
}
