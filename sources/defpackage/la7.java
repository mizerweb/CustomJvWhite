package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class la7 implements hme {
    public final ArrayList a;

    public la7(Set set) {
        this.a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hme hmeVar = (hme) it.next();
            if (hmeVar != null) {
                this.a.add(hmeVar);
            }
        }
    }

    public static void l(Exception exc, String str) {
        pj6.c("ForwardingRequestListener", str, exc);
    }

    @Override // defpackage.hme
    public final void a(v78 v78Var, String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((hme) arrayList.get(i)).a(v78Var, str, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestSuccess");
            }
        }
    }

    @Override // defpackage.hme
    public final void b(String str, String str2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((hme) arrayList.get(i)).b(str, str2);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerStart");
            }
        }
    }

    @Override // defpackage.hme
    public final boolean c(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((hme) arrayList.get(i)).c(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hme
    public final void d(String str, String str2, Map map) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((hme) arrayList.get(i)).d(str, str2, map);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithSuccess");
            }
        }
    }

    @Override // defpackage.hme
    public final void e(String str, String str2, Throwable th, Map map) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((hme) arrayList.get(i)).e(str, str2, th, map);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithFailure");
            }
        }
    }

    @Override // defpackage.hme
    public final void f(v78 v78Var, Object obj, String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((hme) arrayList.get(i)).f(v78Var, obj, str, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestStart");
            }
        }
    }

    @Override // defpackage.hme
    public final void g(v78 v78Var, String str, Throwable th, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((hme) arrayList.get(i)).g(v78Var, str, th, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestFailure");
            }
        }
    }

    @Override // defpackage.hme
    public final void h(String str, String str2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((hme) arrayList.get(i)).h(str, str2);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithCancellation");
            }
        }
    }

    @Override // defpackage.hme
    public final void i(String str, String str2, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((hme) arrayList.get(i)).i(str, str2, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithSuccess");
            }
        }
    }

    @Override // defpackage.hme
    public final void j(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((hme) arrayList.get(i)).j(str);
            } catch (Exception e) {
                l(e, "InternalListener exception in onIntermediateChunkStart");
            }
        }
    }

    @Override // defpackage.hme
    public final void k(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((hme) arrayList.get(i)).k(str);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestCancellation");
            }
        }
    }

    public la7(hme... hmeVarArr) {
        this.a = new ArrayList(hmeVarArr.length);
        for (hme hmeVar : hmeVarArr) {
            if (hmeVar != null) {
                this.a.add(hmeVar);
            }
        }
    }
}
