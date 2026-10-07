package defpackage;

import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class fcf {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public fcf f;
    public fcf g;

    public fcf() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final fcf a() {
        fcf fcfVar = this.f;
        fcf fcfVar2 = fcfVar != this ? fcfVar : null;
        fcf fcfVar3 = this.g;
        fcfVar3.f = fcfVar;
        this.f.g = fcfVar3;
        this.f = null;
        this.g = null;
        return fcfVar2;
    }

    public final void b(fcf fcfVar) {
        fcfVar.g = this;
        fcfVar.f = this.f;
        this.f.g = fcfVar;
        this.f = fcfVar;
    }

    public final fcf c() {
        this.d = true;
        return new fcf(this.a, this.b, this.c, true, false);
    }

    public final void d(fcf fcfVar, int i) {
        byte[] bArr = fcfVar.a;
        if (!fcfVar.e) {
            ore.k("only owner can write");
            return;
        }
        int i2 = fcfVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (fcfVar.d) {
                ore.a();
                return;
            }
            int i4 = fcfVar.b;
            if (i3 - i4 > 8192) {
                ore.a();
                return;
            } else {
                a.R0(bArr, i4, bArr, i2);
                fcfVar.c -= fcfVar.b;
                fcfVar.b = 0;
            }
        }
        int i5 = fcfVar.c;
        int i6 = this.b;
        System.arraycopy(this.a, i6, bArr, i5, (i6 + i) - i6);
        fcfVar.c += i;
        this.b += i;
    }

    public fcf(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
