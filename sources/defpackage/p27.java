package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p27 implements k79 {
    public final tnh a;
    public final long b;

    public p27(tnh tnhVar, long j) {
        this.a = tnhVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p27)) {
            return false;
        }
        p27 p27Var = (p27) obj;
        return this.a.equals(p27Var.a) && this.b == p27Var.b;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a.c) * 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return 32;
    }

    public final String toString() {
        return "FolderEditHeaderItem(headerText=" + this.a + ", itemId=" + this.b + ")";
    }
}
