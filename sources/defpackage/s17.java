package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s17 implements k79 {
    public final int a;
    public final ynh b;
    public final int c;
    public final long d;
    public final int e;

    public s17(int i, ynh ynhVar, int i2, long j, int i3) {
        this.a = i;
        this.b = ynhVar;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s17)) {
            return false;
        }
        s17 s17Var = (s17) obj;
        return this.a == s17Var.a && this.b.equals(s17Var.b) && this.c == s17Var.c && this.d == s17Var.d && this.e == s17Var.e;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + qt4.g(c0a.f(this.c, bc1.h(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.e;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("FolderActionItem(iconRes=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", type=");
        int i = this.c;
        if (i != 1) {
            str = i != 2 ? "null" : "NEGATIVE";
        } else {
            str = "THEMED";
        }
        sb.append(str);
        sb.append(", itemId=");
        sb.append(this.d);
        return qv1.o(sb, ", viewType=", this.e, ")");
    }
}
