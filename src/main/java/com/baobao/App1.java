package com.baobao;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
public class App1
{
    private static Logger logger  = LogManager.getLogger(App1.class);
    public static void main(String[] args) {
        new App1().print();
    }
    public void print() {
        logger.info(getClass() + "： " + logger.getClass());
    }
}
