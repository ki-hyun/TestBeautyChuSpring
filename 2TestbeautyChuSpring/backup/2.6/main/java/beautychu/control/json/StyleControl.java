package beautychu.control.json;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import beautychu.domain.StyleDetail;
import beautychu.service.StyleService;

@Controller("json.styleControl")
@RequestMapping("/json/style")
public class StyleControl {
//	static Logger log = Logger.getLogger(ProductControl.class);

	@Autowired
	StyleService styleService;

	@RequestMapping("/list")
	public Object list() throws Exception {

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("styleList", styleService.getList());
		return resultMap;
	}
	
	@RequestMapping("/detail")
	public Object detail(int no,Model model) throws Exception {
		StyleDetail styleDetail = styleService.get(no);

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("styleDetail", styleDetail);
		resultMap.put("photos", styleDetail.getPhotoList());
		resultMap.put("email", styleDetail.getEmail());
		return resultMap;
	}
	

}
