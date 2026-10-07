package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class rhc {
    public static final qhc Companion = new qhc();
    public final uhc a;
    public final String b;
    public final Long c;
    public final String d;

    public /* synthetic */ rhc(int i, uhc uhcVar, String str, Long l, String str2) {
        if (1 != (i & 1)) {
            shl.b(i, 1, phc.a.d());
            throw null;
        }
        this.a = uhcVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean a() {
        if (this.c != null) {
            return true;
        }
        String str = this.b;
        return (str == null || str.length() == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhc)) {
            return false;
        }
        rhc rhcVar = (rhc) obj;
        return this.a == rhcVar.a && cqk.d(this.b, rhcVar.b) && cqk.d(this.c, rhcVar.c) && cqk.d(this.d, rhcVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OrgLink(placement=" + this.a + ", url=" + this.b + ", appId=" + this.c + ", startParam=" + this.d + ")";
    }

    public rhc(uhc uhcVar, String str, Long l, String str2) {
        this.a = uhcVar;
        this.b = str;
        this.c = l;
        this.d = str2;
    }
}
