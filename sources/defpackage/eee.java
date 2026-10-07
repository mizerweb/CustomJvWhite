package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eee implements uti {
    public final s86 b;

    public eee(s86 s86Var, nf2 nf2Var) {
        this.b = s86Var;
        nf2Var.t();
    }

    @Override // defpackage.uti
    public final Size a(pi0 pi0Var, fx5 fx5Var) {
        mj0 mj0VarB;
        al2 al2VarA = this.b.a(fx5Var);
        if (al2VarA == null || (mj0VarB = al2VarA.b(pi0Var)) == null) {
            return null;
        }
        return mj0VarB.f.a();
    }

    @Override // defpackage.uti
    public final List b(fx5 fx5Var) {
        al2 al2VarA = this.b.a(fx5Var);
        return al2VarA != null ? new ArrayList(al2VarA.a.keySet()) : r66.a;
    }
}
