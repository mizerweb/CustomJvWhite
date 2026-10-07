package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class emg {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final List h;
    public final boolean i;
    public final boolean j;

    public emg(dmg dmgVar) {
        this.a = dmgVar.a;
        this.b = dmgVar.b;
        this.c = dmgVar.c;
        this.d = dmgVar.d;
        this.e = dmgVar.e;
        this.f = dmgVar.f;
        this.g = dmgVar.g;
        List list = dmgVar.h;
        this.h = list;
        this.i = dmgVar.i;
        boolean z = false;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i = ((clg) it.next()).j;
                if (i == 3 || i == 4) {
                    z = true;
                    break;
                }
            }
        }
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || emg.class != obj.getClass()) {
            return false;
        }
        emg emgVar = (emg) obj;
        if (this.a != emgVar.a || this.d != emgVar.d || this.e != emgVar.e || this.f != emgVar.f || this.i != emgVar.i) {
            return false;
        }
        String str = emgVar.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = emgVar.c;
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (this.g.equals(emgVar.g)) {
            return this.h.equals(emgVar.h);
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
        List list = this.h;
        int size = list != null ? list.size() : 0;
        StringBuilder sbT = qt4.t(this.a, "StickerSet{id=", ", name='", this.b);
        p.j(sbT, "', iconUrl='", this.c, "', authorId=");
        sbT.append(this.d);
        qt4.z(this.e, ", createTime=", ", updateTime=", sbT);
        qv1.s(this.f, ", link='", this.g, sbT);
        sbT.append("', stickers=");
        sbT.append(size);
        sbT.append(", draft=");
        sbT.append(this.i);
        return nbh.z(sbT, ", hasAnimatedOrOverlayStickers=", this.j, "}");
    }
}
