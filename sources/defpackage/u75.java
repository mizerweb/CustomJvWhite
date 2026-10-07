package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class u75 implements zd6 {
    public long a;
    public long b;
    public Object c;

    public u75(a2c a2cVar) {
        this.c = a2cVar;
        z1c z1cVar = a2cVar.a;
        this.a = z1cVar.e;
        this.b = z1cVar.d;
    }

    @Override // defpackage.zd6
    public long a() {
        return this.b;
    }

    @Override // defpackage.zd6
    public long b() {
        return this.a;
    }

    @Override // defpackage.zd6
    public void c(Collection collection) {
        ((a2c) this.c).a.i.invoke(collection);
    }

    @Override // defpackage.zd6
    public void d(ArrayList arrayList) {
        ((a2c) this.c).a.h.invoke(arrayList);
    }

    public u75() {
    }
}
