package defpackage;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class sc7 implements vx0 {
    public final due a;
    public final ri b;
    public final qc7 c;
    public final boolean d;
    public final String e;
    public final int f;
    public final int g;
    public s31 h;
    public final int i;
    public int j;
    public final rc7 k;

    public sc7(String str, due dueVar, ri riVar, qc7 qc7Var, boolean z) {
        this.a = dueVar;
        this.b = riVar;
        this.c = qc7Var;
        this.d = z;
        this.e = str == null ? String.valueOf(hashCode()) : str;
        this.f = ((si) dueVar.a).c.getWidth();
        this.g = ((si) dueVar.a).c.getHeight();
        long jV = 1000 / ((long) (((si) dueVar.a).f / dueVar.v()));
        int i = (int) (jV < 1 ? 1L : jV);
        this.i = i;
        this.j = i;
        this.k = new rc7(this);
    }

    public final gx a(int i, int i2) {
        int i3 = this.g;
        boolean z = this.d;
        int i4 = this.f;
        if (!z) {
            return new gx(i4, i3);
        }
        if (i < i4 || i2 < i3) {
            double d = ((double) i4) / ((double) i3);
            if (i2 > i) {
                if (i2 > i3) {
                    i2 = i3;
                }
                i4 = (int) (((double) i2) * d);
                i3 = i2;
            } else {
                if (i > i4) {
                    i = i4;
                }
                i3 = (int) (((double) i) / d);
                i4 = i;
            }
        }
        return new gx(i4, i3);
    }

    @Override // defpackage.vx0
    public final void b() {
        f();
        d();
    }

    @Override // defpackage.vx0
    public final au3 c(int i, int i2, int i3) {
        vc7 vc7VarC;
        gx gxVarA = a(i2, i3);
        s31 s31VarF = f();
        if (s31VarF != null) {
            int i4 = gxVarA.a;
            int i5 = gxVarA.b;
            Integer num = (Integer) s31VarF.k.get(Integer.valueOf(i));
            if (num != null) {
                int iIntValue = num.intValue();
                s31VarF.j = iIntValue;
                r31 r31Var = (r31) s31VarF.f.get(num);
                if (r31Var == null || r31Var.b || !r31Var.a.P()) {
                    r31Var = null;
                }
                if (r31Var != null) {
                    ww6 ww6Var = s31VarF.i;
                    int i6 = s31VarF.g;
                    int iK = ww6Var.k(s31VarF.e + i6);
                    if (i6 >= iK ? !((i6 > iIntValue || iIntValue > ww6Var.b) && (iIntValue < 0 || iIntValue > iK)) : !(i6 > iIntValue || iIntValue > iK)) {
                        s31VarF.e(i4, i5);
                    }
                    vc7VarC = new vc7(1, r31Var.a.l());
                } else {
                    s31VarF.e(i4, i5);
                    vc7VarC = s31VarF.c(iIntValue);
                }
            } else {
                vc7VarC = s31VarF.c(i);
            }
        } else {
            vc7VarC = null;
        }
        if (vc7VarC != null) {
            AtomicInteger atomicInteger = zj.a;
            rc7 rc7Var = this.k;
            ConcurrentHashMap concurrentHashMap = zj.d;
            if (!concurrentHashMap.contains(rc7Var)) {
                concurrentHashMap.put(rc7Var, Integer.valueOf((int) (rc7Var.a * 0.2f)));
            }
            int iD = qt4.D(vc7VarC.a);
            if (iD == 0) {
                zj.a.incrementAndGet();
            } else if (iD == 1) {
                zj.b.incrementAndGet();
            } else {
                if (iD != 2) {
                    ore.o();
                    return null;
                }
                zj.c.incrementAndGet();
            }
        }
        if (vc7VarC != null) {
            return vc7VarC.b;
        }
        return null;
    }

    @Override // defpackage.vx0
    public final void d() {
        s31 s31VarF = f();
        if (s31VarF != null) {
            ConcurrentHashMap concurrentHashMap = qc7.d;
            qc7.d.put(this.e, new bei(s31VarF, new Date()));
        }
        this.h = null;
    }

    @Override // defpackage.vx0
    public final void e(g85 g85Var, ux0 ux0Var, px0 px0Var, int i) {
    }

    public final s31 f() {
        s31 s31Var;
        if (this.h == null) {
            qc7 qc7Var = this.c;
            String str = this.e;
            ri riVar = this.b;
            due dueVar = this.a;
            ConcurrentHashMap concurrentHashMap = qc7.d;
            synchronized (concurrentHashMap) {
                bei beiVar = (bei) concurrentHashMap.get(str);
                if (beiVar != null) {
                    concurrentHashMap.remove(str);
                    s31Var = beiVar.a;
                } else {
                    s31Var = new s31(qc7Var.a, riVar, new ww6(qc7Var.b, 9, (byte) 0), dueVar, qc7Var.c);
                }
            }
            this.h = s31Var;
        }
        return this.h;
    }

    @Override // defpackage.vx0
    public final void h(int i, int i2) {
        if (i <= 0 || i2 <= 0 || this.f <= 0 || this.g <= 0) {
            return;
        }
        gx gxVarA = a(i, i2);
        s31 s31VarF = f();
        if (s31VarF != null) {
            int i3 = gxVarA.a;
            s31VarF.e(i3, i3);
        }
    }
}
