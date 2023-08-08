package service;

import java.util.List;

public interface IStudentManage <E> {
    void display () ;
    void add () ;
    void update ();
    void delete () ;
    void arrange();
    List<E> read () ;
    void write (List <E> list);
    void writeToFile ();
    void readToFile () ;


}
