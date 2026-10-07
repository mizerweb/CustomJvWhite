package ru.ok.android.onelog;

import defpackage.ff;
import defpackage.hu8;
import defpackage.hvb;
import defpackage.jvb;
import defpackage.l6m;
import defpackage.mv8;
import defpackage.no;
import defpackage.qf7;
import defpackage.sbi;
import defpackage.sc2;
import defpackage.vo;
import defpackage.vp;
import defpackage.wf0;
import java.io.IOException;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0004\u0012\u00020\n0\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0003J\u001d\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ok/android/onelog/OneLogDirect;", "", "<init>", "()V", "Lru/ok/android/onelog/OneLogItem;", DatabaseHelper.ITEM_COLUMN_NAME, "platformFormatted", "Lkotlin/Function2;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lsbi;", "errorCallback", "send-B_83SRM", "(Lru/ok/android/onelog/OneLogItem;Ljava/lang/String;Lqf7;)V", "send", "", "collector", "Lno;", "getApiClient", "(Ljava/lang/String;)Lno;", "platform", "send-PCEVtD0", "(Lru/ok/android/onelog/OneLogItem;Ljava/lang/String;)V", "flush", "kotlin.jvm.PlatformType", "dump", "(Lru/ok/android/onelog/OneLogItem;)Ljava/lang/String;", "one-video-stats_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OneLogDirect {
    public static final OneLogDirect INSTANCE = new OneLogDirect();

    private OneLogDirect() {
    }

    public static final void flush$lambda$2() {
        try {
            OneLogImpl.getInstance().flush();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private final no getApiClient(String collector) {
        try {
            return OneLogImpl.getInstance().getApiClient(collector);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: send-B_83SRM */
    private final void m146sendB_83SRM(OneLogItem oneLogItem, String platformFormatted, qf7 errorCallback) {
        no apiClient = getApiClient(oneLogItem.collector());
        if (apiClient == null) {
            return;
        }
        jvb jvbVar = jvb.a;
        if (jvb.d == null) {
            synchronized (jvbVar) {
                if (jvb.d == null) {
                    jvb.d = Executors.newSingleThreadExecutor();
                }
            }
        }
        jvb.d.execute(new sc2(platformFormatted, oneLogItem, apiClient, errorCallback, 10));
    }

    public static final void send_B_83SRM$lambda$1(final String str, final OneLogItem oneLogItem, no noVar, qf7 qf7Var) {
        try {
            final String applicationParam = OneLogImpl.getInstance().getApplicationParam();
            if (str == null) {
                str = OneLogImpl.getInstance().getPlatformParam();
            }
            final String strCollector = oneLogItem.collector();
            noVar.a(new hvb(applicationParam, str, strCollector) { // from class: ru.ok.android.onelog.OneLogDirect$send$2$request$1
                @Override // defpackage.op
                public /* bridge */ /* synthetic */ boolean canRepeat() {
                    return true;
                }

                @Override // defpackage.zo
                public /* bridge */ /* synthetic */ vo getConfigExtractor() {
                    return vo.M;
                }

                @Override // defpackage.zo
                public /* bridge */ /* synthetic */ hu8 getFailParser() {
                    return l6m.c;
                }

                @Override // defpackage.zo
                public /* bridge */ /* synthetic */ vp getScopeAfter() {
                    return vp.a;
                }

                @Override // defpackage.op
                public /* bridge */ /* synthetic */ boolean shouldNeverGzip() {
                    return false;
                }

                public /* bridge */ /* synthetic */ boolean shouldNeverJson() {
                    return false;
                }

                @Override // defpackage.op
                public /* bridge */ /* synthetic */ boolean shouldNeverPost() {
                    return false;
                }

                @Override // defpackage.op
                public /* bridge */ /* synthetic */ boolean willWriteParams() {
                    return true;
                }

                @Override // defpackage.op
                public /* bridge */ /* synthetic */ boolean willWriteSupplyParams() {
                    return false;
                }

                @Override // defpackage.hvb
                public void writeItems(mv8 writer) throws IOException {
                    writer.r();
                    ItemDumper.dump(oneLogItem, writer);
                    writer.q();
                }

                @Override // defpackage.op
                public /* bridge */ /* synthetic */ void writeSupplyParams(mv8 mv8Var) throws JsonSerializeException, IOException {
                }
            });
        } catch (Exception e) {
            qf7Var.invoke(oneLogItem, e);
        }
    }

    public static final sbi send_PCEVtD0$lambda$0(OneLogItem oneLogItem, Exception exc) {
        oneLogItem.log();
        return sbi.a;
    }

    public final String dump(OneLogItem oneLogItem) {
        return ItemDumper.dump(oneLogItem);
    }

    public final void flush() {
        jvb jvbVar = jvb.a;
        if (jvb.d == null) {
            synchronized (jvbVar) {
                if (jvb.d == null) {
                    jvb.d = Executors.newSingleThreadExecutor();
                }
            }
        }
        jvb.d.execute(new ff(9));
    }

    /* JADX INFO: renamed from: send-PCEVtD0 */
    public final void m147sendPCEVtD0(OneLogItem oneLogItem, String platform) {
        m146sendB_83SRM(oneLogItem, platform, new wf0(13));
    }
}
