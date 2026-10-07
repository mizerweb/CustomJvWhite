package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a80 {
    public static final a80 d = new a80(5, "", "");
    public final int a;
    public final String b;
    public final String c;

    public a80(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a80)) {
            return false;
        }
        a80 a80Var = (a80) obj;
        return this.a == a80Var.a && cqk.d(this.b, a80Var.b) && cqk.d(this.c, a80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.d(qt4.D(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioDevice(type=");
        sb.append(p.p(this.a));
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", id=");
        return zo5.w(sb, this.c, ")");
    }
}
