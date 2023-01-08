package j01_출력;

public class Myinfojava {

	public static void main(String[] args) {
		char name1 = '변';
		char name2 = '윤';
		char name3 = '후';
		
		int birth = 0624;
		
		String address = "김해시 내외동";
				
//		ctrl + space : 자동완성
//		sysout 자동완성 = System.out.println();
	
		System.out.print("이름 : ");
//		System.out.println(name1 + name2 + name3);
		System.out.println(""+ name1 + name2 + name3);
		System.out.print("생일 : ");
		System.out.println(birth);
		System.out.print("주소 : ");
		System.out.println(address);

	}

}
