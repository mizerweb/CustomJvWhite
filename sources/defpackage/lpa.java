package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class lpa extends mdh implements qf7 {
    public npa e;
    public CharSequence f;
    public rt2 g;
    public fda h;
    public npa i;
    public boolean j;
    public int k;
    public final /* synthetic */ npa l;
    public final /* synthetic */ CharSequence m;
    public final /* synthetic */ rt2 n;
    public final /* synthetic */ fda o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpa(npa npaVar, CharSequence charSequence, rt2 rt2Var, fda fdaVar, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = npaVar;
        this.m = charSequence;
        this.n = rt2Var;
        this.o = fdaVar;
        this.p = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new lpa(this.l, this.m, this.n, this.o, this.p, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        lpa lpaVar = (lpa) create((gu4) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        lpaVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        rt2 rt2Var;
        Throwable th;
        npa npaVar;
        npa npaVar2;
        fda fdaVar;
        boolean z;
        int i = this.k;
        try {
            if (i == 0) {
                ch3.d0(obj);
                npa npaVar3 = this.l;
                charSequence = this.m;
                rt2Var = this.n;
                fda fdaVar2 = this.o;
                boolean z2 = this.p;
                try {
                    lac lacVar = (lac) npaVar3.e.getValue();
                    this.e = npaVar3;
                    this.f = charSequence;
                    this.g = rt2Var;
                    this.h = fdaVar2;
                    this.i = npaVar3;
                    this.j = z2;
                    this.k = 1;
                    ((lnh) lacVar.f.getValue()).getClass();
                    npaVar2 = npaVar3;
                    fdaVar = fdaVar2;
                    z = z2;
                    obj = null;
                    npaVar = npaVar2;
                } catch (Throwable th2) {
                    th = th2;
                    npaVar = npaVar3;
                    gm0.V(npaVar.c, "postProcessText: failed", th);
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z3 = this.j;
                npaVar = this.i;
                fda fdaVar3 = this.h;
                rt2Var = this.g;
                charSequence = this.f;
                npa npaVar4 = this.e;
                try {
                    ch3.d0(obj);
                    npaVar2 = npaVar4;
                    z = z3;
                    fdaVar = fdaVar3;
                } catch (Throwable th3) {
                    th = th3;
                    gm0.V(npaVar.c, "postProcessText: failed", th);
                }
            }
            rt2 rt2Var2 = rt2Var;
            CharSequence charSequence2 = (CharSequence) obj;
            if (charSequence2 != null && charSequence2.length() != 0 && !charSequence2.equals(charSequence)) {
                npa.b(npaVar2, rt2Var2, fdaVar, charSequence2, z, false, 16);
            }
            return sbi.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
