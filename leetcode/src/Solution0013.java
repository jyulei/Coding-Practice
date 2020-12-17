/**
 * 13. 罗马数字转整数
 */
public class Solution0013 {
    public int romanToInt(String s) {
        char ch1,ch2;
        int sum=0;

        for(int i=1;i<s.length();++i) {
            ch1=s.charAt(i-1);
            ch2=s.charAt(i);
            if(ch1=='I'&&(ch2=='V'||ch2=='X')) {
                sum=sum-1;
                continue;
            }else if(ch1=='X'&&(ch2=='L'||ch2=='C')){
                sum=sum-10;
                continue;
            }else if(ch1=='C'&&(ch2=='D'||ch2=='M')){
                sum=sum-100;
                continue;
            }
            switch(ch1) {
                case 'I':sum+=1;break;
                case 'V':sum+=5;break;
                case 'X':sum+=10;break;
                case 'L':sum+=50;break;
                case 'C':sum+=100;break;
                case 'D':sum+=500;break;
                case 'M':sum+=1000;break;
            }
        }
        ch2=s.charAt(s.length()-1);
        switch(ch2) {
            case 'I':sum+=1;break;
            case 'V':sum+=5;break;
            case 'X':sum+=10;break;
            case 'L':sum+=50;break;
            case 'C':sum+=100;break;
            case 'D':sum+=500;break;
            case 'M':sum+=1000;break;
        }
        return sum;

    }
}
