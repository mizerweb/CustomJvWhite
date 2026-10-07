package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vf9 extends yf9 {
    public final tnh d;

    public vf9(tnh tnhVar) {
        super(tnhVar, null);
        this.d = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vf9) && this.d.equals(((vf9) obj).d);
    }

    public final int hashCode() {
        return Integer.hashCode(this.d.c);
    }

    public final String toString() {
        return x05.g("ProfileBlocked(title=", this.d, ")");
    }
}
