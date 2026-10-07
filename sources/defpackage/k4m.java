package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k4m {
    public static List a(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new zk8(0, iArr.length, iArr);
    }

    public static int b(long j) {
        int i = (int) j;
        lvb.N(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    public static int c(byte[] bArr) {
        lvb.P("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
        return d(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int d(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static final void e(int i, int i2, int i3, int i4, int[] iArr) {
        if (iArr.length <= 1) {
            ore.p("Failed requirement.");
            return;
        }
        float f = i4;
        float f2 = i3;
        int i5 = (int) ((f / f2) * i);
        if (1 > i2 || i2 >= i5) {
            i2 = i5;
        } else {
            i = (int) ((f2 / f) * i2);
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public static int f(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int g(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] h(Collection collection) {
        if (collection instanceof zk8) {
            zk8 zk8Var = (zk8) collection;
            return Arrays.copyOfRange(zk8Var.a, zk8Var.b, zk8Var.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static byte[] i(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer j(String str) {
        byte b;
        Long lValueOf;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt < 128) {
                    b = wi9.a[cCharAt];
                } else {
                    byte[] bArr = wi9.a;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j = -b;
                    while (true) {
                        if (i2 >= str.length()) {
                            if (i == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i3 = i2 + 1;
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 128) {
                            b2 = wi9.a[cCharAt2];
                        } else {
                            byte[] bArr2 = wi9.a;
                            b2 = -1;
                        }
                        if (b2 >= 0 && b2 < 10 && j >= -922337203685477580L) {
                            long j2 = j * 10;
                            long j3 = b2;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i2 = i3;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }
}
