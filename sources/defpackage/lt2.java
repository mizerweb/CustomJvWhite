package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lt2 {
    public static final char[] a;
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final byte[] c;
    public static final byte[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;

    static {
        int i2;
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        a = cArr;
        int length = cArr.length;
        c = new byte[length];
        d = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            c[i3] = (byte) a[i3];
            d[i3] = (byte) b[i3];
        }
        int[] iArr = new int[np0.n];
        for (int i4 = 0; i4 < 32; i4++) {
            iArr[i4] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        e = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i5 = 128; i5 < 256; i5++) {
            if ((i5 & 224) == 192) {
                i2 = 2;
            } else if ((i5 & 240) == 224) {
                i2 = 3;
            } else {
                i2 = (i5 & 248) == 240 ? 4 : -1;
            }
            iArr2[i5] = i2;
        }
        f = iArr2;
        int[] iArr3 = new int[np0.n];
        Arrays.fill(iArr3, -1);
        for (int i6 = 33; i6 < 256; i6++) {
            if (Character.isJavaIdentifierPart((char) i6)) {
                iArr3[i6] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        g = iArr3;
        int[] iArr4 = new int[np0.n];
        System.arraycopy(iArr3, 0, iArr4, 0, np0.n);
        Arrays.fill(iArr4, np0.m, np0.m, 0);
        h = iArr4;
        int[] iArr5 = new int[np0.n];
        int[] iArr6 = f;
        System.arraycopy(iArr6, np0.m, iArr5, np0.m, np0.m);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        i = iArr5;
        int[] iArr7 = new int[np0.n];
        System.arraycopy(iArr6, np0.m, iArr7, np0.m, np0.m);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        int[] iArr8 = new int[np0.m];
        for (int i7 = 0; i7 < 32; i7++) {
            iArr8[i7] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        j = iArr8;
        int[] iArrCopyOf = Arrays.copyOf(iArr8, iArr8.length);
        k = iArrCopyOf;
        iArrCopyOf[47] = 47;
        int[] iArr9 = new int[np0.n];
        l = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i8 = 0; i8 < 10; i8++) {
            l[i8 + 48] = i8;
        }
        for (int i9 = 0; i9 < 6; i9++) {
            int[] iArr10 = l;
            int i10 = i9 + 10;
            iArr10[i9 + 97] = i10;
            iArr10[i9 + 65] = i10;
        }
    }
}
