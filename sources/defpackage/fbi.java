package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fbi {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public fbi(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(long j, boolean z, nq4 nq4Var) {
        ebi ebiVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof ebi) {
            ebiVar = (ebi) nq4Var;
            int i = ebiVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ebiVar.g = i - Integer.MIN_VALUE;
            } else {
                ebiVar = new ebi(this, nq4Var);
            }
        } else {
            ebiVar = new ebi(this, nq4Var);
        }
        Object obj = ebiVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = ebiVar.g;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(obj);
            String name = fbi.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, bc1.l(j, "undo hide stories #", ", wasHidden=", z), null);
                }
            }
            nv7 nv7Var = (nv7) this.a.getValue();
            ebiVar.d = j;
            ebiVar.g = 1;
            Object objA = nv7Var.a(j, z, ebiVar);
            if (objA != hu4Var) {
                objA = sbiVar;
            }
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = ebiVar.d;
            ch3.d0(obj);
        }
        long j2 = j;
        ((whh) this.b.getValue()).f(c0a.s(j2));
        ((ij4) this.c.getValue()).a(j2);
        ij4 ij4Var = (ij4) this.c.getValue();
        yab.i0(ij4Var.b, null, 0, new gj4(ij4Var, j2, lq4Var, 0), 3);
        return sbiVar;
    }
}
