package defpackage;

import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

/* JADX INFO: loaded from: classes4.dex */
public final class wa1 implements ConversationFeatureManager.FeatureListener {
    public final /* synthetic */ ya1 a;

    public wa1(ya1 ya1Var) {
        this.a = ya1Var;
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager.FeatureListener
    public final void onFeatureEnabledChanged(oi1 oi1Var, boolean z) {
        super.onFeatureEnabledChanged(oi1Var, z);
        if (oi1Var != oi1.b) {
            gm0.Y(wa1.class.getName(), "Early return in onFeatureEnabledChanged cuz of feature != CallFeature.RECORD");
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallAdminSettingsController", zo5.s("Record in call was changed for me to ", z), null);
            }
        }
        mjg mjgVar = this.a.u;
        while (true) {
            Object value = mjgVar.getValue();
            boolean z2 = z;
            if (mjgVar.h(value, gc.a((gc) value, false, false, false, false, z2, false, 111))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager.FeatureListener
    public final void onFeatureRolesChanged(oi1 oi1Var, FeatureRoles featureRoles) {
        Object value;
        super.onFeatureRolesChanged(oi1Var, featureRoles);
        if (oi1Var != oi1.b) {
            gm0.Y(wa1.class.getName(), "Early return in onFeatureRolesChanged cuz of feature != CallFeature.RECORD");
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallAdminSettingsController", "Record in call was changed for role=" + featureRoles, null);
            }
        }
        boolean z = featureRoles instanceof FeatureRoles.EnabledForAll;
        mjg mjgVar = this.a.u;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, gc.a((gc) value, false, false, false, false, z, false, 111)));
        if (this.a.m()) {
            this.a.s.a(new qd(z));
        }
    }
}
