public class ConditionChk {
public static int size = 0;
    int[] arr = new int[100];

    public void addValue(int val){


        if(size<100){
            arr[size]=val;
            size++;
        }else {
            System.out.println("Array is full!!");
        }
    }

    public void deleteByIndex(int val1){

        int deletedVal = arr[val1];
        for(int i=val1;i<size;i++){
            arr[i]=arr[i+1];
        }
        size--;
        System.out.println(deletedVal+ " is deleted!!");
    }

    public void deleteByValue(int val2){

        for(int i=0;i<size;i++){
            if(arr[i]==val2){
                for(int j=i;j<size;j++){
                    arr[j]=arr[j+1];
                }
                size--;
            }
        }
        System.out.println(val2 + " is deleted!!");
    }

    public int getFromIndex(int val3){

        if(val3 < size){
            int data = arr[val3];
            return data;
        }else{
            //System.out.println("Index is not found!!");
            return 100;
        }

    }

    public void printArray(){

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}
