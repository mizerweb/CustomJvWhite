package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class oue {
    public final kue b;
    public final Object a = new Object();
    public final LinkedHashMap c = new LinkedHashMap();
    public volatile int d = -1;

    public oue(Context context) {
        this.b = new kue(context, this);
    }

    public final void a(us7 us7Var, vuf vufVar) {
        synchronized (this.a) {
            try {
                if (this.b.canDetectOrientation()) {
                    mue mueVar = new mue(vufVar, us7Var);
                    this.c.put(vufVar, mueVar);
                    if (this.d != -1) {
                        mueVar.a(this.d);
                    }
                    if (this.c.size() == 1) {
                        this.b.enable();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(vuf vufVar) {
        synchronized (this.a) {
            try {
                mue mueVar = (mue) this.c.get(vufVar);
                if (mueVar != null) {
                    mueVar.c.set(false);
                    this.c.remove(vufVar);
                }
                if (this.c.isEmpty()) {
                    this.b.disable();
                    this.d = -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
