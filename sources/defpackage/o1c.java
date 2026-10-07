package defpackage;

import android.app.Application;
import java.util.WeakHashMap;
import kotlin.KotlinNothingValueException;
import one.me.android.OneMeApplication;

/* JADX INFO: loaded from: classes.dex */
public final class o1c {
    public final gjg a;
    public final WeakHashMap b = new WeakHashMap();

    public o1c(gjg gjgVar) {
        this.a = gjgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(OneMeApplication oneMeApplication, oo3 oo3Var, nq4 nq4Var) {
        m1c m1cVar;
        if (nq4Var instanceof m1c) {
            m1cVar = (m1c) nq4Var;
            int i = m1cVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                m1cVar.f = i - Integer.MIN_VALUE;
            } else {
                m1cVar = new m1c(this, nq4Var);
            }
        } else {
            m1cVar = new m1c(this, nq4Var);
        }
        Object obj = m1cVar.d;
        int i2 = m1cVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            ((Application) oneMeApplication.getApplicationContext()).registerActivityLifecycleCallbacks(new n1c(oo3Var, this));
            k31 k31Var = new k31(2, this);
            m1cVar.f = 1;
            if (this.a.collect(k31Var, m1cVar) == hu4.a) {
                return;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            ch3.d0(obj);
        }
        throw new KotlinNothingValueException();
    }
}
