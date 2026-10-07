package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vfi {
    public static final /* synthetic */ int l = 0;
    public final ahi a;
    public final String b;
    public final String c;
    public final String d;
    public final float e;
    public final long f;
    public final jji g;
    public final zii h;
    public final aji i;
    public final long j;
    public final boolean k;

    static {
        new vfi(new ufi());
    }

    public vfi(ufi ufiVar) {
        this.a = ufiVar.a;
        this.b = ufiVar.b;
        this.c = ufiVar.c;
        this.d = ufiVar.d;
        this.e = ufiVar.e;
        this.f = ufiVar.f;
        this.g = ufiVar.g;
        this.h = ufiVar.h;
        this.i = ufiVar.i;
        this.j = ufiVar.j;
        this.k = ufiVar.k;
    }

    public final boolean a() {
        return this.g == jji.UPLOADED && this.h != null;
    }

    public final ufi b() {
        ufi ufiVar = new ufi();
        ufiVar.a = this.a;
        ufiVar.b = this.b;
        ufiVar.c = this.c;
        ufiVar.d = this.d;
        ufiVar.h = this.h;
        ufiVar.i = this.i;
        ufiVar.g = this.g;
        ufiVar.f = this.f;
        ufiVar.e = this.e;
        ufiVar.j = this.j;
        ufiVar.k = this.k;
        return ufiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vfi.class != obj.getClass()) {
            return false;
        }
        vfi vfiVar = (vfi) obj;
        if (Float.compare(vfiVar.e, this.e) != 0 || this.f != vfiVar.f || this.j != vfiVar.j) {
            return false;
        }
        ahi ahiVar = vfiVar.a;
        ahi ahiVar2 = this.a;
        if (ahiVar2 == null ? ahiVar != null : !ahiVar2.equals(ahiVar)) {
            return false;
        }
        String str = vfiVar.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = vfiVar.c;
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = vfiVar.d;
        String str6 = this.d;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        if (this.g != vfiVar.g) {
            return false;
        }
        zii ziiVar = vfiVar.h;
        zii ziiVar2 = this.h;
        if (ziiVar2 == null ? ziiVar != null : !ziiVar2.equals(ziiVar)) {
            return false;
        }
        aji ajiVar = vfiVar.i;
        aji ajiVar2 = this.i;
        if (ajiVar2 == null ? ajiVar == null : ajiVar2.equals(ajiVar)) {
            return this.k == vfiVar.k;
        }
        return false;
    }

    public final int hashCode() {
        ahi ahiVar = this.a;
        int iHashCode = (ahiVar != null ? ahiVar.hashCode() : 0) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode4 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        long j = this.f;
        int i = (iFloatToIntBits + ((int) (j ^ (j >>> 32)))) * 31;
        jji jjiVar = this.g;
        int iHashCode5 = (i + (jjiVar != null ? jjiVar.hashCode() : 0)) * 31;
        zii ziiVar = this.h;
        int iHashCode6 = (iHashCode5 + (ziiVar != null ? ziiVar.hashCode() : 0)) * 31;
        aji ajiVar = this.i;
        int iD = (((iHashCode6 + (ajiVar != null ? qt4.D(ajiVar.a) : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j2 = this.j;
        return iD + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Upload{uploadData=");
        sb.append(this.a);
        sb.append(", preparedPath='");
        sb.append(gm0.c() ? this.b : "*****");
        sb.append("', fileName='");
        sb.append(gm0.c() ? this.c : "*****");
        sb.append("', uploadUrl='");
        sb.append(gm0.c() ? this.d : "*****");
        sb.append("', uploadProgress=");
        sb.append(this.e);
        sb.append(", totalBytes=");
        sb.append(this.f);
        sb.append(", uploadStatus=");
        sb.append(this.g);
        sb.append(", uploadResult=");
        sb.append(this.h);
        sb.append(", uploadServerFlags=");
        sb.append(this.i);
        sb.append(", isTransload=");
        sb.append(this.k);
        sb.append(", createdTime=");
        return zo5.u(sb, this.j, '}');
    }
}
