package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m4k {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof m4k) {
            return cqk.d(this.a, ((m4k) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv1.g(')', "PushToken(value=", this.a);
    }
}
