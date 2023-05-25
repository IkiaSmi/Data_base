package List;

public class LinkedListImpl implements LinkedListInt  {
    private LinkedListNode head;
    private LinkedListNode tail;
    private Integer count = 0;


    public LinkedListNode getNodeAtIndex(Integer index){
        LinkedListNode el = head;
        for (int i = 1; i<index; i++)
            el=el.next;
        return el;
    }

    public LinkedListImpl(){
        System.out.println("Список создан.");
    }

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
        if (index==1)
            addFirstElement(element);
        else if (index==count+1)
            addLastElement(element);
        else {
            count++;
            LinkedListNode node = new LinkedListNode(element);
            LinkedListNode el1 = getNodeAtIndex(index-1);
            LinkedListNode el2 = getNodeAtIndex(index);
            el1.setNextLink(node);
            node.setPrevLink(el1);
            el2.setPrevLink(node);
            node.setNextLink(el2);
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
        if (index==1)
            removeFirstElement();
        else if (index==count+1)
            removeLastElement();
        else {
            count--;
            LinkedListNode el1 = getNodeAtIndex(index-1);
            LinkedListNode el2 = getNodeAtIndex(index+1);
            el1.setNextLink(el2);
            el2.setPrevLink(el1);
        }
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
