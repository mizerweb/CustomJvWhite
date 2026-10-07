package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class wv3 extends ls0 {
    public final /* synthetic */ xv3 a;
    public final /* synthetic */ h58 b;
    public final /* synthetic */ jv3 c;
    public final /* synthetic */ yu3 d;

    public wv3(xv3 xv3Var, h58 h58Var, jv3 jv3Var, yu3 yu3Var) {
        this.a = xv3Var;
        this.b = h58Var;
        this.c = jv3Var;
        this.d = yu3Var;
    }

    @Override // defpackage.ls0, defpackage.hme
    public final void a(v78 v78Var, String str, boolean z) {
        xv3 xv3Var = this.a;
        ViewGroup viewGroup = xv3Var.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        h58 h58Var = this.b;
        jv3 jv3Var = this.c;
        if (zIsCurrentThread) {
            xv3.n(h58Var, jv3Var, dv3.a);
            return;
        }
        Handler handler = viewGroup.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new tv3(xv3Var, h58Var, jv3Var, 2));
        } else {
            viewGroup.post(new uv3(xv3Var, h58Var, jv3Var, 2));
        }
    }

    @Override // defpackage.ls0, defpackage.hme
    public final void f(v78 v78Var, Object obj, String str, boolean z) {
        xv3 xv3Var = this.a;
        ViewGroup viewGroup = xv3Var.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        h58 h58Var = this.b;
        jv3 jv3Var = this.c;
        yu3 yu3Var = this.d;
        if (zIsCurrentThread) {
            xv3.n(h58Var, jv3Var, xv3Var.d(yu3Var));
            return;
        }
        Handler handler = viewGroup.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new vv3(xv3Var, h58Var, jv3Var, yu3Var, 0));
        } else {
            viewGroup.post(new vv3(xv3Var, h58Var, jv3Var, yu3Var, 1));
        }
    }

    @Override // defpackage.hme
    public final void g(v78 v78Var, String str, Throwable th, boolean z) {
        xv3 xv3Var = this.a;
        ViewGroup viewGroup = xv3Var.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        h58 h58Var = this.b;
        jv3 jv3Var = this.c;
        if (zIsCurrentThread) {
            xv3.n(h58Var, jv3Var, fv3.a);
            return;
        }
        Handler handler = viewGroup.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new tv3(xv3Var, h58Var, jv3Var, 1));
        } else {
            viewGroup.post(new uv3(xv3Var, h58Var, jv3Var, 1));
        }
    }

    @Override // defpackage.ls0, defpackage.hme
    public final void k(String str) {
        xv3 xv3Var = this.a;
        ViewGroup viewGroup = xv3Var.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        h58 h58Var = this.b;
        jv3 jv3Var = this.c;
        if (zIsCurrentThread) {
            xv3.n(h58Var, jv3Var, fv3.a);
            return;
        }
        Handler handler = viewGroup.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new tv3(xv3Var, h58Var, jv3Var, 0));
        } else {
            viewGroup.post(new uv3(xv3Var, h58Var, jv3Var, 0));
        }
    }
}
