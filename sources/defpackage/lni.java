package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class lni {
    public final Boolean A;
    public final Boolean B;
    public final String C;
    public final jni D;
    public final Boolean a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final int o;
    public final int p;
    public final int q;
    public final kni r;
    public final int s;
    public final int t;
    public final int u;
    public final Boolean v;
    public final Boolean w;
    public final Boolean x;
    public final int y;
    public final Boolean z;

    public lni(ini iniVar) {
        this.a = iniVar.a;
        this.b = iniVar.b;
        this.c = iniVar.c;
        this.d = iniVar.d;
        this.e = iniVar.e;
        this.f = iniVar.f;
        this.g = iniVar.g;
        this.h = iniVar.h;
        this.i = iniVar.i;
        this.j = iniVar.j;
        this.k = iniVar.k;
        this.l = iniVar.l;
        this.m = iniVar.m;
        this.n = iniVar.n;
        this.o = iniVar.o;
        this.p = iniVar.p;
        this.r = iniVar.r;
        this.s = iniVar.s;
        this.t = iniVar.t;
        this.u = iniVar.u;
        this.v = iniVar.v;
        this.w = iniVar.w;
        this.x = iniVar.x;
        this.y = iniVar.y;
        this.z = iniVar.z;
        this.A = iniVar.A;
        this.D = iniVar.B;
        this.B = iniVar.C;
        this.C = iniVar.D;
        this.q = iniVar.q;
    }

    public static ini a() {
        return new ini();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lni.class != obj.getClass()) {
            return false;
        }
        lni lniVar = (lni) obj;
        return Objects.equals(this.a, lniVar.a) && Objects.equals(this.b, lniVar.b) && Objects.equals(this.c, lniVar.c) && Objects.equals(this.d, lniVar.d) && Objects.equals(this.e, lniVar.e) && Objects.equals(this.f, lniVar.f) && Objects.equals(this.g, lniVar.g) && Objects.equals(this.h, lniVar.h) && Objects.equals(this.i, lniVar.i) && Objects.equals(this.j, lniVar.j) && Objects.equals(this.k, lniVar.k) && Objects.equals(this.l, lniVar.l) && Objects.equals(this.m, lniVar.m) && Objects.equals(this.n, lniVar.n) && this.o == lniVar.o && this.p == lniVar.p && this.r == lniVar.r && this.s == lniVar.s && this.t == lniVar.t && this.u == lniVar.u && Objects.equals(this.v, lniVar.v) && Objects.equals(this.w, lniVar.w) && Objects.equals(this.x, lniVar.x) && this.y == lniVar.y && Objects.equals(this.z, lniVar.z) && Objects.equals(this.A, lniVar.A) && Objects.equals(this.B, lniVar.B) && Objects.equals(this.C, lniVar.C) && Objects.equals(this.D, lniVar.D) && this.q == lniVar.q;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, qt4.b(this.o), qt4.b(this.p), this.r, qt4.b(this.s), qt4.b(this.u), this.v, this.w, this.x, qt4.b(this.y), this.z, this.A, this.D, this.B, this.C, qt4.b(this.q), qt4.b(this.t));
    }

    public final String toString() {
        String str;
        String str2;
        String strI = nbh.I(this.o);
        String strI2 = nbh.I(this.p);
        String strValueOf = String.valueOf(this.r);
        String str3 = "ON";
        int i = this.s;
        if (i != 1) {
            str = i != 2 ? "null" : "OFF";
        } else {
            str = "ON";
        }
        int i2 = this.t;
        if (i2 != 1) {
            str2 = i2 != 2 ? "null" : "OFF";
        } else {
            str2 = "ON";
        }
        int i3 = this.u;
        if (i3 != 1) {
            str3 = i3 != 2 ? "null" : "OFF";
        }
        String strI3 = nbh.I(this.y);
        String strValueOf2 = String.valueOf(this.D);
        String strI4 = nbh.I(this.q);
        StringBuilder sb = new StringBuilder("UserSettings{pushNewContacts=");
        sb.append(this.a);
        sb.append(", dontDustirbUntil=");
        sb.append(this.b);
        sb.append(", dialogsPushNotification='");
        nbh.G(sb, this.c, "', chatsPushNotification='", this.d, "', pushSound='");
        nbh.G(sb, this.e, "', dialogsPushSound='", this.f, "', chatsPushSound='");
        sb.append(this.g);
        sb.append("', hiddenOnline=");
        sb.append(this.h);
        sb.append(", led=");
        sb.append(this.i);
        sb.append(", dialogsLed=");
        sb.append(this.j);
        sb.append(", chatsLed=");
        sb.append(this.k);
        sb.append(", vibration=");
        sb.append(this.l);
        sb.append(", dialogsVibration=");
        sb.append(this.m);
        sb.append(", chatsVibration=");
        sb.append(this.n);
        sb.append(", chatsInvite=");
        nbh.G(sb, strI, ", incomingCall=", strI2, ", inactiveTtl=");
        nbh.G(sb, strValueOf, ", groupChatCallNotificationStatus=", str, ", commentsPushNotification=");
        nbh.G(sb, str2, ", suggestStickersStatus=", str3, ", audioTranscriptionEnabled=");
        sb.append(this.v);
        sb.append(", safeMode=");
        sb.append(this.w);
        sb.append(", safeModeNoPin=");
        sb.append(this.x);
        sb.append(", searchByPhone=");
        sb.append(strI3);
        sb.append(", unsafeFiles=");
        sb.append(this.z);
        sb.append(", contentLevelAccess=");
        sb.append(this.A);
        sb.append(", familyProtection=");
        return nbh.y(sb, strValueOf2, ", phoneNumberPrivacy=", strI4, "}");
    }
}
