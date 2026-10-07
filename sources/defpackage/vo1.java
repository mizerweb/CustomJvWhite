package defpackage;

import java.util.Iterator;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;

/* JADX INFO: loaded from: classes4.dex */
public final class vo1 extends mdh implements qf7 {
    public final /* synthetic */ wo1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo1(wo1 wo1Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = wo1Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new vo1(this.e, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        vo1 vo1Var = (vo1) create((gu4) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        vo1Var.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        je9 je9Var = je9.d;
        ch3.d0(obj);
        wo1 wo1Var = this.e;
        zv8[] zv8VarArr = wo1.j;
        Conversation conversationA = ((f9) wo1Var.a.getValue()).a();
        ParticipantCollection participants = conversationA != null ? conversationA.getParticipants() : null;
        boolean zBooleanValue = ((Boolean) ((e5d) this.e.b.getValue()).H0.a(e5d.S6[84]).i()).booleanValue();
        mjg mjgVar = this.e.h;
        if (!zBooleanValue) {
            Boolean bool = Boolean.FALSE;
            mjgVar.getClass();
            mjgVar.j(null, bool);
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallInviteToP2PController", "Invite to p2p toggle disabled. Skip check.", null);
            }
        } else if (((Boolean) mjgVar.getValue()).booleanValue()) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "CallInviteToP2PController", "Invite to p2p already enabled. Skip check.", null);
            }
        } else if (participants == null || participants.size() > 2) {
            mjg mjgVar2 = this.e.h;
            Boolean bool2 = Boolean.TRUE;
            mjgVar2.getClass();
            mjgVar2.j(null, bool2);
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, "CallInviteToP2PController", "Call is not p2p call. Skip check.", null);
            }
        } else if (this.e.f.get()) {
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, "CallInviteToP2PController", "Invite to p2p check in progress.", null);
            }
        } else {
            if (participants.isEmpty()) {
                z = true;
            } else {
                Iterator<ConversationParticipant> it = participants.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ConversationParticipant next = it.next();
                        if (!next.getCapabilities().has(ClientCapabilities.Capability.ADD_PARTICIPANT) || !next.isUseable() || !next.isCallAccepted()) {
                            z = false;
                        }
                    } else {
                        z = true;
                    }
                }
            }
            if (z) {
                this.e.f.set(true);
                Conversation conversationA2 = ((f9) this.e.a.getValue()).a();
                ConversationFeatureManager featureManager = conversationA2 != null ? conversationA2.getFeatureManager() : null;
                if (featureManager != null) {
                    oi1 oi1Var = oi1.a;
                    wo1 wo1Var2 = this.e;
                    featureManager.enableFeatureForAll(oi1Var, new yk1(3, wo1Var2), new m(24, wo1Var2));
                }
            }
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                a4cVar5.c(je9Var, "CallInviteToP2PController", zo5.s("Check need enable invite to p2p feature needEnabled=", z), null);
            }
        }
        return sbi.a;
    }
}
