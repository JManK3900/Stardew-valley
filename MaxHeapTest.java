

public class MaxHeapTest {

    //Tests empty heap
    public static void testEmpty(){
      MaxHeap emptyheap = new MaxHeap();
      System.out.println(emptyheap.isEmpty());
    }

    //Tests heap with one element
    public static void testOneElement(){
      Task heapOneTask = new Task(1,10,5,TaskInterface.TaskType.MINING,"Going Minning");
      Task[] temp = new Task[1];
      temp[1] = heapOneTask;
      MaxHeap heapOne = new MaxHeap(temp);
      System.out.println(heapOne.isEmpty());
    }

    //Tests heap insert with 2 elements
    public static void testInsert(){
      Task heapOneTask = new Task(1,10,5,TaskInterface.TaskType.MINING,"Going Minning");
      Task[] temp = new Task[2];
      temp[1] = heapOneTask;
      MaxHeap heapOne = new MaxHeap(temp);
      Task heapTwo = new Task(2,20,20,TaskInterface.TaskType.FISHING,"Going Fishing");
      try {
        heapOne.insert(heapTwo);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println(heapOne.toString());
    }

    //Tests ExtractMax
    public static void testExtractMax(){
      Task heapTreeTask = new Task(3,20,10,TaskInterface.TaskType.FEEDING,"Going Feeding");
      Task heapFourTask = new Task(1,2,30,TaskInterface.TaskType.FORAGING,"Going Foraging");
      Task heapFiveTask = new Task(2,10,50,TaskInterface.TaskType.SOCIALIZING,"Gone Socializing");
      Task[] temp2 = new Task[3];
      temp2[1] = heapTreeTask;
      MaxHeap heapTree = new MaxHeap(temp2);
      try {
        heapTree.insert(heapFourTask);
        heapTree.insert(heapFiveTask);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
  
      try {
        System.out.println("Value 1: " + heapTree.extractMax());
        System.out.println("Value 1: " + heapTree.extractMax());
        System.out.println("Value 1: " + heapTree.extractMax());
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

    //Test increaseKey
    public static void testIncreaseKey(){
      Task heapOneTask = new Task(1,10,5,TaskInterface.TaskType.MINING,"Going Minning");
      Task[] temp = new Task[2];
      temp[1] = heapOneTask;
      MaxHeap heapOne = new MaxHeap(temp);
      Task heapTwo = new Task(2,20,20,TaskInterface.TaskType.FISHING,"Going Fishing");
      try {
        heapOne.insert(heapTwo);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      try {
        heapOne.increaseKey(1,heapTwo);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      System.out.println(heapOne.toString());
    }

    public static boolean isSorted(Task arr[], int size){
      if(size == 1 || size == 0){
        return true;
      }

      if(arr[size-1].compareTo(arr[size-2]) < 0){
        return false;
      }

      return isSorted(arr, size-1);
    }

    public static void testCheckIfSorted(){
      Task heapTreeTask = new Task(3,20,10,TaskInterface.TaskType.FEEDING,"Going Feeding");
      Task heapFourTask = new Task(1,2,30,TaskInterface.TaskType.FORAGING,"Going Foraging");
      Task heapFiveTask = new Task(2,10,50,TaskInterface.TaskType.SOCIALIZING,"Gone Socializing");
      Task[] temp2 = new Task[3];
      temp2[1] = heapTreeTask;
      MaxHeap heapTree = new MaxHeap(temp2);
      try {
        heapTree.insert(heapFourTask);
        heapTree.insert(heapFiveTask);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println("Is it sorted?: " + isSorted(temp2, 3))
    }
  
    public static void main(String[] args) {
      testEmpty();
      testOneElement();
      testInsert();
      testExtractMax();
      testIncreaseKey();
      testCheckIfSorted();
    }

}
