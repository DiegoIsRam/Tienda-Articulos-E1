package com.mx.ids.articulos.service.files;

import com.mx.ids.articulos.dao.files.FileDao;
import com.mx.ids.articulos.domain.files.FileClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.time.LocalDateTime;

@Service
public class FileServiceImpl implements FileService {

   @Autowired
   private FileClass fileClass;

    @Override
    public void writeFile(String path, String contenido) {
        try {
            fileClass.setPath(path);
            fileClass.setTxtFileClass(new File(fileClass.getPath()));
            //txtFileClass = new File(ruta); //Crea un nuevo archivo tomando en cuenta la ruta que se le pasa como parámetro
            this.updateFile(fileClass.getPath(), contenido);
            //this.updateFile(contenido);
            System.out.println("El archivo se ha creado con éxito en la siguiente ruta: " + fileClass.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public void readFile(String path) {
        String contenido=new String();
        String texto="";

        try {
            FileReader fw = new FileReader(fileClass.getTxtFileClass());
            BufferedReader text=new BufferedReader(fw);
            while((contenido=text.readLine())!=null){
                texto=texto+contenido+"\n";
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(texto);

    }

    @Override
    public void updateFile(String path, String contenido) {
        contenido="---------"+"\n"+contenido;
        contenido=contenido+"\nDateTime: "+ LocalDateTime.now()+"\n";
        try{

            if (!fileClass.getTxtFileClass().exists()) {
                fileClass.getTxtFileClass().createNewFile();
            }

            FileWriter fw = new FileWriter(fileClass.getTxtFileClass(),true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(contenido);
            bw.close();
            System.out.println("Se ha añadido con éxito la siguiente línea: "+contenido);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void deleteFile(String path) {
        System.out.println("Sin implementarse");
    }
}
