public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T element){
    if(size()==0)
    {
      return super.add(element);
    }
    for(int i=0;i<size();i++)
    {
      if(element.compareTo(get(i))<=0)
      {
        super.add(i,element);
        return true;
      }
      continue;
    }
    return super.add(element);
  }

  public void add(int index,T element){
    add(element);
  }

  public T set(int index,T element){
    T originalelement=element;
    super.remove(index);
    add(index,element);
    return originalelement;
  }

}
