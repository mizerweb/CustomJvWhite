package ru.ok.android.externcalls.sdk.feature;

import defpackage.af7;
import defpackage.bu1;
import defpackage.c;
import defpackage.cf7;
import defpackage.oi1;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u001cJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJA\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010JO\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager;", "", "Loi1;", "feature", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;", "listener", "Lsbi;", "addFeatureListener", "(Loi1;Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;)V", "removeFeatureListener", "Lkotlin/Function0;", "onComplete", "Lkotlin/Function1;", "", "onError", "enableFeatureForAll", "(Loi1;Laf7;Lcf7;)V", "", "Lbu1;", "roles", "enableFeatureForRoles", "(Loi1;Ljava/util/Set;Laf7;Lcf7;)V", "", "isFeatureEnabled", "(Loi1;)Z", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "getFeatureRoles", "(Loi1;)Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "FeatureListener", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ConversationFeatureManager {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;", "", "Loi1;", "feature", "", "isEnabled", "Lsbi;", "onFeatureEnabledChanged", "(Loi1;Z)V", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "roles", "onFeatureRolesChanged", "(Loi1;Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface FeatureListener {

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static void onFeatureEnabledChanged(FeatureListener featureListener, oi1 oi1Var, boolean z) {
                FeatureListener.super.onFeatureEnabledChanged(oi1Var, z);
            }

            @Deprecated
            public static void onFeatureRolesChanged(FeatureListener featureListener, oi1 oi1Var, FeatureRoles featureRoles) {
                FeatureListener.super.onFeatureRolesChanged(oi1Var, featureRoles);
            }
        }

        default void onFeatureEnabledChanged(oi1 feature, boolean isEnabled) {
        }

        default void onFeatureRolesChanged(oi1 feature, FeatureRoles roles) {
        }
    }

    static /* synthetic */ void enableFeatureForAll$default(ConversationFeatureManager conversationFeatureManager, oi1 oi1Var, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: enableFeatureForAll");
            return;
        }
        if ((i & 2) != 0) {
            af7Var = null;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        conversationFeatureManager.enableFeatureForAll(oi1Var, af7Var, cf7Var);
    }

    static /* synthetic */ void enableFeatureForRoles$default(ConversationFeatureManager conversationFeatureManager, oi1 oi1Var, Set set, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: enableFeatureForRoles");
            return;
        }
        if ((i & 4) != 0) {
            af7Var = null;
        }
        if ((i & 8) != 0) {
            cf7Var = null;
        }
        conversationFeatureManager.enableFeatureForRoles(oi1Var, set, af7Var, cf7Var);
    }

    void addFeatureListener(oi1 feature, FeatureListener listener);

    void enableFeatureForAll(oi1 feature, af7 onComplete, cf7 onError);

    void enableFeatureForRoles(oi1 feature, Set<? extends bu1> roles, af7 onComplete, cf7 onError);

    FeatureRoles getFeatureRoles(oi1 feature);

    boolean isFeatureEnabled(oi1 feature);

    void removeFeatureListener(oi1 feature, FeatureListener listener);
}
