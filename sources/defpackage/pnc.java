package defpackage;

import java.util.Collection;
import java.util.List;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* JADX INFO: loaded from: classes2.dex */
public final class pnc implements dnc, g32 {
    public static final /* synthetic */ zv8[] q;
    public final y82 a;
    public final j52 b;
    public final ar1 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ifh i;
    public sgg k;
    public sgg l;
    public final l9b m;
    public final p3c n;
    public final mjg o;
    public final mjg p;
    public final ifh h = new ifh(new iua(16, this));
    public final pzf j = e9i.a(1, 1, 2);

    static {
        z8b z8bVar = new z8b(pnc.class, "participantsUpdatesJob", "getParticipantsUpdatesJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        q = new zv8[]{z8bVar};
    }

    public pnc(ny8 ny8Var, ny8 ny8Var2, y82 y82Var, j52 j52Var, ar1 ar1Var, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = y82Var;
        this.b = j52Var;
        this.c = ar1Var;
        this.d = ny8Var;
        this.e = ny8Var4;
        this.f = ny8Var2;
        this.g = ny8Var5;
        this.i = new ifh(new w40(ny8Var5, 25));
        ((l92) ny8Var3.getValue()).f(this);
        this.m = new l9b();
        this.n = qyj.S();
        mjg mjgVarA = p90.a(new enc(tmc.e));
        this.o = mjgVarA;
        this.p = mjgVarA;
    }

    @Override // defpackage.dnc
    public final mjg a() {
        return this.p;
    }

    @Override // defpackage.dnc
    public final void clear() throws Throwable {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ParticipantsRepository", "Call participant state clear", null);
            }
        }
        Conversation conversationA = ((ms4) this.d.getValue()).a();
        ParticipantStatesManager participantStatesManager = conversationA != null ? conversationA.getParticipantStatesManager() : null;
        if (participantStatesManager != null) {
            participantStatesManager.removeHandListener((ParticipantStatesManager.Listener) this.h.getValue());
        }
        sgg sggVar = this.k;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.k = null;
        sgg sggVar2 = this.l;
        if (sggVar2 != null) {
            sggVar2.b(null);
        }
        this.l = null;
        p3c p3cVar = this.n;
        zv8[] zv8VarArr = q;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8VarArr[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        this.n.B(this, zv8VarArr[0], null);
        this.j.k();
        yab.i0(this.a, (xt4) this.i.getValue(), 0, new wz6(this, r66.a, tmc.c, null, 29), 2);
    }

    @Override // defpackage.dnc
    public final void e() {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ParticipantsRepository", zo5.h(((enc) this.p.getValue()).c.size(), "Call prepare participant state, current participants size="), null);
            }
        }
        pzf pzfVar = this.j;
        ghb ghbVar = ew5.b;
        lw5 lw5Var = lw5.MILLISECONDS;
        this.n.B(this, q[0], e9i.j0(e9i.T(new j3(new o24(e9i.I(new hnc(tre.N(pzfVar, qe7.P(300L, lw5Var), new wf0(16)), this, 0)), 24, this), 15, new jnc(4, null)), ((n0c) ((xhh) this.g.getValue())).a()), this.a));
        Conversation conversationA = ((ms4) this.d.getValue()).a();
        ParticipantStatesManager participantStatesManager = conversationA != null ? conversationA.getParticipantStatesManager() : null;
        if (participantStatesManager != null) {
            participantStatesManager.addHandListener((ParticipantStatesManager.Listener) this.h.getValue());
        }
        this.k = e9i.j0(new fz6(((z3f) this.f.getValue()).b, new nnc(this, null, 0), 3), this.a);
        this.l = e9i.j0(e9i.T(new fz6(new hnc(tre.N(new ra1(14, new ua1(new q8e(((ij4) this.e.getValue()).c), 8)), qe7.P(300L, lw5Var), new wf0(15)), this, 1), new nnc(this, null, 1), 3), ((n0c) ((xhh) this.g.getValue())).a()), this.a);
    }

    public final void f() {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ParticipantsRepository", zo5.s("ParticipantsRepository call notifyUpdate calls scope isActive=", cqk.x(this.a)), null);
            }
        }
        this.j.a(((ms4) this.d.getValue()).a());
    }

    @Override // defpackage.dnc
    public final tmc getMe() {
        return ((enc) this.p.getValue()).a;
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallEnded(ConversationEndInfo conversationEndInfo) throws Throwable {
        clear();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallParticipantsNetworkStatusChanged(List list) {
        f();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) throws Throwable {
        clear();
    }

    @Override // defpackage.g32, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        if (connectedInfo.isFirstConnection()) {
            f();
        } else {
            gm0.Y("ParticipantsRepository", "Early return in onMediaConnected cuz of !info.isFirstConnection");
        }
    }

    @Override // defpackage.g32, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantHoldStateChanged(qy7 qy7Var) {
        f();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsAdded(List list) {
        f();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsChanged(List list) {
        f();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsRemoved(List list) {
        f();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsUpdated(Collection collection) {
        f();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        f();
    }
}
