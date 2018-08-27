import java.util.*;
public class MatrixProduct {
    public static void main(String[] args) {
        Scanner rd= new Scanner(System.in);
        System.out.println("Please input a positive integer:");
        int n=rd.nextInt();
        int [][] array=new int[n][n];
        for(int i=0,ii=1;i<n;i++,ii++){
            for(int j=0, jj=1; j<n; j++, jj++){
                array[i][j]=ii*jj;
            }
    }
        
        System.out.println("Please input the number of rows in the first matrix: ");
        int frow=rd.nextInt();
        System.out.println("Please input the number of columns in the first matrix:");
        int fcol=rd.nextInt();
        System.out.println("Please input the start row for the first matrix: ");
        int startrow1=rd.nextInt();
        System.out.println("Please input the start column for the first matrix: ");
        int startcol1=rd.nextInt();
        System.out.println("Please input the number of rows in the second matrix: ");
        int srow=rd.nextInt();
        System.out.println("PLease input the number of columns in the second matrix:");
        int scol=rd.nextInt();
        System.out.println("Please input the start row for the second matrix:");
        int startrow2=rd.nextInt();
        System.out.println("Please input the start column for the second matrix: ");
        int startcol2=rd.nextInt();
        System.out.println("Your first matrix is:");
        int[][] matrix1=new int [frow][fcol];
        for(int i=0, ii=startrow1;i<frow;i++,ii++){
            for(int j=0,jj=startcol1;j<fcol;j++,jj++){
                matrix1[i][j]=array[ii][jj];
                System.out.printf("%5d",matrix1[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Your second matrix is: ");
        int[][] matrix2=new int [srow][scol];
        for(int i=0, ii=startrow2;i<srow;i++,ii++){
            for(int j=0,jj=startcol2;j<scol;j++,jj++){
                matrix2[i][j]=array[ii][jj];
                System.out.printf("%5d",matrix2[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("The product of your matrices is: ");
        int sum=0;
        int[][] product=new int[frow][scol];
        for(int i=0; i<frow;i++){
            for(int j=0; j<scol;j++){
                for(int k=0; k<fcol;k++){
                    sum=sum+matrix1[i][k]*matrix2[k][j];
                }
                product[i][j]=sum;
                sum=0;
            }
        }
    }
}