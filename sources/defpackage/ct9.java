package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ct9 {
    public final String a = ct9.class.getName();
    public final ny8 b;
    public final ny8 c;

    public ct9(ny8 ny8Var, ny8 ny8Var2) {
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(List list, nq4 nq4Var) {
        at9 at9Var;
        if (nq4Var instanceof at9) {
            at9Var = (at9) nq4Var;
            int i = at9Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                at9Var.f = i - Integer.MIN_VALUE;
            } else {
                at9Var = new at9(this, nq4Var);
            }
        } else {
            at9Var = new at9(this, nq4Var);
        }
        Object objH = at9Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = at9Var.f;
        if (i2 == 0) {
            ch3.d0(objH);
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Delete media in index by msgIds=".concat(ww3.z1(list, null, null, null, null, 63)), null);
                }
            }
            ys9 ys9Var = (ys9) this.c.getValue();
            at9Var.f = 1;
            objH = ch3.H(at9Var, new wj1(ys9Var, list, null, 2), ys9Var.a);
            if (objH == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objH);
        }
        Iterable<zs9> iterable = (Iterable) objH;
        ArrayList arrayList = new ArrayList(yw3.W0(iterable, 10));
        for (zs9 zs9Var : iterable) {
            arrayList.add(new dt9(zs9Var.d, zs9Var.e));
        }
        return arrayList;
    }

    public final Object b(nq4 nq4Var) {
        gm0.n(this.a, "Delete all media in index");
        Object objI = ch3.I(nq4Var, ((ys9) this.c.getValue()).a, false, true, new x27(22));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object c(long j, nq4 nq4Var, String str) {
        bt9 bt9Var;
        String str2;
        long j2 = j;
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof bt9) {
            bt9Var = (bt9) nq4Var;
            int i = bt9Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                bt9Var.h = i - Integer.MIN_VALUE;
            } else {
                bt9Var = new bt9(this, nq4Var);
            }
        } else {
            bt9Var = new bt9(this, nq4Var);
        }
        Object objF = bt9Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = bt9Var.h;
        if (i2 == 0) {
            ch3.d0(objF);
            sua suaVar = (sua) this.b.getValue();
            str2 = str;
            bt9Var.e = str2;
            bt9Var.d = j2;
            bt9Var.h = 1;
            objF = suaVar.f(j2, bt9Var);
            if (objF != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objF);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = bt9Var.d;
        str2 = bt9Var.e;
        ch3.d0(objF);
        sfa sfaVar = (sfa) objF;
        if (sfaVar == null || sfaVar.O()) {
            String str3 = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str3, zo5.j(j2, "Can't save media in index because invalid message, id="), null);
            }
        } else {
            e70 e70VarI = sfaVar.i(str2);
            if (e70VarI == null) {
                String str4 = this.a;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str4, qv1.k("Can't save media in index because attach not exist, id=", str2), null);
                    return sbiVar;
                }
            } else {
                b60 b60Var = e70VarI.e;
                if (b60Var == null || b60Var.a <= 0) {
                    gm0.n(this.a, "Can't save media in index because invalid attach type");
                    return sbiVar;
                }
                String str5 = this.a;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str5, zo5.j(b60Var.a, "Save audio in index, id="), null);
                }
                zs9 zs9Var = new zs9(0L, sfaVar.h, sfaVar.a, b60Var.a, 0, jvk.a(e70VarI));
                ys9 ys9Var = (ys9) this.c.getValue();
                bt9Var.e = null;
                bt9Var.d = j2;
                bt9Var.h = 2;
                Object objI = ch3.I(bt9Var, ys9Var.a, false, true, new w14(ys9Var, 27, zs9Var));
                if (objI != hu4Var) {
                    objI = sbiVar;
                }
                if (objI == hu4Var) {
                    return hu4Var;
                }
            }
        }
        return sbiVar;
    }
}
