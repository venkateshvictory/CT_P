package com.real.icrement.aws.jws;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.real.icrement.model.MediaModel;

public interface JTAwsBlobService {

	AmazonS3 getClient();

	MediaModel uploadFile(MultipartFile file) throws FileNotFoundException, IOException;

	List<MediaModel> uploadFiles(List<MultipartFile> file) throws FileNotFoundException, IOException;

}
