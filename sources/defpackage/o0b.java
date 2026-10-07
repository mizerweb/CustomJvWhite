package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class o0b<DetectionResultT> implements Closeable, c19 {
    private static final bo7 f = new bo7("MobileVisionBase", "");
    public static final /* synthetic */ int g = 0;
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final yj9 b;
    private final mk2 c;
    private final Executor d;
    private final Task e;

    public o0b(yj9<DetectionResultT, vg8> yj9Var, Executor executor) {
        this.b = yj9Var;
        mk2 mk2Var = new mk2();
        this.c = mk2Var;
        this.d = executor;
        yj9Var.d();
        Task taskA = yj9Var.a(executor, new Callable() { // from class: lqk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = o0b.g;
                return null;
            }
        }, mk2Var.a);
        wtk wtkVar = new ttb() { // from class: wtk
            @Override // defpackage.ttb
            public final void onFailure(Exception exc) {
                o0b.f.c("MobileVisionBase", "Error preloading model resource", exc);
            }
        };
        kam kamVar = (kam) taskA;
        kamVar.getClass();
        kamVar.d(vjh.a, wtkVar);
        this.e = kamVar;
    }

    public synchronized Task A() {
        return this.e;
    }

    public Task C0(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return E(vg8.c(byteBuffer, i, i2, i3, i4));
    }

    public synchronized Task E(final vg8 vg8Var) {
        yab.t(vg8Var, "InputImage can not be null");
        if (this.a.get()) {
            return gwl.d(new MlKitException("This detector is already closed!", 14));
        }
        if (vg8Var.o() < 32 || vg8Var.k() < 32) {
            return gwl.d(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
        return this.b.a(this.d, new Callable() { // from class: rmk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.K(vg8Var);
            }
        }, this.c.a);
    }

    public synchronized Task I(e0b e0bVar) {
        yab.t(e0bVar, "MlImage can not be null");
        throw null;
    }

    public final Object K(vg8 vg8Var) throws Exception {
        rrl rrlVar;
        HashMap map = rrl.f;
        dul.A();
        int i = aul.a;
        dul.A();
        if (Boolean.parseBoolean("")) {
            HashMap map2 = rrl.f;
            if (map2.get("detectorTaskWithResource#run") == null) {
                map2.put("detectorTaskWithResource#run", new rrl("detectorTaskWithResource#run"));
            }
            rrlVar = (rrl) map2.get("detectorTaskWithResource#run");
        } else {
            rrlVar = mrl.g;
        }
        rrlVar.l();
        try {
            Object objJ = this.b.j(vg8Var);
            rrlVar.close();
            return objJ;
        } catch (Throwable th) {
            try {
                rrlVar.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public Task M(Bitmap bitmap, int i) {
        return E(vg8.a(bitmap, i));
    }

    public final /* synthetic */ Object P(e0b e0bVar) throws Exception {
        vg8 vg8VarA = h44.a(e0bVar);
        if (vg8VarA != null) {
            return this.b.j(vg8VarA);
        }
        throw new MlKitException("Current type of MlImage is not supported.", 13);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.op0
    @utb(m09.ON_DESTROY)
    public synchronized void close() {
        if (this.a.getAndSet(true)) {
            return;
        }
        this.c.a();
        this.b.f(this.d);
    }

    public Task h0(Image image, int i, Matrix matrix) {
        return E(vg8.f(image, i, matrix));
    }

    public Task i(Image image, int i) {
        return E(vg8.e(image, i));
    }

    public synchronized Task y() {
        if (this.a.getAndSet(true)) {
            return gwl.e(null);
        }
        this.c.a();
        return this.b.g(this.d);
    }
}
