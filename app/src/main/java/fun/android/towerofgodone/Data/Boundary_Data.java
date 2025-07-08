package fun.android.towerofgodone.Data;

import java.util.LinkedHashMap;
import java.util.Map;

public class Boundary_Data {
    public Map<String, Integer> data = new LinkedHashMap<>();
    public Map<String, Integer[]> attributes = new LinkedHashMap<>();
    public Boundary_Data() {
        data.put("练气 一层", 100);
        data.put("练气 二层", 500);
        data.put("练气 三层", 1000);
        data.put("练气 四层", 2000);
        data.put("练气 五层", 3500);
        data.put("练气 六层", 5500);
        data.put("练气 七层", 8000);
        data.put("练气 八层", 12000);
        data.put("练气 九层", 17000);

        data.put("筑基 初期", 25000);
        data.put("筑基 中期", 35000);
        data.put("筑基 后期", 50000);
        data.put("筑基 大圆满", 70000);

        data.put("金丹 初期", 100000);
        data.put("金丹 中期", 150000);
        data.put("金丹 后期", 220000);
        data.put("金丹 大圆满", 300000);

        data.put("元婴 初期", 400000);
        data.put("元婴 中期", 550000);
        data.put("元婴 后期", 750000);
        data.put("元婴 大圆满", 900000);

        data.put("分神 初期", 1000000);
        data.put("分神 中期", 1300000);
        data.put("分神 后期", 1600000);
        data.put("分神 大圆满", 1900000);

        data.put("化神 初期", 2200000);
        data.put("化神 中期", 2500000);
        data.put("化神 后期", 2800000);
        data.put("化神 大圆满", 3100000);

        data.put("合体期", 3500000);
        data.put("渡劫期", 4200000);
        data.put("大乘期", 5000000);

        data.put("天仙", 6000000);
        data.put("真仙", 7000000);
        data.put("玄仙", 8000000);
        data.put("大罗金仙", 9000000);
        data.put("混元金仙", 10000000);
        data.put("混元太乙金仙", 11000000);
        data.put("混元大罗金仙", 12000000);
        data.put("混沌仙尊", 13000000);
        data.put("半圣", 14000000);
        data.put("准圣", 15000000);
        data.put("圣人", 9999999);

        data.put("半神", 10000000);
        data.put("准神", 12000000);
        data.put("天神", 14000000);
        data.put("真神", 16000000);
        data.put("神君", 18000000);
        data.put("神王", 20000000);
        data.put("神尊", 22000000);
        data.put("主神", 24000000);

        data.put("下位神衹", 26000000);
        data.put("中位神衹", 28000000);
        data.put("上位神衹", 30000000);
        data.put("创世神衹", 32000000);
        data.put("主宰神衹", 34000000);
        data.put("永恒神衹", 99999999);


        attributes.put("练气 一层", new Integer[]{800, 150, 100, 6, 90});
        attributes.put("练气 二层", new Integer[]{960, 180, 120, 6, 97});
        attributes.put("练气 三层", new Integer[]{1120, 210, 140, 7, 104});
        attributes.put("练气 四层", new Integer[]{1280, 240, 160, 7, 110});
        attributes.put("练气 五层", new Integer[]{1440, 270, 180, 8, 116});
        attributes.put("练气 六层", new Integer[]{1600, 300, 200, 8, 122});
        attributes.put("练气 七层", new Integer[]{1760, 330, 220, 9, 127});
        attributes.put("练气 八层", new Integer[]{1920, 360, 240, 9, 132});
        attributes.put("练气 九层", new Integer[]{2080, 390, 260, 10, 137});
        attributes.put("筑基 初期", new Integer[]{2400, 450, 300, 11, 146});
        attributes.put("筑基 中期", new Integer[]{2800, 525, 350, 12, 155});
        attributes.put("筑基 后期", new Integer[]{3200, 600, 400, 13, 163});
        attributes.put("筑基 大圆满", new Integer[]{3600, 675, 450, 14, 171});
        attributes.put("金丹 初期", new Integer[]{4400, 825, 550, 15, 183});
        attributes.put("金丹 中期", new Integer[]{5200, 975, 650, 17, 194});
        attributes.put("金丹 后期", new Integer[]{6000, 1125, 750, 18, 204});
        attributes.put("金丹 大圆满", new Integer[]{6800, 1275, 850, 19, 214});
        attributes.put("元婴 初期", new Integer[]{8000, 1500, 1000, 20, 229});
        attributes.put("元婴 中期", new Integer[]{9600, 1800, 1200, 22, 243});
        attributes.put("元婴 后期", new Integer[]{11200, 2100, 1400, 24, 256});
        attributes.put("元婴 大圆满", new Integer[]{12800, 2400, 1600, 25, 269});
        attributes.put("分神 初期", new Integer[]{14400, 2700, 1800, 26, 280});
        attributes.put("分神 中期", new Integer[]{17600, 3300, 2200, 28, 299});
        attributes.put("分神 后期", new Integer[]{20800, 3900, 2600, 30, 316});
        attributes.put("分神 大圆满", new Integer[]{24000, 4500, 3000, 31, 332});
        attributes.put("化神 初期", new Integer[]{27200, 5100, 3400, 32, 347});
        attributes.put("化神 中期", new Integer[]{30400, 5700, 3800, 33, 361});
        attributes.put("化神 后期", new Integer[]{33600, 6300, 4200, 34, 374});
        attributes.put("化神 大圆满", new Integer[]{36800, 6900, 4600, 35, 386});
        attributes.put("合体期", new Integer[]{42000, 7875, 5250, 36, 404});
        attributes.put("渡劫期", new Integer[]{50400, 9450, 6300, 38, 427});
        attributes.put("大乘期", new Integer[]{58800, 11025, 7350, 39, 447});
        attributes.put("天仙", new Integer[]{70000, 13125, 8750, 41, 472});
        attributes.put("真仙", new Integer[]{84000, 15750, 10500, 42, 496});
        attributes.put("玄仙", new Integer[]{98000, 18375, 12250, 43, 517});
        attributes.put("大罗金仙", new Integer[]{112000, 21000, 14000, 44, 537});
        attributes.put("混元金仙", new Integer[]{126000, 23625, 15750, 45, 555});
        attributes.put("混元太乙金仙", new Integer[]{140000, 26250, 17500, 46, 571});
        attributes.put("混元大罗金仙", new Integer[]{154000, 28875, 19250, 47, 586});
        attributes.put("混沌仙尊", new Integer[]{168000, 31500, 21000, 47, 600});
        attributes.put("半圣", new Integer[]{182000, 34125, 22750, 48, 613});
        attributes.put("准圣", new Integer[]{196000, 36750, 24500, 48, 625});
        attributes.put("圣人", new Integer[]{199999, 37499, 24999, 49, 629});
        attributes.put("半神", new Integer[]{200000, 37500, 25000, 49, 630});
        attributes.put("准神", new Integer[]{240000, 45000, 30000, 49, 687});
        attributes.put("天神", new Integer[]{280000, 52500, 35000, 50, 740});
        attributes.put("真神", new Integer[]{320000, 60000, 40000, 50, 789});
        attributes.put("神君", new Integer[]{360000, 67500, 45000, 50, 835});
        attributes.put("神王", new Integer[]{400000, 75000, 50000, 50, 878});
        attributes.put("神尊", new Integer[]{440000, 82500, 55000, 50, 918});
        attributes.put("主神", new Integer[]{480000, 90000, 60000, 50, 955});
        attributes.put("下位神衹", new Integer[]{520000, 97500, 65000, 50, 990});
        attributes.put("中位神衹", new Integer[]{560000, 105000, 70000, 50, 1022});
        attributes.put("上位神衹", new Integer[]{600000, 112500, 75000, 50, 1052});
        attributes.put("创世神衹", new Integer[]{640000, 120000, 80000, 50, 1080});
        attributes.put("主宰神衹", new Integer[]{680000, 127500, 85000, 50, 1106});
        attributes.put("永恒神衹", new Integer[]{999999, 187499, 124999, 50, 1341});
    }
}
