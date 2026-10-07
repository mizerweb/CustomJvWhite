package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class na1 implements ParticipantStatesManager.Listener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g32 b;

    public /* synthetic */ na1(g32 g32Var, int i) {
        this.a = i;
        this.b = g32Var;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
    public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
        ParticipantStatesManager.ParticipantStateChange participantStateChange;
        ConversationParticipant me2;
        int i = this.a;
        g32 g32Var = this.b;
        switch (i) {
            case 0:
                ya1 ya1Var = (ya1) g32Var;
                Conversation conversationA = ya1Var.f().a();
                Object obj = null;
                ParticipantId externalId = (conversationA == null || (me2 = conversationA.getMe()) == null) ? null : me2.getExternalId();
                for (Object obj2 : stateChangedEvent.getChanges()) {
                    if (cqk.d(((ParticipantStatesManager.ParticipantStateChange) obj2).getParticipantId(), externalId)) {
                        obj = obj2;
                        participantStateChange = (ParticipantStatesManager.ParticipantStateChange) obj;
                        if (participantStateChange == null && ya1Var.n.compareAndSet(!participantStateChange.isOn(), participantStateChange.isOn())) {
                            ya1Var.s.a(hd.a);
                            break;
                        }
                    }
                }
                participantStateChange = (ParticipantStatesManager.ParticipantStateChange) obj;
                if (participantStateChange == null) {
                }
                break;
            default:
                ((pnc) g32Var).f();
                break;
        }
    }
}
