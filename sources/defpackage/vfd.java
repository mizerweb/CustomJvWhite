package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class vfd {
    public static final String[] x = {"online_contact_opened", "online_contact_closed", "online_stranger_opened", "online_stranger_closed", "offline_contact_opened", "offline_contact_closed", "offline_stranger_opened", "offline_stranger_closed", "cache_empty", "cache_fresh", "cache_stale"};
    public final Context a;
    public final gu4 b;
    public final yfd c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final String h = vfd.class.getName();
    public volatile boolean i;
    public final pzf j;
    public final ifh k;
    public final AtomicInteger l;
    public final AtomicInteger m;
    public final AtomicInteger n;
    public final AtomicInteger o;
    public final AtomicInteger p;
    public final AtomicInteger q;
    public final AtomicInteger r;
    public final AtomicInteger s;
    public final AtomicInteger t;
    public final AtomicInteger u;
    public final AtomicInteger v;
    public final sgg w;

    public vfd(Context context, gu4 gu4Var, ny8 ny8Var, xhh xhhVar, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, yfd yfdVar, gu4 gu4Var2) {
        this.a = context;
        this.b = gu4Var;
        this.c = yfdVar;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var4;
        this.g = ny8Var3;
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.j = pzfVarB;
        this.k = new ifh(new ap9(20, this));
        this.l = new AtomicInteger(0);
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(0);
        this.o = new AtomicInteger(0);
        this.p = new AtomicInteger(0);
        this.q = new AtomicInteger(0);
        this.r = new AtomicInteger(0);
        this.s = new AtomicInteger(0);
        this.t = new AtomicInteger(0);
        this.u = new AtomicInteger(0);
        this.v = new AtomicInteger(0);
        boolean zBooleanValue = ((Boolean) yfdVar.t.i()).booleanValue();
        if (!zBooleanValue) {
            ((ConcurrentHashMap) yfdVar.H.getValue()).clear();
        }
        if (zBooleanValue) {
            ghb ghbVar = ew5.b;
            this.w = tre.m0(e9i.T(new fz6(e9i.r(new cy6(qe7.O(5, lw5.SECONDS), null, pzfVarB)), new sfd(this, (lq4) null, 0), 3), ((n0c) xhhVar).a()), gu4Var2);
        }
    }

    public final void a() {
        if (this.i) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.k.getValue()).edit();
            editorEdit.putInt("online_contact_opened", this.l.get());
            editorEdit.putInt("online_contact_closed", this.n.get());
            editorEdit.putInt("online_stranger_opened", this.m.get());
            editorEdit.putInt("online_stranger_closed", this.o.get());
            editorEdit.putInt("offline_contact_opened", this.p.get());
            editorEdit.putInt("offline_contact_closed", this.r.get());
            editorEdit.putInt("offline_stranger_opened", this.q.get());
            editorEdit.putInt("offline_stranger_closed", this.s.get());
            editorEdit.putInt("cache_stale", this.u.get());
            editorEdit.putInt("cache_empty", this.t.get());
            editorEdit.putInt("cache_fresh", this.v.get());
            editorEdit.apply();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object b(akb akbVar, my2 my2Var, ex9 ex9Var, nq4 nq4Var) {
        ufd ufdVar;
        ex9 ex9Var2;
        akb akbVar2;
        long j;
        my2 my2Var2;
        je9 je9Var = je9.e;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof ufd) {
            ufdVar = (ufd) nq4Var;
            int i = ufdVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ufdVar.j = i - Integer.MIN_VALUE;
            } else {
                ufdVar = new ufd(this, nq4Var);
            }
        } else {
            ufdVar = new ufd(this, nq4Var);
        }
        Object objI = ufdVar.h;
        hu4 hu4Var = hu4.a;
        int i2 = ufdVar.j;
        if (i2 == 0) {
            ch3.d0(objI);
            if (akbVar.i() > 0 && ((gue) this.f.getValue()).e() && akbVar.k().q == null) {
                Object objT1 = ww3.t1(akbVar.k().h);
                xb1 xb1Var = objT1 instanceof xb1 ? (xb1) objT1 : null;
                if (xb1Var == null || xb1Var.g == 2) {
                    long j2 = akbVar.k().d;
                    no4 no4Var = (no4) this.g.getValue();
                    ufdVar.d = akbVar;
                    ufdVar.e = my2Var;
                    ex9Var2 = ex9Var;
                    ufdVar.f = ex9Var2;
                    ufdVar.g = j2;
                    ufdVar.j = 1;
                    objI = no4Var.i(j2);
                    if (objI == hu4Var) {
                        return hu4Var;
                    }
                    akbVar2 = akbVar;
                    j = j2;
                    my2Var2 = my2Var;
                } else {
                    String str = this.h;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "handleNotifMessage: ignore for call " + xb1Var, null);
                        return sbiVar;
                    }
                }
            }
            return sbiVar;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = ufdVar.g;
        ex9 ex9Var3 = ufdVar.f;
        my2Var2 = ufdVar.e;
        akbVar2 = ufdVar.d;
        ch3.d0(objI);
        ex9Var2 = ex9Var3;
        vg4 vg4Var = (vg4) objI;
        boolean zA = ((e9) this.e.getValue()).a(akbVar2.i());
        boolean z = vg4Var != null && vg4Var.h();
        long jApplyAsLong = ex9Var2.applyAsLong(j);
        agd agdVar = (agd) my2Var2.apply(j);
        String str2 = this.h;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            StringBuilder sb = new StringBuilder("handleNotifMessage: ");
            sb.append(j);
            sb.append("|");
            sb.append(agdVar);
            qt4.z(jApplyAsLong, "|", "|", sb);
            sb.append(zA);
            a4cVar2.c(je9Var, str2, sb.toString(), null);
        }
        int i3 = agdVar == null ? -1 : tfd.$EnumSwitchMapping$0[agdVar.ordinal()];
        if (i3 == 1) {
            if (z) {
                if (zA) {
                    this.p.incrementAndGet();
                } else {
                    this.r.incrementAndGet();
                }
            } else if (zA) {
                this.q.incrementAndGet();
            } else {
                this.s.incrementAndGet();
            }
            a();
            yfd yfdVar = this.c;
            boolean zBooleanValue = ((Boolean) yfdVar.t.i()).booleanValue();
            if (!zBooleanValue) {
                ((ConcurrentHashMap) yfdVar.H.getValue()).clear();
            }
            if (zBooleanValue) {
                int i4 = this.r.get();
                int i5 = this.p.get();
                Map<String, ?> all = ((SharedPreferences) this.k.getValue()).getAll();
                StringBuilder sb2 = new StringBuilder("offline for:");
                sb2.append(j);
                sb2.append("|");
                sb2.append(agdVar);
                qt4.z(jApplyAsLong, "|", ";onUi=", sb2);
                sb2.append(zA);
                sb2.append(";offlineContactClosed=");
                sb2.append(i4);
                sb2.append(";offlineContactOpened=");
                sb2.append(i5);
                sb2.append("prefs.all=");
                sb2.append(all);
                String string = sb2.toString();
                gm0.V(this.h, string, new zfd(string));
                ((ConcurrentHashMap) this.c.H.getValue()).computeIfAbsent(Long.valueOf(j), new am(17, new pyb(28)));
                yab.i0(this.b, null, 0, new i20(this, j, (lq4) null, 21), 3);
            }
        } else if (i3 == 2) {
            if (z) {
                if (zA) {
                    this.l.incrementAndGet();
                } else {
                    this.n.incrementAndGet();
                }
            } else if (zA) {
                this.m.incrementAndGet();
            } else {
                this.o.incrementAndGet();
            }
            a();
            return sbiVar;
        }
        return sbiVar;
    }
}
