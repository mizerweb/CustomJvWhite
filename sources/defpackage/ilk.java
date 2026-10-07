package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ilk extends tlk {
    public final til b;

    public ilk(til tilVar) {
        super(1);
        this.b = tilVar;
    }

    @Override // defpackage.tlk
    public final void a(Status status) {
        try {
            this.b.h(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.tlk
    public final void b(Exception exc) {
        try {
            this.b.h(new Status(10, zo5.p(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.tlk
    public final void c(skk skkVar) throws DeadObjectException {
        try {
            til tilVar = this.b;
            fo foVar = skkVar.d;
            tilVar.getClass();
            try {
                tilVar.g(foVar);
            } catch (DeadObjectException e) {
                tilVar.h(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                tilVar.h(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }

    @Override // defpackage.tlk
    public final void d(fbc fbcVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) fbcVar.b;
        til tilVar = this.b;
        map.put(tilVar, boolValueOf);
        tilVar.a(new nkk(fbcVar, tilVar));
    }
}
