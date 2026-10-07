package ru.ok.android.externcalls.sdk;

import defpackage.af7;
import java.io.Serializable;
import java.util.ArrayList;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.MappingContext;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationImpl b;
    public final /* synthetic */ MappingContext c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ k(ConversationImpl conversationImpl, Serializable serializable, MappingContext mappingContext, int i) {
        this.a = i;
        this.b = conversationImpl;
        this.d = serializable;
        this.c = mappingContext;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        MappingContext mappingContext = this.c;
        Serializable serializable = this.d;
        ConversationImpl conversationImpl = this.b;
        switch (i) {
            case 0:
                return conversationImpl.lambda$withInternalIds$37((ArrayList) serializable, mappingContext);
            default:
                return conversationImpl.lambda$withInternalId$35((ParticipantId) serializable, mappingContext);
        }
    }
}
