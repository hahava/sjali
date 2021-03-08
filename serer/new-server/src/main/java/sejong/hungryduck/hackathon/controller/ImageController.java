package sejong.hungryduck.hackathon.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
public class ImageController {

	private static final String IMG_PATH = ".." + File.separator + "images" + File.separator;

	@GetMapping("/image/{imgId}")
	@ResponseBody
	public HttpEntity<byte[]> getImages(@PathVariable String imgId) throws IOException {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.IMAGE_JPEG);
		return new HttpEntity<>(IOUtils.toByteArray(new FileInputStream(new File(IMG_PATH + imgId))), httpHeaders);
	}
}
