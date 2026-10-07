package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hq3 implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener a;
    public final /* synthetic */ vzb b;

    public hq3(vzb vzbVar) {
        this.b = vzbVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        vzb vzbVar = this.b;
        if (view == vzbVar && (view2 instanceof cq3)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = i7j.a;
                view2.setId(View.generateViewId());
            }
            sp3 sp3Var = vzbVar.h;
            cq3 cq3Var = (cq3) view2;
            sp3Var.a.put(Integer.valueOf(cq3Var.getId()), cq3Var);
            if (cq3Var.isChecked()) {
                sp3Var.a(cq3Var);
            }
            cq3Var.setInternalOnCheckedChangeListener(new c7k(9, sp3Var));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        vzb vzbVar = this.b;
        if (view == vzbVar && (view2 instanceof cq3)) {
            sp3 sp3Var = vzbVar.h;
            cq3 cq3Var = (cq3) view2;
            sp3Var.getClass();
            cq3Var.setInternalOnCheckedChangeListener(null);
            sp3Var.a.remove(Integer.valueOf(cq3Var.getId()));
            sp3Var.b.remove(Integer.valueOf(cq3Var.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
