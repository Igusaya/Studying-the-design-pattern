package factoryMethod.exercises._4_2;

import java.util.Map;

import factoryMethod.exercises._4_2.framework.Factory;
import factoryMethod.exercises._4_2.framework.Product;
import factoryMethod.exercises._4_2.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("試験太郎");
		Product card2 = factory.create("検証花子");
		Product card3 = factory.create("試作太一");
		card1.use();
		card2.use();
		card3.use();
		Map<Integer, String> map = ((IDCardFactory)factory).getOwnersMap();
		System.out.println("-------------");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("-------------");
	}

}
