package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class k4e implements ddd, Serializable {
    public static final /* synthetic */ int c = 0;
    public final yz4 a;
    public final yz4 b;

    static {
        new k4e(wz4.d, wz4.c);
    }

    public k4e(yz4 yz4Var, yz4 yz4Var2) {
        this.a = yz4Var;
        this.b = yz4Var2;
        if (yz4Var.compareTo(yz4Var2) > 0 || yz4Var == wz4.c || yz4Var2 == wz4.d) {
            StringBuilder sb = new StringBuilder(16);
            yz4Var.b(sb);
            sb.append("..");
            yz4Var2.d(sb);
            ore.p("Invalid range: ".concat(sb.toString()));
            throw null;
        }
    }

    public static k4e a(Long l, Long l2) {
        return new k4e(new wz4(l, 2), new xz4(l2));
    }

    @Override // defpackage.ddd
    public final boolean apply(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return this.a.i(comparable) && !this.b.i(comparable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k4e)) {
            return false;
        }
        k4e k4eVar = (k4e) obj;
        return this.a.equals(k4eVar.a) && this.b.equals(k4eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.a.b(sb);
        sb.append("..");
        this.b.d(sb);
        return sb.toString();
    }
}
