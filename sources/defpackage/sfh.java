package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sfh {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public sfh(Handler handler) {
        this.a = handler;
    }

    public static rfh e() {
        rfh rfhVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                rfhVar = arrayList.isEmpty() ? new rfh() : (rfh) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return rfhVar;
    }

    public final rfh a(int i) {
        rfh rfhVarE = e();
        rfhVarE.a = this.a.obtainMessage(i);
        return rfhVarE;
    }

    public final rfh b(int i, int i2, int i3) {
        rfh rfhVarE = e();
        rfhVarE.a = this.a.obtainMessage(i, i2, i3);
        return rfhVarE;
    }

    public final rfh c(int i, Object obj) {
        rfh rfhVarE = e();
        rfhVarE.a = this.a.obtainMessage(i, obj);
        return rfhVarE;
    }

    public final rfh d(Object obj, int i, int i2, int i3) {
        rfh rfhVarE = e();
        rfhVarE.a = this.a.obtainMessage(i, i2, i3, obj);
        return rfhVarE;
    }

    public final void f(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void g() {
        this.a.removeCallbacksAndMessages(null);
    }

    public final void h(int i) {
        lvb.R(i != 0);
        this.a.removeMessages(i);
    }

    public final void i(int i) {
        this.a.sendEmptyMessage(i);
    }

    public final void j(int i, int i2) {
        this.a.sendEmptyMessageDelayed(i, i2);
    }
}
