package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vgg extends hca implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context b;
    public final yba c;
    public final vba d;
    public final boolean e;
    public final int f;
    public final int g;
    public final nca h;
    public PopupWindow.OnDismissListener k;
    public View l;
    public View m;
    public oca n;
    public ViewTreeObserver o;
    public boolean p;
    public boolean q;
    public int r;
    public boolean t;
    public final ls i = new ls(3, this);
    public final vn2 j = new vn2(7, this);
    public int s = 0;

    public vgg(Context context, yba ybaVar, View view, int i, boolean z) {
        this.b = context;
        this.c = ybaVar;
        this.e = z;
        this.d = new vba(ybaVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.g = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.l = view;
        this.h = new nca(context, null, i, 0);
        ybaVar.c(this, context);
    }

    @Override // defpackage.x3g
    public final boolean a() {
        return !this.p && this.h.z.isShowing();
    }

    @Override // defpackage.pca
    public final boolean b(g7h g7hVar) {
        boolean z;
        if (g7hVar.hasVisibleItems()) {
            jca jcaVar = new jca(this.b, g7hVar, this.m, this.e, this.g, 0);
            oca ocaVar = this.n;
            jcaVar.h = ocaVar;
            hca hcaVar = jcaVar.i;
            if (hcaVar != null) {
                hcaVar.d(ocaVar);
            }
            int size = g7hVar.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = g7hVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            jcaVar.g = z;
            hca hcaVar2 = jcaVar.i;
            if (hcaVar2 != null) {
                hcaVar2.o(z);
            }
            jcaVar.j = this.k;
            this.k = null;
            this.c.d(false);
            nca ncaVar = this.h;
            int width = ncaVar.f;
            int iJ = ncaVar.j();
            if ((Gravity.getAbsoluteGravity(this.s, this.l.getLayoutDirection()) & 7) == 5) {
                width += this.l.getWidth();
            }
            if (!jcaVar.b()) {
                if (jcaVar.e != null) {
                    jcaVar.d(width, iJ, true, true);
                }
            }
            oca ocaVar2 = this.n;
            if (ocaVar2 != null) {
                ocaVar2.m(g7hVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.pca
    public final void d(oca ocaVar) {
        this.n = ocaVar;
    }

    @Override // defpackage.x3g
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // defpackage.pca
    public final void e() {
        this.q = false;
        vba vbaVar = this.d;
        if (vbaVar != null) {
            vbaVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.pca
    public final void f(yba ybaVar, boolean z) {
        if (ybaVar != this.c) {
            return;
        }
        dismiss();
        oca ocaVar = this.n;
        if (ocaVar != null) {
            ocaVar.f(ybaVar, z);
        }
    }

    @Override // defpackage.pca
    public final boolean g() {
        return false;
    }

    @Override // defpackage.hca
    public final void j(yba ybaVar) {
    }

    @Override // defpackage.hca
    public final void l(View view) {
        this.l = view;
    }

    @Override // defpackage.x3g
    public final void m() {
        View view;
        if (a()) {
            return;
        }
        if (this.p || (view = this.l) == null) {
            ore.k("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.m = view;
        nca ncaVar = this.h;
        es esVar = ncaVar.z;
        es esVar2 = ncaVar.z;
        esVar.setOnDismissListener(this);
        ncaVar.p = this;
        ncaVar.y = true;
        esVar2.setFocusable(true);
        View view2 = this.m;
        boolean z = this.o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.j);
        ncaVar.o = view2;
        ncaVar.l = this.s;
        boolean z2 = this.q;
        Context context = this.b;
        vba vbaVar = this.d;
        if (!z2) {
            this.r = hca.k(vbaVar, context, this.f);
            this.q = true;
        }
        ncaVar.q(this.r);
        esVar2.setInputMethodMode(2);
        Rect rect = this.a;
        ncaVar.x = rect != null ? new Rect(rect) : null;
        ncaVar.m();
        kv5 kv5Var = ncaVar.c;
        kv5Var.setOnKeyListener(this);
        if (this.t) {
            yba ybaVar = this.c;
            if (ybaVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) kv5Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(ybaVar.m);
                }
                frameLayout.setEnabled(false);
                kv5Var.addHeaderView(frameLayout, null, false);
            }
        }
        ncaVar.k(vbaVar);
        ncaVar.m();
    }

    @Override // defpackage.x3g
    public final kv5 n() {
        return this.h.c;
    }

    @Override // defpackage.hca
    public final void o(boolean z) {
        this.d.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.c.d(true);
        ViewTreeObserver viewTreeObserver = this.o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.o = this.m.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener(this.i);
            this.o = null;
        }
        this.m.removeOnAttachStateChangeListener(this.j);
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.hca
    public final void p(int i) {
        this.s = i;
    }

    @Override // defpackage.hca
    public final void q(int i) {
        this.h.f = i;
    }

    @Override // defpackage.hca
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    @Override // defpackage.hca
    public final void s(boolean z) {
        this.t = z;
    }

    @Override // defpackage.hca
    public final void t(int i) {
        this.h.g(i);
    }
}
