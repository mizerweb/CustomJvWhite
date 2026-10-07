package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes3.dex */
public final class h8c {
    public final WeakReference a;
    public h9c b;
    public final ll5 c;
    public final int d;
    public final int e;

    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Illegal instructions before constructor call */
    public h8c(Widget widget) {
        int paddingTop;
        View view;
        View view2;
        br4 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        View view3 = parentController.getView();
        Object parent = view3 != null ? view3.getParent() : null;
        View view4 = parent instanceof View ? (View) parent : null;
        this(view4 instanceof FrameLayout ? (FrameLayout) view4 : null);
        int i = uw8.a;
        int iA = ((Boolean) uw8.f.getValue()).booleanValue() ? uw8.a(widget.getContext()) : 0;
        int i2 = widget.getB().b;
        i2 = i2 == 0 ? 0 : i2;
        int i3 = i2 == 0 ? -1 : f8c.$EnumSwitchMapping$0[qt4.D(i2)];
        if (i3 == 1) {
            View view5 = widget.getView();
            if (view5 != null) {
                paddingTop = view5.getPaddingTop();
            } else {
                paddingTop = 0;
            }
        } else if (i3 == 2 && (view2 = widget.getView()) != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : null);
            if (marginLayoutParams != null) {
                paddingTop = marginLayoutParams.topMargin;
            } else {
                paddingTop = 0;
            }
        } else {
            paddingTop = 0;
        }
        this.e = paddingTop;
        j11 j11Var = widget.getB().d;
        int i4 = j11Var != null ? j11Var.a : 0;
        int i5 = i4 != 0 ? f8c.$EnumSwitchMapping$0[qt4.D(i4)] : -1;
        if (i5 == 1) {
            View view6 = widget.getView();
            if (view6 != null) {
                iA = view6.getPaddingBottom();
            }
        } else if (i5 == 2 && (view = widget.getView()) != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
            iA = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
        }
        this.d = iA;
    }

    public final void a(ynh ynhVar) {
        ViewGroup viewGroup;
        Context context;
        h9c h9cVar = this.b;
        CharSequence charSequenceB = null;
        if (ynhVar != null && (viewGroup = (ViewGroup) this.a.get()) != null && (context = viewGroup.getContext()) != null) {
            charSequenceB = ynhVar.b(context);
        }
        this.b = h9c.a(h9cVar, null, null, charSequenceB, null, null, null, null, 123);
    }

    public final void b(CharSequence charSequence) {
        this.b = h9c.a(this.b, null, null, charSequence, null, null, null, null, 123);
    }

    public final void c(o8c o8cVar) {
        this.b = h9c.a(this.b, null, null, null, null, o8cVar, null, null, 111);
    }

    public final /* bridge */ void d(o8c o8cVar) {
        c(o8cVar);
    }

    public final void e(i8c i8cVar) {
        ll5 ll5Var = this.c;
        if (ll5Var != null) {
            ll5Var.f = i8cVar;
        }
    }

    public final /* bridge */ void f(i8c i8cVar) {
        e(i8cVar);
    }

    public final void g(u8c u8cVar) {
        h9c h9cVar = this.b;
        a9c a9cVar = h9cVar.a;
        if (a9cVar instanceof z8c) {
            a9cVar = x8c.a;
        }
        this.b = h9c.a(h9cVar, a9cVar, null, null, null, null, u8cVar, null, 94);
    }

    public final void h(a9c a9cVar) {
        h9c h9cVar = this.b;
        this.b = h9c.a(h9cVar, a9cVar, null, null, null, null, a9cVar instanceof z8c ? t8c.b : h9cVar.f, null, 94);
    }

    public final /* bridge */ void i(w8c w8cVar) {
        h(w8cVar);
    }

    public final void j(f9c f9cVar) {
        this.b = h9c.a(this.b, null, null, null, f9cVar, null, null, null, 119);
    }

    public final /* bridge */ void k(e9c e9cVar) {
        j(e9cVar);
    }

    public final void l(g9c g9cVar) {
        this.b = h9c.a(this.b, null, null, null, null, null, null, g9cVar, 63);
    }

    public final void m(ynh ynhVar) {
        Context context;
        h9c h9cVar = this.b;
        ViewGroup viewGroup = (ViewGroup) this.a.get();
        CharSequence charSequenceB = (viewGroup == null || (context = viewGroup.getContext()) == null) ? null : ynhVar.b(context);
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        this.b = h9c.a(h9cVar, null, charSequenceB, null, null, null, null, null, 125);
    }

    public final void n(CharSequence charSequence) {
        this.b = h9c.a(this.b, null, charSequence, null, null, null, null, null, 125);
    }

    public final void o(h9c h9cVar) {
        this.b = h9cVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    public final g8c p() {
        ll5 ll5Var;
        l8c l8cVar;
        boolean zD;
        if (this.a.get() == null || (ll5Var = this.c) == null) {
            return null;
        }
        h9c h9cVarA = this.b;
        o8c o8cVar = h9cVarA.e;
        if (!o8cVar.d) {
            h9cVarA = h9c.a(h9cVarA, null, null, null, null, o8c.a(o8cVar, 0, o8cVar.b + this.e, o8cVar.c + this.d, 9), null, null, 111);
        }
        ll5Var.d = h9cVarA;
        Handler handler = m8c.a;
        k8c k8cVar = (k8c) ll5Var.h;
        u8c u8cVar = h9cVarA.f;
        AtomicBoolean atomicBoolean = m8c.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            l8c l8cVar2 = m8c.b;
            if (l8cVar2 != null ? cqk.d(l8cVar2.b.get(), k8cVar) : false) {
                l8c l8cVar3 = m8c.b;
                if (cqk.d(l8cVar3 != null ? l8cVar3.a : null, q8c.b)) {
                    atomicBoolean.set(false);
                } else {
                    l8cVar = m8c.b;
                    if (l8cVar != null) {
                        zD = cqk.d(l8cVar.b.get(), k8cVar);
                    } else {
                        zD = false;
                    }
                    if (zD) {
                        m8c.a.removeCallbacksAndMessages(m8c.b);
                        m8c.c(m8c.b);
                    } else {
                        m8c.c = new l8c(k8cVar, u8cVar);
                        if (m8c.b == null) {
                            m8c.d();
                        }
                    }
                    atomicBoolean.set(false);
                }
            } else {
                l8cVar = m8c.b;
                if (l8cVar != null) {
                    zD = cqk.d(l8cVar.b.get(), k8cVar);
                } else {
                    zD = false;
                }
                if (zD) {
                    m8c.a.removeCallbacksAndMessages(m8c.b);
                    m8c.c(m8c.b);
                } else {
                    m8c.c = new l8c(k8cVar, u8cVar);
                    if (m8c.b == null) {
                        m8c.d();
                    }
                }
                atomicBoolean.set(false);
            }
        }
        return new g8c(ll5Var);
    }

    public h8c(ViewGroup viewGroup) {
        WeakReference weakReference = new WeakReference(viewGroup);
        this.a = weakReference;
        this.b = h9c.h;
        if (viewGroup != null) {
            this.c = new ll5(weakReference);
        }
    }
}
