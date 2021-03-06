package beautychu.control.json;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import beautychu.domain.Member;
import beautychu.domain.Review;
import beautychu.domain.StyleDetail;
import beautychu.domain.StyleGrid;
import beautychu.service.StyleService;

@Controller("json.styleControl")
@RequestMapping("/json/style")
public class StyleControl {
//	static Logger log = Logger.getLogger(ProductControl.class);

	@Autowired
	StyleService styleService;

	@RequestMapping("/list")
	public Object list(StyleGrid styleList) throws Exception {

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("styleList", styleService.getList(styleList));
		return resultMap;
	}
	
	@RequestMapping("/detail")
	public Object detail(Review review,Model model,HttpSession session) throws Exception {
		
		Member member =  (Member) session.getAttribute("loginUser");
		if (session.getAttribute("loginUser") != null) {
			review.setEmail(member.getEmail());
		}
		StyleDetail styleDetail = styleService.get(review);
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("styleDetail", styleDetail);
		resultMap.put("photos", styleDetail.getPhotoList());
		resultMap.put("email", styleDetail.getEmail());
		resultMap.put("review", styleDetail.getReview());
		System.out.println("리뷰===========>"+resultMap);
		return resultMap;
	}
	

}
