# Praktikum5
## Pengantar
**Inheritance** adalah konsep di mana kelas anak(sub class/child class/derived class) mewarisi semua atribut dan method yang public/protected dari kelas bapak (superclass/parent class/base class).
Atribut atau method yang diwarisi dari kelas bapak, tidak ditulis di dalam kelas anak, tapi objek dari kelas anak memiliki dan dapat memanggil method yang diwariskan oleh bapak.

Berikut adalah diagram kelas Binatang yang sudah saya jelaskan di video pembelajaran pada sesi asinkronus minggu ini.
![Image of Gbr5.1](https://apipuro.del.ac.id/v1/file/9a9c702b564eb5b1662257297da13baf)

## Petunjuk Praktikum
Baca instruksi yang diberikan dengan baik.
>File-file berikut ini bisa anda temukan di folder **src\main\java\praktikum4**.


#### Soal 2 **[Poin 70]** Kelas Shape dan turunannya serta ShapeDriver
Lengkapi program Shape.java, Circle.java, Rectangle.java sesuai dengan kelas diagram berikut.
![Image of Soal2](http://api.puro.del.ac.id/v1/file/1a67003e6dac5fc3cb2976e7e8641a12)
Kelas Shape lengkapi dengan konstruktor dengan parameter, setter dan getter. Sementara untuk Circle dan Rectangle lengkapi dengan konstruktor, kopi konstruktor, setter, dan getter.

* Konstruktor tanpa parameter pada Cirlcle akan membentuk objek Circle dengan posisi titik tengah (0,0) dan diameter 1.
* Konstruktor tanpa parameter pada Cirlcle akan membentuk objek Rectangle dengan posisi (0,0) dan (0,0).
* Setiap konstruktor pada Circle dan Rectangle memberi nama objek Circle atau Rectangle secara langsung bukan dari variabel parameter konstruktor.

Soal 2 ini dilengkapi dengan sejumlah test sebagai berikut:
* ***TestShape.testKonstrukturDenganParameter*** akan menguji konstruktor dengan parameter pada kelas Shape.
* ***TestShape.testSetName*** akan menguji setter pada kelas Shape.

* ***TestCircle.testKonstruktorI*** akan menguji konstruktor tanpa parameter pada kelas Circle.
* ***TestCircle.testKonstruktorII*** akan menguji konstruktor dengan parameter pada kelas Circle.
* ***TestCircle.testKopiKonstruktor*** akan menguji kopi konstruktor pada kelas Circle.
* ***TestCircle.testSetter*** akan menguji setter pada kelas Circle.
* ***TestCircle.testSetDiameter*** akan menguji method setDiameter() pada kelas Circle.
* ***TestCircle.testGetArea*** akan menguji method getArea() pada kelas Circle.
* ***TestCircle.testGetKeliling*** akan menguji method getCircumference() pada kelas Circle.
* ***TestCircle.testToString*** akan menguji method toString() pada kelas Circle.

* ***TestRectangle.testKonstruktorI*** akan menguji konstruktor tanpa parameter pada kelas Rectangle.
* ***TestRectangle.testKonstruktorII*** akan menguji konstruktor dengan parameter pada kelas Rectangle.
* ***TestRectangle.testKopiKonstruktor*** akan menguji kopi konstruktor pada kelas Rectangle.
* ***TestRectangle.testSetter*** akan menguji setter pada kelas Rectangle.
* ***TestRectangle.tesGetWidth*** akan menguji method getWidth() pada kelas Rectangle.
* ***TestRectangle.testGetHeight*** akan menguji method getHeight() pada kelas Rectangle.
* ***TestRectangle.testGetArea*** akan menguji method getArea() pada kelas Rectangle.
* ***TestRectangle.testGetKeliling*** akan menguji method getCircumference() pada kelas Rectangle.
* ***TestRectangle.testToString*** akan menguji method toString() pada kelas Rectangle.

TestShapeDriver.testCreateRectangle akan menguji method createRectangle() pada kelas ShapeDriver yang akan menginstasiasi kelas Rectangle menggunakan konstruktor dengan parameter.
TestShapeDriver.testCreateCircle akan menguji method createCircle() pada kelas ShapeDriver yang akan menginstasiasi kelas Circle menggunakan konstruktor dengan parameter.

Contoh keluaran dari soal 1 (MenuItemDriver.java) adalah sebagai berikut:
![Image of Soal2](http://api.puro.del.ac.id/v1/file/c574cd8813db9cf404c405927a73d5fc)


	
 


**Catatan Penting:**
1. Anda hanya boleh mengubah kode program yang ada di src\main\java
1. **Semua kode program yang ada di src\test\java  tidak boleh diubah sama sekali!!** Jika anda ubah (akan terlihat pada history), maka nilai anda langsung 0.
1. Jangan memindah-mindahkan file, biarkan setiap file di folder di mana file tersebut berada sebelumnya.
1. Pada beberapa template program sudah disediakan method yang tidak boleh diubah. Maka jangan anda ubah!
