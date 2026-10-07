package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zz3 implements c04 {
    public final tnh a;

    public zz3(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zz3) && this.a.equals(((zz3) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return x05.g("ShowSnackbar(text=", this.a, ")");
    }
}
