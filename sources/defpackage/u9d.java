package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u9d implements e9d {
    public final long a;
    public final int b;
    public final tj0 c;
    public final String d;
    public final String e;
    public final String f;

    public u9d(long j, int i, tj0 tj0Var, String str, String str2, String str3) {
        this.a = j;
        this.b = i;
        this.c = tj0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9d)) {
            return false;
        }
        u9d u9dVar = (u9d) obj;
        return this.a == u9dVar.a && this.b == u9dVar.b && this.c.equals(u9dVar.c) && cqk.d(this.d, u9dVar.d) && this.e.equals(u9dVar.e) && this.f.equals(u9dVar.f);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + zo5.c(this.b, Long.hashCode(this.a) * 31, 31)) * 31;
        String str = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.b, this.a, "PollResultVoterItemModel(itemId=", ", viewType=");
        sbQ.append(", avatarAbbreviationModel=");
        sbQ.append(this.c);
        sbQ.append(", avatarUrl=");
        sbQ.append(this.d);
        sbQ.append(", userName=");
        sbQ.append((Object) this.e);
        sbQ.append(", voteTime=");
        sbQ.append((Object) this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}
