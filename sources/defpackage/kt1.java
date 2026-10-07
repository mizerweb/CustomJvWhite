package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kt1 extends a8j implements f22 {
    public final xhh c;
    public final u42 d;
    public final w82 e;
    public final xc f;
    public final b95 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m = rx8.P(3, new br1(6));
    public String n = "";
    public final mjg o;
    public final mjg p;
    public final s32 q;
    public final mjg r;
    public final r8e s;
    public final ic6 t;

    public kt1(xhh xhhVar, ny8 ny8Var, u42 u42Var, w82 w82Var, xc xcVar, ny8 ny8Var2, b95 b95Var, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.c = xhhVar;
        this.d = u42Var;
        this.e = w82Var;
        this.f = xcVar;
        this.g = b95Var;
        this.h = ny8Var3;
        this.i = ny8Var;
        this.j = ny8Var4;
        this.k = ny8Var2;
        this.l = ny8Var5;
        mjg mjgVarA = p90.a(st1.g);
        this.o = mjgVarA;
        this.p = mjgVarA;
        this.q = new s32();
        mjg mjgVarA2 = p90.a(bd.c);
        this.r = mjgVarA2;
        this.s = new r8e(mjgVarA2);
        this.t = new ic6(null);
        n0c n0cVar = (n0c) xhhVar;
        e9i.j0(e9i.T(new fz6(((ya1) ((da1) ny8Var4.getValue())).j, new gt1(this, null, 0), 3), n0cVar.a()), this.b);
        yab.i0(this.b, n0cVar.f(), 0, new m5(this, null, 13), 2);
        e9i.j0(new fz6(u42Var.g, new gt1(this, null, 1), 3), this.b);
        r8e r8eVar = w82Var.r;
        e9i.j0(new fz6(e9i.I(new p5(r8eVar, 14)), new gt1(this, null, 2), 3), this.b);
        e9i.j0(new r07(w82Var.s, new ie(r8eVar, this, 7), new d3(this, null, 5), 0), this.b);
        e9i.j0(e9i.T(new fz6(((ya1) ((da1) ny8Var4.getValue())).v, new wo0(this, !((be1) C().b().getValue()).h, (lq4) null, 2), 3), n0cVar.a()), this.b);
        e9i.j0(new fz6(((ya1) w82Var.h).t, new gt1(this, null, 3), 3), this.b);
        b95Var.c(this);
    }

    public static final void B(kt1 kt1Var, c79 c79Var, Map map) {
        Object value;
        st1 st1Var;
        ArrayList arrayList;
        int i;
        mjg mjgVar = kt1Var.o;
        do {
            value = mjgVar.getValue();
            st1Var = (st1) value;
            arrayList = new ArrayList(yw3.W0(c79Var, 10));
            Iterator<E> it = c79Var.iterator();
            while (it.hasNext()) {
                tmc tmcVar = (tmc) it.next();
                boolean z = c79Var.getSize() > 1;
                hu1 hu1Var = tmcVar.a;
                fu1 id = hu1Var.getId();
                q42 q42Var = tmcVar.b;
                String strA = q42Var.a();
                if (strA == null) {
                    strA = "";
                }
                String str = strA;
                CharSequence name = q42Var.getName();
                boolean zJ = hu1Var.j();
                boolean zL = hu1Var.l();
                boolean z2 = !hu1Var.l() || (hu1Var.l() && (z || hu1Var.f()));
                boolean zF = hu1Var.f();
                Long l = (Long) map.get(hu1Var.getId());
                long jLongValue = l != null ? l.longValue() : -1L;
                boolean zM = hu1Var.m();
                p32 p32Var = (p32) kt1Var.h.getValue();
                if (hu1Var.j() && hu1Var.l()) {
                    i = R.string.call_users_info_me_admin;
                } else if (hu1Var.j()) {
                    i = R.string.call_users_info_admin;
                } else {
                    i = hu1Var.l() ? R.string.call_users_info_me : R.string.call_users_info_participant;
                }
                boolean zM2 = hu1Var.m();
                Context context = p32Var.a;
                String string = context.getString(i);
                if (zM2) {
                    string = zo5.p(string, " ", context.getString(R.string.call_user_on_hold_suffix));
                }
                arrayList.add(new ys1(id, name, str, zL, z2, zJ, zF, jLongValue, zM, string, q42Var.b()));
            }
        } while (!mjgVar.h(value, st1.a(st1Var, ww3.M1(arrayList, (Comparator) kt1Var.m.getValue()), null, null, false, null, false, 62)));
    }

    public final x02 C() {
        return (x02) this.g.i.a.getValue();
    }

    @Override // defpackage.f22
    public final void m(String str) {
        a8j.x(this.t, ux1.F);
    }
}
