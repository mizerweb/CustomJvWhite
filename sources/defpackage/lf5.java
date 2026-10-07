package defpackage;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class lf5 implements rwi {
    public final boolean a;
    public final wm7 b;
    public final ExecutorService c;
    public final en7 d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public lf5(boolean z, wm7 wm7Var, ExecutorService executorService, en7 en7Var, int i, boolean z2, boolean z3) {
        this.a = z;
        this.b = wm7Var;
        this.c = executorService;
        this.d = en7Var;
        this.e = i;
        this.f = z2;
        this.g = z3;
    }

    @Override // defpackage.rwi
    public final /* bridge */ /* synthetic */ twi a(Context context, p51 p51Var, ex3 ex3Var, boolean z, gj2 gj2Var) {
        return c(context, p51Var, ex3Var, z, im5.a, gj2Var);
    }

    public final k84 b() {
        k84 k84Var = new k84(2);
        k84Var.b = this.c;
        k84Var.c = this.b;
        k84Var.d = this.d;
        k84Var.g = this.e;
        k84Var.e = !this.a;
        k84Var.f = this.f;
        k84Var.h = this.g;
        return k84Var;
    }

    public final nf5 c(final Context context, final p51 p51Var, final ex3 ex3Var, final boolean z, final Executor executor, final swi swiVar) {
        ExecutorService executorServiceNewSingleThreadExecutor;
        ExecutorService executorService = this.c;
        if (executorService == null) {
            String str = vqi.a;
            executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ct5(2, "Effect:DefaultVideoFrameProcessor:GlThread"));
        } else {
            executorServiceNewSingleThreadExecutor = executorService;
        }
        final o02 o02Var = new o02(executorServiceNewSingleThreadExecutor, executorService == null, new ef5(swiVar, 1));
        wm7 fikVar = this.b;
        final boolean z2 = fikVar == null || executorService == null;
        if (fikVar == null) {
            fikVar = new fik(13);
        }
        final wm7 wm7Var = fikVar;
        try {
            return (nf5) executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: kf5
                @Override // java.util.concurrent.Callable
                public final Object call() throws GlUtil$GlException {
                    Pair pairCreate;
                    wm7 wm7Var2 = wm7Var;
                    lf5 lf5Var = this.a;
                    en7 en7Var = lf5Var.d;
                    int i = lf5Var.e;
                    boolean z3 = lf5Var.a;
                    boolean z4 = lf5Var.f;
                    boolean z5 = lf5Var.g;
                    int i2 = nf5.x;
                    EGLDisplay eGLDisplayT = tab.t();
                    ex3 ex3Var2 = ex3Var;
                    boolean zH = ex3.h(ex3Var2);
                    int[] iArr = zH ? tab.c : tab.b;
                    try {
                        EGLContext eGLContextY = wm7Var2.y(eGLDisplayT, 3, iArr);
                        pairCreate = Pair.create(eGLContextY, wm7Var2.q(eGLContextY, eGLDisplayT));
                    } catch (GlUtil$GlException unused) {
                        EGLContext eGLContextY2 = wm7Var2.y(eGLDisplayT, 2, iArr);
                        pairCreate = Pair.create(eGLContextY2, wm7Var2.q(eGLContextY2, eGLDisplayT));
                    }
                    Pair pair = pairCreate;
                    dx3 dx3VarA = ex3Var2.a();
                    dx3VarA.c = 1;
                    dx3VarA.d = null;
                    ex3 ex3VarA = dx3VarA.a();
                    if (!zH) {
                        ex3VarA = ex3Var2;
                    }
                    swi swiVar2 = swiVar;
                    ef5 ef5Var = new ef5(swiVar2, 0);
                    Context context2 = context;
                    o02 o02Var2 = o02Var;
                    Executor executor2 = executor;
                    x70 x70Var = new x70(context2, ex3VarA, wm7Var2, o02Var2, executor2, ef5Var, z3, z4, z5);
                    EGLContext eGLContext = (EGLContext) pair.first;
                    EGLSurface eGLSurface = (EGLSurface) pair.second;
                    boolean z6 = z;
                    return new nf5(context2, wm7Var2, z2, eGLDisplayT, x70Var, o02Var2, swiVar2, executor2, new uu6(context2, eGLDisplayT, eGLContext, eGLSurface, ex3Var2, o02Var2, executor2, swiVar2, en7Var, i, z6), z6, ex3Var2, p51Var, null);
                }
            }).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new VideoFrameProcessingException(e);
        } catch (ExecutionException e2) {
            throw new VideoFrameProcessingException(e2);
        }
    }
}
