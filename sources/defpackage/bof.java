package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class bof extends kih {
    public String c;

    public bof(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals(ApiProtocol.KEY_TOKEN)) {
            this.c = fkaVar.S0();
        } else {
            fkaVar.x();
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.o("{token='", ch3.y(this.c), "'}");
    }
}
