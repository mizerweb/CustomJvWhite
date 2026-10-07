package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class baj implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ v30 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;

    public baj(v30 v30Var, View view, View view2) {
        this.a = v30Var;
        this.b = view;
        this.c = view2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[PHI: r3
  0x005f: PHI (r3v8 android.view.View) = (r3v7 android.view.View), (r3v11 android.view.View) binds: [B:16:0x0039, B:24:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z;
        ViewParent parent;
        v30 v30Var = this.a;
        ArrayList arrayList = (ArrayList) v30Var.f;
        int i = v30Var.b;
        View viewFindViewById = (View) ((WeakReference) v30Var.g).get();
        View view = null;
        if (viewFindViewById == null) {
            ((WeakReference) v30Var.g).clear();
            z = true;
            viewFindViewById = null;
        } else {
            if (viewFindViewById.getId() != i || !viewFindViewById.isAttachedToWindow() || viewFindViewById.getVisibility() != 0) {
                viewFindViewById = null;
            }
            if (viewFindViewById == null) {
                ((WeakReference) v30Var.g).clear();
                z = true;
                viewFindViewById = null;
            } else {
                z = false;
            }
        }
        if (viewFindViewById != null) {
            view = viewFindViewById;
        } else {
            View view2 = this.b;
            if (view2 == null || (viewFindViewById = view2.findViewById(i)) == null) {
                viewFindViewById = this.c.getRootView().findViewById(i);
            }
            if (viewFindViewById != null && viewFindViewById.getClass().equals((Class) v30Var.d)) {
                view = viewFindViewById;
            }
        }
        if (view == null) {
            if (v30Var.c) {
                v30Var.c = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((y9j) it.next()).b();
                }
            }
            return true;
        }
        if (z) {
            WeakReference weakReference = new WeakReference(view);
            v30Var.g = weakReference;
            View view3 = (View) weakReference.get();
            if (view3 != null && (parent = view3.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        v30Var.c = true;
        Rect rect = (Rect) v30Var.e;
        n9j.e(rect, view);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((y9j) it2.next()).a(rect, view);
        }
        return true;
    }
}
