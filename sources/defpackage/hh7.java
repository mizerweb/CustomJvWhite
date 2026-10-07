package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hh7 extends mh7 {
    public final String a;
    public final List b;
    public final bh7 c;

    public hh7(String str, String str2, List list) {
        bh7 bh7Var = new bh7(str2);
        this.a = str;
        this.b = list;
        this.c = bh7Var;
    }

    @Override // defpackage.mh7
    public final String[] a(gh7 gh7Var) {
        return new String[]{this.a};
    }

    @Override // defpackage.mh7
    public final String b() {
        return this.a;
    }

    @Override // defpackage.mh7
    public final ch7 c() {
        return this.c;
    }

    @Override // defpackage.mh7
    public final List d() {
        return this.b;
    }

    @Override // defpackage.mh7
    public final String e(gh7 gh7Var) {
        return nbh.v(gh7Var.a, " AND ", gh7Var.b(), " = ?");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh7)) {
            return false;
        }
        hh7 hh7Var = (hh7) obj;
        return cqk.d(this.a, hh7Var.a) && this.b.equals(hh7Var.b) && this.c.equals(hh7Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + qv1.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Real(id=" + this.a + ", queryParams=" + this.b + ", name=" + this.c + ")";
    }
}
