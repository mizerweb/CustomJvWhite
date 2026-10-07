package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zuh implements pca {
    public yba a;
    public cca b;
    public final /* synthetic */ Toolbar c;

    public zuh(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.pca
    public final boolean b(g7h g7hVar) {
        return false;
    }

    @Override // defpackage.pca
    public final boolean c(cca ccaVar) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof mw3) {
            ((eca) ((mw3) callback)).a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        ccaVar.C = false;
        ccaVar.n.q(false);
        toolbar.u();
        return true;
    }

    @Override // defpackage.pca
    public final void e() {
        if (this.b != null) {
            yba ybaVar = this.a;
            if (ybaVar != null) {
                int size = ybaVar.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            c(this.b);
        }
    }

    @Override // defpackage.pca
    public final void f(yba ybaVar, boolean z) {
    }

    @Override // defpackage.pca
    public final boolean g() {
        return false;
    }

    @Override // defpackage.pca
    public final boolean h(cca ccaVar) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = ccaVar.getActionView();
        toolbar.i = actionView;
        this.b = ccaVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            avh avhVarH = Toolbar.h();
            avhVarH.a = (toolbar.n & 112) | 8388611;
            avhVarH.b = 2;
            toolbar.i.setLayoutParams(avhVarH);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((avh) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        ccaVar.C = true;
        ccaVar.n.q(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof mw3) {
            ((eca) ((mw3) callback)).a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // defpackage.pca
    public final void i(Context context, yba ybaVar) {
        cca ccaVar;
        yba ybaVar2 = this.a;
        if (ybaVar2 != null && (ccaVar = this.b) != null) {
            ybaVar2.e(ccaVar);
        }
        this.a = ybaVar;
    }
}
