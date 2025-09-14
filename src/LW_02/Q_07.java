package LW_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_07 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        System.out.println(dateFormatter.format(today));
    }
}
