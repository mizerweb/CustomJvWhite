package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mnl {
    public static Object a(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            ore.p(zo5.h(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static int b(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static mae c(Integer num) {
        if (num != null) {
            for (mae maeVar : mae.values()) {
                if (maeVar.a == num.intValue()) {
                    return maeVar;
                }
            }
        }
        return mae.UNKNOWN;
    }

    public static int d(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iU = n1g.U(obj);
        int i2 = iU & i;
        int iE = e(i2, obj3);
        if (iE != 0) {
            int i3 = ~i;
            int i4 = iU & i3;
            int i5 = -1;
            while (true) {
                int i6 = iE - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) == i4 && ndl.c(obj, objArr[i6]) && (objArr2 == null || ndl.c(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i5 == -1) {
                        f(i2, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = b(iArr[i5], i8, i);
                    return i6;
                }
                int i9 = i7 & i;
                if (i9 == 0) {
                    break;
                }
                i5 = i6;
                iE = i9;
            }
        }
        return -1;
    }

    public static int e(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void f(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
