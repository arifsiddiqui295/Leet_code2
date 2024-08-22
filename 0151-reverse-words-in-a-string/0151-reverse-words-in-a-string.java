class Solution {
    public String reverseWords(String s) {
       String[] str = s.trim().split("\\s+");
       int j = str.length-1;
       int i = 0;
        while(i<j){
            String temp = str[i];
            str[i]=str[j];
            str[j]=temp;
            j--;
            i++;
        }
        String ret ="";
        for(int k=0;k<str.length;k++){
            if(k<str.length-1) ret=ret+str[k]+" ";
            else ret=ret+str[k];
        }
        return ret;
    }
}