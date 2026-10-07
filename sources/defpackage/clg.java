package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class clg implements Serializable {
    public final long a;
    public final int b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final int j;
    public final long k;
    public final String l;
    public final boolean m;
    public final int n;
    public final String o;

    public clg(blg blgVar) {
        this.a = blgVar.a;
        this.b = blgVar.b;
        this.c = blgVar.c;
        this.d = blgVar.d;
        this.e = blgVar.e;
        this.f = blgVar.f;
        this.g = blgVar.g;
        this.h = blgVar.h;
        this.i = blgVar.i;
        this.j = blgVar.j;
        this.k = blgVar.k;
        this.l = blgVar.l;
        this.m = blgVar.m;
        this.n = blgVar.n;
        this.o = blgVar.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || clg.class != obj.getClass()) {
            return false;
        }
        clg clgVar = (clg) obj;
        if (this.a != clgVar.a || this.b != clgVar.b || this.c != clgVar.c || this.e != clgVar.e || this.k != clgVar.k || this.m != clgVar.m) {
            return false;
        }
        String str = clgVar.d;
        String str2 = this.d;
        if (str2 != null) {
            if (!str2.equals(str)) {
                return false;
            }
        } else if (str != null) {
            return false;
        }
        String str3 = clgVar.f;
        String str4 = this.f;
        if (str4 != null) {
            if (!str4.equals(str3)) {
                return false;
            }
        } else if (str3 != null) {
            return false;
        }
        String str5 = clgVar.g;
        String str6 = this.g;
        if (str6 != null) {
            if (!str6.equals(str5)) {
                return false;
            }
        } else if (str5 != null) {
            return false;
        }
        String str7 = clgVar.h;
        String str8 = this.h;
        if (str8 != null) {
            if (!str8.equals(str7)) {
                return false;
            }
        } else if (str7 != null) {
            return false;
        }
        List list = clgVar.i;
        List list2 = this.i;
        if (list2 != null) {
            if (!list2.equals(list)) {
                return false;
            }
        } else if (list != null) {
            return false;
        }
        if (this.j != clgVar.j) {
            return false;
        }
        String str9 = clgVar.l;
        String str10 = this.l;
        if (str10 != null) {
            if (!str10.equals(str9)) {
                return false;
            }
        } else if (str9 != null) {
            return false;
        }
        return Objects.equals(this.o, clgVar.o) && this.n == clgVar.n;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.e;
        int i2 = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.f;
        int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.h;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List list = this.i;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        int i3 = this.j;
        int iD = (iHashCode5 + (i3 != 0 ? qt4.D(i3) : 0)) * 961;
        long j3 = this.k;
        int i4 = (iD + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str5 = this.l;
        int iHashCode6 = (((i4 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.m ? 1 : 0)) * 961;
        int i5 = this.n;
        int iD2 = (iHashCode6 + (i5 != 0 ? qt4.D(i5) : 0)) * 31;
        String str6 = this.o;
        return iD2 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.i);
        String strB = c0a.B(this.j);
        String strA = c0a.A(this.n);
        StringBuilder sbQ = c0a.q(this.b, this.a, "Sticker{id=", ", width=");
        sbQ.append(", height=");
        sbQ.append(this.c);
        sbQ.append(", url='");
        sbQ.append(this.d);
        qt4.z(this.e, "', updateTime=", ", mp4Url='", sbQ);
        nbh.G(sbQ, this.f, "', firstUrl='", this.g, "', previewUrl='");
        nbh.G(sbQ, this.h, "', tags=", strValueOf, ", stickerType=");
        sbQ.append(strB);
        sbQ.append(", external=false, setId=");
        sbQ.append(this.k);
        sbQ.append(", lottieUrl='");
        sbQ.append(this.l);
        sbQ.append("', audio=");
        sbQ.append(this.m);
        nbh.G(sbQ, ", photoAttach=null, stickerAuthorType=", strA, ", videoUrl='", this.o);
        sbQ.append("'}");
        return sbQ.toString();
    }
}
