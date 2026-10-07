package defpackage;

import android.os.Looper;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class cte extends hl8 {
    public final /* synthetic */ vre b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cte(String[] strArr, vre vreVar) {
        super(strArr);
        this.b = vreVar;
    }

    @Override // defpackage.hl8
    public final void b(Set set) {
        tv tvVarS = tv.S();
        h7b h7bVar = new h7b(15, this.b);
        tvVarS.k.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            h7bVar.run();
        } else {
            tvVarS.T(h7bVar);
        }
    }
}
