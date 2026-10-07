package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a04 implements c04 {
    public final tnh a;

    public a04(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a04) && this.a.equals(((a04) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return x05.g("ShowSuccess(text=", this.a, ")");
    }
}
