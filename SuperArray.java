public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }
  public SuperArray(int InitialCapacity){
    data = new String[InitialCapacity];
  }
  public int size(){
    return size;
  }
  public void clear(){
    data = new String[10];
    size = 0;
  }
  public boolean add(String element){
    if (size >= data.length){
      resize();
    }
    data[size] = element;
    size++;
    return true;
  }
public String get(int index){
  return data[index];
  }
  public String set(int index, String element){
    String a = data[index];
    data[index] = element;
    return a;
  }
  public boolean isEmpty(){
    if (size == 0){
      return true;
    }
    return false;
  }
  public String toString(){
    String temp = "";
     for (int i = 0; i < size;i++){
       if (i == size-1){
         temp += data[i];
       }
        else{temp += data[i] + ", ";}
     }
     return ("[" + temp + "]");
   }
public boolean contains(String s){
  for (int i = 0; i < size;i++){
  if (data[i].equals(s)){
    return true;
    }
  }
  return false;
}
  private void resize(){
    String[] Arg = new String[data.length * 2];
    for (int i = 0 ; i < data.length;i++){
      Arg[i] = data[i];
    }
     data = Arg;
  }
  public void add(int index, String element){
    int newIndex = index;
    for (int i = index; i < size - newIndex;i++){
       data[newIndex - 1] = data[newIndex]  ;
      newIndex++;
    }
    data[index] = element;
  }
}
