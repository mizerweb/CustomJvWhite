package defpackage;

import android.content.Context;
import ru.rustore.sdk.core.tasks.TaskCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class n3j implements ptb {
    public final Object a;

    public n3j(Context context) {
        this.a = context.getSharedPreferences("metrics_sdk_sp", 0);
    }

    public m3j a(fka fkaVar) {
        int iT0 = fkaVar.t0();
        int iD0 = 0;
        int iD1 = 0;
        int iJ = 0;
        for (int i = 0; i < iT0; i++) {
            if (i != 0) {
                boolean z = true;
                if (i == 1) {
                    iD1 = fkaVar.D0();
                } else if (i != 2) {
                    try {
                        fkaVar.x();
                    } catch (Throwable th) {
                        ((y3e) this.a).log("VideoQualityUpdateNotificationParser", "Can't parse VideoQualityUpdate " + th);
                        return null;
                    }
                } else {
                    q1 q1VarT0 = fkaVar.T0();
                    if (q1VarT0.a() == 3) {
                        int iA = q1VarT0.a();
                        qt4.c(iA);
                        if (iA != 1) {
                            z = false;
                        }
                        if (!z) {
                            iJ = q1VarT0.c().j();
                        }
                    }
                }
            } else {
                iD0 = fkaVar.D0();
            }
        }
        return new m3j(new l3j(iD0, iD1, iJ));
    }

    @Override // defpackage.ptb
    public void onComplete(Throwable th) {
        if (th instanceof TaskCancellationException) {
            cqk.g((gu4) this.a);
        }
    }

    public n3j(y3e y3eVar) {
        y3eVar.getClass();
        this.a = y3eVar;
    }

    public n3j(gu4 gu4Var) {
        this.a = gu4Var;
    }
}
