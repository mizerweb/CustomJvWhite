package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class st9 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public st9(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == st9.class) {
            st9 st9Var = (st9) obj;
            if (TextUtils.equals(this.a, st9Var.a) && this.b == st9Var.b && this.c == st9Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((zo5.d(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
