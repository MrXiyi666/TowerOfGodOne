package fun.android.towerofgodone.Data.map_5;

import fun.android.towerofgodone.Data.Enemy_Object;

public class KeMoDuoZhanZhenJuShou extends Enemy_Object {
    public KeMoDuoZhanZhenJuShou() {
        this.HP = 5800; // 极高的生命值，体现其强大的耐力
        this.Attack = 560; // 极高的攻击力，能够造成巨大的近战伤害
        this.Defense = 460; // 极高的防御力，能够抵御强大的攻击
        this.Critical = 20; // 适中的暴击率，但攻击力极高
        this.Speed = 180; // 较慢的速度，但力量型魔兽通常速度不快
        this.img_path = "map_5/kemoduozhanzhenjushou.png";
        this.Value = 230; // 高经验值，击败它可以获得大量的经验
        this.Gold = 300; // 高掉落金钱数，击败它可以获得大量的金币
    }
}
