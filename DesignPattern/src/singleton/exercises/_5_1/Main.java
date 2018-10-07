package singleton.exercises._5_1;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start-----");
		System.out.println("getInstance 1回目");
		TicketMaker obj1 = TicketMaker.getInstance();
		System.out.println("getInstance 2回目");
		TicketMaker obj2 = TicketMaker.getInstance();

		if (obj1 == obj2) {
			System.out.println("obj1とobj2の参照先は同一");
		} else {
			System.out.println("obj1とobj2の参照先は異なる");
		}
		System.out.println("obj1のgetNextTicketNumber : " + obj1.getNextTicketNumber());
		System.out.println("obj2のgetNextTicketNumber : " + obj2.getNextTicketNumber());
		System.out.println("obj1のgetNextTicketNumber : " + obj1.getNextTicketNumber());
		System.out.println("obj2のgetNextTicketNumber : " + obj2.getNextTicketNumber());

		System.out.println("End-------");
	}
}
