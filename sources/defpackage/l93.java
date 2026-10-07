package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l93 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public l93(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(long j, long j2, long j3, boolean z, nq4 nq4Var) {
        k93 k93Var;
        long j4;
        long j5;
        boolean z2;
        long j6 = j3;
        if (nq4Var instanceof k93) {
            k93Var = (k93) nq4Var;
            int i = k93Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                k93Var.j = i - Integer.MIN_VALUE;
            } else {
                k93Var = new k93(this, nq4Var);
            }
        } else {
            k93Var = new k93(this, nq4Var);
        }
        Object objF = k93Var.h;
        int i2 = k93Var.j;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objF);
            sua suaVar = (sua) this.b.getValue();
            j4 = j;
            k93Var.d = j4;
            j5 = j2;
            k93Var.e = j5;
            k93Var.f = j6;
            z2 = z;
            k93Var.g = z2;
            k93Var.j = 1;
            objF = suaVar.f(j6, k93Var);
            if (objF != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objF);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z3 = k93Var.g;
        long j7 = k93Var.f;
        j5 = k93Var.e;
        long j8 = k93Var.d;
        ch3.d0(objF);
        z2 = z3;
        j6 = j7;
        j4 = j8;
        sfa sfaVar = (sfa) objF;
        if (sfaVar == null) {
            gm0.Y(l93.class.getName(), "Early return in execute cuz of messagesRepository.selectMessage(messageId) is null");
            return sbiVar;
        }
        long j9 = sfaVar.b;
        k93Var.d = j4;
        k93Var.e = j5;
        k93Var.f = j6;
        k93Var.g = z2;
        k93Var.j = 2;
        b(j4, j5, z2, j9);
        return sbiVar == hu4Var ? hu4Var : sbiVar;
    }

    public final sbi b(long j, long j2, boolean z, long j3) {
        l93 l93Var = this;
        sbi sbiVar = sbi.a;
        if (j3 != 0) {
            pvb pvbVar = (pvb) l93Var.a.getValue();
            if (pvbVar.j(j)) {
                pvb.t(pvbVar, new cg3(pvbVar.u().a.g(), j, j2, 0, null, false, null, null, null, null, null, Long.valueOf(j3), z));
                l93Var = this;
            }
            qw2 qw2VarJ = ((xn3) l93Var.c.getValue()).j();
            qw2VarJ.r(j, uw2.d);
            qw2VarJ.v(j, false, new x50(j3, 6));
            return sbiVar;
        }
        String name = l93.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbS = qt4.s(j, "invalid message id for pin in chat ", "/");
                sbS.append(j2);
                a4cVar.c(je9Var, name, sbS.toString(), null);
            }
        }
        return sbiVar;
    }
}
