package defpackage;

import java.lang.ref.WeakReference;
import one.me.sdk.arch.Widget;
import one.me.sdk.arch.internal.BinderNotFoundValueException;

/* JADX INFO: loaded from: classes.dex */
public final class ow0 implements j8e, ny8 {
    public final cf7 a;
    public final qf7 b;
    public final cf7 c;
    public Object d;
    public WeakReference e;
    public final nw0 f;

    public ow0(Widget widget, cf7 cf7Var, qf7 qf7Var, cf7 cf7Var2) {
        this.a = cf7Var;
        this.b = qf7Var;
        this.c = cf7Var2;
        this.f = new nw0(this, widget);
    }

    @Override // defpackage.ny8
    public final boolean d() {
        return this.d != null;
    }

    @Override // defpackage.ny8
    public final Object getValue() {
        Object obj = this.d;
        if (obj == null) {
            WeakReference weakReference = this.e;
            obj = weakReference != null ? weakReference.get() : null;
        }
        if (obj != null && ((Boolean) this.c.invoke(obj)).booleanValue()) {
            return obj;
        }
        try {
            Object objInvoke = this.a.invoke(obj);
            this.d = objInvoke;
            nw0 nw0Var = this.f;
            nw0Var.a = false;
            qf7 qf7Var = this.b;
            if (qf7Var != null) {
                qf7Var.invoke(objInvoke, nw0Var);
            }
            return objInvoke;
        } catch (BinderNotFoundValueException e) {
            throw e;
        } catch (Throwable th) {
            throw new BinderNotFoundValueException("could not extract value", th);
        }
    }

    @Override // defpackage.j8e
    public final Object m(Object obj, zv8 zv8Var) {
        return getValue();
    }

    public /* synthetic */ ow0(Widget widget, cf7 cf7Var, gvj gvjVar, int i) {
        this(widget, cf7Var, (i & 4) != 0 ? null : gvjVar, new c6(16));
    }
}
