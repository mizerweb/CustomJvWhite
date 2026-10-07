package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class mhc extends o4h {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(nmc nmcVar, byte[] bArr) {
        if (nmcVar.a() < bArr.length) {
            return false;
        }
        int i = nmcVar.b;
        byte[] bArr2 = new byte[bArr.length];
        nmcVar.k(0, bArr2, bArr.length);
        nmcVar.N(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.o4h
    public final long b(nmc nmcVar) {
        byte[] bArr = nmcVar.a;
        return (((long) this.i) * uel.c(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.o4h
    public final boolean c(nmc nmcVar, long j, ewe eweVar) {
        if (e(nmcVar, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(nmcVar.a, nmcVar.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListA = uel.a(bArrCopyOf);
            if (((b87) eweVar.b) == null) {
                a87 a87Var = new a87();
                a87Var.l = uya.n("audio/ogg");
                a87Var.m = uya.n("audio/opus");
                a87Var.E = i;
                a87Var.F = 48000;
                a87Var.p = arrayListA;
                eweVar.b = new b87(a87Var);
                return true;
            }
        } else {
            if (!e(nmcVar, p)) {
                ((b87) eweVar.b).getClass();
                return false;
            }
            ((b87) eweVar.b).getClass();
            if (!this.n) {
                this.n = true;
                nmcVar.O(8);
                lwa lwaVarG = t01.g(c98.o((String[]) t01.h(nmcVar, false, false).a));
                if (lwaVarG != null) {
                    a87 a87VarA = ((b87) eweVar.b).a();
                    a87VarA.k = lwaVarG.b(((b87) eweVar.b).l);
                    eweVar.b = new b87(a87VarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.o4h
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
