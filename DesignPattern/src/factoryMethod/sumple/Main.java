package factoryMethod.sumple;

import factoryMethod.sumple.framework.Factory;
import factoryMethod.sumple.framework.Product;
import factoryMethod.sumple.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("試験太郎");
		Product card2 = factory.create("検証花子");
		Product card3 = factory.create("試作太一");
		card1.use();
		card2.use();
		card3.use();
	}

}
