package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class dze {
    public final String a = dze.class.getSimpleName();
    public final ny8 b;
    public final ny8 c;

    public dze(ny8 ny8Var, ny8 ny8Var2) {
        this.b = ny8Var2;
        this.c = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object a(o60 o60Var, nq4 nq4Var) {
        cze czeVar;
        o60 o60Var2 = o60Var;
        je9 je9Var = je9.f;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof cze) {
            czeVar = (cze) nq4Var;
            int i = czeVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                czeVar.g = i - Integer.MIN_VALUE;
            } else {
                czeVar = new cze(this, nq4Var);
            }
        } else {
            czeVar = new cze(this, nq4Var);
        }
        Object objC = czeVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = czeVar.g;
        if (i2 == 0) {
            ch3.d0(objC);
            String strA = o60Var2.a();
            if (strA != null && !r5h.X0(strA)) {
                String strConcat = "dg0".concat(":".concat(this.a));
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar.b(je9Var2)) {
                        a4cVar.c(je9Var2, strConcat, "Saving gif for -> " + o60Var2 + " ", null);
                    }
                }
                vze vzeVar = (vze) this.c.getValue();
                czeVar.d = o60Var2;
                czeVar.g = 1;
                objC = vze.c(vzeVar, strA, true, czeVar);
                if (objC != hu4Var) {
                }
                return hu4Var;
            }
            String strConcat2 = "dg0".concat(":".concat(this.a));
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, strConcat2, "Gif url is empty for -> " + o60Var2, null);
            }
            return sbiVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objC);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o60Var2 = czeVar.d;
        ch3.d0(objC);
        if (((Uri) objC) == null) {
            String strConcat3 = "dg0".concat(":".concat(this.a));
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, strConcat3, "Saving gif returned null for -> " + o60Var2, null);
                return sbiVar;
            }
        } else {
            jg0 jg0Var = (jg0) this.b.getValue();
            fg0 fg0Var = new fg0(o60Var2.i, 3);
            czeVar.d = null;
            czeVar.g = 2;
            if (ch3.I(czeVar, jg0Var.a, false, true, new tc(jg0Var, 8, fg0Var)) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }
}
