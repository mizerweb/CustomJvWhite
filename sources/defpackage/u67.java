package defpackage;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class u67 implements ou {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u67(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(long j) {
    }

    @Override // defpackage.ou
    public final void h(long j) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((vfe) obj2).a = System.currentTimeMillis();
                all.b((njd) obj, Boolean.TRUE);
                break;
            case 1:
                break;
            default:
                ny8 ny8Var = (ny8) obj2;
                s7f s7fVar = (s7f) ((et3) ny8Var.getValue());
                gvb gvbVar = s7fVar.t;
                zv8[] zv8VarArr = s7f.j0;
                if (((Number) gvbVar.m(s7fVar, zv8VarArr[15])).longValue() == 0) {
                    et3 et3Var = (et3) ny8Var.getValue();
                    s7f s7fVar2 = (s7f) et3Var;
                    s7fVar2.t.B(s7fVar2, zv8VarArr[15], Long.valueOf(((ae9) obj).c.getAsLong()));
                }
                break;
        }
    }

    @Override // defpackage.ou
    public final void w(long j) {
        switch (this.a) {
            case 0:
                all.b((njd) this.c, Boolean.FALSE);
                return;
            case 1:
                ReentrantReadWriteLock.ReadLock lock = ((le7) this.b).d.readLock();
                lock.lock();
                try {
                    le7 le7Var = (le7) this.b;
                    ke7 ke7Var = le7Var.e;
                    long j2 = ke7Var.a;
                    long j3 = ke7Var.b + ke7Var.c + ke7Var.d;
                    String str = le7Var.a;
                    if (j2 == j3) {
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "Got result: " + ((le7) this.b).e, null);
                            }
                        }
                        u9c u9cVar = (u9c) ((ny8) this.c).getValue();
                        u9cVar.j.B(u9cVar, u9c.l[6], ((le7) this.b).e.a());
                    } else {
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var2 = je9.f;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, str, "Stat is invalid=" + ((le7) this.b).e, null);
                            }
                        }
                    }
                    return;
                } finally {
                    lock.unlock();
                }
            default:
                ((ae9) this.c).l("background", false);
                return;
        }
    }
}
