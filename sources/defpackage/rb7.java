package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rb7 {
    public final kyh a;
    public lyh d;
    public gd5 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final b87 j;
    public boolean m;
    public final gyh b = new gyh();
    public final nmc c = new nmc();
    public final nmc k = new nmc(1);
    public final nmc l = new nmc();

    public rb7(kyh kyhVar, lyh lyhVar, gd5 gd5Var, b87 b87Var) {
        this.a = kyhVar;
        this.d = lyhVar;
        this.e = gd5Var;
        this.j = b87Var;
        this.d = lyhVar;
        this.e = gd5Var;
        kyhVar.g(b87Var);
        e();
    }

    public final int a() {
        int i;
        if (this.m) {
            i = this.b.j[this.f] ? 1 : 0;
        } else {
            i = this.d.g[this.f];
        }
        return b() != null ? 1073741824 | i : i;
    }

    public final fyh b() {
        if (!this.m) {
            return null;
        }
        gyh gyhVar = this.b;
        gd5 gd5Var = gyhVar.a;
        String str = vqi.a;
        int i = gd5Var.a;
        fyh fyhVar = gyhVar.m;
        if (fyhVar == null) {
            fyhVar = this.d.a.l[i];
        }
        if (fyhVar == null || !fyhVar.a) {
            return null;
        }
        return fyhVar;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        nmc nmcVar;
        fyh fyhVarB = b();
        if (fyhVarB == null) {
            return 0;
        }
        int length = fyhVarB.d;
        gyh gyhVar = this.b;
        if (length != 0) {
            nmcVar = gyhVar.n;
        } else {
            byte[] bArr = fyhVarB.e;
            String str = vqi.a;
            int length2 = bArr.length;
            nmc nmcVar2 = this.l;
            nmcVar2.L(length2, bArr);
            length = bArr.length;
            nmcVar = nmcVar2;
        }
        boolean z = gyhVar.k && gyhVar.l[this.f];
        boolean z2 = z || i2 != 0;
        nmc nmcVar3 = this.k;
        nmcVar3.a[0] = (byte) ((z2 ? np0.m : 0) | length);
        nmcVar3.N(0);
        kyh kyhVar = this.a;
        kyhVar.b(nmcVar3, 1, 1);
        kyhVar.b(nmcVar, length, 1);
        if (!z2) {
            return length + 1;
        }
        nmc nmcVar4 = this.c;
        if (!z) {
            nmcVar4.K(8);
            byte[] bArr2 = nmcVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            kyhVar.b(nmcVar4, 8, 1);
            return length + 9;
        }
        nmc nmcVar5 = gyhVar.n;
        int iH = nmcVar5.H();
        nmcVar5.O(-2);
        int i3 = (iH * 6) + 2;
        if (i2 != 0) {
            nmcVar4.K(i3);
            byte[] bArr3 = nmcVar4.a;
            nmcVar5.k(0, bArr3, i3);
            int i4 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i4 >> 8) & 255);
            bArr3[3] = (byte) (i4 & 255);
        } else {
            nmcVar4 = nmcVar5;
        }
        kyhVar.b(nmcVar4, i3, 1);
        return length + 1 + i3;
    }

    public final void e() {
        gyh gyhVar = this.b;
        gyhVar.d = 0;
        gyhVar.p = 0L;
        gyhVar.q = false;
        gyhVar.k = false;
        gyhVar.o = false;
        gyhVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }
}
