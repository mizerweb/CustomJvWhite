package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class be {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final dq4 g;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final mjg i;
    public final mjg j;
    public final r8e k;
    public final pzf l;
    public final q8e m;

    public be(xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
        this.g = cqk.a(((n0c) xhhVar).b());
        r66 r66Var = r66.a;
        this.i = p90.a(r66Var);
        mjg mjgVarA = p90.a(r66Var);
        this.j = mjgVarA;
        this.k = new r8e(mjgVarA);
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.l = pzfVarB;
        this.m = new q8e(pzfVarB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(be beVar, nq4 nq4Var) {
        ae aeVar;
        Object obj;
        beVar.getClass();
        if (nq4Var instanceof ae) {
            aeVar = (ae) nq4Var;
            int i = aeVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeVar.g = i - Integer.MIN_VALUE;
            } else {
                aeVar = new ae(beVar, nq4Var);
            }
        } else {
            aeVar = new ae(beVar, nq4Var);
        }
        Object objH = aeVar.e;
        int i2 = aeVar.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objH);
            no4 no4Var = (no4) beVar.a.getValue();
            aeVar.g = 1;
            objH = no4Var.a.h();
            if (objH != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            ch3.d0(objH);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = aeVar.d;
            ch3.d0(objH);
        }
        qu6 qu6VarN0 = yhf.n0(new sw(1, (Iterable) obj), new vi2(8));
        vt4 context = aeVar.getContext();
        return new m2i(qu6VarN0, new zd(cqk.a(context), context, beVar, 0));
        mjg mjgVar = beVar.i;
        aeVar.d = objH;
        aeVar.g = 2;
        mjgVar.setValue((List) objH);
        if (sbi.a != hu4Var) {
            obj = objH;
            qu6 qu6VarN1 = yhf.n0(new sw(1, (Iterable) obj), new vi2(8));
            vt4 context2 = aeVar.getContext();
            return new m2i(qu6VarN1, new zd(cqk.a(context2), context2, beVar, 0));
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        if (r11.l.emit(r12, r0) == r5) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r12, defpackage.nq4 r13) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be.b(java.lang.String, nq4):java.lang.Object");
    }

    public final oc c(vg4 vg4Var) {
        ynh tnhVar;
        String string;
        Uri uri;
        ny8 ny8Var = this.d;
        boolean zD = jcd.d((jcd) ny8Var.getValue(), vg4Var, null, 2);
        String string2 = zD ? ((jcd) ny8Var.getValue()).a().toString() : vg4Var.A(((s7f) ((et3) this.c.getValue())).k());
        if (zD) {
            tnhVar = new tnh(jcd.b((jcd) ny8Var.getValue(), null, 1));
        } else if (vg4Var.E() && vg4Var.H()) {
            tnhVar = new tnh(R.string.service_notifications);
        } else {
            tnhVar = vg4Var.E() ? new tnh(R.string.bot) : new xnh(((yfd) this.e.getValue()).y(vg4Var));
        }
        ynh ynhVar = tnhVar;
        long jV = vg4Var.v();
        String strK = vg4Var.k();
        if (strK == null) {
            ore.p("Required value was null.");
            return null;
        }
        if (string2 == null || (uri = Uri.parse(string2)) == null || (string = uri.toString()) == null) {
            string = Uri.EMPTY.toString();
        }
        return new oc(jV, strK, ynhVar, string, vg4Var.u(), vg4Var.G());
    }
}
