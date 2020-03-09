public class Student extends Person {
    private Section[] sections = new Section[10];
    private int grade;
    private int sectionCount = 0;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }
    public String buildSections(){
        String o = "";

        for(int i = 0; i <sectionCount; i++){
            o += sections[i].getName() + " ";
        }
        return o;
    }

    public void addSection(Section k){
        sections[sectionCount] = k;
        sectionCount++;
    }

    public Section[] getSections() {
        return sections;
    }

    public void setSections(Section[] sections) {
        this.sections = sections;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }

    public String toString4(){
        return(this.getName() + " is in " + this.grade + "th grade and is enrolled in the following sections: " + buildSections() + this.getName());
    }
}
