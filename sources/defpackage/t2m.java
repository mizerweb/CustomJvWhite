package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t2m {
    public static final void a(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = av7.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final b68 b(g58 g58Var) {
        return new b68(g58Var.b, g58Var.e, g58Var.h, Long.valueOf(g58Var.n), Long.valueOf(g58Var.o), Long.valueOf(g58Var.a));
    }

    public static final b68 c(hb9 hb9Var, Uri uri) {
        if (uri == null && (uri = hb9Var.d()) == null) {
            ore.p("Required value was null.");
            return null;
        }
        boolean z = false;
        if (hb9Var.a == 1) {
            String str = hb9Var.g;
            if (str != null ? z5h.K0(str, "image/gif", true) : false) {
                z = true;
            }
        }
        return new b68(uri, z, null, 56);
    }

    public static final void d(int i, String str, String str2) {
        StringBuilder sbR = c0a.r(i, "Expected ", str2, " at index ", ", but was '");
        sbR.append(str.charAt(i));
        sbR.append('\'');
        throw new IllegalArgumentException(sbR.toString());
    }
}
