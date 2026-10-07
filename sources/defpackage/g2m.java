package defpackage;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g2m {
    public static int a;

    public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (!d(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !d(b3) && !d(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.a();
    }

    public static void b(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (b < -62 || d(b2)) {
            throw InvalidProtocolBufferException.a();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static void c(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || d(b3)))) {
            throw InvalidProtocolBufferException.a();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    public static boolean d(byte b) {
        return b > -65;
    }
}
