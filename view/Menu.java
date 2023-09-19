package view;

import Model.Student;
import manager.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner InputInt = new Scanner(System.in);
    Scanner InputString = new Scanner(System.in);
    StudentManager studentManager = new StudentManager();
    int choice;

    public void showMenuStudent() {

        do {
            System.out.println("===Menu====\n1.Thêm sinh viên mới \n2.Xóa sinh viên\n3.Sửa sinh viên\n4.Tìm kiếm sinh viên theo ID\n5.Hiển thị tất cả sinh viên\n6.Xóa sinh viên\n7.Hiển thị danh sách theo tên gần đúng\n0.Thoát chương trình");
            System.out.println("Nhập tính năng :");
            choice = InputInt.nextInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 3:
                    updatet();
                    break;
                case 4:
                    getStudentByid();
                    break;
                case 5:
                    showAll();
                    break;
                case 6:
                    remove();
                    break;
                case 7:
                    getNameStudent();
                    break;
            }
        }
        while (choice != 0);
    }

    public void add() {
        System.out.println("Nhập tên");
        String name = InputString.nextLine();
        System.out.println("Giới tính");
        String sex = InputString.nextLine();
        System.out.println("Nhập điểm Toán");
        double math = InputInt.nextDouble();
        System.out.println("Nhập điểm Văn");
        double literature = InputInt.nextDouble();
        System.out.println("Nhập điểm Anh");
        double english = InputInt.nextDouble();
        double[] score = {math, literature, english};

        Student student = new Student(name, sex, score);
        studentManager.add(student);
        System.out.println("Thêm thành công");

    }

    public void showAll() {
        System.out.println(studentManager.findAll());
    }

    public void remove() {
        System.out.println("Nhập id muốn xóa");
        int idDelete = InputInt.nextInt();
        studentManager.remove(idDelete);
        System.out.println("Xóa thành công");
    }

    public void updatet() {
        System.out.println("Nhập id muốn sửa");
        int id = InputInt.nextInt();
        System.out.println("Nhập tên");
        String name = InputString.nextLine();
        System.out.println("Giới tính");
        String sex = InputString.nextLine();
        System.out.println("Nhập điểm Toán");
        double math = InputInt.nextDouble();
        System.out.println("Nhập điểm Văn");
        double literature = InputInt.nextDouble();
        System.out.println("Nhập điểm Anh");
        double english = InputInt.nextDouble();
        double[] score = {math, literature, english};
        Student student1 = new Student(id, name, sex, score);
        studentManager.update(id, student1);
        System.out.println("Sửa thành công");
    }

    public void getStudentByid() {
        System.out.println("Nhập id muốn tìm");
        int id = InputInt.nextInt();
        System.out.println(studentManager.StudentById(id));
    }
    public void getNameStudent(){
        System.out.println("Nhập tên gần đúng");
        String name = InputString.nextLine();
        System.out.println(studentManager.getName(name));
    }
}
