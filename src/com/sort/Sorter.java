package com.sort;

import data.Human;

/**
 * ソートクラス
 *
 * @author t.yoshida
 */
public class Sorter
{
	/**
	 * 人間配列の身長の小さい順に並び替え（選択ソート）
	 *
	 * @param humans 人間配列
	 */
	public static void selectionSortByHeight(Human[] humans)
	{
		int count = humans.length;
		for(int i=0; i<count; i++)
		{
			/*
			 * i ～ (count - 1) の間で最小値のインデックスを探索
			 */
			int idxMin = i;
			for(int j=(i+1); j<count; j++)
			{
				if(humans[idxMin].getHeight() > humans[j].getHeight())
				{
					idxMin = j;
				}
			}

			// 最小値のインデックス idxMin の値と i を交換
			Human tmp = humans[i];
			humans[i] = humans[idxMin];
			humans[idxMin] = tmp;
		}
	}

	/**
	 * 人間配列の年齢の若い順に並び替え（選択ソート）
	 *
	 * @param humans 人間配列
	 */
	public static void selectionSortByAge(Human[] humans)
	{
		int count = humans.length;
		for(int i=0; i<count; i++)
		{
			/*
			 * i ～ (count - 1) の間で最小値のインデックスを探索
			 */
			int idxMin = i;
			for(int j=(i+1); j<count; j++)
			{
				if(humans[idxMin].getAge() > humans[j].getAge())
				{
					idxMin = j;
				}
			}

			// 最小値のインデックス idxMin の値と i を交換
			Human tmp = humans[i];
			humans[i] = humans[idxMin];
			humans[idxMin] = tmp;
		}
	}
}
