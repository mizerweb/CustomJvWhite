package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class mqb implements rrb, ko5 {
    public final /* synthetic */ int a;
    public ko5 b;
    public long c;
    public boolean d;
    public final Object e;

    public /* synthetic */ mqb(int i, Object obj) {
        this.a = i;
        this.e = obj;
    }

    @Override // defpackage.rrb
    public final void b() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (!this.d) {
                    this.d = true;
                    ((mp9) obj).b();
                }
                break;
            default:
                if (!this.d) {
                    this.d = true;
                    ((s8g) obj).onError(new NoSuchElementException());
                }
                break;
        }
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (oo5.f(this.b, ko5Var)) {
                    this.b = ko5Var;
                    ((mp9) obj).c(this);
                }
                break;
            default:
                if (oo5.f(this.b, ko5Var)) {
                    this.b = ko5Var;
                    ((s8g) obj).c(this);
                }
                break;
        }
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                if (!this.d) {
                    long j = this.c;
                    if (j != 0) {
                        this.c = j + 1;
                    } else {
                        this.d = true;
                        this.b.dispose();
                        ((mp9) obj2).a(obj);
                    }
                    break;
                }
                break;
            default:
                if (!this.d) {
                    long j2 = this.c;
                    if (j2 != 0) {
                        this.c = j2 + 1;
                    } else {
                        this.d = true;
                        this.b.dispose();
                        ((s8g) obj2).a(obj);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.dispose();
                break;
            default:
                this.b.dispose();
                break;
        }
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (!this.d) {
                    this.d = true;
                    ((mp9) obj).onError(th);
                } else {
                    tre.s0(th);
                }
                break;
            default:
                if (!this.d) {
                    this.d = true;
                    ((s8g) obj).onError(th);
                } else {
                    tre.s0(th);
                }
                break;
        }
    }
}
