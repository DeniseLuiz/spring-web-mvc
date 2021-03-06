package com.globallabs.springwebmvc.repository;

import com.globallabs.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {

    private List<Jedi> jedi;
    private Long id;

    public JediRepository() {

        jedi = new ArrayList<>();
        jedi.add(new Jedi("Luke", "Skywler"));
    }

    public List<Jedi> getAllJedi () {

        return this.jedi;
    }

   /* public Jedi findById(this.id){

        Jedi = jedi.indexOf(id);

        return Jedi;
    }*/

    public void add (final Jedi jedi){
        this.jedi.add(jedi);
    }

}
