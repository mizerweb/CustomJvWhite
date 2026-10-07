package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class g6f implements y9j {
    public final /* synthetic */ h6f a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;

    public g6f(h6f h6fVar, Rect rect, Rect rect2, Rect rect3, int i) {
        this.a = h6fVar;
        this.b = rect;
        this.c = rect2;
        this.d = rect3;
        this.e = i;
    }

    @Override // defpackage.y9j
    public final void a(Rect rect, View view) {
        gpl gplVarJ;
        xbd callback;
        h6f h6fVar = this.a;
        View view2 = (View) h6fVar.b;
        if (((View) h6fVar.c) == null) {
            View viewK = h6f.k(view);
            if (viewK == null) {
                viewK = (View) view.getParent();
            }
            h6fVar.c = viewK;
            RecyclerView recyclerView = viewK instanceof RecyclerView ? (RecyclerView) viewK : null;
            if (recyclerView != null) {
                n1g.Q(recyclerView, new tyc(recyclerView, 2), null, 5);
            }
        }
        Rect rect2 = this.b;
        n9j.e(rect2, view2);
        ViewParent parent = view2.getParent();
        ecd ecdVar = parent instanceof ecd ? (ecd) parent : null;
        int iB = (ecdVar == null || (callback = ecdVar.getCallback()) == null) ? rect2.top : callback.b();
        View view3 = (View) h6fVar.c;
        Rect rect3 = this.c;
        if (view3 != null) {
            n9j.e(rect3, view3);
        }
        int i = rect3.top;
        int i2 = this.e;
        Rect rect4 = this.d;
        rect4.top = i + i2;
        rect4.bottom = iB - i2;
        rect4.left = rect3.left;
        rect4.right = rect3.right;
        if (rect4.contains(rect) || (gplVarJ = h6f.j(view)) == null) {
            return;
        }
        gplVarJ.a(rect, rect4);
    }

    @Override // defpackage.y9j
    public final void b() {
    }

    @Override // defpackage.y9j
    public final void c() {
        h6f h6fVar = this.a;
        View view = (View) h6fVar.c;
        RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
        if (recyclerView != null) {
            n1g.Q(recyclerView, new tyc(recyclerView, 1), null, 5);
        }
        h6fVar.c = null;
    }
}
