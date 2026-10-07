package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rwc {
    public final Double a;
    public final Double b;
    public final Double c;
    public final Double d;
    public final ynh e;
    public final String f;
    public final boolean g;

    public rwc(Double d, Double d2, Double d3, Double d4, ynh ynhVar, String str, boolean z) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = ynhVar;
        this.f = str;
        this.g = z;
    }

    public static rwc a(rwc rwcVar, Double d, Double d2, Double d3, Double d4, tnh tnhVar, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            d = rwcVar.a;
        }
        Double d5 = d;
        if ((i & 2) != 0) {
            d2 = rwcVar.b;
        }
        Double d6 = d2;
        if ((i & 4) != 0) {
            d3 = rwcVar.c;
        }
        Double d7 = d3;
        if ((i & 8) != 0) {
            d4 = rwcVar.d;
        }
        Double d8 = d4;
        ynh ynhVar = tnhVar;
        if ((i & 16) != 0) {
            ynhVar = rwcVar.e;
        }
        ynh ynhVar2 = ynhVar;
        if ((i & 32) != 0) {
            str = rwcVar.f;
        }
        String str2 = str;
        if ((i & 64) != 0) {
            z = rwcVar.g;
        }
        rwcVar.getClass();
        return new rwc(d5, d6, d7, d8, ynhVar2, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwc)) {
            return false;
        }
        rwc rwcVar = (rwc) obj;
        return cqk.d(this.a, rwcVar.a) && cqk.d(this.b, rwcVar.b) && cqk.d(this.c, rwcVar.c) && cqk.d(this.d, rwcVar.d) && this.e.equals(rwcVar.e) && cqk.d(this.f, rwcVar.f) && this.g == rwcVar.g;
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.d;
        int iH = bc1.h((iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.g) + ((iH + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickLocationState(myLocationLat=");
        sb.append(this.a);
        sb.append(", myLocationLon=");
        sb.append(this.b);
        sb.append(", locationLat=");
        sb.append(this.c);
        sb.append(", locationLon=");
        sb.append(this.d);
        sb.append(", sendTitle=");
        sb.append(this.e);
        sb.append(", locationText=");
        sb.append(this.f);
        sb.append(", geoCodingInProgress=");
        return qt4.r(sb, this.g, ")");
    }
}
