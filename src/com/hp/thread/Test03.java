package com.hp.thread;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/*
* 使用线程的sleep方法 做一个控制台显示时间 ,  格式是:  2021-07-17 23:45:动态的秒
* 时间是动态的...
*
* */
public class Test03 extends JFrame implements Runnable {
    private JFrame frame;
    private JPanel timePanel;
    private JLabel timeLabel;
    private JLabel displayArea;
    private String DEFAULT_TIME_FORMAT = "HH:mm:ss";
    private int ONE_SECOND = 1000;

    public static void main(String arg[]) {
        Test03 df2 = new Test03();
        df2.setVisible(true);

        Thread thread1 = new Thread(df2);
        thread1.start();
    }
    public Test03() {
        timePanel = new JPanel();
        timeLabel = new JLabel("CurrentTime: ");
        displayArea = new JLabel();

        timePanel.add(timeLabel);
        timePanel.add(displayArea);
        this.add(timePanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(500, 200));
        this.setLocationRelativeTo(null);
    }

    public void run() {
        while (true) {
            SimpleDateFormat dateFormatter = new SimpleDateFormat(DEFAULT_TIME_FORMAT);
            Calendar calendar =Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);//年
            int month = calendar.get(Calendar.DAY_OF_WEEK);//月
            int day = calendar.get(Calendar.DATE);//日
            String s = year+"-"+month+"-"+day;
            System.out.println(s);
            displayArea.setText(dateFormatter.format(Calendar.getInstance().getTime()));
            try {
                Thread.sleep(ONE_SECOND);
            } catch (Exception e) {
                displayArea.setText("Error!!!");
            }
        }
    }

}