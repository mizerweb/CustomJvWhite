package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class rqb implements rrb, o1e {
    public final rrb a;
    public ko5 b;
    public o1e c;
    public boolean d;
    public final /* synthetic */ int e;
    public final Object f;

    public rqb(rrb rrbVar, Object obj, int i) {
        this.e = i;
        this.a = rrbVar;
        this.f = obj;
    }

    @Override // defpackage.rrb
    public final void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.b();
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        if (oo5.f(this.b, ko5Var)) {
            this.b = ko5Var;
            if (ko5Var instanceof o1e) {
                this.c = (o1e) ko5Var;
            }
            this.a.c(this);
        }
    }

    @Override // defpackage.b7g
    public final void clear() {
        this.c.clear();
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        rrb rrbVar = this.a;
        switch (i) {
            case 0:
                try {
                    if (((edd) obj2).test(obj)) {
                        rrbVar.d(obj);
                    }
                } catch (Throwable th) {
                    iwl.a(th);
                    this.b.dispose();
                    onError(th);
                    return;
                }
                break;
            default:
                if (!this.d) {
                    try {
                        Object objMo41apply = ((sf7) obj2).mo41apply(obj);
                        Objects.requireNonNull(objMo41apply, "The mapper function returned a null value.");
                        rrbVar.d(objMo41apply);
                    } catch (Throwable th2) {
                        iwl.a(th2);
                        this.b.dispose();
                        onError(th2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        this.b.dispose();
    }

    @Override // defpackage.b7g
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // defpackage.p1e
    public int k() {
        switch (this.e) {
        }
        return 0;
    }

    @Override // defpackage.b7g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        if (this.d) {
            tre.s0(th);
        } else {
            this.d = true;
            this.a.onError(th);
        }
    }

    @Override // defpackage.b7g
    public final Object poll() {
        Object objPoll;
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                break;
            default:
                Object objPoll2 = this.c.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objMo41apply = ((sf7) obj).mo41apply(objPoll2);
                Objects.requireNonNull(objMo41apply, "The mapper function returned a null value.");
                return objMo41apply;
        }
        do {
            objPoll = this.c.poll();
            if (objPoll != null) {
            }
            return objPoll;
        } while (!((edd) obj).test(objPoll));
        return objPoll;
    }
}
