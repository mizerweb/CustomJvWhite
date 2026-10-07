package defpackage;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jo8 extends h0 {
    public static BigInteger f(CharSequence charSequence, int i, int i2, boolean z) {
        int i3 = i2 - i;
        if (i3 <= 18) {
            int i4 = (i3 & 7) + i;
            long j = kxl.j(i, i4, charSequence);
            boolean z2 = j >= 0;
            while (i4 < i2) {
                int iE = kxl.e(i4, charSequence);
                z2 &= iE >= 0;
                j = (j * 100000000) + ((long) iE);
                i4 += 8;
            }
            if (!z2) {
                throw new NumberFormatException("illegal syntax");
            }
            if (z) {
                j = -j;
            }
            return BigInteger.valueOf(j);
        }
        while (i < i2 && charSequence.charAt(i) == '0') {
            i++;
        }
        if (i2 - i > 646456993) {
            throw new NumberFormatException("value exceeds limits");
        }
        BigInteger bigInteger = hl6.a;
        TreeMap treeMap = new TreeMap();
        treeMap.put(0, BigInteger.valueOf(5L));
        treeMap.put(16, hl6.c);
        hl6.d(treeMap, i, i2);
        for (Map.Entry entry : treeMap.entrySet()) {
            entry.setValue(((BigInteger) entry.getValue()).shiftLeft(((Integer) entry.getKey()).intValue()));
        }
        BigInteger bigIntegerC = yfl.c(charSequence, i, i2, treeMap);
        return z ? bigIntegerC.negate() : bigIntegerC;
    }
}
