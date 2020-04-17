import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int [] num ={ 3,4,5,6,7,5,4,2,3 };
        Set<Integer> numberSet= new HashSet<>();
        for (Integer number: num){
            if(!numberSet.add(number)){
                System.out.println(number);
            }
        }

    }
}
