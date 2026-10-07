package defpackage;

import android.icu.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kxl {
    public static DecimalFormatSymbols a(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static boolean b(char c) {
        return ((char) (c + 65488)) < '\n';
    }

    public static boolean c(int i, char[] cArr) {
        long j = ((long) cArr[i]) | (((long) cArr[i + 1]) << 16) | (((long) cArr[i + 2]) << 32) | (((long) cArr[i + 3]) << 48);
        long j2 = (((long) cArr[i + 7]) << 48) | ((long) cArr[i + 4]) | (((long) cArr[i + 5]) << 16) | (((long) cArr[i + 6]) << 32);
        return ((((j2 + 19703549022044230L) | (j2 - 13511005043687472L)) | ((j + 19703549022044230L) | (j - 13511005043687472L))) & (-35747867511423104L)) == 0;
    }

    public static boolean d(int i, char[] cArr) {
        return (((((long) cArr[i]) | (((long) cArr[i + 1]) << 16)) | (((long) cArr[i + 2]) << 32)) | (((long) cArr[i + 3]) << 48)) == 13511005043687472L && ((((long) cArr[i + 7]) << 48) | ((((long) cArr[i + 4]) | (((long) cArr[i + 5]) << 16)) | (((long) cArr[i + 6]) << 32))) == 13511005043687472L;
    }

    public static int e(int i, CharSequence charSequence) {
        return f(((long) charSequence.charAt(i)) | (((long) charSequence.charAt(i + 1)) << 16) | (((long) charSequence.charAt(i + 2)) << 32) | (((long) charSequence.charAt(i + 3)) << 48), (((long) charSequence.charAt(i + 7)) << 48) | ((long) charSequence.charAt(i + 4)) | (((long) charSequence.charAt(i + 5)) << 16) | (((long) charSequence.charAt(i + 6)) << 32));
    }

    public static int f(long j, long j2) {
        long j3 = j - 13511005043687472L;
        long j4 = j2 - 13511005043687472L;
        if ((((j + 19703549022044230L) | j3 | (j2 + 19703549022044230L) | j4) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return (((int) ((j3 * 281475406208040961L) >>> 48)) * 10000) + ((int) ((j4 * 281475406208040961L) >>> 48));
    }

    public static long g(long j, long j2) {
        if (((j | j2) & (-71777214294589696L)) != 0) {
            return -1L;
        }
        long j3 = j * 65792;
        long j4 = 65792 * j2;
        long j5 = ((j4 & 4294901760L) >>> 16) | ((j3 & 4294901760L) << 16) | (j3 & (-281474976710656L)) | (((-281474976710656L) & j4) >>> 32);
        long j6 = j5 - 3472328296227680304L;
        long j7 = 5063812098665367110L + j5;
        long j8 = j7 & (-9187201950435737472L);
        long j9 = j5 | 2314885530818453536L;
        long j10 = j9 - 3472328296227680304L;
        if (((j6 | j7) & (-9187201950435737472L)) != ((j9 - (-2242545357980376863L)) & (-9187201950435737472L) & (j9 - 7451037802321897319L))) {
            return -1L;
        }
        long j11 = (j8 >>> 7) * 255;
        long j12 = ((~j11) & j10) | (j10 - (j11 & 2821266740684990247L));
        long j13 = (j12 | (j12 >>> 4)) & 71777214294589695L;
        long j14 = j13 | (j13 >>> 8);
        return (j14 & 65535) | ((j14 >>> 16) & 4294901760L);
    }

    public static int h(int i, char[] cArr) {
        return i((((long) cArr[i + 3]) << 48) | ((long) cArr[i]) | (((long) cArr[i + 1]) << 16) | (((long) cArr[i + 2]) << 32));
    }

    public static int i(long j) {
        long j2 = j - 13511005043687472L;
        if ((((j + 19703549022044230L) | j2) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return (int) ((j2 * 281475406208040961L) >>> 48);
    }

    public static int j(int i, int i2, CharSequence charSequence) {
        int i3 = 0;
        boolean zB = true;
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            zB &= b(cCharAt);
            i3 = ((i3 * 10) + cCharAt) - 48;
            i++;
        }
        if (zB) {
            return i3;
        }
        return -1;
    }
}
