package beautychu.domain;

import java.io.Serializable;

public class StyleGrid implements Serializable {

	private static final long serialVersionUID = 1L;

	int 		styleNumber;
	String 	email;
	String 	styleName;
	String    	styleLength;
	String 	gender;
	String		styleSort;
	String 	url;
	
	
	
	
	public int getStyleNumber() {
		return styleNumber;
	}
	public String getEmail() {
		return email;
	}
	public String getStyleName() {
		return styleName;
	}
	public String getStyleLength() {
		return styleLength;
	}
	public String getGender() {
		return gender;
	}
	public String getStyleSort() {
		return styleSort;
	}
	public String getUrl() {
		return url;
	}
	public void setStyleNumber(int styleNumber) {
		this.styleNumber = styleNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public void setStyleLength(String styleLength) {
		this.styleLength = styleLength;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setStyleSort(String styleSort) {
		this.styleSort = styleSort;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	@Override
	public String toString() {
		return "StyleGrid [styleNumber=" + styleNumber + ", email=" + email
				+ ", styleName=" + styleName + ", styleLength=" + styleLength
				+ ", gender=" + gender + ", styleSort=" + styleSort + ", url="
				+ url + "]";
	}
	
	
	
	

	

	
	


	
	
	
	
}