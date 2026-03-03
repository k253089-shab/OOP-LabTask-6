class DuplicateRemover{

    public static int[] removeDuplicates(int[] integers){
        int[] distinctArray = new int[integers.length];

        distinctArray[0] = integers[0];
        int count=1;
        for(int i=1; i<integers.length; i++){

            boolean found = false;

            for(int j=0; j<count; j++){
                
                if(integers[i] == distinctArray[j]){
                    found=true;
                    break;
                }
            }

            if(!found){
                distinctArray[count] = integers[i];
                count++;
            }
        }
        
        int[] result = new int[count];
        for (int i=0; i<count; i++) {
            result[i] = distinctArray[i];
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {

        int[] integers = {1,2,3,1,4,2,5};

        int[] result = DuplicateRemover.removeDuplicates(integers);

        System.out.println("Distinct Array:");

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
