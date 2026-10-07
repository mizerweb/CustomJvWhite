package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ai5 implements vnd {
    public final String a;
    public final tnh b;
    public final int c;

    public ai5(String str, tnh tnhVar, int i) {
        this.a = str;
        this.b = tnhVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai5)) {
            return false;
        }
        ai5 ai5Var = (ai5) obj;
        return cqk.d(this.a, ai5Var.a) && this.b.equals(ai5Var.b) && this.c == ai5Var.c;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 4L;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return 4 == k79Var.getItemId();
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.c) + zo5.c(this.b.c, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 4;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DescriptionItem(text=");
        sb.append(this.a);
        sb.append(", hint=");
        sb.append(this.b);
        sb.append(", limitCharacters=");
        return zo5.t(sb, this.c, ")");
    }
}
