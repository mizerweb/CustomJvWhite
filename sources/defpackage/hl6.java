package defpackage;

import java.math.BigInteger;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hl6 {
    public static final BigInteger a = BigInteger.valueOf(5);
    public static final BigInteger b = BigInteger.valueOf(10000000000000000L);
    public static final BigInteger c = BigInteger.valueOf(152587890625L);
    public static final BigInteger[] d = {BigInteger.ONE, BigInteger.TEN, BigInteger.valueOf(100), BigInteger.valueOf(1000), BigInteger.valueOf(10000), BigInteger.valueOf(100000), BigInteger.valueOf(1000000), BigInteger.valueOf(10000000), BigInteger.valueOf(100000000), BigInteger.valueOf(1000000000), BigInteger.valueOf(10000000000L), BigInteger.valueOf(100000000000L), BigInteger.valueOf(1000000000000L), BigInteger.valueOf(10000000000000L), BigInteger.valueOf(100000000000000L), BigInteger.valueOf(1000000000000000L)};

    public static BigInteger a(NavigableMap navigableMap, int i) {
        BigInteger[] bigIntegerArr = d;
        if (i < bigIntegerArr.length) {
            return bigIntegerArr[i];
        }
        if (navigableMap == null) {
            return a.pow(i).shiftLeft(i);
        }
        Map.Entry entryFloorEntry = navigableMap.floorEntry(Integer.valueOf(i));
        Integer num = (Integer) entryFloorEntry.getKey();
        return num.intValue() == i ? (BigInteger) entryFloorEntry.getValue() : ip6.k((BigInteger) entryFloorEntry.getValue(), a(navigableMap, i - num.intValue()));
    }

    public static BigInteger b(TreeMap treeMap, int i) {
        int i2 = i & (-16);
        Map.Entry entryFloorEntry = treeMap.floorEntry(Integer.valueOf(i2));
        int iIntValue = ((Integer) entryFloorEntry.getKey()).intValue();
        BigInteger bigInteger = (BigInteger) entryFloorEntry.getValue();
        if (iIntValue == i2) {
            return bigInteger;
        }
        int i3 = i2 - iIntValue;
        BigInteger bigIntegerB = (BigInteger) treeMap.get(Integer.valueOf(i3));
        if (bigIntegerB == null) {
            bigIntegerB = b(treeMap, i3);
            treeMap.put(Integer.valueOf(i3), bigIntegerB);
        }
        return ip6.k(bigInteger, bigIntegerB);
    }

    public static TreeMap c() {
        TreeMap treeMap = new TreeMap();
        treeMap.put(0, BigInteger.ONE);
        treeMap.put(16, b);
        return treeMap;
    }

    public static void d(TreeMap treeMap, int i, int i2) {
        int i3 = i2 - i;
        if (i3 <= 18) {
            return;
        }
        int i4 = i2 - (((i3 + 31) >>> 5) << 4);
        int i5 = i2 - i4;
        if (treeMap.containsKey(Integer.valueOf(i5))) {
            return;
        }
        d(treeMap, i, i4);
        d(treeMap, i4, i2);
        treeMap.put(Integer.valueOf(i5), b(treeMap, i5));
    }

    public static long e(long j, long j2) {
        long j3 = j & 4294967295L;
        long j4 = j >>> 32;
        long j5 = j2 & 4294967295L;
        long j6 = j2 >>> 32;
        long j7 = j4 * j6;
        long j8 = j6 * j3;
        return j7 + ((((j4 * j5) + ((j3 * j5) >>> 32)) + (4294967295L & j8)) >>> 32) + (j8 >>> 32);
    }
}
