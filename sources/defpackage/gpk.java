package defpackage;

import android.os.SystemClock;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gpk {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static long d;

    public static long a() {
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b2 = 0;
            SocketTimeoutException socketTimeoutException = null;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i], 123);
                bArr2[b2] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b2);
                    bArr = bArr2;
                } else {
                    long j = jCurrentTimeMillis / 1000;
                    long j2 = jCurrentTimeMillis - (j * 1000);
                    long j3 = j + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j3 >> 24);
                    bArr[41] = (byte) (j3 >> 16);
                    bArr[42] = (byte) (j3 >> 8);
                    bArr[43] = (byte) j3;
                    long j4 = (j2 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j4 >> 24);
                    bArr[45] = (byte) (j4 >> 16);
                    bArr[46] = (byte) (j4 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j5 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b3 = bArr3[b2];
                    byte b4 = (byte) ((b3 >> 6) & 3);
                    byte b5 = (byte) (b3 & 7);
                    int i3 = bArr3[1] & 255;
                    long jF = f(24, bArr3);
                    long jF2 = f(32, bArr3);
                    long jF3 = f(40, bArr3);
                    if (b4 == 3) {
                        qr7.k("SNTP: Unsynchronized server");
                    } else if (b5 != 4 && b5 != 5) {
                        qr7.k(zo5.h(b5, "SNTP: Untrusted mode: "));
                    } else if (i3 == 0 || i3 > 15) {
                        qr7.k(zo5.h(i3, "SNTP: Untrusted stratum: "));
                    } else if (jF3 == 0) {
                        qr7.k("SNTP: Zero transmitTime");
                    }
                    long j6 = (j5 + (((jF3 - j5) + (jF2 - jF)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j6;
                } catch (SocketTimeoutException e) {
                    if (socketTimeoutException == 0) {
                        socketTimeoutException = e;
                    } else {
                        SocketTimeoutException socketTimeoutException2 = socketTimeoutException;
                        socketTimeoutException2.addSuppressed(e);
                        socketTimeoutException = socketTimeoutException2;
                    }
                    int i4 = i2 + 1;
                    if (i2 >= 10) {
                        socketTimeoutException.getClass();
                        throw socketTimeoutException;
                    }
                    i++;
                    i2 = i4;
                    b2 = b2;
                }
            }
            socketTimeoutException.getClass();
            throw socketTimeoutException;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static long[] b(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        lvb.N(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i));
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static int c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static long d(long... jArr) {
        lvb.R(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static long e(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & np0.m) == 128) {
            i2 = (i2 & 127) + np0.m;
        }
        if ((i3 & np0.m) == 128) {
            i3 = (i3 & 127) + np0.m;
        }
        if ((i4 & np0.m) == 128) {
            i4 = (i4 & 127) + np0.m;
        }
        if ((i5 & np0.m) == 128) {
            i5 = (i5 & 127) + np0.m;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public static long f(int i, byte[] bArr) {
        long jE = e(i, bArr);
        long jE2 = e(i + 4, bArr);
        if (jE == 0 && jE2 == 0) {
            return 0L;
        }
        return ((jE2 * 1000) / 4294967296L) + ((jE - 2208988800L) * 1000);
    }
}
