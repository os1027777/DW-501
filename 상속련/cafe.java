package 숙;

import java.text.DecimalFormat;

public class cafe {
	public static void main(String[] args) {
		cafein i = new cafein();
		i.z.ing = "이름";
		i.money = "함량";
		
		DecimalFormat dc = new DecimalFormat("###,###,###,###");
		String ch = dc.format(i.z.ing);
		System.out.println(i.money + "은 카페인 함량 " + ch + "% 입니다.");
	}
}
