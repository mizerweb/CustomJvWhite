package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahg {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public ahg(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, g4b g4bVar, String str, nq4 nq4Var) {
        zgg zggVar;
        if (nq4Var instanceof zgg) {
            zggVar = (zgg) nq4Var;
            int i = zggVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                zggVar.h = i - Integer.MIN_VALUE;
            } else {
                zggVar = new zgg(this, nq4Var);
            }
        } else {
            zggVar = new zgg(this, nq4Var);
        }
        Object objV = zggVar.f;
        int i2 = zggVar.h;
        if (i2 == 0) {
            ch3.d0(objV);
            xn3 xn3Var = (xn3) this.b.getValue();
            zggVar.d = g4bVar;
            zggVar.e = str;
            zggVar.h = 1;
            objV = xn3Var.v(j, zggVar);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = zggVar.e;
            g4bVar = zggVar.d;
            ch3.d0(objV);
        }
        rt2 rt2Var = (rt2) objV;
        vg4 vg4VarW = rt2Var.w();
        sbi sbiVar = sbi.a;
        if ((vg4VarW != null && vg4VarW.H()) || rt2Var.D0()) {
            ((h4b) this.c.getValue()).B(f4b.EMPTY_DIALOG_CONTACT, g4bVar);
            return sbiVar;
        }
        int i3 = h60.p;
        g60 g60Var = new g60();
        g60Var.a = 11;
        if (str != null) {
            g60Var.o = str;
        }
        clf clfVar = new clf(rt2Var.a, g60Var.a(), 0);
        clfVar.g = g4bVar;
        ((wzj) this.a.getValue()).c(new zjf(clfVar));
        return sbiVar;
    }
}
