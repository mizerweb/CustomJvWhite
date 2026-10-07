package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tg5 implements zp9 {
    public final /* synthetic */ ug5 a;

    @Override // defpackage.zp9
    public final void f(aq9 aq9Var) {
        aq9Var.getClass();
        ug5 ug5Var = this.a;
        ug5Var.d = aq9Var;
        Iterator it = ((CopyOnWriteArrayList) ug5Var.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ((zp9) it.next()).f(aq9Var);
        }
    }
}
