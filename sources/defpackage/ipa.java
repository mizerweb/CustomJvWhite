package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ipa implements qf7 {
    public final /* synthetic */ npa a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ rt2 c;
    public final /* synthetic */ fda d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ipa(npa npaVar, CharSequence charSequence, rt2 rt2Var, fda fdaVar, boolean z) {
        this.a = npaVar;
        this.b = charSequence;
        this.c = rt2Var;
        this.d = fdaVar;
        this.e = z;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        jpa jpaVar = (jpa) obj;
        no5 no5Var = (no5) obj2;
        if (no5Var != null) {
            return no5Var;
        }
        npa npaVar = this.a;
        return yab.i0(npaVar.b, null, 0, new lpa(npaVar, this.b, this.c, this.d, this.e, null), 3).Y(new iaa(npaVar, 12, jpaVar));
    }
}
