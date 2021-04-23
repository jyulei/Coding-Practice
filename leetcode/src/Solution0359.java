import java.util.HashMap;
import java.util.Map;

/**
 * 359. 日志速率限制器
 */
public class Solution0359 {
    class Logger {

        Map<String,Integer> map;
        /** Initialize your data structure here. */
        public Logger() {
            map=new HashMap<>();
        }

        /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
         If this method returns false, the message will not be printed.
         The timestamp is in seconds granularity. */
        public boolean shouldPrintMessage(int timestamp, String message) {
            int tmp=map.getOrDefault(message,-1);
            if (tmp == -1) {
                map.put(message,timestamp);
                return true;
            } else if (tmp+10<=timestamp){
                map.put(message,timestamp);
                return true;
            } else {
                return false;
            }
        }
    }

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
}
