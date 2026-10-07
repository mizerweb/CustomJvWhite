package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hzi implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hzi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                izi iziVar = (izi) obj;
                if (!iziVar.e.B()) {
                    iziVar.e.s(false);
                }
                return sbi.a;
            case 1:
                return new fvg(19, (i2j) obj);
            case 2:
                return new fvg(20, (vbi) obj);
            case 3:
                return new fvg(21, (vbi) obj);
            case 4:
                return new fvg(22, (vbi) obj);
            case 5:
                return new fvg(23, (wmj) obj);
            case 6:
                return new fvg(24, (j0i) obj);
            default:
                return new fvg(25, (vbi) obj);
        }
    }
}
