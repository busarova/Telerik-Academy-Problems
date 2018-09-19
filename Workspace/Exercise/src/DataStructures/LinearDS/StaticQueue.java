package DataStructures.LinearDS;

import java.util.Arrays;

public class StaticQueue {

        int capacity, head, tail;
        int[] data;

        public StaticQueue() {
            capacity = 10;
            head = -1;
            tail = -1;
            data = new int[capacity];
        }

        public boolean isEmpty() {
            return head == tail;
        }

        public void enqueue(int x) {

            tail++;

            if (isEmpty()){

                head++;
            }

            if (tail == capacity) {
                resizeData();
            }
            data[tail] = x;
        }

        public int dequeue() throws EmptyQueueException {

            if (isEmpty()) {
                throw new EmptyQueueException("Queue is empty.");
            }

            int result = data[head];
            head++;
            return result;
        }

        public int peek() throws EmptyQueueException {
            if (isEmpty()) {
                throw new EmptyQueueException("Queue is empty.");
            }
            return data[head];
        }

        private void resizeData() {

            data = Arrays.copyOf(data, data.length * 2);

        }

    }
