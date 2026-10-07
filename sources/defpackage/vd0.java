package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class vd0 {
    public final ny8 a;
    public final ny8 b;

    public vd0(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, nq4 nq4Var) {
        ud0 ud0Var;
        ujd ujdVar;
        if (nq4Var instanceof ud0) {
            ud0Var = (ud0) nq4Var;
            int i = ud0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ud0Var.g = i - Integer.MIN_VALUE;
            } else {
                ud0Var = new ud0(this, nq4Var);
            }
        } else {
            ud0Var = new ud0(this, nq4Var);
        }
        Object objG = ud0Var.e;
        int i2 = ud0Var.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objG);
            rvb rvbVar = (rvb) this.a.getValue();
            ud0Var.g = 1;
            sih sihVarA = rvbVar.a();
            vsb vsbVar = new vsb(kfc.m, 9);
            if (str2 == null || str2.length() == 0) {
                ore.p("AuthCmd param 'token' can't be null");
                return null;
            }
            vsbVar.h(ApiProtocol.KEY_TOKEN, str2);
            if (str == null || str.length() == 0) {
                ore.p("AuthCmd param 'verifyCode' can't be null when param 'authTokenType' is 'PHONE' or 'PHONE_CONFIRM'");
                return null;
            }
            vsbVar.h("verifyCode", str);
            vsbVar.h("authTokenType", "CHECK_CODE");
            objG = sihVarA.a.g(vsbVar, ud0Var);
            if (objG != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            id0 id0Var = ud0Var.d;
            ch3.d0(objG);
            return id0Var;
        }
        ch3.d0(objG);
        id0 id0Var2 = (id0) objG;
        if (id0Var2.c.containsKey("LOGIN") && (ujdVar = id0Var2.f) != null) {
            utd utdVar = (utd) this.b.getValue();
            String str3 = (String) wm9.N0(id0Var2.c, "LOGIN");
            ud0Var.d = id0Var2;
            ud0Var.g = 2;
            if (utdVar.d(ujdVar, str3, ud0Var) == hu4Var) {
                return hu4Var;
            }
        }
        return id0Var2;
    }
}
