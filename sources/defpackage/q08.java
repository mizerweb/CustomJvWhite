package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class q08 extends kjh {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q08(int i, Object obj, Object obj2, String str) {
        super(str, true);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.kjh
    public final long a() {
        int i;
        long jA;
        d18[] d18VarArr;
        switch (this.e) {
            case 0:
                ((w08) this.f).a.a((dqf) ((wfe) this.g).a);
                return -1L;
            case 1:
                try {
                    ((w08) this.f).a.b((d18) this.g);
                    break;
                } catch (IOException e) {
                    i2d i2dVar = i2d.a;
                    i2d i2dVar2 = i2d.a;
                    String str = "Http2Connection.Listener failure for " + ((w08) this.f).c;
                    i2dVar2.getClass();
                    i2d.i(4, str, e);
                    try {
                        ((d18) this.g).c(2, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                gb3 gb3Var = (gb3) this.f;
                dqf dqfVar = (dqf) this.g;
                wfe wfeVar = new wfe();
                w08 w08Var = (w08) gb3Var.c;
                synchronized (w08Var.w) {
                    synchronized (w08Var) {
                        try {
                            dqf dqfVar2 = w08Var.q;
                            dqf dqfVar3 = new dqf();
                            i = 0;
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & dqfVar2.a) != 0) {
                                    dqfVar3.c(i2, dqfVar2.b[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & dqfVar.a) != 0) {
                                    dqfVar3.c(i3, dqfVar.b[i3]);
                                }
                            }
                            wfeVar.a = dqfVar3;
                            jA = ((long) dqfVar3.a()) - ((long) dqfVar2.a());
                            d18VarArr = (jA == 0 || w08Var.b.isEmpty()) ? null : (d18[]) w08Var.b.values().toArray(new d18[0]);
                            w08Var.q = (dqf) wfeVar.a;
                            w08Var.j.c(new q08(i, w08Var, wfeVar, w08Var.c + " onSettings"), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        w08Var.w.b((dqf) wfeVar.a);
                    } catch (IOException e2) {
                        w08Var.b(2, 2, e2);
                    }
                    break;
                }
                if (d18VarArr != null) {
                    int length = d18VarArr.length;
                    while (i < length) {
                        d18 d18Var = d18VarArr[i];
                        synchronized (d18Var) {
                            d18Var.f += jA;
                            if (jA > 0) {
                                d18Var.notifyAll();
                            }
                            break;
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
