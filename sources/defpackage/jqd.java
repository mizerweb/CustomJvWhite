package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jqd extends erd {
    public final int a;
    public final int b;

    public jqd(int i) {
        this.a = i;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jqd) && this.a == ((jqd) obj).a;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 256L;
    }

    public final int hashCode() {
        return Integer.hashCode(-1) + (Integer.hashCode(this.a) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.b;
    }

    public final String toString() {
        return c0a.o("Attaches(itemViewType=", jll.b(this.a), ", count=-1)");
    }
}
