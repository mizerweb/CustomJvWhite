package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ufc extends rbb {
    public final zj7 b;

    public ufc(zj7 zj7Var) {
        super(sbi.a);
        this.b = zj7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufc) && this.b == ((ufc) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenExternalMap(geoAttach=" + this.b + ")";
    }
}
