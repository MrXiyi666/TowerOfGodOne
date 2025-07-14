package fun.android.towerofgodone.Fun;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Fun_Time {
    public static int 经过多少秒(String timeStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:M:d:H:m:s");
        LocalDateTime parsedTime = LocalDateTime.parse(timeStr.trim(), formatter);
        LocalDateTime now = LocalDateTime.now();
        return Math.toIntExact(Duration.between(parsedTime, now).getSeconds());
    }

    public static String getTime(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // 注意：月份从 0 开始，所以要加 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24 小时制
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        return year + ":" + month + ":" + day + ":" + hour + ":" + minute + ":" + second;
    }
}
