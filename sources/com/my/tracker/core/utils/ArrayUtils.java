package com.my.tracker.core.utils;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayUtils {
    public static <T extends Comparable<? super T>> int compareArrays(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return 0;
        }
        if (tArr == null || tArr2 == null) {
            return tArr == null ? -1 : 1;
        }
        int iMin = Math.min(tArr.length, tArr2.length);
        for (int i = 0; i < iMin; i++) {
            T t = tArr[i];
            T t2 = tArr2[i];
            if (t != t2) {
                if (t == null || t2 == null) {
                    return t == null ? -1 : 1;
                }
                int iCompareTo = t.compareTo(t2);
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
        }
        return tArr.length - tArr2.length;
    }
}
