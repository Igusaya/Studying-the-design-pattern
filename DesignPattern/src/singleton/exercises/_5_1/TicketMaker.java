package singleton.exercises._5_1;

/**
 * TODO:Singletonパターンに修正する。
 * @author Igusaya
 *
 */
public class TicketMaker {

	private static TicketMaker ticketMaker = new TicketMaker();
	private int ticket = 1000;

	private TicketMaker() {
		System.out.println("インスタンス生成");
	}

	public static TicketMaker getInstance() {
		return ticketMaker;
	}

	/**
	 * synchronizedメソッド<br>
	 * synchronizedを付与することによって複数スレッドに対して同じ値を返す危険性を除外<br>
	 * ※ synchronizedは排他制御を付与 最初に呼んだスレッドがロックを取得し、<br>
	 *   ほかスレッドから同時に実行されないように制御される。
	 * @return
	 */
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
}
