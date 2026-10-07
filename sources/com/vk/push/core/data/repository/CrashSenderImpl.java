package com.vk.push.core.data.repository;

import com.vk.push.common.Logger;
import defpackage.ao5;
import defpackage.cqk;
import defpackage.gu4;
import defpackage.j95;
import defpackage.lb5;
import defpackage.lq4;
import defpackage.vk4;
import defpackage.yab;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/vk/push/core/data/repository/CrashSenderImpl;", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "crashSender", "Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;", "issueKeyBlackListRepository", "Lgu4;", "scope", "Lcom/vk/push/common/Logger;", "logger", "<init>", "(Lcom/vk/push/core/data/repository/CrashReporterRepository;Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;Lgu4;Lcom/vk/push/common/Logger;)V", "", "error", "Lcom/vk/push/core/data/repository/IssueKey;", "issueKey", "Lsbi;", "nonFatalReport", "(Ljava/lang/Throwable;Lcom/vk/push/core/data/repository/IssueKey;)V", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CrashSenderImpl implements CrashReporterRepository {
    public final CrashReporterRepository a;
    public final IssueKeyBlackListRepository b;
    public final gu4 c;
    public final Logger d;

    public CrashSenderImpl(CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, gu4 gu4Var, Logger logger) {
        this.a = crashReporterRepository;
        this.b = issueKeyBlackListRepository;
        this.c = gu4Var;
        this.d = logger.createLogger("ErrorSender");
    }

    @Override // com.vk.push.core.data.repository.CrashReporterRepository
    public void nonFatalReport(Throwable error, IssueKey issueKey) {
        yab.i0(this.c, null, 0, new vk4(issueKey, this, error, (lq4) null, 4), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CrashSenderImpl(CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, gu4 gu4Var, Logger logger, int i, j95 j95Var) {
        if ((i & 4) != 0) {
            ao5 ao5Var = ao5.a;
            gu4Var = cqk.a(lb5.c);
        }
        this(crashReporterRepository, issueKeyBlackListRepository, gu4Var, logger);
    }
}
