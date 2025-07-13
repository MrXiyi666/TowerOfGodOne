package fun.android.towerofgodone.Data.mowusenlin;

import fun.android.towerofgodone.Data.Enemy_Object;
//代表练气一层
public class CiQiuGuai extends Enemy_Object {
    public CiQiuGuai(){
        this.HP = 45;
        this.Attack = 9;
        this.Defense = 8;
        this.Critical = 3;
        this.Speed = 7;
        this.img_path = "mowusenlin/ciqiuguai.png";
        this.Value=6;
        this.Gold=6;
    }
}
