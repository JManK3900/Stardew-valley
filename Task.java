public class Task implements TaskInterface, Comparable<Task> {

  private int priority;
  private int time;
  private int simTime;
  private TaskInterface.TaskType taskType;
  private String description;


  public Task(int priority, int time, int simTime, TaskInterface.TaskType taskType, String description){
    this.priority = priority;
    this.time = time;
    this.simTime = simTime;
    this.taskType = taskType;
    this.description = description;
  }
//use this, not checkTask
  public int compareTo(Task o)
  {
    //checks if priority isn't the same and if it is goes into else if.
    if(o.priority-this.priority !=0){
      return o.priority-this.priority;
    }
    //checks if times are NOT the same and if they arn't returns -1 or 1.
    else{
      if(o.simTime-this.simTime!=0){
        return o.simTime-this.simTime;
      }
      return o.simTime-this.simTime;
    }
  }

  public int getPriority(){
    return this.priority;
  }

  public void setPriority(int priority){
    this.priority = priority;
  }

  public int getTime(){
    return this.time;
  }

  public void setTime(int time){
    this.time = time;
  }
  public int getSimTime(){
    return this.simTime;
  }

  public void setSimTime(int simTime){
    this.simTime = simTime;
  }
  public TaskInterface.TaskType getTaskType(){
    return this.taskType;
  }

  public void setTaskType(TaskInterface.TaskType taskType){
    this.taskType = taskType;
  }
  public String getDescription(){
    return this.description;
  }

  public void setDescription(String description){
    this.description = description;
  }

  public void toString(){
    //print value in a bit
  }
  @Override
  public String getTaskDescription() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getTaskDescription'");
  }
  @Override
  public void incrementWaitingTime() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'incrementWaitingTime'");
  }
  @Override
  public void resetWaitingTime() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'resetWaitingTime'");
  }
  @Override
  public int getWaitingTime() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getWaitingTime'");
  }

}
