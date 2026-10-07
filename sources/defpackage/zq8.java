package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zq8 implements cr8 {
    public final tnh a;

    public zq8(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zq8) && this.a.equals(((zq8) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return x05.g("ShowError(text=", this.a, ")");
    }
}
