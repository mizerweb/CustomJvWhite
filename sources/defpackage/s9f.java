package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class s9f implements yx6 {
    public final /* synthetic */ u9f a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ m8b d;
    public final /* synthetic */ m8b e;
    public final /* synthetic */ ArrayList f;

    public s9f(u9f u9fVar, String str, ArrayList arrayList, m8b m8bVar, m8b m8bVar2, ArrayList arrayList2) {
        this.a = u9fVar;
        this.b = str;
        this.c = arrayList;
        this.d = m8bVar;
        this.e = m8bVar2;
        this.f = arrayList2;
    }

    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        vg4 vg4Var = (vg4) obj;
        u9f u9fVar = this.a;
        qw2 qw2Var = u9fVar.a;
        daf dafVar = u9fVar.c;
        rt2 rt2VarQ = qw2Var.Q(vg4Var.v());
        String str = this.b;
        if (rt2VarQ != null && rt2VarQ.W()) {
            this.c.add(dafVar.a(rt2VarQ, str));
            this.d.a(rt2VarQ.a);
            this.e.a(vg4Var.v());
        } else if (vg4Var.h()) {
            this.f.add(dafVar.b(vg4Var, str));
        }
        return sbi.a;
    }
}
