package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class t8g implements r8g, jo5 {
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicReference b = new AtomicReference(null);
    public final /* synthetic */ r8g c;

    public t8g(r8g r8gVar, g8g g8gVar) {
        this.c = r8gVar;
    }

    @Override // defpackage.r8g
    public final void a(Object obj) {
        if (this.a.compareAndSet(false, true)) {
            this.c.a(obj);
        }
    }

    @Override // defpackage.r8g
    public final void b(jo5 jo5Var) {
        this.c.b(jo5Var);
    }

    @Override // defpackage.jo5
    public final void dispose() {
        jo5 jo5Var;
        if (!this.a.compareAndSet(false, true) || (jo5Var = (jo5) this.b.getAndSet(null)) == null) {
            return;
        }
        jo5Var.dispose();
    }

    @Override // defpackage.r8g
    public final void onError(Throwable th) {
        Object poeVar;
        if (this.a.compareAndSet(false, true)) {
            try {
                poeVar = sbi.a;
            } catch (Throwable th2) {
                poeVar = new poe(th2);
            }
            boolean z = poeVar instanceof poe;
            r8g r8gVar = this.c;
            if (!z) {
                r8gVar.a(poeVar);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                r8gVar.onError(thA);
            }
        }
    }
}
