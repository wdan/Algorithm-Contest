import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class NinjaTurtles
{
	public int countOpponents(int P, int K)
	{
		int n = 1;
		boolean flag = false;
		while(true){
			double t1=((double)n)/K;
			double t2=((double)n)/3;
			int sum=(int)(Math.floor(t1)*3+Math.floor(t2));
			if (sum==P){flag=true;break;}
			else if(sum>P) break;
			n++;
		}	
		if (flag) return n;
		else return -1;
	}
}
//Powered by [KawigiEdit] 2.0!