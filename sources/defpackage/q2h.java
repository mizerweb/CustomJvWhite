package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q2h {
    public final int a;
    public final int b;

    public q2h(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2h)) {
            return false;
        }
        q2h q2hVar = (q2h) obj;
        return this.a == q2hVar.a && this.b == q2hVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nbh.u("StoryStatsModel(viewsCount=", this.a, ", reactionsCount=", this.b, ")");
    }
}
