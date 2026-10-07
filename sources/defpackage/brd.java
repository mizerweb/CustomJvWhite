package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class brd extends erd {
    public final int a;
    public final int b;
    public final int c;

    public brd(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brd)) {
            return false;
        }
        brd brdVar = (brd) obj;
        return this.a == brdVar.a && this.b == brdVar.b;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 8388608L;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.c;
    }

    public final String toString() {
        return c0a.l(this.b, "PortalBlocked(itemViewType=", jll.b(this.a), ", titleRes=", ")");
    }
}
