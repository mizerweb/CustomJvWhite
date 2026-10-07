package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8d implements cf7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Set b;

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = true;
        Set set = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(!set.contains(Long.valueOf(((p93) obj).a)));
            default:
                vg4 vg4Var = (vg4) obj;
                if (set.contains(Long.valueOf(vg4Var.v()))) {
                    vg4Var.E();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ r8d(Set set, xde xdeVar) {
        this.b = set;
    }
}
