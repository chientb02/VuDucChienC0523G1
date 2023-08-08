package model;

public class Student  {
    String codeStudent ;
    String fullName ;
    int age ;
    String gender ;
    String address ;
    double averageScore ;

    public Student() {
    }

    public Student(String codeStudent, String fullName, int age, String gender, String address, double averageScore) {
        this.codeStudent = codeStudent;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.averageScore = averageScore;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Học sinh{" +
                "Mã sinh viên:'" + codeStudent + '\'' +
                ", Họ tên:'" + fullName + '\'' +
                ", Tuổi:" + age +
                ", Giới tính:'" + gender + '\'' +
                ", Địa chỉ:'" + address + '\'' +
                ", Điểm trung bình:" + averageScore +
                '}';
    }
}
