package beautychu.dao;

import java.util.Map;

import beautychu.domain.Shop;

public interface ShopDao {
	
	  Shop existShop(Map<String,String> params);
	  void insertShop(Shop shop);
	
	/* Member selectOne(int no); */
	
	  /*Product selectOne(int no);
	  void update(Product product);
	  void delete(int no);
	  List<?> selectList(Map<String,Object> params);
	  void insert(Product product);
	  void insertPhoto(Product product);
	  List<?> selectPhoto(int productNo);
	  void deletePhoto(int productNo);
	  int totalSize();*/
	}