package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d05 {
    public final x0e a;
    public final boolean b;

    public d05(x0e x0eVar, boolean z) {
        this.a = x0eVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d05) {
            d05 d05Var = (d05) obj;
            if (d05Var.a.equals(this.a) && d05Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
