package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q0f {
    public final long a;
    public final long b;

    public q0f(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0f)) {
            return false;
        }
        q0f q0fVar = (q0f) obj;
        return this.a == q0fVar.a && this.b == q0fVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return c0a.m(this.b, ")", qt4.s(this.a, "SavedMessagesChatEntity(userId=", ", chatId="));
    }
}
