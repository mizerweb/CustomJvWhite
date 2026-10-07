package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class lrb extends AtomicInteger implements ko5 {
    public final rrb a;
    public final uik b;
    public final mrb[] c;
    public final Object[] d;
    public volatile boolean e;

    public lrb(rrb rrbVar, uik uikVar, int i) {
        this.a = rrbVar;
        this.b = uikVar;
        this.c = new mrb[i];
        this.d = new Object[i];
    }

    public final void a() {
        mrb[] mrbVarArr = this.c;
        for (mrb mrbVar : mrbVarArr) {
            mrbVar.b.clear();
        }
        for (mrb mrbVar2 : mrbVarArr) {
            oo5.a(mrbVar2.e);
        }
    }

    public final void b() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        mrb[] mrbVarArr = this.c;
        rrb rrbVar = this.a;
        Object[] objArr = this.d;
        int iAddAndGet = 1;
        while (true) {
            int i = 0;
            int i2 = 0;
            for (mrb mrbVar : mrbVarArr) {
                if (objArr[i2] == null) {
                    boolean z = mrbVar.c;
                    Object objPoll = mrbVar.b.poll();
                    boolean z2 = objPoll == null;
                    if (this.e) {
                        a();
                        return;
                    }
                    if (z) {
                        Throwable th2 = mrbVar.d;
                        if (th2 != null) {
                            this.e = true;
                            a();
                            rrbVar.onError(th2);
                            return;
                        } else if (z2) {
                            this.e = true;
                            a();
                            rrbVar.b();
                            return;
                        }
                    }
                    if (z2) {
                        i++;
                    } else {
                        objArr[i2] = objPoll;
                    }
                } else if (mrbVar.c && (th = mrbVar.d) != null) {
                    this.e = true;
                    a();
                    rrbVar.onError(th);
                    return;
                }
                i2++;
            }
            if (i != 0) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                try {
                    Object objMo41apply = this.b.mo41apply(objArr.clone());
                    Objects.requireNonNull(objMo41apply, "The zipper returned a null value");
                    rrbVar.d(objMo41apply);
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th3) {
                    iwl.a(th3);
                    a();
                    rrbVar.onError(th3);
                    return;
                }
            }
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        if (this.e) {
            return;
        }
        this.e = true;
        for (mrb mrbVar : this.c) {
            oo5.a(mrbVar.e);
        }
        if (getAndIncrement() == 0) {
            for (mrb mrbVar2 : this.c) {
                mrbVar2.b.clear();
            }
        }
    }
}
