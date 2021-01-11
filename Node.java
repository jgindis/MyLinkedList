public class Node {
  public Node(String value){
     data = value;
     next = null;
     prev = null;
   }
   private String data;
   private Node next,prev;

   public String getData() {
     return data;
   }

   public Node getNext() {
     return next;
   }

   public Node getPrev() {
     return prev;
   }

   public void setData(String newvalue) {
     data = newvalue;
   }

   public void setNext(Node newnext) {
     next = newnext;
  }

  public void setPrev(Node newprev) {
    prev = newprev;
  }


}
