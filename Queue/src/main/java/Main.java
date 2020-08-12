/* By Paniș Iulian
 * created on 8/12/2020
 */

import java.util.LinkedList;
import java.util.Queue;

    class Main {

        public static void main(String[] args) {

            // Adding items to the new queue
            Queue<Integer> qu = new LinkedList<Integer>();
            qu.add(-14);
            qu.add(8);
            qu.add(-22);
            qu.add(-5);
            qu.add(11);
            qu.add(25);
            qu.add(5);
            qu.add(3);

            // Sorting the queue
            QueueCollection.sortQueue(qu);

            // Display the sorted queue
            System.out.print("\nSorted queue: ");
            while (!qu.isEmpty()) {
                System.out.print(qu.peek() + " ");
                qu.poll();
            }
        }
    }



