package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gkb {
    public static final /* synthetic */ int h = 0;
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final dq4 g;

    public gkb(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, xhh xhhVar, yt4 yt4Var) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
        xt4 xt4VarR0 = ((n0c) xhhVar).b().R0(1, "notif-msg-delayed-logic");
        xt4VarR0.getClass();
        this.g = cqk.a(lvb.x0(xt4VarR0, yt4Var));
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0164 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object a(gkb gkbVar, long j, gda gdaVar, nq4 nq4Var) {
        fkb fkbVar;
        gda gdaVar2;
        syd sydVar;
        Object objD;
        long j2 = j;
        Object obj = sbi.a;
        if (nq4Var instanceof fkb) {
            fkbVar = (fkb) nq4Var;
            int i = fkbVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                fkbVar.h = i - Integer.MIN_VALUE;
            } else {
                fkbVar = new fkb(gkbVar, nq4Var);
            }
        } else {
            fkbVar = new fkb(gkbVar, nq4Var);
        }
        Object obj2 = fkbVar.f;
        Object obj3 = hu4.a;
        int i2 = fkbVar.h;
        if (i2 == 0) {
            ch3.d0(obj2);
            fkbVar.e = gdaVar;
            fkbVar.d = j2;
            fkbVar.h = 1;
            Object objC = gkbVar.c(j2, fkbVar);
            if (objC != obj3) {
                gdaVar2 = gdaVar;
                obj2 = objC;
            }
            return obj3;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj2);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = fkbVar.d;
        gda gdaVar3 = fkbVar.e;
        ch3.d0(obj2);
        gdaVar2 = gdaVar3;
        rt2 rt2Var = (rt2) obj2;
        if (rt2Var != null) {
            vg4 vg4VarF = ((bi4) gkbVar.d.getValue()).f(gdaVar2.d, false);
            String strK = vg4VarF != null ? vg4VarF.k() : null;
            String str = strK == null ? "" : strK;
            long j3 = rt2Var.b.a;
            String strF = rt2Var.F();
            y1f y1fVar = new y1f(j3, strF, gdaVar2, str);
            azd azdVar = (azd) gkbVar.e.getValue();
            fkbVar.e = null;
            fkbVar.d = j2;
            fkbVar.h = 2;
            azdVar.getClass();
            je9 je9Var = je9.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "azd", "handleScheduledMessageNotification " + y1fVar, null);
            }
            ilb ilbVar = new ilb(j3);
            if (azdVar.b(ilbVar, gdaVar2.a)) {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, "azd", "Early return in handleScheduledMessageNotification cuz of isNotAuth(" + ilbVar + ", " + gdaVar2.a + ")", null);
                }
            } else {
                long j4 = gdaVar2.a;
                bo6 bo6Var = bo6.SCHEDULED;
                long j5 = gdaVar2.d;
                long j6 = y1fVar.b;
                String str2 = y1fVar.a;
                String str3 = str2 == null ? "" : str2;
                long j7 = -j4;
                boolean z = y1fVar.c;
                String str4 = y1fVar.d;
                ((wxb) azdVar.o.getValue()).getClass();
                int iOrdinal = ((j51) wxb.b.getValue()).ordinal();
                if (iOrdinal == 0) {
                    sydVar = syd.GCM;
                } else {
                    if (iOrdinal != 1) {
                        ore.o();
                        return null;
                    }
                    sydVar = syd.HUAWEI;
                }
                objD = azdVar.d(new xn6(ilbVar, j4, bo6Var, strF, str, j5, j6, str3, j7, null, str4, true, z, null, null, sydVar), null, null, fkbVar);
                if (objD != obj3) {
                }
                if (objD == obj3) {
                    return obj3;
                }
            }
            objD = obj;
            if (objD == obj3) {
                return obj3;
            }
        }
        return obj;
    }

    public static final akb b(gkb gkbVar, dkb dkbVar) {
        long j = dkbVar.c;
        gda gdaVar = dkbVar.f;
        if (gdaVar != null) {
            return new akb(j, null, 0L, gdaVar, false, 0L, false, null, -1, -1L);
        }
        ore.p("Required value was null.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, nq4 nq4Var) {
        ekb ekbVar;
        if (nq4Var instanceof ekb) {
            ekbVar = (ekb) nq4Var;
            int i = ekbVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ekbVar.g = i - Integer.MIN_VALUE;
            } else {
                ekbVar = new ekb(this, nq4Var);
            }
        } else {
            ekbVar = new ekb(this, nq4Var);
        }
        Object objI = ekbVar.e;
        int i2 = ekbVar.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            xn3 xn3Var = (xn3) this.a.getValue();
            ekbVar.d = j;
            ekbVar.g = 1;
            objI = xn3Var.i(j, ekbVar);
            if (objI != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objI);
                return objI;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = ekbVar.d;
        ch3.d0(objI);
        long j2 = j;
        rt2 rt2Var = (rt2) objI;
        if (rt2Var != null) {
            return rt2Var;
        }
        i20 i20Var = new i20(this, j2, (lq4) null, 20);
        ekbVar.d = j2;
        ekbVar.g = 2;
        Object objL0 = lvb.L0(1000L, i20Var, ekbVar);
        return objL0 == hu4Var ? hu4Var : objL0;
    }
}
