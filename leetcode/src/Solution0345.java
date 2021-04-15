import java.util.HashSet;

/**
 * 345. 反转字符串中的元音字母
 */
public class Solution0345 {
    public String reverseVowels(String s) {
        char[] data=s.toCharArray();
        int i=0,j=s.length()-1;
        HashSet<Character> hashSet=new HashSet<>();
        hashSet.add('a');
        hashSet.add('A');
        hashSet.add('e');
        hashSet.add('E');
        hashSet.add('i');
        hashSet.add('I');
        hashSet.add('o');
        hashSet.add('O');
        hashSet.add('u');
        hashSet.add('U');
        while (i < j) {
            if (hashSet.contains(data[i])&&hashSet.contains(data[j])){
                char tmp=data[i];
                data[i]=data[j];
                data[j]=tmp;
                i++;
                j--;
            } else if (hashSet.contains(data[i])){
                j--;
            } else if (hashSet.contains(data[j])){
                i++;
            } else {
                i++;
                j--;
            }
        }
        return String.valueOf(data);
    }
}
