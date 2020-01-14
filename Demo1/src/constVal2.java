public class constVal2 {
//Java memory
    int intVal;
    String stringVal;

    public int getIntVal() {
        return intVal;
    }

    public String getStringVal() {
        return stringVal;
    }

    public constVal2(int intVal, String stringVal) {
        this.intVal = intVal;
        this.stringVal = stringVal;
    }

    public constVal2(){

    }
    @Override
    public String toString() {
        return "constVal2{" +
                "intVal=" + intVal +
                ", stringVal='" + stringVal + '\'' +
                '}';
    }

    public void swap(constVal2 obj){

        constVal2 temp = new constVal2();
        temp.intVal = obj.intVal;
        temp.stringVal=obj.stringVal;
        obj.intVal=this.intVal;
        obj.stringVal=this.stringVal;
        this.stringVal=temp.stringVal;
        this.intVal=temp.intVal;


    }

    public static void main(String[] args) {
        constVal2 c1 = new constVal2(10,"Ishit");
        constVal2 c2 = new constVal2(20,"Ekta");
        c1.swap(c2);
        System.out.println(c1);
        System.out.println(c2);

    }
}
