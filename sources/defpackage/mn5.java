package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mn5 implements Handler.Callback {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ mn5() {
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                return true;
            default:
                if (message.what != 0) {
                    return false;
                }
                Handler handler = m8c.a;
                l8c l8cVar = (l8c) message.obj;
                AtomicBoolean atomicBoolean = m8c.d;
                if (!atomicBoolean.compareAndSet(false, true)) {
                    return true;
                }
                if (cqk.d(m8c.b, l8cVar) || cqk.d(m8c.c, l8cVar)) {
                    m8c.a(l8cVar, j8c.a);
                }
                atomicBoolean.set(false);
                return true;
        }
    }

    public /* synthetic */ mn5(nn5 nn5Var) {
    }
}
