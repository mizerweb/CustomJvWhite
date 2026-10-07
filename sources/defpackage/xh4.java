package defpackage;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicLong;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xh4 extends wp2 {
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final xx6 m;
    public final pzf n;
    public final q8e o;
    public final AtomicLong p;

    public xh4(long j, dq4 dq4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        super(j, dq4Var, ny8Var7);
        this.j = ny8Var;
        this.k = ny8Var3;
        this.l = ny8Var4;
        this.m = e9i.T(new r07(new jz(this.c, 13), this.d, vh4.h, 0), ((n0c) ((xhh) ny8Var.getValue())).a());
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.n = pzfVarB;
        this.o = new q8e(pzfVarB);
        this.p = new AtomicLong();
        e9i.j0(e9i.T(new fz6(this.i, new fze(this, ny8Var7, (lq4) null, 23), 3), ((n0c) ((xhh) ny8Var.getValue())).a()), dq4Var);
        e9i.j0(e9i.T(new fz6(new o24(new bye(new jd3(new jz(((no4) ny8Var2.getValue()).j(j), 13), (lq4) null, this, 15)), 1, this), new w8(2, this, xh4.class, "emitState", "emitState(Lone/me/profileedit/screens/changelink/ChangeLink$State;)V", 4, 12), 3), ((n0c) ((xhh) ny8Var.getValue())).b()), dq4Var);
        e9i.j0(new fz6(new o24(((yp0) ny8Var6.getValue()).b, 2, this), new m20(2, this, xh4.class, "handleError", "handleError(Lone/me/profileedit/screens/changelink/ChangeLinkErrors;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14), 3), dq4Var);
        e9i.j0(new fz6(new q8e(((und) ny8Var5.getValue()).a), new qh4(this, (lq4) null, 0), 3), dq4Var);
    }

    public static final mq2 n(xh4 xh4Var, vg4 vg4Var) {
        Uri uri;
        String str = vg4Var.a.b.o;
        return new mq2((str == null || (uri = Uri.parse(str)) == null) ? null : uri.getLastPathSegment(), null, null, false);
    }

    @Override // defpackage.wp2
    public final void b() {
    }

    @Override // defpackage.wp2
    public final xx6 f() {
        return this.m;
    }

    @Override // defpackage.wp2
    public final Object k(fq2 fq2Var) {
        mq2 mq2Var = (mq2) this.i.getValue();
        if (mq2Var != null) {
            String str = mq2Var.a;
            boolean z = mq2Var.d;
            hu4 hu4Var = hu4.a;
            if (z) {
                Object objEmit = this.f.emit(new bmd(14, mq2Var.b, null), fq2Var);
                if (objEmit == hu4Var) {
                    return objEmit;
                }
            } else {
                String string = str != null ? r5h.y1(str).toString() : null;
                if (string == null || string.length() == 0) {
                    str = "$REMOVE$";
                }
                Object objK0 = yab.K0(((n0c) ((xhh) this.j.getValue())).b(), new ke3(this, str, null, 10), fq2Var);
                if (objK0 == hu4Var) {
                    return objK0;
                }
            }
        }
        return sbi.a;
    }

    @Override // defpackage.wp2
    public final void l(String str) {
        yab.i0(this.b, ((n0c) ((xhh) this.j.getValue())).c().S0(), 0, new wh4(this, str, null, 1), 2);
    }

    public final Object o(cq2 cq2Var, lq4 lq4Var) {
        boolean zD = cqk.d(cq2Var, zp2.a);
        hu4 hu4Var = hu4.a;
        pzf pzfVar = this.f;
        if (zD) {
            Object objEmit = pzfVar.emit(new bmd(new tnh(R.string.profile_edit_shortlink_create_link_error_title_no_connection), new tnh(R.string.profile_edit_shortlink_create_link_error_no_connection_description), true, new Integer(R.drawable.icon_warning)), lq4Var);
            if (objEmit == hu4Var) {
                return objEmit;
            }
        } else if (cqk.d(cq2Var, aq2.a)) {
            Object objEmit2 = pzfVar.emit(new bmd(new tnh(R.string.profile_edit_shortlink_create_link_error_title_service_unavailable), new tnh(R.string.profile_edit_shortlink_create_link_error_service_unavailable_description), true, new Integer(R.drawable.icon_warning)), lq4Var);
            if (objEmit2 == hu4Var) {
                return objEmit2;
            }
        } else if (cq2Var instanceof xp2) {
            Object objEmit3 = pzfVar.emit(new bmd(14, ((xp2) cq2Var).a, null), lq4Var);
            if (objEmit3 == hu4Var) {
                return objEmit3;
            }
        } else if (cq2Var instanceof bq2) {
            Object objEmit4 = pzfVar.emit(new bmd(14, ((bq2) cq2Var).a, null), lq4Var);
            if (objEmit4 == hu4Var) {
                return objEmit4;
            }
        } else {
            if (!(cq2Var instanceof yp2)) {
                ore.o();
                return null;
            }
            Object objEmit5 = pzfVar.emit(new bmd(14, new tnh(R.string.join_request_update_error), null), lq4Var);
            if (objEmit5 == hu4Var) {
                return objEmit5;
            }
        }
        return sbi.a;
    }
}
