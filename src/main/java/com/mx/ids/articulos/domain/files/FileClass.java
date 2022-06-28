package com.mx.ids.articulos.domain.files;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.io.File;

@Data
public class FileClass {
    private String path;
    private String name;
    private java.io.File txtFileClass=new File("consultas.txt");
}
