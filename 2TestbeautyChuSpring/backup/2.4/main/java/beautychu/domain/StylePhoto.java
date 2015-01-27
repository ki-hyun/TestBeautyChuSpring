package beautychu.domain;

import java.io.Serializable;

public class StylePhoto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	int no;
	int styleNo;
	String url;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getStyleNo() {
		return styleNo;
	}
	public void setStyleNo(int styleNo) {
		this.styleNo = styleNo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	@Override
	public String toString() {
		return "StylePhoto [no=" + no + ", styleNo=" + styleNo + ", url=" + url
				+ "]";
	}
	

	
	
}
