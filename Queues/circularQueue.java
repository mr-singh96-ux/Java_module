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
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % size;
        if(front == -1) front = 0;
        q[rear] = x;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        int item = q[front];
        if(front == rear) front = rear = -1;
        else front = (front + 1) % size;

        return item;
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        int  i = front;
        while(true){
            System.out.print(q[i]+" ");
            if(i == rear) break;
            i = (i + 1) % size;
        }
    }

    boolean isEmpty(){
        return front == -1;
    }

    boolean isFull(){
        return front == ((rear + 1) % size);
    }
}

public class circularQueue {
    public static void main(String[] args) {
         Queue q = new Queue(5);
        q.enqueue(100);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Dequeue: " +q.dequeue());
        q.display();
    }
    
}
