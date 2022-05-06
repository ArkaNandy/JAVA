import java.util.Arrays;
import java.util.Scanner;

public class subnetmask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine();
	        String st=s.substring(0,s.indexOf("/"));
	        String no=s.substring(s.indexOf("/")+1);
	        int n=Integer.parseInt(no);
	        String arr[]=st.split("\\.");
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
	        String b="";
	        for(i=0;i<n;i++)
	        	b+="1";
	        int sub[]=new int[4];
	        int k=0;
	        String t="";
	        for(i=0;i<n-8;i+=8) {
	         t=b.substring(i,i+8);
	        	sub[k]=Integer.parseInt(t,2);
	        	k++;
	        }
	        t=b.substring(i);
	        i=0;
	        while(i++<8-(n%8))
	        	t+="0";
	        sub[k]=Integer.parseInt(t,2);
	        String ans="";
	        for(int x:sub)
	        	ans+=x+".";
	        ans=ans.substring(0,ans.length()-1);
	        System.out.println("SUBNET MASK "+ans);
	        ans="";
	        int net[]=new int[4];
	       
	        for(i=0;i<4;i++) {
	        	net[i]=num[i]&sub[i];
	        }
	        for(int x:net)
	        	ans+=x+".";
	        ans=ans.substring(0,ans.length()-1);
	        System.out.println("NET ID "+ans);
	        
		
		

	}

}