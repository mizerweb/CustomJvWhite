package defpackage;

import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class m21 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final nmc f;
    public final nmc g;
    public int h;
    public int i;

    public m21(nmc nmcVar, nmc nmcVar2, boolean z) throws ParserException {
        this.g = nmcVar;
        this.f = nmcVar2;
        this.e = z;
        nmcVar2.N(12);
        this.a = nmcVar2.E();
        nmcVar.N(12);
        this.i = nmcVar.E();
        gxl.a("first_chunk must be 1", nmcVar.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        nmc nmcVar = this.f;
        this.d = z ? nmcVar.G() : nmcVar.C();
        if (this.b == this.h) {
            nmc nmcVar2 = this.g;
            this.c = nmcVar2.E();
            nmcVar2.O(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? nmcVar2.E() - 1 : -1;
        }
        return true;
    }
}
