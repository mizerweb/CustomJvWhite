package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class ty3 extends aq implements qih, btc {
    public static final /* synthetic */ int l = 0;
    public final q24 f;
    public final long g;
    public final String h;
    public final String i;
    public final wja j;
    public final List k;

    public ty3(long j, q24 q24Var, long j2, String str, String str2, wja wjaVar, List list) {
        super(j);
        this.f = q24Var;
        this.g = j2;
        this.h = str;
        this.i = str2;
        this.j = wjaVar;
        this.k = list;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        p3b p3bVar = (p3b) kihVar;
        bq bqVar = this.e;
        lq4 lq4Var = null;
        if (bqVar == null) {
            bqVar = null;
        }
        yab.i0(bqVar.l(), null, 0, new jd3(this, p3bVar, lq4Var, 9), 3);
    }

    @Override // defpackage.btc
    public final void d() {
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
        yab.i0(bqVar2.l(), null, 0, new qy3(this, lq4Var, 1), 3);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        bq bqVar = this.e;
        lq4 lq4Var = null;
        if (bqVar == null) {
            bqVar = null;
        }
        yab.i0(bqVar.l(), null, 0, new k23(this, yhhVar, lq4Var, 21), 3);
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.CommentEdit commentEdit = new Tasks.CommentEdit();
        commentEdit.requestId = this.a;
        q24 q24Var = this.f;
        commentEdit.parentChatServerId = q24Var.a;
        commentEdit.parentMessageServerId = q24Var.b;
        commentEdit.commentId = this.g;
        String str = this.h;
        commentEdit.isTextNull = str == null;
        if (str != null) {
            commentEdit.text = str;
        }
        String str2 = this.i;
        commentEdit.isOldTextNull = str2 == null;
        if (str2 != null) {
            commentEdit.oldText = str2;
        }
        commentEdit.oldStatus = this.j.a;
        List list = this.k;
        if (list != null) {
            commentEdit.oldElements = dga.c(list);
        }
        return sia.toByteArray(commentEdit);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_COMMENT_EDIT;
    }

    @Override // defpackage.btc
    public final atc j() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        l34 l34VarG = bqVar.g();
        long j = this.g;
        ky3 ky3VarS = l34VarG.s(j);
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        pq3 pq3Var = bqVar2.d().c;
        q24 q24Var = this.f;
        s04 s04Var = (s04) ((r8e) pq3Var.i(q24Var)).a.getValue();
        bq bqVar3 = this.e;
        Iterator it = (bqVar3 != null ? bqVar3 : null).k().h(this.a, ctc.TYPE_COMMENT_EDIT).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            atc atcVar = atc.c;
            if (!zHasNext) {
                if (ky3VarS == null || ky3VarS.j == wja.DELETED || s04Var == null) {
                    gm0.n("ty3", "onPreExecute: comment or chat not found, REMOVE");
                    return atcVar;
                }
                if (ky3VarS.b != 0) {
                    return atc.a;
                }
                gm0.n("ty3", "onPreExecute: comment serverId == 0, REMOVE");
                return atcVar;
            }
            ty3 ty3Var = (ty3) ((tjh) it.next()).f;
            if (cqk.d(ty3Var.f, q24Var) && ty3Var.g == j) {
                gm0.n("ty3", "onPreExecute: later edit task found, REMOVE");
                return atcVar;
            }
        }
    }

    @Override // defpackage.btc
    public final int l() {
        return 5;
    }

    @Override // defpackage.aq
    public final Object m() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        pq3 pq3Var = bqVar.d().c;
        q24 q24Var = this.f;
        s04 s04Var = (s04) ((r8e) pq3Var.i(q24Var)).a.getValue();
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        ky3 ky3VarS = bqVar2.g().s(this.g);
        if (s04Var == null || ky3VarS == null) {
            return null;
        }
        List list = ky3VarS.D;
        ArrayList arrayListS = list != null ? pm9.s(list) : null;
        return new h3b(q24Var.a, ky3VarS.b, this.h, (b50) null, arrayListS, (ng5) null, new Long(q24Var.b), 40);
    }
}
