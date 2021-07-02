package com.code.socket.client;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try {

            // 1 向本机的4700端口发出客户请求，连接到 SocketServer 服务
            // 通过三次握手
            Socket socket = new Socket("127.0.0.1", 7000);

            // 2 由Socket对象得到输出流，并构造PrintWriter对象
            // 用于向 Socket 中写入数据
            PrintWriter os = new PrintWriter(socket.getOutputStream());

            // 3 由Socket对象得到输入流，并构造相应的BufferedReader对象
            // 用于从 Socket 中读取数据
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));


            // 由系统标准输入设备构造BufferedReader对象
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
            // 从系统标准输入读入一字符串
            String readline = sin.readLine();


            // 若从标准输入读入的字符串为“bye”则停止循环
            while (!readline.equals("bye")) {

                // 向 Socket 中写入数据
                os.println(readline);
                // 刷新输出流，使Server端马上收到该字符串
                os.flush();


                // 在系统标准输出上打印读入的字符串
                System.out.println("Client say:" + readline);


                // 从 Socket 中读取数据，即从Server读入一字符串，并打印到标准输出上
                System.out.println("Server say:" + is.readLine());


                // 从系统标准输入读入一字符串
                readline = sin.readLine();
            }


            // 关闭Socket输出流
            os.close();
            // 关闭Socket输入流
            is.close();
            // 关闭Socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
