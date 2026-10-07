package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class zl7 {
    public final ny8 a;
    public final ny8 b;

    public zl7(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, Long l, String str, nq4 nq4Var) {
        yl7 yl7Var;
        Object poeVar;
        String str2;
        String str3;
        if (nq4Var instanceof yl7) {
            yl7Var = (yl7) nq4Var;
            int i = yl7Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                yl7Var.i = i - Integer.MIN_VALUE;
            } else {
                yl7Var = new yl7(this, nq4Var);
            }
        } else {
            yl7Var = new yl7(this, nq4Var);
        }
        Object objD = yl7Var.g;
        int i2 = yl7Var.i;
        hu4 hu4Var = hu4.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    j = yl7Var.d;
                    ch3.d0(objD);
                } else {
                    if (i2 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = yl7Var.f;
                    str3 = yl7Var.e;
                    ch3.d0(objD);
                }
                return new xya(r5h.y1(((mm7) objD).a).toString(), str3, str2);
            }
            ch3.d0(objD);
            if (str == null || r5h.X0(str)) {
                str = null;
            }
            lrg lrgVar = new lrg(kfc.x3, 15);
            lrgVar.f(j, "botId");
            if (l != null) {
                lrgVar.a.put(ApiProtocol.PARAM_CHAT_ID, l);
            }
            if (str != null) {
                lrgVar.h("startParam", str);
            }
            pvb pvbVar = (pvb) this.a.getValue();
            yl7Var.e = null;
            yl7Var.d = j;
            yl7Var.i = 1;
            objD = pvbVar.D(lrgVar, yl7Var);
            if (objD == hu4Var) {
            }
            return hu4Var;
            poeVar = (zjj) objD;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        zjj zjjVar = (zjj) poeVar;
        if (zjjVar == null) {
            gm0.Y(zl7.class.getName(), "Early return in execute cuz of url == null");
            return null;
        }
        String str4 = zjjVar.c;
        String str5 = zjjVar.d;
        if (str4 == null) {
            gm0.Y(zl7.class.getName(), "Early return in execute cuz of url == null");
            return null;
        }
        pm7 pm7Var = (pm7) this.b.getValue();
        yl7Var.e = str4;
        yl7Var.f = str5;
        yl7Var.d = j;
        yl7Var.i = 2;
        Object objA = pm7Var.a(j, us0.c, yl7Var);
        if (objA != hu4Var) {
            objD = objA;
            str2 = str5;
            str3 = str4;
            return new xya(r5h.y1(((mm7) objD).a).toString(), str3, str2);
        }
        return hu4Var;
    }
}
