public class ConstVal {


    public void swap(int a , int b){

        int temp = a;
        a=b;
        b=temp;

    }

    public void swap1(String a , String b){

        String temp = a;
        a=b;
        b=temp;
       // System.out.println("a: "+a+" b: "+b);
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        String aa = "Ishit";
        String bb="Ekta";
        ConstVal c = new ConstVal();
        c.swap(a,b);
        c.swap1(aa,bb);

        System.out.println("a: "+a+" b: "+b);
        System.out.println("a: "+aa+" b: "+bb);
    }

}
