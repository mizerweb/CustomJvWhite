package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class sp5 {
    public final Context a;
    public final ym5 b;
    public final x71 c;

    public sp5(Context context, ym5 ym5Var, x71 x71Var) {
        this.a = context;
        this.b = ym5Var;
        this.c = x71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sp5) {
            sp5 sp5Var = (sp5) obj;
            return cqk.d(this.a, sp5Var.a) && this.b.equals(sp5Var.b) && this.c == sp5Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DownloadArgs(context=" + this.a + ", videoSource=" + this.b + ", cacheLoadParams=" + this.c + ")";
    }
}
