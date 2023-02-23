public class MaxHeap {
  
  protected Task[] tasks;
  protected int size;

  public MaxHeap(){
    size = 0;
  }

  public MaxHeap(Task arr[]){
    // int this.arr[] = arr; //actual array
    // int this.n; // specific root
    // int this.i; // size
    size = arr.length-1;
    tasks = arr;
    buildMaxHeap();
  }

  private void heapify(int i){
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if(left<size && this.tasks[left].compareTo(this.tasks[largest]) < 0){
      largest = left;
    }

    if(right<size && this.tasks[right].compareTo(this.tasks[largest]) > 0){
      largest = right;
    }

    if(largest != i){
      Task swap = tasks[i];
      tasks[i] = tasks[largest];
      tasks[largest] = swap;

      heapify(largest);
    }
  }

  public Task max() throws Exception{
    if(size<1){
      throw new Exception("Heap underflow");
    }
    return tasks[0];
  }

  public Task extractMax() throws Exception{
    Task max = max();
    tasks[1] = tasks[size];
    size = size-1;
    heapify(1);
    return max;
  }

  public void insert(int x) throws Exception{ //fix or rewrite insert so line 63 works
    if(size == x){
      throw new Exception("heap overflow");
    }
    size = size+1;
    //k = x.key;
    //x.key = -infinity//Integer.MIN_VALUE, for example
    tasks[size-1] = x;
  }

  public int increaseKey(int position, Task tasks) throws Exception{ //fix the getPriority as well as compareTo
      if(this.tasks[position].compareTo(tasks) < 0){
        throw new Exception("new key must be larger than current key");
      }
      tasks.setPriority(this.tasks[position].getPriority());
      int i = 
      while()
  }

  public boolean isEmpty(){
    if(tasks.length < 1){
      return true;
    }
    return false;
  }

  private void buildMaxHeap(){
    for(int i = size / 2 -1; i>=0; i--){
      heapify(i);
    }
  }
}
