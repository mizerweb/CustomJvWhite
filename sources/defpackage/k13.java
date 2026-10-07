package defpackage;

import java.util.Iterator;
import java.util.List;
import one.me.mods.Mods;
import one.me.sdk.tasks.chat.InvalidChatMarkException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class k13 extends aq implements qih, btc {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;

    public k13(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        super(j);
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = k13.class.getName();
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return true;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        l13 l13Var = (l13) kihVar;
        bq bqVar = this.e;
        lq4 lq4Var = null;
        if (bqVar == null) {
            bqVar = null;
        }
        wmi wmiVarL = bqVar.l();
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        yab.i0(wmiVarL, ((n0c) bqVar2.h()).a(), 0, new qt1(this, l13Var, lq4Var, 28), 2);
    }

    @Override // defpackage.btc
    public final void d() {
        v().d(this.a);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        bq bqVar = this.e;
        lq4 lq4Var = null;
        if (bqVar == null) {
            bqVar = null;
        }
        yab.i0(bqVar.l(), null, 0, new qt1(this, yhhVar, lq4Var, 27), 3);
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.ChatMark chatMark = new Tasks.ChatMark();
        chatMark.requestId = this.a;
        chatMark.chatId = 0L;
        chatMark.chatServerId = this.f;
        chatMark.mark = this.g;
        chatMark.messageId = this.h;
        chatMark.setAsUnread = this.i;
        chatMark.awaitChatInCache = this.j;
        chatMark.isReadReaction = this.k;
        return sia.toByteArray(chatMark);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHAT_MARK;
    }

    @Override // defpackage.qih
    public final Object i(yhh yhhVar, nq4 nq4Var) {
        if (!p90.C(yhhVar.b)) {
            d();
        }
        return sbi.a;
    }

    @Override // defpackage.btc
    public final atc j() {
        long j;
        sfa sfaVarF;
        if (Mods.get("noread")) {
            return atc.c;
        }
        qw2 qw2VarP = p();
        long j2 = this.f;
        rt2 rt2VarK = qw2VarP.K(j2);
        String str = this.l;
        atc atcVar = atc.c;
        if (rt2VarK == null) {
            if (this.j) {
                gm0.m(str, "onPreExecute: awaiting chatServerId=%d in cache", Long.valueOf(j2));
                return atc.b;
            }
            gm0.s(str, "onPreExecute: no chat by chatServerId=%d in cache", Long.valueOf(j2));
            return atcVar;
        }
        if (!rt2VarK.C0()) {
            gm0.s(str, "onPreExecute: not participant of chat chatServerId=%d", Long.valueOf(j2));
            return atcVar;
        }
        long j3 = this.g;
        boolean z = this.i;
        if (z) {
            long j4 = this.h;
            if (j4 <= 0 || (sfaVarF = r().f(rt2VarK.a, j4)) == null) {
                j = 0;
            } else {
                if (sfaVarF.j == wja.DELETED) {
                    gm0.n(str, "onPreExecute: message deleted, remove task");
                    return atcVar;
                }
                j = sfaVarF.c;
            }
            if (j == 0) {
                j = j3;
            }
            bq bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            i8e i8eVar = (i8e) bqVar.O.getValue();
            i8eVar.getClass();
            if (j <= 0 || System.currentTimeMillis() - j >= ((Number) ((zed) i8eVar.d.getValue()).b.b().a.i.a(e5d.S6[0]).i()).longValue() * 1000) {
                gm0.n(str, "onPreExecute: timeout expired, remove task");
                return atcVar;
            }
        }
        List listH = v().h(this.a, ctc.TYPE_CHAT_MARK);
        if (z) {
            Iterator it = listH.iterator();
            while (it.hasNext()) {
                k13 k13Var = (k13) ((tjh) it.next()).f;
                if (k13Var.f == j2 && k13Var.i) {
                    return atcVar;
                }
            }
            return atc.a;
        }
        Iterator it2 = listH.iterator();
        while (it2.hasNext()) {
            k13 k13Var2 = (k13) ((tjh) it2.next()).f;
            if (k13Var2.f == j2 && !k13Var2.i && k13Var2.g > j3) {
                return atcVar;
            }
        }
        return atc.a;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        String str;
        wy2 wy2Var = new wy2(kfc.y1, 6);
        wy2Var.f(this.f, ApiProtocol.PARAM_CHAT_ID);
        wy2Var.f(this.g, "mark");
        long j = this.h;
        if (j != -1) {
            wy2Var.f(j, "messageId");
        }
        if (this.i) {
            str = "SET_AS_UNREAD";
        } else {
            str = this.k ? "READ_REACTION" : "READ_MESSAGE";
        }
        wy2Var.h("type", str);
        return wy2Var;
    }

    @Override // defpackage.qih
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final Object k(l13 l13Var, nq4 nq4Var) {
        sbi sbiVar = sbi.a;
        rt2 rt2VarK = p().K(this.f);
        if (l13Var.e != null) {
            String str = this.l;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "reaction read result " + l13Var.e + "!", null);
                }
            }
        }
        if (this.k && l13Var.e == null) {
            gm0.Y(this.l, "invalid response for isReadReaction=true: " + l13Var);
            bq bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            ((t1c) ((ed6) bqVar.v.getValue())).a(new InvalidChatMarkException("READ_REACTION but success is missed"));
        }
        if (!this.k) {
            long j = l13Var.c;
            if (j < 0) {
                gm0.Y(this.l, "response.mark is negative " + l13Var);
                bq bqVar2 = this.e;
                if (bqVar2 == null) {
                    bqVar2 = null;
                }
                ed6 ed6Var = (ed6) bqVar2.v.getValue();
                long j2 = this.f;
                long j3 = this.g;
                StringBuilder sbS = qt4.s(j2, "mark is negative chat_id=", ",orig=");
                sbS.append(j3);
                ((t1c) ed6Var).a(new InvalidChatMarkException(qt4.k(j, ",mark=", sbS)));
                j = this.g;
            }
            long j4 = j;
            if (j4 < this.g && !this.i) {
                gm0.n(this.l, "onSuccess, received read mark less than our read mark");
                return sbiVar;
            }
            if (rt2VarK != null) {
                bq bqVar3 = this.e;
                if (bqVar3 == null) {
                    bqVar3 = null;
                }
                lei leiVar = (lei) bqVar3.d0.getValue();
                long j5 = rt2VarK.a;
                bq bqVar4 = this.e;
                Comparable comparableA = leiVar.a(j5, ((zed) (bqVar4 != null ? bqVar4 : null).c.getValue()).a.t(), j4, l13Var.d, true, this.i, nq4Var);
                if (comparableA == hu4.a) {
                    return comparableA;
                }
            }
        }
        return sbiVar;
    }
}
