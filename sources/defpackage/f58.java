package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.media3.common.ParserException;
import androidx.media3.transformer.ExportException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class f58 implements ey {
    public final Context a;
    public final s26 b;
    public final xx0 c;
    public final dy d;
    public final boolean e;
    public final ScheduledExecutorService f;
    public rye g;
    public int h;
    public volatile int i;

    public f58(Context context, s26 s26Var, dy dyVar, xx0 xx0Var, boolean z) {
        lvb.b0(s26Var.d != -9223372036854775807L);
        lvb.b0(s26Var.e != -2147483647);
        this.a = context;
        this.b = s26Var;
        this.d = dyVar;
        this.c = xx0Var;
        this.e = z;
        this.f = Executors.newSingleThreadScheduledExecutor();
        this.h = 0;
    }

    public final void a(final Bitmap bitmap, final b87 b87Var) {
        try {
            rye ryeVar = this.g;
            final int i = 0;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (ryeVar == null) {
                this.g = this.d.f(b87Var);
                this.f.schedule(new Runnable(this) { // from class: e58
                    public final /* synthetic */ f58 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = i;
                        b87 b87Var2 = b87Var;
                        Bitmap bitmap2 = bitmap;
                        f58 f58Var = this.b;
                        switch (i2) {
                            case 0:
                                f58Var.a(bitmap2, b87Var2);
                                break;
                            default:
                                f58Var.a(bitmap2, b87Var2);
                                break;
                        }
                    }
                }, 10L, timeUnit);
                return;
            }
            s26 s26Var = this.b;
            int iE = ryeVar.e(bitmap, new lf4(0, s26Var.d, s26Var.e));
            final int i2 = 1;
            if (iE == 1) {
                this.i = 100;
                this.g.f();
            } else if (iE == 2) {
                this.f.schedule(new Runnable(this) { // from class: e58
                    public final /* synthetic */ f58 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        b87 b87Var2 = b87Var;
                        Bitmap bitmap2 = bitmap;
                        f58 f58Var = this.b;
                        switch (i3) {
                            case 0:
                                f58Var.a(bitmap2, b87Var2);
                                break;
                            default:
                                f58Var.a(bitmap2, b87Var2);
                                break;
                        }
                    }
                }, 10L, timeUnit);
            } else {
                if (iE != 3) {
                    throw new IllegalStateException();
                }
                this.i = 100;
            }
        } catch (ExportException e) {
            this.d.b(e);
        } catch (RuntimeException e2) {
            this.d.b(ExportException.a(1000, e2));
        }
    }

    @Override // defpackage.ey
    public final int c(ww6 ww6Var) {
        if (this.h == 2) {
            ww6Var.b = this.i;
        }
        return this.h;
    }

    @Override // defpackage.ey
    public final g98 g() {
        return lhe.g;
    }

    @Override // defpackage.ey
    public final void release() {
        this.h = 0;
        this.f.shutdownNow();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002f  */
    /* JADX WARN: Instruction removed from duplicated block: B:8:0x002f, please report this as an issue */
    @Override // defpackage.ey
    public final void start() {
        e89 e88Var;
        this.h = 2;
        s26 s26Var = this.b;
        long j = s26Var.d;
        dy dyVar = this.d;
        dyVar.d(j);
        dyVar.a(1);
        ry9 ry9Var = s26Var.a;
        String strI = izl.i(this.a, ry9Var);
        if (strI != null) {
            xx0 xx0Var = this.c;
            if (xx0Var.c(strI)) {
                jy9 jy9Var = ry9Var.b;
                jy9Var.getClass();
                e88Var = xx0Var.n(jy9Var.a);
            } else {
                e88Var = new e88(ParserException.c("Attempted to load a Bitmap from unsupported MIME type: " + strI));
            }
        } else {
            e88Var = new e88(ParserException.c("Attempted to load a Bitmap from unsupported MIME type: " + strI));
        }
        e88Var.b(new ng7(e88Var, 0, new xva(16, this)), this.f);
    }
}
