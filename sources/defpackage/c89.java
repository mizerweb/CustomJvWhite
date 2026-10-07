package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c89 {
    public final Float a;
    public final boolean b;

    public c89(Float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c89)) {
            return false;
        }
        c89 c89Var = (c89) obj;
        return cqk.d(this.a, c89Var.a) && this.b == c89Var.b;
    }

    public final int hashCode() {
        Float f = this.a;
        return Boolean.hashCode(this.b) + ((f == null ? 0 : f.hashCode()) * 31);
    }

    public final String toString() {
        return "ListeningState(progress=" + this.a + ", isPlaying=" + this.b + ")";
    }
}
