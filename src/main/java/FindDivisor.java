import java.util.ArrayList;
import java.util.List;

public class FindDivisor {

    public static long numberOfDivisors(int n) {
        List<Integer> divisorList = new ArrayList<Integer>();
        if (n == 0) return 0;
        for (int i = 2; i < (n/2); i++) {
            if (n % i == 0) {
                if (divisorList.contains(i) || divisorList.contains(n / i)) {
                    return divisorList.size() + 3;
                } else {
                    divisorList.add(i);
                    divisorList.add(n / i);
                }
            }
        }
        return divisorList.size() + 2;
    }


    public long numberOfDivisors2(int n) {
        int counter = 0;
        for( int i =1; i<=n; i++){
            if( n%i == 0 )
                counter++;
        }
        return counter;
    }



    public static void main(String[] args){
        System.out.println( numberOfDivisors(8)  );
    }

}
