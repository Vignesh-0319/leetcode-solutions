class Solution {
    public int[] asteroidCollision(int[] as) {

        Stack<Integer> ls = new Stack<>();

        for (int i : as) {

            if (i > 0) {
                ls.push(i);
            }
            else {

                boolean destroyed = false;

                while (!ls.isEmpty() && ls.peek() > 0) {

                    if (ls.peek() < Math.abs(i)) {
                        ls.pop();
                    }
                    else if (ls.peek() == Math.abs(i)) {
                        ls.pop();
                        destroyed = true;
                        break;
                    }
                    else {
                        destroyed = true;
                        break;
                    }
                }

                if (!destroyed) {
                    ls.push(i);
                }
            }
        }

        int[] arr = new int[ls.size()];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = ls.pop();
        }

        return arr;
    }
}