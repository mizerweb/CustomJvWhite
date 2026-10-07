package defpackage;

import android.os.Build;
import android.telecom.CallAudioState;
import android.telecom.CallEndpoint;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class re1 extends Connection {
    public static final /* synthetic */ int d = 0;
    public final ue1 a;
    public final String b;
    public Boolean c;

    public re1(ue1 ue1Var, String str, boolean z) {
        this.a = ue1Var;
        this.b = str;
        if (z) {
            setAudioModeIsVoip(true);
            setInitializing();
        }
        setConnectionProperties(np0.m);
        setConnectionCapabilities(67);
    }

    public final void a(int i) {
        if (getState() != 6) {
            setDisconnected(new DisconnectCause(i));
        }
        destroy();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallConnection", zo5.h(i, "Connection destroyed, cause="), null);
        }
    }

    public final void b() {
        je9 je9Var = je9.d;
        if (getState() != 6) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallConnection", "markActive!", null);
            }
            setActive();
            return;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "CallConnection", zo5.h(getState(), "markActive skipped because of state, state="), null);
        }
    }

    @Override // android.telecom.Connection
    public final void onAnswer(int i) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallConnection", zo5.h(i, "onAnswer videoState="), null);
            }
        }
        this.a.i(this.b, i != 0);
    }

    @Override // android.telecom.Connection
    public final void onAvailableCallEndpointsChanged(List list) {
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallConnection", c0a.k(list.size(), "onAvailableCallEndpointsChanged: ", " endpoints"), null);
        }
        ue1 ue1Var = this.a;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            ue1Var.getClass();
            if (a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "CallConnectionController", c0a.k(list.size(), "onAvailableCallEndpointsChanged: ", " endpoints"), null);
            }
        }
        ue1Var.p = list;
        j22 j22Var = ue1Var.m;
        if (j22Var != null) {
            j22Var.invoke(list);
        }
    }

    @Override // android.telecom.Connection
    public final void onCallAudioStateChanged(CallAudioState callAudioState) throws Exception {
        p85 p85Var;
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallConnection", qv1.j("onCallAudioStateChanged: route=", callAudioState != null ? Integer.valueOf(callAudioState.getRoute()) : null), null);
        }
        if (callAudioState != null) {
            ue1 ue1Var = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                ue1Var.getClass();
                if (a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, "CallConnectionController", "onCallAudioStateChanged: route=" + callAudioState.getRoute() + ", muted=" + callAudioState.isMuted(), null);
                }
            }
            CallAudioState callAudioState2 = ue1Var.r;
            Boolean boolValueOf = callAudioState2 != null ? Boolean.valueOf(callAudioState2.isMuted()) : null;
            ue1Var.r = callAudioState;
            w14 w14Var = ue1Var.n;
            if (w14Var != null) {
                w14Var.invoke(callAudioState);
            }
            re1 re1VarA = ue1Var.a();
            if (boolValueOf == null || re1VarA == null || boolValueOf.equals(Boolean.valueOf(callAudioState.isMuted())) || (p85Var = (p85) ue1Var.h.get(new z02(re1VarA.b))) == null) {
                return;
            }
            boolean zIsMuted = callAudioState.isMuted();
            y85 y85Var = p85Var.a;
            if ((!((ac1) y85Var.L()).c()) != zIsMuted) {
                ((ac1) y85Var.L()).d(!zIsMuted);
            }
        }
    }

    @Override // android.telecom.Connection
    public final void onCallEndpointChanged(CallEndpoint callEndpoint) {
        String strH;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                if (Build.VERSION.SDK_INT >= 34) {
                    strH = zo5.h(callEndpoint.getEndpointType(), "onCallEndpointChanged: type=");
                } else {
                    strH = "onCallEndpointChanged: " + callEndpoint;
                }
                a4cVar.c(je9Var, "CallConnection", strH, null);
            }
        }
        ue1 ue1Var = this.a;
        ue1Var.q = callEndpoint;
        rd4 rd4Var = ue1Var.l;
        if (rd4Var != null) {
            rd4Var.invoke(callEndpoint);
        }
    }

    @Override // android.telecom.Connection
    public final void onDisconnect() {
        gm0.n("CallConnection", "onDisconnect");
        this.a.n(this.b);
        a(2);
    }

    @Override // android.telecom.Connection
    public final void onHold() {
        gm0.n("CallConnection", "onHold");
        ue1 ue1Var = this.a;
        String str = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            ue1Var.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallConnectionController", "onHoldFromConnection session=".concat(str), null);
            }
        }
        p85 p85Var = (p85) ue1Var.h.get(new z02(str));
        if (p85Var != null) {
            y85 y85Var = p85Var.a;
            if (((Boolean) y85Var.U().y().i()).booleanValue()) {
                gm0.n("CallEngineTag", "onHold");
                ((b95) y85Var.y.getValue()).k(y85Var.a);
            } else {
                gm0.n("CallEngineTag", "onHold: muting mic");
                if (((ac1) y85Var.L()).c()) {
                    ((ac1) y85Var.L()).d(false);
                }
                y85Var.N().f(y85Var.a);
            }
        }
    }

    @Override // android.telecom.Connection
    public final void onMuteStateChanged(boolean z) {
        p85 p85Var;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallConnection", zo5.s("onMuteStateChanged: muted=", z), null);
            }
        }
        Boolean bool = this.c;
        this.c = Boolean.valueOf(z);
        if (bool == null || bool.equals(Boolean.valueOf(z))) {
            return;
        }
        ue1 ue1Var = this.a;
        String str = this.b;
        re1 re1Var = (re1) ue1Var.i.get(new z02(str));
        if ((re1Var == null || re1Var.getState() != 5) && (p85Var = (p85) ue1Var.h.get(new z02(str))) != null) {
            y85 y85Var = p85Var.a;
            if ((!((ac1) y85Var.L()).c()) != z) {
                ((ac1) y85Var.L()).d(!z);
            }
        }
    }

    @Override // android.telecom.Connection
    public final void onReject() {
        gm0.n("CallConnection", "onReject");
        this.a.n(this.b);
        a(6);
    }

    @Override // android.telecom.Connection
    public final void onShowIncomingCallUi() {
        gm0.n("CallConnection", "onShowIncomingCallUi");
        ue1 ue1Var = this.a;
        String str = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            ue1Var.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallConnectionController", "onShowIncomingCallUi session=".concat(str), null);
            }
        }
        xni xniVar = ue1Var.o;
        if (xniVar != null) {
            xniVar.invoke(new z02(str));
        }
    }

    @Override // android.telecom.Connection
    public final void onSilence() {
        gm0.n("CallConnection", "onSilence");
        ue1 ue1Var = this.a;
        String str = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            ue1Var.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallConnectionController", "onSilenceFromConnection session=".concat(str), null);
            }
        }
        p85 p85Var = (p85) ue1Var.h.get(new z02(str));
        if (p85Var != null) {
            eqe eqeVarV = p85Var.a.V();
            eqeVarV.e = 0;
            eqeVarV.a().e();
        }
    }

    @Override // android.telecom.Connection
    public final void onStateChanged(int i) {
        super.onStateChanged(i);
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallConnection", zo5.h(i, "current connection state: "), null);
        }
    }

    @Override // android.telecom.Connection
    public final void onUnhold() {
        gm0.n("CallConnection", "onUnhold");
        ue1 ue1Var = this.a;
        String str = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            ue1Var.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallConnectionController", "onUnholdFromConnection session=".concat(str), null);
            }
        }
        p85 p85Var = (p85) ue1Var.h.get(new z02(str));
        if (p85Var != null) {
            gm0.n("CallEngineTag", "onUnhold: resuming connection");
            y85 y85Var = p85Var.a;
            y85Var.N().r(y85Var.a);
        }
    }

    @Override // android.telecom.Connection
    public final void onAnswer() {
        gm0.n("CallConnection", "onAnswer");
        this.a.i(this.b, false);
    }
}
