public class TestConstructor {

    private int intVal = 10;
    private String anotherVal;
    private String textToDisplay;
    private static int loadVal;


    {
        //init ...for common var not to change at every time...
        anotherVal = "Ishit";

    }

    static{
        loadVal = 20;
    }

    public TestConstructor(){

        textToDisplay = "Str";

    }

    public TestConstructor(String st){

        textToDisplay = st;

    }

    public static void main(String[] args) {

        TestConstructor t = new TestConstructor();
        System.out.println("intVal= "+ t.intVal + "anotherVal= "+ t.anotherVal +"textToDisplay= "+ t.textToDisplay  );
        System.out.println(TestConstructor.loadVal);
    }

}
