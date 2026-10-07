package defpackage;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class x2i {
    public static final mg0 a = new mg0();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static void a(r2i r2iVar, ViewGroup viewGroup) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (r2iVar == null) {
            r2iVar = a;
        }
        r2i r2iVarClone = r2iVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((r2i) it.next()).z(viewGroup);
            }
        }
        r2iVarClone.i(viewGroup, true);
        qol.a(viewGroup);
        qol.d(viewGroup);
        w2i w2iVar = new w2i(r2iVarClone, viewGroup);
        viewGroup.addOnAttachStateChangeListener(w2iVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(w2iVar);
    }

    public static mw b() {
        mw mwVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (mwVar = (mw) weakReference.get()) != null) {
            return mwVar;
        }
        mw mwVar2 = new mw(0);
        threadLocal.set(new WeakReference(mwVar2));
        return mwVar2;
    }
}
