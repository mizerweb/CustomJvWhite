package defpackage;

import android.content.Context;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class wb0 {
    public final eif a;
    public final e41 d;
    public final d60 e;
    public final long f;
    public boolean i;
    public Executor j;
    public kzi k;
    public i86 l;
    public ih m;
    public vb0 n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public byte[] s;
    public double t;
    public final int v;
    public final AtomicReference b = new AtomicReference(null);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public int g = 1;
    public w31 h = w31.b;
    public long u = 0;

    public wb0(rg0 rg0Var, Executor executor, Context context) throws AudioSourceAccessException {
        eif eifVar = new eif(executor);
        this.a = eifVar;
        this.f = 3000000000L;
        try {
            try {
                e41 e41Var = new e41(new ac0(rg0Var, context), rg0Var);
                this.d = e41Var;
                rj5 rj5Var = new rj5(3, this);
                qyj.l("AudioStream can not be started when setCallback.", true ^ e41Var.a.get());
                e41Var.a();
                e41Var.d.execute(new i0(e41Var, rj5Var, eifVar, 6));
                d60 d60Var = new d60();
                d60Var.d = new AtomicBoolean(false);
                d60Var.e = new AtomicBoolean(false);
                d60Var.a = rg0Var.a();
                d60Var.b = rg0Var.b;
                this.e = d60Var;
                this.v = rg0Var.e;
            } catch (AudioStream$AudioStreamException e) {
                e = e;
                throw new AudioSourceAccessException("Unable to create AudioStream", e);
            }
        } catch (AudioStream$AudioStreamException | IllegalArgumentException e2) {
            e = e2;
        }
    }

    public final void a() {
        Executor executor = this.j;
        kzi kziVar = this.k;
        if (executor == null || kziVar == null) {
            return;
        }
        int i = 1;
        boolean z = this.r || this.o || this.q;
        if (Objects.equals(this.b.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        executor.execute(new nb0(kziVar, z, i));
    }

    public final void b(i86 i86Var) {
        i86 i86Var2 = this.l;
        w31 w31Var = null;
        if (i86Var2 != null) {
            vb0 vb0Var = this.n;
            Objects.requireNonNull(vb0Var);
            i86Var2.j(vb0Var);
            this.l = null;
            this.n = null;
            this.m = null;
            this.h = w31.b;
            f();
        }
        if (i86Var != null) {
            this.l = i86Var;
            this.n = new vb0(this, i86Var);
            this.m = new ih(this, i86Var, false);
            try {
                e89 e89VarF = i86Var.f();
                if (((u72) e89VarF).b.isDone()) {
                    w31Var = (w31) ((u72) e89VarF).b.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (w31Var != null) {
                this.h = w31Var;
                f();
            }
            this.l.n(this.a, this.n);
        }
    }

    public final void c() {
        i86 i86Var = this.l;
        Objects.requireNonNull(i86Var);
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            i86Var.d.h.execute(new g86(i86Var, r72Var, 1));
            r72Var.a = "acquireBuffer";
        } catch (Exception e) {
            u72Var.c(e);
        }
        ih ihVar = this.m;
        Objects.requireNonNull(ihVar);
        o9b.a(u72Var, ihVar, this.a);
    }

    public final void d(int i) {
        tvj.a("AudioSource", "Transitioning internal state: " + p.q(this.g) + " --> " + p.q(i));
        this.g = i;
    }

    public final void e() {
        if (this.i) {
            int i = 0;
            this.i = false;
            tvj.a("AudioSource", "stopSendingAudio");
            e41 e41Var = this.d;
            e41Var.a();
            if (e41Var.a.getAndSet(false)) {
                e41Var.d.execute(new c41(e41Var, i));
            }
        }
    }

    public final void f() {
        if (this.g != 2) {
            e();
            return;
        }
        boolean z = this.h == w31.a;
        boolean z2 = !z;
        Executor executor = this.j;
        kzi kziVar = this.k;
        if (executor != null && kziVar != null && this.c.getAndSet(z2) != z2) {
            executor.execute(new c3(kziVar, z2));
        }
        if (!z) {
            e();
            return;
        }
        if (this.i) {
            return;
        }
        try {
            tvj.a("AudioSource", "startSendingAudio");
            this.d.c();
            this.o = false;
        } catch (AudioStream$AudioStreamException e) {
            tvj.i("AudioSource", "Failed to start AudioStream", e);
            this.o = true;
            d60 d60Var = this.e;
            d60Var.b();
            if (!((AtomicBoolean) d60Var.d).getAndSet(true)) {
                d60Var.c = System.nanoTime();
            }
            this.p = System.nanoTime();
            a();
        }
        this.i = true;
        c();
    }
}
