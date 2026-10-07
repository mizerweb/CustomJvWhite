package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class snf {
    public final Context a;
    public volatile boolean d;
    public igh f;
    public igh h;
    public volatile lnf k;
    public volatile lnf l;
    public final Object b = new Object();
    public final fbc c = new fbc(12, new ys7(3, this));
    public final long e = System.currentTimeMillis();
    public long g = Long.MIN_VALUE;
    public long i = Long.MIN_VALUE;
    public List j = r66.a;

    public snf(Context context) {
        this.a = context;
    }

    public static void c(snf snfVar, qwf qwfVar, int i) {
        int i2;
        lnf lnfVar = null;
        if ((i & 1) != 0) {
            lnf lnfVar2 = snfVar.k;
            if (lnfVar2 == null) {
                lnfVar2 = null;
            }
            i2 = lnfVar2.f;
        } else {
            i2 = 3;
        }
        if ((i & 2) != 0) {
            lnf lnfVar3 = snfVar.k;
            if (lnfVar3 == null) {
                lnfVar3 = null;
            }
            qwfVar = lnfVar3.g;
        }
        synchronized (snfVar.b) {
            snfVar.b();
            lnf lnfVar4 = snfVar.k;
            if (lnfVar4 == null) {
                lnfVar4 = null;
            }
            snfVar.k = lnf.a(lnfVar4, i2, qwfVar, 31);
            List listM1 = ww3.m1(1, snfVar.j);
            lnf lnfVar5 = snfVar.k;
            if (lnfVar5 != null) {
                lnfVar = lnfVar5;
            }
            ArrayList arrayListH1 = ww3.H1(lnfVar, listM1);
            snfVar.j = arrayListH1;
            e9i.d(snfVar.c, arrayListH1);
            snfVar.c.z();
        }
    }

    public final void a() {
        synchronized (this.b) {
            b();
            this.i = this.e;
            this.j = Collections.singletonList(ww3.B1(this.j));
            this.c.u(Long.valueOf(this.i), "session_state_upload_ts");
            e9i.d(this.c, this.j);
            this.c.z();
        }
    }

    public final void b() {
        igh ighVarD;
        if (this.d) {
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.d) {
                    Long l = (Long) ((Map) ((AtomicReference) ((ifh) this.c.c).getValue()).get()).get("session_start_ts");
                    this.g = l != null ? l.longValue() : Long.MIN_VALUE;
                    String str = (String) ((Map) ((AtomicReference) ((ifh) this.c.c).getValue()).get()).get("session_system_state");
                    igh ighVar = null;
                    if (str == null) {
                        ighVarD = null;
                    } else {
                        try {
                            ighVarD = yab.D(str);
                        } catch (Exception unused) {
                            ighVarD = null;
                        }
                    }
                    this.h = ighVarD;
                    Long l2 = (Long) ((Map) ((AtomicReference) ((ifh) this.c.c).getValue()).get()).get("session_state_upload_ts");
                    this.i = l2 != null ? l2.longValue() : Long.MIN_VALUE;
                    fbc fbcVar = this.c;
                    List listB = r66.a;
                    String str2 = (String) ((Map) ((AtomicReference) ((ifh) fbcVar.c).getValue()).get()).get("session_states");
                    if (str2 != null) {
                        try {
                            listB = qyj.B(str2);
                        } catch (Exception unused2) {
                        }
                    }
                    this.j = listB;
                    lnf lnfVar = (lnf) ww3.D1(listB);
                    if (lnfVar != null && lnfVar.f == 1) {
                        this.j = ww3.H1(lnf.a(lnfVar, 2, null, 95), ww3.m1(1, this.j));
                    }
                    this.l = (lnf) ww3.D1(this.j);
                    igh ighVarF0 = lvb.f0(this.a);
                    igh ighVar2 = this.h;
                    Map map = ighVar2 != null ? ighVar2.n : null;
                    if (map != null) {
                        ighVarF0 = igh.a(ighVarF0, false, wm9.T0(map, ighVarF0.n), 24575);
                    }
                    this.f = ighVarF0;
                    List listO1 = ww3.O1(50, ww3.H1(new lnf(ighVarF0.b, ighVarF0.a, ighVarF0.d, ighVarF0.f, (String) ighVarF0.n.get("processName"), 1, null), this.j));
                    this.j = listO1;
                    this.k = (lnf) ww3.B1(listO1);
                    this.c.u(Long.valueOf(this.e), "session_start_ts");
                    fbc fbcVar2 = this.c;
                    igh ighVar3 = this.f;
                    if (ighVar3 != null) {
                        ighVar = ighVar3;
                    }
                    fbcVar2.u(yab.F0(ighVar).toString(), "session_system_state");
                    e9i.d(this.c, this.j);
                    this.c.z();
                    this.d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(boolean z) {
        synchronized (this.b) {
            b();
            igh ighVar = this.f;
            if ((ighVar == null ? null : ighVar).k == z) {
                return;
            }
            if (ighVar == null) {
                ighVar = null;
            }
            igh ighVarA = igh.a(ighVar, z, null, 31743);
            this.f = ighVarA;
            this.c.u(yab.F0(ighVarA).toString(), "session_system_state");
        }
    }

    public final void e(Map map) {
        boolean z;
        synchronized (this.b) {
            try {
                b();
                igh ighVar = this.f;
                igh ighVar2 = null;
                if (ighVar == null) {
                    ighVar = null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(ighVar.n);
                Iterator it = map.entrySet().iterator();
                loop0: while (true) {
                    z = false;
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        String strU1 = r5h.u1(32, str);
                        String strU2 = str2 != null ? r5h.u1(64, str2) : null;
                        if (cqk.d(linkedHashMap.get(strU1), strU2)) {
                            break;
                        }
                        if (strU2 != null) {
                            linkedHashMap.put(strU1, strU2);
                        } else {
                            linkedHashMap.remove(strU1);
                        }
                        z = true;
                    }
                }
                if (z) {
                    igh ighVar3 = this.f;
                    if (ighVar3 != null) {
                        ighVar2 = ighVar3;
                    }
                    igh ighVarA = igh.a(ighVar2, false, linkedHashMap, 24575);
                    this.f = ighVarA;
                    this.c.u(yab.F0(ighVarA).toString(), "session_system_state");
                    this.c.z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(int i) {
        b();
        lnf lnfVar = this.l;
        if (lnfVar != null) {
            synchronized (this.b) {
                b();
                lnf lnfVarA = lnf.a(lnfVar, i, null, 95);
                this.l = lnfVarA;
                if (this.j.size() <= 1) {
                    return;
                }
                ArrayList arrayListH1 = ww3.H1(ww3.B1(this.j), ww3.H1(lnfVarA, ww3.m1(2, this.j)));
                this.j = arrayListH1;
                e9i.d(this.c, arrayListH1);
                this.c.z();
            }
        }
    }
}
