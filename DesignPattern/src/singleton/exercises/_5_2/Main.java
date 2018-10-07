package singleton.exercises._5_2;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start-----");
		System.out.println("getInstance(1) 1回目");
		Triple obj1 = Triple.getInstance(1);
		System.out.println("getInstance(2) 1回目");
		Triple obj2 = Triple.getInstance(2);
		System.out.println("getInstance(3) 1回目");
		Triple obj3 = Triple.getInstance(3);
		System.out.println("getInstance(1) 2回目");
		Triple obj4 = Triple.getInstance(1);

		if (obj1 == obj2 && obj2 == obj3) {
			System.out.println("obj1とobj2とobj3の参照先は同一");
		} else {
			System.out.println("obj1とobj2とobj3の参照先は異なる");
		}

		System.out.println("obj1のid : " + obj1.getId());
		System.out.println("obj2のid : " + obj2.getId());
		System.out.println("obj3のid : " + obj3.getId());
		System.out.println("obj4のid : " + obj4.getId());
		System.out.println("End-------");
	}
}
