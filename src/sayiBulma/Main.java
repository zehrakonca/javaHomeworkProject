package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 3;
		boolean flag = false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacak) {
				flag = true;
				break;
			}
		}
		
		if (flag) {
			System.out.println("say� dizinin i�inde mevcut.");
		}else {
			System.out.println("say� dizi i�inde i�inde mevcut de�il.");
		}
	}

}
