package defpackage;

import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Locale;
import java.util.NoSuchElementException;
import one.me.rlottie.RLottie;

/* JADX INFO: loaded from: classes3.dex */
public final class pn5 {
    public static final SecureRandom j = new SecureRandom();
    public int e;
    public int g;
    public boolean h;
    public final LinkedList a = new LinkedList();
    public final SparseIntArray b = new SparseIntArray();
    public final LinkedList c = new LinkedList();
    public final pi i = new pi(12, this);
    public final int d = 4;
    public final int f = j.nextInt();

    public final nn5 a() {
        nn5 nn5Var = new nn5("rlottie-pool-" + this.f + "-" + j.nextInt());
        nn5Var.setPriority(10);
        return nn5Var;
    }

    public final void b(Runnable runnable) {
        nn5 nn5VarA;
        LinkedList linkedList = this.c;
        boolean zIsEmpty = linkedList.isEmpty();
        int i = this.d;
        LinkedList linkedList2 = this.a;
        if (!zIsEmpty && (this.g / 2 <= linkedList.size() || (linkedList2.isEmpty() && this.e >= i))) {
            try {
                nn5VarA = (nn5) linkedList.removeFirst();
            } catch (NoSuchElementException e) {
                RLottie.getLogger().h(e);
                nn5VarA = null;
            }
        } else if (linkedList2.isEmpty()) {
            nn5VarA = a();
            this.e++;
        } else {
            nn5VarA = (nn5) linkedList2.removeFirst();
        }
        if (!this.h) {
            di.e(this.i, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            this.h = true;
        }
        if (nn5VarA == null) {
            cbb logger = RLottie.getLogger();
            Locale locale = Locale.US;
            int size = linkedList.size();
            int i2 = this.g;
            int size2 = linkedList2.size();
            int i3 = this.e;
            StringBuilder sbP = qv1.p("DispatchQueuePool: queue is null – busyQueues.size=", size, ", totalTasksCount=", i2, ", queues.size=");
            qt4.x(size2, i3, ", createdCount=", ", maxCount=", sbP);
            sbP.append(i);
            logger.e(sbP.toString(), new IllegalStateException("queue is null"));
            nn5VarA = a();
            this.e++;
        }
        int i4 = nn5VarA.d;
        this.g++;
        linkedList.add(nn5VarA);
        SparseIntArray sparseIntArray = this.b;
        sparseIntArray.put(i4, sparseIntArray.get(i4, 0) + 1);
        if (nn5VarA.getPriority() != 10) {
            nn5VarA.setPriority(10);
        }
        nn5VarA.b(new i0(this, runnable, nn5VarA, 19));
    }
}
