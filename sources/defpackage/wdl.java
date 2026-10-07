package defpackage;

import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wdl {
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
    
        if (r7 != 4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdl.a(java.lang.String):byte[]");
    }

    public static byte[] b(int i, byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        byte[] bArr2 = (i & 8) == 0 ? up0.b : up0.c;
        int i3 = z2 ? 19 : -1;
        int i4 = (length / 3) * 4;
        if (!z) {
            int i5 = length % 3;
            if (i5 == 1) {
                i4 += 2;
            } else if (i5 == 2) {
                i4 += 3;
            }
        } else if (length % 3 > 0) {
            i4 += 4;
        }
        if (z2 && length > 0) {
            i4 += ((length - 1) / 57) + 1;
        }
        byte[] bArr3 = new byte[i4];
        int i6 = i3;
        int i7 = 0;
        while (true) {
            int i8 = i2 + 3;
            if (i8 > length) {
                break;
            }
            int i9 = (bArr[i2 + 2] & 255) | ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
            bArr3[i7] = bArr2[(i9 >> 18) & 63];
            bArr3[i7 + 1] = bArr2[(i9 >> 12) & 63];
            bArr3[i7 + 2] = bArr2[(i9 >> 6) & 63];
            bArr3[i7 + 3] = bArr2[i9 & 63];
            int i10 = i7 + 4;
            i6--;
            if (i6 == 0) {
                i7 += 5;
                bArr3[i10] = 10;
                i6 = 19;
            } else {
                i7 = i10;
            }
            i2 = i8;
        }
        if (i2 == length - 1) {
            int i11 = (bArr[i2] & 255) << 4;
            bArr3[i7] = bArr2[(i11 >> 6) & 63];
            int i12 = i7 + 2;
            bArr3[i7 + 1] = bArr2[i11 & 63];
            if (z) {
                bArr3[i12] = 61;
                i12 = i7 + 4;
                bArr3[i7 + 3] = 61;
            }
            if (z2) {
                bArr3[i12] = 10;
                return bArr3;
            }
        } else if (i2 == length - 2) {
            int i13 = ((bArr[i2 + 1] & 255) << 2) | ((bArr[i2] & 255) << 10);
            bArr3[i7] = bArr2[(i13 >> 12) & 63];
            bArr3[i7 + 1] = bArr2[(i13 >> 6) & 63];
            int i14 = i7 + 3;
            bArr3[i7 + 2] = bArr2[i13 & 63];
            if (z) {
                bArr3[i14] = 61;
                i14 = i7 + 4;
            }
            if (z2) {
                bArr3[i14] = 10;
                return bArr3;
            }
        } else if (z2 && i7 > 0 && i6 != 19) {
            bArr3[i7] = 10;
        }
        return bArr3;
    }

    public static String c(int i, byte[] bArr) {
        try {
            return new String(b(i, bArr), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            c.e(e);
            return null;
        }
    }

    public static final Object d(i18 i18Var, zo zoVar, uo uoVar, List list) throws InterruptedIOException {
        lsb lsbVar;
        ksb ksbVar = new ksb(zoVar, uoVar);
        if (list.size() <= 0) {
            try {
                lsbVar = new lsb(i18Var.a(zoVar, uoVar));
            } catch (InterruptedIOException e) {
                if (!(zoVar instanceof jsb)) {
                    throw e;
                }
                lsbVar = new lsb(((jsb) zoVar).handleInterruptedIO());
            }
        } else {
            lsbVar = ((isb) list.get(0)).intercept(new a9m(i18Var, ksbVar, list, 1, 9));
        }
        return lsbVar.a;
    }
}
