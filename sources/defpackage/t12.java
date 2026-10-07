package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t12 {
    public final tnh a;
    public final ynh b;

    public t12(tnh tnhVar, ynh ynhVar) {
        this.a = tnhVar;
        this.b = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t12)) {
            return false;
        }
        t12 t12Var = (t12) obj;
        return this.a.equals(t12Var.a) && cqk.d(this.b, t12Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.c) * 31;
        ynh ynhVar = this.b;
        return (iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 29791;
    }

    public final String toString() {
        return "QuoteData(title=" + this.a + ", body=" + this.b + ", image=null, count=null, placeholder=null)";
    }
}
