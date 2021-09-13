public class StringRecursive {

    
    
    /** compares two integers and return the greater variable
     * @param x integer 
     * @param y integer
     * @return int
     */
    public static int max(int x, int y){
        // comparison whether y is greater than x
        if(x<y){
            return y;
        }
        return x;
    }

    
    /** Input of the two Strings which shall be compared
     * @param s first String
     * @param t second string
     * @return int how many letters are the idenctical
     */
    public static int LCSmemo(String s, String t){
        // Initialization of memo array to remember if the digit in the array is 0 or -1
        int[][] memo = new int[s.length()+1][t.length()+1];
        // fill array with -1, otherwise if we receive the result 0, we don't know if it has been calculated or just empty array.
        for(int i=0; i<s.length()+1; i++){
            for(int j=0; j<t.length()+1; j++){
                memo[i][j] = -1;
            }
        }
        // recursive dive into LCSmemo with additional input memo
        return LCSmemo(s,t,memo);
    }

    
    /** This function compares the digits within the array.
     * @param s same String as above
     * @param t same String as above
     * @param memo memo array with -1 
     * @return int how many letters are identical
     */
    public static int LCSmemo(String s, String t, int[][] memo){
        // if array is not filled with -1, one or both strings are empty
        if(memo[s.length()][t.length()]!=-1){
            return memo[s.length()][t.length()];
        }
        // If one String is empty, the return value is zero
        if(s.length() == 0 || t.length() == 0){
            memo[s.length()][t.length()] = 0;
            return 0;
        }
        // Compare if the letters of length-1 are the same, if yes both arrays will be reduced by one
        if(s.charAt(s.length()-1) == t.charAt(t.length()-1)){
            memo[s.length()][t.length()] = 1 + LCSmemo(s.substring(0, s.length()-1), t.substring(0, t.length()-1), memo);
            return memo[s.length()][t.length()];
        }
        // otherwise it will be compared with max function which has more identical letters, if we reduce the String t constantly or String s
        memo[s.length()][t.length()] = max(LCSmemo(s, t.substring(0, t.length()-1), memo),
                                            LCSmemo(s.substring(0, s.length()-1), t, memo));
        return memo[s.length()][t.length()];
    }
    
}
