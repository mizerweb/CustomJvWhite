package defpackage;

import android.os.Trace;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class jid {
    public final iid a;

    public jid(iid iidVar) {
        this.a = iidVar;
    }

    public final void a(cli... cliVarArr) {
        tw5 tw5Var = this.a.a;
        cli[] cliVarArr2 = (cli[]) Arrays.copyOf(cliVarArr, cliVarArr.length);
        cqk.f("CX:unbind");
        try {
            wxl.a();
            if (tw5.c(tw5Var) == 2) {
                throw new UnsupportedOperationException("Unbind UseCase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            ((t09) tw5Var.e).j(new ec1(a.Y0(cliVarArr2)), (HashSet) tw5Var.g);
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
