package ru.ok.android.externcalls.sdk.analytics;

import defpackage.af7;
import defpackage.fsb;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig;
import ru.ok.android.externcalls.analytics.config.UploadConfig;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsConfigurationImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/analytics/CallAnalyticsInitializer;", "", "<init>", "()V", "Lru/ok/android/externcalls/analytics/CallAnalyticsSender;", "callAnalyticsSender", "Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfigurationImpl;", "analyticsConfiguration", "Lfsb;", "api", "Lkotlin/Function0;", "Ly3e;", "logger", "Lsbi;", "init", "(Lru/ok/android/externcalls/analytics/CallAnalyticsSender;Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfigurationImpl;Lfsb;Laf7;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallAnalyticsInitializer {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationAnalyticsUploadConfig init$lambda$0(ConversationAnalyticsConfigurationImpl conversationAnalyticsConfigurationImpl) {
        UploadConfigProvider uploadConfigProvider = conversationAnalyticsConfigurationImpl.getUploadConfigProvider();
        if (uploadConfigProvider != null) {
            return uploadConfigProvider.getUploadConfig();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String init$lambda$1(ConversationAnalyticsConfigurationImpl conversationAnalyticsConfigurationImpl) {
        ApplicationNameProvider applicationNameProvider = conversationAnalyticsConfigurationImpl.getApplicationNameProvider();
        if (applicationNameProvider != null) {
            return applicationNameProvider.getName();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer init$lambda$2(af7 af7Var) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) af7Var.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Integer.valueOf(conversationAnalyticsUploadConfig.getMaxLocalFileSizeKb());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer init$lambda$3(af7 af7Var) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) af7Var.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Integer.valueOf(conversationAnalyticsUploadConfig.getMaxEventCount());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer init$lambda$4(af7 af7Var) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) af7Var.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Integer.valueOf(conversationAnalyticsUploadConfig.getMaxLocalFileCount());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long init$lambda$5(af7 af7Var) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) af7Var.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return conversationAnalyticsUploadConfig.getTimeToUploadNextFileMs();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean init$lambda$6(af7 af7Var) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) af7Var.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Boolean.valueOf(conversationAnalyticsUploadConfig.getCompressContent());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean init$lambda$7(af7 af7Var) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) af7Var.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Boolean.valueOf(conversationAnalyticsUploadConfig.getDisableUploadWhenCallIsActiveProvider());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean init$lambda$8(af7 af7Var) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) af7Var.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Boolean.valueOf(conversationAnalyticsUploadConfig.getAutoDetectContentCompression());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean init$lambda$9(af7 af7Var) {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) af7Var.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Boolean.valueOf(conversationAnalyticsUploadConfig.getUseDbCache());
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [lb1] */
    public final void init(CallAnalyticsSender callAnalyticsSender, final ConversationAnalyticsConfigurationImpl analyticsConfiguration, fsb api, af7 logger) {
        final int i = 0;
        final ?? r1 = new af7() { // from class: lb1
            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                ConversationAnalyticsConfigurationImpl conversationAnalyticsConfigurationImpl = analyticsConfiguration;
                switch (i2) {
                    case 0:
                        return CallAnalyticsInitializer.init$lambda$0(conversationAnalyticsConfigurationImpl);
                    default:
                        return CallAnalyticsInitializer.init$lambda$1(conversationAnalyticsConfigurationImpl);
                }
            }
        };
        final int i2 = 1;
        final int i3 = 2;
        final int i4 = 3;
        final int i5 = 4;
        final int i6 = 5;
        final int i7 = 6;
        final int i8 = 7;
        callAnalyticsSender.initialize(new CallAnalyticsConfig(api, new EventMetaParamsConfig(new af7() { // from class: lb1
            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i2;
                ConversationAnalyticsConfigurationImpl conversationAnalyticsConfigurationImpl = analyticsConfiguration;
                switch (i9) {
                    case 0:
                        return CallAnalyticsInitializer.init$lambda$0(conversationAnalyticsConfigurationImpl);
                    default:
                        return CallAnalyticsInitializer.init$lambda$1(conversationAnalyticsConfigurationImpl);
                }
            }
        }), new CallAnalyticsLoggerImpl(logger), new UploadConfig(0, null, 0L, 0L, new af7() { // from class: mb1
            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i;
                lb1 lb1Var = r1;
                switch (i9) {
                    case 0:
                        return CallAnalyticsInitializer.init$lambda$2(lb1Var);
                    case 1:
                        return CallAnalyticsInitializer.init$lambda$3(lb1Var);
                    case 2:
                        return CallAnalyticsInitializer.init$lambda$4(lb1Var);
                    case 3:
                        return CallAnalyticsInitializer.init$lambda$5(lb1Var);
                    case 4:
                        return CallAnalyticsInitializer.init$lambda$6(lb1Var);
                    case 5:
                        return CallAnalyticsInitializer.init$lambda$7(lb1Var);
                    case 6:
                        return CallAnalyticsInitializer.init$lambda$8(lb1Var);
                    default:
                        return CallAnalyticsInitializer.init$lambda$9(lb1Var);
                }
            }
        }, new af7() { // from class: mb1
            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i2;
                lb1 lb1Var = r1;
                switch (i9) {
                    case 0:
                        return CallAnalyticsInitializer.init$lambda$2(lb1Var);
                    case 1:
                        return CallAnalyticsInitializer.init$lambda$3(lb1Var);
                    case 2:
                        return CallAnalyticsInitializer.init$lambda$4(lb1Var);
                    case 3:
                        return CallAnalyticsInitializer.init$lambda$5(lb1Var);
                    case 4:
                        return CallAnalyticsInitializer.init$lambda$6(lb1Var);
                    case 5:
                        return CallAnalyticsInitializer.init$lambda$7(lb1Var);
                    case 6:
                        return CallAnalyticsInitializer.init$lambda$8(lb1Var);
                    default:
                        return CallAnalyticsInitializer.init$lambda$9(lb1Var);
                }
            }
        }, new af7() { // from class: mb1
            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i3;
                lb1 lb1Var = r1;
                switch (i9) {
                    case 0:
                        return CallAnalyticsInitializer.init$lambda$2(lb1Var);
                    case 1:
                        return CallAnalyticsInitializer.init$lambda$3(lb1Var);
                    case 2:
                        return CallAnalyticsInitializer.init$lambda$4(lb1Var);
                    case 3:
                        return CallAnalyticsInitializer.init$lambda$5(lb1Var);
                    case 4:
                        return CallAnalyticsInitializer.init$lambda$6(lb1Var);
                    case 5:
                        return CallAnalyticsInitializer.init$lambda$7(lb1Var);
                    case 6:
                        return CallAnalyticsInitializer.init$lambda$8(lb1Var);
                    default:
                        return CallAnalyticsInitializer.init$lambda$9(lb1Var);
                }
            }
        }, new af7() { // from class: mb1
            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i4;
                lb1 lb1Var = r1;
                switch (i9) {
                    case 0:
                        return CallAnalyticsInitializer.init$lambda$2(lb1Var);
                    case 1:
                        return CallAnalyticsInitializer.init$lambda$3(lb1Var);
                    case 2:
                        return CallAnalyticsInitializer.init$lambda$4(lb1Var);
                    case 3:
                        return CallAnalyticsInitializer.init$lambda$5(lb1Var);
                    case 4:
                        return CallAnalyticsInitializer.init$lambda$6(lb1Var);
                    case 5:
                        return CallAnalyticsInitializer.init$lambda$7(lb1Var);
                    case 6:
                        return CallAnalyticsInitializer.init$lambda$8(lb1Var);
                    default:
                        return CallAnalyticsInitializer.init$lambda$9(lb1Var);
                }
            }
        }, new af7() { // from class: mb1
            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i5;
                lb1 lb1Var = r1;
                switch (i9) {
                    case 0:
                        return CallAnalyticsInitializer.init$lambda$2(lb1Var);
                    case 1:
                        return CallAnalyticsInitializer.init$lambda$3(lb1Var);
                    case 2:
                        return CallAnalyticsInitializer.init$lambda$4(lb1Var);
                    case 3:
                        return CallAnalyticsInitializer.init$lambda$5(lb1Var);
                    case 4:
                        return CallAnalyticsInitializer.init$lambda$6(lb1Var);
                    case 5:
                        return CallAnalyticsInitializer.init$lambda$7(lb1Var);
                    case 6:
                        return CallAnalyticsInitializer.init$lambda$8(lb1Var);
                    default:
                        return CallAnalyticsInitializer.init$lambda$9(lb1Var);
                }
            }
        }, new af7() { // from class: mb1
            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i6;
                lb1 lb1Var = r1;
                switch (i9) {
                    case 0:
                        return CallAnalyticsInitializer.init$lambda$2(lb1Var);
                    case 1:
                        return CallAnalyticsInitializer.init$lambda$3(lb1Var);
                    case 2:
                        return CallAnalyticsInitializer.init$lambda$4(lb1Var);
                    case 3:
                        return CallAnalyticsInitializer.init$lambda$5(lb1Var);
                    case 4:
                        return CallAnalyticsInitializer.init$lambda$6(lb1Var);
                    case 5:
                        return CallAnalyticsInitializer.init$lambda$7(lb1Var);
                    case 6:
                        return CallAnalyticsInitializer.init$lambda$8(lb1Var);
                    default:
                        return CallAnalyticsInitializer.init$lambda$9(lb1Var);
                }
            }
        }, new af7() { // from class: mb1
            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i7;
                lb1 lb1Var = r1;
                switch (i9) {
                    case 0:
                        return CallAnalyticsInitializer.init$lambda$2(lb1Var);
                    case 1:
                        return CallAnalyticsInitializer.init$lambda$3(lb1Var);
                    case 2:
                        return CallAnalyticsInitializer.init$lambda$4(lb1Var);
                    case 3:
                        return CallAnalyticsInitializer.init$lambda$5(lb1Var);
                    case 4:
                        return CallAnalyticsInitializer.init$lambda$6(lb1Var);
                    case 5:
                        return CallAnalyticsInitializer.init$lambda$7(lb1Var);
                    case 6:
                        return CallAnalyticsInitializer.init$lambda$8(lb1Var);
                    default:
                        return CallAnalyticsInitializer.init$lambda$9(lb1Var);
                }
            }
        }, new af7() { // from class: mb1
            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i8;
                lb1 lb1Var = r1;
                switch (i9) {
                    case 0:
                        return CallAnalyticsInitializer.init$lambda$2(lb1Var);
                    case 1:
                        return CallAnalyticsInitializer.init$lambda$3(lb1Var);
                    case 2:
                        return CallAnalyticsInitializer.init$lambda$4(lb1Var);
                    case 3:
                        return CallAnalyticsInitializer.init$lambda$5(lb1Var);
                    case 4:
                        return CallAnalyticsInitializer.init$lambda$6(lb1Var);
                    case 5:
                        return CallAnalyticsInitializer.init$lambda$7(lb1Var);
                    case 6:
                        return CallAnalyticsInitializer.init$lambda$8(lb1Var);
                    default:
                        return CallAnalyticsInitializer.init$lambda$9(lb1Var);
                }
            }
        }, 15, null)));
    }
}
