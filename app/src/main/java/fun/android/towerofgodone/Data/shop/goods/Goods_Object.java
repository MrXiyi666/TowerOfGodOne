package fun.android.towerofgodone.Data.shop.goods;

import android.content.Context;

public class Goods_Object {

    public String name="";
    public String shows="";
    public int price=0;
    public int Attack=0;
    public float Attack_Ratio;
    public int Defense=0;
    public int Critical=0;
    public int Speed=0;
    public int id=0;
    public String type="";
    public String img_path="";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setShows(String shows) {
        this.shows = shows;
    }

    public String getShows() {
        return shows;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void fun(Context context){

    }
}
