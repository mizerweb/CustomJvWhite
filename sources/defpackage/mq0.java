package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class mq0 implements lq4, iu4, Serializable {
    public final lq4 a;

    public mq0(lq4 lq4Var) {
        this.a = lq4Var;
    }

    public lq4 create(lq4 lq4Var) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.iu4
    public iu4 getCallerFrame() {
        lq4 lq4Var = this.a;
        if (lq4Var instanceof iu4) {
            return (iu4) lq4Var;
        }
        return null;
    }

    public final lq4 getCompletion() {
        return this.a;
    }

    public StackTraceElement getStackTraceElement() {
        return oql.b(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.lq4
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            mq0 mq0Var = (mq0) r2;
            lq4 lq4Var = mq0Var.a;
            try {
                obj = mq0Var.invokeSuspend(obj);
                if (obj == hu4.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new poe(th);
            }
            mq0Var.releaseIntercepted();
            if (!(lq4Var instanceof mq0)) {
                lq4Var.resumeWith(obj);
                return;
            }
            r2 = lq4Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public lq4 create(Object obj, lq4 lq4Var) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
