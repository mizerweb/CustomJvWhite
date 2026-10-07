package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y6e {
    public final long a;
    public final String b;
    public final s5e c;

    public y6e(long j, s5e s5eVar, String str) {
        this.a = j;
        this.b = str;
        this.c = s5eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6e)) {
            return false;
        }
        y6e y6eVar = (y6e) obj;
        return this.a == y6eVar.a && this.b.equals(y6eVar.b) && cqk.d(this.c, y6eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "PlayingState(msgId=", ", url=", this.b);
        sbT.append(", reaction=");
        sbT.append((Object) this.c);
        sbT.append(")");
        return sbT.toString();
    }
}
