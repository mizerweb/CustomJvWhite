package ru.ok.android.externcalls.sdk.api.delegate;

import defpackage.at7;
import defpackage.bt7;
import defpackage.ct7;
import defpackage.dt7;
import defpackage.et7;
import defpackage.no;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.request.HangupConversation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/api/delegate/HangupDelegateImpl;", "Let7;", "Lno;", "apiClient", "", "anonToken", "<init>", "(Lno;Ljava/lang/String;)V", "Lat7;", "params", "Ldt7;", "invoke", "(Lat7;)Ldt7;", "Lno;", "Ljava/lang/String;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HangupDelegateImpl implements et7 {
    private final String anonToken;
    private final no apiClient;

    public HangupDelegateImpl(no noVar, String str) {
        this.apiClient = noVar;
        this.anonToken = str;
    }

    @Override // defpackage.et7
    public dt7 invoke(at7 params) {
        try {
            this.apiClient.a(new HangupConversation.Request(params.a, params.b, this.anonToken));
            return ct7.a;
        } catch (Exception e) {
            return new bt7(null, e);
        }
    }
}
