package dOuma_Pak;

public class Main {

	public static void main(String[] args) {
		
        Book bk = new Book();
        Book bk1 = new Book("Raunak","Solo leveling", 999);
        bk.setData();
        bk.display();
        bk1.display();
	}

}
