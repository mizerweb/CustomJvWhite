package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hw extends zc8 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(pw pwVar) {
        super(pwVar.c);
        this.e = pwVar;
    }

    @Override // defpackage.zc8
    public final Object a(int i) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                return ((mw) obj).f(i);
            default:
                return ((pw) obj).b[i];
        }
    }

    @Override // defpackage.zc8
    public final void b(int i) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                ((mw) obj).g(i);
                break;
            default:
                ((pw) obj).b(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(mw mwVar) {
        super(mwVar.c);
        this.e = mwVar;
    }
}
