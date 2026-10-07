package defpackage;

import org.webrtc.Size;

/* JADX INFO: loaded from: classes3.dex */
public final class dkk {
    public final Size a;
    public final int b;
    public final double c;
    public final boolean d;
    public final boolean e;

    public dkk(Size size, int i, double d, boolean z, boolean z2) {
        this.a = size;
        this.b = i;
        this.c = d;
        this.d = z;
        this.e = z2;
    }

    public static dkk a(dkk dkkVar) {
        return new dkk(dkkVar.a, dkkVar.b, dkkVar.c, dkkVar.d, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkk)) {
            return false;
        }
        dkk dkkVar = (dkk) obj;
        return this.a.equals(dkkVar.a) && this.b == dkkVar.b && Double.compare(this.c, dkkVar.c) == 0 && this.d == dkkVar.d && this.e == dkkVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + pwe.b(tfb.a(spc.a(this.b, this.a.hashCode() * 31), this.c), this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalSimulcastLayer(size=");
        sb.append(this.a);
        sb.append(", bitrate=");
        sb.append(this.b);
        sb.append(", scale=");
        sb.append(this.c);
        sb.append(", isAligned=");
        sb.append(this.d);
        return nbh.z(sb, ", isEnabledAndReal=", this.e, ")");
    }
}
