package defpackage;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class s7h extends AtomicInteger implements r7h {
    public r7h a;
    public long b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicLong d = new AtomicLong();
    public final AtomicLong e = new AtomicLong();
    public volatile boolean f;
    public boolean g;

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        b();
    }

    public final void b() {
        int iAddAndGet = 1;
        long jB = 0;
        r7h r7hVar = null;
        do {
            r7h r7hVar2 = (r7h) this.c.get();
            if (r7hVar2 != null) {
                r7hVar2 = (r7h) this.c.getAndSet(null);
            }
            long andSet = this.d.get();
            if (andSet != 0) {
                andSet = this.d.getAndSet(0L);
            }
            long andSet2 = this.e.get();
            if (andSet2 != 0) {
                andSet2 = this.e.getAndSet(0L);
            }
            r7h r7hVar3 = this.a;
            if (this.f) {
                if (r7hVar3 != null) {
                    r7hVar3.cancel();
                    this.a = null;
                }
                if (r7hVar2 != null) {
                    r7hVar2.cancel();
                }
            } else {
                long jB2 = this.b;
                if (jB2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
                    jB2 = ndl.b(jB2, andSet);
                    if (jB2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
                        jB2 -= andSet2;
                        if (jB2 < 0) {
                            tre.s0(new ProtocolViolationException(zo5.j(jB2, "More produced than requested: ")));
                            jB2 = 0;
                        }
                    }
                    this.b = jB2;
                }
                if (r7hVar2 != null) {
                    this.a = r7hVar2;
                    if (jB2 != 0) {
                        jB = ndl.b(jB, jB2);
                        r7hVar = r7hVar2;
                    }
                } else if (r7hVar3 != null && andSet != 0) {
                    jB = ndl.b(jB, andSet);
                    r7hVar = r7hVar3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jB != 0) {
            r7hVar.f(jB);
        }
    }

    @Override // defpackage.r7h
    public final void cancel() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
    }

    @Override // defpackage.r7h
    public final void f(long j) {
        if (!u7h.a(j) || this.g) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            ndl.a(this.d, j);
            a();
            return;
        }
        long j2 = this.b;
        if (j2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
            long jB = ndl.b(j2, j);
            this.b = jB;
            if (jB == BuildConfig.MAX_TIME_TO_UPLOAD) {
                this.g = true;
            }
        }
        r7h r7hVar = this.a;
        if (decrementAndGet() != 0) {
            b();
        }
        if (r7hVar != null) {
            r7hVar.f(j);
        }
    }
}
