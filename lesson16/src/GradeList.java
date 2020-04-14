public class GradeList
{
  private Grade[] grades;
  public GradeList(int gradesNr){
    grades = new Grade[gradesNr];
  }
  public int getGradesNr(){
    return grades.length;
  }
  public Grade getGrade(int index){
    return grades[index];
  }
  public Grade[] getGrades(){
    return grades;
  }
  public void setGrade(int index, Grade grade){
    grades[index]=grade;
  }
  public int[] getGradesArray(){
    int[] arr = new int[grades.length];
    for(int i=0;i<grades.length;i++){
      arr[i]=grades[i].getGrade();
    }
    return arr;
  }
  public double getAverage(){
    return Array.average(getGradesArray());
  }

  @Override public String toString()
  {
    return "Array"+Array.arrayToString(grades);
  }

  public boolean equals(Object object){
    if(object instanceof GradeList){
      GradeList obj = (GradeList)object;
      boolean equals = true;
      for(int i=0;i<obj.getGradesNr();i++){
        if(!obj.getGrade(i).equals(grades[i])){
          equals = false;
        }
      }
      return equals;
    }else return false;
  }
  public static void main(String[] args)
  {
    Grade sdj = new Grade("sdj",12);
    Grade sdj1 = new Grade("sdj1",10);
    GradeList Daniel = new GradeList(1);
    GradeList Dimitrian = new GradeList(1);
    Dimitrian.setGrade(0,sdj);
    Daniel.setGrade(0,sdj1);
    System.out.println(Daniel.equals(Dimitrian));

  }
}
