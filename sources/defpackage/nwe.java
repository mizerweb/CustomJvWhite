package defpackage;

import ru.rustore.sdk.core.exception.RuStoreException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nwe implements bub, stb {
    public final /* synthetic */ fjh a;

    public /* synthetic */ nwe(fjh fjhVar) {
        this.a = fjhVar;
    }

    @Override // defpackage.bub
    public void a(Object obj) {
        this.a.b(eo6.a);
    }

    @Override // defpackage.stb
    public void onFailure(Throwable th) {
        if (!(th instanceof RuStoreException)) {
            new RuStoreException(th);
        }
        this.a.b(new fo6());
    }
}
