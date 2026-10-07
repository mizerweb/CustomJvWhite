package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class z5f extends afe {
    public so3 a;
    public final y8j b;
    public final w8j c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final y5f g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public z5f(y8j y8jVar) {
        this.b = y8jVar;
        w8j w8jVar = y8jVar.j;
        this.c = w8jVar;
        this.d = (LinearLayoutManager) w8jVar.getLayoutManager();
        this.g = new y5f();
        e();
    }

    @Override // defpackage.afe
    public final void a(RecyclerView recyclerView, int i) {
        so3 so3Var;
        int i2 = this.e;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            f(false);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                d(2);
                this.j = true;
                return;
            }
            return;
        }
        y5f y5fVar = this.g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            g();
            if (!this.k) {
                int i3 = y5fVar.a;
                if (i3 != -1 && (so3Var = this.a) != null) {
                    so3Var.i(i3, 0.0f, 0);
                }
            } else if (y5fVar.c == 0) {
                int i4 = this.h;
                int i5 = y5fVar.a;
                if (i4 != i5) {
                    c(i5);
                }
            }
            d(0);
            e();
        }
        if (this.e == 2 && i == 0 && this.l) {
            g();
            if (y5fVar.c == 0) {
                int i6 = this.i;
                int i7 = y5fVar.a;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    c(i7);
                }
                d(0);
                e();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        this.k = true;
        g();
        boolean z = this.j;
        y5f y5fVar = this.g;
        if (z) {
            this.j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == (this.b.g.H() == 1)) {
                        if (y5fVar.c != 0) {
                            i3 = y5fVar.a + 1;
                        }
                    }
                }
                i3 = y5fVar.a;
            } else if (y5fVar.c != 0) {
                i3 = y5fVar.a + 1;
            } else {
                i3 = y5fVar.a;
            }
            this.i = i3;
            if (this.h != i3) {
                c(i3);
            }
        } else if (this.e == 0) {
            int i4 = y5fVar.a;
            if (i4 == -1) {
                i4 = 0;
            }
            c(i4);
        }
        int i5 = y5fVar.a;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = y5fVar.b;
        int i6 = y5fVar.c;
        so3 so3Var = this.a;
        if (so3Var != null) {
            so3Var.i(i5, f, i6);
        }
        int i7 = y5fVar.a;
        int i8 = this.i;
        if ((i7 == i8 || i8 == -1) && y5fVar.c == 0 && this.f != 1) {
            d(0);
            e();
        }
    }

    public final void c(int i) {
        so3 so3Var = this.a;
        if (so3Var != null) {
            so3Var.j(i);
        }
    }

    public final void d(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        so3 so3Var = this.a;
        if (so3Var != null) {
            so3Var.h(i);
        }
    }

    public final void e() {
        this.e = 0;
        this.f = 0;
        y5f y5fVar = this.g;
        y5fVar.a = -1;
        y5fVar.b = 0.0f;
        y5fVar.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    public final void f(boolean z) {
        this.m = z;
        this.e = z ? 4 : 1;
        int i = this.i;
        if (i != -1) {
            this.h = i;
            this.i = -1;
        } else if (this.h == -1) {
            this.h = this.d.X0();
        }
        d(1);
    }

    public final void g() {
        int top;
        LinearLayoutManager linearLayoutManager = this.d;
        int iX0 = linearLayoutManager.X0();
        y5f y5fVar = this.g;
        y5fVar.a = iX0;
        if (iX0 == -1) {
            y5fVar.a = -1;
            y5fVar.b = 0.0f;
            y5fVar.c = 0;
            return;
        }
        View viewR = linearLayoutManager.r(iX0);
        if (viewR == null) {
            y5fVar.a = -1;
            y5fVar.b = 0.0f;
            y5fVar.c = 0;
            return;
        }
        int i = ((wee) viewR.getLayoutParams()).b.left;
        int i2 = ((wee) viewR.getLayoutParams()).b.right;
        int i3 = ((wee) viewR.getLayoutParams()).b.top;
        int i4 = ((wee) viewR.getLayoutParams()).b.bottom;
        ViewGroup.LayoutParams layoutParams = viewR.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i += marginLayoutParams.leftMargin;
            i2 += marginLayoutParams.rightMargin;
            i3 += marginLayoutParams.topMargin;
            i4 += marginLayoutParams.bottomMargin;
        }
        int height = viewR.getHeight() + i3 + i4;
        int width = viewR.getWidth() + i + i2;
        int i5 = linearLayoutManager.p;
        w8j w8jVar = this.c;
        if (i5 == 0) {
            top = (viewR.getLeft() - i) - w8jVar.getPaddingLeft();
            if (this.b.g.H() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewR.getTop() - i3) - w8jVar.getPaddingTop();
        }
        int i6 = -top;
        y5fVar.c = i6;
        if (i6 >= 0) {
            y5fVar.b = height != 0 ? i6 / height : 0.0f;
        } else if (new ii(linearLayoutManager).b()) {
            ore.k("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            Locale locale = Locale.US;
            ore.k(zo5.h(y5fVar.c, "Page can only be offset by a positive amount, not by "));
        }
    }
}
