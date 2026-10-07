package defpackage;

import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class sv3 extends oq0 {
    public final /* synthetic */ xv3 b;
    public final /* synthetic */ v78 c;
    public final /* synthetic */ jv3 d;
    public final /* synthetic */ h58 e;
    public final /* synthetic */ yu3 f;

    public sv3(xv3 xv3Var, v78 v78Var, jv3 jv3Var, h58 h58Var, yu3 yu3Var) {
        this.b = xv3Var;
        this.c = v78Var;
        this.d = jv3Var;
        this.e = h58Var;
        this.f = yu3Var;
    }

    @Override // defpackage.oq0, defpackage.mr4
    public final void b(String str, Throwable th) {
        ViewGroup viewGroup = this.b.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        jv3 jv3Var = this.d;
        if (zIsCurrentThread) {
            jv3Var.a();
            return;
        }
        Handler handler = viewGroup.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new nv3(jv3Var, 0));
        } else {
            viewGroup.post(new nv3(jv3Var, 1));
        }
    }

    @Override // defpackage.oq0, defpackage.mr4
    public final void c(String str) {
        ViewGroup viewGroup = this.b.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        jv3 jv3Var = this.d;
        if (zIsCurrentThread) {
            jv3Var.a();
            return;
        }
        Handler handler = viewGroup.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new nv3(jv3Var, 2));
        } else {
            viewGroup.post(new nv3(jv3Var, 3));
        }
    }

    @Override // defpackage.oq0, defpackage.mr4
    public final void e(String str, Object obj, Animatable animatable) {
        xv3 xv3Var = this.b;
        ViewGroup viewGroup = xv3Var.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        jv3 jv3Var = this.d;
        yu3 yu3Var = this.f;
        if (zIsCurrentThread) {
            jv3Var.a();
            viewGroup.postInvalidate();
            xv3Var.j.invoke(yu3Var.k());
        } else {
            Handler handler = viewGroup.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(new ov3(jv3Var, xv3Var, yu3Var, 0));
            } else {
                viewGroup.post(new ov3(jv3Var, xv3Var, yu3Var, 1));
            }
        }
    }

    @Override // defpackage.oq0, defpackage.mr4
    public final void f(Object obj, String str) {
        xv3 xv3Var = this.b;
        ViewGroup viewGroup = xv3Var.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        v78 v78Var = this.c;
        jv3 jv3Var = this.d;
        h58 h58Var = this.e;
        if (!zIsCurrentThread) {
            Handler handler = viewGroup.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(new pv3(v78Var, obj, jv3Var, xv3Var, h58Var, 0));
                return;
            } else {
                viewGroup.post(new pv3(v78Var, obj, jv3Var, xv3Var, h58Var, 1));
                return;
            }
        }
        if (v78Var != null) {
            t25 t25VarB = vd7.A().b(v78Var, obj);
            jv3Var.d = t25VarB;
            if (xv3Var.f) {
                ((q0) t25VarB).l(new qv3(xv3Var, h58Var, jv3Var), x72.a);
            }
        }
    }
}
