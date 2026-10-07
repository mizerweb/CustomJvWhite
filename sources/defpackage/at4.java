package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class at4 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ at4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((et4) obj).p;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                }
                break;
            default:
                o1c o1cVar = (o1c) obj;
                gjg gjgVar = o1cVar.a;
                WeakHashMap weakHashMap = o1cVar.b;
                boolean z = view2 instanceof TextView;
                sbi sbiVar = sbi.a;
                if (z) {
                    weakHashMap.put(view2, sbiVar);
                    TextView textView = (TextView) view2;
                    bx5 bx5Var = (bx5) gjgVar.getValue();
                    Object tag = textView.getTag(R.id.dynamic_font_sizes);
                    noh nohVar = tag instanceof noh ? (noh) tag : null;
                    if (nohVar != null) {
                        nohVar.b(textView, bx5Var);
                    }
                } else if (view2 instanceof b77) {
                    weakHashMap.put(view2, sbiVar);
                    ((b77) view2).a((bx5) gjgVar.getValue());
                }
                break;
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                et4 et4Var = (et4) obj;
                et4Var.p(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = et4Var.p;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                }
                break;
            default:
                o1c o1cVar = (o1c) obj;
                if ((view2 instanceof TextView) || (view2 instanceof b77)) {
                    o1cVar.b.remove(view2);
                }
                break;
        }
    }
}
