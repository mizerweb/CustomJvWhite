package com.vk.push.core.feature;

import android.content.Context;
import com.vk.push.common.Logger;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.IssueKey;
import com.vk.push.core.data.repository.IssueKeyBlackListRepository;
import com.vk.push.core.filedatastore.FileDataSource;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.remote.config.omicron.AnalyticsHandler;
import com.vk.push.core.remote.config.omicron.DataId;
import com.vk.push.core.remote.config.omicron.Omicron;
import com.vk.push.core.remote.config.omicron.ParseException;
import com.vk.push.core.remote.config.omicron.segment.SegmentsHolder;
import defpackage.ao5;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.gu4;
import defpackage.hu4;
import defpackage.j95;
import defpackage.jd3;
import defpackage.lb5;
import defpackage.lq4;
import defpackage.np0;
import defpackage.ore;
import defpackage.po6;
import defpackage.poe;
import defpackage.qo6;
import defpackage.qv1;
import defpackage.rl0;
import defpackage.ro6;
import defpackage.roe;
import defpackage.sgg;
import defpackage.so6;
import defpackage.to6;
import defpackage.vo6;
import defpackage.ww3;
import defpackage.y5h;
import defpackage.yab;
import defpackage.zo5;
import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001!BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u001bJ\u001b\u0010\u0017\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u001cH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/vk/push/core/feature/FeatureManagerImpl;", "Lcom/vk/push/core/feature/FeatureManager;", "Landroid/content/Context;", "applicationContext", "Lcom/vk/push/core/network/http/HttpClient;", "httpClient", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "crashSender", "Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;", "issueKeyBlackListRepository", "Lcom/vk/push/core/DeviceIdRepository;", "deviceIdRepository", "Lcom/vk/push/common/Logger;", "logger", "Lcom/vk/push/core/filedatastore/FileDataSource;", "fileDataSource", "Lgu4;", "scope", "<init>", "(Landroid/content/Context;Lcom/vk/push/core/network/http/HttpClient;Lcom/vk/push/core/data/repository/CrashReporterRepository;Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;Lcom/vk/push/core/DeviceIdRepository;Lcom/vk/push/common/Logger;Lcom/vk/push/core/filedatastore/FileDataSource;Lgu4;)V", "Lcom/vk/push/core/feature/Feature$BooleanFeature;", "feature", "", "getFeatureValue", "(Lcom/vk/push/core/feature/Feature$BooleanFeature;Llq4;)Ljava/lang/Object;", "Lcom/vk/push/core/feature/Feature$StringFeature;", "", "(Lcom/vk/push/core/feature/Feature$StringFeature;Llq4;)Ljava/lang/Object;", "Lcom/vk/push/core/feature/Feature$IntFeature;", "", "(Lcom/vk/push/core/feature/Feature$IntFeature;Llq4;)Ljava/lang/Object;", "getSegments", "()Ljava/lang/String;", "po6", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FeatureManagerImpl implements FeatureManager {

    @Deprecated
    public static final String APP_ID_DEV = "rustore_push_service_test";

    @Deprecated
    public static final String APP_ID_RELEASE = "rustore_push_service";

    @Deprecated
    public static final String UPDATE_INTERVAL_FILE_NAME = "omicron_update_interval.txt";
    public static final po6 j = new po6();
    public final Context a;
    public final HttpClient b;
    public final CrashReporterRepository c;
    public final IssueKeyBlackListRepository d;
    public final DeviceIdRepository e;
    public final Logger f;
    public final FileDataSource g;
    public final gu4 h;
    public volatile sgg i;

    /* JADX WARN: Illegal instructions before constructor call */
    public FeatureManagerImpl(Context context, HttpClient httpClient, CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, DeviceIdRepository deviceIdRepository, Logger logger, FileDataSource fileDataSource, gu4 gu4Var, int i, j95 j95Var) {
        gu4 gu4VarA;
        FileDataSource fileDataSource2 = (i & 64) != 0 ? new FileDataSource(context, UPDATE_INTERVAL_FILE_NAME, null, 4, null) : fileDataSource;
        if ((i & np0.m) != 0) {
            ao5 ao5Var = ao5.a;
            gu4VarA = cqk.a(lb5.c);
        } else {
            gu4VarA = gu4Var;
        }
        this(context, httpClient, crashReporterRepository, issueKeyBlackListRepository, deviceIdRepository, logger, fileDataSource2, gu4VarA);
    }

    public static IllegalStateException a(String str, Throwable th) {
        return new IllegalStateException(qv1.k("Incorrect access to ", str), th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$getFileUpdateInterval(FeatureManagerImpl featureManagerImpl, lq4 lq4Var) {
        to6 to6Var;
        Object objM18getDataIoAF18A;
        Integer numB0;
        featureManagerImpl.getClass();
        if (lq4Var instanceof to6) {
            to6Var = (to6) lq4Var;
            int i = to6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                to6Var.f = i - Integer.MIN_VALUE;
            } else {
                to6Var = new to6(featureManagerImpl, lq4Var);
            }
        } else {
            to6Var = new to6(featureManagerImpl, lq4Var);
        }
        Object obj = to6Var.d;
        int i2 = to6Var.f;
        if (i2 == 0) {
            ch3.d0(obj);
            FileDataSource fileDataSource = featureManagerImpl.g;
            to6Var.f = 1;
            objM18getDataIoAF18A = fileDataSource.m18getDataIoAF18A(to6Var);
            hu4 hu4Var = hu4.a;
            if (objM18getDataIoAF18A == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            objM18getDataIoAF18A = ((roe) obj).a;
        }
        String str = (String) (objM18getDataIoAF18A instanceof poe ? null : objM18getDataIoAF18A);
        return new Integer((str == null || (numB0 = y5h.B0(str)) == null) ? CommonFeaturesKt.getUpdateTimeInterval().getDefaultValue() : numB0.intValue());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.push.core.feature.FeatureManagerImpl$provideAnalyticsHandler$1] */
    public static final FeatureManagerImpl$provideAnalyticsHandler$1 access$provideAnalyticsHandler(FeatureManagerImpl featureManagerImpl, final Logger logger, final CrashReporterRepository crashReporterRepository) {
        featureManagerImpl.getClass();
        return new AnalyticsHandler() { // from class: com.vk.push.core.feature.FeatureManagerImpl$provideAnalyticsHandler$1
            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onCacheHit(DataId dataId, boolean outdated) {
                Logger.DefaultImpls.info$default(logger, "onCacheHit: dataId: " + dataId + ", outdated: " + outdated, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onCacheMiss(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onCacheMiss: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onCacheUpdated(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onCacheUpdated: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigReceivedFromNetwork(String rawJson) {
                Logger.DefaultImpls.info$default(logger, "onConfigReceivedFromNetwork: ".concat(rawJson), null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigRequestEnded(int code) {
                Logger.DefaultImpls.info$default(logger, zo5.h(code, "onConfigRequestEnded: "), null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigRequestFailedWithException(Throwable exception) {
                Logger.DefaultImpls.info$default(logger, zo5.r("onConfigRequestFailedWithException: ", exception), null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigRequestStarted(String request) {
                Logger.DefaultImpls.info$default(logger, "onConfigRequestStarted: ".concat(request), null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onGetDataError(Throwable throwable, String data) {
                Logger.DefaultImpls.info$default(logger, "onGetDataError: throwable: " + throwable + ", data: " + data, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onHandledException(Throwable throwable) {
                Logger.DefaultImpls.info$default(logger, zo5.r("onHandledException: ", throwable), null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseError(DataId dataId, int statusCode) {
                Logger.DefaultImpls.info$default(logger, "onResponseError: dataId: " + dataId + ", statusCode: " + statusCode, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseException(DataId dataId, Throwable exception) {
                Logger.DefaultImpls.info$default(logger, "onResponseException: dataId: " + dataId + ", exception: " + exception, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseNotModified(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onResponseNotModified: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseParseException(DataId dataId, ParseException exception) {
                Logger.DefaultImpls.info$default(logger, "onResponseParseException: dataId: " + dataId + ", exception: " + exception, null, 2, null);
                if (exception != null) {
                    crashReporterRepository.nonFatalReport(exception, IssueKey.OMICRON_PARSE_ERROR);
                }
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseSuccess(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onResponseSuccess: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onWaitForActualOnTime(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onWaitForActualOnTime: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onWaitForActualTimeout(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onWaitForActualTimeout: " + dataId, null, 2, null);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r7.setBlackList(r8, r0) == r5) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$saveIssueKeysBlacklist(com.vk.push.core.feature.FeatureManagerImpl r7, defpackage.lq4 r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof defpackage.uo6
            if (r0 == 0) goto L16
            r0 = r8
            uo6 r0 = (defpackage.uo6) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.g = r1
            goto L1b
        L16:
            uo6 r0 = new uo6
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L3a
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.ch3.d0(r8)
            goto L6b
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            return r2
        L34:
            com.vk.push.core.data.repository.IssueKeyBlackListRepository r7 = r0.d
            defpackage.ch3.d0(r8)
            goto L53
        L3a:
            defpackage.ch3.d0(r8)
            com.vk.push.core.data.repository.IssueKeyBlackListRepository r8 = r7.d
            if (r8 == 0) goto L6e
            com.vk.push.core.feature.Feature$StringFeature r1 = com.vk.push.core.feature.CommonFeaturesKt.getNonFatalEventsBlackList()
            r0.d = r8
            r0.g = r4
            java.lang.Object r7 = r7.getFeatureValue(r1, r0)
            if (r7 != r5) goto L50
            goto L6a
        L50:
            r6 = r8
            r8 = r7
            r7 = r6
        L53:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.String r1 = ","
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r4 = 6
            java.util.List r8 = defpackage.r5h.m1(r8, r1, r4)
            r0.d = r2
            r0.g = r3
            java.lang.Object r7 = r7.setBlackList(r8, r0)
            if (r7 != r5) goto L6b
        L6a:
            return r5
        L6b:
            sbi r7 = defpackage.sbi.a
            return r7
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.feature.FeatureManagerImpl.access$saveIssueKeysBlacklist(com.vk.push.core.feature.FeatureManagerImpl, lq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: access$saveUpdateInterval-IoAF18A */
    public static final Object m17access$saveUpdateIntervalIoAF18A(FeatureManagerImpl featureManagerImpl, lq4 lq4Var) {
        vo6 vo6Var;
        FileDataSource fileDataSource;
        featureManagerImpl.getClass();
        if (lq4Var instanceof vo6) {
            vo6Var = (vo6) lq4Var;
            int i = vo6Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                vo6Var.g = i - Integer.MIN_VALUE;
            } else {
                vo6Var = new vo6(featureManagerImpl, lq4Var);
            }
        } else {
            vo6Var = new vo6(featureManagerImpl, lq4Var);
        }
        Object obj = vo6Var.e;
        int i2 = vo6Var.g;
        Object obj2 = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            FileDataSource fileDataSource2 = featureManagerImpl.g;
            Feature.IntFeature updateTimeInterval = CommonFeaturesKt.getUpdateTimeInterval();
            vo6Var.d = fileDataSource2;
            vo6Var.g = 1;
            Object featureValue = featureManagerImpl.getFeatureValue(updateTimeInterval, vo6Var);
            if (featureValue != obj2) {
                obj = featureValue;
                fileDataSource = fileDataSource2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return ((roe) obj).a;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fileDataSource = vo6Var.d;
        ch3.d0(obj);
        String strValueOf = String.valueOf(((Number) obj).intValue());
        vo6Var.d = null;
        vo6Var.g = 2;
        Object objM19setDatagIAlus = fileDataSource.m19setDatagIAlus(strValueOf, vo6Var);
        return objM19setDatagIAlus == obj2 ? obj2 : objM19setDatagIAlus;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.vk.push.core.feature.FeatureManager
    public Object getFeatureValue(Feature.IntFeature intFeature, lq4 lq4Var) {
        so6 so6Var;
        int defaultValue;
        if (lq4Var instanceof so6) {
            so6Var = (so6) lq4Var;
            int i = so6Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                so6Var.h = i - Integer.MIN_VALUE;
            } else {
                so6Var = new so6(this, lq4Var);
            }
        } else {
            so6Var = new so6(this, lq4Var);
        }
        Object obj = so6Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = so6Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            sgg sggVar = this.i;
            if (sggVar != null) {
                so6Var.d = this;
                so6Var.e = intFeature;
                so6Var.h = 1;
                if (sggVar.g(so6Var) == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            intFeature = so6Var.e;
            this = so6Var.d;
            ch3.d0(obj);
        }
        try {
            defaultValue = Omicron.getInstance().getLatestInt(intFeature.getKey(), intFeature.getDefaultValue());
        } catch (Throwable th) {
            this.c.nonFatalReport(a(intFeature.getKey(), th), IssueKey.OMICRON_EARLY_FEATURE_ACCESS);
            defaultValue = intFeature.getDefaultValue();
        }
        return new Integer(defaultValue);
    }

    @Override // com.vk.push.core.feature.FeatureManager
    public String getSegments() {
        Collection<String> collectionValues = SegmentsHolder.getSegments().values();
        if (collectionValues.isEmpty()) {
            return "empty";
        }
        return collectionValues.size() == 1 ? (String) ww3.q1(collectionValues) : ww3.z1(collectionValues, null, null, null, rl0.f, 31);
    }

    public FeatureManagerImpl(Context context, HttpClient httpClient, CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, DeviceIdRepository deviceIdRepository, Logger logger, FileDataSource fileDataSource, gu4 gu4Var) {
        this.a = context;
        this.b = httpClient;
        this.c = crashReporterRepository;
        this.d = issueKeyBlackListRepository;
        this.e = deviceIdRepository;
        this.f = logger;
        this.g = fileDataSource;
        this.h = gu4Var;
        this.i = yab.i0(gu4Var, null, 0, new jd3(this, (lq4) null, 29), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.vk.push.core.feature.FeatureManager
    public Object getFeatureValue(Feature.StringFeature stringFeature, lq4 lq4Var) {
        ro6 ro6Var;
        if (lq4Var instanceof ro6) {
            ro6Var = (ro6) lq4Var;
            int i = ro6Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ro6Var.h = i - Integer.MIN_VALUE;
            } else {
                ro6Var = new ro6(this, lq4Var);
            }
        } else {
            ro6Var = new ro6(this, lq4Var);
        }
        Object obj = ro6Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = ro6Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            sgg sggVar = this.i;
            if (sggVar != null) {
                ro6Var.d = this;
                ro6Var.e = stringFeature;
                ro6Var.h = 1;
                if (sggVar.g(ro6Var) == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            stringFeature = ro6Var.e;
            this = ro6Var.d;
            ch3.d0(obj);
        }
        try {
            return Omicron.getInstance().getLatestString(stringFeature.getKey(), stringFeature.getDefaultValue());
        } catch (Throwable th) {
            this.c.nonFatalReport(a(stringFeature.getKey(), th), IssueKey.OMICRON_EARLY_FEATURE_ACCESS);
            return stringFeature.getDefaultValue();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.vk.push.core.feature.FeatureManager
    public Object getFeatureValue(Feature.BooleanFeature booleanFeature, lq4 lq4Var) {
        qo6 qo6Var;
        boolean defaultValue;
        if (lq4Var instanceof qo6) {
            qo6Var = (qo6) lq4Var;
            int i = qo6Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                qo6Var.h = i - Integer.MIN_VALUE;
            } else {
                qo6Var = new qo6(this, lq4Var);
            }
        } else {
            qo6Var = new qo6(this, lq4Var);
        }
        Object obj = qo6Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = qo6Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            sgg sggVar = this.i;
            if (sggVar != null) {
                qo6Var.d = this;
                qo6Var.e = booleanFeature;
                qo6Var.h = 1;
                if (sggVar.g(qo6Var) == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            booleanFeature = qo6Var.e;
            this = qo6Var.d;
            ch3.d0(obj);
        }
        try {
            defaultValue = Omicron.getInstance().getLatestBoolean(booleanFeature.getKey(), booleanFeature.getDefaultValue());
        } catch (Throwable th) {
            this.c.nonFatalReport(a(booleanFeature.getKey(), th), IssueKey.OMICRON_EARLY_FEATURE_ACCESS);
            defaultValue = booleanFeature.getDefaultValue();
        }
        return Boolean.valueOf(defaultValue);
    }
}
