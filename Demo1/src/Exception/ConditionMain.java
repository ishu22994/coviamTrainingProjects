package Exception;

public class ConditionMain {

    public static void main(String[] args)  {

        ConditionChk cc = new ConditionChk();

       try{
           cc.addValue(2);
           cc.addValue(3);
           cc.addValue(3);
           cc.addValue(5);
           cc.addValue(3);
       }catch (CustomException exp){
           System.out.println(exp.getMessage());
       }catch(Exception e){

       }


        //cc.addValue(6);
        cc.printArray();
       // cc.deleteByIndex(2);
        cc.printArray();
        cc.deleteByValue(3);
        cc.printArray();
        try{
            cc.getFromIndex(2);
        }catch(IndexException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ee){

        }


    }
}
