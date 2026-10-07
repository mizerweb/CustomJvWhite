package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n53 {
    public final ynh a;
    public final ynh b;
    public final boolean c;
    public final boolean d;

    public n53(ynh ynhVar, ynh ynhVar2, boolean z, boolean z2) {
        this.a = ynhVar;
        this.b = ynhVar2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n53)) {
            return false;
        }
        n53 n53Var = (n53) obj;
        return cqk.d(this.a, n53Var.a) && cqk.d(this.b, n53Var.b) && this.c == n53Var.c && this.d == n53Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + nbh.n(bc1.h(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolbarState(title=");
        sb.append(this.a);
        sb.append(", bubble=");
        sb.append(this.b);
        sb.append(", showSaveToGallery=");
        return bc1.m(", showEdit=", ")", sb, this.c, this.d);
    }
}
