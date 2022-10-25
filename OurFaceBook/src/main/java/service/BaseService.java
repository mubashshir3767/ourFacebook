package service;

public interface BaseService {
    boolean add();
    boolean edit(int id);
    boolean delete(int id);
    Object getById(int id);
}
