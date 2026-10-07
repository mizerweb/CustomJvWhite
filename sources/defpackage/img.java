package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class img {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final List h;
    public final boolean i;

    public img(dmg dmgVar) {
        this.a = dmgVar.a;
        this.b = dmgVar.b;
        this.c = dmgVar.c;
        this.d = dmgVar.d;
        this.e = dmgVar.e;
        this.f = dmgVar.f;
        this.g = dmgVar.g;
        this.h = dmgVar.h;
        this.i = dmgVar.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || img.class != obj.getClass()) {
            return false;
        }
        img imgVar = (img) obj;
        if (this.a != imgVar.a || this.d != imgVar.d || this.e != imgVar.e || this.f != imgVar.f || this.i != imgVar.i) {
            return false;
        }
        String str = imgVar.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = imgVar.c;
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (this.g.equals(imgVar.g)) {
            return this.h.equals(imgVar.h);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j2 = this.d;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f;
        return ((this.h.hashCode() + zo5.d((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.g)) * 31) + (this.i ? 1 : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.h);
        StringBuilder sbT = qt4.t(this.a, "StickerSetData{id=", ", name='", this.b);
        p.j(sbT, "', iconUrl='", this.c, "', authorId=");
        sbT.append(this.d);
        qt4.z(this.e, ", createTime=", ", updateTime=", sbT);
        qv1.s(this.f, ", link='", this.g, sbT);
        sbT.append("', stickers=");
        sbT.append(strValueOf);
        sbT.append(", draft=");
        sbT.append(this.i);
        sbT.append("}");
        return sbT.toString();
    }
}
