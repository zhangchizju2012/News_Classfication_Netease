import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SplitStringTest {

	public static void main(String[] args) {
	//String[] aa = "aaa|bbb|ccc".split("|");
		File file = new File("C:/Users/hzzhangchi/Desktop/15.txt");
        String a = txt2String(file);
	
    String[] aa = "123!456!789!".split("!"); //�������ܵõ���ȷ�Ľ��

    for (int i = 0 ; i <aa.length ; i++ ) {
 
      System.out.print(aa[0]); 

    	} 
	}
	
	 public static String txt2String(File file){
	        String result = "";
	        try{
	            BufferedReader br = new BufferedReader(new FileReader(file));//����һ��BufferedReader������ȡ�ļ�
	            String s = null;
	            while((s = br.readLine())!=null){//ʹ��readLine������һ�ζ�һ��
	                result = result + "\n" +s;
	            }
	            br.close();    
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return result;
	    }
}
