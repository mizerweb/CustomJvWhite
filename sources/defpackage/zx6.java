package defpackage;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: classes.dex */
public final class zx6 extends s3f {
    @Override // defpackage.up8
    public final boolean u(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return q(th);
    }
}
