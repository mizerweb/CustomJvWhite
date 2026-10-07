package defpackage;

import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class obc extends Thread {
    public final /* synthetic */ int a = 1;
    public Object b;

    public obc(af7 af7Var) {
        this.b = af7Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (((xh) this.b) != null) {
                    int priority = getPriority();
                    c8b c8bVar = xh.b;
                    int iB = c8bVar.b(priority);
                    int i = iB >= 0 ? c8bVar.c[iB] : -1;
                    if (i == -1) {
                        Log.w("PriorityPatcher", "Early return in patch cuz of processPriority == -1");
                    } else {
                        try {
                            Process.setThreadPriority(i);
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                }
                super.run();
                break;
            default:
                ((af7) this.b).invoke();
                break;
        }
    }

    public /* synthetic */ obc(Runnable runnable, String str) {
        super(runnable, str);
    }
}
