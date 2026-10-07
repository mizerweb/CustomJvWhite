package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ga0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ga0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    private final void i(View view) {
    }

    private final void j(View view) {
    }

    private final void k(View view) {
    }

    private final void l(View view) {
    }

    private final void m(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        float f;
        float f2;
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ha0 ha0Var = (ha0) this.b;
                sgg sggVar = ha0Var.J;
                if (sggVar == null || !sggVar.isActive()) {
                    y90 y90Var = (y90) obj;
                    ha0Var.J = e9i.j0(new fz6(e9i.I(e9i.C(y90Var.l, y90Var.m, y90Var.n, new fa0(4, null))), new sfd(ha0Var, (lq4) null, 15), 3), v7j.b(view));
                }
                break;
            case 1:
                sz0 sz0Var = (sz0) this.b;
                if (sz0Var.c == null) {
                    sz0Var.c = Build.VERSION.SDK_INT >= 31 ? new o44(1) : new nih((Context) obj);
                }
                sz0Var.b(sz0Var.b);
                break;
            case 2:
                n13 n13Var = (n13) this.b;
                sgg sggVar2 = n13Var.x;
                if (sggVar2 == null || !sggVar2.isActive()) {
                    n13Var.x = e9i.j0(new fz6((xx6) obj, new in1(n13Var, (lq4) null, 15), 3), v7j.b(view));
                }
                break;
            case 3:
                n13 n13Var2 = (n13) this.b;
                sgg sggVar3 = n13Var2.y;
                if (sggVar3 == null || !sggVar3.isActive()) {
                    n13Var2.y = e9i.j0(new fz6((gjg) obj, new m13(n13Var2, null), 3), v7j.b(view));
                }
                break;
            case 4:
                j43 j43Var = (j43) this.b;
                sgg sggVar4 = j43Var.w;
                if (sggVar4 == null || !sggVar4.isActive()) {
                    j43Var.w = e9i.j0(new fz6((xx6) obj, new in1(j43Var, (lq4) null, 17), 3), v7j.b(view));
                }
                break;
            case 5:
                wr6 wr6Var = (wr6) this.b;
                sgg sggVar5 = wr6Var.x;
                if (sggVar5 == null || !sggVar5.isActive()) {
                    wr6Var.x = e9i.j0(new fz6(((aq6) obj).m, new el6(wr6Var, (lq4) null, 2), 3), v7j.b(view));
                }
                break;
            case 6:
                ((ImageView) this.b).removeOnAttachStateChangeListener(this);
                ImageView imageView = (ImageView) obj;
                imageView.post(new pi(21, imageView));
                break;
            case 7:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = i7j.a;
                w6j.c((View) obj);
                break;
            case 8:
                ((LinearLayout) this.b).removeOnAttachStateChangeListener(this);
                LinearLayout linearLayout = (LinearLayout) obj;
                if (ixj.g(linearLayout.getRootWindowInsets(), null).a.f(2).d > 0) {
                    f = yl5.d().getDisplayMetrics().density;
                    f2 = 2.0f;
                } else {
                    f = yl5.d().getDisplayMetrics().density;
                    f2 = 8.0f;
                }
                linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), gm0.K(f2 * f));
                break;
            case 9:
                ((reh) this.b).removeOnAttachStateChangeListener(this);
                ((reh) obj).requestApplyInsets();
                break;
            case 10:
                break;
            case 11:
                osk.c((ImageView) this.b, ((h6e) obj).y);
                break;
            case 12:
                hag hagVar = (hag) this.b;
                sgg sggVar6 = hagVar.J;
                if (sggVar6 == null || !sggVar6.isActive()) {
                    hagVar.J = e9i.j0(new fz6(((eag) obj).d, new j8g(hagVar, (lq4) null, 4), 3), v7j.b(view));
                }
                break;
            case 13:
                pvh pvhVar = (pvh) this.b;
                if (pvhVar != null) {
                    pvhVar.b((RecyclerView) view);
                }
                this.b = tre.Y((RecyclerView) obj);
                break;
            case 14:
            case 15:
                break;
            default:
                izi iziVar = (izi) this.b;
                oxi oxiVar = (oxi) obj;
                w09 w09VarB = v7j.b(view);
                sgg sggVar7 = iziVar.J;
                if (sggVar7 == null || !sggVar7.isActive()) {
                    iziVar.J = e9i.j0(new fz6(oxiVar.e, new jyf(iziVar, oxiVar, (lq4) null, 12), 3), w09VarB);
                }
                w09 w09VarB2 = v7j.b(view);
                sgg sggVar8 = iziVar.I;
                if (sggVar8 == null || !sggVar8.isActive()) {
                    iziVar.I = e9i.j0(new fz6(oxiVar.d, new j8g(iziVar, (lq4) null, 27), 3), w09VarB2);
                }
                iziVar.Q();
                Context context = iziVar.getContext();
                ufe ufeVar = new ufe();
                ufeVar.a = context.getResources().getConfiguration().orientation;
                md1 md1Var = new md1(ufeVar, iziVar, 12);
                context.registerComponentCallbacks(md1Var);
                iziVar.H = md1Var;
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                sz0 sz0Var = (sz0) this.b;
                sz0Var.b(false);
                sz0Var.f = false;
                Bitmap bitmap = sz0Var.g;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                sz0Var.g = null;
                sz0Var.h = null;
                pz0 pz0Var = sz0Var.c;
                if (pz0Var != null) {
                    pz0Var.onDestroy();
                }
                sz0Var.c = null;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                i19 i19Var = ((okc) obj).a;
                (i19Var != null ? i19Var : null).d(m09.ON_DESTROY);
                break;
            case 11:
                osk.e((ImageView) this.b, ((h6e) obj).y);
                break;
            case 12:
                break;
            case 13:
                pvh pvhVar = (pvh) this.b;
                if (pvhVar != null) {
                    pvhVar.b((RecyclerView) view);
                }
                this.b = null;
                break;
            case 14:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                vvi vviVar = (vvi) obj;
                x5j x5jVar = (x5j) vviVar.Q();
                if (x5jVar.b != null && x5jVar.getChildCount() > 0) {
                    vviVar.J();
                    break;
                }
                break;
            case 15:
                ((pyi) this.b).removeOnAttachStateChangeListener(this);
                pyi pyiVar = (pyi) obj;
                ny8 ny8Var = pyiVar.y;
                if (ny8Var.d()) {
                    pyiVar.getBitmapPool().d(ny8Var.getValue());
                }
                break;
            default:
                izi iziVar = (izi) this.b;
                md1 md1Var = iziVar.H;
                if (md1Var != null) {
                    iziVar.getContext().unregisterComponentCallbacks(md1Var);
                }
                iziVar.H = null;
                break;
        }
    }

    public ga0(RecyclerView recyclerView) {
        this.a = 13;
        this.c = recyclerView;
    }
}
