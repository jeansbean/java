package cn.jeans.yzpractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class GetTest {
	public static void main(String[] args) {
		Map<Integer,String>  m = new LinkedHashMap<Integer,String>();
		m.put(1, "one");
		m.put(2, "two");
		
		
		//利用keySet
		Set<Integer> s1 = m.keySet();
		for(int i : s1){
			String value = m.get(i);
			System.out.println(i+""+value);
		}
		
		//利用entrySet
		Set<Map.Entry<Integer, String>> s2 = m.entrySet();
		for(Map.Entry<Integer, String> me : s2){
			int key = me.getKey();
			String value = me.getValue();
			System.out.println(key+""+value);
		}
	}
}
