class Solution {
    public int compress(char[] chars) {
        int pointer = 0;
        int count = 1;

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
                continue;
            }
            chars[pointer++] = chars[i];
            if (count > 1) {
                String num = String.valueOf(count);
                for (int j = 0; j < num.length(); j++) {
                    chars[pointer++] = num.charAt(j);
                }
            }
            count = 1;
        }
        chars[pointer++] = chars[chars.length - 1];
        if (count > 1) {
            String num = String.valueOf(count);
            for (int j = 0; j < num.length(); j++) {
                chars[pointer++] = num.charAt(j);
            }
        }

        return pointer;

    }
}