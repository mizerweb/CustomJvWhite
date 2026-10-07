package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class n46 extends svl {
    public final /* synthetic */ svl a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public n46(svl svlVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = svlVar;
        this.b = threadPoolExecutor;
    }

    @Override // defpackage.svl
    public final void b(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.svl
    public final void c(ljf ljfVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.c(ljfVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
