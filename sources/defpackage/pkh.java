package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class pkh {
    public static final pkh h = new pkh(new p3c(new tqi(zo5.w(new StringBuilder(), uqi.g, " TaskRunner"), true)));
    public static final Logger i = Logger.getLogger(pkh.class.getName());
    public final p3c a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final zn g = new zn(13, this);

    public pkh(p3c p3cVar) {
        this.a = p3cVar;
    }

    public static final void a(pkh pkhVar, kjh kjhVar) {
        byte[] bArr = uqi.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(kjhVar.a);
        try {
            long jA = kjhVar.a();
            synchronized (pkhVar) {
                pkhVar.b(kjhVar, jA);
            }
        } finally {
            synchronized (pkhVar) {
                pkhVar.b(kjhVar, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(kjh kjhVar, long j) {
        byte[] bArr = uqi.a;
        fkh fkhVar = kjhVar.c;
        if (fkhVar.d != kjhVar) {
            ore.k("Check failed.");
            return;
        }
        boolean z = fkhVar.f;
        fkhVar.f = false;
        fkhVar.d = null;
        this.e.remove(fkhVar);
        if (j != -1 && !z && !fkhVar.c) {
            fkhVar.d(kjhVar, j, true);
        }
        if (fkhVar.e.isEmpty()) {
            return;
        }
        this.f.add(fkhVar);
    }

    public final kjh c() {
        boolean z;
        byte[] bArr = uqi.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = BuildConfig.MAX_TIME_TO_UPLOAD;
            kjh kjhVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                kjh kjhVar2 = (kjh) ((fkh) it.next()).e.get(0);
                long jMax = Math.max(0L, kjhVar2.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (kjhVar != null) {
                        z = true;
                        break;
                    }
                    kjhVar = kjhVar2;
                }
            }
            ArrayList arrayList2 = this.e;
            if (kjhVar != null) {
                byte[] bArr2 = uqi.a;
                kjhVar.d = -1L;
                fkh fkhVar = kjhVar.c;
                fkhVar.e.remove(kjhVar);
                arrayList.remove(fkhVar);
                fkhVar.d = kjhVar;
                arrayList2.add(fkhVar);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    ((ThreadPoolExecutor) this.a.b).execute(this.g);
                }
                return kjhVar;
            }
            if (this.c) {
                if (jMin >= this.d - jNanoTime) {
                    break;
                }
                notify();
                break;
            }
            this.c = true;
            this.d = jNanoTime + jMin;
            try {
                try {
                    long j = jMin / 1000000;
                    long j2 = jMin - (1000000 * j);
                    if (j > 0 || jMin > 0) {
                        wait(j, (int) j2);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((fkh) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        fkh fkhVar2 = (fkh) arrayList.get(size2);
                        fkhVar2.b();
                        if (fkhVar2.e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.c = false;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
        return null;
    }

    public final void d(fkh fkhVar) {
        byte[] bArr = uqi.a;
        if (fkhVar.d == null) {
            boolean zIsEmpty = fkhVar.e.isEmpty();
            ArrayList arrayList = this.f;
            if (zIsEmpty) {
                arrayList.remove(fkhVar);
            } else if (!arrayList.contains(fkhVar)) {
                arrayList.add(fkhVar);
            }
        }
        if (this.c) {
            notify();
        } else {
            ((ThreadPoolExecutor) this.a.b).execute(this.g);
        }
    }

    public final fkh e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new fkh(this, zo5.h(i2, "Q"));
    }
}
