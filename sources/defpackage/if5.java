package defpackage;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class if5 implements pwi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ if5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pwi
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((CountDownLatch) obj).countDown();
                break;
            case 1:
                j28 j28Var = ((tlh) obj).e;
                j28Var.getClass();
                j28Var.x();
                g55.a();
                break;
            case 2:
                ((j28) obj).y();
                break;
            default:
                ((u7e) obj).b();
                break;
        }
    }
}
