package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tq2 extends rbb {
    public final tnh b;
    public final vnh c;
    public final long d;

    public tq2(tnh tnhVar, vnh vnhVar, long j) {
        super(sbi.a);
        this.b = tnhVar;
        this.c = vnhVar;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq2)) {
            return false;
        }
        tq2 tq2Var = (tq2) obj;
        return this.b.equals(tq2Var.b) && this.c.equals(tq2Var.c) && this.d == tq2Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + (Integer.hashCode(this.b.c) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowChangeOwnerBottomSheetEvent(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", contactId=");
        return c0a.m(this.d, ")", sb);
    }
}
