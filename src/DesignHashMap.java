public class DesignHashMap {

    class Node{
        int key;
        int data;
        Node next;

        Node(int key,int data){
            this.key=key;
            this.data=data;
        }
    }

    private Node[] buckets;
    int size;


    DesignHashMap(int size){
        this.size=size;
        this.buckets=new Node[size];

    }


    public int hash(int key){

        return key % size;
    }


    public void put(int key, int data){
        int index=hash(key);

        Node head=buckets[index];

        while(head!=null){

            if(head.key==key){
                head.data=data;
                return;
            }
            head=head.next;
        }

        Node newnode=new Node(key,data);
        newnode.next=buckets[index];
        buckets[index]=newnode;
    }


    public int get(int key) {


        int index = hash(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key == key) {
                System.out.print("key: " + key + "-->");

                return head.data;
            }
            head = head.next;
        }
        return -1;

    }

    public void remove(int key) {

        int index = hash(key);
        Node head = buckets[index];

        if (head.key == key) {
            buckets[index] = head.next;
            return;
        }

        while (head.next != null) {

            if (head.next.key == key) {
                head.next = head.next.next;
                return;
            }

            head = head.next;
        }
    }


    public static void main(String[] args) {
        DesignHashMap map=new DesignHashMap(6);

        map.put(21,150);
        map.put(32,200);
        map.put(34,400);
        map.put(56,540);
        map.put(41,200);


        int result=map.get(21);

        map.remove(21);





        result=map.get(21);

        if(result !=-1){
            System.out.println(" Value: "+result);
        }
        else{
            System.out.println("Invalid key");
        }

    }
}
