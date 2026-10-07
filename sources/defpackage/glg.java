package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class glg extends l40 {
    public final long d;
    public final int e;
    public final int f;
    public final String g;
    public final long h;
    public final String i;
    public final String j;
    public final List k;
    public final String l;
    public final int m;
    public final long n;
    public final String o;
    public final boolean p;
    public final int q;
    public final String r;

    public glg(long j, int i, int i2, String str, long j2, String str2, String str3, List list, String str4, int i3, long j3, String str5, boolean z, int i4, boolean z2, boolean z3, String str6) {
        super(w50.STICKER, z2, z3);
        this.d = j;
        this.e = i;
        this.f = i2;
        this.g = str;
        this.h = j2;
        this.i = str2;
        this.j = str3;
        this.k = list;
        this.l = str4;
        this.m = i3;
        this.n = j3;
        this.o = str5;
        this.p = z;
        this.q = i4;
        this.r = str6;
    }

    @Override // defpackage.l40
    public final HashMap a() {
        HashMap mapA = super.a();
        mapA.put("stickerId", Long.valueOf(this.d));
        return mapA;
    }
}
