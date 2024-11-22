import java.util.*;
public class Main {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6};
        int item=5;
        Arrays.stream(arr).filter(x->x==item).findFirst().ifPresent(System.out::println);
    }
}
