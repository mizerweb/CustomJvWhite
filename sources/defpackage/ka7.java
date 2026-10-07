package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ka7 implements gme {
    public final ArrayList a;

    public ka7(Set set) {
        if (set == null) {
            this.a = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.a = arrayList;
        ww3.p1(set, arrayList);
    }

    @Override // defpackage.pjd
    public final void a(es0 es0Var, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((gme) it.next()).a(es0Var, str);
            } catch (Exception e) {
                pj6.c("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // defpackage.pjd
    public final void b(es0 es0Var, String str, Throwable th, Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((gme) it.next()).b(es0Var, str, th, map);
            } catch (Exception e) {
                pj6.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // defpackage.pjd
    public final boolean c(es0 es0Var, String str) {
        ArrayList arrayList = this.a;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((gme) it.next()).c(es0Var, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pjd
    public final void d(es0 es0Var, String str, Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((gme) it.next()).d(es0Var, str, map);
            } catch (Exception e) {
                pj6.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // defpackage.pjd
    public final void e(es0 es0Var, String str, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((gme) it.next()).e(es0Var, str, z);
            } catch (Exception e) {
                pj6.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // defpackage.gme
    public final void f(es0 es0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((gme) it.next()).f(es0Var);
            } catch (Exception e) {
                pj6.c("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // defpackage.pjd
    public final void g(es0 es0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((gme) it.next()).g(es0Var);
            } catch (Exception e) {
                pj6.c("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // defpackage.gme
    public final void h(oof oofVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((gme) it.next()).h(oofVar);
            } catch (Exception e) {
                pj6.c("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // defpackage.gme
    public final void i(es0 es0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((gme) it.next()).i(es0Var);
            } catch (Exception e) {
                pj6.c("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // defpackage.pjd
    public final void j(es0 es0Var, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((gme) it.next()).j(es0Var, str);
            } catch (Exception e) {
                pj6.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // defpackage.gme
    public final void k(es0 es0Var, Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((gme) it.next()).k(es0Var, th);
            } catch (Exception e) {
                pj6.c("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e);
            }
        }
    }
}
