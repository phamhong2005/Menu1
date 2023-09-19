package manager;

import Model.Student;

import java.util.ArrayList;

public interface Imanager <E>{
    void add(E e);
    void remove(int id);
    void update(int id , E e);
    Student StudentById(int id);
    ArrayList<E> findAll();

    ArrayList<Student> getName(String name);
}
