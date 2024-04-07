package com.cybersoft.demoql.services;

import com.cybersoft.demoql.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    boolean saveEtudiant(Etudiant etudiant);
    boolean updateEtudiant(Etudiant etudiant);
    boolean deleteEtudiant(Etudiant etudiant);

    List<Etudiant> getListEtudiant();
}
