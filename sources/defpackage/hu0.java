package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hu0 extends kq0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hu0(fg4 fg4Var, int i) {
        super(fg4Var);
        this.b = i;
    }

    @Override // defpackage.rf4
    public final boolean b(mzj mzjVar) {
        switch (this.b) {
            case 0:
                return mzjVar.j.c;
            case 1:
                return mzjVar.j.e;
            default:
                return mzjVar.j.f;
        }
    }

    @Override // defpackage.kq0
    public final int c() {
        switch (this.b) {
            case 0:
                return 6;
            case 1:
                return 5;
            default:
                return 9;
        }
    }

    @Override // defpackage.kq0
    public final boolean d(Object obj) {
        boolean zBooleanValue;
        switch (this.b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
