//You are given any array of length n.
//You have to sort the array elements in descending order of their frequency.
//Use of Collections is not allowed

//E.g : 
//Input  :   [4,3,1,6,4,3,6,4]
//Output : [4,4,4,3,3,6,6,1]

package Interviewquestionsjava;

public class arrayindescendingorderfrequency {
    static int x=0; // denotes the row in the 2-d array

    public static void main(String[] args) {
        int a[]={4,3,1,6,4,3,6,4};
        int b[][]= new int[a.length][2]; // the array in which the sorted version of the above array will get stored
        a=sort(a);
        b[x][0]=a[0];// simply specifies the fi
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]){ // if the next value matches the present 
                b[x][1]=b[x][1]+1; // we also increment the ocurrence
            }
            else{ //if the last value does't go with the previous value it will go for the next row
                x++;
                b[x][0]=a[i];
            }

        }
        x++;
        b= sort(b);
        for(int i=0;i<x;i++){
        for(int j=0;j<=b[i][1];j++){
            System.out.print(" "+b[i][0]);
        }
        }
        System.out.println(" ");

    }
    public static int[][]sort(int b[][]){
        int c[]= new int[2];
        for(int i=0;i<x;i++){
            for(int j=1;j<x;j++){
                if(b[i][1]<b[j][1]){
                   c=b[i];
                   b[i]=b[j];
                   b[j]=c;


                }
            }
        }


        return b;

    }

    public static  int[] sort(int a[]){
        for(int i=0; i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]= temp;
                }
            }
        }
        return a;
    }
    
}
