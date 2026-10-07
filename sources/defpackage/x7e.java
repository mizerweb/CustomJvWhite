package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x7e {
    public final s5e a;
    public final long b;
    public final long c;
    public final kja d;

    public x7e(s5e s5eVar, long j, long j2, kja kjaVar) {
        this.a = s5eVar;
        this.b = j;
        this.c = j2;
        this.d = kjaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7e)) {
            return false;
        }
        x7e x7eVar = (x7e) obj;
        return cqk.d(this.a, x7eVar.a) && this.b == x7eVar.b && this.c == x7eVar.c && cqk.d(this.d, x7eVar.d);
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        kja kjaVar = this.d;
        return iG + (kjaVar == null ? 0 : kjaVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelfReactionData(selfReaction=");
        sb.append((Object) this.a);
        sb.append(", msgLocalId=");
        sb.append(this.b);
        qt4.z(this.c, ", msgServerId=", ", reactions=", sb);
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
