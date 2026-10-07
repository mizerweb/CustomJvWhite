package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class y8 extends a8j {
    public static final /* synthetic */ zv8[] j;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final mjg f;
    public final r8e g;
    public final p3c h;
    public final ifh i;

    static {
        z8b z8bVar = new z8b(y8.class, "updateActionsJob", "getUpdateActionsJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        j = new zv8[]{z8bVar};
    }

    public y8(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        mjg mjgVarA = p90.a(r66.a);
        this.f = mjgVarA;
        this.g = new r8e(mjgVarA);
        this.h = qyj.S();
        this.i = new ifh(new qo7(6, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable B(y8 y8Var, String str, nq4 nq4Var) {
        x8 x8Var;
        if (nq4Var instanceof x8) {
            x8Var = (x8) nq4Var;
            int i = x8Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                x8Var.f = i - Integer.MIN_VALUE;
            } else {
                x8Var = new x8(y8Var, nq4Var);
            }
        } else {
            x8Var = new x8(y8Var, nq4Var);
        }
        Object objA = x8Var.d;
        int i2 = x8Var.f;
        if (i2 == 0) {
            ch3.d0(objA);
            z7f z7fVar = (z7f) y8Var.e.getValue();
            x8Var.f = 1;
            objA = z7fVar.a(str, x8Var);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(yw3.W0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (w7f.$EnumSwitchMapping$0[((v7f) it.next()).ordinal()] != 1) {
                ore.o();
                return null;
            }
            tnh tnhVar = new tnh(R.string.oneme_invite_by_phone_search_action);
            int i3 = i7c.b;
            arrayList.add(new r8(tnhVar));
        }
        return arrayList;
    }

    public final void C(String str) {
        if (str != null) {
            xt4 xt4VarA = ((n0c) ((xhh) this.c.getValue())).a();
            yt4 yt4Var = (yt4) this.d.getValue();
            xt4VarA.getClass();
            sgg sggVarT = a8j.t(this, lvb.x0(xt4VarA, yt4Var), new dn0(this, str, (lq4) null, 2), 2);
            this.h.B(this, j[0], sggVarT);
        }
    }
}
