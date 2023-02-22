public class Task implements TaskInterface, Comparable {

  private int priority;
  private int time;
  private int simTime;
  private double prob;
  private int seed;


  public Task(int priority, int time, int simTime, double prob, int seed){
    this.priority = priority;
    this.time = time;
    this.simTime = simTime;
    this. prob = prob;
    this.seed = seed;
  }

  //checks priority of tasks, what do I return/not return?
  public void checkTask(int priority2, int time2){
    if(priority>priority2){
      
    }
    else if(priority1<priority2){

    }
    else {
      if(time<time2){

      }

    }
  }
}
