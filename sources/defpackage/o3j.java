package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.DispatchException;
import ru.rustore.sdk.core.tasks.TaskCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class o3j implements m72, ptb, rg4 {
    public Object a;

    public /* synthetic */ o3j(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.m72
    public void A(y8e y8eVar, pne pneVar) throws IllegalAccessException, DispatchException, InvocationTargetException {
        ((ek2) this.a).j(pneVar, mb8.c);
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        yu4 yu4Var;
        ((Long) obj).getClass();
        bv4 bv4Var = (bv4) ((g85) this.a).c;
        yu4 yu4VarC = ((zu4) bv4Var.b).c();
        if (yu4VarC == null || (yu4Var = (yu4) ((zu4) bv4Var.b).b) == null) {
            return;
        }
        bv4Var.c = ((uvc) bv4Var.a).i(yu4VarC, yu4Var);
    }

    @Override // defpackage.ptb
    public void onComplete(Throwable th) {
        if (th instanceof TaskCancellationException) {
            cqk.g((gu4) this.a);
        }
    }

    @Override // defpackage.m72
    public void r(y8e y8eVar, IOException iOException) {
        ((ek2) this.a).resumeWith(new poe(iOException));
    }
}
