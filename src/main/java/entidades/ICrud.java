/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;


/**
 *
 * @author rolan
 */
public interface ICrud <T>{
    public boolean agregar(T t);
    public boolean editar(T t);
    public List<T> listar();
    public T get(T t);
}
