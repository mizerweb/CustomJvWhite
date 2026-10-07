package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class vn2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ vn2() {
        this.a = 8;
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

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((xv3) this.b).g.j();
                break;
            case 2:
                a46 a46Var = (a46) this.b;
                z46 z46Var = a46Var.v;
                if (z46Var != null && z46Var.g) {
                    Drawable drawable = ((ImageView) a46Var.a).getDrawable();
                    qn qnVar = drawable instanceof qn ? (qn) drawable : null;
                    if (qnVar != null) {
                        qnVar.d(a46Var.w);
                        qnVar.start();
                    }
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                k8g k8gVar = (k8g) this.b;
                sgg sggVar = k8gVar.u;
                if (sggVar == null || !sggVar.isActive()) {
                    k8gVar.u = e9i.j0(new fz6(e9i.M0(new jz(k8gVar.getModelFlow(), 13), new sh1(3, null, 13)), new j8g(k8gVar, (lq4) null, 0), 3), v7j.b(view));
                }
                break;
            case 5:
                l8g l8gVar = (l8g) this.b;
                sgg sggVar2 = l8gVar.E;
                if (sggVar2 == null || !sggVar2.isActive()) {
                    l8gVar.E = e9i.j0(new fz6(e9i.M0(new jz(l8gVar.getModelFlow(), 13), new sh1(3, null, 14)), new j8g(l8gVar, (lq4) null, 1), 3), v7j.b(view));
                }
                break;
            case 6:
                gag gagVar = (gag) this.b;
                sgg sggVar3 = gagVar.x;
                if (sggVar3 == null || !sggVar3.isActive()) {
                    gagVar.x = e9i.j0(new fz6(e9i.M0(new jz(gagVar.getModelFlow(), 13), new sh1(3, null, 15)), new j8g(gagVar, (lq4) null, 3), 3), v7j.b(view));
                }
                break;
            case 7:
                break;
            default:
                sgg sggVar4 = (sgg) this.b;
                if (sggVar4 == null || !sggVar4.isActive()) {
                    TextView textView = view instanceof TextView ? (TextView) view : null;
                    if (textView != null) {
                        this.b = e9i.j0(new j3(e9i.p(new fz6(new fz6((r8e) pq3.j.e(textView.getContext()).h, new hpf(textView, null, 24)), new j8g(textView, (lq4) null, 29), 3)), 14, new ie1(3, null, 2)), v7j.b(view));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) throws IllegalAccessException, InvocationTargetException {
        switch (this.a) {
            case 0:
                yn2 yn2Var = (yn2) this.b;
                ViewTreeObserver viewTreeObserver = yn2Var.x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        yn2Var.x = view.getViewTreeObserver();
                    }
                    yn2Var.x.removeGlobalOnLayoutListener(yn2Var.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                ((xv3) this.b).g.l();
                break;
            case 2:
                ((a46) this.b).H(false);
                break;
            case 3:
                Handler handler = m8c.a;
                m8c.b((k8c) ((ll5) this.b).h, j8c.d);
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
                vgg vggVar = (vgg) this.b;
                ViewTreeObserver viewTreeObserver2 = vggVar.o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        vggVar.o = view.getViewTreeObserver();
                    }
                    vggVar.o.removeGlobalOnLayoutListener(vggVar.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                sgg sggVar = (sgg) this.b;
                if (sggVar != null) {
                    sggVar.b(null);
                }
                this.b = null;
                break;
        }
    }

    public /* synthetic */ vn2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
