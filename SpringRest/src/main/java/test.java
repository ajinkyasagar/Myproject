public class test{

     public static void main(String []args){
        String s= "I am a superman";
        String[] a=s.split(" ");
        
        for(int i=a.length;i>=1;i--)
        {
            System.out.print(a[i-1]+" ");
        }
     }
}
