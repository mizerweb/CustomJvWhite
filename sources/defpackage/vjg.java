package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class vjg {
    public final View a;
    public final oi8 b;
    public final cf7 c;
    public final int d = 519;
    public ixj e;
    public int f;
    public boolean g;
    public final Rect h;
    public final Rect i;

    public vjg(View view, oi8 oi8Var, cf7 cf7Var) {
        this.a = view;
        this.b = oi8Var;
        this.c = cf7Var;
        gve gveVar = new gve(this);
        this.h = new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        this.i = marginLayoutParams != null ? new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin) : new Rect(0, 0, 0, 0);
        WeakHashMap weakHashMap = i7j.a;
        y6j.l(view, gveVar);
        if (view.isAttachedToWindow()) {
            w6j.c(view);
            pi8.a.a(this);
        }
        view.addOnAttachStateChangeListener(new zk9(this));
    }

    public static void f(vjg vjgVar, View view, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        }
        if ((i5 & 2) != 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i2 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        }
        if ((i5 & 4) != 0) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            i3 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        }
        if ((i5 & 8) != 0) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            i4 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
        }
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        if (marginLayoutParams5 == null) {
            return;
        }
        if (marginLayoutParams5.leftMargin == i && marginLayoutParams5.topMargin == i2 && marginLayoutParams5.rightMargin == i3 && marginLayoutParams5.bottomMargin == i4) {
            return;
        }
        marginLayoutParams5.leftMargin = i;
        marginLayoutParams5.topMargin = i2;
        marginLayoutParams5.rightMargin = i3;
        marginLayoutParams5.bottomMargin = i4;
        view.setLayoutParams(marginLayoutParams5);
    }

    public final void a(mi8 mi8Var, j11 j11Var) {
        int iMax = Math.max(mi8Var.d, this.f);
        int iD = qt4.D(j11Var.a);
        if (iD != 0) {
            View view = this.a;
            if (iD == 1) {
                view.setTranslationY(-iMax);
                return;
            }
            if (iD == 2) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.h.bottom + iMax);
            } else if (iD == 3) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iMax);
            } else if (iD != 4) {
                ore.o();
            } else {
                f(this, this.a, 0, 0, 0, this.i.bottom + iMax, 7);
            }
        }
    }

    public void b(ixj ixjVar, j11 j11Var) {
        a(ixjVar.a.f(this.d), j11Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f3  */
    public void c(ixj ixjVar) {
        int i;
        int i2;
        View view;
        View view2;
        exj exjVar = ixjVar.a;
        oi8 oi8Var = this.b;
        int i3 = oi8Var.a;
        Rect rect = this.h;
        Rect rect2 = this.i;
        View view3 = this.a;
        int i4 = this.d;
        if (i3 != 0) {
            int i5 = exjVar.f(128 | i4).a;
            int iD = qt4.D(i3);
            if (iD == 0) {
                i = i4;
                i2 = 1;
                view = view3;
            } else if (iD == 1) {
                i = i4;
                i2 = 1;
                view = view3;
                view.setTranslationX(i5);
            } else if (iD == 2) {
                i = i4;
                i2 = 1;
                view = view3;
                view.setPadding(rect.left + i5, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (iD == 3) {
                i = i4;
                i2 = 1;
                view = view3;
                view.setPadding(i5, view3.getPaddingTop(), view3.getPaddingRight(), view3.getPaddingBottom());
            } else {
                if (iD != 4) {
                    ore.o();
                    return;
                }
                i2 = 1;
                i = i4;
                f(this, this.a, rect2.left + i5, 0, 0, 0, 14);
                view = view3;
            }
        } else {
            i = i4;
            i2 = 1;
            view = view3;
        }
        int i6 = oi8Var.c;
        if (i6 != 0) {
            int i7 = exjVar.f(128 | i).c;
            int iD2 = qt4.D(i6);
            if (iD2 == 0) {
                view2 = view;
            } else if (iD2 == i2) {
                view2 = view;
                view2.setTranslationX(-i7);
            } else if (iD2 == 2) {
                view2 = view;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), rect.right + i7, view2.getPaddingBottom());
            } else if (iD2 == 3) {
                View view4 = view;
                view2 = view4;
                view2.setPadding(view4.getPaddingLeft(), view4.getPaddingTop(), i7, view4.getPaddingBottom());
            } else if (iD2 != 4) {
                ore.o();
                return;
            } else {
                f(this, this.a, 0, 0, rect2.right + i7, 0, 11);
                view2 = view;
            }
        } else {
            view2 = view;
        }
        int i8 = oi8Var.b;
        if (i8 != 0) {
            int i9 = exjVar.f(i).b;
            int iD3 = qt4.D(i8);
            if (iD3 != 0) {
                if (iD3 == i2) {
                    view2.setTranslationY(i9);
                } else if (iD3 == 2) {
                    view2.setPadding(view2.getPaddingLeft(), rect.top + i9, view2.getPaddingRight(), view2.getPaddingBottom());
                } else if (iD3 == 3) {
                    view2.setPadding(view2.getPaddingLeft(), i9, view2.getPaddingRight(), view2.getPaddingBottom());
                } else if (iD3 != 4) {
                    ore.o();
                    return;
                } else {
                    f(this, this.a, 0, rect2.top + i9, 0, 0, 13);
                }
            }
        }
        j11 j11Var = oi8Var.d;
        if (j11Var != null) {
            b(ixjVar, j11Var);
        }
        cf7 cf7Var = this.c;
        if (cf7Var != null) {
            cf7Var.invoke(ixjVar);
        }
    }

    public ixj d(ixj ixjVar) {
        return ixjVar;
    }

    public void e() {
        this.g = false;
    }
}
