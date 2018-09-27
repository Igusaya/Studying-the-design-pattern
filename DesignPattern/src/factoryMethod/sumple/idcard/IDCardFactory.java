package factoryMethod.sumple.idcard;

import java.util.ArrayList;
import java.util.List;

import factoryMethod.sumple.framework.Factory;
import factoryMethod.sumple.framework.Product;

public class IDCardFactory extends Factory {

	private List<String> owners = new ArrayList<String>();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product prodct) {
		owners.add(((IDCard)prodct).getOwner());
	}

	public List<String> getOwners() {
		return owners;
	}

}
