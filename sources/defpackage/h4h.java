package defpackage;

import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class h4h {
    public final int a;
    public final Size b;
    public final int c;
    public final String d;
    public final zjc e;
    public final yjc f;
    public final akc g;
    public final l6m h;
    public final bkc i;
    public bi2 j;

    public h4h(int i, int i2, yjc yjcVar, zjc zjcVar, akc akcVar, bkc bkcVar, Size size, String str, l6m l6mVar) {
        this.a = i;
        this.b = size;
        this.c = i2;
        this.d = str;
        this.e = zjcVar;
        this.f = yjcVar;
        this.g = akcVar;
        this.h = l6mVar;
        this.i = bkcVar;
    }

    public final boolean a() {
        bkc bkcVar;
        akc akcVar = this.g;
        if (akcVar == null) {
            return true;
        }
        long j = akcVar.a;
        if (akc.a(j, 0L) || akc.a(j, 1L) || akc.a(j, 3L) || (bkcVar = this.i) == null) {
            return true;
        }
        long j2 = bkcVar.a;
        return bkc.a(j2, 0L) || bkc.a(j2, 1L);
    }

    public final String toString() {
        return ojc.a(this.a);
    }
}
