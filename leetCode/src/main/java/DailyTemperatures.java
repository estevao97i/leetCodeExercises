import java.util.*;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {

        int[] ans = new int[temperatures.length];

        //initialize the stack
        Stack<Integer> st = new Stack<>();

        //traverse
        for(int currDay = 0;currDay<temperatures.length;currDay++){
            /*while stack is not become empty and while we didn't found
            a lower temperature*/
            while(!st.isEmpty() &&
                    temperatures[currDay]>temperatures[st.peek()]){
                int prevDay = st.pop();
                ans[prevDay] = currDay-prevDay;
            }
            //add to stack
            st.add(currDay);
        }
        return ans;
    }
//        int[] ans = new int[temperatures.length];
//        ArrayList al=new ArrayList<>();
//        Stack stack = new Stack();
//        al.add(0);
//        int n = temperatures.length;
//
//        for (int i = 0; i < temperatures.length; i++) {
//            while (temperatures[i] < temperatures[stack.get(stack.size() - 1)]) {
//
//
//            }


//            if (temperatures[i] <= temperatures[stack.get(stack.size() - 1)]) {
//                stack.add(i);
//                System.out.println(stack);
//            } else {
//                int elem = 0;
//                while (elem < stack.size() - 1) {
//                    if (temperatures[i] > stack.get(elem)) {
//                        ans[i] = i - stack.get(elem);
//                    }
//                    elem++;
//                }
//            }
//        return ans;

            public static void main (String[] args){
                int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
                System.out.println(Arrays.toString(dailyTemperatures(arr)));
//        dailyTemperatures(arr);
            }
        }
