package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import defpackage.af7;
import defpackage.bnf;
import defpackage.bu1;
import defpackage.cnf;
import defpackage.cqk;
import defpackage.d12;
import defpackage.dnf;
import defpackage.du1;
import defpackage.e12;
import defpackage.f12;
import defpackage.g12;
import defpackage.h12;
import defpackage.t91;
import defpackage.u91;
import defpackage.v91;
import defpackage.w91;
import defpackage.wm9;
import defpackage.x91;
import defpackage.y91;
import defpackage.ylc;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantStatesHandler;", "Lh12;", "Ly91;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "participantStatesManager", "Lkotlin/Function0;", "", "isMeCreatorOrAdmin", "<init>", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;Laf7;)V", "", "Ldu1;", "participants", "Lsbi;", "dismissAssistanceRequestIfAdminAppearedInRoom", "(Ljava/util/Collection;)V", "dismissAssistanceRequestIfNecessary", "()V", "lowerMyHandAndDismissAssistanceRequestIfNecessary", "Ld12;", "params", "onCurrentParticipantActiveRoomChanged", "(Ld12;)V", "Lt91;", "onActiveParticipantsAdded", "(Lt91;)V", "Lx91;", "onActiveParticipantUpdated", "(Lx91;)V", "Lu91;", "onActiveParticipantsChanged", "(Lu91;)V", "Lv91;", "onActiveParticipantsDeAnonimized", "(Lv91;)V", "Lw91;", "onActiveParticipantsRemoved", "(Lw91;)V", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Laf7;", "Ldnf;", "roomId", "Ldnf;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SessionRoomParticipantStatesHandler implements h12, y91 {
    private final af7 isMeCreatorOrAdmin;
    private final ParticipantStatesManagerImpl participantStatesManager;
    private dnf roomId = bnf.a;

    public SessionRoomParticipantStatesHandler(ParticipantStatesManagerImpl participantStatesManagerImpl, af7 af7Var) {
        this.participantStatesManager = participantStatesManagerImpl;
        this.isMeCreatorOrAdmin = af7Var;
    }

    private final void dismissAssistanceRequestIfAdminAppearedInRoom(Collection<du1> participants) {
        if (this.roomId instanceof bnf) {
            return;
        }
        Iterator<du1> it = participants.iterator();
        while (it.hasNext()) {
            List list = it.next().e;
            if (list.contains(bu1.b) || list.contains(bu1.a)) {
                dismissAssistanceRequestIfNecessary();
                return;
            }
        }
    }

    private final void dismissAssistanceRequestIfNecessary() {
        if (this.participantStatesManager.isAssistanceRequested()) {
            this.participantStatesManager.setAssistanceRequested(false);
        }
    }

    private final void lowerMyHandAndDismissAssistanceRequestIfNecessary() {
        ParticipantStatesManagerImpl participantStatesManagerImpl = this.participantStatesManager;
        ParticipantStatesManagerImpl.State state = ParticipantStatesManagerImpl.State.HAND_RAISED;
        ParticipantStatesManagerImpl.Companion companion = ParticipantStatesManagerImpl.INSTANCE;
        ParticipantStatesManagerImpl.updateMyStates$default(participantStatesManagerImpl, wm9.Q0(new ylc(state, companion.getSTATE_OFF()), new ylc(ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED, companion.getSTATE_OFF())), null, null, 6, null);
    }

    @Override // defpackage.y91
    public void onActiveParticipantUpdated(x91 params) {
        dismissAssistanceRequestIfAdminAppearedInRoom(params.b);
    }

    @Override // defpackage.y91
    public void onActiveParticipantsAdded(t91 params) {
        dismissAssistanceRequestIfAdminAppearedInRoom(params.a);
    }

    @Override // defpackage.y91
    public void onActiveParticipantsChanged(u91 params) {
        dismissAssistanceRequestIfAdminAppearedInRoom(params.a);
    }

    @Override // defpackage.y91
    public void onActiveParticipantsDeAnonimized(v91 params) {
        dismissAssistanceRequestIfAdminAppearedInRoom(params.a);
    }

    @Override // defpackage.y91
    public void onActiveParticipantsRemoved(w91 params) {
    }

    @Override // defpackage.h12
    public void onCurrentParticipantActiveRoomChanged(d12 params) {
        dnf dnfVar = this.roomId;
        dnf dnfVar2 = params.a;
        if (cqk.d(dnfVar, dnfVar2)) {
            return;
        }
        lowerMyHandAndDismissAssistanceRequestIfNecessary();
        if (((Boolean) this.isMeCreatorOrAdmin.invoke()).booleanValue() && (dnfVar2 instanceof cnf)) {
            ParticipantStatesManagerImpl.resetStates$default(this.participantStatesManager, ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED, (cnf) dnfVar2, null, null, 12, null);
        }
        this.roomId = dnfVar2;
    }

    @Override // defpackage.h12
    public void onCurrentParticipantInvitedToRoom(e12 e12Var) {
        e12Var.getClass();
    }

    @Override // defpackage.h12
    public void onRoomRemoved(f12 f12Var) {
        f12Var.getClass();
    }

    @Override // defpackage.h12
    public void onRoomUpdated(g12 g12Var) {
        g12Var.getClass();
    }
}
