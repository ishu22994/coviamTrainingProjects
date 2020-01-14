package MultiThread;

public class Singleton {

    private Singleton(){
        for(int i=0;i<1000;i++){
            System.out.println(i+" ");
        }
    }

    private static Singleton instance = null;
    private static Object lockobject = new Object();
    public static Singleton getInstance(){
    synchronized (lockobject) {
        if (instance == null) {
            instance = new Singleton();
        }
    }
        return instance;
    }

}
