package defpackage;

import java.lang.ref.SoftReference;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class vpb extends b31 {
    public LinkedList e;

    @Override // defpackage.b31
    public final void a(Object obj) {
        upb upbVar = (upb) this.e.poll();
        if (upbVar == null) {
            upbVar = new upb();
            upbVar.a = null;
            upbVar.b = null;
            upbVar.c = null;
        }
        upbVar.a = new SoftReference(obj);
        upbVar.b = new SoftReference(obj);
        upbVar.c = new SoftReference(obj);
        this.c.add(upbVar);
    }

    @Override // defpackage.b31
    public final Object b() {
        upb upbVar = (upb) this.c.poll();
        upbVar.getClass();
        SoftReference softReference = upbVar.a;
        Object obj = softReference == null ? null : softReference.get();
        SoftReference softReference2 = upbVar.a;
        if (softReference2 != null) {
            softReference2.clear();
            upbVar.a = null;
        }
        SoftReference softReference3 = upbVar.b;
        if (softReference3 != null) {
            softReference3.clear();
            upbVar.b = null;
        }
        SoftReference softReference4 = upbVar.c;
        if (softReference4 != null) {
            softReference4.clear();
            upbVar.c = null;
        }
        this.e.add(upbVar);
        return obj;
    }
}
