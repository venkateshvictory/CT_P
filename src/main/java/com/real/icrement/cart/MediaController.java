package com.real.icrement.cart;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.real.icrement.dto.MediaDTO;
import com.real.icrement.model.MediaModel;
import com.real.icrement.serviceimpl.MediaServiceImpl;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/media")
public class MediaController {

	
	@Resource(name="mediaServiceImpl")
	private MediaServiceImpl mediaServiceImpl;
	@PostMapping("/save")
	public MediaModel save(MediaModel model) {
		
	return	mediaServiceImpl.save(model);
	}
	
	/*
	 * @PostMapping("/picture") public JTMediaDTO uploadProfilePicture(@RequestParam
	 * Long customerId, @ModelAttribute MultipartFile profilePicture) throws
	 * FileNotFoundException, IOException {
	 * 
	 * 
	 * }
	 */
	
	
}
