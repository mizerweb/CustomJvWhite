package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import one.me.chatscreen.ChatScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class pgd extends gr4 {
    public final long d;
    public final gr4 e;
    public final ogd f;

    public pgd(long j, gr4 gr4Var) {
        this.d = j;
        this.e = gr4Var;
        this.f = new ogd(j);
    }

    @Override // defpackage.gr4
    public final void a() {
        this.e.a();
        this.f.a();
    }

    @Override // defpackage.gr4
    public final gr4 b() {
        return new pgd(this.d, this.e);
    }

    @Override // defpackage.gr4
    public final void f(gr4 gr4Var, br4 br4Var) {
        this.e.f(gr4Var, br4Var);
        this.f.a();
    }

    @Override // defpackage.gr4
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, er4 er4Var) {
        boolean zBooleanValue = false;
        boolean z2 = view2 != null && view2.getHeight() > 0 && view2.getWidth() > 0;
        if (view == null && !z && z2) {
            er4Var.a();
            return;
        }
        if (z && view2 != null && view != null) {
            this.f.g(viewGroup, view, view2, z, er4Var);
            return;
        }
        if (z || view == null) {
            this.e.g(viewGroup, view, view2, z, er4Var);
            return;
        }
        va3 va3Var = view instanceof va3 ? (va3) view : null;
        if (va3Var != null) {
            ChatScreen chatScreen = va3Var.d;
            ou7 ou7Var = ChatScreen.L1;
            zBooleanValue = ((Boolean) chatScreen.N1().p.getValue()).booleanValue();
        }
        if (zBooleanValue) {
            this.f.g(viewGroup, view, view2, z, er4Var);
        } else {
            this.e.g(viewGroup, view, view2, z, er4Var);
        }
    }

    public final void k(View view, ViewGroup viewGroup) {
        int[] iArr = this.f.l;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null) {
            return;
        }
        Integer numL = n7j.l(viewGroup2);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f) + (numL != null ? numL.intValue() : 0);
        viewGroup2.getLocationInWindow(iArr);
        int iD = zo5.D(120.0f, yl5.d().getDisplayMetrics().density, viewGroup2.getHeight() + iArr[1]);
        view.setTranslationX(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        viewGroup2.getLocationInWindow(iArr);
        view.setTranslationY(iK - iArr[1]);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(0.0f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            p51.d();
            return;
        }
        layoutParams.width = r5a.f(12.0f, yl5.d().getDisplayMetrics().density, 2, viewGroup2.getWidth());
        layoutParams.height = iD - iK;
        view.setLayoutParams(layoutParams);
        view.setClipToOutline(true);
        view.setOutlineProvider(new nt4(gm0.K(16.0f * yl5.d().getDisplayMetrics().density)));
        if (viewGroup instanceof chd) {
            ogd.p(viewGroup, view, (va3) view);
        }
        view.invalidateOutline();
    }

    public pgd() {
        this(0L, new no9(1, true));
    }
}
