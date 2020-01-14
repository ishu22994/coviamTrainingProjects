package MultiThread;

class MyThread extends Thread{
    MyThread (String name){
        super(name);
    }
    public void run(){
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1+" ");
    }

}