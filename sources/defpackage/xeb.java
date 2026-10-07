package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class xeb extends a8j {
    public final /* synthetic */ qdb c;
    public final boolean d;
    public final vff e;
    public volatile udb f;
    public final mjg g;
    public volatile int h;
    public final ic6 i;
    public final lzf j;
    public final zoh k;
    public final r8e l;
    public final pzf m;
    public final q8e n;
    public final r07 o;
    public final mjg p;
    public final hz1 q;

    public xeb(Long l, xge xgeVar, ifh ifhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15) {
        x1d x1dVar;
        int i;
        int i2;
        vff dheVar;
        int i3;
        xx6 xx6VarM0;
        qdb qdbVar = new qdb(ny8Var5, ny8Var3, ny8Var6, ny8Var7, ny8Var8, ny8Var10, ny8Var14, ny8Var15);
        this.c = qdbVar;
        int i4 = 1;
        boolean z = xgeVar != null;
        this.d = z;
        x1d x1dVar2 = x1d.a;
        if (xgeVar != null) {
            i = 2;
            x1dVar = x1dVar2;
            i2 = 3;
            dheVar = new dhe(xgeVar, this.b, new teb(this, 0), ny8Var2, ny8Var4, ny8Var, ny8Var3, ny8Var9, ny8Var12, ny8Var13);
        } else {
            x1dVar = x1dVar2;
            i = 2;
            if (l == null) {
                ore.k("Pass registrationData or contactId to work with NeuroAvatarsDelegate");
                throw null;
            }
            long jLongValue = l.longValue();
            dq4 dq4Var = this.b;
            teb tebVar = new teb(this, 1);
            no4 no4Var = (no4) ny8Var11.getValue();
            yfj yfjVar = new yfj();
            yfjVar.a = tebVar;
            yfjVar.e = ny8Var9;
            pzf pzfVarA = e9i.a(1, 1, 2);
            yfjVar.b = pzfVarA;
            yfjVar.c = new q8e(pzfVarA);
            mjg mjgVarA = p90.a(x1dVar);
            yfjVar.d = mjgVarA;
            yfjVar.f = new r8e(mjgVarA);
            i2 = 3;
            e9i.j0(new fz6(no4Var.j(jLongValue), new dtd(yfjVar, (lq4) null, i4), i2), dq4Var);
            dheVar = yfjVar;
        }
        this.e = dheVar;
        xc3 xc3Var = new xc3(qdbVar.m, 19);
        mjg mjgVarA2 = p90.a(r66.a);
        this.g = mjgVarA2;
        this.i = new ic6(null);
        pd4 pd4Var = dheVar instanceof pd4 ? (pd4) dheVar : null;
        this.j = pd4Var != null ? pd4Var.q() : null;
        this.k = dheVar.a();
        int i5 = 4;
        int i6 = 6;
        int i7 = 5;
        if (z) {
            lq4 lq4Var = null;
            fz6 fz6Var = new fz6(dheVar.f(), new dk3(i, lq4Var, i7));
            fz6 fz6Var2 = new fz6(xc3Var, new dk3(i, lq4Var, i6));
            vqa vqaVar = new vqa(i2, lq4Var, i5);
            i3 = 0;
            xx6VarM0 = new r07(fz6Var, fz6Var2, vqaVar, i3);
        } else {
            i3 = 0;
            xx6[] xx6VarArr = new xx6[i];
            xx6VarArr[0] = dheVar.f();
            xx6VarArr[1] = xc3Var;
            xx6VarM0 = e9i.m0(xx6VarArr);
        }
        lq4 lq4Var2 = null;
        this.l = e9i.G0(new fz6(e9i.I(new r07(xx6VarM0, dheVar.d(), new vqa(i2, lq4Var2, i7), i3)), new ueb(this, lq4Var2, i4), i2), this.b, j0g.a, new fef(null, x1dVar));
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 4);
        this.m = pzfVarB;
        this.n = new q8e(pzfVarB);
        pzf pzfVarA2 = e9i.a(1, 1, i);
        this.o = new r07(new r8e(mjgVarA2), pzfVarA2, new ph9(i2, null, i), 0);
        mjg mjgVarA3 = p90.a(s66.a);
        this.p = mjgVarA3;
        int i8 = 10;
        this.q = new hz1(new r8e(mjgVarA3), i8);
        ArrayList arrayList = new ArrayList(16);
        for (int i9 = 0; i9 < 16; i9++) {
            arrayList.add(new qeb());
        }
        pzfVarA2.a(arrayList);
        deb debVar = (deb) ifhVar.getValue();
        debVar.getClass();
        lq4 lq4Var3 = null;
        e9i.j0(e9i.T(new fz6(e9i.T(new bye(new awa(debVar, lq4Var3, i6)), ((n0c) ((xhh) debVar.c.getValue())).b()), new ueb(this, lq4Var3, 0), i2), ((n0c) ((xhh) ny8Var3.getValue())).b()), this.b);
        if (this.d) {
            e9i.j0(new fz6(this.c.m, new c37(this, null, i8), i2), this.b);
        }
    }

    public final void B() {
        boolean z = this.d;
        qdb qdbVar = this.c;
        if (!z) {
            H(null);
            qdbVar.l.setValue(null);
        } else if (((fef) this.l.a.getValue()).a instanceof cef) {
            H(null);
        } else {
            qdbVar.l.setValue(null);
        }
    }

    public final void C(Uri uri) {
        qdb qdbVar = this.c;
        yab.i0(this.b, ((n0c) ((xhh) qdbVar.i.getValue())).b(), 0, new fb8(qdbVar, uri, null), 2);
    }

    public final List D() {
        c79 c79VarW = yab.w();
        int i = 3;
        int i2 = 56;
        c79VarW.add(new kc4(R.id.oneme_login_neuro_avatars_load_from_gallery_action, new tnh(R.string.oneme_login_neuro_avatars_load_from_gallery_action), i, i2));
        c79VarW.add(new kc4(R.id.oneme_login_neuro_avatars_take_photo_action, new tnh(R.string.oneme_login_neuro_avatars_take_photo_action), i, i2));
        if (((fef) this.l.a.getValue()).a != null) {
            c79VarW.add(new kc4(R.id.oneme_login_neuro_avatars_remove_photo_action, new tnh(R.string.oneme_login_neuro_avatars_remove_photo_action), 1, i2));
        }
        c79VarW.add(new kc4(R.id.oneme_login_neuro_avatars_cancel_action, new tnh(R.string.oneme_login_neuro_avatars_cancel_button), 2, i2));
        return yab.j(c79VarW);
    }

    public final boolean E() {
        r8e r8eVar = this.l;
        eef eefVar = ((fef) r8eVar.a.getValue()).a;
        a2d a2dVar = ((fef) r8eVar.a.getValue()).b;
        cef cefVar = eefVar instanceof cef ? (cef) eefVar : null;
        Long lValueOf = cefVar != null ? Long.valueOf(cefVar.c) : null;
        y1d y1dVar = a2dVar instanceof y1d ? (y1d) a2dVar : null;
        boolean zD = cqk.d(lValueOf, y1dVar != null ? Long.valueOf(y1dVar.b) : null);
        def defVar = eefVar instanceof def ? (def) eefVar : null;
        String str = defVar != null ? defVar.a : null;
        z1d z1dVar = a2dVar instanceof z1d ? (z1d) a2dVar : null;
        boolean zD2 = cqk.d(str, z1dVar != null ? z1dVar.a : null);
        if (eefVar != null) {
            return (zD2 && zD) ? false : true;
        }
        return false;
    }

    public final void F() {
        this.e.c(((fef) this.l.a.getValue()).a);
    }

    public final void G() {
        int i;
        udb udbVar = this.f;
        if (udbVar != null) {
            int i2 = udbVar.c;
            udb udbVar2 = this.f;
            if (udbVar2 != null) {
                long j = udbVar2.a;
                Iterator it = ((Map) this.p.getValue()).keySet().iterator();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    Object next = it.next();
                    if (i4 < 0) {
                        xw3.V0();
                        throw null;
                    }
                    if (((Number) next).intValue() == i2) {
                        break;
                    } else {
                        i4++;
                    }
                }
                Iterator it2 = ((List) this.g.getValue()).iterator();
                while (it2.hasNext()) {
                    if (((udb) it2.next()).a == j) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
                Integer numValueOf = Integer.valueOf(i);
                this.h = i4;
                this.m.a(new zdb(i4, numValueOf));
            }
        }
    }

    public final void H(udb udbVar) {
        udb udbVarC = udbVar != null ? udb.C(udbVar, true) : null;
        this.e.b(udbVarC != null ? new cef(udbVarC.b, udbVarC.a, udbVarC.c) : null);
    }

    public final void I(int i) {
        if (i == this.h) {
            return;
        }
        int iIntValue = ((Number) ww3.n1(((Map) this.p.getValue()).keySet(), i)).intValue();
        Iterator it = ((List) this.g.getValue()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((udb) it.next()).c == iIntValue) {
                Integer numValueOf = Integer.valueOf(i2);
                this.h = i;
                this.m.a(new zdb(i, numValueOf));
            }
            i2++;
        }
        i2 = -1;
        Integer numValueOf2 = Integer.valueOf(i2);
        this.h = i;
        this.m.a(new zdb(i, numValueOf2));
    }

    public final void J() {
        qdb qdbVar = this.c;
        if (!((wsc) qdbVar.a.getValue()).c(wsc.n)) {
            qdbVar.j.a(ek0.a);
            return;
        }
        yab.i0(this.b, ((n0c) ((xhh) qdbVar.i.getValue())).b(), 0, new wz6(qdbVar, null, 24), 2);
    }
}
