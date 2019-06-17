package Lab_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class CheckedExceprion_main {

    public static void main(String[] args) {
        //  日期格式化
        //  yyyy 四位數的年份
        //  MM   兩位數的月份(位數不足補0)
        //  dd   兩位數的月份(位數不足補0)
        String fmt = "yyyy/MM/dd";
        
        //日期格式化物件
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        
        //輸入日期(字串)
        String str = JOptionPane.showInputDialog("Enter date, the form must be " + fmt);
        
//        //String 轉 Date (未受檢保護)
//        Date d = sdf.parse(str);    //受檢例外 (編譯器會檢查是否有做例外處理)
//        JOptionPane.showMessageDialog(null, "Date object = " + d.toString());
        
        //String 轉 Date (受檢保護)
        try{
            Date d = sdf.parse(str);    //受檢例外 (編譯器會檢查是否有做例外處理)
            JOptionPane.showMessageDialog(null, "Date object = " + d.toString());
        } catch(ParseException e){
            JOptionPane.showMessageDialog(null, "Trans failed, date form issues: " + str);
        }
    }   
}
