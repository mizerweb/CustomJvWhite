package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zpf implements aqf {
    public final xnh a;
    public final int b;

    public zpf(xnh xnhVar, int i) {
        this.a = xnhVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpf)) {
            return false;
        }
        zpf zpfVar = (zpf) obj;
        return this.a.equals(zpfVar.a) && this.b == zpfVar.b;
    }

    public final int hashCode() {
        return qt4.D(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Text(text=" + this.a + ", alignment=" + pye.r(this.b) + ")";
    }
}
