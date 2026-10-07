package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class nc6 extends xt4 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public zv e;

    @Override // defpackage.xt4
    public final xt4 R0(int i, String str) {
        n1g.m(i);
        return str != null ? new qab(this, str) : this;
    }

    public final void S0(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public final void T0(un5 un5Var) {
        zv zvVar = this.e;
        if (zvVar == null) {
            zvVar = new zv();
            this.e = zvVar;
        }
        zvVar.addLast(un5Var);
    }

    public final void U0(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public abstract long V0();

    public final boolean W0() throws IllegalAccessException, InvocationTargetException {
        zv zvVar = this.e;
        if (zvVar == null) {
            return false;
        }
        un5 un5Var = (un5) (zvVar.isEmpty() ? null : zvVar.removeFirst());
        if (un5Var == null) {
            return false;
        }
        un5Var.run();
        return true;
    }

    public abstract void shutdown();
}
