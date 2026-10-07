package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c2e implements f2e {
    public final hb9 a;
    public final int b;

    public c2e(hb9 hb9Var, int i) {
        this.a = hb9Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c2e) {
            c2e c2eVar = (c2e) obj;
            if (this.a == c2eVar.a && this.b == c2eVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFullScreenMedia(localMedia=" + this.a + ", position=" + this.b + ")";
    }
}
