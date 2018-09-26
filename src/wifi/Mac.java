package wifi;

import com.sun.javaws.progress.Progress;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: 束手就擒
 * @Date: 18-9-17 下午2:41
 * @Description:
 */
public class Mac {

    /*执行脚本*/
    public static void main(String[] args) {
        //创建文件对象，指定要读取的文件路径(要读的文件一定要存在)
        File file=new File("/proc/net/arp");

        try {
            //创建文件输入流对象.指定要读取的文件对象
            FileInputStream fin=new FileInputStream(file);

            /***********方法一(将输入流的数据传递给字节数组)*********/
//            //创建字节数组，准备将文件流中的数据传给字节数组
//            byte[] b=new byte[fin.available()];
//
//            //将字节流中的数据传递给字节数组
//            fin.read(b);
//
//            //将字节数组转为字符串
//            String s=new String(b);
//
//            System.out.println(s);
            /*********************************************/

            /********方法二(逐字节读取数据从字节输入流)***********/
            int l;
            while ((l=fin.read())!=-1) {
                System.out.print((char)l);
                //测试read()方法的含义，什么是逐字节读，及int类型的l代表什么意思，测试结果l代表存储的内容的int的表现形式，与进制相关，不做深究
                //System.out.println((char)l+"\t"+l);
            }

            fin.close();
            /************************************************/

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    
}
