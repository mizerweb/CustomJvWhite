package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class hp9 extends AtomicReference implements mp9, ko5, s8g {
    public final /* synthetic */ int a;
    public final mp9 b;
    public final sf7 c;

    public /* synthetic */ hp9(mp9 mp9Var, sf7 sf7Var, int i) {
        this.a = i;
        this.b = mp9Var;
        this.c = sf7Var;
    }

    @Override // defpackage.mp9
    public final void a(Object obj) {
        int i = this.a;
        mp9 mp9Var = this.b;
        sf7 sf7Var = this.c;
        switch (i) {
            case 0:
                try {
                    Object objMo41apply = sf7Var.mo41apply(obj);
                    Objects.requireNonNull(objMo41apply, "The mapper returned a null SingleSource");
                    z9g z9gVar = (z9g) objMo41apply;
                    if (!d()) {
                        ((v7g) z9gVar).h(new fik(this, 20, mp9Var));
                    }
                } catch (Throwable th) {
                    iwl.a(th);
                    onError(th);
                    return;
                }
                break;
            default:
                try {
                    Object objMo41apply2 = sf7Var.mo41apply(obj);
                    Objects.requireNonNull(objMo41apply2, "The mapper returned a null MaybeSource");
                    op9 op9Var = (op9) objMo41apply2;
                    if (!d()) {
                        dp9 dp9Var = (dp9) op9Var;
                        dp9Var.a(new phf(this, mp9Var, false, 2));
                    }
                } catch (Throwable th2) {
                    iwl.a(th2);
                    onError(th2);
                }
                break;
        }
    }

    @Override // defpackage.mp9
    public void b() {
        this.b.b();
    }

    @Override // defpackage.mp9
    public final void c(ko5 ko5Var) {
        int i = this.a;
        mp9 mp9Var = this.b;
        switch (i) {
            case 0:
                if (oo5.e(this, ko5Var)) {
                    mp9Var.c(this);
                }
                break;
            default:
                if (oo5.e(this, ko5Var)) {
                    mp9Var.c(this);
                }
                break;
        }
    }

    public final boolean d() {
        switch (this.a) {
            case 0:
                break;
        }
        return oo5.b((ko5) get());
    }

    @Override // defpackage.ko5
    public final void dispose() {
        switch (this.a) {
            case 0:
                oo5.a(this);
                break;
            default:
                oo5.a(this);
                break;
        }
    }

    @Override // defpackage.mp9
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.b.onError(th);
                break;
            default:
                this.b.onError(th);
                break;
        }
    }
}
