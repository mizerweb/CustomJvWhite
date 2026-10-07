package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class qn5 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ qn5(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        switch (this.a) {
            case 0:
                ArrayList arrayList = rn5.j;
                if (arrayList == null || arrayList.isEmpty()) {
                    rn5.j = null;
                    return;
                }
                ArrayList arrayList2 = rn5.j;
                rn5.j = null;
                if (rn5.k == null) {
                    rn5.k = new rn5(Math.max(1, cqk.e.h));
                }
                en8 en8Var = cqk.e.j;
                ((ScheduledExecutorService) en8Var.a.getValue()).execute(new ci(3, arrayList2));
                return;
            case 1:
                try {
                    int i = mwh.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (l46.k == null) {
                        z = false;
                    }
                    if (z) {
                        l46.a().c();
                        break;
                    }
                    return;
                } finally {
                    int i2 = mwh.a;
                    Trace.endSection();
                }
            case 2:
            case 3:
                return;
            default:
                for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(c3f.d.keySet())) {
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        c3f.d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }
}
