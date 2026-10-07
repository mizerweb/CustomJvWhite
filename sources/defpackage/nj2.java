package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nj2 implements vnd {
    public final ynh a;

    public nj2(ynh ynhVar) {
        this.a = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nj2) && this.a.equals(((nj2) obj).a);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 256L;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return 256 == k79Var.getItemId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return np0.n;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    public final String toString() {
        return "CancelDeleteProfileItem(text=" + this.a + ")";
    }
}
