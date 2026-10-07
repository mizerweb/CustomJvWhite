package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zi6 extends rbb {
    public final tnh b;

    public zi6(tnh tnhVar) {
        super(sbi.a);
        this.b = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi6) && this.b.equals(((zi6) obj).b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.c);
    }

    public final String toString() {
        return x05.g("ShowSnackbar(text=", this.b, ")");
    }
}
