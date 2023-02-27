import java.util.Arrays;

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

  private int parent(int pos) {
    return (pos-1)/2;
  }

  private int leftChild(int pos) {
    return (2 * pos) + 1;
  }

  private int rightChild(int pos) {
    return (2 * pos) + 2;
  }

  private void swap(int fpos, int spos) {
    Task temp;
    temp = tasks[fpos];
    tasks[fpos] = tasks[spos];
    tasks[spos] = temp;
  }

  private void heapify(int i){
    int largest = parent(i);
    int left = leftChild(i);
    int right = rightChild(i);

    if(left<size && this.tasks[left].compareTo(this.tasks[largest]) < 0){
      largest = left;
    }

    if(right<size && this.tasks[right].compareTo(this.tasks[largest]) > 0){
      largest = right;
    }

    if(largest != i){
      swap(i, largest);
      
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

  public void insert(Task x) throws Exception{
    if(size >= tasks.length){
      Task[] temp = Arrays.copyOf(tasks,size*2);
      tasks = temp;
    }
    tasks[size] = x;

    int current = size;
    while(tasks[current].compareTo(tasks[parent(current)]) > 0) {
      swap(current, parent(current));
      current = parent(current);
    }
  }

  public void increaseKey(int position, Task tasks) throws Exception{
      if(this.tasks[position].compareTo(tasks) < 0){
        throw new Exception("new key must be larger than current key");
      }
      this.tasks[position].setPriority(tasks.getPriority());
      int i = position;
      while(i > 0 && (this.tasks[parent(i)].compareTo(this.tasks[i])) < 0){
        swap(i, parent(i));
        i = parent(i);
      }
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
