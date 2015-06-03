/**
 * Created by 88888888 on 2015/6/3.
 */
public class FizzBuzz {
    private String[] str;
    int row;

    public FizzBuzz(){
        row = 100;
        str = new String[row];
        str[0] = "";
    }
    public FizzBuzz(int num) {
        str = new String[num];
        str[0] = "";
        row = num;
    }
    public void printFizzBuzz(){
        int i;
        for (i=0;i<row;++i){
            if (i!=(row-1)){
                System.out.println(str[i]);
            }
            else {
                System.out.print(str[i]);
            }
        }
    }
    public void setFizzBuzz(){
        int i = 0;
        int j = 0;
        for (i=1;i<=row;i++){
            j = i-1;
            if (i%3 == 0 && i%5 == 0){
                str[j] = "FizzBuzz";
                continue;
            }
            if (i%3 == 0){
                str[j] = "Fizz";
                continue;
            }
            if (i%5 == 0){
                str[j] = "Buzz";
                continue;
            }
            str[j] = String.valueOf(i);
        }
    }
}
