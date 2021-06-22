import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IdAndPwMain {

	public static void main(String[] args) {

		// 2021-06-23
		// 1. key -> id , value -> pw 로그인

		// id , pw 담을 map 선언 ( 계정 )
		Map<String, String> account = new HashMap<String, String>();

		// id
		String id = "";
		// pw
		String pw = "";

		// id , pw 저장
		account.put("id1", "pw1");
		account.put("id2", "pw2");
		account.put("id3", "pw3");
		account.put("id4", "pw4");

		// scanner 호출
		Scanner scanner = new Scanner(System.in); // 키보드로 값 받기 위해 scanner 호출

		while (true) {

			// id 입력 창
			System.out.println("아이디 입력 : "); // 입력 창 출력
			id = scanner.nextLine(); // 키보드로 입력한 id 값 받아옴

			// pw 입력 창
			System.out.println("비밀번호 입력 : "); // 입력 창 출력
			pw = scanner.nextLine(); // 키보드로 입력한 pw 값 받아옴

			// account.containsKey(id); 는 id 가 account 에 있는지 true / false 로 리턴

			// id 존재 확인
			if (account.containsKey(id)) { // id를 key 로 계정 정보에 있는지 검색 ( T / F 로 리턴 )
				// pw 일치 확인
				if (account.get(id).equals(pw)) { // id 를 key 로 얻어온 value 값이 입력한 pw 와 같다면
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
				}
			} else {
				System.out.println("id 없음");
			}
		}

	}

}
