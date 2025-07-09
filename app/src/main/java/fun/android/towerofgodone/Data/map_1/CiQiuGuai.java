package fun.android.towerofgodone.Data.map_1;

import fun.android.towerofgodone.Data.Enemy_Object;
//代表练气一层
public class CiQiuGuai extends Enemy_Object {
    public CiQiuGuai(){
        this.HP = 40;
        this.Attack = 8;
        this.Defense = 4;
        this.Critical = 3;
        this.Speed = 12;
        this.img_path = "map_1/ciqiuguai.png";
        this.Value=6;
        this.Gold=6;

    }
}
