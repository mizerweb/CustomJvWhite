package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sng {
    public final String a;
    public final long b;

    public /* synthetic */ sng(String str, int i) {
        this((i & 1) != 0 ? null : str, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sng)) {
            return false;
        }
        sng sngVar = (sng) obj;
        return cqk.d(this.a, sngVar.a) && this.b == sngVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Long.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "QueryState(query=", this.a, ", marker=");
        sbB.append(")");
        return sbB.toString();
    }

    public sng(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
