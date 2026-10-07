package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import one.video.calls.sdk_private.bJ;

/* JADX INFO: loaded from: classes3.dex */
public class pak {
    public final int a;
    public final z7k b;
    public final zak c;
    public final ku8 d;
    public final uak e;
    public final abk f;
    public volatile boolean g;
    public volatile boolean h;
    public final ReentrantLock i;

    public pak(int i, z7k z7kVar, zak zakVar, mak makVar, ku8 ku8Var) {
        uak wakVar;
        this.a = i;
        this.b = z7kVar;
        this.c = zakVar;
        this.d = ku8Var;
        if (d() || (c() && (i & 1) != 0)) {
            wakVar = new wak(this, d() ? zakVar.f.h() : zakVar.f.g(), ku8Var);
        } else {
            wakVar = new nak();
        }
        this.e = wakVar;
        this.f = (d() || (c() && (i & 1) == 0)) ? new ebk(this, makVar, this.d) : new oak();
        this.i = new ReentrantLock();
    }

    public final long a(t8k t8kVar) throws bJ {
        if (d() || (c() && (this.a & 1) != 0)) {
            return this.e.b(t8kVar);
        }
        throw new bJ(6);
    }

    public final void b(int i) {
        zak zakVar = this.c;
        zakVar.getClass();
        try {
            zakVar.t.lock();
            zakVar.p += (long) i;
            if (zakVar.p - zakVar.q > zakVar.r) {
                z7k z7kVar = zakVar.b;
                long j = zakVar.p;
                h5k h5kVar = new h5k(1);
                h5kVar.b = j;
                z7kVar.h(h5kVar, new t81(4), true);
                zakVar.q = zakVar.p;
            }
        } finally {
            zakVar.t.unlock();
        }
    }

    public final boolean c() {
        return (this.a & 2) == 2;
    }

    public final boolean d() {
        return !c();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:2:0x0000, B:4:0x000e, B:11:0x001b, B:9:0x0015), top: B:16:0x0000 }] */
    public final void e() {
        try {
            this.i.lock();
            this.g = true;
            if (d() && this.h) {
                this.c.g(this.a);
            } else if (c()) {
                this.c.g(this.a);
            }
        } finally {
            this.i.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:2:0x0000, B:4:0x000e, B:11:0x001b, B:9:0x0015), top: B:16:0x0000 }] */
    public final void f() {
        try {
            this.i.lock();
            this.h = true;
            if (d() && this.g) {
                this.c.g(this.a);
            } else if (c()) {
                this.c.g(this.a);
            }
        } finally {
            this.i.unlock();
        }
    }

    public final String toString() {
        return zo5.h(this.a, "Stream ");
    }
}
