package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class fg4 {
    public final azj a;
    public final Context b;
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();
    public Object e;

    public fg4(Context context, azj azjVar) {
        this.a = azjVar;
        this.b = context.getApplicationContext();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                this.a.d.execute(new f92(ww3.T1(this.d), 17, this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
