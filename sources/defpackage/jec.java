package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jec extends fd5 {
    public final ArrayList e;

    public jec(Context context, ArrayList arrayList) {
        super(context);
        this.e = arrayList;
    }

    @Override // defpackage.fd5
    public final b85 c(Context context) {
        qz4 qz4Var = new qz4(context);
        fb0[] fb0VarArr = (fb0[]) this.e.toArray(new fb0[0]);
        qz4Var.d = new ks6((fb0[]) Arrays.copyOf(fb0VarArr, fb0VarArr.length));
        return qz4Var.b();
    }

    @Override // defpackage.fd5
    public final void d(inh inhVar, Looper looper, ArrayList arrayList) {
        nnh nnhVar = new nnh(inhVar, looper, new p3c(16));
        nnhVar.X = true;
        arrayList.add(nnhVar);
    }
}
