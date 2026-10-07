package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class ch0 extends xv4 {
    public final Context a;
    public final pt3 b;
    public final pt3 c;
    public final String d;

    public ch0(Context context, pt3 pt3Var, pt3 pt3Var2, String str) {
        if (context == null) {
            ore.n("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (pt3Var == null) {
            ore.n("Null wallClock");
            throw null;
        }
        this.b = pt3Var;
        if (pt3Var2 == null) {
            ore.n("Null monotonicClock");
            throw null;
        }
        this.c = pt3Var2;
        if (str != null) {
            this.d = str;
        } else {
            ore.n("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xv4) {
            ch0 ch0Var = (ch0) ((xv4) obj);
            if (this.a.equals(ch0Var.a) && this.b.equals(ch0Var.b) && this.c.equals(ch0Var.c) && this.d.equals(ch0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return zo5.w(sb, this.d, "}");
    }
}
