package service.ipl;

import model.Student;
import service.IStudentManage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement implements IStudentManage<Student> {
    private List <Student>  studentList = new ArrayList<>();
    private Scanner sc ;
    private String PATH = "C:\\Users\\min\\IdeaProjects\\thucHanh\\src\\io\\listStudent.csv";

    public StudentManagement( Scanner sc) {
        this.sc = sc;
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
        System.out.println("------Sắp xếp sinh viên theo điểm trung bình ------------");
        System.out.println("Chọn chức năng theo số để tiếp tục");
        System.out.println("1. Sắp xếp điểm trung bình tăng dần");
        System.out.println("2. Sắp xếp điểm trung bình giảm dần");
        System.out.println("3. Thoát");
        System.out.println("Chọn chức năng");
         int choice = Integer.parseInt(sc.nextLine());
         switch (choice) {
             case 1 :

         }
     }

    @Override
    public List<Student> read() {

        return null;
    }

    @Override
    public void write(List<Student> list) {
        try{
            File file = new File(PATH);
            FileInputStream fileInputStream =new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
             objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
