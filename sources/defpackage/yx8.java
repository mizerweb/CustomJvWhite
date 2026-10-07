package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yx8 implements vnd {
    public final String a;
    public final sx3 b;

    public yx8(String str, sx3 sx3Var) {
        this.a = str;
        this.b = sx3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx8)) {
            return false;
        }
        yx8 yx8Var = (yx8) obj;
        return cqk.d(this.a, yx8Var.a) && cqk.d(this.b, yx8Var.b);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 2L;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return 2 == k79Var.getItemId();
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
        return 2;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        if (k79Var instanceof yx8) {
            return new jod(((yx8) k79Var).b);
        }
        return null;
    }

    public final String toString() {
        return "LastNameItem(text=" + this.a + ", errorText=" + this.b + ")";
    }
}
