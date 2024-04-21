package Lec4;

public class G_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int div=36;
		int dis=60;
		int rem;
		while(div%dis!=0)
		{
			rem=div%dis;
			div=dis;
			dis=rem;
		}
		System.out.println(dis);
	}

}
