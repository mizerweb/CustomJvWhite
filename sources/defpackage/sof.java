package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class sof {
    public static final rof Companion = new rof();
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;

    public /* synthetic */ sof(int i, String str, String str2, Long l, String str3, String str4) {
        if (3 != (i & 3)) {
            shl.b(i, 3, qof.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sof)) {
            return false;
        }
        sof sofVar = (sof) obj;
        return cqk.d(this.a, sofVar.a) && cqk.d(this.b, sofVar.b) && cqk.d(this.c, sofVar.c) && cqk.d(this.d, sofVar.d) && cqk.d(this.e, sofVar.e);
    }

    public final int hashCode() {
        int iD = zo5.d(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        int iHashCode = (iD + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("SettingEntryBanner(iconUrl=", this.a, ", title=", this.b, ", appId=");
        sbQ.append(this.c);
        sbQ.append(", url=");
        sbQ.append(this.d);
        sbQ.append(", startParam=");
        return zo5.w(sbQ, this.e, ")");
    }
}
