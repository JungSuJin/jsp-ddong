package jsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by imcts on 2016. 10. 16..
 */

class Compare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRank().compareTo(o2.getRank());
    }
}

public class DataBean {
    private List<Student> studentList;

    public List<Student> getRankingOrder() {


        for(int i = 0, len = this.studentList.size(); i < len; i++) {

            Student prevStudent = this.studentList.get(i);

            for(int j = 0; j < len; j++) {
                Student nextStudent = this.studentList.get(j);

                if(prevStudent.getAvg() < nextStudent.getAvg()) {
                    prevStudent.setRank(
                            prevStudent.getRank() + 1
                    );
                }

            }

        }

        Collections.sort(this.studentList, new Compare());

        return this.studentList;
    }


    public void testConvert(String [] names, String [] genders, String [] kor, String [] eng, String [] math) {
        this.studentList = new ArrayList<>();
        for(int i = 0, len = names.length; i < len; i++) {
            this.studentList.add(
                    new Student(
                            names[i],
                            genders[i] == null ? "" : genders[i],
                            Integer.parseInt(kor[i] == null ? "0" : kor[i]),
                            Integer.parseInt(eng[i] == null ? "0" : eng[i]),
                            Integer.parseInt(math[i] == null ? "0" : math[i])
                    )
            );
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
