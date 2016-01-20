import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.String;
import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;
import java.io.*;

public class PrepareForLibSVM{
	
	public static void main(String[] args) {
		
		
		/*
		for(int i = 50; i < 52; i ++){
			File file = new File("C:/Users/hzzhangchi/Desktop/Health/"+i+".txt");
			texts = texts +" "+ txt2String(file);
		}
		*/
		File DictFile = new File("C:/Users/hzzhangchi/Desktop/28.txt");
        String DictString = txt2String(DictFile);
	
        String[] Dict = DictString.split(";"); //�������ܵõ���ȷ�Ľ��
		//String[] Dict = {"����","����","��","ʮ","���","����","����","��","��","����","�˶�","�˶���","��ά��","ʳ��","����","��","��","����","����","��ˬ","Ӫ��","���","��","Σ��","��","��","��","��","��","�۴�","��","Сʱ","����","35��","�½�","���","����","��Ƭ","��","����","����","��","��","����","����","��","ǰ","����","����","����","����","��ʳ","��ζ��","����","ʳƷ","����","����","���˪","����","�峿","����","����","��Ʒ","��ɫ","�䷽","����","����","����","֬��","���̴�","��","����","����","�̼�","�³´�л","��","��","ʱ","��","����","����","����","��ʿ","��","����","Ů��","��","����","����","Ƥ��"};
        System.out.println(Dict[0]);
		String texts = null;
		/*
		int z = 10;
		int y = 1;
		File file = null;
		
		while(z<100){
		switch(y)
		{
		case 1: file = new File("C:/Users/hzzhangchi/Desktop/Health/"+z+".txt");
		case 2: file = new File("C:/Users/hzzhangchi/Desktop/Military/"+z+".txt");
		//case 3: file = new File("C:/Users/hzzhangchi/Desktop/Net/"+z+".txt");
		//case 4: file = new File("C:/Users/hzzhangchi/Desktop/Culture/"+z+".txt");
		//case 5: file = new File("C:/Users/hzzhangchi/Desktop/Money/"+z+".txt");
		}
		*/
		for(int z = 500; z < 1000; z ++){
			File file = new File("C:/Users/hzzhangchi/Desktop/Health/"+z+".txt");
			
		

		texts =  txt2String(file);
			
		List<Term> al = ToAnalysis.parse(texts);
		String[] Words = new String[al.size()];
		
		int j = 0;
		for(Iterator<Term> i = al.iterator();i.hasNext(); ){
			if(j <= al.size()){
				Words[j] = i.next().toString();
			}
			else{
				i.next();
			}
			j = j + 1;			
		}
		Map<String, Integer> map = new LinkedHashMap();
		for(int i=0;i<Dict.length;i++){
			map.put(Dict[i],0);
		}
		for(int i=0;i<al.size();i++){
				if (map.containsKey(Words[i])){
					map.put(Words[i],map.get(Words[i])+1); 
				}
		}
		//printMap(map);  
		//map = sortMap(map);  
		//printMap(map);  
		//System.out.println(map);
				  
		  try {
		   String line = System.getProperty("line.separator");
		   StringBuffer str = new StringBuffer();
		   FileWriter fw = new FileWriter("C:/Users/hzzhangchi/Desktop/29.txt", true);
		   Set set = map.entrySet();
		   Iterator iter = set.iterator();
		  
		   str.append("1 ");
		   
		   int count = 1;
		   while(iter.hasNext()){
		    Map.Entry entry = (Map.Entry)iter.next(); 
		   // if(Integer.parseInt(entry.getValue().toString())>1){
		   // 	 str.append("\""+entry.getKey()+"\",");
		   // }
		    //str.append(entry.getKey()).append(line);
		    //str.append(entry.getKey()+":"+entry.getValue()+" ");
		    str.append(count+":"+entry.getValue()+" ");
		    count = count + 1;
		   }
		   str.append(line);
		   fw.write(str.toString());
		   fw.close();
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  /*
		  z = z +1;
		  if(z == 100){
			  if(y<2){
				  y=y+1;
				  z=10;
			  }
		  }
		  */
		}
		for(int z = 500; z < 1000; z ++){
			File file = new File("C:/Users/hzzhangchi/Desktop/Military/"+z+".txt");
			
		

		texts =  txt2String(file);
			
		List<Term> al = ToAnalysis.parse(texts);
		String[] Words = new String[al.size()];
		
		int j = 0;
		for(Iterator<Term> i = al.iterator();i.hasNext(); ){
			if(j <= al.size()){
				Words[j] = i.next().toString();
			}
			else{
				i.next();
			}
			j = j + 1;			
		}
		Map<String, Integer> map = new LinkedHashMap();
		for(int i=0;i<Dict.length;i++){
			map.put(Dict[i],0);
		}
		for(int i=0;i<al.size();i++){
				if (map.containsKey(Words[i])){
					map.put(Words[i],map.get(Words[i])+1); 
				}
		}
		//printMap(map);  
		//map = sortMap(map);  
		//printMap(map);  
		//System.out.println(map);
				  
		  try {
		   String line = System.getProperty("line.separator");
		   StringBuffer str = new StringBuffer();
		   FileWriter fw = new FileWriter("C:/Users/hzzhangchi/Desktop/29.txt", true);
		   Set set = map.entrySet();
		   Iterator iter = set.iterator();
		  
		   str.append("2 ");
		   
		   int count = 1;
		   while(iter.hasNext()){
		    Map.Entry entry = (Map.Entry)iter.next(); 
		   // if(Integer.parseInt(entry.getValue().toString())>1){
		   // 	 str.append("\""+entry.getKey()+"\",");
		   // }
		    //str.append(entry.getKey()).append(line);
		    //str.append(entry.getKey()+":"+entry.getValue()+" ");
		    str.append(count+":"+entry.getValue()+" ");
		    count = count + 1;
		   }
		   str.append(line);
		   fw.write(str.toString());
		   fw.close();
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  /*
		  z = z +1;
		  if(z == 100){
			  if(y<2){
				  y=y+1;
				  z=10;
			  }
		  }
		  */
		}
		for(int z = 500; z < 1000; z ++){
			File file = new File("C:/Users/hzzhangchi/Desktop/Net/"+z+".txt");
			
		

		texts =  txt2String(file);
			
		List<Term> al = ToAnalysis.parse(texts);
		String[] Words = new String[al.size()];
		
		int j = 0;
		for(Iterator<Term> i = al.iterator();i.hasNext(); ){
			if(j <= al.size()){
				Words[j] = i.next().toString();
			}
			else{
				i.next();
			}
			j = j + 1;			
		}
		Map<String, Integer> map = new LinkedHashMap();
		for(int i=0;i<Dict.length;i++){
			map.put(Dict[i],0);
		}
		for(int i=0;i<al.size();i++){
				if (map.containsKey(Words[i])){
					map.put(Words[i],map.get(Words[i])+1); 
				}
		}
		//printMap(map);  
		//map = sortMap(map);  
		//printMap(map);  
		//System.out.println(map);
				  
		  try {
		   String line = System.getProperty("line.separator");
		   StringBuffer str = new StringBuffer();
		   FileWriter fw = new FileWriter("C:/Users/hzzhangchi/Desktop/29.txt", true);
		   Set set = map.entrySet();
		   Iterator iter = set.iterator();
		  
		   str.append("3 ");
		   
		   int count = 1;
		   while(iter.hasNext()){
		    Map.Entry entry = (Map.Entry)iter.next(); 
		   // if(Integer.parseInt(entry.getValue().toString())>1){
		   // 	 str.append("\""+entry.getKey()+"\",");
		   // }
		    //str.append(entry.getKey()).append(line);
		    //str.append(entry.getKey()+":"+entry.getValue()+" ");
		    str.append(count+":"+entry.getValue()+" ");
		    count = count + 1;
		   }
		   str.append(line);
		   fw.write(str.toString());
		   fw.close();
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  /*
		  z = z +1;
		  if(z == 100){
			  if(y<2){
				  y=y+1;
				  z=10;
			  }
		  }
		  */
		}
		for(int z = 500; z < 1000; z ++){
			File file = new File("C:/Users/hzzhangchi/Desktop/Culture/"+z+".txt");
			
		

		texts =  txt2String(file);
			
		List<Term> al = ToAnalysis.parse(texts);
		String[] Words = new String[al.size()];
		
		int j = 0;
		for(Iterator<Term> i = al.iterator();i.hasNext(); ){
			if(j <= al.size()){
				Words[j] = i.next().toString();
			}
			else{
				i.next();
			}
			j = j + 1;			
		}
		Map<String, Integer> map = new LinkedHashMap();
		for(int i=0;i<Dict.length;i++){
			map.put(Dict[i],0);
		}
		for(int i=0;i<al.size();i++){
				if (map.containsKey(Words[i])){
					map.put(Words[i],map.get(Words[i])+1); 
				}
		}
		//printMap(map);  
		//map = sortMap(map);  
		//printMap(map);  
		//System.out.println(map);
				  
		  try {
		   String line = System.getProperty("line.separator");
		   StringBuffer str = new StringBuffer();
		   FileWriter fw = new FileWriter("C:/Users/hzzhangchi/Desktop/29.txt", true);
		   Set set = map.entrySet();
		   Iterator iter = set.iterator();
		  
		   str.append("4 ");
		   
		   int count = 1;
		   while(iter.hasNext()){
		    Map.Entry entry = (Map.Entry)iter.next(); 
		   // if(Integer.parseInt(entry.getValue().toString())>1){
		   // 	 str.append("\""+entry.getKey()+"\",");
		   // }
		    //str.append(entry.getKey()).append(line);
		    //str.append(entry.getKey()+":"+entry.getValue()+" ");
		    str.append(count+":"+entry.getValue()+" ");
		    count = count + 1;
		   }
		   str.append(line);
		   fw.write(str.toString());
		   fw.close();
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  /*
		  z = z +1;
		  if(z == 100){
			  if(y<2){
				  y=y+1;
				  z=10;
			  }
		  }
		  */
		}
		for(int z = 500; z < 1000; z ++){
			File file = new File("C:/Users/hzzhangchi/Desktop/Money/"+z+".txt");
			
		

		texts =  txt2String(file);
			
		List<Term> al = ToAnalysis.parse(texts);
		String[] Words = new String[al.size()];
		
		int j = 0;
		for(Iterator<Term> i = al.iterator();i.hasNext(); ){
			if(j <= al.size()){
				Words[j] = i.next().toString();
			}
			else{
				i.next();
			}
			j = j + 1;			
		}
		Map<String, Integer> map = new LinkedHashMap();
		for(int i=0;i<Dict.length;i++){
			map.put(Dict[i],0);
		}
		for(int i=0;i<al.size();i++){
				if (map.containsKey(Words[i])){
					map.put(Words[i],map.get(Words[i])+1); 
				}
		}
		//printMap(map);  
		//map = sortMap(map);  
		//printMap(map);  
		//System.out.println(map);
				  
		  try {
		   String line = System.getProperty("line.separator");
		   StringBuffer str = new StringBuffer();
		   FileWriter fw = new FileWriter("C:/Users/hzzhangchi/Desktop/29.txt", true);
		   Set set = map.entrySet();
		   Iterator iter = set.iterator();
		  
		   str.append("5 ");
		   
		   int count = 1;
		   while(iter.hasNext()){
		    Map.Entry entry = (Map.Entry)iter.next(); 
		   // if(Integer.parseInt(entry.getValue().toString())>1){
		   // 	 str.append("\""+entry.getKey()+"\",");
		   // }
		    //str.append(entry.getKey()).append(line);
		    //str.append(entry.getKey()+":"+entry.getValue()+" ");
		    str.append(count+":"+entry.getValue()+" ");
		    count = count + 1;
		   }
		   str.append(line);
		   fw.write(str.toString());
		   fw.close();
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  /*
		  z = z +1;
		  if(z == 100){
			  if(y<2){
				  y=y+1;
				  z=10;
			  }
		  }
		  */
		}
		System.out.println(1);
	}
	
	public static boolean contains(String[] stringArray, String source) {
		  // ת��Ϊlist
		  List<String> tempList = Arrays.asList(stringArray);
		  
		  // ����list�İ�������,�����ж�
		  if(tempList.contains(source))
		  {
		   return true;
		  } 
		  else {
		   return false;
		  }
	}
	
	public static String txt2String(File file){
	    String result = "";
	    try{
	        BufferedReader br = new BufferedReader(new FileReader(file));//����һ��BufferedReader������ȡ�ļ�
	        String s = null;
	        while((s = br.readLine())!=null){//ʹ��readLine������һ�ζ�һ��
	        	if(result == ""){
	        		 result = s;
	        	}
	        	else{
	            result = result + "\n" +s;
	        	}
	        }
	        br.close();    
	    }catch(Exception e){
	        e.printStackTrace();
	    }
	    return result;
	}

	private static void printMap(Map map){
	    System.out.println("===================mapStart==================");
	    Iterator it = map.entrySet().iterator();
	    while(it.hasNext()){
	        Map.Entry entry = (Map.Entry) it.next();
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
	    System.out.println("===================mapEnd==================");
	} 

	public static Map sortMap(Map oldMap) {
	    ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(oldMap.entrySet());
	    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

	        public int compare(Entry<java.lang.String, Integer> arg0,
	                Entry<java.lang.String, Integer> arg1) {
	            return arg0.getValue() - arg1.getValue();
	        }
	    });
	    Map newMap = new LinkedHashMap();
	    for (int i = 0; i < list.size(); i++) {
	        newMap.put(list.get(i).getKey(), list.get(i).getValue());
	    }
	    return newMap;
	}
}

