package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class k37 {
    public final String a = k37.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public k37(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.b = ny8Var3;
        this.c = ny8Var4;
        this.d = ny8Var;
        this.e = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, nq4 nq4Var) {
        j37 j37Var;
        if (nq4Var instanceof j37) {
            j37Var = (j37) nq4Var;
            int i = j37Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                j37Var.f = i - Integer.MIN_VALUE;
            } else {
                j37Var = new j37(this, nq4Var);
            }
        } else {
            j37Var = new j37(this, nq4Var);
        }
        Object poeVar = j37Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = j37Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(poeVar);
                long jR = z ? 0L : ((xb9) ((sy4) this.c.getValue()).i()).R();
                String str = this.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.j(jR, "Started retrieving folders from server, current sync="), null);
                    }
                }
                d57 d57Var = new d57(jR);
                pvb pvbVar = (pvb) this.b.getValue();
                j37Var.f = 1;
                poeVar = pvbVar.D(d57Var, j37Var);
                if (poeVar == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(poeVar);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str2 = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "Got error on retrieving folders", thA);
                }
            }
        }
        ch3.d0(poeVar);
        e57 e57Var = (e57) poeVar;
        sy4 sy4Var = (sy4) this.c.getValue();
        yab.i0(sy4Var.j, null, 0, new iy4(sy4Var, e57Var.c, e57Var.e, e57Var.d, null), 3);
        return sbi.a;
    }
}
