package defpackage;

import java.lang.ref.WeakReference;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.CompletionHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class z10 implements CompletionHandler {
    public static final z10 b = new z10(0);
    public static final z10 c = new z10(1);
    public final /* synthetic */ int a;

    public /* synthetic */ z10(int i) {
        this.a = i;
    }

    @Override // java.nio.channels.CompletionHandler
    public final void completed(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ck2 ck2Var = (ck2) ((WeakReference) obj2).get();
                if (ck2Var != null) {
                    ck2Var.resumeWith(obj);
                }
                break;
            default:
                ck2 ck2Var2 = (ck2) ((WeakReference) obj2).get();
                if (ck2Var2 != null) {
                    ck2Var2.resumeWith(sbi.a);
                }
                break;
        }
    }

    @Override // java.nio.channels.CompletionHandler
    public final void failed(Throwable th, Object obj) {
        ck2 ck2Var;
        ck2 ck2Var2;
        ck2 ck2Var3;
        ck2 ck2Var4;
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if ((!(th instanceof AsynchronousCloseException) || (ck2Var2 = (ck2) weakReference.get()) == null || !ck2Var2.isCancelled()) && (ck2Var = (ck2) weakReference.get()) != null) {
                    ck2Var.resumeWith(new poe(th));
                }
                break;
            default:
                WeakReference weakReference2 = (WeakReference) obj;
                if ((!(th instanceof AsynchronousCloseException) || (ck2Var4 = (ck2) weakReference2.get()) == null || !ck2Var4.isCancelled()) && (ck2Var3 = (ck2) weakReference2.get()) != null) {
                    ck2Var3.resumeWith(new poe(th));
                }
                break;
        }
    }
}
