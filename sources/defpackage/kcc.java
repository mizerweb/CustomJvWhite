package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kcc implements lcc {
    public final ynh a;
    public final p7c b;

    public kcc(ynh ynhVar, p7c p7cVar) {
        this.a = ynhVar;
        this.b = p7cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcc)) {
            return false;
        }
        kcc kccVar = (kcc) obj;
        return cqk.d(this.a, kccVar.a) && cqk.d(this.b, kccVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        p7c p7cVar = this.b;
        return iHashCode + (p7cVar == null ? 0 : p7cVar.hashCode());
    }

    public final String toString() {
        return "Search(contentDescription=" + this.a + ", listener=" + this.b + ")";
    }

    public /* synthetic */ kcc(p7c p7cVar) {
        this(ynh.b, p7cVar);
    }
}
