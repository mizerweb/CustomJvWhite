package defpackage;

import com.vk.push.core.data.repository.IssueKeyBlackListRepository;

/* JADX INFO: loaded from: classes2.dex */
public final class in8 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ IssueKeyBlackListRepository e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in8(IssueKeyBlackListRepository issueKeyBlackListRepository, lq4 lq4Var) {
        super(lq4Var);
        this.e = issueKeyBlackListRepository;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.setBlackList(null, this);
    }
}
