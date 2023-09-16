package com.real.icrement.aws.jws;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.real.icrement.model.MediaModel;
import com.real.icrement.serviceimpl.MediaServiceImpl;

import jakarta.annotation.Resource;
@Service("jtAwsBlobService")
public class JTAwsBlobServiceImpl implements JTAwsBlobService {
	

	@Value("${secretKey}")
	private String secretKey;
	
	@Value("${accessKey}")
	private String accessKey;
	
	@Value("${bucketName}")
	private String bucketName;
	
	@Value("${region}")
	private String region;
	
	@Resource(name="mediaServiceImpl")
	private MediaServiceImpl mediaServiceImpl;

	@Override
	public AmazonS3 getClient() {
		AWSCredentials credentials= new BasicAWSCredentials(accessKey, secretKey);
		return AmazonS3ClientBuilder.standard().
				withCredentials(new AWSStaticCredentialsProvider(credentials)).withRegion(Regions.AP_SOUTH_1).build();
	
	}

	@Override
	public MediaModel uploadFile(MultipartFile file) throws FileNotFoundException, IOException {
		MediaModel media= new MediaModel();
		File modified= new File(file.getOriginalFilename());
		FileOutputStream os= new FileOutputStream(modified);
		os.write(file.getBytes());
		String fileName= System.currentTimeMillis()+"_"+file.getOriginalFilename();
		getClient().putObject(bucketName, fileName, modified);
		modified.delete();
		media.setUrl(getS3Url(fileName));
		return mediaServiceImpl.save(media);	
	}

	private String getS3Url(String fileName) {
		String completeUrl= "https://"+bucketName+"."+region+"/"+fileName;
		return completeUrl;
	}
	@Override
	public List<MediaModel> uploadFiles(List<MultipartFile> files) throws FileNotFoundException, IOException {
		List<MediaModel> uploadedFiles= new ArrayList<>();
		for(MultipartFile multiPartFile: files) {
			MediaModel media=uploadFile(multiPartFile);
			uploadedFiles.add(media);
		}
		return uploadedFiles;
	}

}
