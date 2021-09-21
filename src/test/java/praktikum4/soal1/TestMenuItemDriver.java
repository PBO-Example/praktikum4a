//TestMenuItemDriver.java
package praktikum4.soal1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.*;
import praktikum4.soal1a.*;
import praktikum4.soal1b.*;

public class TestMenuItemDriver {

	MenuItem mi = new MenuItem("makanan", "sup ayam", 30000, 6);
	static MenuItem mi2 = new MenuItem("makanan", "sup ayam", 30000, 6);
    	
	static Stream<Arguments> miArray() {
    return Stream.of(
        Arguments.of("makanan","sup ayam",30000,6, new MenuItem("makanan", "sup ayam", 30000, 6)),
        Arguments.of("makanan","pizza jamur ukuran sedang",56000,2,new MenuItem("makanan", "pizza jamur ukuran sedang", 56000, 2)),
		Arguments.of("minuman","lemon tea",18000,3,new MenuItem("minuman", "lemon tea", 18000, 3))
    );}
	
	
	static Stream<Arguments> miArray2() {
    return Stream.of(
        Arguments.of(mi2,"makanan","sup ayam",30000,6, new MenuItem("makanan", "sup ayam", 30000, 6)),
        Arguments.of(mi2,"makanan","pizza jamur ukuran sedang",56000,2,new MenuItem("makanan", "pizza jamur ukuran sedang", 56000, 2)),
		Arguments.of(mi2,"minuman","lemon tea",18000,3,new MenuItem("minuman", "lemon tea", 18000, 3))
    );
	}
	
	static Stream<Arguments> miArray3() {
    return Stream.of(
        Arguments.of(new MenuItem("makanan", "sup ayam", 30000, 6),"Pesanan makanan\nsup ayam\t@30000x6 = 180000"),
        Arguments.of(new MenuItem("makanan", "pizza jamur ukuran sedang", 56000, 2),"Pesanan makanan\npizza jamur ukuran sedang\t@56000x2 = 112000"),
		Arguments.of(new MenuItem("minuman", "lemon tea", 18000, 3),"Pesanan minuman\nlemon tea\t@18000x3 = 54000")
    );}

	
	@Test
	public void testCheckKonstruktorI()
	{ 
		 mi = MenuItemDriver.checkKonstruktorI();
		 // assertion
		 assertEquals("makanan", mi.getJenisPesanan());
		 assertEquals("Nasi Goreng Seafood", mi.getNamaPesanan());
		 assertEquals(25000, mi.getHarga());
		 assertEquals(1, mi.getJmlPesanan());
	}
	@Test
	public void testCheckKonstruktorII()
	{ 
		 mi = MenuItemDriver.checkKonstruktorII("makanan", "sup ayam", 30000, 6);
		 // assertion
		 assertEquals("makanan", mi.getJenisPesanan());
		 assertEquals("sup ayam", mi.getNamaPesanan());
		 assertEquals(30000, mi.getHarga());
		 assertEquals(6, mi.getJmlPesanan());
		 mi = MenuItemDriver.checkKonstruktorII("minuman", "Coca cola", 10000, 3);
		 // assertion
		 assertEquals("minuman", mi.getJenisPesanan());
		 assertEquals("Coca cola", mi.getNamaPesanan());
		 assertEquals(10000, mi.getHarga());
		 assertEquals(3, mi.getJmlPesanan());
		 mi = MenuItemDriver.checkKonstruktorII("minuman", "Es kelapa muda", 15000, 2);
		 // assertion
		 assertEquals("minuman", mi.getJenisPesanan());
		 assertEquals("Es kelapa muda", mi.getNamaPesanan());
		 assertEquals(15000, mi.getHarga());
		 assertEquals(2, mi.getJmlPesanan());
	}
	
	
	@ParameterizedTest
	@MethodSource("miArray")
	public void testBuatPesanan(String jenisPesanan, String namaPesanan, int harga, int jmlPesanan, MenuItem expected) {
		mi.buatPesanan(jenisPesanan,namaPesanan,harga,jmlPesanan);
		assertEquals(mi, expected);
	}
	
	@ParameterizedTest
	@MethodSource("miArray2")
	public void testCallBuatPesanan(MenuItem miLokal,String jenisPesanan, String namaPesanan, int harga, int jmlPesanan, MenuItem expected) {
		assertEquals(MenuItemDriver.callBuatPesanan(miLokal,jenisPesanan,namaPesanan,harga,jmlPesanan), expected);
	}
	
	@ParameterizedTest
	@MethodSource("miArray3")
	public void testCallToString(MenuItem miLokal, String expected) {
		assertEquals(MenuItemDriver.callToString(miLokal), expected);
	}
	
	@Test
	public void testCallGetNBInstance()
	{ 
		 assertEquals(MenuItemDriver.callGetNBInstance(),MenuItem.getNbInstance());	 
	}
	
}