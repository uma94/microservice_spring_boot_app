package com.fundoonote.msnoteservice.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fundoonote.msnoteservice.model.Collaboration;
import com.fundoonote.msnoteservice.model.Note;

@Repository
public interface ICollaboratorDao extends CrudRepository<Collaboration, Long> {
	
	@Modifying
	Collaboration deleteByNoteAndSharedId(Note note, Integer sharedId);

	List<Collaboration> getByNote(Note noteId);


}
