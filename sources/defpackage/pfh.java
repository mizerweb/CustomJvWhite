package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class pfh extends f2 {
    public final /* synthetic */ int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public pfh(int i) {
        this.c = i;
        lw5 lw5Var = lw5.MILLISECONDS;
        switch (i) {
            case 2:
                super(lw5Var);
                break;
            case 3:
                super(lw5Var);
                break;
            default:
                super(lw5Var);
                break;
        }
    }

    @Override // defpackage.f2
    public final long h() {
        switch (this.c) {
            case 0:
                return System.currentTimeMillis();
            case 1:
                return System.nanoTime();
            case 2:
                return SystemClock.elapsedRealtime();
            default:
                return SystemClock.uptimeMillis();
        }
    }

    public final long m() {
        int i = this.c;
        lw5 lw5Var = lw5.MILLISECONDS;
        switch (i) {
            case 0:
                ghb ghbVar = ew5.b;
                return qe7.P(System.currentTimeMillis(), lw5Var);
            case 1:
                ghb ghbVar2 = ew5.b;
                return qe7.P(System.nanoTime(), lw5.NANOSECONDS);
            case 2:
                ghb ghbVar3 = ew5.b;
                return qe7.P(SystemClock.elapsedRealtime(), lw5Var);
            default:
                ghb ghbVar4 = ew5.b;
                return qe7.P(SystemClock.uptimeMillis(), lw5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pfh(lw5 lw5Var) {
        super(lw5Var);
        this.c = 1;
    }
}
