package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dp9 implements op9 {
    public final void a(mp9 mp9Var) {
        try {
            c(mp9Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            iwl.a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void c(mp9 mp9Var);
}
