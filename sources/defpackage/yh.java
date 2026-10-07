package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yh implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ zh b;

    public /* synthetic */ yh(int i, zh zhVar) {
        this.a = i;
        this.b = zhVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = this.a;
            i2 = 10;
            if (i4 >= 10) {
                break;
            }
            if (i >= bi.a[i4]) {
                i2 = i4 + 1;
                break;
            }
            i4++;
        }
        Thread threadNewThread = this.b.newThread(new ai(i, runnable, i3));
        threadNewThread.setPriority(i2);
        return threadNewThread;
    }
}
