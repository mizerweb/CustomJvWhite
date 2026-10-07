package defpackage;

import android.util.Log;
import java.util.Arrays;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;

/* JADX INFO: loaded from: classes3.dex */
public final class uxh implements y3e {
    public final mxh a;
    public final y3e b;
    public qs4 c;

    public uxh(mxh mxhVar, y3e y3eVar) {
        this.a = mxhVar;
        this.b = y3eVar;
    }

    @Override // defpackage.y3e
    public final void log(String str, String str2) {
        this.b.log(str, str2);
    }

    @Override // defpackage.y3e
    public final void logException(String str, String str2, Throwable th) {
        this.b.logException(str, str2, th);
    }

    @Override // defpackage.y3e
    public final void reportException(String str, String str2, Throwable th) {
        this.b.reportException(str, str2, th);
        qs4 qs4Var = this.c;
        irh irhVar = new irh(th, (ylc[]) Arrays.copyOf(new ylc[]{new ylc("cid", qs4Var != null ? qs4Var.b : null), new ylc("tag", str), new ylc("msg", str2)}, 3));
        mxh mxhVar = this.a;
        mxhVar.getClass();
        try {
            ((TracerCrashReportLite) mxhVar.b.getValue()).report(irhVar, (String) null);
        } catch (Throwable th2) {
            Log.e("TracerLiteFacade", "Crash report failed", th2);
        }
    }
}
