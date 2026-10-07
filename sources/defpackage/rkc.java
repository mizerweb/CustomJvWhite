package defpackage;

import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes3.dex */
public final class rkc extends skc {
    public final ECPublicKey c;

    public rkc(kfk kfkVar, ECPublicKey eCPublicKey) {
        super(kfkVar, eCPublicKey);
        this.a = kfkVar;
        this.c = eCPublicKey;
    }

    @Override // defpackage.skc
    public final /* bridge */ /* synthetic */ PublicKey a() {
        return this.c;
    }
}
