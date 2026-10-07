package defpackage;

import java.util.TimeZone;
import ru.ok.android.externcalls.analytics.internal.upload.UploadHelper;

/* JADX INFO: loaded from: classes.dex */
public final class tmi {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final syd j;
    public final TimeZone k;

    public tmi(String str, String str2, String str3, String str4, String str5, String str6, syd sydVar) {
        TimeZone timeZone = TimeZone.getDefault();
        this.a = UploadHelper.SDK_TYPE_STRING;
        this.b = "26.28.0";
        this.c = 6804;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = sydVar;
        this.k = timeZone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmi)) {
            return false;
        }
        tmi tmiVar = (tmi) obj;
        return cqk.d(this.a, tmiVar.a) && cqk.d(this.b, tmiVar.b) && this.c == tmiVar.c && cqk.d(this.d, tmiVar.d) && cqk.d(this.e, tmiVar.e) && cqk.d(this.f, tmiVar.f) && cqk.d(this.g, tmiVar.g) && cqk.d(this.h, tmiVar.h) && cqk.d(this.i, tmiVar.i) && this.j == tmiVar.j && cqk.d(this.k, tmiVar.k);
    }

    public final int hashCode() {
        int iD = zo5.d(zo5.d(zo5.d(zo5.d(zo5.d(zo5.d(zo5.c(this.c, zo5.d(this.a.hashCode() * 31, 31, this.b), 961), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        syd sydVar = this.j;
        return this.k.hashCode() + ((iD + (sydVar == null ? 0 : sydVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("UserAgent(deviceType=", this.a, ", appVersion=", this.b, ", buildNumber=");
        sbQ.append(this.c);
        sbQ.append(", appKey=null, osVersion=");
        sbQ.append(this.d);
        sbQ.append(", arch=");
        nbh.G(sbQ, this.e, ", locale=", this.f, ", deviceLocale=");
        nbh.G(sbQ, this.g, ", deviceName=", this.h, ", screen=");
        sbQ.append(this.i);
        sbQ.append(", pushDeviceType=");
        sbQ.append(this.j);
        sbQ.append(", timeZone=");
        sbQ.append(this.k);
        sbQ.append(")");
        return sbQ.toString();
    }
}
