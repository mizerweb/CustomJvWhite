package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class zib extends kih {
    public String c;
    public long d;

    public zib(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
            this.d = ch3.T(fkaVar, 0L);
        } else if (str.equals("text")) {
            this.c = ch3.W(fkaVar);
        } else {
            fkaVar.x();
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sbT = qt4.t(this.d, "{chatId='", ", text='", this.c);
        sbT.append("'}");
        return sbT.toString();
    }
}
