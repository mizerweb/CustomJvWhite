package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class pne implements Closeable {
    public final dle a;
    public final twd b;
    public final String c;
    public final int d;
    public final zs7 e;
    public final hu7 f;
    public final rne g;
    public final pne h;
    public final pne i;
    public final pne j;
    public final long k;
    public final long l;
    public final yf2 m;

    public pne(dle dleVar, twd twdVar, String str, int i, zs7 zs7Var, hu7 hu7Var, rne rneVar, pne pneVar, pne pneVar2, pne pneVar3, long j, long j2, yf2 yf2Var) {
        this.a = dleVar;
        this.b = twdVar;
        this.c = str;
        this.d = i;
        this.e = zs7Var;
        this.f = hu7Var;
        this.g = rneVar;
        this.h = pneVar;
        this.i = pneVar2;
        this.j = pneVar3;
        this.k = j;
        this.l = j2;
        this.m = yf2Var;
    }

    public static String A(pne pneVar, String str) {
        String strA = pneVar.f.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    public final boolean E() {
        int i = this.d;
        return 200 <= i && i < 300;
    }

    public final one I() {
        one oneVar = new one();
        oneVar.a = this.a;
        oneVar.b = this.b;
        oneVar.c = this.d;
        oneVar.d = this.c;
        oneVar.e = this.e;
        oneVar.f = this.f.c();
        oneVar.g = this.g;
        oneVar.h = this.h;
        oneVar.i = this.i;
        oneVar.j = this.j;
        oneVar.k = this.k;
        oneVar.l = this.l;
        oneVar.m = this.m;
        return oneVar;
    }

    public final dle K() {
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        rne rneVar = this.g;
        if (rneVar != null) {
            rneVar.close();
        } else {
            ore.k("response is not eligible for a body and must not be closed");
        }
    }

    public final rne l() {
        return this.g;
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + '}';
    }

    public final int y() {
        return this.d;
    }
}
