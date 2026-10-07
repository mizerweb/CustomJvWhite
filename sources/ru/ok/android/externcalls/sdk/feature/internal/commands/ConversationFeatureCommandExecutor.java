package ru.ok.android.externcalls.sdk.feature.internal.commands;

import defpackage.af7;
import defpackage.bu1;
import defpackage.cf7;
import defpackage.oi1;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J=\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJK\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutor;", "", "Loi1;", "feature", "Lkotlin/Function0;", "Lsbi;", "onComplete", "Lkotlin/Function1;", "", "onError", "enableFeatureForAll", "(Loi1;Laf7;Lcf7;)V", "", "Lbu1;", "roles", "enableFeatureForRoles", "(Loi1;Ljava/util/Set;Laf7;Lcf7;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ConversationFeatureCommandExecutor {
    void enableFeatureForAll(oi1 feature, af7 onComplete, cf7 onError);

    void enableFeatureForRoles(oi1 feature, Set<? extends bu1> roles, af7 onComplete, cf7 onError);
}
