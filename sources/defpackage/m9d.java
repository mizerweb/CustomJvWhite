package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m9d implements e9d {
    public final long a;
    public final int b;

    public m9d(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9d)) {
            return false;
        }
        m9d m9dVar = (m9d) obj;
        return this.a == m9dVar.a && this.b == m9dVar.b;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return -2147483644;
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.b, this.a, "PollResultShowAllItemModel(itemId=", ", answerId=");
        sbQ.append(")");
        return sbQ.toString();
    }
}
