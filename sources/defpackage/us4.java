package defpackage;

import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.MultiEventListener;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class us4 implements ExternalIdsResolver.ExtraResolver {
    public final /* synthetic */ MultiEventListener a;

    public /* synthetic */ us4(MultiEventListener multiEventListener) {
        this.a = multiEventListener;
    }

    @Override // ru.ok.android.externcalls.sdk.id.ExternalIdsResolver.ExtraResolver
    public ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant) {
        return this.a.onExternalByInternalResolution(conversationParticipant);
    }
}
