package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class j6a implements Runnable {
    public final Handler a;
    public final g2i b;
    public final long c;
    public final long d;
    public final b6a e;
    public final String f = j6a.class.getName();
    public long g = Long.MIN_VALUE;
    public int h = Integer.MIN_VALUE;
    public final ww6 i = new ww6(15);

    public j6a(Handler handler, g2i g2iVar, long j, long j2, b6a b6aVar) {
        this.a = handler;
        this.b = g2iVar;
        this.c = j;
        this.d = j2;
        this.e = b6aVar;
    }

    public final void a() {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "cancel", null);
            }
        }
        this.a.removeCallbacks(this);
        this.g = Long.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
    }

    public final void b() {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "start", null);
            }
        }
        this.a.postDelayed(this, this.c);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        g2i g2iVar = this.b;
        ww6 ww6Var = this.i;
        int iE = g2iVar.e(ww6Var);
        long j = this.g;
        if (j == Long.MIN_VALUE) {
            this.g = jElapsedRealtime;
            if (iE == 2) {
                this.h = ww6Var.b;
            }
        } else {
            String str = this.f;
            if (iE != 2 || (i = ww6Var.b) <= this.h) {
                long j2 = jElapsedRealtime - j;
                if (j2 >= this.d) {
                    gm0.Y(str, "it seems media transform is stuck, ~ " + (j2 / 1000.0f) + " s");
                }
            } else {
                this.g = jElapsedRealtime;
                this.h = i;
                gm0.n(str, "media transform progress=" + i + "%");
                b6a b6aVar = this.e;
                if (b6aVar != null) {
                    b6aVar.a(this.h / 100.0f);
                }
            }
        }
        this.a.postDelayed(this, this.c);
    }
}
