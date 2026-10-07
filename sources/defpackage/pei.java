package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class pei {
    public final String a = pei.class.getName();
    public final ny8 b;

    public pei(ny8 ny8Var) {
        this.b = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(long j, oo ooVar, nq4 nq4Var) {
        oei oeiVar;
        oo ooVar2;
        Object obj;
        int i;
        int i2;
        f70 f70Var;
        if (nq4Var instanceof oei) {
            oeiVar = (oei) nq4Var;
            int i3 = oeiVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oeiVar.j = i3 - Integer.MIN_VALUE;
            } else {
                oeiVar = new oei(this, nq4Var);
            }
        } else {
            oeiVar = new oei(this, nq4Var);
        }
        Object obj2 = oeiVar.h;
        hu4 hu4Var = hu4.a;
        int i4 = oeiVar.j;
        int i5 = 1;
        try {
            if (i4 == 0) {
                ch3.d0(obj2);
                g24 g24Var = (g24) this.b.getValue();
                oeiVar.e = ooVar;
                oeiVar.d = j;
                oeiVar.f = 0;
                oeiVar.g = 0;
                oeiVar.j = 1;
                Object objI = ch3.I(oeiVar, g24Var.a, true, false, new k14(j, g24Var, i5));
                if (objI != hu4Var) {
                    ooVar2 = ooVar;
                    obj = objI;
                    i = 0;
                    i2 = 0;
                }
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    ch3.d0(obj2);
                    return obj2;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = oeiVar.g;
            int i7 = oeiVar.f;
            long j2 = oeiVar.d;
            oo ooVar3 = oeiVar.e;
            ch3.d0(obj2);
            ooVar2 = ooVar3;
            i = i6;
            i2 = i7;
            j = j2;
            obj = obj2;
            uy3 uy3Var = (uy3) obj;
            if (uy3Var == null) {
                String str = this.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "comment not found by " + j, null);
                    }
                }
                return new Integer(0);
            }
            c46 c46Var = uy3Var.o;
            if (c46Var != null) {
                f70Var = c46Var.p();
            } else {
                f70Var = new f70();
                f70Var.a = r66.a;
            }
            int iB = f70Var.b() + (f70Var.b != null ? 1 : 0);
            ooVar2.accept(f70Var);
            int iB2 = f70Var.b() + (f70Var.b != null ? 1 : 0);
            if (iB <= 0 && iB2 <= 0) {
                return new Integer(0);
            }
            c46 c46VarC = f70Var.c();
            oeiVar.e = null;
            oeiVar.d = j;
            oeiVar.f = i2;
            oeiVar.g = i;
            oeiVar.j = 2;
            g24 g24Var2 = (g24) this.b.getValue();
            Object objI2 = ch3.I(oeiVar, g24Var2.a, false, true, new tc(g24Var2, 28, new cei(j, c46VarC, pm9.a(c46VarC))));
            return objI2 == hu4Var ? hu4Var : objI2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(this.a, "Can't update attach", th);
            return new Integer(0);
        }
    }
}
