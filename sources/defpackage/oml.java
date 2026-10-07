package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oml {
    public static final String a(int[] iArr) {
        char[] cArr = new char[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) iArr[i];
        }
        return new String(cArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final or3 b(View view, boolean z, boolean z2) {
        pr3 pr3Var = view instanceof pr3 ? (pr3) view : null;
        if (pr3Var != null) {
            return pr3Var.B0(z, z2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(View view) {
        if (view instanceof pr3) {
        }
    }
}
