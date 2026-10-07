package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g94 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ g94(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, str);
        }
    }
}
