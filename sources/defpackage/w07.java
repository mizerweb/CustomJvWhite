package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w07 {
    public static final int a = Math.max(1, Integer.getInteger("rx3.buffer-size", np0.m).intValue());

    public final void a(g17 g17Var) {
        try {
            b(g17Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            iwl.a(th);
            tre.s0(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(g17 g17Var);
}
