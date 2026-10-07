package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zqk {
    public static final void a(l1c l1cVar, g58 g58Var, tz0 tz0Var, boolean z) {
        Uri uri = g58Var.b;
        if (!z) {
            uri = null;
        }
        Uri uri2 = g58Var.h;
        if (uri2 == null) {
            uri2 = uri;
        }
        if (uri2 == null) {
            l1c.j(l1cVar, null, null, 6);
            return;
        }
        w78 w78VarD = w78.d(uri2);
        w78VarD.d = g58Var.i;
        w78VarD.k = tz0Var;
        if (uri2 == uri && g58Var.g) {
            w78VarD.b = u78.DISK_CACHE;
        }
        l1c.j(l1cVar, w78VarD.a(), null, 6);
        ((wj7) l1cVar.getHierarchy()).h(g58Var.j);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public static final int b(wcf wcfVar, int i) {
        int i2;
        int[] iArr = wcfVar.f;
        int i3 = i + 1;
        int length = wcfVar.e.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            i2 = (i4 + length) >>> 1;
            int i5 = iArr[i2];
            if (i5 < i3) {
                i4 = i2 + 1;
            } else {
                if (i5 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                length = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }
}
