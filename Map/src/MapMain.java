import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {

		// 2021-06-21
		// 1. Map 에 1 개씩 담고 1 개씩 꺼내기 ( put , get )
		Map<String, String> map = new HashMap<String, String>();
		
		// map 에 추가
		map.put("김모모", "10");
		map.put("이모모", "20");
		map.put("최모모", "30");

		// map 에서 key 로 value 검색 
		map.get("김모모");
		map.get("이모모");
		map.get("최모모");

		// value 확인
		System.out.println(map.get("김모모"));
		System.out.println(map.get("이모모"));
		System.out.println(map.get("최모모"));
		
		
		
		// 2. keySet 에 key를 담아 iterator( 반복자 ) 로  꺼냄
		Set<String> keySet = map.keySet(); // map 의 key만 모아 keySet 을 만들어 변수에 담음
		Iterator<String> keyIterator = keySet.iterator(); // key 만 모인 keySet을 iterator(반복자)로 돌려 key 들만 변수에 담음
		
		
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			String value = map.get(key);
			System.out.println(key + "," + value);
		}
		
		
		
		// 3. entrySet 에 key, value 담아 반복자로 꺼냄
		Set<Map.Entry<String, String>> entrySet = map.entrySet(); // 키, 값을 모아 entrySet으로 만듬
		Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator(); // entrySet 을 반복자로 돌림
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, String> entry = entryIterator.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+","+value);
		}

	}

}
