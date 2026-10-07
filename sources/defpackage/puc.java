package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class puc extends l40 {
    public final String d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final boolean h;
    public final byte[] i;
    public final byte[] j;
    public final String k;
    public final String l;
    public final Long m;
    public final String n;

    public puc(String str, String str2, Integer num, Integer num2, boolean z, byte[] bArr, byte[] bArr2, Long l, String str3, String str4, boolean z2, boolean z3, String str5) {
        super(w50.PHOTO, z2, z3);
        this.d = str;
        this.e = str2;
        this.f = num;
        this.g = num2;
        this.h = z;
        this.i = bArr;
        this.j = bArr2;
        this.m = l;
        this.l = str3;
        this.k = str4;
        this.n = str5;
    }

    @Override // defpackage.l40
    public final HashMap a() {
        HashMap mapA = super.a();
        String str = this.k;
        if (!ch3.r(str)) {
            mapA.put("photoToken", str);
        }
        return mapA;
    }
}
