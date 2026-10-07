package defpackage;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class er0 implements cn7 {
    public final p11 a;
    public an7 b = new so2(17);
    public bn7 c = new er3();
    public zm7 d = new p51(14);
    public Executor e = im5.a;
    public int f = -1;
    public int g = -1;

    public er0(boolean z, int i) {
        this.a = new p11(z, i);
    }

    @Override // defpackage.cn7
    public void a() {
        this.c.q();
    }

    @Override // defpackage.cn7
    public void b(wm7 wm7Var, dn7 dn7Var, long j) {
        try {
            int i = this.f;
            int i2 = dn7Var.c;
            int i3 = dn7Var.d;
            p11 p11Var = this.a;
            if (i == i2 && this.g == i3) {
                Iterable[] iterableArr = {(ArrayDeque) p11Var.d, (ArrayDeque) p11Var.e};
                for (int i4 = 0; i4 < 2; i4++) {
                    iterableArr[i4].getClass();
                }
                if (!((xn8) new j17(iterableArr).iterator()).hasNext()) {
                    int i5 = dn7Var.c;
                    this.f = i5;
                    this.g = i3;
                    lag lagVarF = f(i5, i3);
                    p11Var.d(wm7Var, lagVarF.a, lagVarF.b);
                }
            } else {
                int i6 = dn7Var.c;
                this.f = i6;
                this.g = i3;
                lag lagVarF2 = f(i6, i3);
                p11Var.d(wm7Var, lagVarF2.a, lagVarF2.b);
            }
            dn7 dn7VarF = p11Var.f();
            tab.r(dn7VarF.b, dn7VarF.c, dn7VarF.d);
            if (i()) {
                tab.g();
            }
            h(dn7Var.a, j);
            this.b.z(dn7Var);
            this.c.o(dn7VarF, j);
        } catch (VideoFrameProcessingException e) {
            e = e;
            this.e.execute(new dr0(this, e, 0));
        } catch (GlUtil$GlException e2) {
            e = e2;
            this.e.execute(new dr0(this, e, 0));
        }
    }

    @Override // defpackage.cn7
    public void c(dn7 dn7Var) {
        p11 p11Var = this.a;
        if (((ArrayDeque) p11Var.e).contains(dn7Var)) {
            ArrayDeque arrayDeque = (ArrayDeque) p11Var.e;
            lvb.b0(arrayDeque.contains(dn7Var));
            arrayDeque.remove(dn7Var);
            ((ArrayDeque) p11Var.d).add(dn7Var);
            this.b.y();
        }
    }

    @Override // defpackage.cn7
    public final void d(Executor executor, ef5 ef5Var) {
        this.e = executor;
        this.d = ef5Var;
    }

    @Override // defpackage.cn7
    public final void e(euc eucVar) {
        this.c = eucVar;
    }

    public abstract lag f(int i, int i2);

    @Override // defpackage.cn7
    public void flush() {
        p11 p11Var = this.a;
        ArrayDeque arrayDeque = (ArrayDeque) p11Var.d;
        ArrayDeque arrayDeque2 = (ArrayDeque) p11Var.e;
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        this.b.k();
        for (int i = 0; i < p11Var.b; i++) {
            this.b.y();
        }
    }

    @Override // defpackage.cn7
    public final void g(an7 an7Var) {
        this.b = an7Var;
        for (int i = 0; i < this.a.e(); i++) {
            an7Var.y();
        }
    }

    public abstract void h(int i, long j);

    public boolean i() {
        return true;
    }
}
