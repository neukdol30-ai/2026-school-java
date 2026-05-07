package Sub13.thread.start;

public class BadThreadMain {
    static void main() {
        System.out.println(Thread.currentThread().getName()+ " : main() start");
        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName()+" :  start() 호출 전");
        helloThread.run();
        System.out.println(Thread.currentThread().getName()+" :  start() 호출 후");
        System.out.println(Thread.currentThread().getName()+ " : main() end");
    }
}

