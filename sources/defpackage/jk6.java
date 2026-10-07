package defpackage;

import android.view.View;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public final class jk6 extends s7g implements med {
    public long u;

    @Override // defpackage.s7g
    public final void C(k79 k79Var, Object obj) {
        lk6 lk6Var = (lk6) k79Var;
        kk6 kk6Var = obj instanceof kk6 ? (kk6) obj : null;
        if (kk6Var != null) {
            BitSet bitSet = (BitSet) kk6Var.b;
            boolean z = bitSet.get(0);
            View view = this.a;
            if (z || bitSet.get(5)) {
                ((xu2) view).e(lk6Var.b, lk6Var.h, Long.valueOf(lk6Var.a));
            }
            if (bitSet.get(1)) {
                ((xu2) view).setOnline(lk6Var.c);
            }
            if (bitSet.get(2)) {
                ((xu2) view).setTitle(lk6Var.e);
            }
            if (bitSet.get(3)) {
                xu2 xu2Var = (xu2) view;
                ynh ynhVar = lk6Var.f;
                CharSequence charSequenceA = ynhVar != null ? ynhVar.a(this) : null;
                int i = xu2.s1;
                xu2Var.g(charSequenceA, true);
            }
            bitSet.get(4);
            if (bitSet.get(6)) {
                ((xu2) view).setVerified(lk6Var.d);
            }
        }
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(lk6 lk6Var) {
        xu2 xu2Var = (xu2) this.a;
        long j = lk6Var.a;
        xu2Var.setId(j > 2147483647L ? Long.hashCode(j) : (int) j);
        xu2Var.setTitle(lk6Var.e);
        ynh ynhVar = lk6Var.f;
        xu2Var.g(ynhVar != null ? ynhVar.b(xu2Var.getContext()) : null, true);
        xu2Var.e(lk6Var.b, lk6Var.h, Long.valueOf(j));
        xu2Var.setOnline(lk6Var.c);
        xu2Var.setVerified(lk6Var.d);
        this.u = j;
    }

    @Override // defpackage.med
    public final long c() {
        return this.u;
    }
}
