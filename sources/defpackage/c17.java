package defpackage;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.NoSuchElementException;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class c17 extends bg5 implements g17 {
    public final boolean c;
    public r7h d;
    public boolean e;

    public c17(g17 g17Var, boolean z) {
        super(g17Var);
        this.c = z;
    }

    @Override // defpackage.g17
    public final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        Object obj = this.b;
        this.b = null;
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            g(obj);
            return;
        }
        boolean z = this.c;
        g17 g17Var = this.a;
        if (z) {
            g17Var.onError(new NoSuchElementException());
        } else {
            g17Var.b();
        }
    }

    @Override // defpackage.r7h
    public final void cancel() {
        set(4);
        this.b = null;
        this.d.cancel();
    }

    @Override // defpackage.g17
    public final void d(Object obj) {
        if (this.e) {
            return;
        }
        if (this.b == null) {
            this.b = obj;
            return;
        }
        this.e = true;
        this.d.cancel();
        this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // defpackage.g17
    public final void e(r7h r7hVar) {
        if (this.d != null) {
            r7hVar.cancel();
            tre.s0(new ProtocolViolationException("Subscription already set!"));
        } else {
            this.d = r7hVar;
            this.a.e(this);
            r7hVar.f(BuildConfig.MAX_TIME_TO_UPLOAD);
        }
    }

    @Override // defpackage.g17
    public final void onError(Throwable th) {
        if (this.e) {
            tre.s0(th);
        } else {
            this.e = true;
            this.a.onError(th);
        }
    }
}
