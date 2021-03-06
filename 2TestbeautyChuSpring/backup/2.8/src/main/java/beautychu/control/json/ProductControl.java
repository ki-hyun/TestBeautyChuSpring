package beautychu.control.json;

/*
@Controller("json.productControl")
@RequestMapping("/json/product")
public class ProductControl {
  static Logger log = Logger.getLogger(ProductControl.class);
  static final int PAGE_DEFAULT_SIZE = 5;
  
  @Autowired MakerService       makerService;
  @Autowired ProductService     productService;
  @Autowired ServletContext servletContext;
 
  @RequestMapping(value="/add", method=RequestMethod.POST)
  public Object add(Product product) throws Exception {  
    
    if (product.getPhotofile() != null
        && !product.getPhotofile().isEmpty()) {

      String fileuploadRealPath = 
        servletContext.getRealPath("/fileupload");
      String filename = System.currentTimeMillis() + "_"; 
      File file = new File(fileuploadRealPath + "/" + filename);
    
      product.getPhotofile().transferTo(file);
      product.setPhoto(filename);
    }
    
    productService.add(product);
    
    HashMap<String,Object> resultMap = new HashMap<>();
    resultMap.put("status", "success");
    
    return resultMap;
  }

  @RequestMapping("/delete")
  public Object delete(int no) throws Exception {
    productService.delete(no);
    
    HashMap<String,Object> resultMap = new HashMap<>();
    resultMap.put("status", "success");
    
    return resultMap;
  }
  
  @RequestMapping("/list")
  public Object list(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="5") int pageSize) throws Exception {
    
    if (pageSize <= 0)
      pageSize = PAGE_DEFAULT_SIZE;
    
    int maxPageNo = productService.getMaxPageNo(pageSize);
    
    if (pageNo <= 0) pageNo = 1;
    if (pageNo > maxPageNo) pageNo = maxPageNo;
    
    HashMap<String,Object> resultMap = new HashMap<>();
    resultMap.put("status", "success");
    resultMap.put("currPageNo", pageNo);
    resultMap.put("maxPageNo", maxPageNo);
    resultMap.put("products", 
        productService.getList(pageNo, pageSize));
    
    return resultMap;
  }
  
  @RequestMapping("/update")
  public Object update(Product product) throws Exception {
    productService.update(product);
    
    HashMap<String,Object> resultMap = new HashMap<>();
    resultMap.put("status", "success");
    return resultMap;
  }
  
  @RequestMapping("/view")
  public Object view(int no, Model model) throws Exception {
    Product product = productService.get(no);
    
    HashMap<String,Object> resultMap = new HashMap<>();
    resultMap.put("status", "success");
    resultMap.put("product", product);
    resultMap.put("photos", product.getPhotoList());
    return resultMap;
  }
}

*/










