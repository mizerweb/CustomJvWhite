package ru.ok.android.externcalls.sdk;

import defpackage.ky7;
import defpackage.my7;
import defpackage.sg4;
import java.util.ArrayList;
import java.util.Map;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements sg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sg4
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ConversationImpl.lambda$withInternalIds$38((sg4) obj2, (ArrayList) obj3, (Map) obj);
                break;
            case 1:
                ((ConversationImpl) obj2).lambda$requestHoldStateChange$27((my7) obj3, (ky7) obj);
                break;
            case 2:
                ((ConversationImpl) obj3).lambda$wrapExternalErrorConsumer$19((sg4) obj2, (Throwable) obj);
                break;
            default:
                ConversationImpl.lambda$withInternalId$36((ParticipantId) obj3, (sg4) obj2, (Map) obj);
                break;
        }
    }

    public /* synthetic */ l(Object obj, sg4 sg4Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = sg4Var;
    }
}
