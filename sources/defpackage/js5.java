package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class js5 extends Thread implements xs5 {
    public final ss5 a;
    public final ys5 b;
    public final ps5 c;
    public final boolean d;
    public final int e;
    public volatile is5 f;
    public volatile boolean g;
    public Exception h;
    public long i = -1;

    public js5(ss5 ss5Var, ys5 ys5Var, ps5 ps5Var, boolean z, int i, is5 is5Var) {
        this.a = ss5Var;
        this.b = ys5Var;
        this.c = ps5Var;
        this.d = z;
        this.e = i;
        this.f = is5Var;
    }

    public final void a(boolean z) {
        if (z) {
            this.f = null;
        }
        if (this.g) {
            return;
        }
        this.g = true;
        this.b.cancel();
        interrupt();
    }

    @Override // defpackage.xs5
    public final void d(long j, long j2, float f) {
        this.c.a = j2;
        this.c.b = f;
        if (j != this.i) {
            this.i = j;
            is5 is5Var = this.f;
            if (is5Var != null) {
                is5Var.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.d) {
                this.b.remove();
            } else {
                long j = -1;
                int i = 0;
                while (!this.g) {
                    try {
                        this.b.a(this);
                        break;
                    } catch (IOException e) {
                        if (!this.g) {
                            long j2 = this.c.a;
                            if (j2 != j) {
                                i = 0;
                                j = j2;
                            }
                            int i2 = i + 1;
                            if (i2 > this.e) {
                                throw e;
                            }
                            Thread.sleep(Math.min(i * 1000, 5000));
                            i = i2;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.h = e2;
        }
        is5 is5Var = this.f;
        if (is5Var != null) {
            is5Var.obtainMessage(10, this).sendToTarget();
        }
    }
}
