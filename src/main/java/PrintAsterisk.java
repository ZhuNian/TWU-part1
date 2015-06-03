/**
 * Created by 88888888 on 2015/6/2.
 */
public class PrintAsterisk{
    private int col;
    private int row;
    private String[][] str;

    public PrintAsterisk() {
    }
    public PrintAsterisk(int row,int col) {
        this.row = 2*row-1;//blank line should be counted
        this.col = col;
        str = new String[this.row][this.col];
     }
    public void setStr() {
        int i = 0;
        int j = 0;
        for (i=0;i<row;i++){
            for (j=0;j<col;++j){
                str[i][j] = "*";
            }
            ++i;
            if(i<row && i % 2 != 0){
                str[i][0] = "\n";
                for (j=1;j<col;++j){
                    str[i][j]="";
                }
            }
        }
    }
    public void PrintStr(){
        int i = 0;
        int j = 0;
        for (i=0;i<row;i++){
            for (j=0;j<col;++j){
                System.out.print(str[i][j]);
            }
        }
    }

    public void PrintOneAsterisk(){
                setStr();
    }
    public void PrintHorizontalLine(){
        setStr();
    }

    public void PrinVerticalLine() {
        setStr();
    }

    public void PrinRightTriangle() {
        setStr();
        int i = 0;
        int j = 0;
        int nStarNum = 1;
        for (i=0;i<row;++i){
            for (j=nStarNum;j<col;++j){
                if (i % 2 != 0){
                    nStarNum++;
                    j = col;
                    continue;
                }
                else {
                    str[i][j] = "";
                }
            }
        }
    }

    public void PrinIsoscelesTriangle() {
        setStr();
        int i = 0;
        int j = 0;
        int nStarNum = 1;

        for (i = 0; i < row; ++i) {
            if (i % 2 == 0) {
                for (j = 0; j < col - nStarNum; ++j) {
                    str[i][j] = " ";
                }
            }
            else {
                nStarNum = nStarNum+2;
            }
        }
    }

    public void PrintDiamond() {
        setStr();
        int i = 0;
        int j = 0;
        int nStarNum = 1;
        for (i=0;i<row;i++){
            if (i<=row/2){
                if (i%2 == 0){
                    for (j=0;j<col-nStarNum;++j){
                        str[i][j] = " ";
                    }
                }
                else {nStarNum = nStarNum+2;}
            }
            else {
                if (i%2 == 0){
                    for (j=0;j<col-nStarNum;++j){
                        str[i][j] = " ";
                    }
                }
                else {
                    nStarNum = nStarNum-2;
                }
            }
        }
    }

    public void PrintDiamondWithName() {
        PrintDiamond();
        int nMidRowIndex = row/2;
        String[] bill = new String[col];
        bill[0] = "B";
        bill[1] = "i";
        bill[2] = "l";
        bill[3] = "l";
        int i = 0;
        for (i=4;i<col;++i){
            bill[i] = "";
        }


        str[nMidRowIndex] = bill;
    }
}
