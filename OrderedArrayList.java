public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T element){
    for(int i=0;i<size();i++)
    {
      if(i==0 && (element.compareTo(get(i))<=0))
      {
        super.add(i,element);
        break;
      }
      if((element.compareTo(get(i))<=0) && (element.compareTo(get(i-1))>=0))
      {
        super.add(i,element);
        break;
      }
      else
      {
        super.add(element);
        break;
      }
    }
    if(size()==0)
    {
      super.add(element);
    }
    return true;
  }

  public void add(int index,T element){
    if((index==0||get(index-1).compareTo(element)<=0)&&(index==size()||get(index+1).compareTo(element)>=0))
    {
      super.add(index,element);
    }
    else
    {
      super.add(element);
    }
  }

  public T set(int index,T element){
    T originalelement=element;
    super.remove(index);
    add(index,element);
    return originalelement;
  }

}
