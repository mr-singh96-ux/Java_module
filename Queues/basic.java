class Queue{
    int size;
    int[] q;
    int front, rear;

    Queue(int size){
        this.size = size;
        q = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int x){
        if(isFull()){
            System.out.println("Queue Overflow");
            return;
        }
        if(front == -1) front = 0;
        q[++rear] = x;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return -1;
        }
        int item = q[front++];
        if(front > rear) front = rear = -1;
        return item;
    }

    void display(){
        if(isEmpty()){
            System.out.print("Queue is empty");
            return;
        }
        for(int i = front; i <= rear; i++){
            System.out.println(q[i]+" ");
        }
    }
    boolean isEmpty(){
        return front == -1;
    }

    boolean isFull(){
        return rear == size -1;
    }
}

public class basic {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        q.display();
    }
    
}
