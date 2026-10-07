package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xhf {
    public int b;
    public ev9 d;
    public Handler e;
    public boolean f;
    public final Object a = new Object();
    public final mw c = new mw(0);

    public final whf a(Object obj) {
        whf whfVarR;
        synchronized (this.a) {
            try {
                int iB = b();
                whfVarR = whf.r(iB, obj);
                if (this.f) {
                    whfVarR.u();
                } else {
                    this.c.put(Integer.valueOf(iB), whfVarR);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return whfVarR;
    }

    public final int b() {
        int i;
        synchronized (this.a) {
            i = this.b;
            this.b = i + 1;
        }
        return i;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this.a) {
            try {
                this.f = true;
                arrayList = new ArrayList(this.c.values());
                this.c.clear();
                if (this.d != null) {
                    Handler handler = this.e;
                    handler.getClass();
                    handler.post(this.d);
                    this.d = null;
                    this.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((whf) it.next()).u();
        }
    }

    public final void d(int i, Object obj) {
        synchronized (this.a) {
            try {
                whf whfVar = (whf) this.c.remove(Integer.valueOf(i));
                if (whfVar != null) {
                    if (whfVar.s().getClass() == obj.getClass()) {
                        whfVar.m(obj);
                    } else {
                        lvb.G0("SequencedFutureManager", "Type mismatch, expected " + whfVar.s().getClass() + ", but was " + obj.getClass());
                    }
                }
                if (this.d != null && this.c.isEmpty()) {
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
