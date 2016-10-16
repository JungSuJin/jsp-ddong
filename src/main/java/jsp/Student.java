package jsp;

/**
 * Created by imcts on 2016. 10. 16..
 */
public class Student {
    private String name;
    private String gender;
    private Integer kor;
    private Integer eng;
    private Integer math;
    private Integer sum;
    private Double avg;
    private Integer rank = 1;

    public Student(String name, String gender, Integer kor, Integer eng, Integer math) {
        this.name = name;
        this.gender = gender;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.sum = this.kor + this.eng + this.math;
        this.avg = ((int)((this.sum / 3.0) * 10)) / 10.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getKor() {
        return kor;
    }

    public void setKor(Integer kor) {
        this.kor = kor;
    }

    public Integer getEng() {
        return eng;
    }

    public void setEng(Integer eng) {
        this.eng = eng;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", sum=" + sum +
                ", avg=" + avg +
                ", rank=" + rank +
                '}';
    }
}
