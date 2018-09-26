package wifi;

import object.ArpTable;

import java.io.*;
import java.util.LinkedList;

/**
 * @Author: 束手就擒
 * @Date: 18-9-19 下午2:10
 * @Description:
 */
public class BufferedInputFIle {
    public static LinkedList<ArpTable> read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String str;
        in.readLine();
        LinkedList<ArpTable> arpTables = new LinkedList<>();
        while((str = in.readLine()) != null){
            String [] arr = str.split("\\s+");
            ArpTable arpTable = new ArpTable();
            arpTable.setIpAddress(arr[0]);
            arpTable.setHwType(arr[1]);
            arpTable.setFlags(arr[2]);
            arpTable.setHwAddress(arr[3]);
            arpTable.setMask(arr[4]);
            arpTable.setDevice(arr[5]);
            arpTables.add(arpTable);
        }

        in.close();
        return arpTables;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("/proc/net/arp"));

    }
}
