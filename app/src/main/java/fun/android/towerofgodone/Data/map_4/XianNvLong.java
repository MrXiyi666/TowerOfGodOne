package fun.android.towerofgodone.Data.map_4;

import fun.android.towerofgodone.Data.Enemy_Object;

public class XianNvLong extends Enemy_Object {
    public XianNvLong() {
        this.HP = 5300; // 极高的生命值，体现其强大的生命力
        this.Attack = 480; // 较高的攻击力，擅长辅助和控制
        this.Defense = 420; // 高防御力，能够抵御强大的攻击
        this.Critical = 20; // 适中的暴击率，但攻击力和辅助能力极高
        this.Speed = 220; // 较快的速度，能够快速移动和发动攻击
        this.img_path = "map_4/xiannvlong.png";
        this.Value = 215; // 高经验值，击败它可以获得大量的经验
        this.Gold = 270; // 高掉落金钱数，击败它可以获得大量的金币
    }
}
