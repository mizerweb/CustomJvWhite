package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h4b extends qrc {
    public final ConcurrentHashMap g;

    public h4b(erc ercVar) {
        super(ercVar);
        this.g = new ConcurrentHashMap();
    }

    public static void D(h4b h4bVar, String str, long j, int i, long j2, b9b b9bVar, Long l, int i2) {
        if ((i2 & 16) != 0) {
            b9bVar = q1f.b;
        }
        if ((i2 & 32) != 0) {
            l = null;
        }
        h4bVar.getClass();
        long[] jArr = q1f.a;
        b9b b9bVar2 = new b9b();
        if (b9bVar.f()) {
            b9bVar2.k("attaches", b9bVar);
        }
        b9bVar2.k("cid", Long.valueOf(j));
        b9bVar2.k("chat_id", Long.valueOf(j2));
        b9bVar2.k("chat_type", Integer.valueOf(i));
        if (l != null) {
            b9bVar2.k("post_id", l);
        }
        qrc.o(h4bVar, f4b.BUILT_NULL_MESSAGE, str, b9bVar2, null, 24);
    }

    public final b9b A(g4b g4bVar, boolean z) {
        int i = 1;
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        if (z) {
            b9bVar.k("is_resend", 1);
        }
        if (!((gue) this.a.c().c.getValue()).e()) {
            b9bVar.k("background", 1);
        }
        switch (g4bVar.a) {
            case 1:
                i = 0;
                break;
            case 2:
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            default:
                throw null;
        }
        b9bVar.k("flow", Integer.valueOf(i));
        return b9bVar;
    }

    public final void B(f4b f4bVar, g4b g4bVar) {
        qrc.p(this, f4bVar, A(g4bVar, false));
    }

    public final void C(String str, String str2, f4b f4bVar) {
        qrc.o(this, f4bVar, str, null, str2, 20);
    }

    public final String E(g4b g4bVar, String str, boolean z, String str2) {
        boolean zEquals = g4bVar.equals(g4b.c);
        long j = g4bVar.b;
        if (!zEquals && (g4bVar.a != 1 || j != 0)) {
            return qrc.x(this, null, A(g4bVar, z), Long.valueOf(j), str2, 1);
        }
        qrc.o(this, f4b.MISSED_SEND_FLOW, qrc.x(this, null, A(g4bVar, z), Long.valueOf(j), str2, 1), null, str, 20);
        return "";
    }

    public final void F(String str, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.g.put((String) it.next(), new owh(str));
        }
        h(p90.O(1, "wait_back_processing"), str);
    }

    public final void G(String str) {
        qrc.k(this, "msg_build", 0, str, false, null, null, 120);
    }

    public final void H(b9b b9bVar, String str) {
        long[] jArr = q1f.a;
        b9b b9bVar2 = new b9b();
        if (b9bVar.f()) {
            b9bVar2.k("attaches", b9bVar);
        }
        qrc.k(this, "msg_response", 3, str, true, null, b9bVar2, 80);
    }

    public final void I(String str) {
        qrc.k(this, "ready_msg_send", 1, str, false, null, null, 56);
    }

    public final g4b J(int i) {
        return new g4b(i, this.a.a());
    }

    @Override // defpackage.zqc
    public final void c(pxa pxaVar, int i) {
        ConcurrentHashMap concurrentHashMap = this.g;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (cqk.d(((owh) entry.getValue()).a, pxaVar.b)) {
                concurrentHashMap.remove(entry.getKey());
            }
        }
    }

    @Override // defpackage.zqc
    public final b9b d(pxa pxaVar) {
        return p90.O(Integer.valueOf(this.a.c().b()), "connection_type");
    }

    public final void z(String str, b9b b9bVar, long j, int i, long j2, Long l) {
        long[] jArr = q1f.a;
        b9b b9bVar2 = new b9b();
        if (b9bVar.f()) {
            b9bVar2.k("attaches", b9bVar);
        }
        b9bVar2.k("cid", Long.valueOf(j));
        b9bVar2.k("chat_id", Long.valueOf(j2));
        b9bVar2.k("chat_type", Integer.valueOf(i));
        if (l != null) {
            b9bVar2.k("post_id", l);
        }
        h(b9bVar2, str);
    }
}
