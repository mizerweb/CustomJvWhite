package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d9d implements e9d {
    public final long a;
    public final int b;
    public final CharSequence c;
    public final String d;
    public final boolean e;

    public d9d(long j, int i, CharSequence charSequence, String str, boolean z) {
        this.a = j;
        this.b = i;
        this.c = charSequence;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9d)) {
            return false;
        }
        d9d d9dVar = (d9d) obj;
        return this.a == d9dVar.a && this.b == d9dVar.b && cqk.d(this.c, d9dVar.c) && this.d.equals(d9dVar.d) && this.e == d9dVar.e;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + mw7.f(zo5.c(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 1;
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.b, this.a, "PollResultAnswerSectionItem(itemId=", ", answerId=");
        sbQ.append(", answerTitle=");
        sbQ.append((Object) this.c);
        sbQ.append(", voteStateDescription=");
        sbQ.append((Object) this.d);
        return nbh.z(sbQ, ", isWinner=", this.e, ")");
    }
}
