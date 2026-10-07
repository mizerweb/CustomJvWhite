package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lqd extends erd {
    public final CharSequence a;
    public final int b;
    public final int c;

    public lqd(int i, CharSequence charSequence) {
        this.a = charSequence;
        this.b = i;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqd)) {
            return false;
        }
        lqd lqdVar = (lqd) obj;
        return cqk.d(this.a, lqdVar.a) && this.b == lqdVar.b;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 8L;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.c;
    }

    public final String toString() {
        return "ChatDescription(text=" + ((Object) this.a) + ", itemViewType=" + jll.b(this.b) + ")";
    }
}
