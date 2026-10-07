package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qte implements ViewGroup.OnHierarchyChangeListener {
    public static final qte a = new qte();
    public static final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        Iterator it = b.iterator();
        while (it.hasNext()) {
            ((ViewGroup.OnHierarchyChangeListener) it.next()).onChildViewAdded(view, view2);
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            viewGroup.setOnHierarchyChangeListener(this);
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a.onChildViewAdded(view2, viewGroup.getChildAt(i));
            }
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a.onChildViewRemoved(view2, viewGroup.getChildAt(i));
            }
            viewGroup.setOnHierarchyChangeListener(null);
        }
        Iterator it = b.iterator();
        while (it.hasNext()) {
            ((ViewGroup.OnHierarchyChangeListener) it.next()).onChildViewRemoved(view, view2);
        }
    }
}
