public class Demo3 {

    private int intVal;
    private String stringVal;

    public Demo3(){

        intVal = 3;
        stringVal = "Ishit";

    }

    public Demo3(int ival,String sval){

        this.intVal = ival;
        this.stringVal = sval;

    }

    public void getDisplay(){

        System.out.println("ival= " + intVal + " "+"sval= " +stringVal);

    }

//    @Override
//    public String toString() {
//        return "Demo3{" +
//                "intVal=" + intVal +
//                ", stringVal='" + stringVal + '\'' +
//                '}';
//    }

    public static void main(String[] args) {
        Demo3 d1 = new Demo3();

        Demo3 d2 = new Demo3(4,"ekta");
        d1.getDisplay();
       d2.getDisplay();

//        System.out.println(d1);
//        System.out.println(d2);

    }

}
