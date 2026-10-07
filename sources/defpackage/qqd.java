package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qqd extends rqd {
    public final emd a;
    public final int b;

    public qqd(emd emdVar, int i) {
        this.a = emdVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqd)) {
            return false;
        }
        qqd qqdVar = (qqd) obj;
        return this.a.equals(qqdVar.a) && this.b == qqdVar.b;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + c0a.f(1, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.b;
    }

    public final String toString() {
        String strB = jll.b(this.b);
        StringBuilder sb = new StringBuilder("Result(cellModel=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append("CHAT");
        sb.append(", itemViewType=");
        return zo5.w(sb, strB, ")");
    }
}
