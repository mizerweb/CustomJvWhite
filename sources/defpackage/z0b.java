package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public class z0b extends Handler {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0b(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.a = 2;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                y0b y0bVar = (y0b) message.obj;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    o30 o30Var = y0bVar.a;
                    return;
                }
                o30 o30Var2 = y0bVar.a;
                Object obj = y0bVar.b[0];
                if (o30Var2.d.get()) {
                    CountDownLatch countDownLatch = o30Var2.f;
                    try {
                        rxk rxkVar = o30Var2.g;
                        if (rxkVar.h == o30Var2) {
                            SystemClock.uptimeMillis();
                            rxkVar.h = null;
                            rxkVar.b();
                        }
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        countDownLatch.countDown();
                        throw th;
                    }
                    break;
                } else {
                    try {
                        rxk rxkVar2 = o30Var2.g;
                        if (rxkVar2.g != o30Var2) {
                            if (rxkVar2.h == o30Var2) {
                                SystemClock.uptimeMillis();
                                rxkVar2.h = null;
                                rxkVar2.b();
                            }
                        } else if (!rxkVar2.c) {
                            SystemClock.uptimeMillis();
                            rxkVar2.g = null;
                            ba9 ba9Var = rxkVar2.a;
                            if (ba9Var != null) {
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    ba9Var.k(obj);
                                } else {
                                    ba9Var.i(obj);
                                }
                            }
                        }
                        o30Var2.f.countDown();
                    } catch (Throwable th2) {
                        o30Var2.f.countDown();
                        throw th2;
                    }
                }
                o30Var2.c = 3;
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0b(Looper looper, int i) {
        super(looper);
        this.a = i;
    }
}
