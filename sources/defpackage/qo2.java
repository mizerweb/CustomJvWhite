package defpackage;

import java.util.ArrayDeque;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qo2 implements w7h {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public oo2 d;
    public long e;
    public long f;
    public long g;

    public qo2() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new oo2(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            ot4 ot4Var = new ot4(23, this);
            po2 po2Var = new po2();
            po2Var.g = ot4Var;
            arrayDeque.add(po2Var);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.w7h
    public final void a(long j) {
        this.e = j;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // defpackage.s55
    public final void c(a8h a8hVar) {
        lvb.R(a8hVar == this.d);
        oo2 oo2Var = (oo2) a8hVar;
        if (oo2Var.d(4)) {
            long j = this.f;
            this.f = 1 + j;
            oo2Var.j = j;
            this.c.add(oo2Var);
        } else {
            long j2 = oo2Var.f;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.g;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f;
                    this.f = 1 + j4;
                    oo2Var.j = j4;
                    this.c.add(oo2Var);
                } else {
                    oo2Var.q();
                    this.a.add(oo2Var);
                }
            } else {
                long j5 = this.f;
                this.f = 1 + j5;
                oo2Var.j = j5;
                this.c.add(oo2Var);
            }
        }
        this.d = null;
    }

    @Override // defpackage.s55
    public final void d(long j) {
        this.g = j;
    }

    @Override // defpackage.s55
    public final Object e() {
        lvb.b0(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        oo2 oo2Var = (oo2) arrayDeque.pollFirst();
        this.d = oo2Var;
        return oo2Var;
    }

    public abstract ft0 f();

    @Override // defpackage.s55
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            oo2 oo2Var = (oo2) arrayDeque2.poll();
            String str = vqi.a;
            oo2Var.q();
            arrayDeque.add(oo2Var);
        }
        oo2 oo2Var2 = this.d;
        if (oo2Var2 != null) {
            oo2Var2.q();
            arrayDeque.add(oo2Var2);
            this.d = null;
        }
    }

    public abstract void g(oo2 oo2Var);

    @Override // defpackage.s55
    /* JADX INFO: renamed from: h */
    public po2 b() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            oo2 oo2Var = (oo2) arrayDeque2.peek();
            String str = vqi.a;
            if (oo2Var.f > this.e) {
                return null;
            }
            oo2 oo2Var2 = (oo2) arrayDeque2.poll();
            boolean zD = oo2Var2.d(4);
            ArrayDeque arrayDeque3 = this.a;
            if (zD) {
                po2 po2Var = (po2) arrayDeque.pollFirst();
                po2Var.a(4);
                oo2Var2.q();
                arrayDeque3.add(oo2Var2);
                return po2Var;
            }
            g(oo2Var2);
            if (i()) {
                ft0 ft0VarF = f();
                po2 po2Var2 = (po2) arrayDeque.pollFirst();
                po2Var2.s(oo2Var2.f, ft0VarF, BuildConfig.MAX_TIME_TO_UPLOAD);
                oo2Var2.q();
                arrayDeque3.add(oo2Var2);
                return po2Var2;
            }
            oo2Var2.q();
            arrayDeque3.add(oo2Var2);
        }
    }

    public abstract boolean i();

    @Override // defpackage.s55
    public void release() {
    }
}
