package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import ru.ok.android.externcalls.sdk.p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c91 implements sg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o91 b;
    public final /* synthetic */ p c;

    public /* synthetic */ c91(o91 o91Var, p pVar, int i) {
        this.a = i;
        this.b = o91Var;
        this.c = pVar;
    }

    @Override // defpackage.sg4
    public final void accept(Object obj) {
        int i = this.a;
        p pVar = this.c;
        o91 o91Var = this.b;
        Void r7 = (Void) obj;
        switch (i) {
            case 0:
                o91Var.d(o91Var.n0, 1);
                pVar.accept(null);
                break;
            default:
                o91Var.l.removeMessages(131);
                HashMap map = new HashMap();
                ru1 ru1Var = o91Var.j0;
                Iterator it = ru1Var.j().iterator();
                while (it.hasNext()) {
                    map.put((du1) it.next(), Boolean.FALSE);
                }
                ru1Var.q(map);
                o91Var.d(o91Var.n0, 2);
                pVar.accept(r7);
                break;
        }
    }
}
