
package javabasic.concurrency.basic;

public class InterruptThreadDemo {
    public static int i=0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            //int i=0; //此处设置，没有结果输出？？？？？
            while(!Thread.currentThread().isInterrupted()){
                i++;
            }
            System.out.println(i);
        },"interrupt");
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
