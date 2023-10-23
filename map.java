package Map;
import java.util.*;
public class Mapping {
		public static void main(String[] args) {
			// map
			//Hashmap
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"rakesh");    
		      hm.put(2,"govind");    
		      hm.put(3,"rama");   
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		     //HashTable
		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      ht.put(2,"ram");  
		      ht.put(7,"jony");  
		      ht.put(8,"Einsien");  
		      ht.put(9,"Dinesh");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(Map.Entry n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }
		      //TreeMap
		      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(6,"James");    
		      map.put(9,"Mani");    
		      map.put(12,"Alex");       
		      
		      System.out.println("\nThe elements of TreeMap are ");  
		      for(Map.Entry l:map.entrySet()){    
		       System.out.println(l.getKey()+" "+l.getValue());    
		      }    
		   }  
	}
