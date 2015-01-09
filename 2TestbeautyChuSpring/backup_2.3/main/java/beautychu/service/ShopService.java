package beautychu.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.ShopDao;
import beautychu.domain.Member;
import beautychu.domain.Shop;

@Service
public class ShopService {
	@Autowired
	ShopDao shopDao;

	public Shop validate(String email,String licenseeno, String shopname, String shopaddr, String shoptel, String shopintro ) {
		HashMap<String, String> params = new HashMap<>();
		params.put("email", email);
		params.put("licenseeno", licenseeno);
		params.put("shopname", shopname);
		params.put("shopaddr", shopaddr);
		params.put("shoptel", shoptel);
		params.put("shoptel", shoptel);
		params.put("shopintro", shopintro);
		return shopDao.existShop(params);
	}

	public void insertShop(Shop shop) {
		shopDao.insertShop(shop);
	}
}
