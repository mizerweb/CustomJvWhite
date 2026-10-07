package defpackage;

import java.io.Serializable;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public final class wz3 {
    public final q24 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ifh e = new ifh(new pe3(6, this));
    public final Set f = a.p1(new hda[]{hda.h, hda.d, hda.k, hda.f, hda.g, hda.e, hda.j});

    public wz3(q24 q24Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = q24Var;
        this.b = ny8Var;
        this.c = ny8Var3;
        this.d = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r9 == r4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(boolean r8, defpackage.nq4 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.uz3
            if (r0 == 0) goto L13
            r0 = r9
            uz3 r0 = (defpackage.uz3) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            uz3 r0 = new uz3
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            hu4 r4 = defpackage.hu4.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            boolean r8 = r0.d
            defpackage.ch3.d0(r9)
            goto L67
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            r7 = 0
            return r7
        L33:
            boolean r8 = r0.d
            defpackage.ch3.d0(r9)
            goto L47
        L39:
            defpackage.ch3.d0(r9)
            r0.d = r8
            r0.g = r3
            java.io.Serializable r9 = r7.b(r0)
            if (r9 != r4) goto L47
            goto L66
        L47:
            ylc r9 = (defpackage.ylc) r9
            java.lang.Object r9 = r9.b
            sfa r9 = (defpackage.sfa) r9
            if (r9 != 0) goto L52
            r66 r7 = defpackage.r66.a
            return r7
        L52:
            ifh r1 = r7.e
            java.lang.Object r1 = r1.getValue()
            cea r1 = (defpackage.cea) r1
            long r5 = r9.a
            r0.d = r8
            r0.g = r2
            java.io.Serializable r9 = r1.k(r5, r0)
            if (r9 != r4) goto L67
        L66:
            return r4
        L67:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L72:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r9.next()
            r2 = r1
            hda r2 = (defpackage.hda) r2
            java.util.Set r3 = r7.f
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L72
            r0.add(r1)
            goto L72
        L8b:
            java.util.ArrayList r7 = new java.util.ArrayList
            r9 = 10
            int r9 = defpackage.yw3.W0(r0, r9)
            r7.<init>(r9)
            java.util.Iterator r9 = r0.iterator()
        L9a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lae
            java.lang.Object r0 = r9.next()
            hda r0 = (defpackage.hda) r0
            rp4 r0 = defpackage.ksk.a(r0, r8)
            r7.add(r0)
            goto L9a
        Lae:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz3.a(boolean, nq4):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Serializable b(nq4 nq4Var) {
        vz3 vz3Var;
        rt2 rt2Var;
        rt2 rt2Var2;
        if (nq4Var instanceof vz3) {
            vz3Var = (vz3) nq4Var;
            int i = vz3Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                vz3Var.g = i - Integer.MIN_VALUE;
            } else {
                vz3Var = new vz3(this, nq4Var);
            }
        } else {
            vz3Var = new vz3(this, nq4Var);
        }
        vz3 vz3Var2 = vz3Var;
        Object objI = vz3Var2.e;
        int i2 = vz3Var2.g;
        sfa sfaVar = null;
        q24 q24Var = this.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            xn3 xn3Var = (xn3) this.b.getValue();
            long j = q24Var.a;
            vz3Var2.g = 1;
            objI = xn3Var.i(j, vz3Var2);
            if (objI != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            ch3.d0(objI);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rt2Var2 = vz3Var2.d;
            ch3.d0(objI);
        }
        sfaVar = (sfa) objI;
        rt2Var = rt2Var2;
        return new ylc(rt2Var, sfaVar);
        rt2Var = (rt2) objI;
        if (rt2Var != null) {
            sua suaVar = (sua) this.c.getValue();
            long j2 = rt2Var.a;
            long j3 = q24Var.b;
            vz3Var2.d = rt2Var;
            vz3Var2.g = 2;
            Object objP = suaVar.p(j2, j3, vz3Var2);
            if (objP != hu4Var) {
                objI = objP;
                rt2Var2 = rt2Var;
                sfaVar = (sfa) objI;
                rt2Var = rt2Var2;
            }
            return hu4Var;
        }
        return new ylc(rt2Var, sfaVar);
    }
}
