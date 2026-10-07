package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ih5 implements vnd {
    public final tnh a;

    public ih5(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih5) && this.a.equals(((ih5) obj).a);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 128L;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return 128 == k79Var.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return np0.m;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    public final String toString() {
        return x05.g("DeleteProfileItem(text=", this.a, ")");
    }
}
