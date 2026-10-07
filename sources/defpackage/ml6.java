package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ml6 extends iye {
    public final HashMap e = new HashMap();

    @Override // defpackage.iye
    public final eye a(Object obj) {
        return (eye) this.e.get(obj);
    }

    @Override // defpackage.iye
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.e.remove(obj);
        return objB;
    }
}
