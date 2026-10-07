package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lzl {
    public static void a(r2i r2iVar, ArrayList arrayList) {
        if (r2iVar == null) {
            return;
        }
        int i = 0;
        if (r2iVar instanceof z2i) {
            z2i z2iVar = (z2i) r2iVar;
            int size = z2iVar.D.size();
            while (i < size) {
                a(z2iVar.Q(i), arrayList);
                i++;
            }
            return;
        }
        ArrayList arrayList2 = r2iVar.e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ArrayList arrayList3 = r2iVar.f;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                int size2 = arrayList.size();
                while (i < size2) {
                    r2iVar.b((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public static View b(View view, String str) {
        WeakHashMap weakHashMap = i7j.a;
        if (str.equals(y6j.f(view))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewB = b(viewGroup.getChildAt(i), str);
            if (viewB != null) {
                return viewB;
            }
        }
        return null;
    }

    public static void c(mw mwVar, View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap weakHashMap = i7j.a;
            String strF = y6j.f(view);
            if (strF != null) {
                mwVar.put(strF, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    c(mwVar, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public static z2i d(int i, r2i... r2iVarArr) {
        z2i z2iVar = new z2i();
        for (r2i r2iVar : r2iVarArr) {
            if (r2iVar != null) {
                z2iVar.P(r2iVar);
            }
        }
        z2iVar.S(i);
        return z2iVar;
    }

    public static WindowInsets e(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, xa7 xa7Var, WindowInsets windowInsets) {
        return onApplyWindowInsetsListener.onApplyWindowInsets(xa7Var, windowInsets);
    }

    public static void f(r2i r2iVar, List list, List list2) {
        ArrayList arrayList;
        int i = 0;
        if (r2iVar instanceof z2i) {
            z2i z2iVar = (z2i) r2iVar;
            int size = z2iVar.D.size();
            while (i < size) {
                f(z2iVar.Q(i), list, list2);
                i++;
            }
            return;
        }
        ArrayList arrayList2 = r2iVar.e;
        if ((arrayList2 == null || arrayList2.isEmpty()) && (arrayList = r2iVar.f) != null && arrayList.size() == list.size() && arrayList.containsAll(list)) {
            int size2 = list2 == null ? 0 : list2.size();
            while (i < size2) {
                r2iVar.b((View) list2.get(i));
                i++;
            }
            for (int size3 = list.size() - 1; size3 >= 0; size3--) {
                r2iVar.C((View) list.get(size3));
            }
        }
    }
}
