package defpackage;

import android.os.Looper;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lh2 {
    public final Object a = new Object();
    public final r6a b = new r6a(10);
    public final g8b c = new g8b();
    public ze2 d;
    public of2 e;
    public xg0 f;
    public boolean g;
    public final LinkedHashMap h;

    public lh2() {
        of2 of2Var = of2.c;
        this.e = of2Var;
        this.h = new LinkedHashMap();
        c(of2Var, null);
    }

    public final void a(ze2 ze2Var, hq7 hq7Var) {
        kh2 kh2Var;
        if (!cqk.d(ze2Var, this.d)) {
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "Ignored stale transition " + hq7Var + " for " + ze2Var);
                return;
            }
            return;
        }
        of2 of2Var = this.e;
        dq7 dq7Var = dq7.b;
        dq7 dq7Var2 = dq7.c;
        int iOrdinal = of2Var.ordinal();
        kh2 kh2Var2 = null;
        of2 of2Var2 = of2.g;
        of2 of2Var3 = of2.f;
        if (iOrdinal != 2) {
            of2 of2Var4 = of2.d;
            of2 of2Var5 = of2.c;
            if (iOrdinal != 3) {
                eq7 eq7Var = eq7.b;
                of2 of2Var6 = of2.e;
                if (iOrdinal != 4) {
                    fq7 fq7Var = fq7.b;
                    if (iOrdinal == 5) {
                        if (hq7Var.equals(dq7Var)) {
                            kh2Var = new kh2(of2Var2, null);
                        } else if (hq7Var instanceof cq7) {
                            cq7 cq7Var = (cq7) hq7Var;
                            int i = cq7Var.b;
                            if (cq7Var.c) {
                                kh2Var2 = new kh2(of2Var3, tjl.c(i));
                            } else {
                                kh2Var2 = tjl.b(i) ? new kh2(of2Var4, tjl.c(i)) : new kh2(of2Var6, tjl.c(i));
                            }
                        } else if (hq7Var.equals(fq7Var)) {
                            kh2Var = new kh2(of2Var6, null);
                        } else if (hq7Var.equals(eq7Var)) {
                            kh2Var = new kh2(of2Var5, null);
                        }
                        kh2Var2 = kh2Var;
                    } else if (iOrdinal == 6) {
                        if (hq7Var.equals(fq7Var)) {
                            kh2Var = new kh2(of2Var6, null);
                        } else if (hq7Var.equals(eq7Var)) {
                            kh2Var = new kh2(of2Var5, null);
                        } else if (hq7Var instanceof cq7) {
                            int i2 = ((cq7) hq7Var).b;
                            kh2Var2 = tjl.b(i2) ? new kh2(of2Var4, tjl.c(i2)) : new kh2(of2Var5, tjl.c(i2));
                        }
                        kh2Var2 = kh2Var;
                    }
                } else {
                    if (hq7Var.equals(eq7Var)) {
                        kh2Var = new kh2(of2Var5, null);
                    } else if (hq7Var.equals(dq7Var2)) {
                        kh2Var = new kh2(of2Var3, null);
                    } else if (hq7Var instanceof cq7) {
                        kh2Var2 = new kh2(of2Var6, tjl.c(((cq7) hq7Var).b));
                    }
                    kh2Var2 = kh2Var;
                }
            } else {
                if (hq7Var.equals(dq7Var2)) {
                    kh2Var = new kh2(of2Var3, null);
                } else if (hq7Var.equals(dq7Var)) {
                    kh2Var = new kh2(of2Var2, null);
                } else if (hq7Var instanceof cq7) {
                    int i3 = ((cq7) hq7Var).b;
                    kh2Var2 = tjl.b(i3) ? new kh2(of2Var4, tjl.c(i3)) : new kh2(of2Var5, tjl.c(i3));
                }
                kh2Var2 = kh2Var;
            }
        } else {
            if (hq7Var.equals(dq7Var2)) {
                kh2Var = new kh2(of2Var3, null);
            } else if (hq7Var.equals(dq7Var)) {
                kh2Var = new kh2(of2Var2, null);
            }
            kh2Var2 = kh2Var;
        }
        if (kh2Var2 == null) {
            if (tvj.f(5, "CXCP")) {
                Log.w("CXCP", "Impermissible state transition: current camera internal state: " + this.e + ", received graph state: " + hq7Var);
                return;
            }
            return;
        }
        this.e = kh2Var2.a;
        this.f = kh2Var2.b;
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "Updated current camera internal state to " + kh2Var2);
        }
        c(this.e, this.f);
    }

    public final void b(ze2 ze2Var, hq7 hq7Var) {
        synchronized (this.a) {
            if (this.g) {
                if (tvj.f(5, "CXCP")) {
                    Log.w("CXCP", "Ignoring graph state update " + hq7Var + " on removed camera.");
                }
                return;
            }
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", ze2Var + " state updated to " + hq7Var);
            }
            a(ze2Var, hq7Var);
        }
    }

    public final void c(of2 of2Var, xg0 xg0Var) {
        ih2 ih2Var;
        List<Map.Entry> listT1;
        ((g8b) this.b.a).i(new d99(of2Var));
        int iOrdinal = of2Var.ordinal();
        if (iOrdinal == 2) {
            ih2Var = ih2.e;
        } else if (iOrdinal == 3) {
            ih2Var = ih2.a;
        } else if (iOrdinal == 4) {
            ih2Var = ih2.d;
        } else if (iOrdinal == 5) {
            ih2Var = ih2.b;
        } else {
            if (iOrdinal != 6) {
                qr7.y(of2Var, "Unexpected CameraInternal state: ");
                return;
            }
            ih2Var = ih2.c;
        }
        wg0 wg0Var = new wg0(ih2Var, xg0Var);
        g8b g8bVar = this.c;
        if (cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
            g8bVar.k(wg0Var);
        } else {
            g8bVar.i(wg0Var);
        }
        synchronized (this.a) {
            listT1 = ww3.T1(this.h.entrySet());
        }
        for (Map.Entry entry : listT1) {
            ((Executor) entry.getValue()).execute(new f92((ug4) entry.getKey(), 9, wg0Var));
        }
    }
}
