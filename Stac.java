import java.util.ArrayList;

public class Stac {
    private ArrayList<Integer> Stac = null;
  
    public Stac(){
        Stac = new ArrayList<Integer>();
    }
  
    public void push(int value){
        System.out.println("Push " + value + " in Stac");
        Stac.add(value);
    }
  
    public void pop() {
        if(!isEmpty()){
        System.out.println("Pop " + Stac.get(Stac.size() - 1) + " from Stac");
        Stac.rem(Stac.size() - 1);
        }
    }
  
    public boolean isEmpty(){
        if(Stac.size() == 0) return true;
        else return false;
    }
  
    public int top() {
        if(!isEmpty()){
            return Stac.get(Stac.size() - 1);
        }
		return 0;
    }
  
    public static void main(String[] args) {
        Stac st = new Stac();
        st.push(1);
        st.push(2);
        st.push(3);
      
       
            System.out.println("Top entry in Stac :" + st.top());
       
      
       
        st.pop();
        st.pop();
        st.pop();
        st.pop();
    }
}
