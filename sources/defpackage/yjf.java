package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yjf extends hlf {
    public final /* synthetic */ int h;
    public final sfa i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjf(sfa sfaVar, int i) {
        super(0L);
        this.h = i;
        switch (i) {
            case 1:
                super(sfaVar.h);
                this.i = sfaVar;
                break;
            default:
                this.i = sfaVar;
                break;
        }
    }

    @Override // defpackage.hlf
    public final ilf a() {
        switch (this.h) {
            case 0:
                return new zjf(this);
            default:
                return new wkf(this);
        }
    }

    @Override // defpackage.hlf
    public hlf b(ng5 ng5Var) {
        switch (this.h) {
            case 1:
                gm0.Y("wkf", "try to set delayed attrs in builder");
                this.f = null;
                break;
            default:
                super.b(ng5Var);
                break;
        }
        return this;
    }
}
