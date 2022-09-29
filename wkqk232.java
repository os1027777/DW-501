package 자바공부2;


class C{
	C(String x , int i){
		System.out.println();
	}
}


class Emp{
	 private int 사원번호;
	 private String 사원이름;
	 private int 급여;
	 private int 보너스;
 Emp(){
		 
	 }

	Emp(int 사원번호, String 사원이름, int 급여, int 보너스){
		this.사원번호 = 사원번호;
		this.사원이름 = 사원이름;
		this.급여 = 급여;
		this.보너스 = 보너스;
		
	
	 }

	 
	public int get사원번호() {
		return 사원번호;
	}
	public void set사원번호(int 사원번호) {
		this.사원번호 = 사원번호;
	}
	public String get사원이름() {
		return 사원이름;
	}
	public void set사원이름(String 사원이름) {
		this.사원이름 = 사원이름;
	}
	public int get급여() {
		return 급여;
	}
	public void set급여(int 급여) {
		this.급여 = 급여;
	}
	public int get보너스() {
		return 보너스;
	}
	public void set보너스(int 보너스) {
		this.보너스 = 보너스;
	}
	 
}
class A{
	public void a클라스() {
		System.out.println("에리ㅣ릴");
		//생성자는 메소드와 다르게 리턴타입이없다 생성자 ==메소드
		//기본적으로 제공 == 디폴트(Default)
		//b라는 클레스를 호출할때 디폴트 메소드도 자동으로 호출된다
	}
}
	//메소드이름은 같은데, 파라미터 타입이 다를 때 : 오버로딩

public class wkqk232 {

	public static void main(String[] args) {
	 A a= new A();
	 a.a클라스();
	 
	 new A().a클라스();
		
 C b= new C("하남자", 200);
 
	}

}
