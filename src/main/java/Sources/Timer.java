/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sources;

import java.util.TimerTask;

/**
 *
 * @author Alexander
 */
public class Timer {
    private int timeInSeconds;
    private java.util.Timer timer;

    public Timer() {
        timeInSeconds = 0;
    }

    public void start() {
        timeInSeconds = 0;
        timer = new java.util.Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timeInSeconds++;
            }
        }, 1000, 1000);
    }

    public void reset() {
        timer.cancel();
    }

    public String getTime() {
        int minutes = timeInSeconds / 60;
        int seconds = timeInSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}
