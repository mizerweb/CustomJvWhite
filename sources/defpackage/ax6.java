package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ax6 extends o4h {
    public bx6 n;
    public n21 o;

    @Override // defpackage.o4h
    public final long b(nmc nmcVar) {
        byte[] bArr = nmcVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            nmcVar.O(4);
            nmcVar.I();
        }
        int iD = ayl.d(i, nmcVar);
        nmcVar.N(0);
        return iD;
    }

    @Override // defpackage.o4h
    public final boolean c(nmc nmcVar, long j, ewe eweVar) {
        byte[] bArr = nmcVar.a;
        bx6 bx6Var = this.n;
        if (bx6Var == null) {
            bx6 bx6Var2 = new bx6(17, bArr);
            this.n = bx6Var2;
            a87 a87VarA = bx6Var2.c(Arrays.copyOfRange(bArr, 9, nmcVar.c), null).a();
            a87VarA.l = uya.n("audio/ogg");
            eweVar.b = new b87(a87VarA);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            n21 n21Var = this.o;
            if (n21Var != null) {
                n21Var.a = j;
                eweVar.c = n21Var;
            }
            ((b87) eweVar.b).getClass();
            return false;
        }
        xp9 xp9VarB = cyl.b(nmcVar);
        bx6 bx6Var3 = new bx6(bx6Var.a, bx6Var.b, bx6Var.c, bx6Var.d, bx6Var.e, bx6Var.g, bx6Var.h, bx6Var.j, xp9VarB, bx6Var.l);
        this.n = bx6Var3;
        n21 n21Var2 = new n21();
        n21Var2.c = bx6Var3;
        n21Var2.d = xp9VarB;
        n21Var2.a = -1L;
        n21Var2.b = -1L;
        this.o = n21Var2;
        return true;
    }

    @Override // defpackage.o4h
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
