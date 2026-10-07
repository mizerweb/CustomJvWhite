package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yn1 extends mk0 {
    public final tnh b;

    public yn1(tnh tnhVar) {
        super(2);
        this.b = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yn1) && this.b.equals(((yn1) obj).b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.c);
    }

    public final String toString() {
        return x05.g("ShowSnackbar(message=", this.b, ")");
    }
}
