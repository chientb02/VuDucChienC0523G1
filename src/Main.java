import service.ipl.StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        StudentManagement studentManagement = new StudentManagement(sc);
        int choice = 0 ;
        do {
            System.out.println(" --------CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN");
            System.out.println("--- Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa ");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            System.out.println("Chọn chức năng :");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 :
                    studentManagement.display();
                    break;
                case 2 :
                    studentManagement.add();
                    break ;
                case 3 :
                    studentManagement.update();
                    break ;
                case 4 :
                    studentManagement.delete();
                    break;
                case 5 :
                    studentManagement.arrange();
                    break ;
                case 6 :
                    studentManagement.readToFile();
                    break ;
                case 7:
                    studentManagement.writeToFile();
                    break ;
            }
        }while (choice!=0);

        }
    }
