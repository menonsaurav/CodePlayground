/*Program to find Smallest and Largest Word in a String */
class minMaxLengthWords1 {

    static String min_word = "", max_word = "";

    public static void minMaxLengthWords(String str){
        int len = str.length();
        int si = 0, ei = 0;
        int min_si = 0, min_length = len;
        int max_si = 0, max_length = 0;
        while(ei <= len){
            if(ei < len && str.charAt(ei) != ' '){
                ei++;
            }
            else{
                int curr_length = ei - si;
                if(curr_length < min_length){
                    min_si = si;
                    min_length = curr_length;
                }
                if(curr_length > max_length){
                    max_si = si;
                    max_length = curr_length;
                }
                ei++;
                si = ei;
            }
        }
        min_word = str.substring(min_si, min_si + min_length);
        max_word = str.substring(max_si, max_si + max_length);
    }
    public static void main(String[] args)
    {
        String a = "GeeksforGeeks A Computer Science portal for Geeks";

        minMaxLengthWords(a);

        // to take input in string use getline(cin, a);
        System.out.print("Minimum length word: "
                + min_word
                + "\nMaximum length word: "
                + max_word);
    }
}
