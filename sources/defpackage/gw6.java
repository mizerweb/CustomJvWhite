package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gw6 implements vnd {
    public final String a;
    public final sx3 b;

    public gw6(String str, sx3 sx3Var) {
        this.a = str;
        this.b = sx3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw6)) {
            return false;
        }
        gw6 gw6Var = (gw6) obj;
        return cqk.d(this.a, gw6Var.a) && cqk.d(this.b, gw6Var.b);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 1L;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return 1 == k79Var.getItemId();
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        sx3 sx3Var = this.b;
        return iHashCode + (sx3Var != null ? sx3Var.a.hashCode() : 0);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 1;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        if (k79Var instanceof gw6) {
            return new iod(((gw6) k79Var).b);
        }
        return null;
    }

    public final String toString() {
        return "FirstNameItem(text=" + this.a + ", errorText=" + this.b + ")";
    }
}
