public class SuperArray{
  private String [] data;
  private int size;
  public SuperArray() {
    data = new String[10];
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean add(String element){
    data[size+1] = element;
    return true;
  }
public String get(int index){
  return data[index];
  }
  public String set(int index, String element){
    String a = "";
    a += data[index];
    data[index] = element;
    return a;
  }
}
