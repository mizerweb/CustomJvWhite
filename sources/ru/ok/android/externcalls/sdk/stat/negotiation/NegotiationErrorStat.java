package ru.ok.android.externcalls.sdk.stat.negotiation;

import defpackage.af7;
import defpackage.fi1;
import defpackage.j95;
import defpackage.ore;
import defpackage.wbb;
import defpackage.xbb;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.SessionDescription;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/negotiation/NegotiationErrorStat;", "", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "<init>", "(Laf7;)V", "Lorg/webrtc/SessionDescription;", "sdp", "Lorg/json/JSONObject;", "sdpJson", "(Lorg/webrtc/SessionDescription;)Lorg/json/JSONObject;", "Lwbb;", "", "toStatName", "(Lwbb;)Ljava/lang/String;", "Lxbb;", "error", "Lsbi;", "onError", "(Lxbb;)V", "Laf7;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NegotiationErrorStat {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_ERROR = "error";
    private final af7 getEventualStatSender;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[wbb.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NegotiationErrorStat(af7 af7Var) {
        this.getEventualStatSender = af7Var;
    }

    private final JSONObject sdpJson(SessionDescription sdp) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sdp", sdp.description);
        jSONObject.put("type", sdp.type);
        return jSONObject;
    }

    private final String toStatName(wbb wbbVar) {
        switch (WhenMappings.$EnumSwitchMapping$0[wbbVar.ordinal()]) {
            case 1:
                return "sdp_create_offer";
            case 2:
                return "sdp_create_answer";
            case 3:
                return "sdp_set_local_offer";
            case 4:
                return "sdp_set_remote_offer";
            case 5:
                return "sdp_set_local_answer";
            case 6:
                return "sdp_set_remote_answer";
            case 7:
                return "sdp_set_local_pranswer";
            case 8:
                return "sdp_set_remote_pranswer";
            case 9:
                return "sdp_set_local_rollback";
            case 10:
                return "sdp_set_remote_rollback";
            default:
                ore.o();
                return null;
        }
    }

    public final void onError(xbb error) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error", error.b);
        SessionDescription sessionDescription = error.c;
        if (sessionDescription != null) {
            jSONObject.put("local", sdpJson(sessionDescription));
        }
        SessionDescription sessionDescription2 = error.d;
        if (sessionDescription2 != null) {
            jSONObject.put("remote", sdpJson(sessionDescription2));
        }
        fi1 fi1Var = (fi1) this.getEventualStatSender.invoke();
        if (fi1Var != null) {
            fi1.a(fi1Var, toStatName(error.a), EventItemValueKt.toEventItemValue(jSONObject.toString()), null, 4);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/negotiation/NegotiationErrorStat$Companion;", "", "<init>", "()V", "KEY_ERROR", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
