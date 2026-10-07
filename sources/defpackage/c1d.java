package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c1d {
    public final ArrayList a = new ArrayList();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(ViewGroup viewGroup, b1d b1dVar) {
        LinkedHashMap linkedHashMap = this.b;
        Object arrayList = linkedHashMap.get(b1dVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(b1dVar, arrayList);
        }
        List list = (List) arrayList;
        if (list.contains(viewGroup)) {
            return;
        }
        list.add(viewGroup);
        if (viewGroup.getMeasuredWidth() == 0 || viewGroup.getMeasuredHeight() == 0) {
            return;
        }
        c();
    }

    public final List b(b1d b1dVar) {
        ArrayList arrayList;
        List list = (List) this.b.get(b1dVar);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                View view = (View) obj;
                if (view.getVisibility() == 0 && view.getAlpha() == 1.0f) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? r66.a : arrayList;
    }

    public final void c() {
        Iterator it = b(b1d.a).iterator();
        int height = 0;
        int height2 = 0;
        while (it.hasNext()) {
            height2 += ((View) it.next()).getHeight();
        }
        Iterator it2 = b(b1d.b).iterator();
        while (it2.hasNext()) {
            height += ((View) it2.next()).getHeight();
        }
        d1d d1dVar = new d1d(height2, height);
        Iterator it3 = this.a.iterator();
        while (it3.hasNext()) {
            ((w22) it3.next()).H(d1dVar);
        }
    }
}
