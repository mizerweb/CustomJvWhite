package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qj2 implements rj2 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qj2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rj2
    public final void b(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((cf7) obj).invoke(th);
                break;
            default:
                ((no5) obj).dispose();
                break;
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((cf7) obj).getClass().getSimpleName() + '@' + f55.n(this) + ']';
            default:
                return "DisposeOnCancel[" + ((no5) obj) + ']';
        }
    }
}
