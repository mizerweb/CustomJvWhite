package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class ld0 {
    public final ny8 a;
    public final ny8 b;

    public ld0(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(xge xgeVar, nq4 nq4Var) {
        kd0 kd0Var;
        if (nq4Var instanceof kd0) {
            kd0Var = (kd0) nq4Var;
            int i = kd0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                kd0Var.g = i - Integer.MIN_VALUE;
            } else {
                kd0Var = new kd0(this, nq4Var);
            }
        } else {
            kd0Var = new kd0(this, nq4Var);
        }
        Object objG = kd0Var.e;
        int i2 = kd0Var.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objG);
            rvb rvbVar = (rvb) this.a.getValue();
            String str = xgeVar.a;
            String str2 = xgeVar.c;
            String str3 = xgeVar.d;
            Long l = xgeVar.e;
            int i3 = l != null ? 1 : 0;
            kd0Var.g = 1;
            rvbVar.getClass();
            vsb vsbVar = new vsb(kfc.s, 10);
            if (str == null || str.length() == 0) {
                ore.p("AuthConfirmCmd param 'token' can't be null");
                return null;
            }
            vsbVar.h(ApiProtocol.KEY_TOKEN, str);
            vsbVar.h("tokenType", "REGISTER");
            if (str2 == null || str2.length() == 0) {
                ore.p("AuthConfirmCmd param 'firstName' can't be null");
                return null;
            }
            vsbVar.h("firstName", str2);
            if (str3 != null && str3.length() != 0) {
                vsbVar.h("lastName", str3);
            }
            if (l != null) {
                vsbVar.f(l.longValue(), "photoId");
            }
            if (i3 != 0) {
                vsbVar.h("avatarType", p.a(i3));
            }
            objG = rvbVar.a().a.g(vsbVar, kd0Var);
            if (objG != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jd0 jd0Var = kd0Var.d;
            ch3.d0(objG);
            return jd0Var;
        }
        ch3.d0(objG);
        jd0 jd0Var2 = (jd0) objG;
        ujd ujdVar = jd0Var2.e;
        utd utdVar = (utd) this.b.getValue();
        String str4 = jd0Var2.c;
        kd0Var.d = jd0Var2;
        kd0Var.g = 2;
        return utdVar.d(ujdVar, str4, kd0Var) == hu4Var ? hu4Var : jd0Var2;
    }
}
