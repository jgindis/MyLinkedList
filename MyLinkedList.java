public class MyLinkedList {

  private int size;
  private Node start, end;

  public MyLinkedList() {
    size = 0;
  }

  public int size() {
    return size;
  }

  private Node getNthNode(int n) {
    Node current = start;
    if (n < 0 || n > this.size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    for (int i = 0; i < n; i++) {
      current = current.getNext();
      }
   return current;
  }

  public boolean add(String value) {
    if (size == 0) {
      start = new Node(value);
      end = start;
      size = 1;
      return true;
    }
    else {
      Node newnode = new Node(value);
      end.setNext(newnode);
      newnode.setPrev(end);
      end = newnode;
      size++;
      return true;
    }
  }

  public void add(int index, String value) {
     Node newnode = new Node(value);
    if (size == 0) {
      start = newnode;
      end = start;
      size = 1;
    }
   else if (index == 0) {
     newnode.setNext(start);
     start.setPrev(newnode);
     start = newnode;
     size ++;
   }
   else if (index == size) {
     end.setNext(newnode);
     newnode.setPrev(end);
     end = newnode;
     size ++;
   }
   else {
     Node indexnode = getNthNode(index);
     indexnode.getPrev().setNext(newnode);
     newnode.setPrev(indexnode.getPrev());
     newnode.setNext(indexnode);
     indexnode.setPrev(newnode);
     size++;
   }
  }

  public String get(int index){
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    return getNthNode(index).getData();
  }

  public String set(int index, String value){
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    Node oldnode = getNthNode(index);
    getNthNode(index).setData(value);
    return oldnode.getData();
  }

  public String toString() {
    Node current = start;
    String output = "[";
    while (current != null) {
      output += current.getData();
      current = current.getNext();
      if (current != null) {
        output += ", ";
      }
    }
    output += "]";
    return output;
  }

  public String toStringReversed() {
    Node current = end;
    String output = "[";
    while (current != null) {
      output += current.getData();
      current = current.getPrev();
      if (current != null) {
        output += ", ";
      }
    }
    output += "]";
    return output;
  }
 }

}
