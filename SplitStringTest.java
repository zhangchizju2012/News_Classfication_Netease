import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SplitStringTest {

	public static void main(String[] args) {
	//String[] aa = "aaa|bbb|ccc".split("|");
		File file = new File("C:/Users/hzzhangchi/Desktop/15.txt");
        String a = txt2String(file);
	
    String[] aa = "123!456!789!".split("!"); //这样才能得到正确的结果

    for (int i = 0 ; i <aa.length ; i++ ) {
 
      System.out.print(aa[0]); 

    	} 
	}
	
	 public static String txt2String(File file){
	        String result = "";
	        try{
	            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
	            String s = null;
	            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
	                result = result + "\n" +s;
	            }
	            br.close();    
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return result;
	    }
}
