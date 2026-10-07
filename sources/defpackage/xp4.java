package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import one.me.sdk.arch.Widget;
import org.webrtc.EglBase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xp4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ xp4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        float f;
        float f2;
        final int i = 1;
        final int i2 = 0;
        switch (this.a) {
            case 0:
                ri riVar = (ri) this.b;
                Widget widget = (Widget) this.c;
                cq4 cq4Var = (cq4) this.d;
                View view2 = (View) this.e;
                View view3 = (View) this.f;
                View view4 = (View) this.g;
                zp4 zp4Var = (zp4) riVar.b;
                int i3 = zp4Var.d;
                Class cls = zp4Var.e;
                if (i3 == -1 || cls == null) {
                    view = view4;
                    f = 8.0f;
                    f2 = 0.0f;
                } else {
                    v30 v30Var = new v30(i3, cls);
                    v30Var.d(widget);
                    new tv7(v30Var).a(cq4Var, zp4Var.g, zp4Var.h, zp4Var.f);
                    boolean z = zp4Var.r != null;
                    int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                    int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
                    Float f3 = zp4Var.n;
                    boolean z2 = zp4Var.o;
                    View view5 = z ? view3 : null;
                    float f4 = zp4Var.p;
                    float f5 = zp4Var.q;
                    boolean z3 = zp4Var.s;
                    yp4 yp4Var = new yp4(view2, i2);
                    if (z2) {
                        view2.setAlpha(0.0f);
                        Drawable background = cq4Var.getBackground();
                        view = view4;
                        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
                        if (colorDrawable != null) {
                            colorDrawable.setAlpha(0);
                        }
                    } else {
                        view = view4;
                    }
                    f = 8.0f;
                    f2 = 0.0f;
                    ((ArrayList) v30Var.f).add(new bo5(cq4Var, view2, iK, iK2, f3, z2, view5, f4, f5, z3, yp4Var));
                }
                i1m i1mVar = new i1m(23);
                float f6 = zp4Var.l;
                float f7 = zp4Var.m;
                boolean z4 = zp4Var.k;
                yp4 yp4Var2 = new yp4(view2, 1);
                int[] iArr = (int[]) i1mVar.a;
                if (f6 > f2 && f7 > f2) {
                    WeakHashMap weakHashMap = i7j.a;
                    if (!view3.isLaidOut() || view3.isLayoutRequested()) {
                        view3.addOnLayoutChangeListener(new kcd(view3, i1mVar, f6, f7, z4, yp4Var2));
                    } else {
                        View rootView = view3.getRootView();
                        int measuredHeight = view3.getMeasuredHeight();
                        int measuredWidth = view3.getMeasuredWidth();
                        rootView.getLocationOnScreen(iArr);
                        int iK3 = gm0.K(f6) - iArr[0];
                        int iK4 = gm0.K(f7) - iArr[1];
                        int iD = zo5.D(f, yl5.d().getDisplayMetrics().density, rootView.getHeight() - iK4);
                        int iD2 = zo5.D(f, yl5.d().getDisplayMetrics().density, iK4);
                        if (iD > measuredHeight) {
                            iK4 = (z4 ? 12 : 0) + zo5.b(f, yl5.d().getDisplayMetrics().density, iK4);
                        } else if (iD2 > measuredHeight) {
                            iK4 = zo5.D(f, yl5.d().getDisplayMetrics().density, iK4 - measuredHeight) - (z4 ? 12 : 0);
                        }
                        int iK5 = gm0.K(f * yl5.d().getDisplayMetrics().density);
                        int iD3 = zo5.D(f, yl5.d().getDisplayMetrics().density, rootView.getHeight() - measuredHeight);
                        if (iD3 < iK5) {
                            iD3 = iK5;
                        }
                        int iV = oc9.v(iK4, iK5, iD3);
                        if (iK3 + measuredWidth >= rootView.getWidth()) {
                            iK3 = ((rootView.getWidth() - measuredWidth) - 8) - (z4 ? 12 : 0);
                        } else if (iK3 <= 0) {
                            iK3 = z4 ? 12 : 0;
                        }
                        view3.setX(iK3);
                        view3.setY(iV);
                        yp4Var2.invoke();
                    }
                }
                view.invalidate();
                break;
            case 1:
                ((g85) this.b).C((pf2) this.c, (pf2) this.d, (zbh) this.e, (zbh) this.f, (Map.Entry) this.g);
                break;
            default:
                g5f g5fVar = (g5f) this.b;
                EglBase.Context context = (EglBase.Context) this.c;
                Context context2 = (Context) this.d;
                ufk ufkVar = (ufk) this.e;
                y3e y3eVar = (y3e) this.f;
                nue nueVar = (nue) this.g;
                g5fVar.d = new bc7(context, context2, ufkVar, y3eVar);
                g5fVar.e = new ic7(y3eVar, nueVar);
                g5fVar.f = new wc7();
                bc7 bc7Var = g5fVar.d;
                final ic7 ic7Var = g5fVar.e;
                bc7Var.g = ic7Var;
                final wc7 wc7Var = g5fVar.f;
                ic7Var.a.b(new Runnable() { // from class: gc7
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                ic7Var.e = wc7Var;
                                break;
                            default:
                                ic7Var.f = wc7Var;
                                break;
                        }
                    }
                });
                final ic7 ic7Var2 = g5fVar.e;
                final wc7 wc7Var2 = g5fVar.f;
                ic7Var2.a.b(new Runnable() { // from class: gc7
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                ic7Var2.e = wc7Var2;
                                break;
                            default:
                                ic7Var2.f = wc7Var2;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
