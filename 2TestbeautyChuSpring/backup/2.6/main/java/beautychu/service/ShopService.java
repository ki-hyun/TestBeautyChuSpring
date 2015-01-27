package beautychu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.ShopDao;
import beautychu.domain.ShopDetail;

@Service
public class ShopService {
  @Autowired ShopDao shopDao;
  
	
	  public ShopDetail get(String email) {
		    ShopDetail shopDetail = shopDao.getShopDetail(email);
		    shopDetail.setShopPhoto( shopDao.selectPhoto(email));
		    return shopDetail;
		  }
}







