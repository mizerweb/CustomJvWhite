package defpackage;

import one.me.main.MainScreen;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class ei3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ei3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ki3) obj).e();
            case 1:
                return new dm3(0, (tl3) obj);
            case 2:
                return new dm3(1, (tl3) obj);
            case 3:
                return new dm3(2, (go3) obj);
            case 4:
                return new dm3(3, (go3) obj);
            case 5:
                return new dm3(4, (go3) obj);
            case 6:
                return new dm3(5, (go3) obj);
            case 7:
                return new dm3(6, (go3) obj);
            case 8:
                return new dm3(7, (rh8) obj);
            case 9:
                return new dm3(8, (tg9) obj);
            case 10:
                return Boolean.valueOf(MainScreen.q1((MainScreen) obj));
            case 11:
                return new dm3(9, (uk9) obj);
            case 12:
                return new dm3(10, (j68) obj);
            case 13:
                return Boolean.valueOf(((svb) obj).b());
            case 14:
                return new dm3(11, (qzc) obj);
            case 15:
                return (Boolean) ((ifh) obj).getValue();
            default:
                r7 r7Var = r7.a;
                return new y6(r7.d(((Widget) obj).getB().b()));
        }
    }
}
