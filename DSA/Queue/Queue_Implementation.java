class Queue{
    int[] queue;
    int rear = -1;
    int size;
    Queue(int size){
        queue = new int[size];
        this.size = size;
    }
}

class Queue_Implementation {
    public static Queue enqueue(Queue q, int n){
        if(q.rear==q.size-1)
            return q;
        q.queue[++q.rear] = n;
        return q;
    }
    public static boolean isEmpty(Queue q){
        return q.rear==-1;
    }
    public static int dequeue(Queue q){
        int front = q.queue[0];
        for(int i = 0; i<q.size-1; i++)
            q.queue[i] = q.queue[i+1];
        q.rear--;
        return front;
    }
    public static int peek(Queue q){
        return q.queue[0];
    }
    public static void main(String[] args) {
        // Write your code here
        Queue q = new Queue(5);
        int[] arr = {1,2,3,4,5};
        for(int i: arr)
            q = enqueue(q, i);
        System.out.println(isEmpty(q));
    }
}
