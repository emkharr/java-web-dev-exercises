package exercises.chapter4.skool;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    private String title;
    private int credits;
    private String instructor;


    public Course (String title) {
        title = this.title;
    }

    @Override
    public String toString() {
        return title + " is worth " + credits + " credits.";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Course) == false) return false;
        Course courseObj = (Course) obj;

        if(courseObj.title.equals(this.title)) {
            return true;
        } else {
            return false;
        }
    }

    public Course (String title, int credits, String instructor) {
        this.title = title;
        this.credits = credits;
        this.instructor = instructor;
    }
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCredits() {
            return credits;
        }

        public void setCredits(int credits) {
            this.credits = credits;
        }

        public String getInstructor() {
            return instructor;
        }

        public void setInstructor(String instructor) {
            this.instructor = instructor;
        }

}
