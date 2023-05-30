package newPackage_name;

public class Queue_Array{

    static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
                return rear == -1;
        }

//        Enqueue
        public static void Add(int data){
            if(rear == size-1) {
                System.out.println("Queue Is Full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

//        Dequeue
        public static int remove(){
            if(isEmpty()) {
                System.out.println("Queue Is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

//        Peek
        public static int Peek(){
            if(isEmpty()) {
                System.out.println("Queue Is Empty");
                return -1;
            }
            return arr[0];
            }
        }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.Add(1);
        q.Add(2);
        q.Add(3);

        while(!q.isEmpty()) {
            System.out.println(q.Peek());
            q.remove();
        }
    }
}





