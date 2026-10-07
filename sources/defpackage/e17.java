package defpackage;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.NoSuchElementException;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class e17 implements g17, ko5, rrb {
    public final /* synthetic */ int a;
    public final s8g b;
    public Object c;
    public boolean d;
    public Object e;

    public /* synthetic */ e17(s8g s8gVar, int i) {
        this.a = i;
        this.b = s8gVar;
    }

    @Override // defpackage.g17
    public final void b() {
        Object obj;
        int i = this.a;
        s8g s8gVar = this.b;
        switch (i) {
            case 0:
                if (!this.d) {
                    this.d = true;
                    this.e = u7h.a;
                    Object obj2 = this.c;
                    this.c = null;
                    obj = obj2 != null ? obj2 : null;
                    if (obj == null) {
                        s8gVar.onError(new NoSuchElementException());
                    } else {
                        s8gVar.a(obj);
                    }
                    break;
                }
                break;
            default:
                if (!this.d) {
                    this.d = true;
                    Object obj3 = this.c;
                    this.c = null;
                    obj = obj3 != null ? obj3 : null;
                    if (obj == null) {
                        s8gVar.onError(new NoSuchElementException());
                    } else {
                        s8gVar.a(obj);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.rrb
    public void c(ko5 ko5Var) {
        if (oo5.f((ko5) this.e, ko5Var)) {
            this.e = ko5Var;
            this.b.c(this);
        }
    }

    @Override // defpackage.g17
    public final void d(Object obj) {
        int i = this.a;
        s8g s8gVar = this.b;
        switch (i) {
            case 0:
                if (!this.d) {
                    if (this.c == null) {
                        this.c = obj;
                    } else {
                        this.d = true;
                        ((r7h) this.e).cancel();
                        this.e = u7h.a;
                        s8gVar.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
            default:
                if (!this.d) {
                    if (this.c == null) {
                        this.c = obj;
                    } else {
                        this.d = true;
                        ((ko5) this.e).dispose();
                        s8gVar.onError(new IllegalArgumentException("Sequence contains more than one element!"));
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
                ((r7h) this.e).cancel();
                this.e = u7h.a;
                break;
            default:
                ((ko5) this.e).dispose();
                break;
        }
    }

    @Override // defpackage.g17
    public void e(r7h r7hVar) {
        if (((r7h) this.e) != null) {
            r7hVar.cancel();
            tre.s0(new ProtocolViolationException("Subscription already set!"));
        } else {
            this.e = r7hVar;
            this.b.c(this);
            r7hVar.f(BuildConfig.MAX_TIME_TO_UPLOAD);
        }
    }

    @Override // defpackage.g17
    public final void onError(Throwable th) {
        int i = this.a;
        s8g s8gVar = this.b;
        switch (i) {
            case 0:
                if (!this.d) {
                    this.d = true;
                    this.e = u7h.a;
                    s8gVar.onError(th);
                } else {
                    tre.s0(th);
                }
                break;
            default:
                if (!this.d) {
                    this.d = true;
                    s8gVar.onError(th);
                } else {
                    tre.s0(th);
                }
                break;
        }
    }
}
