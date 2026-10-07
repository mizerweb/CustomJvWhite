package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zb8 implements vnd {
    public final rnh a;

    public zb8(rnh rnhVar) {
        this.a = rnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zb8) && this.a.equals(((zb8) obj).a);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 64L;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return 64 == k79Var.getItemId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.k79
    public final int j() {
        return 64;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    public final String toString() {
        return "InactiveTimeDeleteProfileItem(text=" + this.a + ")";
    }
}
