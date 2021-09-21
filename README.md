# Praktikum5
## Pengantar
**Inheritance** adalah konsep di mana kelas anak (sub class/child class/derived class) mewarisi semua atribut dan method yang public/protected dari kelas bapak (superclass/parent class/base class).
Atribut atau method yang diwarisi dari kelas bapak, tidak ditulis di dalam kelas anak, tapi objek dari kelas anak memiliki dan dapat memanggil method yang diwariskan oleh bapak.

## Petunjuk Praktikum
Baca instruksi yang diberikan dengan baik.
>File-file berikut ini bisa anda temukan di folder **src\main\java\praktikum4**.

#### Modul 1 **[Poin 70]** Kelas Binatang dan turunannya serta kelas Driver.
Berikut adalah diagram kelas Binatang yang sudah saya jelaskan di video pembelajaran pada sesi asinkronus minggu ini.

![Image of Gbr5.1](https://apipuro.del.ac.id/v1/file/9c99743a4040f937b3e52d5561cb7b6d)

Pada kelas diagram di atas, dapat dilihat adanya konsep inheritance/pewarisan (ditandai dengan tanda panah tertutup dari subclass ke superclass). Kelas Binatang menjadi superclass, sementara kelas Ayam, Anjing dan Kucing adalah subclass dari kelas Binatang. 
Subclass Ayam, Anjing dan Kucing mewarisi **semua atribut dan method yang tidak diberi modifier private** dari kelas Binatang.

Modul 1.a Berikut ini adalah kode program hasil implementasi diagram kelas di atas. Tulis ulang semua kode program berikut ini dan simpan di dalam folder src\main\java. Jika penulisan anda benar maka anda akan mendapat nilai full untuk testDriver.

>Kelas Binatang.java
![Image of Gbr5.2.a](https://apipuro.del.ac.id/v1/file/902511ddcc61fe078d06e1cbc20fcd6a)
![Image of Gbr5.2.b](https://apipuro.del.ac.id/v1/file/4c22f9e32cde23817646d9090b3dd58a)

>Kelas Anjing.java
![Image of Gbr5.2.a](https://apipuro.del.ac.id/v1/file/493d5c82d5664fdc057a47b6ae95140b)

>Kelas Ayam.java
![Image of Gbr5.2.a](https://apipuro.del.ac.id/v1/file/dc2fda8aa0bc155503433aa713a679d6)

>Kelas Kucing.java
![Image of Gbr5.2.a](https://apipuro.del.ac.id/v1/file/3444b2c418ee93ce6395024c8228d13c)

>Kelas Driver.java
![Image of Gbr5.2.a](https://apipuro.del.ac.id/v1/file/2eeb24bff1f20c28978dd050491c48a9)


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
