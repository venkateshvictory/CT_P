package com.real.icrement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.real.icrement.model.MediaModel;

@Repository("mediaRepository")
public interface MediaRepository extends JpaRepository<MediaModel,Long> {

	
}
