package ru.ok.android.externcalls.sdk.stat.supportedcodecs;

import android.content.SharedPreferences;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import defpackage.ahc;
import defpackage.i3f;
import defpackage.j64;
import defpackage.k64;
import defpackage.mz0;
import defpackage.n64;
import defpackage.o64;
import defpackage.o72;
import defpackage.p64;
import defpackage.rg4;
import defpackage.sf7;
import defpackage.v7;
import defpackage.v7g;
import defpackage.wm9;
import defpackage.xdd;
import defpackage.y3e;
import defpackage.ylc;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.request.ClientSupportedCodecs;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsStatistics;", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "okApiService", "Lxdd;", "preferencesHelper", "Ly3e;", "rtcLog", "Lsbi;", "tryToReport", "(Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;Lxdd;Ly3e;)V", "Lorg/json/JSONObject;", "buildCodecLists", "()Lorg/json/JSONObject;", "", "LOG_TAG", "Ljava/lang/String;", "", "ONE_MONTH_IN_MS", "J", "", "CODEC_ALIASES", "Ljava/util/Map;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SupportedCodecsStatistics {
    private static final String LOG_TAG = "SupportedCodecsStatistics";
    public static final SupportedCodecsStatistics INSTANCE = new SupportedCodecsStatistics();
    private static final long ONE_MONTH_IN_MS = 2592000000L;
    private static final Map<String, String> CODEC_ALIASES = wm9.Q0(new ylc("video/av1", "AV1"), new ylc("video/av01", "AV1"), new ylc("video/x-vnd.on2.vp8", "VP8"), new ylc("video/x-vnd.on2.vp9", "VP9"), new ylc("video/avc", "H264"), new ylc("video/hevc", "H265"), new ylc("audio/opus", "OPUS"));

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics$tryToReport$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass2<T, R> implements sf7 {
        final /* synthetic */ long $currentTime;
        final /* synthetic */ OkApiServiceInternal $okApiService;
        final /* synthetic */ xdd $preferencesHelper;
        final /* synthetic */ y3e $rtcLog;

        /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics$tryToReport$2$1 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class AnonymousClass1<T, R> implements sf7 {
            final /* synthetic */ long $currentTime;
            final /* synthetic */ xdd $preferencesHelper;
            final /* synthetic */ y3e $rtcLog;

            public AnonymousClass1(y3e y3eVar, xdd xddVar, long j) {
                this.$rtcLog = y3eVar;
                this.$preferencesHelper = xddVar;
                this.$currentTime = j;
            }

            public static final void apply$lambda$0(xdd xddVar, long j) {
                xddVar.getClass();
                ((SharedPreferences) xddVar.c.getValue()).edit().putLong("supportedCodecsLastUpdate", j).apply();
            }

            @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
            /* JADX INFO: renamed from: apply */
            public final n64 mo41apply(ClientSupportedCodecs.Response response) {
                this.$rtcLog.log(SupportedCodecsStatistics.LOG_TAG, "Supported codecs are sent with success=" + response.getSuccess());
                if (!response.getSuccess()) {
                    return j64.a;
                }
                final xdd xddVar = this.$preferencesHelper;
                final long j = this.$currentTime;
                return new k64(0, new v7() { // from class: ru.ok.android.externcalls.sdk.stat.supportedcodecs.a
                    @Override // defpackage.v7
                    public final void run() {
                        SupportedCodecsStatistics.AnonymousClass2.AnonymousClass1.apply$lambda$0(xddVar, j);
                    }
                });
            }
        }

        public AnonymousClass2() {
            j = j;
            y3eVar = y3eVar;
            okApiServiceInternal = okApiServiceInternal;
            xddVar = xddVar;
        }

        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
        /* JADX INFO: renamed from: apply */
        public final n64 mo41apply(Long l) throws JSONException {
            if (j - l.longValue() < SupportedCodecsStatistics.ONE_MONTH_IN_MS) {
                return j64.a;
            }
            JSONObject jSONObjectBuildCodecLists = SupportedCodecsStatistics.INSTANCE.buildCodecLists();
            y3eVar.log(SupportedCodecsStatistics.LOG_TAG, "Sending supported codecs " + jSONObjectBuildCodecLists);
            v7g v7gVarSendSupportedCodecsStatistics = okApiServiceInternal.sendSupportedCodecsStatistics(jSONObjectBuildCodecLists);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(y3eVar, xddVar, j);
            v7gVarSendSupportedCodecsStatistics.getClass();
            return new o64(v7gVarSendSupportedCodecsStatistics, 1, anonymousClass1);
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics$tryToReport$4 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass4<T> implements rg4 {
        public AnonymousClass4() {
        }

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(Throwable th) {
            y3eVar.log(SupportedCodecsStatistics.LOG_TAG, "Failed to send supported codecs with error: " + th.getMessage());
        }
    }

    private SupportedCodecsStatistics() {
    }

    public final JSONObject buildCodecLists() throws JSONException {
        int i = 0;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        int length = codecInfos.length;
        int i2 = 0;
        while (i2 < length) {
            MediaCodecInfo mediaCodecInfo = codecInfos[i2];
            JSONObject jSONObject2 = new JSONObject();
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            if (supportedTypes != null && supportedTypes.length != 0) {
                int length2 = supportedTypes.length;
                int i3 = i;
                while (i3 < length2) {
                    String str = supportedTypes[i3];
                    String str2 = CODEC_ALIASES.get(str);
                    if (str2 != null) {
                        jSONObject2.put("codec_name", str2);
                        jSONObject2.put("codec_implementation", mediaCodecInfo.getName());
                        jSONObject2.put("mime_type", str);
                        jSONObject2.put("is_encoder", mediaCodecInfo.isEncoder());
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                        int length3 = codecProfileLevelArr.length;
                        int i4 = i;
                        int i5 = i4;
                        while (i4 < length3) {
                            i5 += codecProfileLevelArr[i4].profile;
                            i4++;
                        }
                        jSONObject2.put("profiles", i5);
                        jSONObject2.put("instance_count", capabilitiesForType.getMaxSupportedInstances());
                        if (Build.VERSION.SDK_INT >= 29) {
                            jSONObject2.put("is_hardware", mediaCodecInfo.isHardwareAccelerated());
                        }
                        jSONArray.put(jSONObject2);
                    }
                    i3++;
                    i = 0;
                }
            }
            i2++;
            i = 0;
        }
        jSONObject.put("codecs", jSONArray);
        return jSONObject;
    }

    public static final void tryToReport(OkApiServiceInternal okApiService, xdd preferencesHelper, y3e rtcLog) {
        new o64(new p64(4, new mz0(5, preferencesHelper)), 1, new sf7() { // from class: ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics.tryToReport.2
            final /* synthetic */ long $currentTime;
            final /* synthetic */ OkApiServiceInternal $okApiService;
            final /* synthetic */ xdd $preferencesHelper;
            final /* synthetic */ y3e $rtcLog;

            /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics$tryToReport$2$1 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class AnonymousClass1<T, R> implements sf7 {
                final /* synthetic */ long $currentTime;
                final /* synthetic */ xdd $preferencesHelper;
                final /* synthetic */ y3e $rtcLog;

                public AnonymousClass1(y3e y3eVar, xdd xddVar, long j) {
                    this.$rtcLog = y3eVar;
                    this.$preferencesHelper = xddVar;
                    this.$currentTime = j;
                }

                public static final void apply$lambda$0(xdd xddVar, long j) {
                    xddVar.getClass();
                    ((SharedPreferences) xddVar.c.getValue()).edit().putLong("supportedCodecsLastUpdate", j).apply();
                }

                @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                /* JADX INFO: renamed from: apply */
                public final n64 mo41apply(ClientSupportedCodecs.Response response) {
                    this.$rtcLog.log(SupportedCodecsStatistics.LOG_TAG, "Supported codecs are sent with success=" + response.getSuccess());
                    if (!response.getSuccess()) {
                        return j64.a;
                    }
                    final xdd xddVar = this.$preferencesHelper;
                    final long j = this.$currentTime;
                    return new k64(0, new v7() { // from class: ru.ok.android.externcalls.sdk.stat.supportedcodecs.a
                        @Override // defpackage.v7
                        public final void run() {
                            SupportedCodecsStatistics.AnonymousClass2.AnonymousClass1.apply$lambda$0(xddVar, j);
                        }
                    });
                }
            }

            public AnonymousClass2() {
                j = j;
                y3eVar = rtcLog;
                okApiServiceInternal = okApiService;
                xddVar = preferencesHelper;
            }

            @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
            /* JADX INFO: renamed from: apply */
            public final n64 mo41apply(Long l) throws JSONException {
                if (j - l.longValue() < SupportedCodecsStatistics.ONE_MONTH_IN_MS) {
                    return j64.a;
                }
                JSONObject jSONObjectBuildCodecLists = SupportedCodecsStatistics.INSTANCE.buildCodecLists();
                y3eVar.log(SupportedCodecsStatistics.LOG_TAG, "Sending supported codecs " + jSONObjectBuildCodecLists);
                v7g v7gVarSendSupportedCodecsStatistics = okApiServiceInternal.sendSupportedCodecsStatistics(jSONObjectBuildCodecLists);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(y3eVar, xddVar, j);
                v7gVarSendSupportedCodecsStatistics.getClass();
                return new o64(v7gVarSendSupportedCodecsStatistics, 1, anonymousClass1);
            }
        }).c(i3f.b()).a(new o72(new rg4() { // from class: ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics.tryToReport.4
            public AnonymousClass4() {
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Throwable th) {
                y3eVar.log(SupportedCodecsStatistics.LOG_TAG, "Failed to send supported codecs with error: " + th.getMessage());
            }
        }, 0, new ahc(19)));
    }

    public static final Long tryToReport$lambda$0(xdd xddVar) {
        xddVar.getClass();
        return Long.valueOf(((SharedPreferences) xddVar.c.getValue()).getLong("supportedCodecsLastUpdate", 0L));
    }

    public static final void tryToReport$lambda$1() {
    }
}
