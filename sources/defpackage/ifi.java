package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ifi {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public ifi(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(long j, long j2, String str, u60 u60Var, nq4 nq4Var) {
        hfi hfiVar;
        if (nq4Var instanceof hfi) {
            hfiVar = (hfi) nq4Var;
            int i = hfiVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                hfiVar.h = i - Integer.MIN_VALUE;
            } else {
                hfiVar = new hfi(this, nq4Var);
            }
        } else {
            hfiVar = new hfi(this, nq4Var);
        }
        Object obj = hfiVar.f;
        int i2 = hfiVar.h;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(obj);
            sua suaVar = (sua) this.a.getValue();
            bad badVar = new bad(u60Var, 22, this);
            hfiVar.d = j;
            hfiVar.e = j2;
            hfiVar.h = 1;
            suaVar.s(j2, str, badVar);
            hu4 hu4Var = hu4.a;
            if (sbiVar == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = hfiVar.e;
            j = hfiVar.d;
            ch3.d0(obj);
        }
        ((t51) this.b.getValue()).c(new kfi(j, j2, false));
        return sbiVar;
    }
}
