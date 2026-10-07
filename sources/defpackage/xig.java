package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class xig implements Runnable {
    public final /* synthetic */ int a = 1;
    public long b;
    public final Object c;
    public final Object d;

    public xig(yig yigVar) {
        this.d = yigVar;
        this.c = new wig(yigVar, this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yig yigVar = (yig) this.d;
                yigVar.b.invoke((wig) this.c);
                Handler handler = yigVar.g;
                handler.removeCallbacks(this);
                handler.postDelayed(this, 1000L);
                this.b++;
                break;
            default:
                if (!((kzh) this.d).d) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = this.b;
                    if (j > jCurrentTimeMillis) {
                        try {
                            Thread.sleep(j - jCurrentTimeMillis);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            tre.s0(e);
                            return;
                        }
                    }
                    if (!((kzh) this.d).d) {
                        ((Runnable) this.c).run();
                    }
                }
                break;
        }
    }

    public xig(Runnable runnable, kzh kzhVar, long j) {
        this.c = runnable;
        this.d = kzhVar;
        this.b = j;
    }
}
