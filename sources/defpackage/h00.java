package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h00 implements s00 {
    public static final /* synthetic */ zv8[] j;
    public final q24 a;
    public final xhh b;
    public final String c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final p3c i = qyj.S();

    static {
        z8b z8bVar = new z8b(h00.class, "getReactionsJob", "getGetReactionsJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        j = new zv8[]{z8bVar};
    }

    public h00(q24 q24Var, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = q24Var;
        this.b = xhhVar;
        this.c = "AsyncCommentsLocalDataSource#" + q24Var;
        this.d = ny8Var2;
        this.e = ny8Var;
        this.f = ny8Var3;
        this.g = ny8Var5;
        this.h = ny8Var4;
    }

    public final s04 a() {
        s04 s04Var = (s04) ((r8e) ((xn3) this.e.getValue()).c.i(this.a)).a.getValue();
        if (s04Var == null) {
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "No comments chat=" + this.a + " in cache", null);
                }
            }
        }
        return s04Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e8, code lost:
    
        if (r15 == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.s04 r13, java.util.List r14, defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h00.b(s04, java.util.List, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.s00
    public final Object j(Collection collection, nq4 nq4Var) {
        c00 c00Var;
        s04 s04Var;
        if (nq4Var instanceof c00) {
            c00Var = (c00) nq4Var;
            int i = c00Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00Var.g = i - Integer.MIN_VALUE;
            } else {
                c00Var = new c00(this, nq4Var);
            }
        } else {
            c00Var = new c00(this, nq4Var);
        }
        Object obj = c00Var.e;
        Object obj2 = hu4.a;
        int i2 = c00Var.g;
        if (i2 == 0) {
            ch3.d0(obj);
            s04 s04VarA = a();
            if (s04VarA == null) {
                return r66.a;
            }
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "getHistoryItems(ids: " + collection + ")", null);
                }
            }
            l34 l34Var = (l34) this.f.getValue();
            c00Var.d = s04VarA;
            c00Var.g = 1;
            Object objT = l34Var.t(collection, c00Var);
            if (objT != obj2) {
                obj = objT;
                s04Var = s04VarA;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        s04Var = c00Var.d;
        ch3.d0(obj);
        c00Var.d = null;
        c00Var.g = 2;
        Object objB = b(s04Var, (List) obj, c00Var);
        return objB == obj2 ? obj2 : objB;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0124, code lost:
    
        if (r1 == r2) goto L47;
     */
    @Override // defpackage.s00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(long r22, int r24, long r25, defpackage.nq4 r27) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h00.m(long, int, long, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0120, code lost:
    
        if (r1 == r2) goto L47;
     */
    @Override // defpackage.s00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(long r22, int r24, long r25, defpackage.nq4 r27) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h00.q(long, int, long, nq4):java.lang.Object");
    }
}
