package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bbi {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public bbi(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j, nq4 nq4Var) {
        abi abiVar;
        long j2;
        if (nq4Var instanceof abi) {
            abiVar = (abi) nq4Var;
            int i = abiVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                abiVar.g = i - Integer.MIN_VALUE;
            } else {
                abiVar = new abi(this, nq4Var);
            }
        } else {
            abiVar = new abi(this, nq4Var);
        }
        abi abiVar2 = abiVar;
        Object obj = abiVar2.e;
        hu4 hu4Var = hu4.a;
        int i2 = abiVar2.g;
        if (i2 == 0) {
            ch3.d0(obj);
            String name = bbi.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, zo5.j(j, "undo add #"), null);
                }
            }
            no4 no4Var = (no4) this.c.getValue();
            ji4 ji4Var = ji4.b;
            abiVar2.d = j;
            abiVar2.g = 1;
            if (no4Var.e(j, ji4Var, null, abiVar2) == hu4Var) {
                return hu4Var;
            }
            j2 = j;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = abiVar2.d;
            ch3.d0(obj);
        }
        ((whh) this.a.getValue()).f(c0a.s(j2));
        ((ij4) this.b.getValue()).a(j2);
        return sbi.a;
    }
}
