package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class o2a {
    public boolean c;
    public m2a e;
    public final Object a = new Object();
    public final n2a b = new n2a(this);
    public WeakReference d = new WeakReference(null);

    public void A(long j) {
    }

    public void B() {
    }

    public final void a(q2a q2aVar, Handler handler) {
        if (this.c) {
            this.c = false;
            handler.removeMessages(1);
            x2d x2dVar = q2aVar.g;
            long j = x2dVar == null ? 0L : x2dVar.e;
            boolean z = x2dVar != null && x2dVar.a == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                h();
            } else {
                if (z || !z2) {
                    return;
                }
                i();
            }
        }
    }

    public void b(uv9 uv9Var) {
    }

    public void c(uv9 uv9Var, int i) {
    }

    public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void e(String str, Bundle bundle) {
    }

    public void f() {
    }

    public boolean g(Intent intent) {
        q2a q2aVar;
        m2a m2aVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.a) {
                q2aVar = (q2a) this.d.get();
                m2aVar = this.e;
            }
            if (q2aVar != null && m2aVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                p3a p3aVarB = q2aVar.b();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(q2aVar, m2aVar);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    a(q2aVar, m2aVar);
                    return true;
                }
                if (!this.c) {
                    this.c = true;
                    m2aVar.sendMessageDelayed(m2aVar.obtainMessage(1, p3aVarB), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                m2aVar.removeMessages(1);
                this.c = false;
                x2d x2dVar = q2aVar.g;
                if (((x2dVar == null ? 0L : x2dVar.e) & 32) != 0) {
                    y();
                }
                return true;
            }
        }
        return false;
    }

    public void h() {
    }

    public void i() {
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(String str, Bundle bundle) {
    }

    public void l(Uri uri, Bundle bundle) {
    }

    public void m() {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(Uri uri, Bundle bundle) {
    }

    public void q(uv9 uv9Var) {
    }

    public void r() {
    }

    public void s(long j) {
    }

    public void t(float f) {
    }

    public void u(d5e d5eVar) {
    }

    public void v(d5e d5eVar) {
    }

    public void w(int i) {
    }

    public void x(int i) {
    }

    public void y() {
    }

    public void z() {
    }
}
