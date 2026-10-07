package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class kqb implements rrb, ko5 {
    public final rrb a;
    public final boolean b;
    public ko5 c;
    public long d;
    public boolean e;

    public kqb(rrb rrbVar, boolean z) {
        this.a = rrbVar;
        this.b = z;
    }

    @Override // defpackage.rrb
    public final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        boolean z = this.b;
        rrb rrbVar = this.a;
        if (z) {
            rrbVar.onError(new NoSuchElementException());
        } else {
            rrbVar.b();
        }
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        if (oo5.f(this.c, ko5Var)) {
            this.c = ko5Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        if (this.e) {
            return;
        }
        long j = this.d;
        if (j != 0) {
            this.d = j + 1;
            return;
        }
        this.e = true;
        this.c.dispose();
        rrb rrbVar = this.a;
        rrbVar.d(obj);
        rrbVar.b();
    }

    @Override // defpackage.ko5
    public final void dispose() {
        this.c.dispose();
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        if (this.e) {
            tre.s0(th);
        } else {
            this.e = true;
            this.a.onError(th);
        }
    }
}
