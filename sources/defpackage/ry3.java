package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class ry3 extends aq implements qih, btc {
    public static final String i = py3.class.getName();
    public final q24 f;
    public final long g;
    public final long h;

    public ry3(long j, long j2, long j3, q24 q24Var) {
        super(j);
        this.f = q24Var;
        this.g = j2;
        this.h = j3;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        bq bqVar = this.e;
        lq4 lq4Var = null;
        if (bqVar == null) {
            bqVar = null;
        }
        yab.i0(bqVar.l(), null, 0, new qy3(this, lq4Var, 0), 3);
    }

    @Override // defpackage.btc
    public final void d() {
        String str = i;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onMaxFailCount", null);
            }
        }
        bq bqVar = this.e;
        (bqVar != null ? bqVar : null).k().d(this.a);
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
        Tasks.CommentDeleteUser commentDeleteUser = new Tasks.CommentDeleteUser();
        commentDeleteUser.requestId = this.a;
        q24 q24Var = this.f;
        commentDeleteUser.chatServerId = q24Var.a;
        commentDeleteUser.userId = this.g;
        commentDeleteUser.postServerId = q24Var.b;
        commentDeleteUser.messageServerId = this.h;
        return sia.toByteArray(commentDeleteUser);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_COMMENT_DELETE_USER;
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
        long j = q24Var.a;
        long j2 = q24Var.b;
        h3b h3bVar = new h3b(kfc.X3, 2);
        h3bVar.f(j, ApiProtocol.PARAM_CHAT_ID);
        h3bVar.f(this.g, "userId");
        h3bVar.f(j2, "postId");
        h3bVar.f(this.h, "messageId");
        return h3bVar;
    }
}
