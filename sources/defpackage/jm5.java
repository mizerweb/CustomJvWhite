package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class jm5 implements Executor {
    public static volatile jm5 b;
    public static final /* synthetic */ jm5 c = new jm5(1);
    public static final /* synthetic */ jm5 d = new jm5(2);
    public final /* synthetic */ int a;

    public /* synthetic */ jm5(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
