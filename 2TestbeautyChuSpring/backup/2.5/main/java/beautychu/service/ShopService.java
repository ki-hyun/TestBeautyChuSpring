package beautychu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.ShopDao;
import beautychu.domain.Shop;

@Service
public class ShopService {
  @Autowired ShopDao shopDao;
  
	
	  public Shop get(String email) {
		    Shop shop = shopDao.selectOne(email);
		    /*Shop.setPhotoList( shopDao.selectPhoto(email));*/
		    return shop;
		  }
}







