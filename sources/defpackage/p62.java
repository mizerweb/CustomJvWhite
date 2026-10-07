package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p62 implements q62 {
    public final fu1 a;
    public final xnh b;
    public final xnh c;
    public final tj0 d;
    public final String e;
    public final long f;
    public final int g = 1;

    public p62(fu1 fu1Var, xnh xnhVar, xnh xnhVar2, tj0 tj0Var, String str, long j) {
        this.a = fu1Var;
        this.b = xnhVar;
        this.c = xnhVar2;
        this.d = tj0Var;
        this.e = str;
        this.f = j;
    }

    @Override // defpackage.q62
    public final long a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p62)) {
            return false;
        }
        p62 p62Var = (p62) obj;
        return cqk.d(this.a, p62Var.a) && this.b.equals(p62Var.b) && this.c.equals(p62Var.c) && this.d.equals(p62Var.d) && cqk.d(this.e, p62Var.e) && this.f == p62Var.f && this.g == p62Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return qt4.D(this.g) + qt4.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        return "Single(id=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", avatarAbbreviationModel=" + this.d + ", url=" + this.e + ", lastUpdate=" + this.f + ", titleEllipsizeMode=" + bc1.v(this.g) + ")";
    }
}
