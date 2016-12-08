import java.nio.ByteBuffer;

/**
 * Created by osboxes on 07.12.16.
 */
public class Test {
    public static void main(String[] args){
        byte[] data =
            {
                    (byte)0x01,
                    (byte)0x02,
                    (byte)0x7F,
                    (byte)0x80
            };

        for (byte current : data)
        {
            String output = String.format("0x%x, 0x%x", current, (int)current);
            System.out.println(output);
            System.out.println(0x000000FF & (int)current);
            System.out.println(current);

        }
        int i = 255;
        byte b = (byte) i;
        System.out.println("b = " + b); // b = -1
        int i2 = b & 0xFF;
        System.out.println("i2 = " + i2); // i2 = 255+-
        int i3 = 64574;

        for(int p=0; p<8; p++){
            short s1 = (short) (i3 >> p);

            System.out.println(s1);
        }


        //ByteBuffer.wrap()

        System.out.println(new String(Integer.toString(i3)).getBytes().length);
        short val =129;
        byte biu = (byte)val;
        System.out.println(biu);

        System.out.println(biu & 0xFF); // prints 233.


    }

}
