package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class qlk extends vkk {
    public final qjh b;

    public qlk(p89 p89Var, qjh qjhVar) {
        super(4);
        this.b = qjhVar;
    }

    @Override // defpackage.tlk
    public final void a(Status status) {
        this.b.c(new ApiException(status));
    }

    @Override // defpackage.tlk
    public final void b(Exception exc) {
        this.b.c(exc);
    }

    @Override // defpackage.tlk
    public final void c(skk skkVar) throws DeadObjectException {
        try {
            h(skkVar);
        } catch (DeadObjectException e) {
            a(tlk.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(tlk.e(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    @Override // defpackage.tlk
    public final /* bridge */ /* synthetic */ void d(fbc fbcVar, boolean z) {
    }

    @Override // defpackage.vkk
    public final boolean f(skk skkVar) {
        return false;
    }

    @Override // defpackage.vkk
    public final do6[] g(skk skkVar) {
        return null;
    }

    public final void h(skk skkVar) {
        this.b.d(Boolean.FALSE);
    }
}
