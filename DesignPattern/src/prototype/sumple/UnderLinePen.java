package prototype.sumple;

import prototype.sumple.framework.Product;

public class UnderLinePen implements Product {
	private char ulchar;

	public UnderLinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println("");
	}

	/**
	 * 自インスタンスの複製を行う。
	 * @return
	 */
	@Override
	public Product createClone() {
		Product p = null;
		try {
			// cloneメソッドは浅いコピーを行う。内包される参照先の値はコピーされず、参照先(アドレス)がコピーされる
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
