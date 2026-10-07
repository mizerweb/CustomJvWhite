package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class pih {
    public static final oih b = new oih();
    public final AtomicBoolean a = new AtomicBoolean(false);

    public Object a(cf7 cf7Var, mdh mdhVar) {
        Object objInvoke;
        return (this.a.compareAndSet(false, true) && (objInvoke = cf7Var.invoke(mdhVar)) == hu4.a) ? objInvoke : sbi.a;
    }
}
