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
public static SuperArray findOverlap(SuperArray a, SuperArray b){
  if (a.equals(b)){
    removeDuplicates(a);
    return a;
  }
  SuperArray c = new SuperArray(Math.min(a.size(),b.size()));
  for (int i = 0; i < Math.min(a.size(),b.size()); i++){
    if (a.get(i).equals(b.get(i))){
      c.add(b.get(i));
    }
  }
 removeDuplicates(c);
 return c;
}
public static SuperArray zip(SuperArray a, SuperArray b){
  //for (int i = 0;i <)
  return a;
}
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    SuperArray words2 = new SuperArray();
    words.add("kani");   words.add("un1232i");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebai");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    words2.add("kani");   words2.add("uni");     words2.add("ebi");     words2.add("una");
    words2.add("una");    words2.add("ebai");     words2.add("kani");    words2.add("una");
    words2.add("una");    words2.add("ebi");     words2.add("toro");
    System.out.println(words);
    System.out.println(findOverlap(words,words2));
    removeDuplicates(words);
    System.out.println(words);
  }
}
