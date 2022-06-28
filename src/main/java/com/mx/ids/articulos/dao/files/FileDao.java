package com.mx.ids.articulos.dao.files;

public interface FileDao {

    void writeFile(String path,String contenido);
    void readFile(String path);
    void updateFile(String path,String contenido);
    void deleteFile(String path);
}
