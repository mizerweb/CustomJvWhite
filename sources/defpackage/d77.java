package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class d77 implements k46 {
    public final Context a;
    public final c77 b;
    public final so2 c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public svl h;

    public d77(Context context, c77 c77Var) {
        qyj.k(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = c77Var;
        this.c = e77.d;
    }

    @Override // defpackage.k46
    public final void a(svl svlVar) {
        synchronized (this.d) {
            this.h = svlVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new g94("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new k36(12, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final m77 c() {
        try {
            so2 so2Var = this.c;
            Context context = this.a;
            c77 c77Var = this.b;
            so2Var.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{c77Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            we5 we5VarA = a77.a(context, Collections.unmodifiableList(arrayList));
            int i = we5VarA.a;
            if (i != 0) {
                ore.q(c0a.k(i, "fetchFonts failed (", ")"));
                return null;
            }
            m77[] m77VarArr = (m77[]) we5VarA.b.get(0);
            if (m77VarArr != null && m77VarArr.length != 0) {
                return m77VarArr[0];
            }
            ore.q("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            ore.h("provider not found", e);
            return null;
        }
    }
}
