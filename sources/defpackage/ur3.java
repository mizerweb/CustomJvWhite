package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ur3 extends ClassValue {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class cls) {
        e9b e9bVar = new e9b();
        e9bVar.a = new SoftReference(null);
        return e9bVar;
    }
}
