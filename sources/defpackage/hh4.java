package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class hh4 extends l40 {
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public hh4(String str, long j, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        super(w50.CONTACT, z, z2);
        this.d = str;
        this.e = j;
        this.f = str2;
        this.i = str5;
        this.j = str6;
        this.g = str3;
        this.h = str4;
    }

    @Override // defpackage.l40
    public final HashMap a() {
        HashMap mapA = super.a();
        String str = this.d;
        if (!ch3.r(str)) {
            mapA.put("vcfBody", str);
        }
        long j = this.e;
        if (j != 0) {
            mapA.put("contactId", Long.valueOf(j));
        }
        return mapA;
    }
}
