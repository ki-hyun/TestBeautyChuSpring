package beautychu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.StyleDao;
import beautychu.domain.Style;
import beautychu.domain.StyleDetail;

@Service
public class StyleService {
  @Autowired StyleDao styleDao;
  
  public List<?> getList() {
	    return styleDao.getList(); 
	  }
  
  public List<?> getGridList() {
	    return styleDao.getGridList(); 
	  }
  
/*  public List<?> getStyleDetail() {
	    return styleDao.getStyleDetail(); 
	  }*/
  
  
/*	public Style validate(String email, String password) {
		HashMap<String, String> params = new HashMap<>();
		params.put("email", email);
		params.put("password", password);
		return styleDao.existUser(params);
	}*/

	public void insertStyle(Style style) {
		styleDao.insertStyle(style);
	}
	
	  public StyleDetail get(int styleNo) {
		    StyleDetail styleDetail = styleDao.getStyleDetail(styleNo);
		    styleDetail.setPhotoList( styleDao.selectPhoto(styleNo));
		    return styleDetail;
		  }
}







