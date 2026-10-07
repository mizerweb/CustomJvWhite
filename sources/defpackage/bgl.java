package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bgl {
    public static byte[] a(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static final Long b(String str) {
        Object poeVar;
        Long lValueOf;
        if (str != null) {
            try {
                lValueOf = Long.valueOf(new BigInteger(str).longValue());
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
        } else {
            lValueOf = null;
        }
        poeVar = lValueOf;
        return (Long) (poeVar instanceof poe ? null : poeVar);
    }

    public static byte[] c(y61 y61Var) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(np0.m, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = y61Var.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return a(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j < -2147483648L ? Integer.MIN_VALUE : (int) j;
            }
        }
        if (y61Var.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
