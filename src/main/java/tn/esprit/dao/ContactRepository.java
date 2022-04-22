package tn.esprit.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.Contact;


@Repository
public interface ContactRepository extends CrudRepository<Contact,Long> {

}
