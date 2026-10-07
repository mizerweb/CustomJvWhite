package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class vs7 extends y2f {
    public final Handler a;
    public volatile boolean b;

    public vs7(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.y2f
    public final ko5 b(Runnable runnable, long j, TimeUnit timeUnit) {
        l66 l66Var = l66.a;
        if (timeUnit == null) {
            ore.n("unit == null");
            return null;
        }
        if (this.b) {
            return l66Var;
        }
        Handler handler = this.a;
        ws7 ws7Var = new ws7(handler, runnable);
        Message messageObtain = Message.obtain(handler, ws7Var);
        messageObtain.obj = this;
        messageObtain.setAsynchronous(true);
        this.a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        if (!this.b) {
            return ws7Var;
        }
        this.a.removeCallbacks(ws7Var);
        return l66Var;
    }

    @Override // defpackage.ko5
    public final void dispose() {
        this.b = true;
        this.a.removeCallbacksAndMessages(this);
    }
}
