import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;

class Pair{
	int val;
	int index;
	Pair(int val,int index){
		this.val=val;
		this.index=index;
	}
}

// Stack Playlist of Aditya Verma
public class CustomStack {
    public static void main(String[] args) {
        // int arr[] = {1, 3, 2, 4, 9, 0, 2, 5};
        // greaterToRight(arr);
        // System.out.println();
        // greaterToRightUsingStack(arr);
        // System.out.println();
        // greaterToLeft(arr);
        // System.out.println();
        // greaterToLeftUsingStack(arr);
        // smallerToLeft(arr);
        // System.out.println();
        // smallerToLeftUsingStack(arr);
        // System.out.println();
        // smallerToRight(arr);
        // System.out.println();
        // smallerToRightUsingStack(arr);
        int arr[] = {100,80,60,70,60,75,85};
        stockSpan(arr);
    }

    // 1st Brute Force
    public static void greaterToLeft(int arr[]){
        System.out.println("Greater to left...");
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=arr.length-1; i>=0; i--){
            boolean flag = false;
            for(int j=i; j>=0; j--){
                if(arr[j] > arr[i]){
                    ans.add(arr[j]);
                    flag = true;
                    break;
                }
            }
            if(!flag)ans.add(-1);
        }
        Collections.reverse(ans);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }

    // 2nd Brute Force
    public static void greaterToRight(int arr[]){
        System.out.println("Greater to Right...");
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for(int j=i; j<arr.length; j++){
                if(arr[j] > arr[i]){
                    flag = true;
                    ans.add(arr[j]);
                    break;
                }
            }
            if(!flag)ans.add(-1);
        }

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
     
    // 3rd Using Stack
    public static void greaterToRightUsingStack(int arr[]){
        System.out.println("Greater to right using Stack...");
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<Integer>();
        for(int i=arr.length-1; i>=0; i--){
            if(st.isEmpty())ans.add(-1);
            else if(st.size()>0 && st.peek() > arr[i])ans.add(st.peek());
            else if(st.size()>0 && st.peek() <= arr[i]){
                while(st.size() > 0 && st.peek() <= arr[i]){
                    st.pop();
                }
                if(st.isEmpty())ans.add(-1);
                else ans.add(st.peek());
            }
            st.push(arr[i]);
        }
        Collections.reverse(ans);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }

    // 4th Using Stack
    public static void greaterToLeftUsingStack(int []arr){
        System.out.println("Greater to left using Stack...");
        
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<Integer>();
        // 1, 3, 2, 4
        for(int i=0; i<arr.length; i++){
            if(st.isEmpty())ans.add(-1);
            else if(st.size() > 0 && st.peek() > arr[i])ans.add(st.peek());
            else if(st.size() > 0 && st.peek() <= arr[i]){
                while(st.size() > 0 && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.isEmpty())ans.add(-1);
                else ans.add(st.peek());
            }
            st.push(arr[i]);
        }

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }

    // 5th Brute Force
    public static void smallerToLeft(int arr[]){
        System.out.println("Smaller to left...");

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for(int j=i-1; j>=0; j--){
                if(arr[j]<arr[i]){
                    flag = true;
                    ans.add(arr[j]);
                    break;
                }
            }
            if(!flag)ans.add(-1);
        }

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }

    // 6th Brute Force
    public static void smallerToRight(int arr[]){
        System.out.println("Smaller to right...");

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    flag = true;
                    ans.add(arr[j]);
                    break;
                }
            }
            if(!flag)ans.add(-1);
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(ans.get(i)+" ");
        }
    }

    // 7th Using Stack
    public static void smallerToLeftUsingStack(int arr[]){
        System.out.println("Smaller to left Using Stack...");

        Stack<Integer> st = new Stack<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(st.isEmpty())ans.add(-1);
            else if(st.size() >0 && st.peek() < arr[i])ans.add(st.peek());
            else if(st.size() >0 && st.peek() >= arr[i]){
                while(st.size() >0 && st.peek() >= arr[i]){
                    st.pop();
                }
                if(st.isEmpty())ans.add(-1);
                else ans.add(st.peek());
            }
            st.push(arr[i]);
        }

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }

    // 8th Using Stack
    public static void smallerToRightUsingStack(int arr[]){
        System.out.println("Smaller to right Using Stack...");

        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=arr.length-1; i>=0; i--){
            if(st.isEmpty())ans.add(-1);
            else if(st.size() >0 && st.peek() < arr[i])ans.add(st.peek());
            else if(st.size() >0 && st.peek() >= arr[i]){
                while(st.size() >0 && st.peek() >= arr[i]){
                    st.pop();
                }
                if(st.isEmpty())ans.add(-1);
                else ans.add(st.peek());
            }
            st.push(arr[i]);
        }

        Collections.reverse(ans);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }

    // 9th Stock Span Problem
    public static void stockSpan(int arr[]){
        System.out.println("Stock Span Problem...");
        Stack<Pair> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(st.isEmpty())ans.add(-1);
            else if(st.size() > 0 && st.peek().val > arr[i]) ans.add(st.peek().index);
            else if(st.size() > 0 && st.peek().val <= arr[i]) {
                while(st.size() > 0 && st.peek().val <= arr[i]){
                    st.pop();
                }
                if(st.isEmpty())ans.add(-1);
                else ans.add(st.peek().index);
            }
            st.push(new Pair(arr[i], i));
        }
        for(int i=0; i<ans.size(); i++){
            ans.set(i, i-ans.get(i));
        }
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
