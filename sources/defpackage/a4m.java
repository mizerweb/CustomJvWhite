package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a4m {
    public static final List a(float f, View view) {
        ifg ifgVar = new ifg(view, ifg.r);
        jfg jfgVar = new jfg(f);
        jfgVar.a(0.58f);
        jfgVar.b(750.0f);
        ifgVar.m = jfgVar;
        ifgVar.a = 0.0f;
        ifg ifgVar2 = new ifg(view, ifg.s);
        jfg jfgVar2 = new jfg(f);
        jfgVar2.a(0.58f);
        jfgVar2.b(750.0f);
        ifgVar2.m = jfgVar2;
        ifgVar2.a = 0.0f;
        return xw3.P0(ifgVar, ifgVar2);
    }

    public static final void b(ow0 ow0Var) {
        if (ow0Var.d()) {
            ((View) ow0Var.getValue()).setVisibility(8);
        }
    }

    public static final void c(v5c v5cVar, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            cx3.Z0(a(0.95f, view), arrayList);
            cx3.Z0(a(1.0f, view), arrayList2);
        }
        v5cVar.setOnTouchListener(new ie8(arrayList2, list, arrayList, 1));
    }
}
