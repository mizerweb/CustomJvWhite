package defpackage;

import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class msb implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OkApiServiceInternal b;

    public /* synthetic */ msb(OkApiServiceInternal okApiServiceInternal, int i) {
        this.a = i;
        this.b = okApiServiceInternal;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        OkApiServiceInternal okApiServiceInternal = this.b;
        Long l = (Long) obj;
        switch (i) {
            case 0:
                return OkApiServiceInternal.getExternalIdsByOkIds$lambda$0(okApiServiceInternal, l.longValue());
            default:
                return OkApiServiceInternal.getOkIdsByExternalIds$lambda$0(okApiServiceInternal, l.longValue());
        }
    }
}
