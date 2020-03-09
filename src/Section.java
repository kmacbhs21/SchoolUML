public class Section {
   private Teacher teacher;
   private Student[] students = new Student[50];
   private String name;
   private int currentSize = 0;

    public Section(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void addStudents(Student s){
        students[currentSize] = s;
        currentSize++;
    }

    public String listOfStudents(){
        String listOfStudents = "";
        for(int i = 0; i < currentSize; i++){
            listOfStudents += students[i].getName() + ", ";
        }
        return listOfStudents;
    }
    public String toString2(){
        return(this.getName() + " is taught by " + teacher.getName() + " and has " + this.getCurrentSize() + " students: " + listOfStudents() );
    }
}
