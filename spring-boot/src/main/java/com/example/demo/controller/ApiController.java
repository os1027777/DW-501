package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.service.ApiService;
import com.example.demo.vo.EmpVO;
import com.example.demo.vo.UsersVO;


/*
 * RestController와 Controller 차이점
 * 
 * Controller는 페이지(html) 이동
 * RestController는 데이터(JSON) 전송
 * 
 * Controller는 사용자 요청(URL 요청)을 처리하는 class
 * Controller에서 로직을 구현 X
 */

//Rest : 자원 (== 데이터)
@RestController
public class ApiController {
	
//	final String ROOT_URL = "/api/v1";
	
	@Autowired
	ApiService apiServis;
	
	@Autowired
	EmpMapper empMapper;
	
	@Autowired
	PasswordEncoder passwordEncoder ;

	
	
	/*
	 * 클래스 이름 : 앞에 대문자로 시작 ex) Apple (o) apple (x)
	 * 변수 명 : 상수를 제외한 변수 이름은 소문자 : String name (o) String Name (x)
	 * 상수 : final double PI = 3.14 (o), final double pi = 3.14 (x), 
	 * 함수이름 : 명사 (x) 동사 (o) ex) function makeData(o) function data(x) 
	 */
//	@GetMapping("/api/v1/sample")
//	public List<String> callData(){
//		
//		List<String> list = new ArrayList<String>();
//		list.add("삼겹살");
//		list.add("오리고기");
//		list.add("목살");
//		
//		return list;
//	}
//	
//	//Get: 조회
//	//Mapping : URL 연결
//	//v1: 버전을 의미 (version 1)
//	@GetMapping("/api/v1/movie")
//	public Movie callMovie() {
//		
//		Movie movie = new Movie();
//		movie.setTitle("Just Friends");
//		movie.setYear("2005");
//		movie.setRuntime("96 min");
//		movie.setGenre("Comedy, Romance");
//		//movie라는 객체를 전달함
//		return movie;
//	}
//	
//	//URL 이름은 중복될 수 없다.
//	@GetMapping("/api/v1/movies")
//	public List<Movie> callMovies(){
//		ApiService service = new ApiService();//클래스 호출
//		
//		return service.makeMovies();
//	}
//	
//	//URL을 이용한 데이터 받는 방법
//	//Path 길(주소 or 경로)로 데이터 받기
//	//Path(경로) + Variable (값)
//	@GetMapping("/api/v1/sports/qatar2022/article/{articleNumber}")
//	public int callAtricle(@PathVariable int articleNumber) {
//		return articleNumber;
//	}
//	
//	// 쿼리스트링으로 데이터 받기
//	// /api/v1/webtoon/list?titleId=758037&weekday=mon
//	//Request(요청) +  Param (파라미터)
//	@GetMapping("/api/v1/webtoon/list")
//	public Map<String, Object> callWebtoon(@RequestParam int titleId, @RequestParam String weekday){
//		
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("titleId", titleId);
//		map.put("weekday", weekday);
//		
//		return map;
//	}
//	
//	//문제) 위에 웹툰 주소 쿼리스트링 -> path 로 변경
//	@GetMapping("/api/v1/webtoon/list/titleId/{titleId}/weekday/{weekday}")
//	public Map<String, Object> callWebtoon2(@PathVariable int titleId, @PathVariable String weekday){
//		
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("titleId", titleId);
//		map.put("weekday", weekday);
//		
//		return map;
//	}
//	
//	//Post : 데이터를 받아서 CREATE(생성)할떄 많이쓴다
//	@PostMapping("/api/v1/join")
//	public boolean calljoin(@RequestBody Login login , HttpServletRequest request) {
//		
//		System.out.println("받아온 데이터 입디다");
//		System.out.println(login.getUserId());
//		System.out.println(login.getUserEmail());
//		System.out.println(login.getUserPassword());
//		return true;
//	}
//	/*
//	 * Get : 데이터 조회 == select
//	 * Potch : 데이터 생성 == insert 
//	 * Patch : 데이터 업데이트 == update
//	 * Delete : 데이터 삭제 == delete
//	 * 
//	 */
//	@PostMapping("/api/v1/join2")
//	public boolean calljoin(@RequestBody Login2 login2) {
//		System.out.println("받아온 데이터 입디다");
//		System.out.println(login2.getCompanyName());
//		System.out.println(login2.getCompanyNumber());
//		System.out.println(login2.getCompanyPhone());
//		return true;
//	}
//	
	
	@GetMapping("/api/v1/emp")
	public List<EmpVO> callEmp(){
		return empMapper.selectEmp();
		
		}
	
	
	@PostMapping("/api/v1/emp/join")
	public int callEmpjoin(@RequestBody EmpVO emp){
			return empMapper.insertEmp(emp);
		
		
	}
	@DeleteMapping("/api/v1/emp/{empno}")
	public int callEmpDelete(@PathVariable int empno) {
		return empMapper.deleteEmp(empno);
	}
	
	
	
	@PatchMapping("/api/v1/emp")
	public int callEmpUpdate(@RequestBody EmpVO emp) {
		return empMapper.updateEmp(emp);
	}
	
	@PostMapping("/api/v1/users/join")
	public int callUsersLogin(@RequestBody UsersVO vo) {
		String password = vo.getPw();
		password = passwordEncoder.encode(password);
		vo.setPw(password);
		return empMapper.insertUsers(vo);
		
		
	}
	


//	HttpServletRequest req 키와 벨류로 구성됨 
	//세션은 서버가 종료될때까지 유지됨 (디폴트로 가지고 있는 시간은 30분)
	//세션
	// ,modelMap : HTML에 데이터를 전달 함 
	//1 . 아작스를 이용한 데이터 처리
	//2 모듈맵을 활용한 데이터 처리 
	//실무에서는 1번과 2번을 번갈아 가면서 쓰지만 우리는 1번에 초점을 두고 공부 
	//2번은 쓰는곳도 있고 안쓰는 곳도있기 때문에
	@PostMapping("/api/v1/login")
	public boolean callUserLogin(@RequestBody UsersVO vo ) {
		String password = vo.getPw();
		vo = empMapper.selectUsersPassword(vo);
		if(vo == null) return false;
	
				String DBpassword =  vo.getPw();
				
				boolean isUser = passwordEncoder.matches(password, DBpassword);
				System.out.println("비밇번호 체쿠"+isUser);
					
				return isUser;
	}
	
	
		
	
	
	@GetMapping("/api/v1/login")
	public List<UsersVO> callusers(){
		
		return empMapper.selectUsers();
		
		}
	@DeleteMapping("/api/v1/users/{id}")
	public int callusersDelete(@PathVariable String id) {
		return empMapper.deleteUsers(id);
	}
	
	@GetMapping("/api/v1/login/{id}")
	public boolean callUser(@PathVariable String id) {
		return apiServis.checkUser(id);
	}
	
	
	
	
	
	
}
