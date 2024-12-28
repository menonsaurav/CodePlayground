public class KDistinct {
    public static int printKDistinct(char[] s, int K) {
        int distinct = 0;
        int n = s.length;
        if(K <= 0){
            return -1;
        }
        for(int i = 0; i<n; ++i){
            for(int j = i+1; j<n; ++j){
                if(s[i] == s[j]){
                    s[j] = '\0';
                }
            }
            if(s[i] != '\0'){
                distinct++;
            }
            if(distinct == K){
                return s[i];
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        String str = "GeeksForGeeks";
        int K = 2;
        int ans = printKDistinct(str.toCharArray(), K);
        if (ans == -1)
            System.out.println(-1);
        else
            System.out.println((char)ans);
    }
}
