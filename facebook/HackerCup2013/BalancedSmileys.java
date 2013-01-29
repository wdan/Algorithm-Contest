import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class BalancedSmileys {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new FileInputStream("balanced_smileystxt.txt"));
		int num = sc.nextInt();
		sc.nextLine();
		for (int i=0;i<num;i++){
			String s = sc.nextLine();
			if (isStringBalanced(s))
				System.out.println("Case #"+(i+1)+": "+"YES");
			else
				System.out.println("Case #"+(i+1)+": "+"NO");
		}
	}
	public static boolean isStringBalanced(String s){
		for (int i=0;i<s.length();i++){
			if (s.charAt(i)=='('){
				if ((i>0)&&(s.charAt(i-1))==':'){
					if (i==s.length()-1) return true;
					String subS = s.substring(i+1);
					if (isStringBalanced(subS)) return true;
				}
				boolean flag = false;
				for (int j=s.length()-1;j>i;j--){
					if (s.charAt(j)==')'){
						String subS = s.substring(i+1,j);
						if (!isStringBalanced(subS)) return false;
						flag = true;
						i = j; 
						continue;
					}
				}
				if (!flag) return false;		
			}else if (s.charAt(i)==')'){
				if (!((i>0)&&(s.charAt(i-1)==':')))
					return false;
			}
		}
		return true;
	}
}
