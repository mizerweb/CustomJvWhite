package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.ForwardingControllerListener2;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 implements au5, zf5 {
    public static final Map t = h98.a("component_tag", "drawee");
    public static final Map u = h98.b(HasExtraData.KEY_ORIGIN, "memory_bitmap", HasExtraData.KEY_ORIGIN_SUBCATEGORY, "shortcut");
    public static final Class v = u0.class;
    public final cu5 a;
    public final ag5 b;
    public final Executor c;
    public c48 d;
    public dk7 e;
    public mr4 f;
    public final ForwardingControllerListener2 g;
    public wj7 h;
    public y45 i;
    public String j;
    public Object k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public t25 p;
    public Object q;
    public boolean r;
    public Drawable s;

    public u0(ag5 ag5Var, Executor executor) {
        this.a = cu5.c ? new cu5() : cu5.b;
        this.g = new ForwardingControllerListener2();
        this.r = true;
        this.b = ag5Var;
        this.c = executor;
        f(null, null);
    }

    public final void a(mr4 mr4Var) {
        mr4Var.getClass();
        mr4 mr4Var2 = this.f;
        if (mr4Var2 instanceof t0) {
            ((t0) mr4Var2).a(mr4Var);
            return;
        }
        if (mr4Var2 == null) {
            this.f = mr4Var;
            return;
        }
        qe7.v();
        t0 t0Var = new t0();
        t0Var.a(mr4Var2);
        t0Var.a(mr4Var);
        qe7.v();
        this.f = t0Var;
    }

    public abstract Drawable b(Object obj);

    public final mr4 c() {
        mr4 mr4Var = this.f;
        return mr4Var == null ? oq0.a : mr4Var;
    }

    public abstract l68 d(Object obj);

    public final wj7 e() {
        wj7 wj7Var = this.h;
        if (wj7Var != null) {
            return wj7Var;
        }
        qr7.x(this.k, "mSettableDraweeHierarchy is null; Caller context: ");
        return null;
    }

    public final synchronized void f(Object obj, String str) {
        ag5 ag5Var;
        try {
            qe7.v();
            this.a.a(bu5.f);
            if (!this.r && (ag5Var = this.b) != null) {
                ag5Var.b(this);
            }
            this.l = false;
            n();
            this.o = false;
            c48 c48Var = this.d;
            if (c48Var != null) {
                c48Var.a();
            }
            dk7 dk7Var = this.e;
            if (dk7Var != null) {
                dk7Var.a();
                this.e.f(this);
            }
            mr4 mr4Var = this.f;
            if (mr4Var instanceof t0) {
                t0 t0Var = (t0) mr4Var;
                synchronized (t0Var) {
                    t0Var.a.clear();
                }
            } else {
                this.f = null;
            }
            wj7 wj7Var = this.h;
            if (wj7Var != null) {
                wj7Var.f.o(wj7Var.a);
                wj7Var.g();
                ote oteVar = this.h.d;
                oteVar.e = null;
                oteVar.invalidateSelf();
                this.h = null;
            }
            this.i = null;
            if (pj6.a.h(2)) {
                pj6.f(v, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.j, str);
            }
            this.j = str;
            this.k = obj;
            qe7.v();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean g(String str, t25 t25Var) {
        if (t25Var == null && this.p == null) {
            return true;
        }
        return str.equals(this.j) && t25Var == this.p && this.m;
    }

    public final void h(String str, Throwable th) {
        if (pj6.a.h(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.j;
            if (pj6.a.h(2)) {
                pj6.a.v(v.getSimpleName(), String.format(null, "controller %x %s: %s: failure: %s", numValueOf, str2, str, th));
            }
        }
    }

    public final void i(Object obj, String str) {
        if (pj6.a.h(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.j;
            String simpleName = obj != null ? obj.getClass().getSimpleName() : "<null>";
            au3 au3Var = (au3) obj;
            Object[] objArr = {numValueOf, str2, str, simpleName, Integer.valueOf((au3Var == null || !au3Var.P()) ? 0 : System.identityHashCode(au3Var.b.c()))};
            if (pj6.a.h(2)) {
                pj6.a.v(v.getSimpleName(), String.format(null, "controller %x %s: %s: image: %s %x", objArr));
            }
        }
    }

    public final ControllerListener2.Extras j(Map map, Map map2, Uri uri) {
        String strValueOf;
        wj7 wj7Var = this.h;
        if (wj7Var != null) {
            strValueOf = String.valueOf(!(wj7Var.e(2) instanceof h1f) ? null : wj7Var.f(2).e);
            if (wj7Var.e(2) instanceof h1f) {
                wj7Var.f(2);
            }
        } else {
            strValueOf = null;
        }
        wj7 wj7Var2 = this.h;
        Rect bounds = wj7Var2 == null ? null : wj7Var2.d.getBounds();
        Object obj = this.k;
        ControllerListener2.Extras extras = new ControllerListener2.Extras();
        if (bounds != null) {
            extras.viewportWidth = bounds.width();
            extras.viewportHeight = bounds.height();
        }
        extras.scaleType = strValueOf;
        extras.callerContext = obj;
        extras.logWithHighSamplingRate = false;
        extras.mainUri = uri;
        extras.datasourceExtras = map;
        extras.imageExtras = map2;
        extras.shortcutExtras = u;
        extras.componentExtras = t;
        extras.imageSourceExtras = null;
        return extras;
    }

    public final void k(String str, t25 t25Var, Throwable th, boolean z) {
        Drawable drawable;
        qe7.v();
        if (!g(str, t25Var)) {
            h("ignore_old_datasource @ onFailure", th);
            t25Var.close();
            qe7.v();
            return;
        }
        this.a.a(z ? bu5.m : bu5.n);
        ForwardingControllerListener2 forwardingControllerListener2 = this.g;
        if (z) {
            h("final_failed @ onFailure", th);
            this.p = null;
            this.n = true;
            wj7 wj7Var = this.h;
            if (wj7Var != null) {
                if (!this.o || (drawable = this.s) == null) {
                    boolean zQ = q();
                    wj6 wj6Var = wj7Var.e;
                    if (zQ) {
                        wj6Var.r++;
                        wj7Var.c();
                        if (wj6Var.d(4) != null) {
                            wj7Var.b(4);
                        } else {
                            wj7Var.b(1);
                        }
                        wj6Var.a();
                    } else {
                        wj6Var.r++;
                        wj7Var.c();
                        if (wj6Var.d(5) != null) {
                            wj7Var.b(5);
                        } else {
                            wj7Var.b(1);
                        }
                        wj6Var.a();
                    }
                } else {
                    wj7Var.j(drawable, 1.0f, true);
                }
            }
            ControllerListener2.Extras extrasJ = j(t25Var == null ? null : ((q0) t25Var).a, null, null);
            c().b(this.j, th);
            forwardingControllerListener2.onFailure(this.j, th, extrasJ);
        } else {
            h("intermediate_failed @ onFailure", th);
            c().j(this.j, th);
            forwardingControllerListener2.onIntermediateImageFailed(this.j);
        }
        qe7.v();
    }

    public final void l(String str, t25 t25Var, Object obj, float f, boolean z, boolean z2, boolean z3) {
        try {
            qe7.v();
            if (!g(str, t25Var)) {
                i(obj, "ignore_old_datasource @ onNewResult");
                au3.E((au3) obj);
                t25Var.close();
                qe7.v();
                return;
            }
            this.a.a(z ? bu5.k : bu5.l);
            try {
                Drawable drawableB = b(obj);
                Object obj2 = this.q;
                Drawable drawable = this.s;
                this.q = obj;
                this.s = drawableB;
                try {
                    if (z) {
                        i(obj, "set_final_result @ onNewResult");
                        this.p = null;
                        e().j(drawableB, 1.0f, z2);
                        p(str, obj, t25Var);
                    } else if (z3) {
                        i(obj, "set_temporary_result @ onNewResult");
                        e().j(drawableB, 1.0f, z2);
                        p(str, obj, t25Var);
                    } else {
                        i(obj, "set_intermediate_result @ onNewResult");
                        e().j(drawableB, f, z2);
                        l68 l68VarD = d(obj);
                        c().onIntermediateImageSet(str, l68VarD);
                        this.g.onIntermediateImageSet(str, l68VarD);
                    }
                    if (drawable != null && drawable != drawableB && (drawable instanceof qi)) {
                        ((qi) drawable).a();
                    }
                    if (obj2 != null && obj2 != obj) {
                        i(obj2, "release_previous_result @ onNewResult");
                        au3.E((au3) obj2);
                    }
                    qe7.v();
                } catch (Throwable th) {
                    if (drawable != null && drawable != drawableB && (drawable instanceof qi)) {
                        ((qi) drawable).a();
                    }
                    if (obj2 != null && obj2 != obj) {
                        i(obj2, "release_previous_result @ onNewResult");
                        au3.E((au3) obj2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                i(obj, "drawable_failed @ onNewResult");
                au3.E((au3) obj);
                k(str, t25Var, e, z);
                qe7.v();
            }
        } catch (Throwable th2) {
            qe7.v();
            throw th2;
        }
    }

    public final void m() {
        this.a.a(bu5.i);
        c48 c48Var = this.d;
        if (c48Var != null) {
            c48Var.b();
        }
        dk7 dk7Var = this.e;
        if (dk7Var != null) {
            dk7Var.e();
        }
        wj7 wj7Var = this.h;
        if (wj7Var != null) {
            wj7Var.f.o(wj7Var.a);
            wj7Var.g();
        }
        n();
    }

    public final void n() {
        Map map;
        Map extras;
        boolean z = this.m;
        this.m = false;
        this.n = false;
        t25 t25Var = this.p;
        if (t25Var != null) {
            map = ((q0) t25Var).a;
            t25Var.close();
            this.p = null;
        } else {
            map = null;
        }
        Drawable drawable = this.s;
        if (drawable != null && (drawable instanceof qi)) {
            ((qi) drawable).a();
        }
        this.s = null;
        Object obj = this.q;
        if (obj != null) {
            l68 l68VarD = d(obj);
            extras = l68VarD == null ? null : l68VarD.getExtras();
            i(this.q, "release");
            au3.E((au3) this.q);
            this.q = null;
        } else {
            extras = null;
        }
        if (z) {
            c().c(this.j);
            this.g.onRelease(this.j, j(map, extras, null));
        }
    }

    public final void o(t25 t25Var, Object obj) {
        c().f(this.k, this.j);
        String str = this.j;
        Object obj2 = this.k;
        s1d s1dVar = (s1d) this;
        v78 v78Var = s1dVar.C;
        v78 v78Var2 = s1dVar.D;
        Uri uri = v78Var != null ? v78Var.b : null;
        if (uri == null) {
            uri = v78Var2 != null ? v78Var2.b : null;
        }
        l68 l68Var = (l68) obj;
        this.g.onSubmit(str, obj2, j(t25Var == null ? null : ((q0) t25Var).a, l68Var != null ? l68Var.getExtras() : null, uri));
    }

    public final void p(String str, Object obj, t25 t25Var) {
        l68 l68VarD = d(obj);
        mr4 mr4VarC = c();
        Object obj2 = this.s;
        mr4VarC.e(str, l68VarD, obj2 instanceof Animatable ? (Animatable) obj2 : null);
        this.g.onFinalImageSet(str, l68VarD, j(t25Var == null ? null : ((q0) t25Var).a, l68VarD == null ? null : l68VarD.getExtras(), null));
    }

    public final boolean q() {
        c48 c48Var;
        return this.n && (c48Var = this.d) != null && c48Var.d();
    }

    public final void r() {
        Object obj;
        ay0 ay0Var;
        qe7.v();
        s1d s1dVar = (s1d) this;
        qe7.v();
        try {
            taa taaVar = s1dVar.y;
            if (taaVar == null || (ay0Var = s1dVar.z) == null) {
                qe7.v();
                obj = null;
            } else {
                au3 au3Var = taaVar.get(ay0Var);
                if (au3Var == null || ((s98) ((xt3) au3Var.K()).getQualityInfo()).c) {
                    qe7.v();
                    obj = au3Var;
                } else {
                    au3Var.close();
                    qe7.v();
                    obj = null;
                }
            }
            if (obj != null) {
                qe7.v();
                this.p = null;
                this.m = true;
                this.n = false;
                this.a.a(bu5.s);
                o(this.p, d(obj));
                synchronized (s1dVar) {
                }
                l(this.j, this.p, obj, 1.0f, true, true, true);
                qe7.v();
                qe7.v();
                return;
            }
            this.a.a(bu5.j);
            wj7 wj7Var = this.h;
            wj6 wj6Var = wj7Var.e;
            if (wj6Var.d(3) != null) {
                wj6Var.r++;
                wj7Var.l(0.0f);
                wj6Var.b();
                wj6Var.a();
            }
            this.m = true;
            this.n = false;
            qe7.v();
            if (pj6.a.h(2)) {
                pj6.d(s1d.class, Integer.valueOf(System.identityHashCode(s1dVar)), "controller %x: getDataSource");
            }
            t25 t25Var = (t25) s1dVar.A.get();
            qe7.v();
            this.p = t25Var;
            o(t25Var, null);
            if (pj6.a.h(2)) {
                pj6.f(v, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.j, Integer.valueOf(System.identityHashCode(this.p)));
            }
            ((q0) this.p).l(new s0(this, this.j, this.p.f()), this.c);
            qe7.v();
        } catch (Throwable th) {
            qe7.v();
            throw th;
        }
    }

    public String toString() {
        dc9 dc9VarC = qdl.c(this);
        dc9VarC.w("isAttached", this.l);
        dc9VarC.w("isRequestSubmitted", this.m);
        dc9VarC.w("hasFetchFailed", this.n);
        au3 au3Var = (au3) this.q;
        dc9VarC.u((au3Var == null || !au3Var.P()) ? 0 : System.identityHashCode(au3Var.b.c()), "fetchedImage");
        dc9VarC.v(this.a.a.toString(), "events");
        return dc9VarC.toString();
    }
}
