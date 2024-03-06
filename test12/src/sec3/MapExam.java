package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
//remove(인덱스, key)
//Map : HashMap, Hashtable, TreeMap, Properties => 키와 값 분리시에는 entry 또는 element 단위로 Iterator나 Enumeration이 필요함
public class MapExam {

	public static void main(String[] args) {
		//Map은 List처럼 index가 존재하는 것이 아니라 키가 존재한다.
		//순서 유지가 되지 않는다.
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new Hashtable<>();
		Map<Integer, String> map3 = new TreeMap<>();
		Properties map4 = new Properties(); //속성만, 키와 값은 모두 문자열로 취급, put x, set o
		
		map1.put("kim", 90); //추가
		
	}

}
