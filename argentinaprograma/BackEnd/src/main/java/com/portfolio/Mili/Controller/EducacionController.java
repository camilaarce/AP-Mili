package com.portfolio.Mili.Controller;


import com.google.gson.Gson;
import com.portfolio.Mili.Entity.Educacion;
import com.portfolio.Mili.Security.Controller.Mensaje;
import com.portfolio.Mili.Service.ImpEducacionService;
import java.io.IOException;
import java.util.List;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "https://frontendmili.web.app")
public class EducacionController {
    @Autowired
    ImpEducacionService ieducacionService;
    
    @GetMapping("/educacion/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = ieducacionService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/educacion/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!ieducacionService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Educacion educacion = ieducacionService.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    @DeleteMapping("/educacion/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!ieducacionService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        ieducacionService.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    
    @PostMapping("/educacion/create")
    public ResponseEntity<?> create(@RequestBody Educacion edu) throws IOException{      
        
       
        Educacion educacion = new Educacion(edu.getTitulo(), edu.getInstitucion(), edu.getPeriodo(), edu.getImg());
        ieducacionService.save(educacion);
        
        return new ResponseEntity(new Mensaje("Educacion agregada"), HttpStatus.OK);
    }
    
    
    @PutMapping("/educacion/update/{id}")
    public void update(@PathVariable("id") int id,@RequestBody Educacion educacion) throws IOException{
        
        Educacion edu = ieducacionService.getOne(id).get();
        
    
        edu.setTitulo(educacion.getTitulo());
        edu.setInstitucion(educacion.getInstitucion());
        edu.setPeriodo(educacion.getPeriodo());
        edu.setImg(educacion.getImg());
        
        ieducacionService.saveEducacion(edu);
    }
    
    @GetMapping("/educacion/traer/{id}")
    public Educacion findEducacion(@PathVariable("id") int id){
        return ieducacionService.findEducacion(id);
    }
}

