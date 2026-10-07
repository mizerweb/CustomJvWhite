package defpackage;

import com.vk.push.core.base.AidlException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class l40 implements Serializable {
    public final w50 a;
    public final boolean b;
    public final boolean c;

    public l40(w50 w50Var, boolean z, boolean z2) {
        this.a = w50Var;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Code duplicated, block: B:615:0x08f9 A[PHI: r20
  0x08f9: PHI (r20v10 int) = (r20v2 int), (r20v3 int), (r20v4 int), (r20v5 int), (r20v6 int), (r20v7 int), (r20v8 int), (r20v11 int) binds: [B:641:0x0952, B:637:0x0944, B:633:0x0937, B:629:0x092c, B:625:0x0920, B:621:0x0913, B:617:0x0905, B:614:0x08f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:709:0x0b82  */
    /* JADX WARN: Code duplicated, block: B:823:0x0e46  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static l40 b(fka fkaVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        byte b;
        int i11;
        a61 a61Var;
        b61 b61Var;
        int i12;
        int i13;
        int i14;
        int iU = ch3.U(fkaVar);
        k40 k40Var = new k40();
        int i15 = 0;
        int i16 = 0;
        while (i16 < iU) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            switch (strS0.hashCode()) {
                case -2129294769:
                    i = strS0.equals("startTime") ? i15 : -1;
                    break;
                case -1992012396:
                    i = strS0.equals("duration") ? 1 : -1;
                    break;
                case -1983518269:
                    i = strS0.equals("fullImageUrl") ? 2 : -1;
                    break;
                case -1884251920:
                    i = strS0.equals("storyId") ? 3 : -1;
                    break;
                case -1842130965:
                    i = strS0.equals("shortMessage") ? 4 : -1;
                    break;
                case -1724546052:
                    i = strS0.equals("description") ? 5 : -1;
                    break;
                case -1676095234:
                    i = strS0.equals(ApiProtocol.PARAM_CONVERSATION_ID) ? 6 : -1;
                    break;
                case -1607243192:
                    i = strS0.equals("endTime") ? 7 : -1;
                    break;
                case -1501337755:
                    i = strS0.equals("authorType") ? 8 : -1;
                    break;
                case -1459599807:
                    i = strS0.equals("lastName") ? 9 : -1;
                    break;
                case -1439978388:
                    i = strS0.equals("latitude") ? 10 : -1;
                    break;
                case -1401988028:
                    i = strS0.equals(ApiProtocol.PARAM_JOIN_LINK) ? 11 : -1;
                    break;
                case -1313911455:
                    i = strS0.equals("timeout") ? 12 : -1;
                    break;
                case -1291705454:
                    i = strS0.equals("previewData") ? 13 : -1;
                    break;
                case -1274507337:
                    i = strS0.equals("fileId") ? 14 : -1;
                    break;
                case -1274279459:
                    i = strS0.equals("photoUrl") ? 15 : -1;
                    break;
                case -1225128893:
                    i = strS0.equals("presentJson") ? 16 : -1;
                    break;
                case -1221029593:
                    i = strS0.equals("height") ? 17 : -1;
                    break;
                case -1202965955:
                    i = strS0.equals("availableBySubscription") ? 18 : -1;
                    break;
                case -1194482836:
                    i = strS0.equals("corrupted") ? 19 : -1;
                    break;
                case -1165573993:
                    i = strS0.equals("backgroundPlayForbidden") ? 20 : -1;
                    break;
                case -1069321026:
                    i = strS0.equals("mp4Url") ? 21 : -1;
                    break;
                case -1063571914:
                    i = strS0.equals("textColor") ? 22 : -1;
                    break;
                case -1054729426:
                    i = strS0.equals("ownerId") ? 23 : -1;
                    break;
                case -1016215724:
                    i = strS0.equals("okChat") ? 24 : -1;
                    break;
                case -982667974:
                    i = strS0.equals("pollId") ? 25 : -1;
                    break;
                case -921944266:
                    i = strS0.equals("presentId") ? 26 : -1;
                    break;
                case -921148724:
                    i = strS0.equals("startPayload") ? 27 : -1;
                    break;
                case -892481550:
                    i = strS0.equals("status") ? 28 : -1;
                    break;
                case -859610604:
                    i = strS0.equals("imageUrl") ? 29 : -1;
                    break;
                case -847398795:
                    i = strS0.equals("answers") ? 30 : -1;
                    break;
                case -836030906:
                    i = strS0.equals("userId") ? 31 : -1;
                    break;
                case -668327396:
                    i = strS0.equals("expirationTime") ? 32 : -1;
                    break;
                case -661256303:
                    i = strS0.equals("audioId") ? 33 : -1;
                    break;
                case -595295507:
                    i = strS0.equals("photoId") ? 34 : -1;
                    break;
                case -549897057:
                    i = strS0.equals("firstUrl") ? 35 : -1;
                    break;
                case -517891353:
                    i = strS0.equals("photoToken") ? 36 : -1;
                    break;
                case -511251360:
                    i = strS0.equals("fullUrl") ? 37 : -1;
                    break;
                case -466223441:
                    i = strS0.equals("playRestricted") ? 38 : -1;
                    break;
                case -431356521:
                    i = strS0.equals("mp4SndUrl") ? 39 : -1;
                    break;
                case -411130533:
                    i = strS0.equals("contactId") ? 40 : -1;
                    break;
                case -389131437:
                    i = strS0.equals("contentType") ? 41 : -1;
                    break;
                case -332625698:
                    i = strS0.equals("baseUrl") ? 42 : -1;
                    break;
                case -318184504:
                    i = strS0.equals("preview") ? 43 : -1;
                    break;
                case -304523600:
                    i = strS0.equals("replyOrigin") ? 44 : -1;
                    break;
                case -295931082:
                    i = strS0.equals("updateTime") ? 45 : -1;
                    break;
                case -172613960:
                    i = strS0.equals("callType") ? 46 : -1;
                    break;
                case -147154195:
                    i = strS0.equals("userIds") ? 47 : -1;
                    break;
                case -41651065:
                    i = strS0.equals("previewUrl") ? 48 : -1;
                    break;
                case 96681:
                    i = strS0.equals("alt") ? 49 : -1;
                    break;
                case 100650:
                    i = strS0.equals("epu") ? 50 : -1;
                    break;
                case 102340:
                    i = strS0.equals("gif") ? 51 : -1;
                    break;
                case 103154:
                    i = strS0.equals("hdn") ? 52 : -1;
                    break;
                case 114087:
                    i = strS0.equals("spd") ? 53 : -1;
                    break;
                case 116079:
                    i = strS0.equals(MLFeatureConfigProviderBase.URL_KEY) ? 54 : -1;
                    break;
                case 3208616:
                    i = strS0.equals(CandidateTypeHintConfig.TYPE_HOST) ? 55 : -1;
                    break;
                case 3226745:
                    i = strS0.equals("icon") ? 56 : -1;
                    break;
                case 3322092:
                    i = strS0.equals("live") ? 57 : -1;
                    break;
                case 3373707:
                    i = strS0.equals(SdkMetricStatEvent.NAME_KEY) ? 58 : -1;
                    break;
                case 3530753:
                    i = strS0.equals("size") ? 59 : -1;
                    break;
                case 3552281:
                    i = strS0.equals("tags") ? 60 : -1;
                    break;
                case 3642105:
                    i = strS0.equals("wave") ? 61 : -1;
                    break;
                case 3744723:
                    i = strS0.equals("zoom") ? 62 : -1;
                    break;
                case 91310105:
                    i = strS0.equals("_type") ? 63 : -1;
                    break;
                case 93028124:
                    i = strS0.equals("appId") ? 64 : -1;
                    break;
                case 93166550:
                    i = strS0.equals(MediaStreamTrack.AUDIO_TRACK_KIND) ? 65 : -1;
                    break;
                case 96891546:
                    i = strS0.equals("event") ? 66 : -1;
                    break;
                case 100313435:
                    i = strS0.equals("image") ? 67 : -1;
                    break;
                case 103772132:
                    i = strS0.equals("media") ? 68 : -1;
                    break;
                case 106164915:
                    i = strS0.equals("owner") ? 69 : -1;
                    break;
                case 106642798:
                    i = strS0.equals("phone") ? 70 : -1;
                    break;
                case 109327645:
                    i = strS0.equals("setId") ? 71 : -1;
                    break;
                case 109757585:
                    i = strS0.equals("state") ? 72 : -1;
                    break;
                case 110371416:
                    i = strS0.equals("title") ? 73 : -1;
                    break;
                case 110541305:
                    i = strS0.equals(ApiProtocol.KEY_TOKEN) ? 74 : -1;
                    break;
                case 110621003:
                    i = strS0.equals("track") ? 75 : -1;
                    break;
                case 113126854:
                    i = strS0.equals("width") ? 76 : -1;
                    break;
                case 132835675:
                    i = strS0.equals("firstName") ? 77 : -1;
                    break;
                case 137365935:
                    i = strS0.equals("longitude") ? 78 : -1;
                    break;
                case 139855480:
                    i = strS0.equals("contactIds") ? 79 : -1;
                    break;
                case 209269610:
                    i = strS0.equals("receiverId") ? 80 : -1;
                    break;
                case 238532408:
                    i = strS0.equals("stickerId") ? 81 : -1;
                    break;
                case 249273754:
                    i = strS0.equals("albumName") ? 82 : -1;
                    break;
                case 281813147:
                    i = strS0.equals("vcfBody") ? 83 : -1;
                    break;
                case 351608024:
                    i = strS0.equals("version") ? 84 : -1;
                    break;
                case 452782838:
                    i = strS0.equals("videoId") ? 85 : -1;
                    break;
                case 465391254:
                    i = strS0.equals("sensitive") ? 86 : -1;
                    break;
                case 503739367:
                    i = strS0.equals("keyboard") ? 87 : -1;
                    break;
                case 572260623:
                    i = strS0.equals("pinnedMessage") ? 88 : -1;
                    break;
                case 616218085:
                    i = strS0.equals("MP4_1080") ? 89 : -1;
                    break;
                case 622882663:
                    i = strS0.equals("hangupType") ? 90 : -1;
                    break;
                case 629723762:
                    i = strS0.equals("artistName") ? 91 : -1;
                    break;
                case 771076557:
                    i = strS0.equals("livePeriod") ? 92 : -1;
                    break;
                case 785834966:
                    i = strS0.equals("embedUrl") ? 93 : -1;
                    break;
                case 813849227:
                    i = strS0.equals("contentLevel") ? 94 : -1;
                    break;
                case 940773407:
                    i = strS0.equals("mediaId") ? 95 : -1;
                    break;
                case 949441171:
                    i = strS0.equals("collage") ? 96 : -1;
                    break;
                case 951530927:
                    i = strS0.equals("context") ? 97 : -1;
                    break;
                case 954925063:
                    i = strS0.equals("message") ? 98 : -1;
                    break;
                case 956028837:
                    i = strS0.equals("defaultInputDisabled") ? 99 : -1;
                    break;
                case 1069588317:
                    i = strS0.equals("externalSiteName") ? 100 : -1;
                    break;
                case 1109191185:
                    i = strS0.equals(ApiProtocol.PARAM_DEVICE_ID) ? 101 : -1;
                    break;
                case 1151378164:
                    i = strS0.equals("videoUrl") ? 102 : -1;
                    break;
                case 1156744944:
                    i = strS0.equals("appState") ? AidlException.HOST_IS_NOT_MASTER : -1;
                    break;
                case 1247963696:
                    i = strS0.equals("senderId") ? AidlException.SDK_IS_NOT_INITIALIZED : -1;
                    break;
                case 1287124693:
                    i = strS0.equals("backgroundColor") ? AidlException.TRANSFERRED_IPC_DATA_EXCEPTION : -1;
                    break;
                case 1323969120:
                    i = strS0.equals("nextContentType") ? 106 : -1;
                    break;
                case 1330354148:
                    i = strS0.equals("thumbhash") ? 107 : -1;
                    break;
                case 1330532588:
                    i = strS0.equals("thumbnail") ? 108 : -1;
                    break;
                case 1332961877:
                    i = strS0.equals("videoType") ? 109 : -1;
                    break;
                case 1337685162:
                    i = strS0.equals("metadataId") ? 110 : -1;
                    break;
                case 1434631203:
                    i = strS0.equals("settings") ? 111 : -1;
                    break;
                case 1437412018:
                    i = strS0.equals("chatType") ? 112 : -1;
                    break;
                case 1539122512:
                    i = strS0.equals("lottieUrl") ? 113 : -1;
                    break;
                case 1550463001:
                    i = strS0.equals("deleted") ? 114 : -1;
                    break;
                case 1596728855:
                    i = strS0.equals("stickerType") ? 115 : -1;
                    break;
                case 1782043093:
                    i = strS0.equals("expirationMillis") ? 116 : -1;
                    break;
                case 1819137874:
                    i = strS0.equals("actionDestinationType") ? 117 : -1;
                    break;
                case 1999973440:
                    i = strS0.equals("callbackId") ? 118 : -1;
                    break;
                case 2054217050:
                    i = strS0.equals("shareId") ? 119 : -1;
                    break;
                default:
                    i = -1;
                    break;
            }
            switch (i) {
                case 0:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.A = ch3.T(fkaVar, 0L);
                    break;
                case 1:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.v = Long.valueOf(ch3.T(fkaVar, 0L));
                    break;
                case 2:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    ch3.W(fkaVar);
                    break;
                case 3:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.N0 = ch3.T(fkaVar, 0L);
                    break;
                case 4:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.s = ch3.W(fkaVar);
                    break;
                case 5:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.O = ch3.W(fkaVar);
                    break;
                case 6:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.a0 = fkaVar.S0();
                    break;
                case 7:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.z0 = ch3.T(fkaVar, 0L);
                    break;
                case 8:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    String strW = ch3.W(fkaVar);
                    int[] iArrH = qt4.H(3);
                    int length = iArrH.length;
                    int i17 = i3;
                    while (true) {
                        if (i17 < length) {
                            i5 = iArrH[i17];
                            if (!c0a.b(i5).equals(strW)) {
                                i17++;
                            }
                        } else {
                            i5 = 1;
                        }
                    }
                    k40Var.U0 = i5;
                    break;
                case 9:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.W = ch3.W(fkaVar);
                    break;
                case 10:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.s0 = ch3.P(fkaVar, 1.401298464324817E-45d);
                    break;
                case 11:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.b0 = fkaVar.S0();
                    break;
                case 12:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.Z = ch3.T(fkaVar, 0L);
                    break;
                case 13:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.k = ch3.K(fkaVar);
                    break;
                case 14:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.P0 = ch3.T(fkaVar, 0L);
                    break;
                case 15:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.g0 = ch3.W(fkaVar);
                    break;
                case 16:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.n0 = ch3.W(fkaVar);
                    break;
                case 17:
                    i2 = iU;
                    i3 = i15;
                    i4 = i16;
                    k40Var.g = Integer.valueOf(ch3.R(fkaVar, i3));
                    break;
                case 18:
                    i2 = iU;
                    i4 = i16;
                    fkaVar.v0();
                    i3 = 0;
                    break;
                case 19:
                    i2 = iU;
                    i4 = i16;
                    k40Var.D0 = ch3.L(fkaVar);
                    i3 = 0;
                    break;
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                    i2 = iU;
                    i4 = i16;
                    fkaVar.v0();
                    i3 = 0;
                    break;
                case 21:
                    i2 = iU;
                    i4 = i16;
                    k40Var.F = ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case 22:
                    i2 = iU;
                    i4 = i16;
                    ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case 23:
                    i2 = iU;
                    i4 = i16;
                    ch3.T(fkaVar, 0L);
                    i3 = 0;
                    break;
                case 24:
                    i2 = iU;
                    i4 = i16;
                    ch3.L(fkaVar);
                    i3 = 0;
                    break;
                case 25:
                    i2 = iU;
                    i4 = i16;
                    k40Var.H0 = ch3.T(fkaVar, 0L);
                    i3 = 0;
                    break;
                case 26:
                    i2 = iU;
                    i4 = i16;
                    k40Var.j0 = ch3.T(fkaVar, 0L);
                    i3 = 0;
                    break;
                case 27:
                    i2 = iU;
                    i4 = i16;
                    k40Var.i0 = ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case 28:
                    i2 = iU;
                    i4 = i16;
                    int i18 = 2;
                    String strW2 = ch3.W(fkaVar);
                    if (strW2 != null) {
                        switch (strW2) {
                            case "ACCEPTED":
                                i18 = 4;
                                break;
                            case "RECEIVED":
                                i18 = 3;
                                break;
                            case "NEW":
                                break;
                            case "ACCEPTING":
                                i18 = 5;
                                break;
                            case "DECLINED":
                                i18 = 6;
                                break;
                            default:
                                i18 = 1;
                                break;
                        }
                    } else {
                        i18 = 1;
                    }
                    k40Var.Y0 = i18;
                    i3 = 0;
                    break;
                case 29:
                    i2 = iU;
                    i4 = i16;
                    ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case 30:
                    i2 = iU;
                    i4 = i16;
                    k40Var.I0 = r5d.a(fkaVar);
                    i3 = 0;
                    break;
                case 31:
                    i2 = iU;
                    i4 = i16;
                    k40Var.n = Long.valueOf(fkaVar.I0());
                    i3 = 0;
                    break;
                case 32:
                    i2 = iU;
                    i4 = i16;
                    k40Var.O0 = ch3.T(fkaVar, 0L);
                    i3 = 0;
                    break;
                case 33:
                    i2 = iU;
                    i4 = i16;
                    k40Var.D = fkaVar.I0();
                    i3 = 0;
                    break;
                case 34:
                    i2 = iU;
                    i4 = i16;
                    k40Var.m = Long.valueOf(fkaVar.I0());
                    i3 = 0;
                    break;
                case vg8.l /* 35 */:
                    i2 = iU;
                    i4 = i16;
                    k40Var.H = ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case 36:
                    i2 = iU;
                    i4 = i16;
                    k40Var.h = ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case LangUtils.HASH_OFFSET /* 37 */:
                    i2 = iU;
                    i4 = i16;
                    k40Var.e = ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case 38:
                    i2 = iU;
                    i4 = i16;
                    fkaVar.v0();
                    i3 = 0;
                    break;
                case 39:
                    i2 = iU;
                    i4 = i16;
                    ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case 40:
                    i2 = iU;
                    i4 = i16;
                    k40Var.h0 = ch3.T(fkaVar, 0L);
                    i3 = 0;
                    break;
                case 41:
                    i2 = iU;
                    i4 = i16;
                    ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case 42:
                    i2 = iU;
                    i4 = i16;
                    k40Var.c = ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case 43:
                    i2 = iU;
                    i4 = i16;
                    k40Var.R0 = b(fkaVar);
                    i3 = 0;
                    break;
                case 44:
                    i2 = iU;
                    i4 = i16;
                    ch3.L(fkaVar);
                    i3 = 0;
                    break;
                case 45:
                    i2 = iU;
                    i4 = i16;
                    k40Var.I = ch3.T(fkaVar, 0L);
                    i3 = 0;
                    break;
                case 46:
                    i2 = iU;
                    i4 = i16;
                    String strW3 = ch3.W(fkaVar);
                    strW3.getClass();
                    k40Var.W0 = strW3.equals("AUDIO") ? 2 : !strW3.equals("VIDEO") ? 1 : 3;
                    i3 = 0;
                    break;
                case 47:
                    i2 = iU;
                    i4 = i16;
                    ArrayList arrayList = new ArrayList();
                    int iJ = ch3.J(fkaVar);
                    for (int i19 = 0; i19 < iJ; i19++) {
                        arrayList.add(Long.valueOf(fkaVar.I0()));
                    }
                    k40Var.o = arrayList;
                    i3 = 0;
                    break;
                case 48:
                    i2 = iU;
                    i4 = i16;
                    k40Var.K = ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case 49:
                    i2 = iU;
                    i4 = i16;
                    k40Var.u0 = ch3.P(fkaVar, 0.0d);
                    i3 = 0;
                    break;
                case 50:
                    i2 = iU;
                    i4 = i16;
                    k40Var.v0 = ch3.Q(fkaVar);
                    i3 = 0;
                    break;
                case 51:
                    i2 = iU;
                    i4 = i16;
                    k40Var.j = fkaVar.v0();
                    i3 = 0;
                    break;
                case 52:
                    i2 = iU;
                    i4 = i16;
                    k40Var.w0 = ch3.Q(fkaVar);
                    i3 = 0;
                    break;
                case 53:
                    i2 = iU;
                    i4 = i16;
                    k40Var.x0 = ch3.Q(fkaVar);
                    i3 = 0;
                    break;
                case 54:
                    i2 = iU;
                    i4 = i16;
                    k40Var.d = ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case 55:
                    i2 = iU;
                    i4 = i16;
                    k40Var.P = ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case 56:
                    i2 = iU;
                    i4 = i16;
                    k40Var.X = ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case 57:
                    i2 = iU;
                    i4 = i16;
                    k40Var.x = fkaVar.v0();
                    i3 = 0;
                    break;
                case 58:
                    i2 = iU;
                    i4 = i16;
                    k40Var.U = ch3.W(fkaVar);
                    i3 = 0;
                    break;
                case 59:
                    i2 = iU;
                    i4 = i16;
                    k40Var.Q0 = ch3.T(fkaVar, 0L);
                    i3 = 0;
                    break;
                case 60:
                    i2 = iU;
                    i4 = i16;
                    int iJ2 = ch3.J(fkaVar);
                    ArrayList arrayList2 = new ArrayList(iJ2);
                    for (int i20 = 0; i20 < iJ2; i20++) {
                        arrayList2.add(fkaVar.S0());
                    }
                    k40Var.J = arrayList2;
                    i3 = 0;
                    break;
                case 61:
                    i2 = iU;
                    i4 = i16;
                    k40Var.E = ch3.K(fkaVar);
                    i3 = 0;
                    break;
                case 62:
                    i2 = iU;
                    i4 = i16;
                    k40Var.C0 = ch3.Q(fkaVar);
                    i3 = 0;
                    break;
                case 63:
                    i2 = iU;
                    i4 = i16;
                    k40Var.a = w50.a(fkaVar.S0());
                    i3 = 0;
                    break;
                case 64:
                    i2 = iU;
                    i4 = i16;
                    k40Var.T = fkaVar.I0();
                    i3 = 0;
                    break;
                case 65:
                    i2 = iU;
                    i4 = i16;
                    k40Var.G0 = ch3.L(fkaVar);
                    i3 = 0;
                    break;
                case 66:
                    i2 = iU;
                    i4 = i16;
                    String strS1 = fkaVar.S0();
                    if (strS1 != null) {
                        switch (strS1.hashCode()) {
                            case -934610812:
                                if (strS1.equals("remove")) {
                                }
                                break;
                            case -887328209:
                                if (strS1.equals("system")) {
                                }
                                break;
                            case -772432710:
                                if (strS1.equals("botStarted")) {
                                }
                                break;
                            case 96417:
                                if (strS1.equals("add")) {
                                }
                                break;
                            case 108960:
                                if (strS1.equals("new")) {
                                }
                                break;
                            case 110997:
                                if (strS1.equals("pin")) {
                                }
                                break;
                            case 3226745:
                                if (strS1.equals("icon")) {
                                }
                                break;
                            case 99162322:
                                if (strS1.equals("hello")) {
                                }
                                break;
                            case 102846135:
                                if (strS1.equals("leave")) {
                                }
                                break;
                            case 110371416:
                                if (strS1.equals("title")) {
                                }
                                break;
                            case 1036709563:
                                if (strS1.equals("joinByLink")) {
                                }
                                break;
                        }
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Switch insn not found in header
                            	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            */
                        /*
                            Method dump skipped, instruction units count: 5092
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.l40.b(fka):l40");
                    }

                    public HashMap a() {
                        HashMap map = new HashMap();
                        map.put("_type", this.a.a);
                        return map;
                    }

                    public String toString() {
                        return qt4.r(zo5.A("Attach{type=", String.valueOf(this.a), ", deleted=", ", sensitive=", this.b), this.c, "}");
                    }
                }
