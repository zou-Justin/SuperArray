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
    data[size] = element;
    if (size == data.length){
      resize();
    }
    return true;
  }
public String get(int index){
  String a = "";
  a += data[index];
  return a;
  }
  public String set(int index, String element){
    String a = "";
    a += data[index];
    data[index] = element;
    return a;
  }
  private void resize(){
    String [] Arg = new String[data.length + 10];
    for (int i = 0 ; i < data.length;i++){
      Arg[i] = data[i];
    }
  }
   String [] Arg = data;
}
