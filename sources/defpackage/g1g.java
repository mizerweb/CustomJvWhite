package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g1g extends fql {
    public final xnh a;
    public final tnh b;
    public final Integer c;

    public g1g(tnh tnhVar, xnh xnhVar, Integer num) {
        this.a = xnhVar;
        this.b = tnhVar;
        this.c = num;
    }

    @Override // defpackage.fql
    public final ynh b() {
        return this.b;
    }

    @Override // defpackage.fql
    public final Integer c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1g)) {
            return false;
        }
        g1g g1gVar = (g1g) obj;
        return this.a.equals(g1gVar.a) && this.b.equals(g1gVar.b) && this.c.equals(g1gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.c(this.b.c, nbh.n(this.a.hashCode() * 31, 31, true), 31);
    }

    public final String toString() {
        return "Text(text=" + this.a + ", shouldShowMore=true, hint=" + this.b + ", hintColor=" + this.c + ")";
    }
}
