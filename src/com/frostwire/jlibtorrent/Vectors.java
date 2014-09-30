package com.frostwire.jlibtorrent;

import com.frostwire.jlibtorrent.swig.char_vector;
import com.frostwire.jlibtorrent.swig.int64_vector;
import com.frostwire.jlibtorrent.swig.int_vector;
import com.frostwire.jlibtorrent.swig.unsigned_char_vector;

/**
 * @author gubatron
 * @author aldenml
 */
public final class Vectors {

    private Vectors() {
    }

    public static byte[] char_vector2bytes(char_vector v) {
        int size = (int) v.size();
        byte[] arr = new byte[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (byte) v.get(i);
        }

        return arr;
    }

    public static void char_vector2bytes(char_vector v, byte[] arr) {
        int size = (int) v.size();

        for (int i = 0; i < size; i++) {
            arr[i] = (byte) v.get(i);
        }
    }

    public static char_vector bytes2char_vector(byte[] arr) {
        char_vector v = new char_vector();

        for (int i = 0; i < arr.length; i++) {
            v.add((char) arr[i]);
        }

        return v;
    }

    public static unsigned_char_vector bytes2unsigned_char_vector(byte[] arr) {
        unsigned_char_vector v = new unsigned_char_vector();

        for (int i = 0; i < arr.length; i++) {
            v.add((short) arr[i]);
        }

        return v;
    }

    public static int_vector bytes2int_vector(byte[] arr) {
        int_vector v = new int_vector();

        for (int i = 0; i < arr.length; i++) {
            v.add(arr[i]);
        }

        return v;
    }

    public static int_vector ints2int_vector(int[] arr) {
        int_vector v = new int_vector();

        for (int i = 0; i < arr.length; i++) {
            v.add(arr[i]);
        }

        return v;
    }

    public static int[] int_vector2ints(int_vector v) {
        int size = (int) v.size();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = v.get(i);
        }

        return arr;
    }

    public static long[] int64_vector2longs(int64_vector v) {
        int size = (int) v.size();
        long[] arr = new long[size];

        for (int i = 0; i < size; i++) {
            arr[i] = v.get(i);
        }

        return arr;
    }

    public static unsigned_char_vector new_unsigned_char_vector(int size) {
        unsigned_char_vector v = new unsigned_char_vector();
        for (int i = 0; i < size; i++) {
            v.add((short) 0);
        }

        return v;
    }

    public static char_vector new_char_vector(int size) {
        char_vector v = new char_vector();
        for (int i = 0; i < size; i++) {
            v.add((char) 0);
        }

        return v;
    }
}