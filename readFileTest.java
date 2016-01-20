import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class readFileTest {
    /**
     * ��ȡtxt�ļ�������
     * @param file ��Ҫ��ȡ���ļ�����
     * @return �����ļ�����
     */
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
    
    public static void main(String[] args){
        File file = new File("C:/Users/hzzhangchi/Desktop/14.txt");
        String a = txt2String(file);
        System.out.println(txt2String(file));
    }
}

