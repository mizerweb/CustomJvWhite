package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ey4 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx6[] b;

    public /* synthetic */ ey4(xx6[] xx6VarArr, int i) {
        this.a = i;
        this.b = xx6VarArr;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        xx6[] xx6VarArr = this.b;
        switch (i) {
            case 0:
                return new r17[xx6VarArr.length];
            case 1:
                return new Object[xx6VarArr.length];
            case 2:
                return new ylc[xx6VarArr.length];
            case 3:
                return new Boolean[xx6VarArr.length];
            default:
                return new n2c[xx6VarArr.length];
        }
    }
}
