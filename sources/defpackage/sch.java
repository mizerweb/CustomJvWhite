package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sch {
    public final ny8 a;
    public final ny8 b;

    public sch(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, nq4 nq4Var) {
        rch rchVar;
        if (nq4Var instanceof rch) {
            rchVar = (rch) nq4Var;
            int i = rchVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                rchVar.g = i - Integer.MIN_VALUE;
            } else {
                rchVar = new rch(this, nq4Var);
            }
        } else {
            rchVar = new rch(this, nq4Var);
        }
        Object objV = rchVar.e;
        int i2 = rchVar.g;
        if (i2 == 0) {
            ch3.d0(objV);
            xn3 xn3Var = (xn3) this.b.getValue();
            rchVar.d = j;
            rchVar.g = 1;
            objV = xn3Var.v(j, rchVar);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = rchVar.d;
            ch3.d0(objV);
        }
        long j2 = j;
        vg4 vg4VarW = ((rt2) objV).w();
        sbi sbiVar = sbi.a;
        if (vg4VarW == null) {
            gm0.Y(sch.class.getName(), "Early return in invoke cuz of chat.dialogContact is null");
            return sbiVar;
        }
        if (!vg4VarW.E()) {
            gm0.Y(sch.class.getName(), "Early return in invoke cuz of !dialogContact.isBot");
            return sbiVar;
        }
        ((wzj) this.a.getValue()).c(new tlf(new uw(6, j2, vg4VarW.v())));
        return sbiVar;
    }
}
