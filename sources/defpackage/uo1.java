package defpackage;

import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;

/* JADX INFO: loaded from: classes4.dex */
public final class uo1 implements ConversationFeatureManager.FeatureListener {
    public final /* synthetic */ wo1 a;
    public final /* synthetic */ ny8 b;

    public uo1(wo1 wo1Var, ny8 ny8Var) {
        this.a = wo1Var;
        this.b = ny8Var;
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager.FeatureListener
    public final void onFeatureEnabledChanged(oi1 oi1Var, boolean z) {
        super.onFeatureEnabledChanged(oi1Var, z);
        if (oi1Var != oi1.a) {
            gm0.Y(uo1.class.getName(), "Early return in onFeatureEnabledChanged cuz of feature != CallFeature.ADD_PARTICIPANT");
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallInviteToP2PController", "Add participant to p2p changed=" + z + " feature=" + oi1Var, null);
            }
        }
        qt4.C(z && ((Boolean) ((e5d) this.b.getValue()).H0.a(e5d.S6[84]).i()).booleanValue(), this.a.h, null);
    }
}
