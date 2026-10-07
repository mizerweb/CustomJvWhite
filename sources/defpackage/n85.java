package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class n85 implements g32 {
    public final /* synthetic */ y85 a;
    public final /* synthetic */ ny8 b;
    public final /* synthetic */ ny8 c;
    public final /* synthetic */ ny8 d;
    public final /* synthetic */ ny8 e;
    public final /* synthetic */ ny8 f;
    public final /* synthetic */ ny8 g;

    public n85(y85 y85Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = y85Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onAdminInCallChanged(boolean z) {
        Object value;
        dz4 dz4VarK;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallEngineTag", zo5.s("admin in call changed to isAdminHere : ", z), null);
            }
        }
        y85 y85Var = this.a;
        mjg mjgVar = y85Var.F1;
        do {
            value = mjgVar.getValue();
            dz4VarK = y85Var.K();
            if (dz4VarK.q instanceof oi6) {
                dz4VarK = dz4.a(dz4VarK, null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, new oi6(z), 131071);
            }
        } while (!mjgVar.h(value, dz4VarK));
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallAccepted() {
        Object value;
        dz4 dz4VarK;
        boolean z;
        gm0.n("CallEngineTag", "onCallAccepted");
        boolean z2 = this.a.K().g;
        this.a.G("onCallAccepted");
        super.onCallAccepted();
        Conversation conversationQ = this.a.Q();
        if (conversationQ != null && conversationQ.isCaller()) {
            sa2 sa2VarO = this.a.O();
            Conversation conversationQ2 = this.a.Q();
            String conversationId = conversationQ2 != null ? conversationQ2.getConversationId() : null;
            sa2VarO.getClass();
            sa2.c(sa2VarO, "CALL_RECEIVED_ACCEPT", conversationId, null, null, null, null, false, null, 492);
        }
        ((eqe) this.b.getValue()).e();
        zb1 zb1Var = (zb1) this.c.getValue();
        CallsAudioManager.State state = CallsAudioManager.State.CONVERSATION;
        rb0 rb0Var = (rb0) ((ac1) zb1Var).h.get();
        if (rb0Var != null) {
            rb0Var.a(state);
        }
        y85 y85Var = this.a;
        ny8 ny8Var = this.b;
        mjg mjgVar = y85Var.F1;
        do {
            value = mjgVar.getValue();
            dz4VarK = y85Var.K();
            z = (dz4VarK.i || dz4VarK.j) ? false : true;
            if (z) {
                eqe eqeVar = (eqe) ny8Var.getValue();
                eqeVar.e = 6;
                sw1 sw1VarA = eqeVar.a();
                sw1VarA.b(sw1VarA.g.e, true, 0);
            }
            y85Var.O().e = 5;
        } while (!mjgVar.h(value, dz4.a(dz4VarK, null, System.currentTimeMillis(), null, null, false, true, false, false, null, false, false, false, null, false, z ? ni6.a : y85Var.K().q, 131005)));
        if (!z2) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "VVV", " events.onCallAccepted(id)", null);
                }
            }
            y85 y85Var2 = this.a;
            y85Var2.e.m(y85Var2.a);
        }
        this.a.N().g(this.a.a);
        ((m02) this.d.getValue()).a((Context) this.e.getValue(), (k42) this.f.getValue());
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallEngineTag", "onCallEnded: " + conversationEndInfo, null);
            }
        }
        y85.E(this.a, conversationEndInfo.getReason());
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) throws IllegalAccessException, InvocationTargetException {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallEngineTag", "onDestroyed: " + conversationDestroyedInfo, null);
            }
        }
        dz4 dz4VarK = this.a.K();
        y85 y85Var = this.a;
        pi6 pi6Var = dz4VarK.q;
        if (!(pi6Var instanceof ii6) && !(pi6Var instanceof hi6) && !(pi6Var instanceof ki6)) {
            y85.E(y85Var, conversationDestroyedInfo.getReason());
        }
        this.a.a0();
        y85 y85Var2 = this.a;
        b95 b95Var = y85Var2.e;
        String str = y85Var2.a;
        Iterator it = b95Var.l.iterator();
        while (it.hasNext()) {
            ((f22) it.next()).m(str);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onJoinLinkUpdated(String str) {
        Object value;
        String str2 = str;
        y85 y85Var = this.a;
        mjg mjgVar = y85Var.F1;
        phl phlVar = y85Var.K().a;
        if (phlVar == null) {
            return;
        }
        if (phlVar instanceof m32) {
            while (true) {
                Object value2 = mjgVar.getValue();
                y85 y85Var2 = y85Var;
                mjg mjgVar2 = mjgVar;
                if (mjgVar2.h(value2, dz4.a(y85Var2.K(), new l32(str2, false), 0L, null, str2, false, false, false, true, null, false, false, false, null, false, null, 261878))) {
                    ((pe1) this.g.getValue()).i(str2);
                    return;
                } else {
                    mjgVar = mjgVar2;
                    y85Var = y85Var2;
                }
            }
        } else if (!(phlVar instanceof l32)) {
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, dz4.a(y85Var.K(), null, 0L, null, str, false, false, false, false, null, false, false, false, null, false, null, 262135)));
        } else {
            while (true) {
                Object value3 = mjgVar.getValue();
                phl phlVar2 = phlVar;
                if (mjgVar.h(value3, dz4.a(y85Var.K(), new l32(str2, ((l32) phlVar).b), 0L, null, str2, false, false, false, false, null, false, false, false, null, false, null, 262134))) {
                    return;
                }
                str2 = str;
                phlVar = phlVar2;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMeInWaitingRoomChanged(boolean z) {
        Object value;
        dz4 dz4VarA;
        je9 je9Var = je9.d;
        super.onMeInWaitingRoomChanged(z);
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", zo5.s("me waiting room changed: isMeInWaitingRoom=", z), null);
        }
        if (z) {
            this.a.N().g(this.a.a);
        }
        y85 y85Var = this.a;
        mjg mjgVar = y85Var.F1;
        do {
            value = mjgVar.getValue();
            dz4 dz4VarK = y85Var.K();
            if (z) {
                y85Var.O().e = 4;
                Conversation conversationQ = y85Var.Q();
                boolean zIsAdminHere = true;
                if (conversationQ != null && conversationQ.isWaitForAdminEnabled()) {
                    zIsAdminHere = conversationQ.isAdminHere();
                }
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, "CallEngineTag", zo5.s("me waiting room and admin is here: ", zIsAdminHere), null);
                }
                dz4VarA = dz4.a(dz4VarK, null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, new oi6(zIsAdminHere), 131071);
            } else {
                dz4VarA = dz4.a(dz4VarK, null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, mi6.a, 131071);
            }
        } while (!mjgVar.h(value, dz4VarA));
    }

    @Override // defpackage.g32, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        String strA;
        Object value;
        y85 y85Var = this.a;
        if (!y85Var.K().j) {
            mjg mjgVar = y85Var.F1;
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, dz4.a(y85Var.K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, null, 261631)));
        }
        y85Var.h0(connectedInfo.isFirstConnection());
        eqe eqeVar = (eqe) this.b.getValue();
        eqeVar.e = 7;
        sw1 sw1VarA = eqeVar.a();
        sw1VarA.b(sw1VarA.g.f, false, 0);
        if (connectedInfo.isFirstConnection() || (strA = ns4.a(y85Var.K().c)) == null) {
            return;
        }
        sa2 sa2VarO = y85Var.O();
        boolean z = y85Var.K().i;
        sa2VarO.getClass();
        sa2.c(sa2VarO, "BAD_CONNECTION_ALERT", strA, "RECONNECT", null, null, null, z, null, 376);
    }

    @Override // defpackage.g32, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        Object value;
        if (this.a.n()) {
            gm0.n("CallEngineTag", "onMediaDisconnected: ignored, call is on hold");
            return;
        }
        y85 y85Var = this.a;
        mjg mjgVar = y85Var.F1;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, dz4.a(y85Var.K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, ni6.a, 131071)));
        eqe eqeVarV = y85Var.V();
        eqeVarV.e = 6;
        sw1 sw1VarA = eqeVarV.a();
        sw1VarA.b(sw1VarA.g.e, true, 0);
        y85Var.O().e = 5;
        this.a.O().e = 7;
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onOpponentRegistered() {
        String conversationId;
        y85 y85Var = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallEngineTag", qv1.m("opponentRegistrationWait: onOpponentRegistered, cancel timer (active=", ")", ((vo8) y85Var.r1.m(y85Var, y85.O1[0])) != null), null);
            }
        }
        this.a.G("onOpponentRegistered");
        Conversation conversationQ = this.a.Q();
        if (conversationQ == null || (conversationId = conversationQ.getConversationId()) == null) {
            return;
        }
        this.a.O().b("CALL_REMOTE_RINGING", "CALL", null, null, conversationId);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsAdded(List list) {
        y85.F(this.a);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsChanged(List list) {
        y85 y85Var = this.a;
        if (y85Var.Z(list)) {
            y85Var.G("participant update");
        }
        y85.F(y85Var);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsRemoved(List list) {
        y85.F(this.a);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsUpdated(Collection collection) {
        y85.F(this.a);
    }
}
