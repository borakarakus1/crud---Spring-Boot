package com.bora.crud.service;

import com.bora.crud.exception.AuthorityAlreadyAvailable;
import com.bora.crud.exception.NotFoundException;
import com.bora.crud.model.Authority;
import com.bora.crud.model.User;
import com.bora.crud.repository.AuthorityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorityService {


    private final AuthorityRepository authorityRepository;

    public void createAuthority(Authority authority){
        if (authorityRepository.findById(authority.getId()).isPresent()){
            throw new AuthorityAlreadyAvailable();
        }
        authorityRepository.save(authority);
    }
    public List<Authority> getAllAuthorities(){
        return authorityRepository.findAll();
    }
    public Optional<Authority> getAuthorityById(Long id){
        if (!authorityRepository.existsById(id)){
            throw new NotFoundException();
        }
        return authorityRepository.findById(id);
    }
    public void deleteAuthorityById(Long id){
        if (!authorityRepository.existsById(id)){
            throw new NotFoundException();
        }
        authorityRepository.deleteById(id);
    }
    public Authority updateAuthorityById(Long id, Authority authority){
        Authority authorityToUpdate = authorityRepository.findById(id).orElseThrow(NotFoundException::new);
        authorityToUpdate.setRevNo(authority.getRevNo());
        authorityToUpdate.setYetkiTip(authority.getYetkiTip());
        authorityToUpdate.setYetkiKod(authority.getYetkiKod());
        authorityToUpdate.setBagliYetkiKod(authority.getBagliYetkiKod());
        authorityToUpdate.setAciklama(authority.getAciklama());
        authorityToUpdate.setMenuSıraNo(authority.getMenuSıraNo());
        authorityToUpdate.setMenuPath(authority.getMenuPath());
        authorityToUpdate.setAktifTarihi(authority.getAktifTarihi());
        authorityToUpdate.setPasifTarihi(authority.getPasifTarihi());
        authorityToUpdate.setKytKullanici(authority.getKytKullanici());
        authorityToUpdate.setKytTarih(authority.getKytTarih());
        authorityToUpdate.setGncKullanici(authority.getGncKullanici());
        authorityToUpdate.setGncTarihi(authority.getGncTarihi());
        authorityToUpdate.setProjeKod(authority.getProjeKod());
        authorityRepository.save(authorityToUpdate);
        return authorityToUpdate;
    }
    public void updateAuthorityRevNoById(Long id,Long revNo){
        Authority authorityToUpdate = authorityRepository.findById(id).orElseThrow(NotFoundException::new);
        authorityToUpdate.setRevNo(revNo);
        authorityRepository.save(authorityToUpdate);
    }
    public void updateAuthorityYetkiTipById(Long id,int yetkiTip){
        Authority authorityToUpdate = authorityRepository.findById(id).orElseThrow(NotFoundException::new);
        authorityToUpdate.setYetkiTip(yetkiTip);
        authorityRepository.save(authorityToUpdate);
    }
    public void updateAuthorityYetkiKodById(Long id,String yetkiKod){
        Authority authorityToUpdate = authorityRepository.findById(id).orElseThrow(NotFoundException::new);
        authorityToUpdate.setYetkiKod(yetkiKod);
        authorityRepository.save(authorityToUpdate);
    }
    public void updateAuthorityBagliYetkiKodById(Long id,String bagliYetkiKod){
        Authority authorityToUpdate = authorityRepository.findById(id).orElseThrow(NotFoundException::new);
        authorityToUpdate.setBagliYetkiKod(bagliYetkiKod);
        authorityRepository.save(authorityToUpdate);
    }
    public void updateAuthorityMenuSıraNoById(Long id,Long menuSıraNo){
        Authority authorityToUpdate = authorityRepository.findById(id).orElseThrow(NotFoundException::new);
        authorityToUpdate.setMenuSıraNo(menuSıraNo);
        authorityRepository.save(authorityToUpdate);
    }
    public void updateAuthorityMenuPathById(Long id,String menuPath){
        Authority authorityToUpdate = authorityRepository.findById(id).orElseThrow(NotFoundException::new);
        authorityToUpdate.setMenuPath(menuPath);
        authorityRepository.save(authorityToUpdate);
    }
    public void updateAuthorityAktifTarihiById(Long id, Date aktifTarihi){
        Authority authorityToUpdate = authorityRepository.findById(id).orElseThrow(NotFoundException::new);
        authorityToUpdate.setAktifTarihi(aktifTarihi);
        authorityRepository.save(authorityToUpdate);
    }
    public void updateAuthorityPasifTarihiById(Long id,Date pasifTarihi){
        Authority authorityToUpdate = authorityRepository.findById(id).orElseThrow(NotFoundException::new);
        authorityToUpdate.setPasifTarihi(pasifTarihi);
        authorityRepository.save(authorityToUpdate);
    }
    public void updateAuthorityKytKullaniciById(Long id,String kytKullanici){
        Authority authorityToUpdate = authorityRepository.findById(id).orElseThrow(NotFoundException::new);
        authorityToUpdate.setKytKullanici(kytKullanici);
        authorityRepository.save(authorityToUpdate);
    }
    public void updateAuthorityKytTarihiById(Long id,Date kytTarih){
        Authority authorityToUpdate = authorityRepository.findById(id).orElseThrow(NotFoundException::new);
        authorityToUpdate.setKytTarih(kytTarih);
        authorityRepository.save(authorityToUpdate);
    }
    public void updateAuthorityGncKullaniciById(Long id,String gncKullanici){
        Authority authorityToUpdate = authorityRepository.findById(id).orElseThrow(NotFoundException::new);
        authorityToUpdate.setGncKullanici(gncKullanici);
        authorityRepository.save(authorityToUpdate);
    }
    public void updateAuthorityGncTarihiById(Long id,Date gncTarihi){
        Authority authorityToUpdate = authorityRepository.findById(id).orElseThrow(NotFoundException::new);
        authorityToUpdate.setGncTarihi(gncTarihi);
        authorityRepository.save(authorityToUpdate);
    }
    public void updateAuthorityProjeKodById(Long id,String projeKod){
        Authority authorityToUpdate = authorityRepository.findById(id).orElseThrow(NotFoundException::new);
        authorityToUpdate.setProjeKod(projeKod);
        authorityRepository.save(authorityToUpdate);
    }


}
