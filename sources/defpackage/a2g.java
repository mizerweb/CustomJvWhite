package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a2g implements vpa {
    public final long a;
    public final r2f b;
    public final long c;

    public a2g(long j, r2f r2fVar, long j2) {
        this.a = j;
        this.b = r2fVar;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2g)) {
            return false;
        }
        a2g a2gVar = (a2g) obj;
        return this.a == a2gVar.a && this.b == a2gVar.b && this.c == a2gVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowEditFireTimeDialog(messageId=");
        sb.append(this.a);
        sb.append(", pickerMode=");
        sb.append(this.b);
        return zo5.k(this.c, ", currentFireTime=", ")", sb);
    }
}
