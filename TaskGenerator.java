public class TaskGenerator implements TaskGeneratorInterface {

  private int energy;

  public TaskGenerator(){
    energy = DEFAULT_ENERGY;
  }

  public TaskGenerator(double probability){
    
  }

  public TaskGenerator(double probability, int seed){

  }

  @Override
  public Task getNewTask(int hourCreated, TaskInterface.TaskType taskType, String taskDescription) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getNewTask'");
  }

  @Override
  public void decrementEnergyStorage(TaskInterface.TaskType taskType) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'decrementEnergyStorage'");
  }

  @Override
  public void resetCurrentEnergyStorage() {
    energy = DEFAULT_ENERGY;
  }

  @Override
  public int getCurrentEnergyStorage() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getCurrentEnergyStorage'");
  }

  @Override
  public void setCurrentEnergyStorage(int newEnergyNum) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setCurrentEnergyStorage'");
  }

  @Override
  public boolean generateTask() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'generateTask'");
  }

  @Override
  public int getUnlucky(Task task, double unluckyProbability) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getUnlucky'");
  }

  public String toString(Task task, Task.TaskType taskType) {
    if(taskType == Task.TaskType.MINING) {
        return "     Mining " + task.getTaskDescription() + " at " + getCurrentEnergyStorage() + " energy points (Priority:" + task.getPriority() +")";
    }
    if(taskType == Task.TaskType.FISHING) {
        return "     Fishing " + task.getTaskDescription() + " at " + getCurrentEnergyStorage() + " energy points (Priority:" + task.getPriority() +")" ;
    }
    if(taskType == Task.TaskType.FARM_MAINTENANCE) {
        return "     Farm Maintenance " + task.getTaskDescription() + " at " + getCurrentEnergyStorage() + " energy points (Priority:" + task.getPriority() +")";
    }
    if(taskType == Task.TaskType.FORAGING) {
        return "     Foraging " + task.getTaskDescription() + " at " + getCurrentEnergyStorage() + " energy points (Priority:" + task.getPriority() +")" ;
    }
    if(taskType == Task.TaskType.FEEDING) {
        return "     Feeding " + task.getTaskDescription() + " at " + getCurrentEnergyStorage() + " energy points (Priority:" + task.getPriority() +")";
    }
    if(taskType == Task.TaskType.SOCIALIZING) {
        return "     Socializing " + task.getTaskDescription() + " at " + getCurrentEnergyStorage() + " energy points (Priority:" + task.getPriority() +")";
    }
    else { return "nothing to see here..."; }
}

  
}
