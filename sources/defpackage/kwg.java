package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kwg {
    public final u8b a;
    public final long b;

    public kwg(u8b u8bVar, long j) {
        this.a = u8bVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwg)) {
            return false;
        }
        kwg kwgVar = (kwg) obj;
        return cqk.d(this.a, kwgVar.a) && this.b == kwgVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StoryDetailedStatsPage(viewers=" + this.a + ", marker=" + this.b + ")";
    }
}
