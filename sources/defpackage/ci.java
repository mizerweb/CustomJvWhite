package defpackage;

import android.graphics.Bitmap;
import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import one.me.rlottie.RLottie;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ci implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ ci(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        nn5 nn5Var;
        int i = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int i2 = 1;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                ((ScheduledExecutorService) cqk.e.j.a.getValue()).schedule(new ci(i2, arrayList), 36L, timeUnit);
                return;
            case 1:
                break;
            case 2:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Bitmap) it.next()).recycle();
                }
                return;
            case 3:
                rn5 rn5Var = rn5.k;
                SparseIntArray sparseIntArray = rn5Var.b;
                ArrayList arrayList2 = rn5Var.a;
                ArrayList arrayList3 = rn5Var.c;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Runnable runnable = (Runnable) arrayList.get(i3);
                    if (runnable != null) {
                        if (!arrayList3.isEmpty() && (rn5Var.g / 2 <= arrayList3.size() || (arrayList2.isEmpty() && rn5Var.e >= rn5Var.d))) {
                            nn5Var = (nn5) arrayList3.remove(0);
                        } else if (arrayList2.isEmpty()) {
                            nn5Var = new nn5("rlottie-bg-pool" + rn5Var.f + "-" + pn5.j.nextInt());
                            nn5Var.setPriority(10);
                            rn5Var.e = rn5Var.e + 1;
                        } else {
                            nn5Var = (nn5) arrayList2.remove(0);
                        }
                        if (!rn5Var.h) {
                            ((ScheduledExecutorService) cqk.e.j.a.getValue()).schedule(rn5Var.i, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, timeUnit);
                            rn5Var.h = true;
                        }
                        rn5Var.g++;
                        arrayList3.add(nn5Var);
                        sparseIntArray.put(nn5Var.d, sparseIntArray.get(nn5Var.d, 0) + 1);
                        if (nn5Var.getPriority() != 10) {
                            nn5Var.setPriority(10);
                        }
                        nn5Var.b(new i0(rn5Var, runnable, nn5Var, 20));
                    }
                }
                arrayList.clear();
                di.d(new ci(4, arrayList));
                return;
            case 4:
                rn5.l.add(arrayList);
                return;
            default:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ExecutorService) it2.next()).shutdownNow();
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((ExecutorService) it3.next()).awaitTermination(1L, TimeUnit.SECONDS);
                }
                return;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i4)).get();
            ((WeakReference) arrayList.get(i4)).clear();
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    bitmap.recycle();
                } catch (Throwable th) {
                    RLottie.getLogger().h(th);
                }
            }
        }
    }
}
