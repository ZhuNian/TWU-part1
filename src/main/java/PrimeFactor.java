import java.util.ArrayList;

/**
 * Created by 88888888 on 2015/6/3.
 */
public class PrimeFactor {
    private ArrayList<Integer> primeFactor;
    public PrimeFactor() {
        primeFactor = new ArrayList<Integer>();
    }

    public void printPrimeFactors() {
        int i = 0;
        int nSize = primeFactor.size();
        for (i=0;i< nSize ;++i){
            System.out.print(primeFactor.get(i));
            if (i != nSize-1){
                System.out.print(",");
            }
            else {
                System.out.print(".");
            }
        }
    }

    public void generate(int num) {
        if (num <= 1){
            return;
        }
        if (num == 2){
            primeFactor.add(2);
            return;
        }
        int i =0;
        int j = 0;
        int nMaxOfPrimeFactor = (int) Math.sqrt(num);

        primeFactor.add(2);
        Boolean isPrime = true;
        for (j=3;j<=num;j++){
            isPrime = true;
            for (i=2;i<=nMaxOfPrimeFactor;++i){
                if (j % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                primeFactor.add(j);
            }
        }

    }
}
