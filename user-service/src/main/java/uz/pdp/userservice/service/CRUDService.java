package uz.pdp.userservice.service;

import java.util.List;

public interface CRUDService<T> {

    Long add(T t);

    T get(Long id);

    List<T> getAll();

    int delete(T t);

}
