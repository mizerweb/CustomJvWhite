package defpackage;

import com.vk.push.core.data.repository.IssueKeyBlackListRepository;
import com.vk.push.core.feature.FeatureManagerImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class uo6 extends nq4 {
    public IssueKeyBlackListRepository d;
    public /* synthetic */ Object e;
    public final /* synthetic */ FeatureManagerImpl f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo6(FeatureManagerImpl featureManagerImpl, lq4 lq4Var) {
        super(lq4Var);
        this.f = featureManagerImpl;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return FeatureManagerImpl.access$saveIssueKeysBlacklist(this.f, this);
    }
}
