package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class q04 extends a8j {
    public final long c;
    public final baa d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final CopyOnWriteArraySet k;
    public final mjg l;
    public final mjg m;
    public final r8e n;
    public final xx6 o;
    public final ic6 p;

    public q04(long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        this.c = j;
        baa baaVarA = ((caa) ny8Var.getValue()).a(j, p63.COMMENTS_BLACKLIST, Integer.MAX_VALUE);
        this.d = baaVarA;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
        this.i = ny8Var8;
        this.j = ny8Var3;
        this.k = new CopyOnWriteArraySet();
        this.l = p90.a(Boolean.FALSE);
        mjg mjgVarA = p90.a(new l04(new tnh(R.string.discussions_black_list_screen_title), new rnh(R.plurals.discussions_black_list_toolbar_subtitle, 0, a.n1(new Object[]{0})), 0));
        this.m = mjgVarA;
        this.n = new r8e(mjgVarA);
        xx6 xx6VarT = e9i.T(new jz(((xn3) ny8Var2.getValue()).k(j), 13), ((n0c) ((xhh) ny8Var4.getValue())).b());
        dq4 dq4Var = this.b;
        a8g a8gVar = j0g.a;
        q8e q8eVarE0 = e9i.E0(xx6VarT, dq4Var, a8gVar, 1);
        q8e q8eVar = new q8e(((z8a) ny8Var8.getValue()).a);
        d3 d3Var = new d3(this, null, 10);
        c76 c76Var = c76.a;
        this.o = e9i.I(e9i.T(e9i.C(e9i.T(e9i.M0(new ie(baaVarA.b(), this, 28), new rgi((lq4) null, this, 2)), ((n0c) ((xhh) ny8Var4.getValue())).a()), baaVarA.c(), e9i.G0(e9i.T(new l7(c76Var, q8eVar, d3Var, 5), ((n0c) ((xhh) ny8Var4.getValue())).b()), this.b, a8gVar, c76Var), new jn1(this, null, 1)), ((n0c) ((xhh) ny8Var4.getValue())).a()));
        this.p = new ic6(null);
        e9i.j0(e9i.T(new fz6(baaVarA.c(), new ke3(this, (lq4) null, 6), 3), ((n0c) ((xhh) ny8Var4.getValue())).b()), this.b);
        e9i.j0(new fz6(e9i.I(new ua1(q8eVarE0, 2)), new qy3(this, null, 2), 3), this.b);
    }

    public final ynh B(long j, long j2, String str) {
        if (j2 > 0 && str != null) {
            return new vnh(R.string.discussions_black_list_blocked_by, a.n1(new Object[]{str}));
        }
        if (j <= 0) {
            return new tnh(R.string.discussions_black_list_blocked_subtitle_stub);
        }
        long jF = ((s7f) ((et3) this.f.getValue())).f();
        if (oc9.S(y35.n(jF, TimeZone.getDefault()), y35.n(j, TimeZone.getDefault()))) {
            return new tnh(R.string.discussions_black_list_blocked_subtitle_today);
        }
        return oc9.J(j, jF).a == 4 ? new tnh(R.string.discussions_black_list_blocked_subtitle_yesterday) : new vnh(R.string.discussions_black_list_blocked_subtitle_date, a.n1(new Object[]{((p4c) this.g.getValue()).d(j)}));
    }

    public final e04 C(n63 n63Var) {
        vg4 vg4Var = n63Var.a;
        String strE = E(n63Var.d);
        long jV = vg4Var.v();
        String strK = vg4Var.k();
        String str = strK == null ? "" : strK;
        String strZ = vg4Var.z(us0.a);
        Uri uriK = strZ != null ? sb8.K(strZ) : null;
        CharSequence charSequenceU = vg4Var.u();
        if (charSequenceU == null) {
            charSequenceU = "";
        }
        return new e04(jV, str, uriK, charSequenceU, B(n63Var.c, n63Var.d, strE));
    }

    public final e04 D(vg4 vg4Var, LinkedHashMap linkedHashMap) {
        ylc ylcVar = (ylc) linkedHashMap.get(Long.valueOf(vg4Var.v()));
        long jLongValue = ylcVar != null ? ((Number) ylcVar.a).longValue() : 0L;
        long jLongValue2 = ylcVar != null ? ((Number) ylcVar.b).longValue() : 0L;
        String strE = E(jLongValue2);
        long jV = vg4Var.v();
        String strK = vg4Var.k();
        String str = strK == null ? "" : strK;
        String strZ = vg4Var.z(us0.a);
        Uri uriK = strZ != null ? sb8.K(strZ) : null;
        CharSequence charSequenceU = vg4Var.u();
        return new e04(jV, str, uriK, charSequenceU == null ? "" : charSequenceU, B(jLongValue, jLongValue2, strE));
    }

    public final String E(long j) {
        vg4 vg4Var;
        if (j == 0 || (vg4Var = (vg4) ((no4) this.j.getValue()).j(j).a.getValue()) == null) {
            return null;
        }
        return vg4Var.k();
    }

    @Override // defpackage.a8j
    public final void y() {
        this.d.cancel();
    }
}
