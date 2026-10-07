package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ezf implements ViewTreeObserver.OnPreDrawListener {
    public boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ll5 c;
    public final /* synthetic */ kzf d;

    public ezf(kzf kzfVar, View view, ll5 ll5Var) {
        this.d = kzfVar;
        this.b = view;
        this.c = ll5Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList<View> arrayList = new ArrayList();
        kzf kzfVar = this.d;
        for (String str : kzfVar.h) {
            View view = this.b;
            if (lzl.b(view, str) == null) {
                return false;
            }
            arrayList.add(lzl.b(view, str));
        }
        if (this.a) {
            return false;
        }
        this.a = true;
        for (View view2 : arrayList) {
            izf.a(view2, new ps9(kzfVar, view2, this.b, this, this.c, 2));
        }
        return false;
    }
}
