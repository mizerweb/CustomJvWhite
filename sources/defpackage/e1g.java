package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e1g implements vnd {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e1g);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 8L;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return 8 == k79Var.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(536870920);
    }

    @Override // defpackage.k79
    public final int j() {
        return 536870920;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    public final String toString() {
        return "ShortLinkHeaderItem(viewType=536870920)";
    }
}
