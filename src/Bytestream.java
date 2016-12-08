/**
 * Created by osboxes on 08.12.16.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
public class Bytestream {

            public static void main(String[] args) throws IOException {

                ByteArrayOutputStream baos = null;
                DataOutputStream dos = null;
                byte[] buf = {87,64,72,31,90, (byte) 255};

                try{
                    // create byte array output stream
                    baos = new ByteArrayOutputStream();

                    // create data output stream
                    dos = new DataOutputStream(baos);

                    // write to the stream from the source buffer
                    dos.write(buf, 0, 6);

                    // flushes bytes to underlying output stream
                    dos.flush();

                    // for each byte in the baos buffer content
                    for(byte b:baos.toByteArray())
                    {
                        System.out.println(b & 0xFF);
                    }
                }catch(Exception e){
                    // if any error occurs
                    e.printStackTrace();
                }finally{

                    // releases all system resources from the streams
                    if(dos!=null)
                        dos.close();
                    if(baos!=null)
                        baos.close();
                }
            }
        }



