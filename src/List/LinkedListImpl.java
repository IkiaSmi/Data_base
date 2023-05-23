package List;

public class LinkedListImpl implements LinkedListInt  {
    LinkedListNode head;
    LinkedListNode tail;
    Integer count = 0;

    public LinkedListImpl(){}

    @Override
    public Integer getSize() {return count;};

    @Override
    public void addLastElement(Integer element) {
        LinkedListNode node = new LinkedListNode(element);
        count++;
        if (count==1){
            head=node;
            tail=node;
        } else {
            tail.setNextLink(node);
            node.setPrevLink(tail);
            tail=node;
        }
    }

    @Override
    public void addFirstElement(Integer element) {
        LinkedListNode node = new LinkedListNode(element);
        count++;
        if(count==1){
            head=node;
            tail=node;
        } else {
            head.setPrevLink(node);
            node.setNextLink(head);
            head=node;
        }
    }

    @Override
    public void addElementAtIndex(Integer element, Integer index) {
        count++;
        if (index==1){addFirstElement(element);}
        else if (index==count-1) {addLastElement(element);}
        else {
            LinkedListNode node = new LinkedListNode(element);

        }
    }

    @Override
    public void removeLastElement() {
        if (count<2){
            count=0;
            head=null;
            tail=null;
        } else {
            count--;
            tail.prev.setNextLink(null);
            tail=tail.prev;
        }
    }

    @Override
    public void removeFirstElement() {
        if (count<2){
            count=0;
            head=null;
            tail=null;
        } else {
            count--;
            head.next.setPrevLink(null);
            head=head.next;
        }
    }

    @Override
    public void removeElementAtIndex(Integer index) {
        count--;
        if (index==1){removeFirstElement();}
        else if (index==count+1) {removeLastElement();}
        else {}
    }

    @Override
    public Integer getElement(Integer index) {
        LinkedListNode value = head;
        for (int i = 1; i<index; i++){
            value=value.next;
        }
        return value.value;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        LinkedListNode current = head;
        sb.append("[");
        while(current !=null){
            if(current.next == null){
                sb.append(current.value.toString());
            } else {
                sb.append(String.format("%s, ", current.value));
            }
            current=current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
