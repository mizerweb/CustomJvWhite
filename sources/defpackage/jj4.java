package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jj4 implements fdd {
    public final /* synthetic */ Set a;
    public final /* synthetic */ Set b;

    public /* synthetic */ jj4(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.fdd
    public final boolean test(Object obj) {
        vg4 vg4Var = (vg4) obj;
        if (!this.a.contains(vg4Var.a.b.k)) {
            return false;
        }
        Set set = this.b;
        return set == null || set.contains(vg4Var.a.b.i);
    }
}
