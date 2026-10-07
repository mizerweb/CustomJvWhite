package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class x67 extends a8j {
    public final xhh c;
    public final r2c d;
    public final se4 e;
    public final l3c f;
    public final gue g;
    public final f27 h;
    public final a47 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final mjg m;
    public final r8e n;
    public final mjg o;
    public final r8e p;
    public final ic6 q;
    public final r8e r;
    public boolean s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, lwd] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.CharSequence] */
    public x67(ny8 ny8Var, ny8 ny8Var2, q2c q2cVar, qf8 qf8Var, ny8 ny8Var3, xhh xhhVar, r2c r2cVar, se4 se4Var, l3c l3cVar, gue gueVar, f27 f27Var, a47 a47Var) {
        this.c = xhhVar;
        this.d = r2cVar;
        this.e = se4Var;
        this.f = l3cVar;
        this.g = gueVar;
        this.h = f27Var;
        this.i = a47Var;
        this.j = ny8Var3;
        this.k = ny8Var;
        this.l = ny8Var2;
        c79 c79VarW = yab.w();
        List<hza> list = (List) ((iza) l3cVar.c.getValue()).b.get();
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        boolean z = false;
        for (hza hzaVar : list) {
            z = cqk.d(hzaVar.a, "all.chat.folder") ? true : z;
            String str = hzaVar.a;
            ?? r6 = (lwd) this.f.a.getValue();
            r6.getClass();
            ?? A = hzaVar.b;
            sia[] siaVarArr = hzaVar.e;
            if (siaVarArr != null && siaVarArr.length != 0) {
                A = r6.a(A, (ag8[]) siaVarArr);
            }
            arrayList.add(new q37(str, A, null, hzaVar.c, hzaVar.d));
        }
        c79VarW.addAll(arrayList);
        if (!z) {
            c79VarW.add(0, new q37("all.chat.folder", this.d.a.getString(R.string.folder_all), null, ou4.b, EnumSet.allOf(s37.class)));
        }
        mjg mjgVarA = p90.a(yab.j(c79VarW));
        this.m = mjgVarA;
        this.n = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(0);
        this.o = mjgVarA2;
        this.p = new r8e(mjgVarA2);
        this.q = new ic6(null);
        sy4 sy4Var = (sy4) this.k.getValue();
        sy4Var.getClass();
        r07 r07Var = new r07(new jz(sy4Var.n, 14), new jz(q2cVar.e, 15), new q67(this, null, 0), 0);
        ghb ghbVar = ew5.b;
        lw5 lw5Var = lw5.SECONDS;
        e9i.j0(e9i.T(new fz6(e9i.T(new j3(e9i.T(tre.G0(r07Var, qe7.O(2, lw5Var)), ((n0c) this.c).a()), 21, this), (xt4) qf8Var.b.getValue()), new gz(this, null, 9), 3), ((n0c) this.c).b()), this.b);
        long jG = ew5.g(qe7.O(2, lw5Var));
        vfe vfeVar = new vfe();
        vfeVar.a = System.currentTimeMillis();
        this.r = e9i.G0(e9i.I(e9i.k0(e9i.I(tre.G0(new r07(e9i.o(new l83(this, vfeVar, null, 7)), new j3(new r8e(this.e.a), 20, this), new no3(3, null, 1), 0), qe7.O(500, lw5.MILLISECONDS))), new xfg(vfeVar, jG, (lq4) null, 2))), this.b, j0g.b, du7.c);
    }

    public final void B(String str) {
        if (str == null) {
            gm0.Y(x67.class.getName(), "Early return in setSelectedPositionById cuz of folderId == null");
            return;
        }
        Iterator it = ((List) this.m.getValue()).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (cqk.d(((q37) it.next()).a, str)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            Integer numValueOf = Integer.valueOf(i);
            mjg mjgVar = this.o;
            mjgVar.getClass();
            mjgVar.j(null, numValueOf);
        }
    }
}
