package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ir2 extends mr2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(ir2.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final hr2 d;
    public final boolean e;

    public /* synthetic */ ir2(hr2 hr2Var, boolean z) {
        this(hr2Var, z, k66.a, -3, 1);
    }

    @Override // defpackage.mr2, defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.b;
        hu4 hu4Var = hu4.a;
        if (i == -3) {
            boolean z = this.e;
            if (z && f.getAndSet(this, 1) == 1) {
                ore.k("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object objW = qyj.w(yx6Var, this.d, z, lq4Var);
            if (objW == hu4Var) {
                return objW;
            }
        } else {
            Object objCollect = super.collect(yx6Var, lq4Var);
            if (objCollect == hu4Var) {
                return objCollect;
            }
        }
        return sbi.a;
    }

    @Override // defpackage.mr2
    public final String e() {
        return "channel=" + this.d;
    }

    @Override // defpackage.mr2
    public final Object f(njd njdVar, lq4 lq4Var) {
        Object objW = qyj.w(new mhf(njdVar), this.d, this.e, lq4Var);
        return objW == hu4.a ? objW : sbi.a;
    }

    @Override // defpackage.mr2
    public final mr2 g(vt4 vt4Var, int i, int i2) {
        return new ir2(this.d, this.e, vt4Var, i, i2);
    }

    @Override // defpackage.mr2
    public final xx6 i() {
        return new ir2(this.d, this.e);
    }

    @Override // defpackage.mr2
    public final hr2 j(gu4 gu4Var) {
        if (!this.e || f.getAndSet(this, 1) != 1) {
            return this.b == -3 ? this.d : super.j(gu4Var);
        }
        ore.k("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public ir2(hr2 hr2Var, boolean z, vt4 vt4Var, int i, int i2) {
        super(vt4Var, i, i2);
        this.d = hr2Var;
        this.e = z;
    }
}
