package beautychu.domain;

import java.io.Serializable;

public class Shop implements Serializable {


	private static final long serialVersionUID = 1L;
	String email;
	String licenseeno;
	String shopname;
	String shopaddr;
	String shoptel;
	String shopintro;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLicenseeno() {
		return licenseeno;
	}
	public void setLicenseeno(String licenseeno) {
		this.licenseeno = licenseeno;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getShopaddr() {
		return shopaddr;
	}
	public void setShopaddr(String shopaddr) {
		this.shopaddr = shopaddr;
	}
	public String getShoptel() {
		return shoptel;
	}
	public void setShoptel(String shoptel) {
		this.shoptel = shoptel;
	}
	public String getShopintro() {
		return shopintro;
	}
	public void setShopintro(String shopintro) {
		this.shopintro = shopintro;
	}
	@Override
	public String toString() {
		return "Shop [email=" + email + ", licenseeno=" + licenseeno
				+ ", shopname=" + shopname + ", shopaddr=" + shopaddr
				+ ", shoptel=" + shoptel + ", shopintro=" + shopintro + "]";
	}
	
	

	

	
}
