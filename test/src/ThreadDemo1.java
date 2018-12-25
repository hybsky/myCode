/*
* 在Java中如果要想实现多线程的操作，有两种实现方法：
* （1）一种是继承Thread类
* （2）另外一种是实现Runnable接口
 **/
public class ThreadDemo1 {
    public static void main(String[] args) {
//        （1）一种是继承Thread类
        MyThread me = new MyThread();
        me.start();
//        （2）另外一种是实现Runnable接口
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
    }
}
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
