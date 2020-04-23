Pada source code terdapat 5 class, yaitu class main, linkedList, dan 3 class untuk menyimpan node per tahun. 

1. Menggunakan method addFirst untuk mengisi data pertama, pada LinkedLists data pertama disebut head, 
sehingga data baru langsung dimasukkan ke head.

2. Untuk memasukkan data selanjutnya, menggunakan method addLast, yaitu memasukkan data ke node next, dilakukan pengecekan, 
apabila linkedlist sedang kosong, maka dipanggil method addFirst, jika tidak, maka semua data dilakukan proses traverse lalu data yang 
baru diinputkan diakhir perulangan traverse.

3. Print menggunakan traverse, yaitu data akan disimpan sementara pada variabel tertentu lalu ditampilkan, dan variabel
 tersebut akan diganti dengan node next lalu isi variabel tersebut adalah data baru yang akan ditampilkan lagi, terus berulang seperti 
itu hingga variabel bernilai null atau tidak ada data lagi yang bisa ditampilkan.