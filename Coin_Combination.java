package Lec28;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []coin = {1,3,5};
		int amount = 6;
		COs(coin,amount,"",0);
	}
	
	public static void COs(int [] coins , int amount , String ans,int idx)
	{
		if(amount==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<coins.length;i++) {
			if(amount>=coins[i])
			{
//				amount-=coins[i];
				COs(coins,amount-coins[i], ans+coins[i],i);
			}
		}
	}

}
