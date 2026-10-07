package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class t2c implements et7 {
    public final ny8 a;

    public t2c(ny8 ny8Var) {
        this.a = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(t2c t2cVar, at7 at7Var, nq4 nq4Var) {
        s2c s2cVar;
        if (nq4Var instanceof s2c) {
            s2cVar = (s2c) nq4Var;
            int i = s2cVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                s2cVar.f = i - Integer.MIN_VALUE;
            } else {
                s2cVar = new s2c(t2cVar, nq4Var);
            }
        } else {
            s2cVar = new s2c(t2cVar, nq4Var);
        }
        Object poeVar = s2cVar.d;
        int i2 = s2cVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(poeVar);
                uyb uybVar = (uyb) t2cVar.a.getValue();
                String str = at7Var.a;
                String strName = at7Var.b.name();
                String str2 = at7Var.c;
                s2cVar.f = 1;
                poeVar = uybVar.b(str, strName, str2, s2cVar);
                hu4 hu4Var = hu4.a;
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
        if (!(poeVar instanceof poe)) {
            String str3 = ((dui) poeVar).c;
            poeVar = str3 != null ? new bt7(str3, null) : ct7.a;
        }
        Throwable thA = roe.a(poeVar);
        return thA == null ? poeVar : new bt7(null, thA);
    }

    @Override // defpackage.et7
    public final dt7 invoke(at7 at7Var) {
        Object poeVar;
        try {
            poeVar = (dt7) yab.A0(k66.a, new awa(this, at7Var, (lq4) null, 10));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            poeVar = new bt7(null, thA);
        }
        return (dt7) poeVar;
    }
}
