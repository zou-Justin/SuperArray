public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }
  public SuperArray(int InitialCapacity){
    if (InitialCapacity < 0){
      throw new IllegalArgumentException("capacity" + InitialCapacity + "should not be negative");
    }
    data = new String[InitialCapacity];
    size = 0;
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
  if (index < 0 || index >= size){
    throw new IndexOutOfBoundsException("Index should not be greater than size or negative");
  }
  return data[index];
  }
  public String set(int index, String element){
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Index should not be greater than size or negative");
    }
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
public int indexOf(String s){
  for (int i = 0; i < size;i++){
    if (data[i].equals(s)){
      return i;
    }
  }
  return -1;
}
  private void resize(){
    String[] Arg = new String[data.length * 2];
    for (int i = 0 ; i < data.length;i++){
      Arg[i] = data[i];
    }
     data = Arg;
  }
  public void add(int index, String element){
    if (index < 0 || index > size){
      throw new IndexOutOfBoundsException("Index should not be greater than size or negative");
    }
    if (size == data.length){
      resize();
    }
    for (int i = size-1; i >= index;i--){
      data[i + 1] = data[i];
    }
    data[index] = element;
    size++;
  }
  public String[] toArray(){
    String[] newArg = new String[size];
    for (int i = 0 ; i < size;i++){
      newArg[i] = data[i];
    }
    return newArg;
  }
  public int lastIndexOf(String value){
    int lastCount = 0;
    if (isEmpty()){
      return -1;
    }
    for (int i = 0; i < size;i++){
      if (contains(value)){
      if (data[i].equals(value)){
        lastCount = i;
      }
    }
    else {
      return -1;
    }
  }
  return lastCount;
}
  public boolean equals(SuperArray other){
    boolean allEqual = true;
    if (other.size() != size){
      return false;
    }
    for (int i = 0; i < size;i++){
      if (other.data[i].equals(data[i])) {
        allEqual = true;
      }
      else {
        return false;
      }
    }
    return allEqual;
  }
  public String remove(int index){
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Index should not be greater than size or negative");
    }
    String actual = data[index];
    for (int i = index; i < size -1;i++){
      data[i] = data[i+1];
    }
    data[size-1] = null;
    size--;
    return actual;
  }
}
