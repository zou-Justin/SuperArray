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
      if (a.contains(b.get(i))){
        c.add(b.get(i));
    }
  }
 removeDuplicates(c);
 return c;
}
public static SuperArray zip(SuperArray a, SuperArray b){
  SuperArray d = new SuperArray(a.size() + b.size());
  for (int i = 0;i < Math.min(a.size(),b.size()); i++){
    d.add(a.get(i));
    d.add(b.get(i));
  }
  for (int i = Math.min(a.size(),b.size());i < Math.max(a.size(),b.size()); i++){
    if (a.size()> b.size())
      {d.add(a.get(i));}
    else if (b.size()>a.size()){
      d.add(b.get(i));
    }
  }
  return d;
}
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    SuperArray words2 = new SuperArray();
    words.add("a");
    words.add("b");
    words.add("c");
    words.add("d");
    words2.add("1");
    words2.add("2");
    words2.add("3");
    words2.add("4");
    words2.add("5");
    System.out.println(words);
    System.out.println(zip(words,words2));
    removeDuplicates(words);
    System.out.println(words);
  }
}
