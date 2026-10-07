package defpackage;

import java.util.concurrent.CancellationException;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class kp3 {
    public final ny8 a;
    public final String b = kp3.class.getName();

    public kp3(ny8 ny8Var) {
        this.a = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(nq4 nq4Var) {
        jp3 jp3Var;
        ep3 ep3Var;
        yhh yhhVar;
        if (nq4Var instanceof jp3) {
            jp3Var = (jp3) nq4Var;
            int i = jp3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jp3Var.f = i - Integer.MIN_VALUE;
            } else {
                jp3Var = new jp3(this, nq4Var);
            }
        } else {
            jp3Var = new jp3(this, nq4Var);
        }
        jp3 jp3Var2 = jp3Var;
        Object objE = jp3Var2.d;
        int i2 = jp3Var2.f;
        try {
            if (i2 == 0) {
                ch3.d0(objE);
                pvb pvbVar = (pvb) this.a.getValue();
                vsb vsbVar = new vsb(kfc.M1, 25);
                String str = this.b;
                jp3Var2.f = 1;
                objE = qe7.E(pvbVar, vsbVar, str, 0L, 0, null, null, jp3Var2, 124);
                hu4 hu4Var = hu4.a;
                if (objE == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objE);
            }
            return new hp3();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if (!(th instanceof TamErrorException) || (yhhVar = th.a) == null) {
                ep3Var = new ep3(th);
            } else {
                String str2 = yhhVar.b;
                if (cqk.d(str2, "digitalid.not.found")) {
                    return fp3.a;
                }
                if (cqk.d(str2, "too.many.public.channels")) {
                    return gp3.a;
                }
                ep3Var = new ep3(th);
            }
            return ep3Var;
        }
    }
}
