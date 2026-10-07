package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class pk2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Double h;
    public final String i;
    public final String j;
    public final boolean k;
    public final HashMap l = new HashMap();

    public pk2(String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, String str8, String str9, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = d;
        this.i = str8;
        this.j = str9;
        this.k = z;
    }

    public final String toString() {
        return "CandidatePair{name='" + this.a + "', localCandidateType='" + this.b + "', localAddress='" + this.c + "', remoteCandidateType='" + this.e + "', remoteAddress='" + this.f + "', rtt='" + this.h + "', transport='" + this.i + "', channelId='" + this.j + "', activeConnection=" + this.k + ", unknown=" + this.l + '}';
    }
}
