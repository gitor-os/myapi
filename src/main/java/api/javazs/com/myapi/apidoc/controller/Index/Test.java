package api.javazs.com.myapi.apidoc.controller.Index;/** * @author : liuwenlong * @date : 2018/3/8 17:29 */public class Test extends Thread implements Runnable{    public void run() {        System.out.println("....");    }    public static void main(String[] args) {        Thread thread = new Thread(new Test());        thread.start();    }}