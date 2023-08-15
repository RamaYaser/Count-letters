package data.assignment.pkg01;
import java.io.FileReader;
public class DataAssignment01 {
    public static void main(String[] args) throws Exception  {
         FileReader fr = new FileReader("C:\\Users\\Rama\\Desktop\\story.txt");
         int x;
         int arr[]=new int [128];        //A==65 -->90  , z==122  
         while( (x=fr.read()) != -1){
             if(x<127){
                 if(x>90)                           //if x is small latter
                     arr[x-32]++;
                 else
                     arr[x]++;}
         }
         for(int i=65;i<=90 ; i++)
         {
             if(i==91)
                 i+=6;
             System.out.println((char)i + "= " + arr[i]);
         }
    }
}
