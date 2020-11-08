public class Demo{
  public static void removeDuplicates(SuperArray s){
    for (int i = 0 ;i < s.size();){
      if (s.indexOf(s.get(i)) != i){
        s.remove(i);
      }
      else{
        i++;
      }
    }
}
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
     words.add("ebi");
     words.add("una");
    words.add("una");
    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
  }
}
