public class HelloWorld {

    private String temp;

    public HelloWorld(){

        temp = "Hello Ishit!!";

    }

    public String getDisplay(){

        return temp;

    }

    public String getTemp() {
        return temp;
    }



    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        h.getTemp();
    }

}
