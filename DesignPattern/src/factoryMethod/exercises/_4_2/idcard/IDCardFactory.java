package factoryMethod.exercises._4_2.idcard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import factoryMethod.exercises._4_2.framework.Factory;
import factoryMethod.exercises._4_2.framework.Product;

public class IDCardFactory extends Factory {

	private List<String> ownersList = new ArrayList<String>();
	private Map<Integer, String> ownersMap  = new HashMap<Integer, String>();
	private int number = 0;

	@Override
	protected Product createProduct(String owner) {
		number++;
		return new IDCard(owner, number);
	}

	@Override
	protected void registerProduct(Product prodct) {
		ownersList.add(((IDCard)prodct).getOwner());
		ownersMap.put(((IDCard)prodct).getNumber(), ((IDCard)prodct).getOwner());
	}

	public List<String> getOwnersList() {
		return ownersList;
	}

	public Map<Integer, String> getOwnersMap() {
		return ownersMap;
	}

}
