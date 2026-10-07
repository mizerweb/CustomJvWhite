package defpackage;

import android.graphics.Bitmap;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class ki1 implements z3e {
    public final ny8 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(Bitmap bitmap, File file, nq4 nq4Var) {
        yzi yziVar;
        if (nq4Var instanceof yzi) {
            yziVar = (yzi) nq4Var;
            int i = yziVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                yziVar.f = i - Integer.MIN_VALUE;
            } else {
                yziVar = new yzi(this, nq4Var);
            }
        } else {
            yziVar = new yzi(this, nq4Var);
        }
        Object objK0 = yziVar.d;
        int i2 = yziVar.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            xt4 xt4VarA = ((n0c) ((xhh) this.a.getValue())).a();
            uf3 uf3Var = new uf3(bitmap, this, file, (lq4) null, 10);
            yziVar.f = 1;
            objK0 = yab.K0(xt4VarA, uf3Var, yziVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return objK0;
    }

    @Override // defpackage.z3e
    public boolean shouldHideSensitiveInformation() {
        ((wxb) this.a.getValue()).getClass();
        return true;
    }
}
