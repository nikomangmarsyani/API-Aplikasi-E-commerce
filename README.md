# API-Aplikasi-E-commerce

Backend API aplikasi e-commerce yang telah saya buat terdiri dari entitas addresses, users, products, orders, order details, dan reviews yang memiliki beberapa komponen yang berhubungan dengan setiap entitas tersebut. Berikut adalah penjelasan singkat mengenai hal-hal yang ada dan diperlukan dalam pembuatan backend API aplikasi e-commerce.

Pada folder Controller terdapat beberapa file yang dibuat dengan tujuan untuk mengontrol request GET, POST, PUT, DELETE. Berikut adalah beberapa request yang ada pada file ControllerOrders.
![Screenshot (933)](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/53e8f959-f7a3-4a91-a9fa-0d820e65bcc1)

Pada folder ErrorHandler terdapat file yang berfungsi untuk menghandle error yang mungkin terjadi.
![Screenshot (934)](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/743de8c8-3a93-436c-bde5-029a0730cae3)

Pada folder Models terdapat class-class dari table yang ada pada database yang telah dibuat.
![Screenshot (935)](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/26a144e2-490a-4221-9300-c4b6fc0f7d3f)

Pada folder Repository ini terdapat beberapa file interface yang meng-inheritence JpaRepository.
![Screenshot (936)](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/15cfd475-4019-4132-87ce-9c78dd074d06)

Pada folder resources terdapat terdapat file application.properties yang bertugas untuk mengatur akses ke database serta mengatur port sesuai dengan ketentuan yang telah diberikan yaitu 8 dan diikuti dengan 3 digit NIM terakhir yaitu 052, sehingga portnya adalah 8052.
![Screenshot (937)](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/28f2d066-4eb2-4731-9065-6bf0ae353cf8)

File DemoApplication berfungsi sebagai main class untuk menjalankan program.
![Screenshot (939)](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/e90ba6c3-e7c4-4315-aca2-435b31283b95)

Berikut adalah tampilan terminal setelah program dijalankan.
![Screenshot (940)](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/7b76df72-b8d4-4e46-b5c2-ee9a0a03d29b)

Pada aplikasi Postman, tambahkan request baru. Pertama-tama saya mencoba request GET dan menuliskan url seperti yang dapat dilihat pada gambar di bawah ini. 
![Screenshot (941)](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/7808433e-3669-4ab2-8cbd-c3aa0c84c3e7)

Setelas send request, akan muncul beberapa data seperti yang dapat dilihat pada gambar di bawah ini.
![Screenshot (945)](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/f1892a39-5bb1-4386-b8b6-367677f03fa4)

Kemudian saya mencoba request POST dan menuliskan url seperti pada gambar di bawah ini. 
![Screenshot (948)](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/7e99cee1-32cd-4ea9-916b-fe5b5a672b0d)

Selanjutnya saya mencoba request PUT dan menuliskan url seperti gambar di bawah ini.
![Screenshot (950)](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/fab78272-9517-4ac4-beda-18fb13b2ca53)

Dan terakhir saya mencoba request DELETE dan menuliskan url seperti gambar di bawah ini.
![Screenshot (951)](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/9127dc8f-15bc-4e5c-8aa5-54562870cf84)

Sekian yang dapat saya sampaikan dalam file readme ini, untuk lebih lengkap dan jelasnya dapat dilihat pada kode program yang telah ada pada main branch
