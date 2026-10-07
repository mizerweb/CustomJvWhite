package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class f79 implements ko5, lo5 {
    public LinkedList a;
    public volatile boolean b;

    @Override // defpackage.lo5
    public final boolean a(ko5 ko5Var) {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        LinkedList linkedList = this.a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.a = linkedList;
                        }
                        linkedList.add(ko5Var);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ko5Var.dispose();
        return false;
    }

    @Override // defpackage.lo5
    public final boolean b(ko5 ko5Var) {
        if (!c(ko5Var)) {
            return false;
        }
        ((d2f) ko5Var).dispose();
        return true;
    }

    @Override // defpackage.lo5
    public final boolean c(ko5 ko5Var) {
        if (this.b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return false;
                }
                LinkedList linkedList = this.a;
                if (linkedList != null && linkedList.remove(ko5Var)) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                LinkedList linkedList = this.a;
                ArrayList arrayList = null;
                this.a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((ko5) it.next()).dispose();
                    } catch (Throwable th) {
                        iwl.a(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw gd6.b((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
