package main;

import com.sort.Sorter;

import data.Human;


/**
 * 人間データのソート処理
 *
 * @author t.yoshida
 */
public class Startup
{
	public static void main(String[] args)
	{
		/*
		 * 身長の小さい順に並び替え
		 */
		System.out.println("─ 身長で並び替え ────────────────────");
		Human[] humans1 = createHumans();
		System.out.println(" [使用前] " + toString(humans1));
		Sorter.selectionSortByHeight(humans1);
		System.out.println(" [使用後] " + toString(humans1));

		System.out.println();

		/*
		 * 年齢の若い順に並び替え
		 */
		System.out.println("─ 年齢で並び替え ────────────────────");
		Human[] humans2 = createHumans();
		System.out.println(" [使用前] " + toString(humans2));
		Sorter.selectionSortByAge(humans2);
		System.out.println(" [使用後] " + toString(humans2));
	}

	/**
	 * 人間の配列データを作成する。
	 *
	 * @return 人間配列データ
	 */
	private static Human[] createHumans()
	{
		Human[] girls =
		{
			new Human("👩", "ミユウ", 21, 159), new Human("💁", "しゅう", 20, 154),
			new Human("👸", "ふぅ香", 24, 152), new Human("👧", "みう希", 23, 153),
		};

		return girls;
	}

	/*
	 * 配列データを文字列として連結する。
	 */
	private static String toString(Human[] targets)
	{
		StringBuilder sb = new StringBuilder(50);
		for(int i=0; i<targets.length; i++)
		{
			if(i != 0)
			{
				sb.append(", ");
			}
			sb.append(targets[i].toString());
		}

		return sb.toString();
	}
}
