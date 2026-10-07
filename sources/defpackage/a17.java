package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class a17 extends AtomicInteger implements g17 {
    public final g17 a;
    public final s7h b;
    public final w07 c;
    public final uv0 d;
    public int e;
    public long f;

    public a17(g17 g17Var, uv0 uv0Var, s7h s7hVar, w07 w07Var) {
        this.a = g17Var;
        this.b = s7hVar;
        this.c = w07Var;
        this.d = uv0Var;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.b.f) {
                long j = this.f;
                long j2 = 0;
                if (j != 0) {
                    this.f = 0L;
                    s7h s7hVar = this.b;
                    if (!s7hVar.g) {
                        if (s7hVar.get() == 0 && s7hVar.compareAndSet(0, 1)) {
                            long j3 = s7hVar.b;
                            if (j3 != BuildConfig.MAX_TIME_TO_UPLOAD) {
                                long j4 = j3 - j;
                                if (j4 < 0) {
                                    tre.s0(new ProtocolViolationException(zo5.j(j4, "More produced than requested: ")));
                                } else {
                                    j2 = j4;
                                }
                                s7hVar.b = j2;
                            }
                            if (s7hVar.decrementAndGet() != 0) {
                                s7hVar.b();
                            }
                        } else {
                            ndl.a(s7hVar.e, j);
                            s7hVar.a();
                        }
                    }
                }
                this.c.a(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.g17
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.g17
    public final void d(Object obj) {
        this.f++;
        this.a.d(obj);
    }

    @Override // defpackage.g17
    public final void e(r7h r7hVar) {
        s7h s7hVar = this.b;
        if (s7hVar.f) {
            r7hVar.cancel();
            return;
        }
        if (s7hVar.get() != 0 || !s7hVar.compareAndSet(0, 1)) {
            s7hVar.a();
            return;
        }
        s7hVar.a = r7hVar;
        long j = s7hVar.b;
        if (s7hVar.decrementAndGet() != 0) {
            s7hVar.b();
        }
        if (j != 0) {
            r7hVar.f(j);
        }
    }

    @Override // defpackage.g17
    public final void onError(Throwable th) {
        g17 g17Var = this.a;
        try {
            uv0 uv0Var = this.d;
            int i = this.e + 1;
            this.e = i;
            if (uv0Var.test(Integer.valueOf(i), th)) {
                a();
            } else {
                g17Var.onError(th);
            }
        } catch (Throwable th2) {
            iwl.a(th2);
            g17Var.onError(new CompositeException(th, th2));
        }
    }
}
