package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class c27 {
    public final String a = c27.class.getName();
    public final dq4 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public c27(yt4 yt4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, xhh xhhVar) {
        xt4 xt4VarB = ((n0c) xhhVar).b();
        xt4VarB.getClass();
        this.b = cqk.a(lvb.x0(xt4VarB, yt4Var));
        this.c = ny8Var2;
        this.d = ny8Var;
        this.e = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object a(c27 c27Var, o67 o67Var, nq4 nq4Var) {
        b27 b27Var;
        String str;
        a4c a4cVar;
        je9 je9Var;
        c27Var.getClass();
        if (nq4Var instanceof b27) {
            b27Var = (b27) nq4Var;
            int i = b27Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                b27Var.g = i - Integer.MIN_VALUE;
            } else {
                b27Var = new b27(c27Var, nq4Var);
            }
        } else {
            b27Var = new b27(c27Var, nq4Var);
        }
        b27 b27Var2 = b27Var;
        Object poeVar = b27Var2.e;
        hu4 hu4Var = hu4.a;
        int i2 = b27Var2.g;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    o67Var = b27Var2.d;
                    ch3.d0(poeVar);
                } else {
                    if (i2 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o67Var = b27Var2.d;
                    ch3.d0(poeVar);
                }
                str = c27Var.a;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, c0a.o("Successfully added folder(", o67Var.c, ")"), null);
                    }
                }
                return sbi.a;
            }
            ch3.d0(poeVar);
            pvb pvbVar = (pvb) c27Var.c.getValue();
            String str2 = c27Var.a;
            ed6 ed6Var = (ed6) c27Var.e.getValue();
            b27Var2.d = o67Var;
            b27Var2.g = 1;
            poeVar = cqk.H(pvbVar, o67Var, str2, ed6Var, b27Var2);
            if (poeVar == hu4Var) {
                return hu4Var;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(c27Var.a, "Not created folder due to error", thA);
        }
        ch3.d0(poeVar);
        p67 p67Var = (p67) poeVar;
        sy4 sy4Var = (sy4) c27Var.d.getValue();
        long j = p67Var.d;
        vy2 vy2Var = p67Var.c;
        u8b u8bVar = p67Var.e;
        b27Var2.d = o67Var;
        b27Var2.g = 2;
        if (sy4Var.f(j, vy2Var, u8bVar, b27Var2) == hu4Var) {
            return hu4Var;
        }
        str = c27Var.a;
        a4cVar = gm0.f;
        if (a4cVar != null) {
            je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, c0a.o("Successfully added folder(", o67Var.c, ")"), null);
            }
        }
        return sbi.a;
    }
}
