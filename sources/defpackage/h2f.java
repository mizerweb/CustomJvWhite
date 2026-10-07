package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h2f implements l2f {
    public final vc9 a;
    public final float b;

    public h2f(vc9 vc9Var, float f) {
        this.a = vc9Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2f)) {
            return false;
        }
        h2f h2fVar = (h2f) obj;
        return this.a.equals(h2fVar.a) && Float.compare(this.b, h2fVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Location(locationData=" + this.a + ", zoom=" + this.b + ")";
    }
}
