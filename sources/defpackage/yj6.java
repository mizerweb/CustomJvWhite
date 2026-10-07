package defpackage;

import java.util.Objects;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes4.dex */
public final class yj6 implements spa {
    public final et3 a;
    public final xhh b;
    public final r8e c;
    public final boolean d;
    public final boolean e;
    public final r8e f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k = rx8.P(3, new mp5(2, this));

    public yj6(et3 et3Var, xhh xhhVar, r8e r8eVar, boolean z, boolean z2, r8e r8eVar2, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = et3Var;
        this.b = xhhVar;
        this.c = r8eVar;
        this.d = z;
        this.e = z2;
        this.f = r8eVar2;
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var3;
        this.j = ny8Var4;
    }

    @Override // defpackage.spa
    public final Object a(rt2 rt2Var, opa opaVar, lq4 lq4Var) {
        return yab.K0(((n0c) this.b).a(), new vk4(16, (lq4) null, (Object) this, (Object) rt2Var, (Object) opaVar, false), lq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(rt2 rt2Var, opa opaVar, nq4 nq4Var) {
        xj6 xj6Var;
        vg4 vg4Var;
        if (nq4Var instanceof xj6) {
            xj6Var = (xj6) nq4Var;
            int i = xj6Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xj6Var.g = i - Integer.MIN_VALUE;
            } else {
                xj6Var = new xj6(this, nq4Var);
            }
        } else {
            xj6Var = new xj6(this, nq4Var);
        }
        Object objI = xj6Var.e;
        int i2 = xj6Var.g;
        Object obj = null;
        if (i2 == 0) {
            ch3.d0(objI);
            if (this.d && rt2Var != null && rt2Var.F0()) {
                if (this.e && this.f.a.getValue() != null) {
                    return Boolean.FALSE;
                }
                if (rt2Var.c != null) {
                    for (Object obj2 : opaVar.a) {
                        if (!((MessageModel) obj2).w()) {
                            obj = obj2;
                            break;
                        }
                    }
                    MessageModel messageModel = (MessageModel) obj;
                    return Boolean.valueOf(messageModel != null && messageModel.z);
                }
                vg4 vg4VarW = rt2Var.w();
                if (vg4VarW == null) {
                    return Boolean.FALSE;
                }
                no4 no4Var = (no4) this.j.getValue();
                long jT = ((s7f) this.a).t();
                xj6Var.d = vg4VarW;
                xj6Var.g = 1;
                objI = no4Var.i(jT);
                hu4 hu4Var = hu4.a;
                if (objI == hu4Var) {
                    return hu4Var;
                }
                vg4Var = vg4VarW;
            }
            return Boolean.FALSE;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vg4Var = xj6Var.d;
        ch3.d0(objI);
        vg4 vg4Var2 = (vg4) objI;
        if (vg4Var2 == null) {
            return Boolean.FALSE;
        }
        String strI = vg4Var.i();
        if (strI == null || strI.length() == 0) {
            return Boolean.FALSE;
        }
        return Objects.equals(vg4Var2.a.b.w, vg4Var.a.b.w) ? Boolean.FALSE : Boolean.TRUE;
    }
}
