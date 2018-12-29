package com.taotao.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.taotao.result.PictureResult;

public interface PictureService {
	public PictureResult uploadFile(MultipartFile uploadFile) throws Exception;
}
