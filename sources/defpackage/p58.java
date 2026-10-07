package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class p58 extends ls0 {
    public final /* synthetic */ t58 a;

    public p58(t58 t58Var) {
        this.a = t58Var;
    }

    @Override // defpackage.ls0, defpackage.hme
    public final void a(v78 v78Var, String str, boolean z) {
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        t58 t58Var = this.a;
        if (zIsCurrentThread) {
            t58Var.setRemoteImageState(i58.a);
            return;
        }
        Handler handler = t58Var.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new m58(t58Var, 7));
        } else {
            t58Var.post(new m58(t58Var, 8));
        }
    }

    @Override // defpackage.ls0, defpackage.hme
    public final void f(v78 v78Var, Object obj, String str, boolean z) {
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        t58 t58Var = this.a;
        if (zIsCurrentThread) {
            if (t58Var.getShowProgress()) {
                t58Var.setRemoteImageState(j58.a);
            }
        } else {
            Handler handler = t58Var.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(new m58(t58Var, 5));
            } else {
                t58Var.post(new m58(t58Var, 6));
            }
        }
    }

    @Override // defpackage.hme
    public final void g(v78 v78Var, String str, Throwable th, boolean z) {
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        t58 t58Var = this.a;
        if (zIsCurrentThread) {
            t58Var.setRemoteImageState(k58.a);
            return;
        }
        Handler handler = t58Var.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new m58(t58Var, 3));
        } else {
            t58Var.post(new m58(t58Var, 4));
        }
    }

    @Override // defpackage.ls0, defpackage.hme
    public final void k(String str) {
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        t58 t58Var = this.a;
        if (zIsCurrentThread) {
            t58Var.setRemoteImageState(k58.a);
            return;
        }
        Handler handler = t58Var.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new m58(t58Var, 1));
        } else {
            t58Var.post(new m58(t58Var, 2));
        }
    }
}
