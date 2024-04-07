package com.cybersoft.demoql.services;

import com.cybersoft.demoql.entities.Etudiant;
import com.cybersoft.demoql.repositories.EtudiantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService implements IEtudiantService{

    private EtudiantRepository etudiantRepository;
    public EtudiantService(EtudiantRepository etudiantRepository){
        this.etudiantRepository = etudiantRepository;
    }
    @Override
    public boolean saveEtudiant(Etudiant etudiant) {
        try{
            etudiantRepository.save(etudiant);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean updateEtudiant(Etudiant etudiant) {
        try{
            etudiantRepository.save(etudiant);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean deleteEtudiant(Etudiant etudiant) {
        try{
            etudiantRepository.delete(etudiant);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<Etudiant> getListEtudiant() {
        return etudiantRepository.findAll();
    }
}
