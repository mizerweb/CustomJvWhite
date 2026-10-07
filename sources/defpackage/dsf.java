package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dsf implements esf {
    public final int a;
    public final boolean b;
    public final p0c c;

    public dsf(int i, int i2) {
        boolean z = (i2 & 2) == 0;
        p0c p0cVar = (i2 & 4) != 0 ? p0c.b : p0c.a;
        this.a = i;
        this.b = z;
        this.c = p0cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsf)) {
            return false;
        }
        dsf dsfVar = (dsf) obj;
        return this.a == dsfVar.a && this.b == dsfVar.b && this.c == dsfVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + nbh.n(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Count(count=" + this.a + ", animated=" + this.b + ", appearance=" + this.c + ")";
    }
}
