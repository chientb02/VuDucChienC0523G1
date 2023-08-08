package service.ipl;

import model.SortDown;
import model.SortUp;
import model.Student;
import service.IStudentManage;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManagement implements IStudentManage<Student> {
    private List <Student>  studentList ;
    private Scanner sc ;
    private String PATH ;

    public StudentManagement( Scanner sc) {
        this.sc = sc;
        studentList = new ArrayList<>() ;
        PATH = "C:\\Users\\min\\IdeaProjects\\thucHanh\\src\\io\\listStudent.csv" ;
    }

    @Override
    public void display() {
        for (int i = 0; i < studentList.size();) {
            System.out.print(i+1 + ": ");
            System.out.println(studentList.get(i));
            if (sc.nextLine().equals("")){
                i++;
            }
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập mã sinh viên");
        String newCodeStudent = sc.nextLine();
        System.out.println("Nhập họ và tên");
        String newFullName = sc.nextLine();
        Integer newage;
        System.out.println("Nhập tuổi");
        try {
             newage = Integer.parseInt(sc.nextLine());
        }catch (Exception e) {
            System.out.println("tuổi phải là số nguyên vui lòng nhập lại");
             newage = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhập giới tính");
        String newGender = sc.nextLine();
        System.out.println("Nhập địa chỉ");
        String newAddress = sc.nextLine();
        System.out.println("Nhập điểm trung bình");
        double newAverageScore;
        try {
             newAverageScore = Double.parseDouble(sc.nextLine());
        }catch (Exception e) {
            System.out.println("tuổi phải là số nguyên vui lòng nhập lại");
             newAverageScore = Double.parseDouble(sc.nextLine());
        }
        studentList.add(new Student(newCodeStudent,newFullName,newage,newGender,newAddress,newAverageScore));
        System.out.println("Đã thêm thành công");

    }

    @Override
    public void update() {
        System.out.println("Nhập mã sinh viên cần sửa");
        String codeStudent = sc.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getCodeStudent().equals(codeStudent)){
                System.out.println("Nhập thông tin muốn sửa");
                System.out.println("1 . Mã sinh viên");
                System.out.println("2 . Họ tên");
                System.out.println("3 . Tuổi");
                System.out.println("4 . Giới tính");
                System.out.println("5 . Địa chỉ");
                System.out.println("6 . Điểm trung bình");
                System.out.println("7 . Sửa tất cả");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Nhập mã sinh viên");
                        String newCodeStudent = sc.nextLine();
                        studentList.get(i).setCodeStudent(newCodeStudent);
                        break ;
                    case 2 :
                        System.out.println("Nhập họ và tên");
                        String newFullName = sc.nextLine();
                        studentList.get(i).setFullName(newFullName);
                        break ;
                    case 3 :
                        Integer newAge;
                        System.out.println("Nhập tuổi");
                        try {
                            newAge = Integer.parseInt(sc.nextLine());
                        }catch (Exception e) {
                            System.out.println("tuổi phải là số nguyên vui lòng nhập lại");
                            newAge = Integer.parseInt(sc.nextLine());
                        }
                        studentList.get(i).setAge(newAge);
                        break;
                    case 4 :
                        System.out.println("Nhập giới tính");
                        String newGender = sc.nextLine();
                        studentList.get(i).setGender(newGender);
                        break;
                    case 5 :
                        System.out.println("Nhập địa chỉ");
                        String newAddress = sc.nextLine();
                        studentList.get(i).setAddress(newAddress);
                        break;
                    case 6 :
                        System.out.println("Nhập điểm trung bình");
                        double newAverageScore;
                        try {
                            newAverageScore = Double.parseDouble(sc.nextLine());
                        }catch (Exception e) {
                            System.out.println("tuổi phải là số nguyên vui lòng nhập lại");
                            newAverageScore = Double.parseDouble(sc.nextLine());
                        }
                        studentList.get(i).setAverageScore(newAverageScore);
                        break ;
                    case 7 :
                        System.out.println("Nhập mã sinh viên");
                        String newCodeStudentUpdate = sc.nextLine();
                        studentList.get(i).setCodeStudent(newCodeStudentUpdate);
                        System.out.println("Nhập họ và tên");
                        String newFullNameUpdate = sc.nextLine();
                        studentList.get(i).setFullName(newFullNameUpdate);
                        Integer newAgeUpdate;
                        System.out.println("Nhập tuổi");
                        try {
                            newAgeUpdate = Integer.parseInt(sc.nextLine());
                        }catch (Exception e) {
                            System.out.println("tuổi phải là số nguyên vui lòng nhập lại");
                            newAgeUpdate = Integer.parseInt(sc.nextLine());
                        }
                        studentList.get(i).setAge(newAgeUpdate);
                        System.out.println("Nhập giới tính");
                        String newGenderUpdate = sc.nextLine();
                        studentList.get(i).setGender(newGenderUpdate);
                        System.out.println("Nhập địa chỉ");
                        String newAddressUpdate = sc.nextLine();
                        studentList.get(i).setAddress(newAddressUpdate);
                        System.out.println("Nhập điểm trung bình");
                        double newAverageScoreUpdate;
                        try {
                            newAverageScoreUpdate = Double.parseDouble(sc.nextLine());
                        }catch (Exception e) {
                            System.out.println("tuổi phải là số nguyên vui lòng nhập lại");
                            newAverageScoreUpdate = Double.parseDouble(sc.nextLine());
                        }
                        studentList.get(i).setAverageScore(newAverageScoreUpdate);
                        break ;

                }
                return ;
            }
        }
            System.out.println("Không có mã sinh viên vừa nhập");
    }

    @Override
    public void delete() {
        System.out.println("Nhập mã sinh viên cần xóa");
        String codeStudent = sc.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getCodeStudent().equals(codeStudent)){
                System.out.println("Nhập Y để xác nhận xóa");
                if (sc.nextLine().equals("Y")){
                    studentList.remove(i);
                    System.out.println("Xóa thành công");
                }
                return;
            }
        }
            System.out.println("Không có mã sinh viên vừa nhập");

    }

    @Override
    public void arrange() {
        List <Student> students = studentList;
        System.out.println("------Sắp xếp sinh viên theo điểm trung bình ------------");
        System.out.println("Chọn chức năng theo số để tiếp tục");
        System.out.println("1. Sắp xếp điểm trung bình tăng dần");
        System.out.println("2. Sắp xếp điểm trung bình giảm dần");
        System.out.println("3. Thoát");
        System.out.println("Chọn chức năng");
         int choice = Integer.parseInt(sc.nextLine());
         switch (choice) {
             case 1 :
                 Collections.sort(students ,new SortUp());
                 for (int i = 0; i < students.size(); i++) {
                     System.out.println(i+1 + ": ");
                     System.out.println(students.get(i));
                 }
                 break;
             case 2 :
                 Collections.sort(students ,new SortDown());
                 for (int i = 0; i < students.size(); i++) {
                     System.out.println(i+1 + ": ");
                     System.out.println(students.get(i));
                 }
                 break ;
         }
     }

    @Override
    public List<Student> read() {
        List <Student> Student = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            String headLine = reader.readLine();
            String line ;
            while ((line = reader.readLine())!= null){
                String [] data = line.split(",");
                 String codeStudent = data [0] ;
                 String fullName = data [1] ;
                 int age = Integer.parseInt(data[2]) ;
                 String gender = data[3] ;
                 String address = data [4] ;
                 double averageScore = Double.parseDouble(data[5]) ;
                 Student.add(new Student(codeStudent,fullName,age,gender,address,averageScore));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
       return Student ;
    }

    @Override
    public void write(List<Student> list) {
        try (FileWriter fileWriter = new FileWriter(PATH)){
            fileWriter.append("Mã sinh viên , Họ tên , Tuổi ,Giới tính , Địa chỉ ,Điểm trung bình \n");
            for (Student student :
                    studentList) {
                fileWriter.append(student.getCodeStudent()).append(",").append(student.getFullName()).append(",").append(student.getAge()+"").append(",").append(student.getGender()).append(",").append(student.getAddress()).append(",").append(student.getAverageScore()+ "").append("\n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void writeToFile() {
        System.out.println("Bạn có muốn cập nhật lại File");
        System.out.println("Nhấn Y để xác nhận cập nhật File");
        System.out.println("Nhấn phím bất kì để quay lại");
        if(sc.nextLine().equals("Y")){
            write(studentList);
            System.out.println("Cập nhật thành công");
            display();
        }
    }

    @Override
    public void readToFile() {
        System.err.println("Cảnh báo đọc File :");
        System.err.println("toàn bộ danh sách sinh viên đang có trong bộ nhớ sẽ bị xóa");
        System.out.println("Nhấn Y để xác nhận đọc File");
        System.out.println("Nhấn phím bất kì để quay lại");
        if(sc.nextLine().equals("Y")){
            studentList= read();
            System.out.println("Đọc thành công");
            display();
        }
    }

}
