/* By Paniș Iulian
 * created on 8/12/2020
 */

class QueueCollection {
    //method for exchanging elements
    private static void switchPosition(java.util.Queue<Integer> q, int size) {
        // until the condition is false
        if (size <= 0)
            return;

        // extracting the first element and placing it at the end
        q.add(q.peek());
        q.remove();

        // recursive call to this method
        switchPosition(q, size - 1);
    }

    // method for inserting the item in the queue
    private static void insertQueue(java.util.Queue<Integer> q, int temp, int size) {

        // method will be performed until the condition will be false
        if (q.isEmpty() || size == 0) {
            q.add(temp);

        }


        //if the current element is bigger, it is added to the front
        else if (temp >= q.peek()) {
            q.add(temp);
            switchPosition(q, size);
        } else {

            // adding the item to the end of the queue
            q.add(q.peek());
            q.remove();

            // recursive call for queue
            insertQueue(q, temp, size - 1);
        }
    }

    // method for sorting the queue
    static void sortQueue(java.util.Queue<Integer> q) {

        // until the condition is false
        if (q.isEmpty())
            return;

        // selecting the last item
        int temp = q.peek();

        // removing the item
        q.remove();

        // recursive call
        sortQueue(q);

        // inserting the selected item in queue
        insertQueue(q, temp, q.size());
    }

}

