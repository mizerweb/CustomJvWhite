package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class psk extends syk {
    final /* synthetic */ wsk a;

    public psk(wsk wskVar) {
        this.a = wskVar;
    }

    @Override // defpackage.syk
    public final pyk a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.j();
    }
}
