import java.util.*;
public class findingelementinmatrix {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt(); /// inputfor rows 
        int columns=sc.nextInt();/// input for  columns

        int[][] numbers = new int[rows][columns]; // defining the 2-D array

        for(int i=0; i<rows;i++){ //input  loops for rows

            for(int j=0;j<columns;j++){ //// input for columns
                numbers[i][j]=sc.nextInt();
            }

        }

        int x= sc.nextInt(); //// the element we need to find
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(numbers[i][j]==x){
                     System.out.println("x found at location(" + i + ","+ j + ") ");

                }
            
            
            }
        }
          


        

    }
     
}
