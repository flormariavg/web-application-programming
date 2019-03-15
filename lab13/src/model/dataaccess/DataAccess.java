package model.dataaccess;

import edu.mum.wap.model.Product;

import java.util.List;

import edu.mum.wap.model.CartLine;
import edu.mum.wap.model.ShoppingCart;

public interface DataAccess {
	public void saveNewProduct(Product p);
	public void saveNewCartLine(CartLine cl);
	public void saveNewShopList(ShoppingCart sc);
	public List<Product> readProdsList();
	public List<CartLine> readCartLines();
	public ShoppingCart readShopList();
}
