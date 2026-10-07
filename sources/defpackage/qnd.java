package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qnd implements tnd {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;

    public qnd(Long l, String str, String str2, String str3) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnd)) {
            return false;
        }
        qnd qndVar = (qnd) obj;
        return this.a.equals(qndVar.a) && this.b.equals(qndVar.b) && this.c.equals(qndVar.c) && cqk.d(this.d, qndVar.d);
    }

    public final int hashCode() {
        int iD = zo5.d(zo5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactUpdate(requestId=");
        sb.append(this.a);
        sb.append(", fullName=");
        sb.append(this.b);
        sb.append(", nickName=");
        return nbh.y(sb, this.c, ", avatarUrl=", this.d, ")");
    }
}
