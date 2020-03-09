public class Teacher extends Person {
    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount = 0;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;

    }

    public void addSection(Section k){
        sections[sectionCount] = k;
        sectionCount++;
    }

    public String listOfSections(){
        String listOfSections = "";
        for(int i = 0; i < sectionCount; i++){
            listOfSections += sections[i].getName() + ", ";
        }
        return listOfSections;
    }

    public void setSections(Section[] sections) {
        this.sections = sections;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }

    public String toString3(){
        return(this.getName() + " teaches the following sections: " + this.subject + this.sectionCount);
    }
}
