package com.code.socket.server;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;
        try {

            // 1 创建一个 ServerSocket ，并在端口 7000 监听客户端请求
            server = new ServerSocket(7000);

            // 2  使用 accept 阻塞等待客户端连接请求，有客户端请求到来，则产生一个 Socket 对象，并继续执行
            socket = server.accept();
            System.out.println("Server 从阻塞中醒来！");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3 通过 Socket 进行通信
        String line = null;
        try {

            // 3.1  由Socket对象得到输入流，并构造相应的BufferedReader对象
            // 用于从 Socket 中读取数据，没有数据可读取就会阻塞等待
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 3.2 由Socket对象得到输出流，并构造PrintWriter对象
            // 用于向 Socket 写入数据
            PrintWriter os = new PrintWriter(socket.getOutputStream());

            // 3.3 从 Socket 中读取来自客户端的数据，并在在标准输出上打印
            System.out.println("Client say: " + is.readLine());

            // 由系统标准输入设备构造BufferedReader对象
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
            // 从标准输入读入数据
            line = sin.readLine();


            // 如果读入的字符串为“bye”，则停止循环
            while (!line.equals("bye")) {
                // 3.4 向 Socket 写入数据，即向客户端输出该字符串
                os.println(line);
                // 刷新输出流，使Client马上收到该字符串
                os.flush();


                // 在系统标准输出上打印读入的字符串
                System.out.println("Server:" + line);


                // 3.5 从 Socket 中读取来自客户端的数据，并打印到标准输出上
                System.out.println("Client:" + is.readLine());


                // 从系统标准输入读入一个字符串
                line = sin.readLine();
            }


            // 关闭Socket输出流
            os.close();
            // 关闭Socket输入流
            is.close();
            // 关闭Socket
            socket.close();
            // 关闭ServerSocket
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
