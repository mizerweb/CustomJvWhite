package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i2f implements l2f {
    public final lad a;

    public i2f(lad ladVar) {
        this.a = ladVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2f) && this.a == ((i2f) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Poll(pollData=" + this.a + ")";
    }
}
