package com.gm.api.file;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/file")
public class DownloadFileController {
	/**
	 * 下载文件
	 * 
	 * @param filePath
	 * @param fileName
	 * @param request
	 * @param response
	 */
	@RequestMapping("/download")
	@ResponseBody
	public void downloadFile(String filePath, String fileName, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			fileName = URLDecoder.decode(fileName, "UTF-8");
			filePath = URLDecoder.decode(filePath, "UTF-8");

			String encodedFileName = URLEncoder.encode(fileName, "utf-8");
			response.setHeader("Content-Disposition", "attachment;fileName=\"" + encodedFileName + "\"");
			URL url = request.getServletContext().getResource(filePath);
			Path file = Paths.get(url.toURI());
			response.setContentType("application/force-download");
			response.setHeader("Content-Length", file.toFile().length() + "");
			Files.copy(file, response.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 下载app
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping("/downloadApp")
	@ResponseBody
	public void downloadApp(HttpServletRequest request, HttpServletResponse response) {
		try {

			String encodedFileName = URLEncoder.encode("爱家房产网.apk", "utf-8");
			response.setHeader("Content-Disposition", "attachment;fileName=\"" + encodedFileName + "\"");
			URL url = request.getServletContext().getResource("/static/files/app.apk");
			Path file = Paths.get(url.toURI());
			response.setContentType("application/force-download");
			response.setHeader("Content-Length", file.toFile().length() + "");
			Files.copy(file, response.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
