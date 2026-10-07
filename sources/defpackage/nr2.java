package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class nr2 extends mr2 {
    public final /* synthetic */ int d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nr2(Object obj, vt4 vt4Var, int i, int i2, int i3) {
        super(vt4Var, i, i2);
        this.d = i3;
        this.e = obj;
    }

    @Override // defpackage.mr2
    public Object f(njd njdVar, lq4 lq4Var) {
        int i = this.d;
        sbi sbiVar = sbi.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                Object objInvoke = ((qf7) obj).invoke(njdVar, lq4Var);
                return objInvoke == hu4.a ? objInvoke : sbiVar;
            default:
                mhf mhfVar = new mhf(njdVar);
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    yab.i0(njdVar, null, 0, new qob((xx6) it.next(), mhfVar, null, 12), 3);
                }
                return sbiVar;
        }
    }

    @Override // defpackage.mr2
    public mr2 g(vt4 vt4Var, int i, int i2) {
        int i3 = this.d;
        Object obj = this.e;
        switch (i3) {
            case 0:
                return new nr2((qf7) obj, vt4Var, i, i2, 0);
            default:
                return new nr2((Iterable) obj, vt4Var, i, i2, 1);
        }
    }

    @Override // defpackage.mr2
    public hr2 j(gu4 gu4Var) {
        switch (this.d) {
            case 1:
                qf7 qobVar = new qob(this, (lq4) null, 11);
                njd njdVar = new njd(n1g.M(gu4Var, this.a), yab.b(this.b, 1, null, 4));
                njdVar.m0(1, njdVar, qobVar);
                return njdVar;
            default:
                return super.j(gu4Var);
        }
    }

    @Override // defpackage.mr2
    public String toString() {
        switch (this.d) {
            case 0:
                return "block[" + ((qf7) this.e) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}
