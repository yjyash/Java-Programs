package Lec28;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []coin = {1,3,5};
		int amount = 6;
		COs(coin,amount,"");
	}
	
	public static void COs(int [] coins , int amount , String ans)
	{
		if(amount==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<coins.length;i++) {
			if(amount>=coins[i])
			{
//				amount-=coins[i];
				COs(coins,amount-coins[i], ans+coins[i]);
			}
		}
	}

}
