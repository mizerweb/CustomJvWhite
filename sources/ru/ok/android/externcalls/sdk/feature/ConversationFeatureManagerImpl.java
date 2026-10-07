package ru.ok.android.externcalls.sdk.feature;

import defpackage.af7;
import defpackage.bu1;
import defpackage.cf7;
import defpackage.oi1;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutor;
import ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ>\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016JL\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006$"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManagerImpl;", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager;", "Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutor;", "Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListeners;", "commandExecutor", "featureListeners", "<init>", "(Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutor;Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListeners;)V", "Loi1;", "feature", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;", "listener", "Lsbi;", "addFeatureListener", "(Loi1;Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;)V", "removeFeatureListener", "Lkotlin/Function0;", "onComplete", "Lkotlin/Function1;", "", "onError", "enableFeatureForAll", "(Loi1;Laf7;Lcf7;)V", "", "Lbu1;", "roles", "enableFeatureForRoles", "(Loi1;Ljava/util/Set;Laf7;Lcf7;)V", "", "isFeatureEnabled", "(Loi1;)Z", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "getFeatureRoles", "(Loi1;)Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutor;", "Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListeners;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConversationFeatureManagerImpl implements ConversationFeatureManager, ConversationFeatureCommandExecutor, ConversationFeatureListeners {
    private final ConversationFeatureCommandExecutor commandExecutor;
    private final ConversationFeatureListeners featureListeners;

    public ConversationFeatureManagerImpl(ConversationFeatureCommandExecutor conversationFeatureCommandExecutor, ConversationFeatureListeners conversationFeatureListeners) {
        this.commandExecutor = conversationFeatureCommandExecutor;
        this.featureListeners = conversationFeatureListeners;
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager, ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public void addFeatureListener(oi1 feature, ConversationFeatureManager.FeatureListener listener) {
        this.featureListeners.addFeatureListener(feature, listener);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager, ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutor
    public void enableFeatureForAll(oi1 feature, af7 onComplete, cf7 onError) {
        this.commandExecutor.enableFeatureForAll(feature, onComplete, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager, ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutor
    public void enableFeatureForRoles(oi1 feature, Set<? extends bu1> roles, af7 onComplete, cf7 onError) {
        this.commandExecutor.enableFeatureForRoles(feature, roles, onComplete, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager, ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public FeatureRoles getFeatureRoles(oi1 feature) {
        return this.featureListeners.getFeatureRoles(feature);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager, ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public boolean isFeatureEnabled(oi1 feature) {
        return this.featureListeners.isFeatureEnabled(feature);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager, ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public void removeFeatureListener(oi1 feature, ConversationFeatureManager.FeatureListener listener) {
        this.featureListeners.removeFeatureListener(feature, listener);
    }
}
