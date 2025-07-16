package fun.android.towerofgodone.Data;

import java.util.ArrayList;
import java.util.List;

public class Actor_Object {
    public static int Boundary = 0;
    public static int HP = 60;      //生命值
    public static int Attack = 10;  //攻击力
    public static int Defense = 6; //防御力
    public static int Critical = 5;  //暴击率
    public static int Speed = 10;    //速度
    public static String img_path = "actor/actor_false.png";
    public static int Value = 0;    //能量值
    public static int Gold = 0;     //金币
    public static int Arms = 0;    //装备编号
    public static int Dress = 0;   //衣服编号

    static List<Boundary_Data_Item> Boundary_List = new ArrayList<>();

    public static void Create(){
        Boundary_Data_Item 境界 = new Boundary_Data_Item();
        境界.Name="练气 一层";
        境界.Value=50;
        境界.HP=60;
        境界.Attack=10;
        境界.Defense=6;
        境界.Critical=5;
        境界.Speed=10;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="练气 二层";
        境界.Value=84;
        境界.HP=162;
        境界.Attack=21;
        境界.Defense=7;
        境界.Critical=6;
        境界.Speed=11;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="练气 三层";
        境界.Value=130;
        境界.HP=263;
        境界.Attack=31;
        境界.Defense=8;
        境界.Critical=7;
        境界.Speed=12;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="练气 四层";
        境界.Value=190;
        境界.HP=365;
        境界.Attack=41;
        境界.Defense=9;
        境界.Critical=7;
        境界.Speed=13;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="练气 五层";
        境界.Value=266;
        境界.HP=466;
        境界.Attack=51;
        境界.Defense=10;
        境界.Critical=8;
        境界.Speed=14;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="练气 六层";
        境界.Value=360;
        境界.HP=568;
        境界.Attack=61;
        境界.Defense=11;
        境界.Critical=8;
        境界.Speed=15;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="练气 七层";
        境界.Value=473;
        境界.HP=669;
        境界.Attack=71;
        境界.Defense=12;
        境界.Critical=9;
        境界.Speed=16;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="练气 八层";
        境界.Value=606;
        境界.HP=770;
        境界.Attack=81;
        境界.Defense=13;
        境界.Critical=9;
        境界.Speed=17;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="练气 九层";
        境界.Value=761;
        境界.HP=872;
        境界.Attack=91;
        境界.Defense=14;
        境界.Critical=10;
        境界.Speed=18;
        Boundary_List.add(境界);

        境界 = new Boundary_Data_Item();
        境界.Name="筑基 初期";
        境界.Value=940;
        境界.HP=973;
        境界.Attack=101;
        境界.Defense=15;
        境界.Critical=11;
        境界.Speed=19;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="筑基 中期";
        境界.Value=1144;
        境界.HP=1075;
        境界.Attack=111;
        境界.Defense=16;
        境界.Critical=11;
        境界.Speed=20;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="筑基 后期";
        境界.Value=1376;
        境界.HP=1176;
        境界.Attack=112;
        境界.Defense=17;
        境界.Critical=12;
        境界.Speed=21;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="筑基 大圆满";
        境界.Value=1635;
        境界.HP=1278;
        境界.Attack=132;
        境界.Defense=18;
        境界.Critical=12;
        境界.Speed=22;
        Boundary_List.add(境界);

        境界 = new Boundary_Data_Item();
        境界.Name="金丹 初期";
        境界.Value=1925;
        境界.HP=1379;
        境界.Attack=142;
        境界.Defense=19;
        境界.Critical=13;
        境界.Speed=22;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="金丹 中期";
        境界.Value=2245;
        境界.HP=1480;
        境界.Attack=152;
        境界.Defense=20;
        境界.Critical=13;
        境界.Speed=23;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="金丹 后期";
        境界.Value=2599;
        境界.HP=1582;
        境界.Attack=162;
        境界.Defense=21;
        境界.Critical=14;
        境界.Speed=24;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="金丹 大圆满";
        境界.Value=2986;
        境界.HP=1683;
        境界.Attack=172;
        境界.Defense=22;
        境界.Critical=14;
        境界.Speed=25;
        Boundary_List.add(境界);

        境界 = new Boundary_Data_Item();
        境界.Name="元婴 初期";
        境界.Value=3410;
        境界.HP=1785;
        境界.Attack=182;
        境界.Defense=23;
        境界.Critical=15;
        境界.Speed=26;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="元婴 中期";
        境界.Value=3871;
        境界.HP=1886;
        境界.Attack=192;
        境界.Defense=24;
        境界.Critical=16;
        境界.Speed=27;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="元婴 后期";
        境界.Value=4370;
        境界.HP=1987;
        境界.Attack=202;
        境界.Defense=25;
        境界.Critical=16;
        境界.Speed=28;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="元婴 大圆满";
        境界.Value=4909;
        境界.HP=2089;
        境界.Attack=212;
        境界.Defense=26;
        境界.Critical=17;
        境界.Speed=29;
        Boundary_List.add(境界);

        境界 = new Boundary_Data_Item();
        境界.Name="分神 初期";
        境界.Value=5490;
        境界.HP=2190;
        境界.Attack=222;
        境界.Defense=27;
        境界.Critical=17;
        境界.Speed=30;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="分神 中期";
        境界.Value=6113;
        境界.HP=2292;
        境界.Attack=233;
        境界.Defense=28;
        境界.Critical=18;
        境界.Speed=31;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="分神 后期";
        境界.Value=6781;
        境界.HP=2393;
        境界.Attack=243;
        境界.Defense=29;
        境界.Critical=18;
        境界.Speed=32;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="分神 大圆满";
        境界.Value=7494;
        境界.HP=2495;
        境界.Attack=253;
        境界.Defense=30;
        境界.Critical=19;
        境界.Speed=33;
        Boundary_List.add(境界);

        境界 = new Boundary_Data_Item();
        境界.Name="化神 初期";
        境界.Value=8254;
        境界.HP=2596;
        境界.Attack=263;
        境界.Defense=30;
        境界.Critical=20;
        境界.Speed=33;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="化神 中期";
        境界.Value=9063;
        境界.HP=2697;
        境界.Attack=273;
        境界.Defense=31;
        境界.Critical=20;
        境界.Speed=34;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="化神 后期";
        境界.Value=9921;
        境界.HP=2799;
        境界.Attack=283;
        境界.Defense=32;
        境界.Critical=21;
        境界.Speed=35;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="化神 大圆满";
        境界.Value=10831;
        境界.HP=2900;
        境界.Attack=293;
        境界.Defense=33;
        境界.Critical=21;
        境界.Speed=36;
        Boundary_List.add(境界);

        境界 = new Boundary_Data_Item();
        境界.Name="合体期";
        境界.Value=11792;
        境界.HP=3002;
        境界.Attack=303;
        境界.Defense=34;
        境界.Critical=22;
        境界.Speed=37;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="渡劫期";
        境界.Value=12808;
        境界.HP=3103;
        境界.Attack=313;
        境界.Defense=35;
        境界.Critical=22;
        境界.Speed=38;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="大乘期";
        境界.Value=13879;
        境界.HP=3204;
        境界.Attack=323;
        境界.Defense=36;
        境界.Critical=23;
        境界.Speed=39;
        Boundary_List.add(境界);

        境界 = new Boundary_Data_Item();
        境界.Name="天仙";
        境界.Value=15006;
        境界.HP=3306;
        境界.Attack=333;
        境界.Defense=37;
        境界.Critical=23;
        境界.Speed=40;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="真仙";
        境界.Value=16191;
        境界.HP=3407;
        境界.Attack=344;
        境界.Defense=38;
        境界.Critical=24;
        境界.Speed=41;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="玄仙";
        境界.Value=17435;
        境界.HP=3509;
        境界.Attack=354;
        境界.Defense=39;
        境界.Critical=24;
        境界.Speed=42;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="大罗金仙";
        境界.Value=18740;
        境界.HP=3610;
        境界.Attack=364;
        境界.Defense=40;
        境界.Critical=25;
        境界.Speed=43;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="混元金仙";
        境界.Value=20106;
        境界.HP=3712;
        境界.Attack=374;
        境界.Defense=41;
        境界.Critical=26;
        境界.Speed=44;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="混元太乙金仙";
        境界.Value=21536;
        境界.HP=3813;
        境界.Attack=384;
        境界.Defense=42;
        境界.Critical=26;
        境界.Speed=44;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="混元大罗金仙";
        境界.Value=23029;
        境界.HP=3914;
        境界.Attack=394;
        境界.Defense=43;
        境界.Critical=27;
        境界.Speed=45;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="混沌仙尊";
        境界.Value=24589;
        境界.HP=4015;
        境界.Attack=404;
        境界.Defense=44;
        境界.Critical=27;
        境界.Speed=46;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="半圣";
        境界.Value=26215;
        境界.HP=4117;
        境界.Attack=414;
        境界.Defense=45;
        境界.Critical=28;
        境界.Speed=47;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="准圣";
        境界.Value=27910;
        境界.HP=4219;
        境界.Attack=424;
        境界.Defense=46;
        境界.Critical=29;
        境界.Speed=48;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="圣人";
        境界.Value=29674;
        境界.HP=4320;
        境界.Attack=434;
        境界.Defense=47;
        境界.Critical=29;
        境界.Speed=49;
        Boundary_List.add(境界);

        境界 = new Boundary_Data_Item();
        境界.Name="半神";
        境界.Value=31509;
        境界.HP=4421;
        境界.Attack=444;
        境界.Defense=48;
        境界.Critical=30;
        境界.Speed=50;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="准神";
        境界.Value=33416;
        境界.HP=4523;
        境界.Attack=455;
        境界.Defense=49;
        境界.Critical=30;
        境界.Speed=51;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="天神";
        境界.Value=35397;
        境界.HP=4624;
        境界.Attack=465;
        境界.Defense=50;
        境界.Critical=31;
        境界.Speed=52;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="真神";
        境界.Value=37452;
        境界.HP=4726;
        境界.Attack=475;
        境界.Defense=51;
        境界.Critical=31;
        境界.Speed=53;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="神君";
        境界.Value=39583;
        境界.HP=4827;
        境界.Attack=485;
        境界.Defense=52;
        境界.Critical=32;
        境界.Speed=54;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="神王";
        境界.Value=41791;
        境界.HP=4929;
        境界.Attack=495;
        境界.Defense=53;
        境界.Critical=32;
        境界.Speed=55;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="神尊";
        境界.Value=44078;
        境界.HP=5030;
        境界.Attack=505;
        境界.Defense=53;
        境界.Critical=33;
        境界.Speed=55;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="主神";
        境界.Value=46445;
        境界.HP=5131;
        境界.Attack=515;
        境界.Defense=54;
        境界.Critical=33;
        境界.Speed=56;
        Boundary_List.add(境界);

        境界 = new Boundary_Data_Item();
        境界.Name="下位神衹";
        境界.Value=48892;
        境界.HP=5233;
        境界.Attack=525;
        境界.Defense=55;
        境界.Critical=34;
        境界.Speed=57;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="中位神衹";
        境界.Value=51421;
        境界.HP=5334;
        境界.Attack=535;
        境界.Defense=56;
        境界.Critical=35;
        境界.Speed=58;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="上位神衹";
        境界.Value=54035;
        境界.HP=5436;
        境界.Attack=545;
        境界.Defense=57;
        境界.Critical=35;
        境界.Speed=59;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="创世神衹";
        境界.Value=56732;
        境界.HP=5537;
        境界.Attack=555;
        境界.Defense=58;
        境界.Critical=36;
        境界.Speed=60;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="主宰神衹";
        境界.Value=59516;
        境界.HP=5639;
        境界.Attack=566;
        境界.Defense=59;
        境界.Critical=36;
        境界.Speed=61;
        Boundary_List.add(境界);
        境界 = new Boundary_Data_Item();
        境界.Name="永恒神衹";
        境界.Value=62387;
        境界.HP=5740;
        境界.Attack=576;
        境界.Defense=60;
        境界.Critical=37;
        境界.Speed=62;
        Boundary_List.add(境界);
    }

    public static String getBoundary() {
        return Boundary_List.get(Boundary).Name;
    }

    public static String getUPBoundary(){
        if(Boundary+1 < Boundary_List.size()){
            return Boundary_List.get(Boundary+1).Name;
        }else{
            return "";
        }

    }

    public static int getValue() {
        return Boundary_List.get(Boundary).Value;
    }

    public static int getUPValue(){
        if(Boundary+1 < Boundary_List.size()){
            return Boundary_List.get(Boundary+1).Value;
        }else{
            return 0;
        }
    }

    public static int getHP(){
        return Boundary_List.get(Boundary).HP;
    }

    public static int getAttack() {
        return Boundary_List.get(Boundary).Attack;
    }

    public static int getDefense() {
        return Boundary_List.get(Boundary).Defense;
    }

    public static int getCritical() {
        return Boundary_List.get(Boundary).Critical;
    }

    public static int getSpeed() {
        return Boundary_List.get(Boundary).Speed;
    }

    public static String getArms() {
        if(Arms == 1){
            return"玄铁重剑";
        }else if(Arms == 2){
            return"倚天剑";
        } else if(Arms==7){
            return"荧光剑";
        }else if(Arms==8){
            return"战魂刀";
        }else if(Arms==9){
            return"星爆剑";
        }else if(Arms==10){
            return"破坏魔剑";
        } else{
            return"";
        }
    }

    public static String getDress(){
        if(Dress == 1){
            return "幻影长袍";
        } else if(Dress == 2){
            return "玄鳞天衣";
        }else if(Dress == 7){
            return "恶魔长袍";
        } else{
            return "";
        }
    }
}