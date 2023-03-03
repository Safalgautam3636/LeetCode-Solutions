class Solution {

    public int compress(char[] chars) {
        String s = "";
        int first = 0;
        int second = chars.length;
        if (second == 1) {
            return 1;
        }
        int ptr = 1;
        while (ptr <= chars.length - 1 && first <= chars.length - 2) {
            System.out.println(first + " " + ptr);

            if (chars[first] == chars[ptr]) {
                if (ptr == chars.length - 1 ) {

                    if (ptr - first + 1 > 0) {
                        int val = ptr - first + 1;
                        s += chars[first] + "" + val;
                    }
                    break;
                } else {
                    ptr++;
                }
            } else {
                if(ptr==chars.length-1&&first!=chars.length-2){
                    int length = ptr - first;
                    if(length>1&&chars[first]!=chars[ptr]){
                        s+=chars[first]+""+length+""+chars[ptr];
                        break;
                    }
                if (length > 1) {
                    s += chars[first] + "" + length;
                } else {
                    s += chars[first] + "";
                }
                    
                }
                if (ptr == chars.length - 1) {
                    s += chars[first] + "" + chars[ptr];
                    first++;
                    break;
                }
                int length = ptr - first;
                if (length > 1) {
                    s += chars[first] + "" + length;
                } else {
                    s += chars[first] + "";
                }

                first = ptr;
                ptr = first + 1;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        return s.length();

    }
}