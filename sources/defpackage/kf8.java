package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class kf8 {
    public final Context a;
    public final q36 b;
    public final pni c;

    public kf8(Context context, q36 q36Var, pni pniVar) {
        this.a = context;
        this.b = q36Var;
        this.c = pniVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kf8) {
            kf8 kf8Var = (kf8) obj;
            return cqk.d(this.a, kf8Var.a) && this.b == kf8Var.b && this.c == kf8Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InitArgs(context=" + this.a + ", config=" + this.b + ", onResult=" + this.c + ")";
    }
}
