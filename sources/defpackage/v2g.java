package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v2g {
    public final u2g a;
    public final ynh b;
    public final String c;
    public final ynh d;
    public final String e;
    public final String f;

    public v2g(u2g u2gVar, ynh ynhVar, String str, ynh ynhVar2, String str2, String str3) {
        this.a = u2gVar;
        this.b = ynhVar;
        this.c = str;
        this.d = ynhVar2;
        this.e = str2;
        this.f = str3;
    }

    public static v2g a(v2g v2gVar, u2g u2gVar, ynh ynhVar, String str, ynh ynhVar2, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            u2gVar = v2gVar.a;
        }
        u2g u2gVar2 = u2gVar;
        if ((i & 2) != 0) {
            ynhVar = v2gVar.b;
        }
        ynh ynhVar3 = ynhVar;
        if ((i & 4) != 0) {
            str = v2gVar.c;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            ynhVar2 = v2gVar.d;
        }
        ynh ynhVar4 = ynhVar2;
        if ((i & 16) != 0) {
            str2 = v2gVar.e;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = v2gVar.f;
        }
        v2gVar.getClass();
        return new v2g(u2gVar2, ynhVar3, str4, ynhVar4, str5, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2g)) {
            return false;
        }
        v2g v2gVar = (v2g) obj;
        return cqk.d(this.a, v2gVar.a) && cqk.d(this.b, v2gVar.b) && cqk.d(this.c, v2gVar.c) && cqk.d(this.d, v2gVar.d) && cqk.d(this.e, v2gVar.e) && cqk.d(this.f, v2gVar.f);
    }

    public final int hashCode() {
        u2g u2gVar = this.a;
        int iHashCode = (u2gVar == null ? 0 : u2gVar.hashCode()) * 31;
        ynh ynhVar = this.b;
        int iHashCode2 = (iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ynh ynhVar2 = this.d;
        int iHashCode4 = (iHashCode3 + (ynhVar2 == null ? 0 : ynhVar2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowLocationState(markerModel=");
        sb.append(this.a);
        sb.append(", senderName=");
        sb.append(this.b);
        sb.append(", locationText=");
        sb.append(this.c);
        sb.append(", distanceUnits=");
        sb.append(this.d);
        sb.append(", distanceValue=");
        return nbh.y(sb, this.e, ", timeText=", this.f, ")");
    }
}
