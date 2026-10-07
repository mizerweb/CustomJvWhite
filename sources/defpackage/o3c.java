package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class o3c implements iq8 {
    public final ny8 a;

    public o3c(ny8 ny8Var) {
        this.a = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(o3c o3cVar, eq8 eq8Var, nq4 nq4Var) {
        n3c n3cVar;
        fq8 fq8Var;
        o3cVar.getClass();
        if (nq4Var instanceof n3c) {
            n3cVar = (n3c) nq4Var;
            int i = n3cVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                n3cVar.f = i - Integer.MIN_VALUE;
            } else {
                n3cVar = new n3c(o3cVar, nq4Var);
            }
        } else {
            n3cVar = new n3c(o3cVar, nq4Var);
        }
        Object poeVar = n3cVar.d;
        int i2 = n3cVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(poeVar);
                uyb uybVar = (uyb) o3cVar.a.getValue();
                String str = eq8Var.a;
                boolean z = eq8Var.b;
                String str2 = eq8Var.c;
                n3cVar.f = 1;
                poeVar = uybVar.c(str, z, str2, n3cVar);
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
            hui huiVar = (hui) poeVar;
            String str3 = huiVar.c;
            String str4 = huiVar.d;
            if (str3 == null) {
                fq8Var = new fq8(new IllegalStateException("conversationId must not be null"));
            } else if (str4 == null) {
                fq8Var = new fq8(new IllegalStateException("internalParams must not be null"));
            } else {
                poeVar = new gq8(str3, str4);
            }
            poeVar = fq8Var;
        }
        Throwable thA = roe.a(poeVar);
        return thA == null ? poeVar : new fq8(thA);
    }
}
