package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hig extends ma7 {
    public final /* synthetic */ xbf b;
    public final /* synthetic */ gj2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hig(gj2 gj2Var, xbf xbfVar, xbf xbfVar2) {
        super(xbfVar);
        this.c = gj2Var;
        this.b = xbfVar2;
    }

    @Override // defpackage.ma7, defpackage.xbf
    public final wbf d(long j) {
        wbf wbfVarD = this.b.d(j);
        zbf zbfVar = wbfVarD.a;
        long j2 = zbfVar.a;
        long j3 = zbfVar.b;
        long j4 = this.c.b;
        zbf zbfVar2 = new zbf(j2, j3 + j4);
        zbf zbfVar3 = wbfVarD.b;
        return new wbf(zbfVar2, new zbf(zbfVar3.a, zbfVar3.b + j4));
    }
}
