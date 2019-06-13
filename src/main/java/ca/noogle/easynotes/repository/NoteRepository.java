package ca.noogle.easynotes.repository;


import ca.noogle.easynotes.model.Note;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}