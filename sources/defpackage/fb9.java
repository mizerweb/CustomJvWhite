package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fb9 implements lc7 {
    public static final /* synthetic */ zv8[] i;
    public jc7 a = jc7.d;
    public final String b = fb9.class.getName();
    public final dq4 c;
    public final mjg d;
    public final p3c e;
    public final ifh f;
    public final int g;
    public volatile long h;

    static {
        z8b z8bVar = new z8b(fb9.class, "framesJob", "getFramesJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        i = new zv8[]{z8bVar};
    }

    public fb9(xhh xhhVar, dsc dscVar, yt4 yt4Var) {
        int i2;
        xt4 xt4VarB = ((n0c) xhhVar).b();
        zt4 zt4Var = new zt4(yt4Var, eb9.a);
        xt4VarB.getClass();
        this.c = cqk.a(lvb.x0(xt4VarB, zt4Var));
        this.d = p90.a(r66.a);
        this.e = qyj.S();
        this.f = new ifh(new q38(27));
        int iOrdinal = dscVar.a.ordinal();
        if (iOrdinal == 0) {
            i2 = 5;
        } else if (iOrdinal == 1) {
            i2 = 10;
        } else {
            if (iOrdinal != 2) {
                ore.o();
                throw null;
            }
            i2 = 20;
        }
        this.g = i2;
    }

    @Override // defpackage.lc7
    public final boolean a() {
        rui ruiVar = this.a.a;
        return ruiVar != null && ruiVar.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lc7
    public final Object b(long j, lq4 lq4Var) {
        db9 db9Var;
        int iMin;
        if (lq4Var instanceof db9) {
            db9Var = (db9) lq4Var;
            int i2 = db9Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                db9Var.g = i2 - Integer.MIN_VALUE;
            } else {
                db9Var = new db9(this, (nq4) lq4Var);
            }
        } else {
            db9Var = new db9(this, (nq4) lq4Var);
        }
        Object objP = db9Var.e;
        hu4 hu4Var = hu4.a;
        int i3 = db9Var.g;
        if (i3 == 0) {
            ch3.d0(objP);
            iMin = (int) Math.min(this.g - 1, (int) Math.floor(j / (this.h / ((long) this.g))));
            cb9 cb9Var = new cb9(this.d, iMin, 0);
            db9Var.d = iMin;
            db9Var.g = 1;
            objP = e9i.P(cb9Var, db9Var);
            if (objP == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iMin = db9Var.d;
            ch3.d0(objP);
        }
        List list = (List) objP;
        if (list == null) {
            return null;
        }
        Bitmap bitmap = (Bitmap) list.get(iMin);
        jc7 jc7Var = this.a;
        return new kc7(jc7Var.b, jc7Var.c, bitmap);
    }

    @Override // defpackage.lc7
    public final jc7 getData() {
        return this.a;
    }

    @Override // defpackage.lc7
    public final void prepare() {
        rui ruiVar = this.a.a;
        if (ruiVar == null) {
            gm0.Y(this.b, "You should call init before prepare!");
            return;
        }
        mjg mjgVar = this.d;
        List list = (List) mjgVar.getValue();
        mjgVar.j(null, r66.a);
        sgg sggVarI0 = yab.i0(this.c, null, 0, new uf3(this, list, ruiVar, (lq4) null, 2), 3);
        this.e.B(this, i[0], sggVarI0);
    }
}
