package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class d73 extends aq implements qih, btc {
    public final long f;
    public long g;
    public final e73 h;
    public final List i;
    public final p63 j;
    public final boolean k;
    public final int l;
    public final int m;
    public final long n;
    public final long o;
    public final int p;
    public final String q;

    public d73(long j, long j2, long j3, e73 e73Var, List list, p63 p63Var, boolean z, int i, int i2, long j4, long j5, int i3) {
        super(j);
        this.f = j2;
        this.g = j3;
        this.h = e73Var;
        this.i = list;
        this.j = p63Var;
        this.k = z;
        this.l = i;
        this.m = i2;
        this.n = j4;
        this.o = j5;
        this.p = i3;
        this.q = d73.class.getName();
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        rt2 rt2VarN;
        f73 f73Var = (f73) kihVar;
        boolean zIsEmpty = f73Var.e.isEmpty();
        long j = this.f;
        if (!zIsEmpty) {
            ArrayList arrayListG = r().g(j, ww3.U1(f73Var.e));
            if (!arrayListG.isEmpty()) {
                ArrayList arrayList = new ArrayList(yw3.W0(arrayListG, 10));
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((sfa) it.next()).a));
                }
                r().c(j, arrayList);
                o().c(new j3b(j, arrayList, null));
            }
        }
        if (f73Var.c != null) {
            p().c0(Collections.singletonList(f73Var.c));
        }
        if (this.j == p63.ADMIN && this.h == e73.ADD && (rt2VarN = p().N(j)) != null) {
            Iterator it2 = this.i.iterator();
            while (it2.hasNext()) {
                if (!rt2VarN.b.T.containsKey(Long.valueOf(((Number) it2.next()).longValue()))) {
                    o().c(new yq0(this.a, new yhh("friend.blocks.me", "friend.blocks.me", null)));
                    break;
                }
            }
        }
        o().c(new g73(this.a, this.i, this.j, this.f, this.h));
    }

    @Override // defpackage.btc
    public final void d() {
        gm0.n(this.q, "onMaxFailCount");
        int iOrdinal = this.j.ordinal();
        e73 e73Var = this.h;
        List list = this.i;
        long j = this.f;
        if (iOrdinal == 0) {
            int iOrdinal2 = e73Var.ordinal();
            if (iOrdinal2 == 0) {
                qw2 qw2VarP = p();
                rt2 rt2VarN = qw2VarP.N(j);
                if (rt2VarN != null) {
                    qw2VarP.v(j, false, new zv2(1, list));
                    qw2VarP.o.c(new wo3(Collections.singletonList(Long.valueOf(rt2VarN.a)), false));
                }
            } else {
                if (iOrdinal2 != 1) {
                    ore.o();
                    return;
                }
                p().s(j, list);
            }
        } else if (iOrdinal == 1) {
            int iOrdinal3 = e73Var.ordinal();
            if (iOrdinal3 == 0) {
                qw2 qw2VarP2 = p();
                rt2 rt2VarN2 = qw2VarP2.N(j);
                if (rt2VarN2 != null) {
                    qw2VarP2.v(j, false, new zv2(2, list));
                    qw2VarP2.o.c(new wo3(Collections.singletonList(Long.valueOf(rt2VarN2.a)), false));
                }
            } else {
                if (iOrdinal3 != 1) {
                    ore.o();
                    return;
                }
                qw2 qw2VarP3 = p();
                rt2 rt2VarN3 = qw2VarP3.N(j);
                if (rt2VarN3 != null) {
                    qw2VarP3.v(j, false, new ew2(qw2VarP3, list, this.m));
                    qw2VarP3.o.c(new wo3(Collections.singletonList(Long.valueOf(rt2VarN3.a)), false));
                }
            }
        } else if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            ore.o();
            return;
        }
        n().f(this.g);
        v().d(this.a);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        if (!p90.C(yhhVar.b)) {
            d();
        }
        o().c(new yq0(this.a, yhhVar));
        if (this.j == p63.MEMBER) {
            o().c(new cid(yhhVar, this.f, this.i));
        }
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.ChatMembersUpdate chatMembersUpdate = new Tasks.ChatMembersUpdate();
        chatMembersUpdate.requestId = this.a;
        chatMembersUpdate.chatId = this.f;
        chatMembersUpdate.chatServerId = this.g;
        chatMembersUpdate.operation = this.h.a;
        chatMembersUpdate.userIds = p90.i(this.i);
        chatMembersUpdate.chatMemberType = this.j.a;
        chatMembersUpdate.showHistory = this.k;
        chatMembersUpdate.postId = this.n;
        chatMembersUpdate.messageId = this.o;
        chatMembersUpdate.cleanMsgPeriod = this.l;
        return sia.toByteArray(chatMembersUpdate);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHAT_MEMBERS_UPDATE;
    }

    @Override // defpackage.btc
    public final atc j() {
        nx2 nx2Var;
        kx2 kx2Var;
        rt2 rt2VarN = p().N(this.f);
        if (rt2VarN == null || (kx2Var = (nx2Var = rt2VarN.b).c) == kx2.f || kx2Var == kx2.e || kx2Var == kx2.d) {
            return atc.c;
        }
        if (this.g == 0) {
            long j = nx2Var.a;
            if (j != 0) {
                this.g = j;
            }
        }
        return this.g != 0 ? atc.a : atc.b;
    }

    @Override // defpackage.btc
    public final int l() {
        return this.p;
    }

    @Override // defpackage.aq
    public final Object m() {
        return new wy2(this.l, this.m, this.g, this.n, this.o, this.j, this.h, this.i, this.k);
    }

    public /* synthetic */ d73(int i, int i2, long j, long j2, long j3, p63 p63Var, e73 e73Var, List list, boolean z) {
        this(j, j2, j3, e73Var, list, p63Var, z, i, i2, 0L, 0L, 1000000);
    }
}
