package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ele {
    public final long a;
    public final long b;
    public final long c;

    public ele(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ele)) {
            return false;
        }
        ele eleVar = (ele) obj;
        return this.a == eleVar.a && this.b == eleVar.b && this.c == eleVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "Request(chatId=", ", messageId=");
        sbS.append(this.b);
        return zo5.k(this.c, ", photoId=", ")", sbS);
    }
}
