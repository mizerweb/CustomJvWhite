package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class fzf implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ View d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ kzf f;
    public final /* synthetic */ Object g;

    public fzf(kzf kzfVar, View view, View view2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f = kzfVar;
        this.b = view;
        this.d = view2;
        this.c = arrayList;
        this.e = arrayList2;
        this.g = arrayList3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mw mwVar;
        Rect rect;
        int i = this.a;
        Object obj = this.g;
        ArrayList arrayList = this.e;
        View view = this.d;
        View view2 = this.b;
        kzf kzfVar = this.f;
        ArrayList arrayList2 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj;
                r2i r2iVar = kzfVar.k;
                if (r2iVar != null) {
                    r2iVar.C(view2);
                    r2i r2iVar2 = kzfVar.k;
                    ArrayList arrayList3 = new ArrayList();
                    if (view != null) {
                        kzf.n(arrayList3, view);
                    }
                    arrayList3.removeAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        arrayList3.add(view2);
                        lzl.a(r2iVar2, arrayList3);
                    }
                    arrayList.addAll(arrayList3);
                }
                if (list != null) {
                    if (kzfVar.j != null) {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(view2);
                        lzl.f(kzfVar.j, list, arrayList4);
                    }
                    list.clear();
                    list.add(view2);
                }
                break;
            default:
                mw mwVar2 = kzfVar.g;
                View view3 = null;
                if (mwVar2.isEmpty() || kzfVar.l == null || view2 == null) {
                    mwVar2.clear();
                    mwVar = null;
                } else {
                    mwVar = new mw(0);
                    lzl.c(mwVar, view2);
                    for (jzf jzfVar : kzfVar.i) {
                        View view4 = jzfVar.a;
                        WeakHashMap weakHashMap = i7j.a;
                        mwVar.put(y6j.f(view4), jzfVar.a);
                    }
                    mwVar.l(new ArrayList(mwVar2.values()));
                    for (int i2 = mwVar2.c - 1; i2 >= 0; i2--) {
                        if (!mwVar.containsKey((String) mwVar2.i(i2))) {
                            mwVar2.g(i2);
                        }
                    }
                }
                if (mwVar != null) {
                    arrayList2.addAll(mwVar.values());
                    arrayList2.add(view);
                }
                r2i r2iVar3 = kzfVar.l;
                if (r2iVar3 != null) {
                    r2iVar3.f.clear();
                    kzfVar.l.f.addAll(arrayList2);
                    lzl.f(kzfVar.l, arrayList, arrayList2);
                    if (kzfVar.k != null && mwVar2.c > 0 && mwVar != null) {
                        view3 = (View) mwVar.get(mwVar2.i(0));
                    }
                    if (view3 != null && (rect = (Rect) obj) != null) {
                        int[] iArr = new int[2];
                        view3.getLocationOnScreen(iArr);
                        int i3 = iArr[0];
                        rect.set(i3, iArr[1], view3.getWidth() + i3, view3.getHeight() + iArr[1]);
                        break;
                    }
                }
                break;
        }
    }

    public fzf(kzf kzfVar, View view, boolean z, ArrayList arrayList, View view2, ArrayList arrayList2, Rect rect) {
        this.f = kzfVar;
        this.b = view;
        this.c = arrayList;
        this.d = view2;
        this.e = arrayList2;
        this.g = rect;
    }
}
