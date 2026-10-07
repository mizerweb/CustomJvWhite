package defpackage;

import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class my3 extends aq implements qih, btc {
    public static final /* synthetic */ int j = 0;
    public final q24 f;
    public final List g;
    public final List h;
    public final int i;

    public my3(long j2, q24 q24Var, List list, List list2, int i) {
        super(j2);
        this.f = q24Var;
        this.g = list;
        this.h = list2;
        this.i = i;
    }

    public static final Object w(my3 my3Var, List list, mdh mdhVar) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "my3", zo5.h(list.size(), "returnToActive, ids = "), null);
            }
        }
        bq bqVar = my3Var.e;
        Object objC = (bqVar != null ? bqVar : null).g().C(my3Var.f, list, wja.ACTIVE, false, mdhVar);
        return objC == hu4.a ? objC : sbi.a;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        i3b i3bVar = (i3b) kihVar;
        bq bqVar = this.e;
        lq4 lq4Var = null;
        if (bqVar == null) {
            bqVar = null;
        }
        yab.i0(bqVar.l(), null, 0, new jd3(this, i3bVar, lq4Var, 8), 3);
    }

    @Override // defpackage.btc
    public final void d() {
        gm0.n("my3", "onMaxFailCount");
        bq bqVar = this.e;
        lq4 lq4Var = null;
        if (bqVar == null) {
            bqVar = null;
        }
        bqVar.k().d(this.a);
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        yab.i0(bqVar2.l(), null, 0, new m5(this, lq4Var, 29), 3);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        if (p90.C(yhhVar.b)) {
            return;
        }
        d();
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        bqVar.b().c(new yq0(this.a, yhhVar));
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.CommentDelete commentDelete = new Tasks.CommentDelete();
        commentDelete.requestId = this.a;
        q24 q24Var = this.f;
        commentDelete.parentChatServerId = q24Var.a;
        commentDelete.parentMessageServerId = q24Var.b;
        commentDelete.messagesId = p90.i(this.g);
        commentDelete.messagesServerId = p90.i(this.h);
        int i = this.i;
        if (i != 0) {
            commentDelete.complaint = tt2.b(i);
        }
        return sia.toByteArray(commentDelete);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_COMMENT_DELETE;
    }

    @Override // defpackage.btc
    public final atc j() {
        return atc.a;
    }

    @Override // defpackage.btc
    public final int l() {
        return 5;
    }

    @Override // defpackage.aq
    public final Object m() {
        q24 q24Var = this.f;
        long j2 = q24Var.a;
        long j3 = q24Var.b;
        return new h3b(j2, this.h, this.i, false, null, new Long(j3), 16);
    }
}
