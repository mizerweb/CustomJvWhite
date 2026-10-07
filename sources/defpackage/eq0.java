package defpackage;

import android.os.Looper;
import android.os.MessageQueue;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ af7 b;

    public /* synthetic */ eq0(int i, af7 af7Var) {
        this.a = i;
        this.b = af7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        final af7 af7Var = this.b;
        switch (i) {
            case 0:
                af7Var.invoke();
                break;
            case 1:
                af7Var.invoke();
                break;
            case 2:
                af7Var.invoke();
                break;
            case 3:
                af7Var.invoke();
                break;
            case 4:
                af7Var.invoke();
                break;
            case 5:
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: k48
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        af7Var.invoke();
                        return false;
                    }
                });
                break;
            case 6:
                af7Var.invoke();
                break;
            case 7:
                af7Var.invoke();
                break;
            case 8:
                af7Var.invoke();
                break;
            case 9:
                af7Var.invoke();
                break;
            case 10:
                af7Var.invoke();
                break;
            case 11:
                af7Var.invoke();
                break;
            case 12:
                af7Var.invoke();
                break;
            case 13:
                af7Var.invoke();
                break;
            default:
                af7Var.invoke();
                break;
        }
    }
}
