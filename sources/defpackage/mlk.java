package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mlk extends vkk {
    public final njh b;
    public final qjh c;
    public final a8g d;

    public mlk(int i, njh njhVar, qjh qjhVar, a8g a8gVar) {
        super(i);
        this.c = qjhVar;
        this.b = njhVar;
        this.d = a8gVar;
        if (i == 2 && njhVar.b) {
            ore.p("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.tlk
    public final void a(Status status) {
        this.d.getClass();
        this.c.c(vd7.x(status));
    }

    @Override // defpackage.tlk
    public final void b(Exception exc) {
        this.c.c(exc);
    }

    @Override // defpackage.tlk
    public final void c(skk skkVar) throws DeadObjectException {
        qjh qjhVar = this.c;
        try {
            this.b.a(skkVar.d, qjhVar);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(tlk.e(e2));
        } catch (RuntimeException e3) {
            qjhVar.c(e3);
        }
    }

    @Override // defpackage.tlk
    public final void d(fbc fbcVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) fbcVar.c;
        qjh qjhVar = this.c;
        map.put(qjhVar, boolValueOf);
        qjhVar.a.b(new phf(fbcVar, 15, qjhVar));
    }

    @Override // defpackage.vkk
    public final boolean f(skk skkVar) {
        return this.b.b;
    }

    @Override // defpackage.vkk
    public final do6[] g(skk skkVar) {
        return this.b.a;
    }
}
