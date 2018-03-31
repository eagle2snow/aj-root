package com.gm.api.file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gm.utils.FileUtil;

import net.coobird.thumbnailator.Thumbnails;

/**
 * 压缩图片
 * 
 * @author ying
 *
 */
@Controller
@RequestMapping("/pressImg")
public class PressImgController {

	@RequestMapping("")
	public String press(HttpServletRequest request) {
		String basePath = request.getSession().getServletContext().getRealPath("/");
		List<File> list = new ArrayList<>();
		list = FileUtil.getFileList(basePath + "static" + File.separator + "upload" + File.separator + "image", list);
		for (File file : list) {
			if (file.length() > 307200) {// 大于300k
				String oldPath = file.getAbsolutePath();
				try {
					Thumbnails.of(oldPath).outputQuality(0.7f).size(720, 1280).toFile(oldPath);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return "";
	}

}
