package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i8e {
    public static final /* synthetic */ int l = 0;
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ConcurrentHashMap k = new ConcurrentHashMap();

    public i8e(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10) {
        this.a = ny8Var3;
        this.b = ny8Var9;
        this.c = ny8Var10;
        this.d = ny8Var2;
        this.e = ny8Var4;
        this.f = ny8Var7;
        this.g = ny8Var;
        this.h = ny8Var8;
        this.i = ny8Var5;
        this.j = ny8Var6;
    }

    public static /* synthetic */ void d(i8e i8eVar, long j, long j2, long j3, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        i8eVar.c(j, j2, j3, z, z2, z3, false);
    }

    public final void a(rt2 rt2Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                long j = rt2Var.a;
                long jA = rt2Var.A();
                StringBuilder sbS = qt4.s(j, "markChatAsRead: chat.id=", ",chat.serverId=");
                sbS.append(jA);
                a4cVar.c(je9Var, "i8e", sbS.toString(), null);
            }
        }
        fda fdaVar = rt2Var.c;
        if (fdaVar == null) {
            return;
        }
        long j2 = rt2Var.b.a;
        sfa sfaVar = fdaVar.a;
        d(this, j2, sfaVar.c, sfaVar.b, false, false, false, 88);
        ((h5c) this.b.getValue()).b(j2);
    }

    public final void b(rt2 rt2Var) {
        sfa sfaVar;
        fda fdaVar = rt2Var.c;
        if (fdaVar == null || (sfaVar = fdaVar.a) == null) {
            return;
        }
        long j = sfaVar.c;
        if (j > 0) {
            d(this, rt2Var.b.a, j, sfaVar.b, true, false, false, 112);
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "i8e", zo5.j(j, "markChatAsUnread: invalid lastMessage.data.time "), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    public final void c(long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4) {
        i8e i8eVar;
        long j4 = z ? j2 - 1 : j2;
        StringBuilder sbS = qt4.s(j, "sendReadMark: chatServerId = ", ", mark = ");
        sbS.append(j2);
        sbS.append(", messageServerId = ");
        sbS.append(j3);
        gm0.n("i8e", sbS.toString());
        rt2 rt2VarK = ((qw2) this.a.getValue()).K(j);
        if (rt2VarK == null) {
            ((aob) this.c.getValue()).e(j, j4);
            i8eVar = this;
        } else {
            ufe ufeVar = new ufe();
            ufeVar.a = -1;
            if (z || z2) {
                ufeVar.a = z ? (int) ((qfa) this.f.getValue()).a(rt2VarK.a, j4) : 0;
            }
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "i8e", zo5.v(qt4.u(rt2VarK.a, "update chat ", ", setAsUnread = ", z), ", count = ", ufeVar.a), null);
                }
            }
            boolean zC0 = rt2VarK.C0();
            i8eVar = this;
            yab.i0((wmi) this.e.getValue(), ((n0c) ((xhh) this.i.getValue())).a(), 0, new f1j(this, rt2VarK, j4, ufeVar, (lq4) null), 2);
            if (!zC0) {
                return;
            }
        }
        if (j3 == 0 || j3 == -1) {
            gm0.Y("i8e", "sendReadMarkByServerId: try to send readmark for not-synced message");
            return;
        }
        ConcurrentHashMap concurrentHashMap = i8eVar.k;
        pvb pvbVar = (pvb) i8eVar.g.getValue();
        long jT = pvbVar.l(j3) ? pvb.t(pvbVar, new k13(pvbVar.u().a.g(), j, j2, j3, z, z3, z4)) : 0L;
        vo8 vo8Var = (vo8) concurrentHashMap.remove(Long.valueOf(j));
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        ((vo8) concurrentHashMap.computeIfAbsent(Long.valueOf(j), new am(19, new v14(this, jT, j)))).start();
    }
}
