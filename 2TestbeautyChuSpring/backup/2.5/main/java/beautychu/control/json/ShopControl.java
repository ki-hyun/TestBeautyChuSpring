package beautychu.control.json;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import beautychu.domain.Shop;
import beautychu.service.ShopService;

@Controller("json.shopControl")
@RequestMapping("/json/Shop")
public class ShopControl {
//	static Logger log = Logger.getLogger(ProductControl.class);

	@Autowired
	ShopService shopService;

	
	@RequestMapping("/view")
	public Object view(String email,Model model) throws Exception {
		Shop shop = shopService.get(email);

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("shop", shop);
		/*resultMap.put("photos", styleDetail.getPhotoList());
		resultMap.put("email", styleDetail.getEmail());*/
		return resultMap;
	}
	

}
