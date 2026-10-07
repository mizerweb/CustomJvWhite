package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class ing {
    public final ny8 a;
    public final ny8 b;

    public ing(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public static /* synthetic */ Object d(ing ingVar, String str, long j, mdh mdhVar, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            j = 0;
        }
        return ingVar.c(str2, j, 50, mdhVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(long j, nq4 nq4Var) {
        fng fngVar;
        if (nq4Var instanceof fng) {
            fngVar = (fng) nq4Var;
            int i = fngVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fngVar.f = i - Integer.MIN_VALUE;
            } else {
                fngVar = new fng(this, nq4Var);
            }
        } else {
            fngVar = new fng(this, nq4Var);
        }
        Object objD = fngVar.d;
        int i2 = fngVar.f;
        if (i2 == 0) {
            ch3.d0(objD);
            ny8 ny8Var = this.a;
            clg clgVarC = ((vdh) ny8Var.getValue()).c(j);
            if (clgVarC != null) {
                return clgVarC;
            }
            vdh vdhVar = (vdh) ny8Var.getValue();
            List listS = c0a.s(j);
            fngVar.f = 1;
            objD = vdhVar.d(listS, fngVar);
            hu4 hu4Var = hu4.a;
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objD);
        }
        return (clg) ww3.t1((List) objD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(String str, long j, int i, nq4 nq4Var) throws Throwable {
        gng gngVar;
        long j2;
        int i2;
        Object poeVar;
        my myVar;
        if (nq4Var instanceof gng) {
            gngVar = (gng) nq4Var;
            int i3 = gngVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gngVar.i = i3 - Integer.MIN_VALUE;
            } else {
                gngVar = new gng(this, nq4Var);
            }
        } else {
            gngVar = new gng(this, nq4Var);
        }
        Object objD = gngVar.g;
        int i4 = gngVar.i;
        hu4 hu4Var = hu4.a;
        if (i4 != 0) {
            if (i4 == 1) {
                int i5 = gngVar.f;
                long j3 = gngVar.e;
                try {
                    ch3.d0(objD);
                    i2 = i5;
                    j2 = j3;
                    poeVar = (my) objD;
                } catch (Throwable th) {
                    th = th;
                    i2 = i5;
                    j2 = j3;
                    poeVar = new poe(th);
                }
            } else {
                if (i4 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                myVar = gngVar.d;
                ch3.d0(objD);
            }
            return new dng(myVar.f, (List) objD);
        }
        ch3.d0(objD);
        try {
            pvb pvbVar = (pvb) this.b.getValue();
            j2 = j;
            i2 = i;
            try {
                vsb vsbVar = new vsb(2, i2, j2, (String) null, str);
                gngVar.d = null;
                j2 = j;
                try {
                    gngVar.e = j2;
                    i2 = i;
                    gngVar.f = i2;
                    gngVar.i = 1;
                    objD = pvbVar.D(vsbVar, gngVar);
                    if (objD != hu4Var) {
                        poeVar = (my) objD;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i2 = i;
                    poeVar = new poe(th);
                }
            } catch (Throwable th3) {
                th = th3;
                poeVar = new poe(th);
            }
        } catch (Throwable th4) {
            th = th4;
            j2 = j;
        }
        return hu4Var;
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            gm0.V(ing.class.getName(), "Can't search stickers by query", thA);
        }
        my myVar2 = (my) (poeVar instanceof poe ? null : poeVar);
        if (myVar2 == null) {
            return dng.c;
        }
        vdh vdhVar = (vdh) this.a.getValue();
        List list = myVar2.c;
        gngVar.d = myVar2;
        gngVar.e = j2;
        gngVar.f = i2;
        gngVar.i = 2;
        Object objD2 = vdhVar.d(list, gngVar);
        if (objD2 != hu4Var) {
            myVar = myVar2;
            objD = objD2;
            return new dng(myVar.f, (List) objD);
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(String str, long j, int i, nq4 nq4Var) throws Throwable {
        hng hngVar;
        Object poeVar;
        if (nq4Var instanceof hng) {
            hngVar = (hng) nq4Var;
            int i2 = hngVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hngVar.f = i2 - Integer.MIN_VALUE;
            } else {
                hngVar = new hng(this, nq4Var);
            }
        } else {
            hngVar = new hng(this, nq4Var);
        }
        Object objD = hngVar.d;
        int i3 = hngVar.f;
        try {
            if (i3 == 0) {
                ch3.d0(objD);
                pvb pvbVar = (pvb) this.b.getValue();
                vsb vsbVar = new vsb(3, i, j, (String) null, str);
                hngVar.f = 1;
                objD = pvbVar.D(vsbVar, hngVar);
                hu4 hu4Var = hu4.a;
                if (objD == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i3 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objD);
            }
            poeVar = (my) objD;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            gm0.V(ing.class.getName(), "Can't search stickers by query", thA);
        }
        my myVar = (my) (poeVar instanceof poe ? null : poeVar);
        if (myVar == null) {
            return eng.c;
        }
        return new eng(myVar.f, myVar.d);
    }
}
