package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class st0 implements zo {
    public static final Uri c = fq.b("batch.executeV2");
    public final sp[] a;
    public final b1k b;

    public st0(sp[] spVarArr) {
        this.a = spVarArr;
        this.b = new b1k(3, spVarArr);
    }

    @Override // defpackage.op
    public final boolean canRepeat() {
        for (sp spVar : this.a) {
            if (!spVar.b.canRepeat()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.zo
    public final vo getConfigExtractor() {
        return zpe.d;
    }

    @Override // defpackage.zo
    public final hu8 getOkParser() {
        return this.b;
    }

    @Override // defpackage.op
    public final int getPriority() {
        int i = 1;
        for (sp spVar : this.a) {
            int priority = spVar.b.getPriority();
            if (i < priority) {
                i = priority;
            }
        }
        return i;
    }

    @Override // defpackage.op
    public final up getScope() {
        sp[] spVarArr = this.a;
        int length = spVarArr.length;
        up upVar = up.a;
        if (length == 0) {
            return upVar;
        }
        if (length == 1) {
            return spVarArr[0].b.getScope();
        }
        for (sp spVar : spVarArr) {
            upVar = (up) oc9.s(upVar, spVar.b.getScope());
            if (spVar.b.getScopeAfter() != vp.a) {
                return upVar;
            }
        }
        return upVar;
    }

    @Override // defpackage.zo
    public final vp getScopeAfter() {
        sp[] spVarArr = this.a;
        int length = spVarArr.length;
        vp vpVar = vp.a;
        if (length != 0) {
            if (length == 1) {
                return spVarArr[0].b.getScopeAfter();
            }
            for (int i = length - 1; -1 < i; i--) {
                vp scopeAfter = spVarArr[i].b.getScopeAfter();
                if (scopeAfter != vpVar) {
                    return scopeAfter;
                }
            }
        }
        return vpVar;
    }

    @Override // defpackage.op
    public final Uri getUri() {
        return c;
    }

    @Override // defpackage.op
    public final void writeParams(mv8 mv8Var) {
        mv8Var.a0("methods");
        mv8Var.r();
        for (sp spVar : this.a) {
            zo zoVar = spVar.b;
            mv8Var.p();
            mv8Var.a0(spVar.c);
            mv8Var.p();
            if (zoVar.willWriteParams()) {
                mv8Var.a0("params");
                mv8Var.p();
                zoVar.writeParams(mv8Var);
                mv8Var.t();
            }
            if (zoVar.willWriteSupplyParams()) {
                mv8Var.a0("supplyParams");
                mv8Var.p();
                zoVar.writeSupplyParams(mv8Var);
                mv8Var.t();
            }
            mv8Var.t();
            mv8Var.t();
        }
        mv8Var.q();
    }
}
