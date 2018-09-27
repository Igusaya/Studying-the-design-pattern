package factoryMethod.exercises._4_2.idcard;

import factoryMethod.exercises._4_2.framework.Product;

public class IDCard extends Product {

	private String owner;
	private int number;

	IDCard(String owner, int number) {
		System.out.println(owner + ":" + Integer.toString(number) + " のカードを作ります。");
		this.owner = owner;
		this.number = number;
	}
	@Override
	public void use() {
		System.out.println(owner + ":" + Integer.toString(number) + "のカードを使います。");
	}

	public String getOwner() {
		return owner;
	}

	public int getNumber() {
		return number;
	}
}
