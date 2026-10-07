package defpackage;

import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class bi3 extends aq implements qih, btc {
    public final long f;
    public final int g;
    public final long h;

    public bi3(int i, long j, long j2, long j3) {
        super(j);
        this.f = j2;
        this.g = i;
        this.h = j3;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) throws Throwable {
        ii3 ii3Var = (ii3) kihVar;
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "ChatsListApiTask", "onSuccess " + ii3Var, null);
        }
        try {
            s().m(ii3Var.c);
        } catch (TamErrorException unused) {
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "ChatsListApiTask", "chats.storeChatsFromServer", null);
        }
        p().j(ii3Var.c, null, false, ii3Var.d == 0);
        bq bqVar = this.e;
        s7f s7fVar = (s7f) (bqVar != null ? bqVar : null).e();
        s7fVar.N.B(s7fVar, s7f.j0[36], Long.valueOf(ii3Var.d));
        if (ii3Var.d > 0) {
            pvb pvbVarN = n();
            pvb.t(pvbVarN, new bi3(t().b.b().a(), pvbVarN.u().a.g(), ii3Var.d, this.h));
        }
    }

    @Override // defpackage.btc
    public final void d() {
        v().d(this.a);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        if ("client.task.ignored".equals(yhhVar.b)) {
            d();
        }
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.ChatsList chatsList = new Tasks.ChatsList();
        chatsList.requestId = this.a;
        chatsList.marker = this.f;
        chatsList.count = this.g;
        chatsList.chatsSync = this.h;
        return sia.toByteArray(chatsList);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHATS_LIST;
    }

    @Override // defpackage.btc
    public final atc j() {
        return atc.a;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        wy2 wy2Var = new wy2((kfc) null, 16);
        wy2Var.f(this.f, "marker");
        wy2Var.c(this.g, "count");
        return wy2Var;
    }

    @Override // defpackage.aq
    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "ChatsListApiTask(id = ", ", marker=");
        c0a.w(sbS, this.f, ", count=", this.g);
        return zo5.k(this.h, ", chatsSync=", ")", sbS);
    }
}
