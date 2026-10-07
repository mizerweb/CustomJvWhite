package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o48 implements jmf {
    public final /* synthetic */ int a;
    public final /* synthetic */ cli b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o48(cli cliVar, Object obj, int i) {
        this.a = i;
        this.b = cliVar;
        this.c = obj;
    }

    @Override // defpackage.jmf
    public final void a(lmf lmfVar) {
        int i = this.a;
        Object obj = this.c;
        cli cliVar = this.b;
        switch (i) {
            case 0:
                u48 u48Var = (u48) cliVar;
                w48 w48Var = (w48) obj;
                if (u48Var.e() != null) {
                    wxl.a();
                    imf imfVar = u48Var.C;
                    if (imfVar != null) {
                        imfVar.b();
                        u48Var.C = null;
                    }
                    i88 i88Var = u48Var.B;
                    if (i88Var != null) {
                        i88Var.a();
                        u48Var.B = null;
                    }
                    w48Var.c();
                    u48Var.g();
                    y48 y48Var = (y48) u48Var.i;
                    yi0 yi0Var = u48Var.j;
                    yi0Var.getClass();
                    hmf hmfVarJ = u48Var.J(y48Var, yi0Var);
                    u48Var.A = hmfVarJ;
                    Object[] objArr = {hmfVarJ.c()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    u48Var.H(Collections.unmodifiableList(arrayList));
                    u48Var.s();
                    break;
                }
                break;
            default:
                mxa mxaVar = (mxa) cliVar;
                mxaVar.H(Collections.singletonList(mxaVar.K((Size) obj).c()));
                mxaVar.s();
                break;
        }
    }
}
