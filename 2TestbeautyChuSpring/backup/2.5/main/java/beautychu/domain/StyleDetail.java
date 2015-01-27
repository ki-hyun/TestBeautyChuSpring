package beautychu.domain;

import java.io.Serializable;
import java.util.List;

public class StyleDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	int 		styleNumber;
	String 	styleName;
	String 	styleIntro;
	int 		SkillTime;
	int 		price;
	String 	url;
	String 	email;
	List<?> 	photoList;
	
	
	
	public int getStyleNumber() {
		return styleNumber;
	}
	public String getStyleName() {
		return styleName;
	}
	public String getStyleIntro() {
		return styleIntro;
	}
	public int getSkillTime() {
		return SkillTime;
	}
	public int getPrice() {
		return price;
	}
	public String getUrl() {
		return url;
	}
	public String getEmail() {
		return email;
	}
	public List<?> getPhotoList() {
		return photoList;
	}
	public void setStyleNumber(int styleNumber) {
		this.styleNumber = styleNumber;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public void setStyleIntro(String styleIntro) {
		this.styleIntro = styleIntro;
	}
	public void setSkillTime(int skillTime) {
		SkillTime = skillTime;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhotoList(List<?> photoList) {
		this.photoList = photoList;
	}
	
	
	
	@Override
	public String toString() {
		return "StyleDetail [styleNumber=" + styleNumber + ", styleName="
				+ styleName + ", styleIntro=" + styleIntro + ", SkillTime="
				+ SkillTime + ", price=" + price + ", url=" + url + ", email="
				+ email + ", photoList=" + photoList + "]";
	}
	
	
	

	
	


	
	
	
}
