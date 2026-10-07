package defpackage;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ej9 {
    public LinkedList a;
    public WeakReference b;

    public final void a(dj9 dj9Var) {
        Iterator itDescendingIterator;
        Iterator itDescendingIterator2;
        Set set;
        LinkedList linkedList = this.a;
        if (linkedList == null || (itDescendingIterator = linkedList.descendingIterator()) == null) {
            return;
        }
        dj9 dj9Var2 = null;
        dj9 dj9Var3 = null;
        while (itDescendingIterator.hasNext()) {
            dj9 dj9Var4 = (dj9) ((WeakReference) itDescendingIterator.next()).get();
            if (dj9Var4 == null) {
                itDescendingIterator.remove();
            } else {
                if (dj9Var3 == null) {
                    dj9Var3 = dj9Var4;
                }
                if (dj9Var4 == dj9Var) {
                    if (dj9Var3 == dj9Var && (set = dj9Var.a) != null) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((cj9) it.next()).b();
                        }
                    }
                    itDescendingIterator.remove();
                }
            }
        }
        WeakReference weakReference = this.b;
        dj9 dj9Var5 = weakReference != null ? (dj9) weakReference.get() : null;
        if (dj9Var5 != null) {
            dj9Var2 = dj9Var5;
        } else {
            LinkedList linkedList2 = this.a;
            if (linkedList2 != null && (itDescendingIterator2 = linkedList2.descendingIterator()) != null) {
                while (itDescendingIterator2.hasNext() && (dj9Var2 = (dj9) ((WeakReference) itDescendingIterator2.next()).get()) == null) {
                    itDescendingIterator2.remove();
                }
            }
        }
        if (dj9Var2 != null) {
            dj9Var2.a();
        }
    }

    public final void b(dj9 dj9Var) {
        WeakReference weakReference;
        Set set;
        LinkedList linkedList = this.a;
        if (linkedList == null) {
            this.a = new LinkedList();
            weakReference = null;
        } else {
            Iterator itDescendingIterator = linkedList.descendingIterator();
            if (itDescendingIterator == null) {
                return;
            }
            weakReference = null;
            dj9 dj9Var2 = null;
            while (itDescendingIterator.hasNext()) {
                WeakReference weakReference2 = (WeakReference) itDescendingIterator.next();
                dj9 dj9Var3 = (dj9) weakReference2.get();
                if (dj9Var3 == null) {
                    itDescendingIterator.remove();
                } else {
                    if (dj9Var2 == null) {
                        if (dj9Var3 != dj9Var && (set = dj9Var3.a) != null) {
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                ((cj9) it.next()).b();
                            }
                        }
                        dj9Var2 = dj9Var3;
                    }
                    if (dj9Var3 == dj9Var) {
                        itDescendingIterator.remove();
                        weakReference = weakReference2;
                    }
                }
            }
        }
        if (weakReference == null) {
            weakReference = new WeakReference(dj9Var);
        }
        LinkedList linkedList2 = this.a;
        if (linkedList2 != null) {
            linkedList2.add(weakReference);
        }
        WeakReference weakReference3 = this.b;
        dj9 dj9Var4 = weakReference3 != null ? (dj9) weakReference3.get() : null;
        if (dj9Var4 == null || dj9Var == dj9Var4) {
            dj9Var.a();
        } else {
            dj9Var4.a();
        }
    }
}
