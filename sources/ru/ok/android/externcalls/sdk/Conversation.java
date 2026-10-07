package ru.ok.android.externcalls.sdk;

import defpackage.bu1;
import defpackage.cf7;
import defpackage.eb0;
import defpackage.hh2;
import defpackage.ht7;
import defpackage.it7;
import defpackage.la6;
import defpackage.ll;
import defpackage.m91;
import defpackage.ma6;
import defpackage.my7;
import defpackage.n4g;
import defpackage.o91;
import defpackage.p5a;
import defpackage.s4g;
import defpackage.sbi;
import defpackage.sg4;
import defpackage.w83;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.asr.AsrManager;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.chat.ChatManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionManager;
import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.rate.RateManager;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager;
import ru.ok.android.externcalls.sdk.video.CameraManager;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¼\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0006\u0094\u0002\u0095\u0002\u0096\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0015\u0010\u0016JA\u0010\u001d\u001a\u00020\u00042\n\u0010\n\u001a\u00060\u0017j\u0002`\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001bH'¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001d\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00022\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001bH'¢\u0006\u0004\b\u001d\u0010\u001fJc\u0010&\u001a\u00020\u00042\u0010\u0010!\u001a\f\u0012\b\u0012\u00060\u0017j\u0002`\u00180 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00040\"2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"H'¢\u0006\u0004\b&\u0010'J-\u0010*\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\t2\u0006\u0010$\u001a\u00020)2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020%0\u001bH&¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020\u00042\n\u0010,\u001a\u00060\u0017j\u0002`\u0018H&¢\u0006\u0004\b-\u0010.J#\u0010-\u001a\u00020\u00042\n\u0010,\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010/\u001a\u00020\u0002H&¢\u0006\u0004\b-\u00100J!\u00103\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u00102\u001a\u000201H&¢\u0006\u0004\b3\u00104J#\u00107\u001a\u00020\u00042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t05H&¢\u0006\u0004\b7\u00108J-\u00107\u001a\u00020\u00042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t052\b\u0010:\u001a\u0004\u0018\u000109H&¢\u0006\u0004\b7\u0010;J\u001f\u0010>\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00022\u0006\u0010:\u001a\u00020=H&¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@H&¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0004H&¢\u0006\u0004\bD\u0010EJ\u0019\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\bG\u0010HJ#\u0010J\u001a\u00020\u00042\n\u0010,\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010I\u001a\u00020\u0002H&¢\u0006\u0004\bJ\u00100J7\u0010O\u001a\u00020\u00042\n\u0010\n\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010K\u001a\u00020\u00022\u0012\u0010N\u001a\n\u0012\u0006\b\u0001\u0012\u00020M0L\"\u00020MH&¢\u0006\u0004\bO\u0010PJ#\u0010R\u001a\u00020\u00042\n\u0010\n\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010Q\u001a\u00020\u0002H&¢\u0006\u0004\bR\u00100J#\u0010T\u001a\u00020\u00042\n\u0010\n\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010S\u001a\u00020\u0002H&¢\u0006\u0004\bT\u00100J\u000f\u0010U\u001a\u00020\u0004H&¢\u0006\u0004\bU\u0010EJ\u000f\u0010V\u001a\u00020\u0004H&¢\u0006\u0004\bV\u0010EJ/\u0010[\u001a\u00020\u00042\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u00022\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001bH&¢\u0006\u0004\b[\u0010\\J)\u0010^\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00022\u0010\b\u0002\u0010Z\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001bH&¢\u0006\u0004\b^\u0010_J)\u0010`\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00022\u0010\b\u0002\u0010Z\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001bH&¢\u0006\u0004\b`\u0010_J)\u0010a\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00022\u0010\b\u0002\u0010Z\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001bH&¢\u0006\u0004\ba\u0010_J\u0017\u0010c\u001a\u00020\u00042\u0006\u0010:\u001a\u00020bH&¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020\u00042\u0006\u0010:\u001a\u00020bH&¢\u0006\u0004\be\u0010dJ+\u0010k\u001a\u00020\u00042\b\u0010g\u001a\u0004\u0018\u00010f2\b\u0010h\u001a\u0004\u0018\u00010f2\u0006\u0010j\u001a\u00020iH&¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u0004H&¢\u0006\u0004\bm\u0010ER\u0014\u0010q\u001a\u00020n8&X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010y\u001a\u00020v8&X¦\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001a\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009a\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010¡\u0001\u001a\u00030\u009e\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¥\u0001\u001a\u00030¢\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010©\u0001\u001a\u00030¦\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030ª\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010±\u0001\u001a\u00030®\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010µ\u0001\u001a\u00030²\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u0018\u0010¹\u0001\u001a\u00030¶\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u0018\u0010½\u0001\u001a\u00030º\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u001f\u0010Â\u0001\u001a\u00030¾\u00018&X§\u0004¢\u0006\u000f\u0012\u0005\bÁ\u0001\u0010E\u001a\u0006\b¿\u0001\u0010À\u0001R\u0018\u0010Æ\u0001\u001a\u00030Ã\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0018\u0010Ê\u0001\u001a\u00030Ç\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Î\u0001\u001a\u00030Ë\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ï\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0016\u0010Ó\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010\bR\u0016\u0010Ô\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010\bR\u0016\u0010Õ\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010\bR\u0016\u0010Ö\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010\bR\u0017\u0010Ù\u0001\u001a\u00020\t8&X¦\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010Ø\u0001R\u0016\u0010Ú\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÚ\u0001\u0010\bR\u0016\u0010Û\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010\bR\u0016\u0010Ü\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÜ\u0001\u0010\bR\u0016\u0010Ý\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÝ\u0001\u0010\bR\u001d\u0010Þ\u0001\u001a\u00020\u00028&X§\u0004¢\u0006\u000e\u0012\u0005\bß\u0001\u0010E\u001a\u0005\bÞ\u0001\u0010\bR\u0016\u0010à\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bà\u0001\u0010\bR\u0017\u0010S\u001a\u00030á\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0016\u0010ä\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bä\u0001\u0010\bR\u0018\u0010è\u0001\u001a\u00030å\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bæ\u0001\u0010ç\u0001R\u001a\u0010ì\u0001\u001a\u0005\u0018\u00010é\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bê\u0001\u0010ë\u0001R\u0019\u0010î\u0001\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010Ø\u0001R\u0019\u0010ñ\u0001\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010ð\u0001R\u0018\u0010õ\u0001\u001a\u00030ò\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bó\u0001\u0010ô\u0001R\u0019\u0010÷\u0001\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010Ø\u0001R\u0016\u0010ø\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bø\u0001\u0010\bR\u001e\u0010ù\u0001\u001a\u00020\u00028&@&X¦\u000e¢\u0006\r\u001a\u0005\bù\u0001\u0010\b\"\u0004\b`\u0010\u0006R\u0016\u0010ú\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bú\u0001\u0010\bR\u0016\u0010û\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bû\u0001\u0010\bR\u0016\u0010ü\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bü\u0001\u0010\bR\u001e\u0010ý\u0001\u001a\u00020\u00028&@&X¦\u000e¢\u0006\r\u001a\u0005\bý\u0001\u0010\b\"\u0004\b^\u0010\u0006R\u001e\u0010þ\u0001\u001a\u00020\u00028&@&X¦\u000e¢\u0006\r\u001a\u0005\bþ\u0001\u0010\b\"\u0004\ba\u0010\u0006R\u0016\u0010ÿ\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÿ\u0001\u0010\bR\u0017\u0010\u0081\u0002\u001a\u00020\u000f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010ð\u0001R\u0016\u0010\u0082\u0002\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0002\u0010\bR\u0016\u0010\u0083\u0002\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0002\u0010\bR\u0016\u0010\u0084\u0002\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0002\u0010\bR\u0017\u0010\u0087\u0002\u001a\u00020f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R\u0016\u0010\u0088\u0002\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0002\u0010\bR\u0019\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0089\u0002\u0010ð\u0001R!\u0010\u008f\u0002\u001a\u0005\u0018\u00010\u008b\u00028&X§\u0004¢\u0006\u000f\u0012\u0005\b\u008e\u0002\u0010E\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0018\u0010\u0093\u0002\u001a\u00030\u0090\u00028&X¦\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002¨\u0006\u0097\u0002À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/Conversation;", "", "", "enabled", "Lsbi;", "setAudioCaptureEnabled", "(Z)V", "hasRegisteredParticipnats", "()Z", "", "externalId", "isParticipantCreator", "(Ljava/lang/String;)Z", "isParticipantAdmin", "isParticipantCreatorOrAdmin", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participant", "Lp5a;", "getParticipantMediaStat", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Lp5a;", "", "getAdjustedAudioLevel", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)F", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "unban", "isShowChatHistory", "Lsg4;", "onError", "addParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ljava/lang/Boolean;ZLsg4;)V", "(Ljava/lang/String;ZLsg4;)V", "", "participantIds", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsResult;", "onSuccess", "", "addParticipants", "(Ljava/util/Collection;Ljava/lang/Boolean;ZLcf7;Lcf7;)V", "link", "Ljava/lang/Runnable;", "addParticipantByLink", "(Ljava/lang/String;Ljava/lang/Runnable;Lsg4;)V", "participantExternalId", "removeParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "ban", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Z)V", "Lorg/json/JSONObject;", "data", "sendData", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Lorg/json/JSONObject;)V", "", "newState", "changeMyState", "(Ljava/util/Map;)V", "Ln4g;", "listener", "(Ljava/util/Map;Ln4g;)V", "isHold", "Lmy7;", "requestHoldStateChange", "(ZLmy7;)V", "Lht7;", "parameters", "hangup", "(Lht7;)V", "muteAll", "()V", "Leb0;", "getAudioLevel", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Leb0;", "promote", "promoteParticipant", "revoke", "", "Lbu1;", "roles", "grantRoles", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Z[Lbu1;)V", "pin", "pinParticipant", "state", "setMuteState", "init", "connect", "Lm91;", "option", "isEnabled", "onAnswer", "setCallOptionEnabled", "(Lm91;ZLsg4;)V", "forbidden", "setAnonJoinForbidden", "(ZLsg4;)V", "setWaitingRoomEnabled", "setFeedbackEnabled", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "addEventsListener", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)V", "removeEventsListener", "", "offset", "count", "Lru/ok/android/externcalls/sdk/Conversation$ChatHistoryCallback;", "onResponse", "queryChatHistory", "(Ljava/lang/Integer;Ljava/lang/Integer;Lru/ok/android/externcalls/sdk/Conversation$ChatHistoryCallback;)V", "release", "Lru/ok/android/externcalls/sdk/asr/AsrManager;", "getAsrManager", "()Lru/ok/android/externcalls/sdk/asr/AsrManager;", "asrManager", "Lru/ok/android/externcalls/sdk/chat/ChatManager;", "getChatManager", "()Lru/ok/android/externcalls/sdk/chat/ChatManager;", "chatManager", "Lru/ok/android/externcalls/sdk/record/RecordManager;", "getRecordManager", "()Lru/ok/android/externcalls/sdk/record/RecordManager;", "recordManager", "Lll;", "getAnimojiControl", "()Lll;", "animojiControl", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager;", "getFeatureManager", "()Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager;", "featureManager", "Lru/ok/android/externcalls/sdk/feedback/FeedbackManager;", "getFeedbackManager", "()Lru/ok/android/externcalls/sdk/feedback/FeedbackManager;", "feedbackManager", "Lru/ok/android/externcalls/sdk/media/mute/MediaMuteManager;", "getMediaMuteManager", "()Lru/ok/android/externcalls/sdk/media/mute/MediaMuteManager;", "mediaMuteManager", "Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineManager;", "getAsrOnlineManager", "()Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineManager;", "asrOnlineManager", "Lru/ok/android/externcalls/sdk/stereo/StereoRoomManager;", "getStereoRoomManager", "()Lru/ok/android/externcalls/sdk/stereo/StereoRoomManager;", "stereoRoomManager", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingManager;", "getUrlSharingManager", "()Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingManager;", "urlSharingManager", "Lru/ok/android/externcalls/sdk/contacts/ContactCallManager;", "getContactCallManager", "()Lru/ok/android/externcalls/sdk/contacts/ContactCallManager;", "contactCallManager", "Lhh2;", "getCameraStatProvider", "()Lhh2;", "cameraStatProvider", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager;", "getSessionRoomManager", "()Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager;", "sessionRoomManager", "Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender;", "getDisplayLayoutSender", "()Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender;", "displayLayoutSender", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "getWatchTogetherPlayer", "()Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "watchTogetherPlayer", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;", "getParticipantStatesManager", "()Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;", "participantStatesManager", "Lru/ok/android/externcalls/sdk/audio/MicrophoneManager;", "getMicrophoneManager", "()Lru/ok/android/externcalls/sdk/audio/MicrophoneManager;", "microphoneManager", "Lru/ok/android/externcalls/sdk/video/CameraManager;", "getCameraManager", "()Lru/ok/android/externcalls/sdk/video/CameraManager;", "cameraManager", "Lru/ok/android/externcalls/sdk/video/VideoRenderManager;", "getVideoRenderManager", "()Lru/ok/android/externcalls/sdk/video/VideoRenderManager;", "videoRenderManager", "Lru/ok/android/externcalls/sdk/video/ScreenCaptureManager;", "getScreenCaptureManager", "()Lru/ok/android/externcalls/sdk/video/ScreenCaptureManager;", "screenCaptureManager", "Lru/ok/android/externcalls/sdk/dev/DebugManager;", "getDebugManager", "()Lru/ok/android/externcalls/sdk/dev/DebugManager;", "getDebugManager$annotations", "debugManager", "Lru/ok/android/externcalls/sdk/net/NetworkConnectionManager;", "getNetworkConnectionManager", "()Lru/ok/android/externcalls/sdk/net/NetworkConnectionManager;", "networkConnectionManager", "Lru/ok/android/externcalls/sdk/audio/NoiseSuppressionManager;", "getNoiseSuppressionManager", "()Lru/ok/android/externcalls/sdk/audio/NoiseSuppressionManager;", "noiseSuppressionManager", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionManager;", "getMediaConnectionManager", "()Lru/ok/android/externcalls/sdk/connection/MediaConnectionManager;", "mediaConnectionManager", "Lru/ok/android/externcalls/sdk/rate/RateManager;", "getRateManager", "()Lru/ok/android/externcalls/sdk/rate/RateManager;", "rateManager", "isPermissionsGranted", "isVideoPermissionGranted", "isPrepared", "isInited", "getConversationId", "()Ljava/lang/String;", ApiProtocol.PARAM_CONVERSATION_ID, "isConcurrent", "isRecurring", "isConnected", "isAnswered", "isConditionAccepted", "isConditionAccepted$annotations", "isDestroyed", "Lru/ok/android/externcalls/sdk/Conversation$State;", "getState", "()Lru/ok/android/externcalls/sdk/Conversation$State;", "isGroupCall", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "getCallType", "()Lru/ok/android/externcalls/sdk/Conversation$CallType;", "callType", "Lru/ok/android/externcalls/sdk/api/CallInfo;", "getCallInfo", "()Lru/ok/android/externcalls/sdk/api/CallInfo;", "callInfo", "getJoinLink", ApiProtocol.PARAM_JOIN_LINK, "getOpponent", "()Lru/ok/android/externcalls/sdk/ConversationParticipant;", "opponent", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantCollection;", "getParticipants", "()Lru/ok/android/externcalls/sdk/participant/collection/ParticipantCollection;", "participants", "getDestroyReason", "destroyReason", "isMuteParticipantsPermitted", "isWaitingRoomEnabled", "isWaitForAdminEnabled", "isAdminHere", "isHeldByMe", "isAnonJoinForbidden", "isFeedbackEnabled", "isFeatureAddParticipantEnabled", "getMe", "me", "isMeCreatorOrAdmin", "isMeInWaitingRoom", "isCaller", "getAudioLevelFrequencyMs", "()I", "audioLevelFrequencyMs", "isInitialVideoEnabled", "getPinnedParticipant", "pinnedParticipant", "Lit7;", "getRejectReason", "()Lit7;", "getRejectReason$annotations", "rejectReason", "Lo91;", "getUnderlyingCall", "()Lo91;", "underlyingCall", "CallType", "State", "ChatHistoryCallback", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface Conversation {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/Conversation$CallType;", "", "<init>", "(Ljava/lang/String;I)V", "Incoming", "Outgoing", "Join", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum CallType {
        Incoming,
        Outgoing,
        Join;

        private static final /* synthetic */ la6 $ENTRIES = new ma6(values());

        public static la6 getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/Conversation$ChatHistoryCallback;", "", "", "Ls4g;", "data", "Lsbi;", "onResponse", "([Ls4g;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface ChatHistoryCallback {
        void onResponse(s4g[] data);
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getDebugManager$annotations() {
        }

        public static /* synthetic */ void getRejectReason$annotations() {
        }

        public static /* synthetic */ void isConditionAccepted$annotations() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/Conversation$State;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Preparing", "Starting", "Connecting", "Connected", "HeldByMe", "Finished", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum State {
        None,
        Preparing,
        Starting,
        Connecting,
        Connected,
        HeldByMe,
        Finished;

        private static final /* synthetic */ la6 $ENTRIES = new ma6(values());

        public static la6 getEntries() {
            return $ENTRIES;
        }
    }

    static /* synthetic */ void addParticipant$default(Conversation conversation, ParticipantId participantId, Boolean bool, boolean z, sg4 sg4Var, int i, Object obj) {
        if (obj != null) {
            defpackage.c.i("Super calls with default arguments not supported in this target, function: addParticipant");
            return;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            sg4Var = null;
        }
        conversation.addParticipant(participantId, bool, z, sg4Var);
    }

    static /* synthetic */ void addParticipants$default(Conversation conversation, Collection collection, Boolean bool, boolean z, cf7 cf7Var, cf7 cf7Var2, int i, Object obj) {
        if (obj != null) {
            defpackage.c.i("Super calls with default arguments not supported in this target, function: addParticipants");
            return;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            cf7Var = new w83(19);
        }
        cf7 cf7Var3 = cf7Var;
        if ((i & 16) != 0) {
            cf7Var2 = null;
        }
        conversation.addParticipants(collection, bool, z2, cf7Var3, cf7Var2);
    }

    static sbi addParticipants$lambda$0(AddParticipantsResult addParticipantsResult) {
        return sbi.a;
    }

    static /* synthetic */ void setAnonJoinForbidden$default(Conversation conversation, boolean z, sg4 sg4Var, int i, Object obj) {
        if (obj != null) {
            defpackage.c.i("Super calls with default arguments not supported in this target, function: setAnonJoinForbidden");
            return;
        }
        if ((i & 2) != 0) {
            sg4Var = null;
        }
        conversation.setAnonJoinForbidden(z, sg4Var);
    }

    static /* synthetic */ void setFeedbackEnabled$default(Conversation conversation, boolean z, sg4 sg4Var, int i, Object obj) {
        if (obj != null) {
            defpackage.c.i("Super calls with default arguments not supported in this target, function: setFeedbackEnabled");
            return;
        }
        if ((i & 2) != 0) {
            sg4Var = null;
        }
        conversation.setFeedbackEnabled(z, sg4Var);
    }

    static /* synthetic */ void setWaitingRoomEnabled$default(Conversation conversation, boolean z, sg4 sg4Var, int i, Object obj) {
        if (obj != null) {
            defpackage.c.i("Super calls with default arguments not supported in this target, function: setWaitingRoomEnabled");
            return;
        }
        if ((i & 2) != 0) {
            sg4Var = null;
        }
        conversation.setWaitingRoomEnabled(z, sg4Var);
    }

    void addEventsListener(ConversationEventsListener listener);

    void addParticipant(String externalId, boolean unban, sg4 onError);

    void addParticipant(ParticipantId externalId, Boolean unban, boolean isShowChatHistory, sg4 onError);

    void addParticipantByLink(String link, Runnable onSuccess, sg4 onError);

    void addParticipants(Collection<ParticipantId> participantIds, Boolean unban, boolean isShowChatHistory, cf7 onSuccess, cf7 onError);

    void changeMyState(Map<String, String> newState);

    void changeMyState(Map<String, String> newState, n4g listener);

    void connect();

    float getAdjustedAudioLevel(ConversationParticipant participant);

    ll getAnimojiControl();

    AsrManager getAsrManager();

    AsrOnlineManager getAsrOnlineManager();

    eb0 getAudioLevel(ConversationParticipant participant);

    int getAudioLevelFrequencyMs();

    CallInfo getCallInfo();

    CallType getCallType();

    CameraManager getCameraManager();

    hh2 getCameraStatProvider();

    ChatManager getChatManager();

    ContactCallManager getContactCallManager();

    String getConversationId();

    DebugManager getDebugManager();

    String getDestroyReason();

    DisplayLayoutSender getDisplayLayoutSender();

    ConversationFeatureManager getFeatureManager();

    FeedbackManager getFeedbackManager();

    String getJoinLink();

    ConversationParticipant getMe();

    MediaConnectionManager getMediaConnectionManager();

    MediaMuteManager getMediaMuteManager();

    MicrophoneManager getMicrophoneManager();

    NetworkConnectionManager getNetworkConnectionManager();

    NoiseSuppressionManager getNoiseSuppressionManager();

    ConversationParticipant getOpponent();

    p5a getParticipantMediaStat(ConversationParticipant participant);

    ParticipantStatesManager getParticipantStatesManager();

    ParticipantCollection getParticipants();

    ConversationParticipant getPinnedParticipant();

    RateManager getRateManager();

    RecordManager getRecordManager();

    it7 getRejectReason();

    ScreenCaptureManager getScreenCaptureManager();

    SessionRoomsManager getSessionRoomManager();

    State getState();

    StereoRoomManager getStereoRoomManager();

    o91 getUnderlyingCall();

    UrlSharingManager getUrlSharingManager();

    VideoRenderManager getVideoRenderManager();

    WatchTogetherPlayer getWatchTogetherPlayer();

    void grantRoles(ParticipantId externalId, boolean revoke, bu1... roles);

    void hangup(ht7 parameters);

    boolean hasRegisteredParticipnats();

    void init();

    boolean isAdminHere();

    boolean isAnonJoinForbidden();

    boolean isAnswered();

    boolean isCaller();

    boolean isConcurrent();

    boolean isConditionAccepted();

    boolean isConnected();

    boolean isDestroyed();

    boolean isFeatureAddParticipantEnabled();

    boolean isFeedbackEnabled();

    boolean isGroupCall();

    boolean isHeldByMe();

    boolean isInited();

    boolean isInitialVideoEnabled();

    boolean isMeCreatorOrAdmin();

    boolean isMeInWaitingRoom();

    boolean isMuteParticipantsPermitted();

    boolean isParticipantAdmin(String externalId);

    boolean isParticipantCreator(String externalId);

    boolean isParticipantCreatorOrAdmin(String externalId);

    boolean isPermissionsGranted();

    boolean isPrepared();

    boolean isRecurring();

    boolean isVideoPermissionGranted();

    boolean isWaitForAdminEnabled();

    boolean isWaitingRoomEnabled();

    void muteAll();

    void pinParticipant(ParticipantId externalId, boolean pin);

    void promoteParticipant(ParticipantId participantExternalId, boolean promote);

    void queryChatHistory(Integer offset, Integer count, ChatHistoryCallback onResponse);

    void release();

    void removeEventsListener(ConversationEventsListener listener);

    void removeParticipant(ParticipantId participantExternalId);

    void removeParticipant(ParticipantId participantExternalId, boolean ban);

    void requestHoldStateChange(boolean isHold, my7 listener);

    void sendData(ConversationParticipant participant, JSONObject data);

    void setAnonJoinForbidden(boolean z);

    void setAnonJoinForbidden(boolean forbidden, sg4 onAnswer);

    void setAudioCaptureEnabled(boolean enabled);

    void setCallOptionEnabled(m91 option, boolean isEnabled, sg4 onAnswer);

    void setFeedbackEnabled(boolean z);

    void setFeedbackEnabled(boolean isEnabled, sg4 onAnswer);

    void setMuteState(ParticipantId externalId, boolean state);

    void setWaitingRoomEnabled(boolean z);

    void setWaitingRoomEnabled(boolean isEnabled, sg4 onAnswer);
}
