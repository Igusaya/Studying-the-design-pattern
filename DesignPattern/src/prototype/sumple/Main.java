package prototype.sumple;

import prototype.sumple.framework.Manager;
import prototype.sumple.framework.Product;

/**
 * クラスからnewしてインスタンスを作りたくない場合Prototypeパターンを使用する<br>
 * 1.種類が多すぎてクラスが纏められない場合<br>
 * 　- サンプルでは無限に雛形を作成できる。これらをすべて別クラスにするのは管理上宜しくない。<br>
 * 2.クラスからインスタンス生成が難しい場合<br>
 * 　- 例えばユーザーが編集を加えた(大量に)インスタンスと同じものを作りたいとき、インスタンス生成よりもコピーのほうが楽<br>
 * 3.フレームワークと生成するインスタンスを分けたい場合<br>
 * 　- 正直よくわからん
 * @author Igusaya
 *
 */
public class Main {

	public static void main(String[] args) {
		// 準備
		Manager manager = new Manager();
		UnderLinePen upen = new UnderLinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		manager.register("strong message", upen);
		manager.register("worning box", mbox);
		manager.register("slash box", sbox);

		// 生成
		Product p1 = manager.create("strong message");
		p1.use("strong message (clone)");
		System.out.println("");
		Product p2 = manager.create("worning box");
		p2.use("worning box (clone)");
		System.out.println("");
		Product p3 = manager.create("slash box");
		p3.use("slash box (clone)");
		System.out.println("");

		if (p1 == upen) {
			System.out.println("p1とupenの参照先は同一");
		} else {
			System.out.println("p1とupenの参照先は異なる");
		}
	}

}
