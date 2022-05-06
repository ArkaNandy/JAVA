import java.util.*;

public class ipaddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split("\\.");
        int num[]=new int[arr.length];
       
        int i=0;
        for(String str:arr){
            num[i]=Integer.parseInt(str);
          if(num[i]>255)
          {
              System.out.println("Invalidate Ip");
              return;
          }
          i++;
            
            
        }
        if(num[0]<=127)
        System.out.println("CLASS A");
        else if(num[0]<=192)
          System.out.println("CLASS B");
           else if(num[0]<=223)
          System.out.println("CLASS C");
           else if(num[0]<=239)
          System.out.println("CLASS D");
           else if(num[0]<=255)
          System.out.println("CLASS E");
    }

	}