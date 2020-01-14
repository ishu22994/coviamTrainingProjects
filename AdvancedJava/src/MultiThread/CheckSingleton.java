package MultiThread;

public class CheckSingleton {

    public static void main(String[] args) throws InterruptedException{
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//
//        System.out.println(s1 +" \n "+s2);

        MyThread[] myThread = new MyThread[10];

        try{
            for(int i=0;i<10;i++){
                myThread[i] = new MyThread("Testing-Thread" + i);
                myThread[i].start();
            }
           for(int i=0;i<10;i++){
                myThread[i].join();
           }

        }catch(Exception ex){


        }




    }

}
