package com.real.icrement.serviceimpl;

import org.springframework.stereotype.Service;

import com.real.icrement.model.MediaModel;
import com.real.icrement.repository.MediaRepository;
import com.real.icrement.service.MediaService;

import jakarta.annotation.Resource;
import jakarta.transaction.Transactional;
@Service("mediaServiceImpl")
public class MediaServiceImpl implements MediaService

{
	@Resource(name = "mediaRepository")
	private MediaRepository mediaRepository;

	@Override
	@Transactional
	public MediaModel save(MediaModel media) {

		return mediaRepository.save(media);
	}

}
