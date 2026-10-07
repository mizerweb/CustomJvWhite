package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j1e {
    public final d1e a;
    public final xnh b;

    public j1e(d1e d1eVar, xnh xnhVar) {
        this.a = d1eVar;
        this.b = xnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1e)) {
            return false;
        }
        j1e j1eVar = (j1e) obj;
        return this.a.equals(j1eVar.a) && this.b.equals(j1eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QualityItem(qualityOption=" + this.a + ", formattedQuality=" + this.b + ")";
    }
}
