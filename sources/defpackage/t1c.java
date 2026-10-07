package defpackage;

import java.util.concurrent.CancellationException;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes.dex */
public final class t1c implements ed6 {
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        if (th instanceof TamErrorException) {
            yhh yhhVar = ((TamErrorException) th).a;
            if (p90.C(yhhVar != null ? yhhVar.b : null)) {
                gm0.V("OneMeExceptionHandler", th.getMessage(), th);
                return;
            }
        }
        s1c s1cVar = new s1c("Handle exception in " + Thread.currentThread(), th);
        gm0.V("OneMeExceptionHandler", s1cVar.getMessage(), s1cVar);
    }
}
