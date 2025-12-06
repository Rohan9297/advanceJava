import java.util.Stack;

public class LargestRectangleArea {
    public static void main(String[] args) {
        int[] heights={2,4};
        System.out.println(largestRectangleArea(heights));
    }
    public static int largestRectangleArea(int[] heights) {


        Stack<Integer> stack=new Stack<>();
        int mx=0;
        int n=heights.length;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){

                int height=heights[stack.pop()];
                int width=stack.isEmpty() ? i:i-stack.peek()-1;
                mx=Math.max(mx,height*width);
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            int height=heights[stack.pop()];
            int width= stack.isEmpty() ? n : n-stack.peek()-1;
            mx=Math.max(mx,height*width);
        }

        return mx;
    }
}
