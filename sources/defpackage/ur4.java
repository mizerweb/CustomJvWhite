package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ur4 implements vr4 {
    public final int a;

    public ur4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ur4) && this.a == ((ur4) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "StopSeekPlayerProgress(progress=", ")");
    }
}
