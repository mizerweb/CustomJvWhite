package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fog {
    public final long a;
    public final String b;

    public /* synthetic */ fog(String str, int i) {
        this(0L, (i & 2) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fog)) {
            return false;
        }
        fog fogVar = (fog) obj;
        return this.a == fogVar.a && cqk.d(this.b, fogVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "QueryState(marker=", ", query=", this.b);
        sbT.append(")");
        return sbT.toString();
    }

    public fog(long j, String str) {
        this.a = j;
        this.b = str;
    }
}
