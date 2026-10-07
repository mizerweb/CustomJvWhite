package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h1g implements vnd {
    public final fql a;

    public h1g(fql fqlVar) {
        this.a = fqlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1g) && this.a.equals(((h1g) obj).a);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 16L;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return 16 == k79Var.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(-2147483632) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return -2147483632;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        if (k79Var instanceof h1g) {
            return new kod(((h1g) k79Var).a);
        }
        return null;
    }

    public final String toString() {
        return "ShortLinkInputItem(state=" + this.a + ", viewType=-2147483632)";
    }
}
