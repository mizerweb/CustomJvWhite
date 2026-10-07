package com.vk.push.core.data.repository;

import android.content.Context;
import com.vk.push.common.Logger;
import com.vk.push.core.data.repository.IssueKey;
import defpackage.cqk;
import defpackage.hv4;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/push/core/data/repository/CrashSenderRepositoryFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "tracerLibraryPackageName", "Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;", "issueKeyBlackListRepository", "Lcom/vk/push/common/Logger;", "logger", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "createCrashSenderRepository", "(Landroid/content/Context;Ljava/lang/String;Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;Lcom/vk/push/common/Logger;)Lcom/vk/push/core/data/repository/CrashReporterRepository;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CrashSenderRepositoryFactory {

    @Deprecated
    public static final String TRACER_CRASH_REPORTER_CLASS_NAME = "ru.ok.tracer.lite.crash.report.TracerCrashReportLite";

    @Deprecated
    public static final String TRACER_LITE_CLASS_NAME = "ru.ok.tracer.lite.TracerLite";

    public final CrashReporterRepository createCrashSenderRepository(Context context, String tracerLibraryPackageName, IssueKeyBlackListRepository issueKeyBlackListRepository, Logger logger) {
        try {
            Object objNewInstance = ((Constructor) a.a1(TracerLite.class.getConstructors())).newInstance(context, tracerLibraryPackageName);
            int i = TracerCrashReportLite.a;
            final Object objNewInstance2 = ((Constructor) a.a1(TracerCrashReportLite.class.getConstructors())).newInstance(objNewInstance);
            for (final Method method : TracerCrashReportLite.class.getMethods()) {
                if (cqk.d(method.getName(), "report") && method.getParameterCount() == 2) {
                    Logger.DefaultImpls.info$default(logger, "Using real crash reporter", null, 2, null);
                    return new CrashSenderImpl(new CrashReporterRepository(this) { // from class: gv4
                        @Override // com.vk.push.core.data.repository.CrashReporterRepository
                        public final void nonFatalReport(Throwable th, IssueKey issueKey) {
                            try {
                                method.invoke(objNewInstance2, th, issueKey.name().toLowerCase(Locale.ROOT));
                            } catch (Throwable unused) {
                            }
                        }
                    }, issueKeyBlackListRepository, null, logger, 4, null);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Throwable unused) {
            Logger.DefaultImpls.info$default(logger, "Using stub crash reporter", null, 2, null);
            return new hv4();
        }
    }
}
