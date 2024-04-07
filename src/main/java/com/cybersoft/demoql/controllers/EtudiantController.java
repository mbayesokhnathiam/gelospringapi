package com.cybersoft.demoql.controllers;

import com.cybersoft.demoql.entities.Etudiant;
import com.cybersoft.demoql.services.IEtudiantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/etudiants")
public class EtudiantController {

    private IEtudiantService iEtudiantService;

    public EtudiantController(IEtudiantService iEtudiantService){
        this.iEtudiantService = iEtudiantService;
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saverEtudiant(@RequestBody Etudiant etudiant){

        boolean saved = iEtudiantService.saveEtudiant(etudiant);

        return saved ? ResponseEntity.status(201).body(etudiant) : ResponseEntity.status(500).body(etudiant);
    }

    @GetMapping(value = "/save")
    public ResponseEntity<?> listEtudiant(@RequestBody Etudiant etudiant){



        return ResponseEntity.status(200).body(iEtudiantService.getListEtudiant());
    }
}
