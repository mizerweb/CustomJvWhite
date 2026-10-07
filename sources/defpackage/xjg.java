package defpackage;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xjg {
    public static boolean a;
    public static final String[] b = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] c = {44100, 48000, 32000};
    public static final int[] d = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] f = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] g = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] h = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static b8a a(vre vreVar, bg7 bg7Var, azj azjVar) {
        Object obj = new Object();
        b8a b8aVar = new b8a();
        b8aVar.l(vreVar, new e99(azjVar, obj, bg7Var, b8aVar));
        return b8aVar;
    }

    public static synchronized void b() {
        if (!a) {
            yab.m0("static-webp");
            a = true;
        }
    }

    public static int c(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = c[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? d[i4 - 1] : e[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f[i4 - 1] : g[i4 - 1];
        } else {
            i6 = h[i4 - 1];
        }
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        return (((i3 == 1 ? 72 : 144) * i6) / i7) + i8;
    }

    public static int d(int i) {
        int i2;
        int i3;
        if ((i & (-2097152)) == -2097152 && (i2 = (i >>> 19) & 3) != 1 && (i3 = (i >>> 17) & 3) != 0) {
            int i4 = (i >>> 12) & 15;
            int i5 = (i >>> 10) & 3;
            if (i4 != 0 && i4 != 15 && i5 != 3) {
                if (i3 == 1) {
                    return i2 == 3 ? 1152 : 576;
                }
                if (i3 == 2) {
                    return 1152;
                }
                if (i3 == 3) {
                    return 384;
                }
                ore.a();
                return 0;
            }
        }
        return -1;
    }

    public static String e(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
