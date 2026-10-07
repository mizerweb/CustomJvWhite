package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zea {
    public final long a;
    public final int b;
    public final long c;

    public zea(int i, long j, long j2) {
        this.a = j;
        this.b = i;
        this.c = j2;
    }

    public final int a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zea)) {
            return false;
        }
        zea zeaVar = (zea) obj;
        return this.a == zeaVar.a && this.b == zeaVar.b && this.c == zeaVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + zo5.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return zo5.k(this.c, ", updatedAt=", ")", c0a.q(this.b, this.a, "MessageCommentsEntity(messageId=", ", counter="));
    }
}
