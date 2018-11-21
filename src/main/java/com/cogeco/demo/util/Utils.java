package com.cogeco.demo.util;

public class Utils 
{
    public static void stopAppMethod(int systemExitCode, int timeOut) {
        Thread backgroundThread = new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    sleep(timeOut);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.exit(systemExitCode);
            }
        };
        backgroundThread.start();
    }
}