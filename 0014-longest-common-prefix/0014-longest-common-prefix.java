class Solution {
    public String longestCommonPrefix(String[] str) {
        int low = str[0].length();
        for (int i = 0; i < str.length; i++) {
            int n = str[i].length();
            if (n < low)
                low = n;
        }
        System.out.println(low);
        for (int i = 0; i < str.length - 1; i++) {
            boolean check = false;
            while (check == false) {
                if (str[i].substring(0, low).equals(str[i + 1].substring(0, low))) {
                    System.out.println(low);
                    check = true;
                } else {
                    low--;
                    if (low == 0) {
                        check = true;
                    }
                }
            }
        }
       if (low == 0) return "";
        String s1= "";
        for(int i = 0;i<low;i++){
            s1+=str[0].charAt(i);
        }
        return s1;
    }
}