package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e2f implements l2f {
    public final q90 a;

    public final boolean equals(Object obj) {
        if (obj instanceof e2f) {
            return this.a == ((e2f) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AudioMessage(media=" + this.a + ")";
    }
}
