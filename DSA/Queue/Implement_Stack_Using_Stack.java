class Queue{
    int[] queue;
    int front;
    int size;
    Queue(int size){
        queue = new int[size];
        this.size = size;
        this.front = size;
    }
}
class Implement_Stack_Using_Stack {
    //push at top
    public static Queue enqueue(Queue q, int n){
        if(q.front==0)
            return q;
        q.queue[--q.front] = n;
        return q;
    }
    public static boolean isEmpty(Queue q){
        return q.front==q.size;
    }
    //pop from top
    public static int dequeue(Queue q){
        if(q.front==q.size)
            return -1;
        int top = q.queue[q.front--];
        return top;
    }
    public static int peek(Queue q){
        return q.queue[q.front];
    }
    public static void main(String[] args) {
        // Write your code here
        Queue q = new Queue(5);
        int[] arr = {1,2,3,4,5};
        for(int i: arr)
            q = enqueue(q, i);
        System.out.println(dequeue(q));
    }
}
