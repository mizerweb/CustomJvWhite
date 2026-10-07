package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c9j {
    public final int a;
    public final int b;

    public c9j(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9j)) {
            return false;
        }
        c9j c9jVar = (c9j) obj;
        return this.a == c9jVar.a && this.b == c9jVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nbh.u("ViewPortSize(height=", this.a, ", width=", this.b, ")");
    }
}
