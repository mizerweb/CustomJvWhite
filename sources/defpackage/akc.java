package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akc {
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akc) {
            return this.a == ((akc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "StreamUseCase(value=" + this.a + ')';
    }
}
