import java.util.*;

public class B{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder("<3");
        for (int i=0;i<n;i++){
            sb.append(sc.next());
            sb.append("<3");
        }
        String s = sb.toString();
        String ans = sc.next();
        int len = s.length();
        int index = 0;
        for (int i=0;i<ans.length();i++){
            if (ans.charAt(i)!=s.charAt(index)) continue;
            index++;
            if (index == len) break;
        }
        if (index == len)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
