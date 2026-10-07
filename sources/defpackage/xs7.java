package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class xs7 extends z2f {
    public final Handler b;

    public xs7(Handler handler) {
        this.b = handler;
    }

    @Override // defpackage.z2f
    public final y2f a() {
        return new vs7(this.b);
    }

    @Override // defpackage.z2f
    public final ko5 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            ore.n("run == null");
            return null;
        }
        if (timeUnit == null) {
            ore.n("unit == null");
            return null;
        }
        Handler handler = this.b;
        ws7 ws7Var = new ws7(handler, runnable);
        Message messageObtain = Message.obtain(handler, ws7Var);
        messageObtain.setAsynchronous(true);
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        return ws7Var;
    }
}
