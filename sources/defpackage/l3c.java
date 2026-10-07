package defpackage;

import java.io.FileNotFoundException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class l3c {
    public final ny8 a;
    public final ifh b;
    public final ifh c;
    public final ifh d;

    public l3c(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ha9 ha9Var) {
        this.a = ny8Var5;
        this.b = new ifh(new j3c(ny8Var, ny8Var2, ny8Var3, ny8Var4, ny8Var5, ny8Var6, ha9Var));
        this.c = new ifh(new z5(ny8Var, ny8Var2, ha9Var, 7));
        this.d = new ifh(new fg9(ny8Var, ny8Var2, ny8Var3, ha9Var, 1));
    }

    public static boolean a(pza pzaVar, String str) throws InterruptedException {
        byte[] bArrD;
        boolean zE;
        je9 je9Var = je9.d;
        gm0.n("OneMeInitialDataStorage", str);
        f40 f40VarC = pzaVar.c();
        try {
            bArrD = f40VarC.d();
        } catch (FileNotFoundException e) {
            String strD = pzaVar.d();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, strD, "file " + f40VarC.c + " not found", e);
            }
            bArrD = null;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            gm0.V(pzaVar.d(), "load failed", th);
            bArrD = null;
        }
        if (bArrD == null) {
            gm0.Y(pzaVar.getClass().getName(), "Early return in load cuz of safe read fully is null");
            zE = true;
        } else {
            zE = pzaVar.e(bArrD);
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "OneMeInitialDataStorage", qt4.n("(", str, ") finished ", zE), null);
        }
        return zE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r6.a(r0) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.nq4 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.k3c
            if (r0 == 0) goto L13
            r0 = r7
            k3c r0 = (defpackage.k3c) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            k3c r0 = new k3c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.f
            r2 = 3
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            defpackage.ch3.d0(r7)
            goto L79
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            r6 = 0
            return r6
        L34:
            defpackage.ch3.d0(r7)
            goto L68
        L38:
            defpackage.ch3.d0(r7)
            goto L57
        L3c:
            defpackage.ch3.d0(r7)
            java.lang.String r7 = "OneMeInitialDataStorage"
            java.lang.String r1 = "reset"
            defpackage.gm0.n(r7, r1)
            ifh r7 = r6.b
            java.lang.Object r7 = r7.getValue()
            zya r7 = (defpackage.zya) r7
            r0.f = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r5) goto L57
            goto L78
        L57:
            ifh r7 = r6.c
            java.lang.Object r7 = r7.getValue()
            iza r7 = (defpackage.iza) r7
            r0.f = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r5) goto L68
            goto L78
        L68:
            ifh r6 = r6.d
            java.lang.Object r6 = r6.getValue()
            qza r6 = (defpackage.qza) r6
            r0.f = r2
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r5) goto L79
        L78:
            return r5
        L79:
            sbi r6 = defpackage.sbi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l3c.b(nq4):java.lang.Object");
    }
}
