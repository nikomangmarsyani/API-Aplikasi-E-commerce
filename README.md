# API-Aplikasi-E-commerce

Backend API aplikasi e-commerce yang telah saya buat terdiri dari entitas addresses, users, products, orders, order details, dan reviews yang memiliki beberapa komponen yang berhubungan dengan setiap entitas tersebut. Berikut adalah penjelasan singkat mengenai hal-hal yang ada dan diperlukan dalam pembuatan backend API aplikasi e-commerce.

Pada folder Controller terdapat beberapa file yang dibuat dengan tujuan untuk mengontrol request GET, POST, PUT, DELETE. Berikut adalah beberapa request yang ada pada file ControllerOrders.
![image](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/e3f1639d-a8a0-40d3-8524-7da7097cbd80)

Pada folder ErrorHandler terdapat file yang berfungsi untuk menghandle error yang mungkin terjadi.
![image](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/0f073dec-1220-44ae-ad54-a1f800572c1e)

Pada folder Models terdapat class-class dari table yang ada pada database yang telah dibuat.
![image](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/c0a13917-3934-4a8b-8f07-c92a47760925)

Pada folder Repository ini terdapat beberapa file interface yang meng-inheritence JpaRepository.
![image](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/a8c3aada-1e8e-48f5-98d3-5048e320972e)

Pada folder resources terdapat terdapat file application.properties yang bertugas untuk mengatur akses ke database serta mengatur port sesuai dengan ketentuan yang telah diberikan yaitu 8 dan diikuti dengan 3 digit NIM terakhir yaitu 052, sehingga portnya adalah 8052.
![image](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/b7b6cae7-88f9-462f-86ad-f1f1bca13cf6)

File DemoApplication berfungsi sebagai main class untuk menjalankan program.
![image](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/edc3a95a-f66a-429a-8dd3-d82b31737416)

Berikut adalah tampilan terminal setelah program dijalankan.
![image](https://github.com/nikomangmarsyani/API-Aplikasi-E-commerce/assets/113657483/cd5f5467-a540-4bdf-b5f6-911ed97b5378)

