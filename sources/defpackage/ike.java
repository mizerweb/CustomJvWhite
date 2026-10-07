package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ike implements Serializable {
    public final int a;
    public final int b;
    public final String c;
    public final puc d;
    public final zic e;

    public ike(int i, int i2, String str, puc pucVar, zic zicVar) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = pucVar;
        this.e = zicVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ike)) {
            return false;
        }
        ike ikeVar = (ike) obj;
        return this.a == ikeVar.a && this.b == ikeVar.b && cqk.d(this.c, ikeVar.c) && cqk.d(this.d, ikeVar.d) && cqk.d(this.e, ikeVar.e);
    }

    public final int hashCode() {
        int iD = zo5.d(c0a.f(this.b, qt4.D(this.a) * 31, 31), 31, this.c);
        puc pucVar = this.d;
        int iHashCode = (iD + (pucVar == null ? 0 : pucVar.hashCode())) * 31;
        zic zicVar = this.e;
        return iHashCode + (zicVar != null ? zicVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ReplyButton(type=");
        String str2 = "UNKNOWN";
        int i = this.a;
        if (i == 1) {
            str = "MESSAGE";
        } else if (i == 2) {
            str = "IMAGE";
        } else if (i == 3) {
            str = "CONTACT";
        } else if (i != 4) {
            str = i != 5 ? "null" : "UNKNOWN";
        } else {
            str = "LOCATION";
        }
        sb.append(str);
        sb.append(", intent=");
        int i2 = this.b;
        if (i2 == 1) {
            str2 = "DEFAULT";
        } else if (i2 == 2) {
            str2 = "POSITIVE";
        } else if (i2 == 3) {
            str2 = "NEGATIVE";
        } else if (i2 != 4) {
            str2 = "null";
        }
        sb.append(str2);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", outgoingMessage=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
