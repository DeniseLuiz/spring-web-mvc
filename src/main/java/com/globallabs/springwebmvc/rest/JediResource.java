package com.globallabs.springwebmvc.rest;

import com.globallabs.springwebmvc.exception.JediNotFoundException;
import com.globallabs.springwebmvc.model.Jedi;
import com.globallabs.springwebmvc.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class JediResource {

    @Autowired
    private JediRepository repository;

    @GetMapping("/api/jedi")
    public List<Jedi> getAllJedi(){
        return repository.getAllJedi();
    }

    /*@GetMapping("api/jedi/{id}")
    public ResponseEntity <Jedi> getJedi(@PathVariable("id") Long id){
        final Optional<Jedi> jedi = repository.findById(id);

        if(jedi.isPresent()){
            return ResponseEntity.ok(jedi.get());
        }else{
            throw new ResponseEntity.notFound();
        }
    }*/

    /*@PostMapping("api/jedi")
    public Jedi createJedi(){
        return repository.save(jedi);
    }*/
}
