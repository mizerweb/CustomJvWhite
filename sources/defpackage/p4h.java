package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p4h implements jmf {
    public final /* synthetic */ q4h a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ cmi d;
    public final /* synthetic */ yi0 e;
    public final /* synthetic */ yi0 f;

    public /* synthetic */ p4h(q4h q4hVar, String str, String str2, cmi cmiVar, yi0 yi0Var, yi0 yi0Var2) {
        this.a = q4hVar;
        this.b = str;
        this.c = str2;
        this.d = cmiVar;
        this.e = yi0Var;
        this.f = yi0Var2;
    }

    @Override // defpackage.jmf
    public final void a(lmf lmfVar) {
        q4h q4hVar = this.a;
        if (q4hVar.e() == null) {
            return;
        }
        q4hVar.J();
        q4hVar.H(q4hVar.L(this.b, this.c, this.d, this.e, this.f));
        q4hVar.s();
        faj fajVar = q4hVar.v;
        fajVar.getClass();
        wxl.a();
        Iterator it = fajVar.a.iterator();
        while (it.hasNext()) {
            fajVar.c((cli) it.next());
        }
    }
}
