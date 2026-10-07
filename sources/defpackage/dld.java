package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dld implements hld {
    public final ynh a;
    public final boolean b;

    public dld(ynh ynhVar, boolean z) {
        this.a = ynhVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dld)) {
            return false;
        }
        dld dldVar = (dld) obj;
        return cqk.d(this.a, dldVar.a) && this.b == dldVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NotifyUser(text=" + this.a + ", isError=" + this.b + ")";
    }
}
