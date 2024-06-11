// Design a Stop Watch using event handling and multi-threading in Java
// Input: Click on Start Button -> Output: Time elapsed since the last click of start button.
//        Click on Reset Button -> Output: Time elapsed since the last click of start button.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Lab11_3 extends Frame implements ActionListener {
    Button start, stop, reset;
    Label time;
    long startTime, stopTime;
    boolean running = false;

    public Lab11_3() {
        start = new Button("Start");
        stop = new Button("Stop");
        reset = new Button("Reset");
        time = new Label("Time: 0");

        start.setBounds(100, 100, 50, 20);
        stop.setBounds(100, 150, 50, 20);
        reset.setBounds(100, 200, 50, 20);
        time.setBounds(100, 250, 50, 20);

        start.addActionListener(this);
        stop.addActionListener(this);
        reset.addActionListener(this);

        add(start);
        add(stop);
        add(reset);
        add(time);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            if (!running) {
                startTime = System.currentTimeMillis();
                running = true;
            }
        } else if (e.getSource() == stop) {
            if (running) {
                stopTime = System.currentTimeMillis();
                running = false;
                time.setText("Time: " + (stopTime - startTime));
            }
        } else if (e.getSource() == reset) {
            startTime = 0;
            stopTime = 0;
            time.setText("Time: 0");
        }
    }

    public static void main(String[] args) {
        new Lab11_3();
    }
}