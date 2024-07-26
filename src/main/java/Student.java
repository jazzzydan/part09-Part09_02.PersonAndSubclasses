public class Student extends Person {
    private int studyCredits;

    public Student(String name, String address) {
        super(name, address);
        this.studyCredits = 0;
    }

    public int credits() {
        return this.studyCredits;
    }

    public void study() {
        this.studyCredits++;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n  Study credits " + this.studyCredits;
    }

}
