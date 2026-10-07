package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class axi {
    public final vw6 a;
    public final Context b;
    public wwi c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;

    public axi(Context context) {
        this.b = context;
        vw6 vw6Var = new vw6();
        vw6Var.a = new uw6();
        vw6Var.b = new uw6();
        vw6Var.d = -9223372036854775807L;
        this.a = vw6Var;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f || !surface.isValid()) {
            return;
        }
        this.h = 0.0f;
        try {
            this.e.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e) {
            lvb.l0("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public final void b() {
        this.m = 0L;
        this.q = -1L;
        this.n = -1L;
        this.k = 0L;
        this.l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public final void c() {
        float f;
        float f2;
        if (Build.VERSION.SDK_INT < 30 || this.e == null) {
            return;
        }
        vw6 vw6Var = this.a;
        if (!vw6Var.a.a()) {
            f = this.f;
        } else if (vw6Var.a.a()) {
            uw6 uw6Var = vw6Var.a;
            long j = uw6Var.e;
            f = (float) (1.0E9d / (j != 0 ? uw6Var.f / j : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (vw6Var.a.a()) {
                if ((vw6Var.a.a() ? vw6Var.a.f : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.1f;
                } else {
                    f2 = 1.0f;
                }
            } else {
                f2 = 1.0f;
            }
            if (Math.abs(f - this.g) < f2) {
                return;
            }
        } else if (f == -1.0f && vw6Var.e < 30) {
            return;
        }
        this.g = f;
        d(false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    public final void d(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.h != f) {
            this.h = f;
            try {
                this.e.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                lvb.l0("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }
}
