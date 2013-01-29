import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class BeautifulStrings {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new FileInputStream("beautiful_stringstxt.txt"));
		int num =  sc.nextInt();
		sc.nextLine();
		int[] record = new int[26];
		for (int i=0;i<num;i++){
			for (int j=0;j<26;j++) record[j] = 0;
			String s = sc.nextLine();
			for (int j=0;j<s.length();j++){
				char c = s.charAt(j);
				if (c>='a'&&c<='z'){
					record[c-'a']++;
				}else if (c>='A'&&c<='Z'){
					record[c-'A']++;
				}
			}
			Arrays.sort(record);
			int ans = 0;
			for (int j=25;j>=0;j--){
				ans+=record[j]*(j+1);
			}
			System.out.println("Case #"+(i+1)+": "+ans);
		}
	}
}
