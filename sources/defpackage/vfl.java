package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import java.math.BigInteger;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vfl {
    public static IBinder a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    public static BigInteger b(char[] cArr, int i, int i2) {
        int i3 = i2 - i;
        BigInteger bigInteger = hl6.a;
        jrc jrcVar = new jrc(((((long) i3) * 3402) >>> 10) + 1);
        int i4 = (i3 & 7) + i;
        int i5 = 0;
        boolean zB = true;
        while (i < i4) {
            char c = cArr[i];
            zB &= kxl.b(c);
            i5 = ((i5 * 10) + c) - 48;
            i++;
        }
        if (!zB) {
            i5 = -1;
        }
        boolean z = i5 >= 0;
        jrcVar.f(i5);
        while (i4 < i2) {
            int iF = kxl.f(((long) cArr[i4]) | (((long) cArr[i4 + 1]) << 16) | (((long) cArr[i4 + 2]) << 32) | (((long) cArr[i4 + 3]) << 48), ((long) cArr[i4 + 4]) | (((long) cArr[i4 + 5]) << 16) | (((long) cArr[i4 + 6]) << 32) | (((long) cArr[i4 + 7]) << 48));
            z &= iF >= 0;
            jrcVar.n(iF);
            i4 += 8;
        }
        if (z) {
            return jrcVar.D();
        }
        throw new NumberFormatException("illegal syntax");
    }

    public static BigInteger c(char[] cArr, int i, int i2, TreeMap treeMap) {
        int i3 = i2 - i;
        if (i3 <= 400) {
            return b(cArr, i, i2);
        }
        BigInteger bigInteger = hl6.a;
        int i4 = i2 - (((i3 + 31) >>> 5) << 4);
        return c(cArr, i4, i2, treeMap).add(ip6.k(c(cArr, i, i4, treeMap), (BigInteger) treeMap.get(Integer.valueOf(i2 - i4))));
    }

    public static void d(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
