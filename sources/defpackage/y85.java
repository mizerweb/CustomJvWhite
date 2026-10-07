package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.android.calls.CallNotifierFixActivity;
import one.me.calls.impl.model.CallCreateException;
import one.me.calls.impl.utils.ConnectionUnavailableException;
import one.me.sdk.arch.Widget;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ExternApiException;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.rate.RateHint;
import ru.ok.android.externcalls.sdk.video.CameraManager;
import ru.ok.android.webrtc.model.exception.ServiceUnavailableException;

/* JADX INFO: loaded from: classes4.dex */
public final class y85 implements x02, ou {
    public final ny8 A;
    public final AtomicBoolean A1;
    public final ny8 B;
    public final AtomicBoolean B1;
    public final ny8 C;
    public Long C1;
    public final ny8 D;
    public final ifh D1;
    public final ny8 E;
    public final i5d E1;
    public final ny8 F;
    public final mjg F1;
    public final ny8 G;
    public final mjg G1;
    public final ny8 H;
    public final mjg H1;
    public final ifh I;
    public final r8e I1;
    public final ny8 J;
    public final ny8 J1;
    public final ny8 K;
    public final ny8 K1;
    public final n85 L1;
    public final xp1 M1;
    public final ny8 X;
    public final ny8 Y;
    public final ny8 Z;
    public final String a;
    public final ha9 b;
    public final y82 c;
    public final gf1 d;
    public final b95 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 n1;
    public final ny8 o;
    public sgg o1;
    public final ny8 p;
    public sgg p1;
    public final ny8 q;
    public sgg q1;
    public final ny8 r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final p3c v1;
    public final ny8 w;
    public volatile tid w1;
    public final ny8 x;
    public boolean x1;
    public final ny8 y;
    public final AtomicBoolean y1;
    public final ny8 z;
    public final AtomicBoolean z1;
    public static final /* synthetic */ zv8[] O1 = {new z8b(y85.class, "opponentRegistrationWaitJob", "getOpponentRegistrationWaitJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, y85.class, "firstNonZeroAudioStatsJob", "getFirstNonZeroAudioStatsJob()Lkotlinx/coroutines/Job;"), new z8b(y85.class, "delayedCallStartJob", "getDelayedCallStartJob()Lkotlinx/coroutines/Job;"), new z8b(y85.class, "heldByPeerSoundJob", "getHeldByPeerSoundJob()Lkotlinx/coroutines/Job;")};
    public static final er3 N1 = new er3();
    public final p3c r1 = qyj.S();
    public final AtomicReference s1 = new AtomicReference(null);
    public final p3c t1 = qyj.S();
    public final p3c u1 = qyj.S();

    public y85(String str, ha9 ha9Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16, ny8 ny8Var17, ny8 ny8Var18, ny8 ny8Var19, ny8 ny8Var20, ny8 ny8Var21, ny8 ny8Var22, ny8 ny8Var23, ny8 ny8Var24, ny8 ny8Var25, ny8 ny8Var26, ny8 ny8Var27, ny8 ny8Var28, y82 y82Var, gf1 gf1Var, ny8 ny8Var29, ny8 ny8Var30, ny8 ny8Var31, ny8 ny8Var32, ifh ifhVar, ny8 ny8Var33, ny8 ny8Var34, ny8 ny8Var35, ny8 ny8Var36, ny8 ny8Var37, ny8 ny8Var38, b95 b95Var) {
        this.a = str;
        this.b = ha9Var;
        this.c = y82Var;
        this.d = gf1Var;
        this.e = b95Var;
        this.f = ny8Var;
        this.g = ny8Var5;
        this.h = ny8Var6;
        this.i = ny8Var7;
        this.j = ny8Var8;
        this.k = ny8Var9;
        this.l = ny8Var10;
        this.m = ny8Var11;
        this.n = ny8Var13;
        this.o = ny8Var15;
        this.p = ny8Var17;
        this.q = ny8Var12;
        this.r = ny8Var14;
        this.s = ny8Var20;
        this.t = ny8Var18;
        this.u = ny8Var21;
        this.v = ny8Var22;
        this.w = ny8Var2;
        this.x = ny8Var3;
        this.y = ny8Var4;
        this.z = ny8Var24;
        this.A = ny8Var25;
        this.B = ny8Var26;
        this.C = ny8Var29;
        this.D = ny8Var19;
        this.E = ny8Var27;
        this.F = ny8Var30;
        this.G = ny8Var31;
        this.H = ny8Var32;
        this.I = ifhVar;
        this.J = ny8Var33;
        this.K = ny8Var16;
        this.X = ny8Var34;
        this.Y = ny8Var35;
        this.Z = ny8Var36;
        this.n1 = ny8Var38;
        p3c p3cVarS = qyj.S();
        this.v1 = p3cVarS;
        this.y1 = new AtomicBoolean(false);
        this.z1 = new AtomicBoolean(false);
        this.A1 = new AtomicBoolean(false);
        this.B1 = new AtomicBoolean(false);
        this.D1 = new ifh(new s35(2));
        b5d b5dVar = U().r1;
        zv8[] zv8VarArr = e5d.S6;
        this.E1 = b5dVar.a(zv8VarArr[120]);
        mjg mjgVarA = p90.a(dz4.r);
        this.F1 = mjgVarA;
        this.G1 = mjgVarA;
        Conversation conversationQ = Q();
        mjg mjgVarA2 = p90.a(Boolean.valueOf(conversationQ != null && conversationQ.isHeldByMe()));
        this.H1 = mjgVarA2;
        this.I1 = new r8e(mjgVarA2);
        this.J1 = rx8.P(3, new wre(this, ny8Var37, ny8Var25, 13));
        this.K1 = ny8Var28;
        this.L1 = new n85(this, ny8Var12, ny8Var11, ny8Var2, ny8Var, ny8Var3, ny8Var15);
        this.M1 = new xp1();
        ((wxb) ny8Var23.getValue()).getClass();
        e9i.j0(new fz6(new ra1(7, new xc3(T().a(), 4)), new o85(1, null, this), 3), y82Var);
        int iIntValue = ((Number) U().m6.a(zv8VarArr[378]).i()).intValue();
        if (iIntValue <= 0) {
            return;
        }
        p3cVarS.B(this, O1[3], yab.i0(y82Var, null, 0, new w93(this, iIntValue, (lq4) null, 3), 3));
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0142  */
    public static final void E(y85 y85Var, ConversationEndReason conversationEndReason) {
        char c;
        CancellationException cancellationException;
        Object value;
        Object value2;
        Object value3;
        dz4 dz4VarK;
        Object value4;
        dz4 dz4VarK2;
        hi6 hi6Var;
        pi6 pi6Var;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        boolean z;
        y85 y85Var2 = y85Var;
        ii6 ii6Var = ii6.a;
        je9 je9Var = je9.d;
        tid tidVar = y85Var2.w1;
        if (tidVar != null) {
            ((zid) y85Var2.Y.getValue()).a(tidVar.a);
        }
        Object obj = null;
        y85Var2.w1 = null;
        y85Var2.d0(null);
        ue1.h(y85Var2.N(), y85Var2.a);
        y85Var2.N().p(y85Var2.a);
        y85Var2.O().e = 8;
        Long l = (Long) y85Var2.A().a().getValue();
        c0(y85Var2, conversationEndReason, l != null ? l.longValue() : 0L, null, y85Var2.B1.get() ? "IOS_ONLY_NO_PWA_GSM" : null, 4);
        j72 j72Var = (j72) y85Var2.i.getValue();
        Integer num = j72Var.a;
        if (num == null || num.intValue() == 100) {
            num = null;
        }
        Integer num2 = j72Var.b;
        if (num2 == null || num2.intValue() == 100) {
            num2 = null;
        }
        j72Var.a = null;
        j72Var.b = null;
        char c2 = 1;
        if (num != null) {
            int iIntValue = num.intValue();
            sa2 sa2VarO = y85Var2.O();
            String strA = ns4.a(y85Var2.K().c);
            long j = iIntValue;
            phl phlVar = y85Var2.K().a;
            boolean z2 = phlVar != null && ((phlVar instanceof m32) ^ true);
            sa2VarO.getClass();
            sa2.c(sa2VarO, "SCREEN_ZOOM", strA, "VIDEO", Long.valueOf(j), null, null, z2, null, 368);
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            sa2 sa2VarO2 = y85Var2.O();
            String strA2 = ns4.a(y85Var2.K().c);
            long j2 = iIntValue2;
            phl phlVar2 = y85Var2.K().a;
            boolean z3 = phlVar2 != null && ((phlVar2 instanceof m32) ^ true);
            sa2VarO2.getClass();
            sa2.c(sa2VarO2, "SCREEN_ZOOM", strA2, "SCREENSHARE", Long.valueOf(j2), null, null, z3, null, 368);
        }
        Conversation conversationQ = y85Var2.Q();
        if (conversationQ != null) {
            jw5 jw5VarA = y85Var2.A();
            if (y85Var2.K().i || !y85Var2.K().h) {
                y85Var2.g0(conversationQ, conversationEndReason, jw5VarA);
            } else {
                Long l2 = y85Var2.C1;
                if (l2 != null) {
                    vg4 vg4VarF = ((no4) y85Var2.C.getValue()).a.f(l2.longValue(), false);
                    if (vg4VarF == null || !vg4VarF.h()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (l2 == null || conversationQ.isCaller() || z) {
                    y85Var2.g0(conversationQ, conversationEndReason, jw5VarA);
                } else {
                    String conversationId = conversationQ.getConversationId();
                    long jLongValue = l2.longValue();
                    n92 n92Var = (n92) y85Var2.s.getValue();
                    if (((gue) n92Var.c.getValue()).e()) {
                        so1 so1Var = (so1) n92Var.b.getValue();
                        so1Var.getClass();
                        Intent intent = new Intent(so1Var.c(), (Class<?>) CallNotifierFixActivity.class);
                        intent.setAction("action-unknown-call");
                        intent.putExtra("call_id", conversationId);
                        intent.putExtra("caller_id", jLongValue);
                        intent.setFlags(268435456);
                        intent.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, so1Var.a.a);
                        so1Var.c().startActivity(intent);
                    }
                }
            }
            y85Var2.A().release();
            y85Var2.V().e();
            y85Var2.P().d(false);
            l85 l85Var = (l85) y85Var2.s1.get();
            int i = l85Var == null ? -1 : m85.$EnumSwitchMapping$2[l85Var.ordinal()];
            if (i == 1) {
                c = 1;
                cancellationException = null;
                gm0.n("CallEngineTag", "opponentRegistrationWait: handleFinnishCallState -> set Failed(PHONE_RECALL)");
                mjg mjgVar = y85Var2.F1;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, dz4.a(y85Var2.K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, new hi6(gi6.p), 131071)));
                y85Var2.V().c();
                y85Var2.e.n(y85Var2.a);
            } else if (i != 2) {
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallEngineTag", "opponentRegistrationWait: handleFinnishCallState -> no timeout result, continue with reason=" + conversationEndReason, null);
                }
                if (y85Var2.B1.get()) {
                    gm0.n("CallEngineTag", "iosGsmRedirect: handleFinnishCallState -> set Failed(IOS_RESTRICTION)");
                    mjg mjgVar2 = y85Var2.F1;
                    do {
                        value9 = mjgVar2.getValue();
                    } while (!mjgVar2.h(value9, dz4.a(y85Var2.K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, new hi6(gi6.q), 131071)));
                    eqe eqeVarV = y85Var2.V();
                    eqeVarV.e = 2;
                    sw1 sw1VarA = eqeVarV.a();
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        sw1VarA.getClass();
                        if (a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, "RingtoneManagerTag", "startIosEnd ringtone", null);
                        }
                    }
                    if (sw1VarA.a()) {
                        sw1VarA.b(sw1VarA.g.b, false, 0);
                    } else {
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            je9 je9Var2 = je9.f;
                            if (a4cVar3.b(je9Var2)) {
                                a4cVar3.c(je9Var2, "RingtoneManagerTag", "Early return in startIosEnd cuz of !isRingtonePlayAvailable()", null);
                            }
                        }
                    }
                    y85Var2.e.n(y85Var2.a);
                    c = 1;
                    cancellationException = null;
                } else {
                    if (conversationEndReason instanceof ConversationEndReason.Missed) {
                        mjg mjgVar3 = y85Var2.F1;
                        do {
                            value8 = mjgVar3.getValue();
                        } while (!mjgVar3.h(value8, dz4.a(y85Var2.K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, new hi6(gi6.a), 131071)));
                        Conversation conversationQ2 = y85Var2.Q();
                        if (conversationQ2 != null && conversationQ2.isCaller()) {
                            y85Var2.V().c();
                        }
                    } else if (conversationEndReason instanceof ConversationEndReason.Rejected) {
                        mjg mjgVar4 = y85Var2.F1;
                        do {
                            value7 = mjgVar4.getValue();
                        } while (!mjgVar4.h(value7, dz4.a(y85Var2.K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, new hi6(gi6.m), 131071)));
                        Conversation conversationQ3 = y85Var2.Q();
                        if (conversationQ3 != null && conversationQ3.isCaller()) {
                            y85Var2.V().b();
                        }
                    } else if (conversationEndReason instanceof ConversationEndReason.Busy) {
                        mjg mjgVar5 = y85Var2.F1;
                        do {
                            value6 = mjgVar5.getValue();
                        } while (!mjgVar5.h(value6, dz4.a(y85Var2.K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, new hi6(gi6.b), 131071)));
                        y85Var2.V().b();
                    } else {
                        if (conversationEndReason instanceof ConversationEndReason.RemovedFromCall) {
                            y85Var2 = y85Var;
                        } else {
                            if (!(conversationEndReason instanceof ConversationEndReason.Banned)) {
                                if ((conversationEndReason instanceof ConversationEndReason.Hangup) || (conversationEndReason instanceof ConversationEndReason.EndedForAll) || (conversationEndReason instanceof ConversationEndReason.KilledWithoutDelete) || (conversationEndReason instanceof ConversationEndReason.Canceled) || (conversationEndReason instanceof ConversationEndReason.AcceptedOnAnotherDevice)) {
                                    mjg mjgVar6 = y85Var2.F1;
                                    while (true) {
                                        Object value10 = mjgVar6.getValue();
                                        mjg mjgVar7 = mjgVar6;
                                        c = c2;
                                        if (mjgVar7.h(value10, dz4.a(y85Var2.K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, ii6Var, 131071))) {
                                            break;
                                        }
                                        mjgVar6 = mjgVar7;
                                        c2 = c;
                                        obj = null;
                                        y85Var2 = y85Var;
                                    }
                                    if (!(conversationEndReason instanceof ConversationEndReason.AcceptedOnAnotherDevice)) {
                                        y85Var.V().c();
                                    }
                                    y85Var2 = y85Var;
                                } else if ((conversationEndReason instanceof ConversationEndReason.ConversationAlreadyEnded) || (conversationEndReason instanceof ConversationEndReason.CallTimeout) || (conversationEndReason instanceof ConversationEndReason.Error) || (conversationEndReason instanceof ConversationEndReason.ObsoleteClient) || (conversationEndReason instanceof ConversationEndReason.Unknown) || (conversationEndReason instanceof ConversationEndReason.InitiallyClosed) || (conversationEndReason instanceof ConversationEndReason.SocketClosed)) {
                                    mjg mjgVar8 = y85Var2.F1;
                                    do {
                                        value4 = mjgVar8.getValue();
                                        dz4VarK2 = y85Var2.K();
                                        if (dz4VarK2.i) {
                                            hi6Var = new hi6(gi6.n);
                                        } else if (dz4VarK2.h) {
                                            pi6Var = ii6Var;
                                        } else {
                                            hi6Var = new hi6(((conversationEndReason instanceof ConversationEndReason.Error) && (((ConversationEndReason.Error) conversationEndReason).getThrowable() instanceof ServiceUnavailableException)) ? gi6.o : gi6.d);
                                        }
                                        pi6Var = hi6Var;
                                    } while (!mjgVar8.h(value4, dz4.a(dz4VarK2, null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, pi6Var, 131071)));
                                    y85Var2.V().e();
                                } else {
                                    if (!(conversationEndReason instanceof ConversationEndReason.PeerConnectionTimeout) && !(conversationEndReason instanceof ConversationEndReason.SignalingTimeout)) {
                                        ore.o();
                                        return;
                                    }
                                    mjg mjgVar9 = y85Var2.F1;
                                    do {
                                        value5 = mjgVar9.getValue();
                                    } while (!mjgVar9.h(value5, dz4.a(y85Var2.K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, new hi6(gi6.e), 131071)));
                                    sa2 sa2VarO3 = y85Var2.O();
                                    String conversationId2 = conversationQ.getConversationId();
                                    boolean zIsGroupCall = conversationQ.isGroupCall();
                                    sa2VarO3.getClass();
                                    sa2.c(sa2VarO3, "BAD_CONNECTION_ALERT", conversationId2, "DISCONNECT", null, null, null, zIsGroupCall, null, 376);
                                    y85Var2.V().c();
                                }
                            }
                            y85Var2.e.n(y85Var2.a);
                            cancellationException = null;
                        }
                        c = 1;
                        mjg mjgVar10 = y85Var2.F1;
                        do {
                            value3 = mjgVar10.getValue();
                            dz4VarK = y85Var2.K();
                        } while (!mjgVar10.h(value3, dz4VarK.q instanceof oi6 ? dz4.a(dz4VarK, null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, new hi6(gi6.h), 131071) : dz4.a(dz4VarK, null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, new hi6(gi6.g), 131071)));
                        if (conversationQ.isAnswered()) {
                            y85Var2.V().c();
                        }
                        y85Var2.e.n(y85Var2.a);
                        cancellationException = null;
                    }
                    c = 1;
                    y85Var2.e.n(y85Var2.a);
                    cancellationException = null;
                }
            } else {
                c = 1;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                    cancellationException = null;
                    a4cVar4.c(je9Var, "CallEngineTag", "opponentRegistrationWait: handleFinnishCallState -> set Failed(OPPONENT_NO_NETWORK)", null);
                } else {
                    cancellationException = null;
                }
                mjg mjgVar11 = y85Var2.F1;
                do {
                    value2 = mjgVar11.getValue();
                } while (!mjgVar11.h(value2, dz4.a(y85Var2.K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, new hi6(gi6.f), 131071)));
                y85Var2.V().c();
                y85Var2.e.n(y85Var2.a);
            }
        } else {
            c = 1;
            cancellationException = null;
        }
        vo8 vo8Var = (vo8) y85Var2.t1.m(y85Var2, O1[c]);
        if (vo8Var != null) {
            vo8Var.b(cancellationException);
        }
    }

    public static final void F(y85 y85Var) {
        Object value;
        dz4 dz4VarK;
        boolean z;
        mjg mjgVar = y85Var.F1;
        do {
            value = mjgVar.getValue();
            dz4VarK = y85Var.K();
            if (!dz4VarK.i && !dz4VarK.j) {
                return;
            }
            if (!dz4VarK.f) {
                y85Var.h0(true);
            }
            Conversation conversationA = y85Var.D().a();
            Collection participants = conversationA != null ? conversationA.getParticipants() : null;
            if (participants == null) {
                participants = r66.a;
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : participants) {
                if (hashSet.add(((ConversationParticipant) obj).getExternalId())) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            boolean z2 = dz4VarK.i;
            if (z2 || size <= 2) {
                z = z2;
            } else {
                tid tidVar = y85Var.w1;
                if (tidVar != null) {
                    ((zid) y85Var.Y.getValue()).a(tidVar.a);
                }
                ((zid) y85Var.Y.getValue()).d(32L);
                y85Var.w1 = new tid(32L);
                y85Var.C1 = null;
                z = true;
            }
            boolean z3 = (dz4VarK.e || !y85Var.Y(participants)) ? dz4VarK.e : true;
            if (z3 != dz4VarK.e || z != dz4VarK.i) {
                dz4VarK = dz4.a(dz4VarK, null, 0L, null, null, z3, z ? true : dz4VarK.g, false, z, null, false, false, false, null, false, null, 261807);
            }
        } while (!mjgVar.h(value, dz4VarK));
    }

    public static void c0(y85 y85Var, ConversationEndReason conversationEndReason, long j, String str, String str2, int i) {
        String str3;
        la2 la2Var;
        str = null;
        String str4 = null;
        String errorMessage = (i & 4) != 0 ? null : str;
        String strValueOf = (i & 8) != 0 ? null : str2;
        String strA = ns4.a(y85Var.K().c);
        boolean z = y85Var.K().h;
        boolean z2 = y85Var.K().i;
        phl phlVar = y85Var.K().a;
        long j2 = (phlVar == null || !phlVar.b()) ? 1L : 2L;
        if (conversationEndReason instanceof ConversationEndReason.Hangup) {
            str3 = "HUNGUP";
        } else if (conversationEndReason instanceof ConversationEndReason.Rejected) {
            if (strValueOf != null) {
                str4 = strValueOf;
            } else if (z && !((wsc) y85Var.B.getValue()).c(wsc.i)) {
                str4 = "no_permission";
            }
            strValueOf = str4;
            str3 = "REJECTED";
        } else if (conversationEndReason instanceof ConversationEndReason.RemovedFromCall) {
            str3 = "KICK_BY_ADMIN";
        } else if (conversationEndReason instanceof ConversationEndReason.Busy) {
            str3 = "BUSY";
        } else if (conversationEndReason instanceof ConversationEndReason.Canceled) {
            str3 = cqk.d(((dz4) y85Var.G1.getValue()).q, ji6.a) ? "SHORT_CANCEL" : "CANCELED";
        } else {
            if (conversationEndReason instanceof ConversationEndReason.Error) {
                ConversationEndReason.Error error = (ConversationEndReason.Error) conversationEndReason;
                Throwable throwable = error.getThrowable();
                ApiInvocationException apiInvocationException = throwable instanceof ApiInvocationException ? (ApiInvocationException) throwable : null;
                if (apiInvocationException != null) {
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(apiInvocationException.getErrorCode());
                    }
                    errorMessage = apiInvocationException.getErrorMessage();
                } else if (strValueOf == null) {
                    strValueOf = error.getThrowable().getMessage();
                }
            } else if (!(conversationEndReason instanceof ConversationEndReason.CallTimeout) && !(conversationEndReason instanceof ConversationEndReason.SignalingTimeout)) {
                str3 = "OTHER";
            } else if (strValueOf == null) {
                strValueOf = "timeout";
            }
            str3 = "ERROR";
        }
        if ((z && str3.equals("REJECTED")) || ((z && str3.equals("BUSY")) || (z && str3.equals("ERROR")))) {
            sa2.d(y85Var.O(), strA, str3, j2, strValueOf, 16);
            return;
        }
        String str5 = strValueOf;
        sa2 sa2VarO = y85Var.O();
        if (z2) {
            la2Var = la2.c;
        } else {
            la2Var = z ? la2.b : la2.a;
        }
        sa2VarO.c = la2Var;
        sa2 sa2VarO2 = y85Var.O();
        phl phlVar2 = y85Var.K().a;
        boolean z3 = phlVar2 != null && ((phlVar2 instanceof m32) ^ true);
        boolean andSet = y85Var.z1.getAndSet(false);
        sa2VarO2.getClass();
        sa2.c(sa2VarO2, "FINISH_CALL", strA, str3, Long.valueOf(j), str5, errorMessage, z3, Boolean.valueOf(andSet), 16);
    }

    @Override // defpackage.x02
    public final jw5 A() {
        return (jw5) this.l.getValue();
    }

    @Override // defpackage.x02
    public final void B(boolean z) {
        Object value;
        Object value2;
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", "answer(): isVideo=" + z + ", earlyStart=" + R() + ", state=" + K().q + ", isIncoming=" + K().h, null);
        }
        if (K().h && !K().g && !((b95) this.y.getValue()).h()) {
            ((ac1) L()).d(true);
        }
        ic8 ic8VarR = R();
        if (ic8VarR.c && ic8VarR.a == 2) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "CallEngineTag", qv1.m("answer(): early accept (isVideo=", ")", z), null);
            }
            ic8 ic8VarR2 = R();
            ic8VarR2.getClass();
            ic8VarR2.b = new fc8(z);
            b0();
            mjg mjgVar = this.F1;
            do {
                value2 = mjgVar.getValue();
            } while (!mjgVar.h(value2, dz4.a(K(), null, 0L, null, null, false, true, false, false, null, false, false, false, null, false, null, 262079)));
            this.e.m(this.a);
            N().g(this.a);
            V().e();
            return;
        }
        b0();
        Conversation conversationQ = Q();
        if (conversationQ == null || !conversationQ.isPrepared()) {
            return;
        }
        conversationQ.init();
        conversationQ.connect();
        mjg mjgVar2 = this.F1;
        do {
            value = mjgVar2.getValue();
        } while (!mjgVar2.h(value, dz4.a(K(), null, 0L, null, null, false, true, false, false, null, false, false, false, null, false, null, 262079)));
        this.e.m(this.a);
        N().g(this.a);
        if (((b95) this.y.getValue()).h()) {
            return;
        }
        P().d(z);
    }

    @Override // defpackage.x02
    public final boolean C() {
        if (K().l) {
            return false;
        }
        pi6 pi6Var = K().q;
        return ((pi6Var instanceof ii6) || (pi6Var instanceof hi6) || (pi6Var instanceof ki6)) ? false : true;
    }

    @Override // defpackage.x02
    public final ms4 D() {
        return (ms4) this.h.getValue();
    }

    public final void G(String str) {
        Object value;
        je9 je9Var = je9.d;
        if (this.s1.get() != null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallEngineTag", c0a.o("opponentRegistrationWait: ", str, " ignored, hangup already requested"), null);
                return;
            }
            return;
        }
        boolean z = ((vo8) this.r1.m(this, O1[0])) != null;
        boolean z2 = K().m;
        mjg mjgVar = this.F1;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, dz4.a(K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, null, 253951)));
        if (z2) {
            eqe eqeVarV = V();
            eqeVarV.e = 4;
            sw1 sw1VarA = eqeVarV.a();
            sw1VarA.b(sw1VarA.g.d, true, 0);
            O().e = 3;
        }
        if (z || z2) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "CallEngineTag", "opponentRegistrationWait: " + str + ", cancel timer (active=" + z + ")", null);
            }
            d0(null);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r15v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final void H(defpackage.ff1 r40) {
        /*
            Method dump skipped, instruction units count: 1264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y85.H(ff1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Throwable, lq4] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void I(ff1 ff1Var, int i) throws IllegalAccessException, InvocationTargetException {
        boolean z;
        String str;
        ?? r11;
        int i2;
        String str2;
        y85 y85Var = this;
        ff1 ff1Var2 = ff1Var;
        je9 je9Var = je9.d;
        boolean z2 = ff1Var2.b instanceof m32;
        boolean z3 = !z2;
        boolean z4 = y85Var.R().c;
        mjg mjgVar = y85Var.F1;
        String str3 = "CallEngineTag";
        Object obj = null;
        boolean z5 = false;
        boolean z6 = true;
        if (z4) {
            while (true) {
                Object value = mjgVar.getValue();
                dz4 dz4VarK = y85Var.K();
                mjg mjgVar2 = mjgVar;
                phl phlVar = ff1Var2.b;
                String conversationId = ff1Var2.a.b().getConversationId();
                ifh ifhVar = ns4.b;
                str2 = str3;
                z = z2;
                if (mjgVar2.h(value, dz4.a(dz4VarK, phlVar, 0L, conversationId, ff1Var2.a.b().getJoinLink(), false, false, ff1Var2.d, z3, null, false, false, false, null, false, null, 261746))) {
                    break;
                }
                y85Var = this;
                str3 = str2;
                mjgVar = mjgVar2;
                z2 = z;
                z5 = false;
                z6 = true;
                obj = null;
                ff1Var2 = ff1Var;
            }
            if (Build.VERSION.SDK_INT < 31) {
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, "startIncomingCall ringtone but without telecom", null);
                }
                f0();
            }
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "doBeforeCallPrepared (early): stateAfter=" + K().q + ", isAcceptedAfter=" + K().g + ", isIncomingAfter=" + K().h, null);
            }
            str = str2;
        } else {
            z = z2;
            String str4 = "CallEngineTag";
            while (true) {
                Object value2 = mjgVar.getValue();
                phl phlVar2 = ff1Var.b;
                String conversationId2 = ff1Var.a.b().getConversationId();
                if (conversationId2.length() <= 0) {
                    conversationId2 = null;
                }
                ifh ifhVar2 = ns4.b;
                if (conversationId2 == null) {
                    conversationId2 = oc9.b0();
                }
                String str5 = conversationId2;
                pi6 pi6Var = i > 0 ? ji6.a : li6.a;
                String joinLink = ff1Var.a.b().getJoinLink();
                boolean z7 = ff1Var.d;
                boolean z8 = z3;
                str = str4;
                z3 = z8;
                if (mjgVar.h(value2, new dz4(phlVar2, str5, joinLink, z8, z7, z8, ff1Var.e && z7, ff1Var.f, ff1Var.g, pi6Var, 15922))) {
                    break;
                } else {
                    str4 = str;
                }
            }
            e0();
        }
        D().a.getAndSet(ff1Var.a.b());
        phl phlVar3 = ff1Var.b;
        if (phlVar3 instanceof k32) {
            r11 = 0;
            i2 = 1;
            M().h(((k32) phlVar3).a, true, null);
        } else {
            r11 = 0;
            r11 = 0;
            r11 = 0;
            i2 = 1;
            if (phlVar3 instanceof m32) {
                pe1 pe1VarM = M();
                long j = ((m32) phlVar3).a;
                sgg sggVar = pe1VarM.s;
                if (sggVar == null || !sggVar.isActive()) {
                    gm0.n("CallChatRepositoryTag", "start loading call chat in p2p");
                    pe1VarM.s = yab.i0(pe1VarM.a, ((n0c) ((xhh) pe1VarM.e.getValue())).a(), 0, new vq(pe1VarM, j, (lq4) null, 5), 2);
                } else {
                    gm0.n("CallChatRepositoryTag", "load call chat in p2p in progress");
                }
            } else {
                if (!(phlVar3 instanceof l32)) {
                    ore.o();
                    return;
                }
                M().i(((l32) phlVar3).a);
            }
        }
        T().e();
        ya1 ya1Var = (ya1) ((da1) this.E.getValue());
        ra1 ra1Var = new ra1(0, new ua1(new q8e(((ij4) ya1Var.d.getValue()).c), 0));
        ghb ghbVar = ew5.b;
        ya1Var.o = e9i.j0(e9i.T(new fz6(new ie(tre.N(ra1Var, qe7.O(300, lw5.MILLISECONDS), new wf0(i2)), ya1Var, 3), new jhc(ya1Var, r11, 12), 3), ((n0c) ((xhh) ya1Var.f.getValue())).a()), ya1Var.a);
        AtomicBoolean atomicBoolean = ya1Var.n;
        ParticipantStatesManager participantStatesManagerH = ya1Var.h();
        atomicBoolean.set(participantStatesManagerH != null ? participantStatesManagerH.isOwnHandRaised() : false);
        ParticipantStatesManager participantStatesManagerH2 = ya1Var.h();
        if (participantStatesManagerH2 != null) {
            participantStatesManagerH2.addHandListener((ParticipantStatesManager.Listener) ya1Var.g.getValue());
        }
        MediaMuteManager mediaMuteManagerG = ya1Var.g();
        if (mediaMuteManagerG != null) {
            mediaMuteManagerG.addListener((va1) ya1Var.q.getValue());
        }
        ConversationFeatureManager conversationFeatureManagerI = ya1Var.i();
        if (conversationFeatureManagerI != null) {
            conversationFeatureManagerI.addFeatureListener(oi1.b, (wa1) ya1Var.r.getValue());
        }
        Conversation conversationQ = Q();
        if (conversationQ != null) {
            if (conversationQ.isCaller() || !z) {
                zb1 zb1VarL = L();
                CallsAudioManager.State state = CallsAudioManager.State.DIALING;
                rb0 rb0Var = (rb0) ((ac1) zb1VarL).h.get();
                if (rb0Var != null) {
                    rb0Var.a(state);
                }
            }
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != 0 && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str, this + " conversation is ready " + conversationQ.getConversationId(), r11);
            }
        }
        long j2 = !z ? 32L : 16L;
        ((zid) this.Y.getValue()).d(j2);
        this.w1 = new tid(j2);
    }

    /* JADX WARN: Code duplicated, block: B:286:0x0511  */
    /* JADX WARN: Code duplicated, block: B:436:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:440:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:444:0x0756  */
    /* JADX WARN: Code duplicated, block: B:446:0x075d  */
    /* JADX WARN: Code duplicated, block: B:448:0x0761  */
    /* JADX WARN: Code duplicated, block: B:451:0x0781 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:455:0x078a  */
    /* JADX WARN: Code duplicated, block: B:456:0x078d  */
    /* JADX WARN: Code duplicated, block: B:458:0x0795 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:459:0x0797  */
    /* JADX WARN: Code duplicated, block: B:460:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:464:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:467:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:470:0x0807  */
    /* JADX WARN: Code duplicated, block: B:471:0x080c  */
    /* JADX WARN: Code duplicated, block: B:475:0x0818  */
    /* JADX WARN: Code duplicated, block: B:478:0x0820  */
    /* JADX WARN: Code duplicated, block: B:479:0x0825  */
    /* JADX WARN: Code duplicated, block: B:482:0x0834  */
    /* JADX WARN: Code duplicated, block: B:485:0x084a  */
    /* JADX WARN: Code duplicated, block: B:486:0x0857  */
    /* JADX WARN: Code duplicated, block: B:490:0x086d A[Catch: IOException -> 0x0881, TryCatch #2 {IOException -> 0x0881, blocks: (B:488:0x085d, B:490:0x086d, B:493:0x0883), top: B:520:0x085d }] */
    /* JADX WARN: Code duplicated, block: B:493:0x0883 A[Catch: IOException -> 0x0881, TRY_LEAVE, TryCatch #2 {IOException -> 0x0881, blocks: (B:488:0x085d, B:490:0x086d, B:493:0x0883), top: B:520:0x085d }] */
    /* JADX WARN: Code duplicated, block: B:496:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:505:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:506:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:508:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:511:0x0911  */
    /* JADX WARN: Code duplicated, block: B:520:0x085d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x08a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0184  */
    /* JADX WARN: Instruction removed from duplicated block: B:508:0x08e0, please report this as an issue */
    public final void J(boolean z, Long l, sv1 sv1Var) {
        je9 je9Var;
        boolean z2;
        MicrophoneManager microphoneManagerB;
        int i;
        boolean z3;
        rb0 rb0Var;
        l82 l82Var;
        a4c a4cVar;
        je9 je9Var2;
        String simpleName;
        CameraManager cameraManagerA;
        boolean z4;
        eqe eqeVarV;
        boolean z5;
        sw1 sw1VarA;
        String strValueOf;
        String str;
        dqe dqeVarG;
        String name;
        a4c a4cVar2;
        ldg ldgVarA;
        Uri actualDefaultRingtoneUri;
        a4c a4cVar3;
        boolean z6;
        String string;
        boolean zO;
        iu1 iu1Var;
        TelecomManager telecomManager;
        String str2;
        String str3;
        String strK;
        String string2;
        int length;
        int length2;
        boolean z7;
        boolean zO2;
        TelecomManager telecomManager2;
        String strK2;
        String string3;
        int length3;
        int length4;
        y85 y85Var = this;
        je9 je9Var3 = je9.d;
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var3)) {
            a4cVar4.c(je9Var3, "CallEngineTag", y85Var + " doBeforeCreateConversation push=" + sv1Var + " isIncoming=" + z, null);
        }
        String str4 = y85Var.a;
        if (Build.VERSION.SDK_INT >= 31) {
            b5d b5dVar = y85Var.U().d6;
            zv8[] zv8VarArr = e5d.S6;
            if (!((Boolean) b5dVar.a(zv8VarArr[369]).i()).booleanValue()) {
                y85Var.N().o();
            }
            p85 p85Var = new p85(y85Var);
            String strK3 = "[]";
            if (z) {
                ue1 ue1VarN = y85Var.N();
                je9Var = je9Var3;
                TelecomManager telecomManagerQ = ue1VarN.q();
                if (telecomManagerQ != null) {
                    ue1VarN.h.put(new z02(str4), p85Var);
                    if (ue1VarN.c()) {
                        zO2 = ue1VarN.b().b(((Boolean) ue1VarN.s.getValue()).booleanValue(), ue1VarN.b, str4);
                    } else {
                        zO2 = !ue1VarN.k ? ue1VarN.o() : true;
                    }
                    if (zO2) {
                        PhoneAccountHandle phoneAccountHandleA = ue1VarN.c() ? ue1VarN.b().a(ue1VarN.b, ((Boolean) ue1VarN.s.getValue()).booleanValue()) : ue1VarN.d();
                        boolean z8 = ue1VarN.e().g;
                        ku1 ku1Var = (ku1) ue1VarN.d.getValue();
                        be1 be1Var = (be1) ((x02) ((b95) ku1Var.b.getValue()).i.a.getValue()).b().getValue();
                        PhoneAccountHandle phoneAccountHandle = phoneAccountHandleA;
                        Uri uriA = ku1Var.a(be1Var.i);
                        CharSequence charSequence = be1Var.d;
                        iu1 iu1Var2 = new iu1(uriA, charSequence != null ? charSequence.toString() : null);
                        if (!z8) {
                            if (uriA == null) {
                                uriA = null;
                            }
                            iu1Var2 = new iu1(uriA, null);
                        }
                        Bundle bundle = new Bundle();
                        Uri uri = iu1Var2.a;
                        if (uri != null) {
                            bundle.putParcelable("android.telecom.extra.INCOMING_CALL_ADDRESS", uri);
                        }
                        String str5 = iu1Var2.b;
                        if (str5 != null) {
                            bundle.putString("extra.DISPLAY_NAME", str5);
                        }
                        bundle.putString("one.me.calls.telecom.EXTRA_SESSION_ID", str4);
                        a4c a4cVar5 = gm0.f;
                        if (a4cVar5 != null) {
                            je9 je9Var4 = je9.d;
                            if (a4cVar5.b(je9Var4)) {
                                boolean z9 = ue1VarN.e().g;
                                Object obj = iu1Var2.a;
                                if (obj == null) {
                                    strK2 = null;
                                } else if (gm0.c()) {
                                    strK2 = obj.toString();
                                } else if (obj instanceof Collection) {
                                    Collection collection = (Collection) obj;
                                    if (collection.isEmpty()) {
                                        strK2 = "[]";
                                    } else {
                                        length4 = collection.size();
                                        strK2 = c0a.k(length4, "[**", "**]");
                                    }
                                } else if (obj instanceof Map) {
                                    Map map = (Map) obj;
                                    strK2 = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
                                } else if (obj instanceof Object[]) {
                                    Object[] objArr = (Object[]) obj;
                                    if (objArr.length == 0) {
                                        strK2 = "[]";
                                    } else {
                                        length4 = objArr.length;
                                        strK2 = c0a.k(length4, "[**", "**]");
                                    }
                                } else if (obj instanceof int[]) {
                                    int[] iArr = (int[]) obj;
                                    if (iArr.length == 0) {
                                        strK2 = "[]";
                                    } else {
                                        length4 = iArr.length;
                                        strK2 = c0a.k(length4, "[**", "**]");
                                    }
                                } else if (obj instanceof float[]) {
                                    float[] fArr = (float[]) obj;
                                    if (fArr.length == 0) {
                                        strK2 = "[]";
                                    } else {
                                        length4 = fArr.length;
                                        strK2 = c0a.k(length4, "[**", "**]");
                                    }
                                } else if (obj instanceof long[]) {
                                    long[] jArr = (long[]) obj;
                                    if (jArr.length == 0) {
                                        strK2 = "[]";
                                    } else {
                                        length4 = jArr.length;
                                        strK2 = c0a.k(length4, "[**", "**]");
                                    }
                                } else if (obj instanceof double[]) {
                                    double[] dArr = (double[]) obj;
                                    if (dArr.length == 0) {
                                        strK2 = "[]";
                                    } else {
                                        length4 = dArr.length;
                                        strK2 = c0a.k(length4, "[**", "**]");
                                    }
                                } else if (obj instanceof short[]) {
                                    short[] sArr = (short[]) obj;
                                    if (sArr.length == 0) {
                                        strK2 = "[]";
                                    } else {
                                        length4 = sArr.length;
                                        strK2 = c0a.k(length4, "[**", "**]");
                                    }
                                } else if (obj instanceof byte[]) {
                                    byte[] bArr = (byte[]) obj;
                                    if (bArr.length == 0) {
                                        strK2 = "[]";
                                    } else {
                                        length4 = bArr.length;
                                        strK2 = c0a.k(length4, "[**", "**]");
                                    }
                                } else if (obj instanceof char[]) {
                                    char[] cArr = (char[]) obj;
                                    if (cArr.length == 0) {
                                        strK2 = "[]";
                                    } else {
                                        length4 = cArr.length;
                                        strK2 = c0a.k(length4, "[**", "**]");
                                    }
                                } else if (obj instanceof boolean[]) {
                                    boolean[] zArr = (boolean[]) obj;
                                    if (zArr.length == 0) {
                                        strK2 = "[]";
                                    } else {
                                        length4 = zArr.length;
                                        strK2 = c0a.k(length4, "[**", "**]");
                                    }
                                } else {
                                    strK2 = "***";
                                }
                                Object obj2 = iu1Var2.b;
                                if (obj2 == null) {
                                    string3 = null;
                                } else if (gm0.c()) {
                                    string3 = obj2.toString();
                                } else {
                                    if (obj2 instanceof Collection) {
                                        Collection collection2 = (Collection) obj2;
                                        if (!collection2.isEmpty()) {
                                            length3 = collection2.size();
                                            strK3 = c0a.k(length3, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof Map) {
                                        Map map2 = (Map) obj2;
                                        strK3 = map2.isEmpty() ? "{}" : c0a.k(map2.size(), "{**", "**}");
                                    } else if (obj2 instanceof Object[]) {
                                        Object[] objArr2 = (Object[]) obj2;
                                        if (objArr2.length != 0) {
                                            length3 = objArr2.length;
                                            strK3 = c0a.k(length3, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof int[]) {
                                        int[] iArr2 = (int[]) obj2;
                                        if (iArr2.length != 0) {
                                            length3 = iArr2.length;
                                            strK3 = c0a.k(length3, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof float[]) {
                                        float[] fArr2 = (float[]) obj2;
                                        if (fArr2.length != 0) {
                                            length3 = fArr2.length;
                                            strK3 = c0a.k(length3, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof long[]) {
                                        long[] jArr2 = (long[]) obj2;
                                        if (jArr2.length != 0) {
                                            length3 = jArr2.length;
                                            strK3 = c0a.k(length3, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof double[]) {
                                        double[] dArr2 = (double[]) obj2;
                                        if (dArr2.length != 0) {
                                            length3 = dArr2.length;
                                            strK3 = c0a.k(length3, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof short[]) {
                                        short[] sArr2 = (short[]) obj2;
                                        if (sArr2.length != 0) {
                                            length3 = sArr2.length;
                                            strK3 = c0a.k(length3, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof byte[]) {
                                        byte[] bArr2 = (byte[]) obj2;
                                        if (bArr2.length != 0) {
                                            length3 = bArr2.length;
                                            strK3 = c0a.k(length3, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof char[]) {
                                        char[] cArr2 = (char[]) obj2;
                                        if (cArr2.length != 0) {
                                            length3 = cArr2.length;
                                            strK3 = c0a.k(length3, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof boolean[]) {
                                        boolean[] zArr2 = (boolean[]) obj2;
                                        if (zArr2.length != 0) {
                                            length3 = zArr2.length;
                                            strK3 = c0a.k(length3, "[**", "**]");
                                        }
                                    } else {
                                        strK3 = "***";
                                    }
                                    string3 = strK3;
                                }
                                a4cVar5.c(je9Var4, "CallConnectionController", "addIncomingCall: showingParticipantName=" + z9 + ", phone=" + strK2 + ", name=" + string3, null);
                            }
                        }
                        try {
                            try {
                                ue1VarN.j.remove(new z02(str4));
                                telecomManager2 = telecomManagerQ;
                                try {
                                    telecomManager2.addNewIncomingCall(phoneAccountHandle, bundle);
                                    gm0.n("CallConnectionController", "addNewIncomingCall success");
                                } catch (SecurityException unused) {
                                    if (ue1VarN.c()) {
                                        gm0.Y("CallConnectionController", "failed to add incoming call");
                                        pw1 pw1VarB = ue1VarN.b();
                                        ha9 ha9Var = ue1VarN.b;
                                        wme wmeVar = ue1VarN.s;
                                        pw1VarB.c(ha9Var, pw1VarB.a(ha9Var, ((Boolean) wmeVar.getValue()).booleanValue()));
                                        ue1VarN.b().b(((Boolean) wmeVar.getValue()).booleanValue(), ha9Var, str4);
                                        try {
                                            telecomManager2.addNewIncomingCall(ue1VarN.b().a(ha9Var, ((Boolean) wmeVar.getValue()).booleanValue()), bundle);
                                        } catch (SecurityException e) {
                                            se1 se1Var = new se1("resetRegistrationAndStartIncomingCall failed", e);
                                            gm0.V("CallConnectionController", se1Var.getMessage(), se1Var);
                                            z7 = false;
                                        }
                                    }
                                    z7 = false;
                                    y85Var = this;
                                    ((m02) y85Var.w.getValue()).b(z7);
                                    if (z7) {
                                        ((m02) y85Var.w.getValue()).c((Application) y85Var.f.getValue(), (k42) y85Var.x.getValue());
                                    } else {
                                        ((m02) y85Var.w.getValue()).c((Application) y85Var.f.getValue(), (k42) y85Var.x.getValue());
                                    }
                                    z2 = false;
                                    ac1 ac1Var = (ac1) y85Var.L();
                                    c51 c51Var = ac1Var.j;
                                    microphoneManagerB = ac1Var.b();
                                    if (microphoneManagerB != null) {
                                        i = 1;
                                        if (microphoneManagerB.isMicEnabled()) {
                                            z3 = true;
                                        }
                                        c51Var.a(Boolean.valueOf(z3));
                                        rb0Var = (rb0) ac1Var.h.updateAndGet(new ea1(i, ac1Var));
                                        l82Var = (l82) ac1Var.i.get();
                                        if (l82Var != null) {
                                            rb0Var.c(l82Var);
                                        }
                                        a4cVar = gm0.f;
                                        if (a4cVar == null) {
                                            je9Var2 = je9Var;
                                        } else {
                                            je9Var2 = je9Var;
                                            if (a4cVar.b(je9Var2)) {
                                                if (rb0Var != null) {
                                                    simpleName = rb0Var.getClass().getSimpleName();
                                                } else {
                                                    simpleName = null;
                                                }
                                                a4cVar.c(je9Var2, "CallAudioController", qv1.k("CallAudioController prepared: delegate=", simpleName), null);
                                            }
                                        }
                                        rd1 rd1VarP = y85Var.P();
                                        c51 c51Var2 = rd1VarP.b;
                                        cameraManagerA = rd1VarP.a();
                                        if (cameraManagerA == null) {
                                            z4 = z2;
                                        } else {
                                            z4 = z2;
                                        }
                                        c51Var2.a(Boolean.valueOf(z4));
                                        eqeVarV = y85Var.V();
                                        z5 = ((nni) eqeVarV.a.getValue()).d.getBoolean("app.calls.incoming.vibration", true);
                                        sw1VarA = eqeVarV.a();
                                        strValueOf = String.valueOf(((xb9) eqeVarV.b.getValue()).t());
                                        str = (String) ((xb9) eqeVarV.b.getValue()).T().get(strValueOf);
                                        if (str != null) {
                                            dqeVarG = zpe.t(str);
                                        } else {
                                            dqeVarG = null;
                                        }
                                        name = eqe.class.getName();
                                        a4cVar2 = gm0.f;
                                        if (a4cVar2 != null) {
                                            if (dqeVarG != null) {
                                                string = dqeVarG.toString();
                                            } else {
                                                string = null;
                                            }
                                            a4cVar2.c(je9Var2, name, qv1.l("localPrefsRingtone: ", string, " current user id: ", strValueOf), null);
                                        }
                                        if (dqeVarG == null) {
                                            dqeVarG = ((nni) eqeVarV.a.getValue()).g();
                                        }
                                        if (dqeVarG.equals(bqe.a)) {
                                            ifh ifhVar = ldg.l;
                                            ldgVarA = ldg.a(xql.b(), null, z5, 1535);
                                        } else if (dqeVarG instanceof aqe) {
                                            try {
                                                if (new File(((aqe) dqeVarG).a).exists()) {
                                                    ifh ifhVar2 = ldg.l;
                                                    ldgVarA = ldg.a(xql.b(), new idg(((aqe) dqeVarG).a), z5, 1531);
                                                } else {
                                                    ifh ifhVar3 = ldg.l;
                                                    ldgVarA = ldg.a(xql.b(), null, z5, 1535);
                                                }
                                            } catch (IOException e2) {
                                                gm0.V(eqe.class.getName(), "ringtone file not found, using default ringtone", e2);
                                                ifh ifhVar4 = ldg.l;
                                                ldgVarA = ldg.a(xql.b(), null, z5, 1535);
                                            }
                                        } else {
                                            if (dqeVarG instanceof cqe) {
                                                ore.o();
                                                return;
                                            }
                                            try {
                                                actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri((Context) eqeVarV.c.getValue(), 1);
                                            } catch (Exception e3) {
                                                gm0.V(eqe.class.getName(), "RingtoneManager::getActualDefaultRingtoneUri thrown exception", e3);
                                                actualDefaultRingtoneUri = Settings.System.DEFAULT_RINGTONE_URI;
                                            }
                                            ifh ifhVar5 = ldg.l;
                                            ldgVarA = ldg.a(xql.b(), new jdg(actualDefaultRingtoneUri), z5, 1531);
                                        }
                                        a4cVar3 = gm0.f;
                                        if (a4cVar3 == null) {
                                            z6 = false;
                                        } else {
                                            sw1VarA.getClass();
                                            if (a4cVar3.b(je9Var2)) {
                                                z6 = false;
                                                a4cVar3.c(je9Var2, "RingtoneManagerTag", "attach ringtone config: " + ldgVarA, null);
                                            } else {
                                                z6 = false;
                                            }
                                        }
                                        sw1VarA.g = ldgVarA;
                                        ra8 ra8Var = (ra8) y85Var.J1.getValue();
                                        ra8Var.d.set(z6);
                                        ((rnf) ((onf) ra8Var.b.getValue())).c(ra8Var);
                                    }
                                    i = 1;
                                    z3 = z2;
                                    c51Var.a(Boolean.valueOf(z3));
                                    rb0Var = (rb0) ac1Var.h.updateAndGet(new ea1(i, ac1Var));
                                    l82Var = (l82) ac1Var.i.get();
                                    if (l82Var != null) {
                                        rb0Var.c(l82Var);
                                    }
                                    a4cVar = gm0.f;
                                    if (a4cVar == null) {
                                        je9Var2 = je9Var;
                                    } else {
                                        je9Var2 = je9Var;
                                        if (a4cVar.b(je9Var2)) {
                                            if (rb0Var != null) {
                                                simpleName = rb0Var.getClass().getSimpleName();
                                            } else {
                                                simpleName = null;
                                            }
                                            a4cVar.c(je9Var2, "CallAudioController", qv1.k("CallAudioController prepared: delegate=", simpleName), null);
                                        }
                                    }
                                    rd1 rd1VarP2 = y85Var.P();
                                    c51 c51Var3 = rd1VarP2.b;
                                    cameraManagerA = rd1VarP2.a();
                                    if (cameraManagerA == null) {
                                        z4 = z2;
                                    } else {
                                        z4 = z2;
                                    }
                                    c51Var3.a(Boolean.valueOf(z4));
                                    eqeVarV = y85Var.V();
                                    z5 = ((nni) eqeVarV.a.getValue()).d.getBoolean("app.calls.incoming.vibration", true);
                                    sw1VarA = eqeVarV.a();
                                    strValueOf = String.valueOf(((xb9) eqeVarV.b.getValue()).t());
                                    str = (String) ((xb9) eqeVarV.b.getValue()).T().get(strValueOf);
                                    if (str != null) {
                                        dqeVarG = zpe.t(str);
                                    } else {
                                        dqeVarG = null;
                                    }
                                    name = eqe.class.getName();
                                    a4cVar2 = gm0.f;
                                    if (a4cVar2 != null) {
                                        if (dqeVarG != null) {
                                            string = dqeVarG.toString();
                                        } else {
                                            string = null;
                                        }
                                        a4cVar2.c(je9Var2, name, qv1.l("localPrefsRingtone: ", string, " current user id: ", strValueOf), null);
                                    }
                                    if (dqeVarG == null) {
                                        dqeVarG = ((nni) eqeVarV.a.getValue()).g();
                                    }
                                    if (dqeVarG.equals(bqe.a)) {
                                        ifh ifhVar6 = ldg.l;
                                        ldgVarA = ldg.a(xql.b(), null, z5, 1535);
                                    } else if (dqeVarG instanceof aqe) {
                                        if (new File(((aqe) dqeVarG).a).exists()) {
                                            ifh ifhVar7 = ldg.l;
                                            ldgVarA = ldg.a(xql.b(), new idg(((aqe) dqeVarG).a), z5, 1531);
                                        } else {
                                            ifh ifhVar8 = ldg.l;
                                            ldgVarA = ldg.a(xql.b(), null, z5, 1535);
                                        }
                                    } else if (dqeVarG instanceof cqe) {
                                        ore.o();
                                        return;
                                    } else {
                                        actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri((Context) eqeVarV.c.getValue(), 1);
                                        ifh ifhVar9 = ldg.l;
                                        ldgVarA = ldg.a(xql.b(), new jdg(actualDefaultRingtoneUri), z5, 1531);
                                    }
                                    a4cVar3 = gm0.f;
                                    if (a4cVar3 == null) {
                                        z6 = false;
                                    } else {
                                        sw1VarA.getClass();
                                        if (a4cVar3.b(je9Var2)) {
                                            z6 = false;
                                            a4cVar3.c(je9Var2, "RingtoneManagerTag", "attach ringtone config: " + ldgVarA, null);
                                        } else {
                                            z6 = false;
                                        }
                                    }
                                    sw1VarA.g = ldgVarA;
                                    ra8 ra8Var2 = (ra8) y85Var.J1.getValue();
                                    ra8Var2.d.set(z6);
                                    ((rnf) ((onf) ra8Var2.b.getValue())).c(ra8Var2);
                                }
                            } catch (SecurityException unused2) {
                                telecomManager2 = telecomManagerQ;
                            }
                            z7 = true;
                        } catch (Throwable th) {
                            se1 se1Var2 = new se1("addNewIncomingCall failed", th);
                            gm0.V("CallConnectionController", se1Var2.getMessage(), se1Var2);
                            z7 = false;
                        }
                    }
                }
                z7 = false;
            } else {
                je9Var = je9Var3;
                Uri uri2 = Uri.parse((String) U().M0.a(zv8VarArr[89]).i());
                ue1 ue1VarN2 = N();
                je9 je9Var5 = je9.d;
                TelecomManager telecomManagerQ2 = ue1VarN2.q();
                if (telecomManagerQ2 != null) {
                    ue1VarN2.h.put(new z02(str4), p85Var);
                    if (ue1VarN2.c()) {
                        zO = ue1VarN2.b().b(((Boolean) ue1VarN2.s.getValue()).booleanValue(), ue1VarN2.b, str4);
                    } else {
                        zO = !ue1VarN2.k ? ue1VarN2.o() : true;
                    }
                    if (zO) {
                        PhoneAccountHandle phoneAccountHandleA2 = ue1VarN2.c() ? ue1VarN2.b().a(ue1VarN2.b, ((Boolean) ue1VarN2.s.getValue()).booleanValue()) : ue1VarN2.d();
                        boolean z10 = ue1VarN2.e().g;
                        a4c a4cVar6 = gm0.f;
                        if (a4cVar6 != null && a4cVar6.b(je9Var5)) {
                            a4cVar6.c(je9Var5, "CallConnectionController", "getCalleeInfo, showCalleeName=" + z10 + ", calleeId=" + l, null);
                        }
                        if (!z10 || l == null) {
                            iu1Var = new iu1(uri2, null);
                        } else {
                            ku1 ku1Var2 = (ku1) ue1VarN2.d.getValue();
                            vg4 vg4Var = (vg4) ((no4) ku1Var2.c.getValue()).j(l.longValue()).a.getValue();
                            iu1Var = new iu1(ku1Var2.a(vg4Var != null ? Long.valueOf(vg4Var.w()) : null), vg4Var != null ? vg4Var.k() : null);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", phoneAccountHandleA2);
                        Uri uri3 = iu1Var.a;
                        if (uri3 != null) {
                            bundle2.putParcelable("android.telecom.extra.INCOMING_CALL_ADDRESS", uri3);
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("one.me.calls.telecom.EXTRA_SESSION_ID", str4);
                        String str6 = iu1Var.b;
                        if (str6 != null) {
                            bundle3.putString("extra.DISPLAY_NAME", str6);
                        }
                        bundle2.putBundle("android.telecom.extra.OUTGOING_CALL_EXTRAS", bundle3);
                        a4c a4cVar7 = gm0.f;
                        if (a4cVar7 != null && a4cVar7.b(je9Var5)) {
                            boolean z11 = ue1VarN2.e().g;
                            Object obj3 = iu1Var.a;
                            if (obj3 != null) {
                                if (gm0.c()) {
                                    strK = obj3.toString();
                                } else if (obj3 instanceof Collection) {
                                    Collection collection3 = (Collection) obj3;
                                    strK = collection3.isEmpty() ? "[]" : c0a.k(collection3.size(), "[**", "**]");
                                } else if (obj3 instanceof Map) {
                                    Map map3 = (Map) obj3;
                                    if (map3.isEmpty()) {
                                        strK = "{}";
                                    } else {
                                        str2 = r0;
                                        str3 = r7;
                                        strK = c0a.k(map3.size(), str2, str3);
                                    }
                                } else {
                                    str2 = r0;
                                    str3 = r7;
                                    if (obj3 instanceof Object[]) {
                                        Object[] objArr3 = (Object[]) obj3;
                                        if (objArr3.length == 0) {
                                            strK = "[]";
                                        } else {
                                            length2 = objArr3.length;
                                            strK = c0a.k(length2, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof int[]) {
                                        int[] iArr3 = (int[]) obj3;
                                        if (iArr3.length == 0) {
                                            strK = "[]";
                                        } else {
                                            length2 = iArr3.length;
                                            strK = c0a.k(length2, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof float[]) {
                                        float[] fArr3 = (float[]) obj3;
                                        if (fArr3.length == 0) {
                                            strK = "[]";
                                        } else {
                                            length2 = fArr3.length;
                                            strK = c0a.k(length2, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof long[]) {
                                        long[] jArr3 = (long[]) obj3;
                                        if (jArr3.length == 0) {
                                            strK = "[]";
                                        } else {
                                            length2 = jArr3.length;
                                            strK = c0a.k(length2, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof double[]) {
                                        double[] dArr3 = (double[]) obj3;
                                        if (dArr3.length == 0) {
                                            strK = "[]";
                                        } else {
                                            length2 = dArr3.length;
                                            strK = c0a.k(length2, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof short[]) {
                                        short[] sArr3 = (short[]) obj3;
                                        if (sArr3.length == 0) {
                                            strK = "[]";
                                        } else {
                                            length2 = sArr3.length;
                                            strK = c0a.k(length2, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof byte[]) {
                                        byte[] bArr3 = (byte[]) obj3;
                                        if (bArr3.length == 0) {
                                            strK = "[]";
                                        } else {
                                            length2 = bArr3.length;
                                            strK = c0a.k(length2, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof char[]) {
                                        char[] cArr3 = (char[]) obj3;
                                        if (cArr3.length == 0) {
                                            strK = "[]";
                                        } else {
                                            length2 = cArr3.length;
                                            strK = c0a.k(length2, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof boolean[]) {
                                        boolean[] zArr3 = (boolean[]) obj3;
                                        if (zArr3.length == 0) {
                                            strK = "[]";
                                        } else {
                                            length2 = zArr3.length;
                                            strK = c0a.k(length2, "[**", "**]");
                                        }
                                    } else {
                                        strK = "***";
                                    }
                                }
                                str2 = "{**";
                                str3 = "**}";
                            } else {
                                str2 = r0;
                                str3 = r7;
                                strK = null;
                            }
                            Object obj4 = iu1Var.b;
                            if (obj4 == null) {
                                string2 = null;
                            } else if (gm0.c()) {
                                string2 = obj4.toString();
                            } else {
                                if (obj4 instanceof Collection) {
                                    Collection collection4 = (Collection) obj4;
                                    if (!collection4.isEmpty()) {
                                        length = collection4.size();
                                        strK3 = c0a.k(length, "[**", "**]");
                                    }
                                } else if (obj4 instanceof Map) {
                                    Map map4 = (Map) obj4;
                                    strK3 = map4.isEmpty() ? "{}" : c0a.k(map4.size(), str2, str3);
                                } else if (obj4 instanceof Object[]) {
                                    Object[] objArr4 = (Object[]) obj4;
                                    if (objArr4.length != 0) {
                                        length = objArr4.length;
                                        strK3 = c0a.k(length, "[**", "**]");
                                    }
                                } else if (obj4 instanceof int[]) {
                                    int[] iArr4 = (int[]) obj4;
                                    if (iArr4.length != 0) {
                                        length = iArr4.length;
                                        strK3 = c0a.k(length, "[**", "**]");
                                    }
                                } else if (obj4 instanceof float[]) {
                                    float[] fArr4 = (float[]) obj4;
                                    if (fArr4.length != 0) {
                                        length = fArr4.length;
                                        strK3 = c0a.k(length, "[**", "**]");
                                    }
                                } else if (obj4 instanceof long[]) {
                                    long[] jArr4 = (long[]) obj4;
                                    if (jArr4.length != 0) {
                                        length = jArr4.length;
                                        strK3 = c0a.k(length, "[**", "**]");
                                    }
                                } else if (obj4 instanceof double[]) {
                                    double[] dArr4 = (double[]) obj4;
                                    if (dArr4.length != 0) {
                                        length = dArr4.length;
                                        strK3 = c0a.k(length, "[**", "**]");
                                    }
                                } else if (obj4 instanceof short[]) {
                                    short[] sArr4 = (short[]) obj4;
                                    if (sArr4.length != 0) {
                                        length = sArr4.length;
                                        strK3 = c0a.k(length, "[**", "**]");
                                    }
                                } else if (obj4 instanceof byte[]) {
                                    byte[] bArr4 = (byte[]) obj4;
                                    if (bArr4.length != 0) {
                                        length = bArr4.length;
                                        strK3 = c0a.k(length, "[**", "**]");
                                    }
                                } else if (obj4 instanceof char[]) {
                                    char[] cArr4 = (char[]) obj4;
                                    if (cArr4.length != 0) {
                                        length = cArr4.length;
                                        strK3 = c0a.k(length, "[**", "**]");
                                    }
                                } else if (obj4 instanceof boolean[]) {
                                    boolean[] zArr4 = (boolean[]) obj4;
                                    if (zArr4.length != 0) {
                                        length = zArr4.length;
                                        strK3 = c0a.k(length, "[**", "**]");
                                    }
                                } else {
                                    strK3 = "***";
                                }
                                string2 = strK3;
                            }
                            a4cVar7.c(je9Var5, "CallConnectionController", "placeOutgoingCall: showingParticipantName=" + z11 + ", phone=" + strK + ", name=" + string2, null);
                        }
                        Uri uri4 = iu1Var.a;
                        if (uri4 != null) {
                            uri2 = uri4;
                        }
                        try {
                            try {
                                ue1VarN2.j.remove(new z02(str4));
                                telecomManager = telecomManagerQ2;
                                try {
                                    telecomManager.placeCall(uri2, bundle2);
                                    gm0.n("CallConnectionController", "placeCall success");
                                } catch (SecurityException unused3) {
                                    if (ue1VarN2.c()) {
                                        gm0.Y("CallConnectionController", "failed to placeOutgoingCall");
                                        pw1 pw1VarB2 = ue1VarN2.b();
                                        ha9 ha9Var2 = ue1VarN2.b;
                                        wme wmeVar2 = ue1VarN2.s;
                                        pw1VarB2.c(ha9Var2, pw1VarB2.a(ha9Var2, ((Boolean) wmeVar2.getValue()).booleanValue()));
                                        ue1VarN2.b().b(((Boolean) wmeVar2.getValue()).booleanValue(), ha9Var2, str4);
                                        try {
                                            telecomManager.placeCall(uri2, bundle2);
                                        } catch (SecurityException e4) {
                                            se1 se1Var3 = new se1("resetRegistrationAndStartIncomingCall failed", e4);
                                            gm0.V("CallConnectionController", se1Var3.getMessage(), se1Var3);
                                            z7 = false;
                                        }
                                    }
                                    z7 = false;
                                    y85Var = this;
                                    ((m02) y85Var.w.getValue()).b(z7);
                                    if (z7) {
                                        ((m02) y85Var.w.getValue()).c((Application) y85Var.f.getValue(), (k42) y85Var.x.getValue());
                                    } else {
                                        ((m02) y85Var.w.getValue()).c((Application) y85Var.f.getValue(), (k42) y85Var.x.getValue());
                                    }
                                    z2 = false;
                                    ac1 ac1Var2 = (ac1) y85Var.L();
                                    c51 c51Var4 = ac1Var2.j;
                                    microphoneManagerB = ac1Var2.b();
                                    if (microphoneManagerB != null) {
                                        i = 1;
                                        if (microphoneManagerB.isMicEnabled()) {
                                            z3 = true;
                                        }
                                        c51Var4.a(Boolean.valueOf(z3));
                                        rb0Var = (rb0) ac1Var2.h.updateAndGet(new ea1(i, ac1Var2));
                                        l82Var = (l82) ac1Var2.i.get();
                                        if (l82Var != null) {
                                            rb0Var.c(l82Var);
                                        }
                                        a4cVar = gm0.f;
                                        if (a4cVar == null) {
                                            je9Var2 = je9Var;
                                        } else {
                                            je9Var2 = je9Var;
                                            if (a4cVar.b(je9Var2)) {
                                                if (rb0Var != null) {
                                                    simpleName = rb0Var.getClass().getSimpleName();
                                                } else {
                                                    simpleName = null;
                                                }
                                                a4cVar.c(je9Var2, "CallAudioController", qv1.k("CallAudioController prepared: delegate=", simpleName), null);
                                            }
                                        }
                                        rd1 rd1VarP3 = y85Var.P();
                                        c51 c51Var5 = rd1VarP3.b;
                                        cameraManagerA = rd1VarP3.a();
                                        if (cameraManagerA == null) {
                                            z4 = z2;
                                        } else {
                                            z4 = z2;
                                        }
                                        c51Var5.a(Boolean.valueOf(z4));
                                        eqeVarV = y85Var.V();
                                        z5 = ((nni) eqeVarV.a.getValue()).d.getBoolean("app.calls.incoming.vibration", true);
                                        sw1VarA = eqeVarV.a();
                                        strValueOf = String.valueOf(((xb9) eqeVarV.b.getValue()).t());
                                        str = (String) ((xb9) eqeVarV.b.getValue()).T().get(strValueOf);
                                        if (str != null) {
                                            dqeVarG = zpe.t(str);
                                        } else {
                                            dqeVarG = null;
                                        }
                                        name = eqe.class.getName();
                                        a4cVar2 = gm0.f;
                                        if (a4cVar2 != null) {
                                            if (dqeVarG != null) {
                                                string = dqeVarG.toString();
                                            } else {
                                                string = null;
                                            }
                                            a4cVar2.c(je9Var2, name, qv1.l("localPrefsRingtone: ", string, " current user id: ", strValueOf), null);
                                        }
                                        if (dqeVarG == null) {
                                            dqeVarG = ((nni) eqeVarV.a.getValue()).g();
                                        }
                                        if (dqeVarG.equals(bqe.a)) {
                                            ifh ifhVar10 = ldg.l;
                                            ldgVarA = ldg.a(xql.b(), null, z5, 1535);
                                        } else if (dqeVarG instanceof aqe) {
                                            if (new File(((aqe) dqeVarG).a).exists()) {
                                                ifh ifhVar11 = ldg.l;
                                                ldgVarA = ldg.a(xql.b(), new idg(((aqe) dqeVarG).a), z5, 1531);
                                            } else {
                                                ifh ifhVar12 = ldg.l;
                                                ldgVarA = ldg.a(xql.b(), null, z5, 1535);
                                            }
                                        } else if (dqeVarG instanceof cqe) {
                                            ore.o();
                                            return;
                                        } else {
                                            actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri((Context) eqeVarV.c.getValue(), 1);
                                            ifh ifhVar13 = ldg.l;
                                            ldgVarA = ldg.a(xql.b(), new jdg(actualDefaultRingtoneUri), z5, 1531);
                                        }
                                        a4cVar3 = gm0.f;
                                        if (a4cVar3 == null) {
                                            z6 = false;
                                        } else {
                                            sw1VarA.getClass();
                                            if (a4cVar3.b(je9Var2)) {
                                                z6 = false;
                                                a4cVar3.c(je9Var2, "RingtoneManagerTag", "attach ringtone config: " + ldgVarA, null);
                                            } else {
                                                z6 = false;
                                            }
                                        }
                                        sw1VarA.g = ldgVarA;
                                        ra8 ra8Var3 = (ra8) y85Var.J1.getValue();
                                        ra8Var3.d.set(z6);
                                        ((rnf) ((onf) ra8Var3.b.getValue())).c(ra8Var3);
                                    }
                                    i = 1;
                                    z3 = z2;
                                    c51Var4.a(Boolean.valueOf(z3));
                                    rb0Var = (rb0) ac1Var2.h.updateAndGet(new ea1(i, ac1Var2));
                                    l82Var = (l82) ac1Var2.i.get();
                                    if (l82Var != null) {
                                        rb0Var.c(l82Var);
                                    }
                                    a4cVar = gm0.f;
                                    if (a4cVar == null) {
                                        je9Var2 = je9Var;
                                    } else {
                                        je9Var2 = je9Var;
                                        if (a4cVar.b(je9Var2)) {
                                            if (rb0Var != null) {
                                                simpleName = rb0Var.getClass().getSimpleName();
                                            } else {
                                                simpleName = null;
                                            }
                                            a4cVar.c(je9Var2, "CallAudioController", qv1.k("CallAudioController prepared: delegate=", simpleName), null);
                                        }
                                    }
                                    rd1 rd1VarP4 = y85Var.P();
                                    c51 c51Var6 = rd1VarP4.b;
                                    cameraManagerA = rd1VarP4.a();
                                    if (cameraManagerA == null) {
                                        z4 = z2;
                                    } else {
                                        z4 = z2;
                                    }
                                    c51Var6.a(Boolean.valueOf(z4));
                                    eqeVarV = y85Var.V();
                                    z5 = ((nni) eqeVarV.a.getValue()).d.getBoolean("app.calls.incoming.vibration", true);
                                    sw1VarA = eqeVarV.a();
                                    strValueOf = String.valueOf(((xb9) eqeVarV.b.getValue()).t());
                                    str = (String) ((xb9) eqeVarV.b.getValue()).T().get(strValueOf);
                                    if (str != null) {
                                        dqeVarG = zpe.t(str);
                                    } else {
                                        dqeVarG = null;
                                    }
                                    name = eqe.class.getName();
                                    a4cVar2 = gm0.f;
                                    if (a4cVar2 != null) {
                                        if (dqeVarG != null) {
                                            string = dqeVarG.toString();
                                        } else {
                                            string = null;
                                        }
                                        a4cVar2.c(je9Var2, name, qv1.l("localPrefsRingtone: ", string, " current user id: ", strValueOf), null);
                                    }
                                    if (dqeVarG == null) {
                                        dqeVarG = ((nni) eqeVarV.a.getValue()).g();
                                    }
                                    if (dqeVarG.equals(bqe.a)) {
                                        ifh ifhVar14 = ldg.l;
                                        ldgVarA = ldg.a(xql.b(), null, z5, 1535);
                                    } else if (dqeVarG instanceof aqe) {
                                        if (new File(((aqe) dqeVarG).a).exists()) {
                                            ifh ifhVar15 = ldg.l;
                                            ldgVarA = ldg.a(xql.b(), new idg(((aqe) dqeVarG).a), z5, 1531);
                                        } else {
                                            ifh ifhVar16 = ldg.l;
                                            ldgVarA = ldg.a(xql.b(), null, z5, 1535);
                                        }
                                    } else if (dqeVarG instanceof cqe) {
                                        ore.o();
                                        return;
                                    } else {
                                        actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri((Context) eqeVarV.c.getValue(), 1);
                                        ifh ifhVar17 = ldg.l;
                                        ldgVarA = ldg.a(xql.b(), new jdg(actualDefaultRingtoneUri), z5, 1531);
                                    }
                                    a4cVar3 = gm0.f;
                                    if (a4cVar3 == null) {
                                        z6 = false;
                                    } else {
                                        sw1VarA.getClass();
                                        if (a4cVar3.b(je9Var2)) {
                                            z6 = false;
                                            a4cVar3.c(je9Var2, "RingtoneManagerTag", "attach ringtone config: " + ldgVarA, null);
                                        } else {
                                            z6 = false;
                                        }
                                    }
                                    sw1VarA.g = ldgVarA;
                                    ra8 ra8Var4 = (ra8) y85Var.J1.getValue();
                                    ra8Var4.d.set(z6);
                                    ((rnf) ((onf) ra8Var4.b.getValue())).c(ra8Var4);
                                }
                            } catch (SecurityException unused4) {
                                telecomManager = telecomManagerQ2;
                            }
                            z7 = true;
                        } catch (Throwable th2) {
                            se1 se1Var4 = new se1("placeCall failed", th2);
                            gm0.V("CallConnectionController", se1Var4.getMessage(), se1Var4);
                            z7 = false;
                        }
                    }
                }
                z7 = false;
            }
            y85Var = this;
            ((m02) y85Var.w.getValue()).b(z7);
            if (z7 || ((Boolean) y85Var.U().A().i()).booleanValue()) {
                ((m02) y85Var.w.getValue()).c((Application) y85Var.f.getValue(), (k42) y85Var.x.getValue());
            }
            z2 = false;
        } else {
            je9Var = je9Var3;
            gm0.n("CallEngineTag", "startCallService: direct start (Telecom disabled or API < 31)");
            z2 = false;
            ((m02) y85Var.w.getValue()).b(false);
            ((m02) y85Var.w.getValue()).c((Application) y85Var.f.getValue(), (k42) y85Var.x.getValue());
        }
        ac1 ac1Var3 = (ac1) y85Var.L();
        c51 c51Var7 = ac1Var3.j;
        microphoneManagerB = ac1Var3.b();
        if (microphoneManagerB != null) {
            i = 1;
            if (microphoneManagerB.isMicEnabled()) {
                z3 = true;
            }
            c51Var7.a(Boolean.valueOf(z3));
            rb0Var = (rb0) ac1Var3.h.updateAndGet(new ea1(i, ac1Var3));
            l82Var = (l82) ac1Var3.i.get();
            if (l82Var != null && rb0Var != null) {
                rb0Var.c(l82Var);
            }
            a4cVar = gm0.f;
            if (a4cVar == null) {
                je9Var2 = je9Var;
            } else {
                je9Var2 = je9Var;
                if (a4cVar.b(je9Var2)) {
                    if (rb0Var != null) {
                        simpleName = rb0Var.getClass().getSimpleName();
                    } else {
                        simpleName = null;
                    }
                    a4cVar.c(je9Var2, "CallAudioController", qv1.k("CallAudioController prepared: delegate=", simpleName), null);
                }
            }
            rd1 rd1VarP5 = y85Var.P();
            c51 c51Var8 = rd1VarP5.b;
            cameraManagerA = rd1VarP5.a();
            if (cameraManagerA == null && cameraManagerA.isCameraEnabled()) {
                z4 = true;
            } else {
                z4 = z2;
            }
            c51Var8.a(Boolean.valueOf(z4));
            eqeVarV = y85Var.V();
            z5 = ((nni) eqeVarV.a.getValue()).d.getBoolean("app.calls.incoming.vibration", true);
            sw1VarA = eqeVarV.a();
            strValueOf = String.valueOf(((xb9) eqeVarV.b.getValue()).t());
            str = (String) ((xb9) eqeVarV.b.getValue()).T().get(strValueOf);
            if (str != null) {
                dqeVarG = zpe.t(str);
            } else {
                dqeVarG = null;
            }
            name = eqe.class.getName();
            a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                if (dqeVarG != null) {
                    string = dqeVarG.toString();
                } else {
                    string = null;
                }
                a4cVar2.c(je9Var2, name, qv1.l("localPrefsRingtone: ", string, " current user id: ", strValueOf), null);
            }
            if (dqeVarG == null) {
                dqeVarG = ((nni) eqeVarV.a.getValue()).g();
            }
            if (dqeVarG.equals(bqe.a)) {
                ifh ifhVar18 = ldg.l;
                ldgVarA = ldg.a(xql.b(), null, z5, 1535);
            } else if (dqeVarG instanceof aqe) {
                if (new File(((aqe) dqeVarG).a).exists()) {
                    ifh ifhVar19 = ldg.l;
                    ldgVarA = ldg.a(xql.b(), new idg(((aqe) dqeVarG).a), z5, 1531);
                } else {
                    ifh ifhVar110 = ldg.l;
                    ldgVarA = ldg.a(xql.b(), null, z5, 1535);
                }
            } else if (dqeVarG instanceof cqe) {
                ore.o();
                return;
            } else {
                actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri((Context) eqeVarV.c.getValue(), 1);
                ifh ifhVar111 = ldg.l;
                ldgVarA = ldg.a(xql.b(), new jdg(actualDefaultRingtoneUri), z5, 1531);
            }
            a4cVar3 = gm0.f;
            if (a4cVar3 == null) {
                z6 = false;
            } else {
                sw1VarA.getClass();
                if (a4cVar3.b(je9Var2)) {
                    z6 = false;
                    a4cVar3.c(je9Var2, "RingtoneManagerTag", "attach ringtone config: " + ldgVarA, null);
                } else {
                    z6 = false;
                }
            }
            sw1VarA.g = ldgVarA;
            ra8 ra8Var5 = (ra8) y85Var.J1.getValue();
            ra8Var5.d.set(z6);
            ((rnf) ((onf) ra8Var5.b.getValue())).c(ra8Var5);
        }
        i = 1;
        z3 = z2;
        c51Var7.a(Boolean.valueOf(z3));
        rb0Var = (rb0) ac1Var3.h.updateAndGet(new ea1(i, ac1Var3));
        l82Var = (l82) ac1Var3.i.get();
        if (l82Var != null) {
            rb0Var.c(l82Var);
        }
        a4cVar = gm0.f;
        if (a4cVar == null) {
            je9Var2 = je9Var;
        } else {
            je9Var2 = je9Var;
            if (a4cVar.b(je9Var2)) {
                if (rb0Var != null) {
                    simpleName = rb0Var.getClass().getSimpleName();
                } else {
                    simpleName = null;
                }
                a4cVar.c(je9Var2, "CallAudioController", qv1.k("CallAudioController prepared: delegate=", simpleName), null);
            }
        }
        rd1 rd1VarP6 = y85Var.P();
        c51 c51Var9 = rd1VarP6.b;
        cameraManagerA = rd1VarP6.a();
        if (cameraManagerA == null) {
            z4 = z2;
        } else {
            z4 = z2;
        }
        c51Var9.a(Boolean.valueOf(z4));
        eqeVarV = y85Var.V();
        z5 = ((nni) eqeVarV.a.getValue()).d.getBoolean("app.calls.incoming.vibration", true);
        sw1VarA = eqeVarV.a();
        strValueOf = String.valueOf(((xb9) eqeVarV.b.getValue()).t());
        str = (String) ((xb9) eqeVarV.b.getValue()).T().get(strValueOf);
        if (str != null) {
            dqeVarG = zpe.t(str);
        } else {
            dqeVarG = null;
        }
        name = eqe.class.getName();
        a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            if (dqeVarG != null) {
                string = dqeVarG.toString();
            } else {
                string = null;
            }
            a4cVar2.c(je9Var2, name, qv1.l("localPrefsRingtone: ", string, " current user id: ", strValueOf), null);
        }
        if (dqeVarG == null) {
            dqeVarG = ((nni) eqeVarV.a.getValue()).g();
        }
        if (dqeVarG.equals(bqe.a)) {
            ifh ifhVar112 = ldg.l;
            ldgVarA = ldg.a(xql.b(), null, z5, 1535);
        } else if (dqeVarG instanceof aqe) {
            if (new File(((aqe) dqeVarG).a).exists()) {
                ifh ifhVar113 = ldg.l;
                ldgVarA = ldg.a(xql.b(), new idg(((aqe) dqeVarG).a), z5, 1531);
            } else {
                ifh ifhVar114 = ldg.l;
                ldgVarA = ldg.a(xql.b(), null, z5, 1535);
            }
        } else if (dqeVarG instanceof cqe) {
            ore.o();
            return;
        } else {
            actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri((Context) eqeVarV.c.getValue(), 1);
            ifh ifhVar115 = ldg.l;
            ldgVarA = ldg.a(xql.b(), new jdg(actualDefaultRingtoneUri), z5, 1531);
        }
        a4cVar3 = gm0.f;
        if (a4cVar3 == null) {
            z6 = false;
        } else {
            sw1VarA.getClass();
            if (a4cVar3.b(je9Var2)) {
                z6 = false;
                a4cVar3.c(je9Var2, "RingtoneManagerTag", "attach ringtone config: " + ldgVarA, null);
            } else {
                z6 = false;
            }
        }
        sw1VarA.g = ldgVarA;
        ra8 ra8Var6 = (ra8) y85Var.J1.getValue();
        ra8Var6.d.set(z6);
        ((rnf) ((onf) ra8Var6.b.getValue())).c(ra8Var6);
    }

    public final dz4 K() {
        return (dz4) this.F1.getValue();
    }

    public final zb1 L() {
        return (zb1) this.m.getValue();
    }

    public final pe1 M() {
        return (pe1) this.o.getValue();
    }

    public final ue1 N() {
        return (ue1) this.Z.getValue();
    }

    public final sa2 O() {
        return (sa2) this.A.getValue();
    }

    public final rd1 P() {
        return (rd1) this.k.getValue();
    }

    public final Conversation Q() {
        return D().a();
    }

    public final ic8 R() {
        return (ic8) this.D1.getValue();
    }

    public final l92 S() {
        return (l92) this.g.getValue();
    }

    public final dnc T() {
        return (dnc) this.p.getValue();
    }

    public final e5d U() {
        return (e5d) this.n1.getValue();
    }

    public final eqe V() {
        return (eqe) this.q.getValue();
    }

    public final xhh W() {
        return (xhh) this.v.getValue();
    }

    public final void X(Throwable th) {
        String message;
        Object value;
        Throwable callCreateException = th;
        boolean z = callCreateException instanceof ApiInvocationException;
        if (z && (p90.C(((ApiInvocationException) callCreateException).getErrorMessage()) || (callCreateException.getCause() instanceof ConnectionUnavailableException))) {
            gm0.X("CallEngineTag", callCreateException, "can't start call", new Object[0]);
        } else {
            gm0.X("CallEngineTag", new CallCreateException(callCreateException), "can't start call", new Object[0]);
        }
        gi6 gi6VarB = gi6.e;
        if (!z || !(callCreateException.getCause() instanceof ConnectionUnavailableException)) {
            if (z) {
                phl phlVar = K().a;
                if (phlVar != null && (!(phlVar instanceof m32))) {
                    sa2 sa2VarO = O();
                    String strA = ns4.a(K().c);
                    ApiInvocationException apiInvocationException = (ApiInvocationException) callCreateException;
                    int errorCode = apiInvocationException.getErrorCode();
                    String errorMessage = apiInvocationException.getErrorMessage();
                    sa2VarO.getClass();
                    sa2.c(sa2VarO, "GROUP_CALL_JOIN_FAILED", strA, null, null, String.valueOf(errorCode), errorMessage, true, null, 284);
                }
                gi6VarB = qgl.b((ApiInvocationException) callCreateException);
                S().b(gi6VarB != null ? gi6VarB.name() : null);
            } else if ((callCreateException instanceof ExternApiException) && (callCreateException.getCause() instanceof ApiInvocationException)) {
                ApiInvocationException apiInvocationException2 = (ApiInvocationException) callCreateException.getCause();
                phl phlVar2 = K().a;
                if (phlVar2 != null && (!(phlVar2 instanceof m32))) {
                    sa2 sa2VarO2 = O();
                    String strA2 = ns4.a(K().c);
                    int errorCode2 = apiInvocationException2.getErrorCode();
                    String errorMessage2 = apiInvocationException2.getErrorMessage();
                    sa2VarO2.getClass();
                    sa2.c(sa2VarO2, "GROUP_CALL_JOIN_FAILED", strA2, null, null, String.valueOf(errorCode2), errorMessage2, true, null, 284);
                }
                gi6VarB = qgl.b(apiInvocationException2);
                S().b(gi6VarB != null ? gi6VarB.name() : null);
            } else {
                if ((callCreateException instanceof IllegalStateException) && (message = callCreateException.getMessage()) != null && r5h.L0(message, "endpoint is null", false)) {
                    S().b(null);
                } else if (!(callCreateException instanceof UnknownHostException)) {
                    if (callCreateException instanceof ServiceUnavailableException) {
                        gi6VarB = gi6.o;
                    }
                }
                gi6VarB = null;
            }
        }
        gi6 gi6Var = gi6VarB == null ? gi6.d : gi6VarB;
        int i = gi6VarB == null ? -1 : m85.$EnumSwitchMapping$0[gi6VarB.ordinal()];
        int i2 = 2;
        if (i != 1) {
            i2 = i != 2 ? 3 : 1;
        }
        int iD = qt4.D(i2);
        if (iD == 0) {
            V().b();
        } else if (iD == 1) {
            V().c();
        }
        mjg mjgVar = this.F1;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, dz4.a(K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, new hi6(gi6Var), 131071)));
        this.e.n(this.a);
        Long l = (Long) A().a().getValue();
        long jLongValue = l != null ? l.longValue() : 0L;
        a0();
        if (callCreateException instanceof IOException) {
            callCreateException = new CallCreateException(callCreateException);
        }
        ((eo1) this.G.getValue()).z(K().i, false);
        O().e = 8;
        ConversationEndReason.Error error = new ConversationEndReason.Error(callCreateException);
        Throwable cause = callCreateException.getCause();
        c0(this, error, jLongValue, cause != null ? cause.getMessage() : null, null, 8);
        vo8 vo8Var = (vo8) this.t1.m(this, O1[1]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
    }

    public final boolean Y(Collection collection) {
        Conversation conversationA = D().a();
        if (conversationA == null) {
            return false;
        }
        ParticipantId externalId = conversationA.getMe().getExternalId();
        ParticipantId participantIdC = externalId != null ? anc.c(anc.a(externalId)) : null;
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!cqk.d(((ConversationParticipant) it.next()).getExternalId(), participantIdC)) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z(Collection collection) {
        Conversation conversationA = D().a();
        if (conversationA == null) {
            return false;
        }
        ParticipantId externalId = conversationA.getMe().getExternalId();
        ParticipantId participantIdC = externalId != null ? anc.c(anc.a(externalId)) : null;
        Collection<ConversationParticipant> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        for (ConversationParticipant conversationParticipant : collection2) {
            if (!cqk.d(conversationParticipant.getExternalId(), participantIdC) && conversationParticipant.hasRegisteredPeers()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c2  */
    @Override // defpackage.x02
    public final void a(hhg hhgVar) throws JSONException, IllegalAccessException, InvocationTargetException {
        Object poeVar;
        int iIntValue;
        boolean z;
        y85 y85Var;
        ff1 ff1VarF;
        hhg hhgVar2;
        boolean z2;
        ff1 ff1VarC;
        ff1 ff1VarF2;
        kgl kglVar;
        a4c a4cVar;
        O().c = la2.a;
        O().e = 1;
        eo1 eo1Var = (eo1) this.G.getValue();
        eo1Var.getClass();
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        b9bVar.k("incoming_call", Boolean.FALSE);
        eo1Var.g = qrc.x(eo1Var, null, b9bVar, null, null, 13);
        ghg ghgVar = hhgVar.a;
        ehg ehgVar = ghgVar instanceof ehg ? (ehg) ghgVar : null;
        J(false, ehgVar != null ? Long.valueOf(ehgVar.a.a) : null, null);
        c32 c32Var = hhgVar.e;
        try {
            Map map = (Map) U().d1.a(e5d.S6[106]).i();
            if (c32Var != null) {
                Integer num = (Integer) map.get(c32Var.a);
                poeVar = Integer.valueOf(num != null ? num.intValue() : 0);
                Throwable thA = roe.a(poeVar);
                if (thA != null && (a4cVar = gm0.f) != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "CallEngineTag", qv1.k("Error on calculate delay: ", thA.getMessage()), null);
                    }
                }
                if (roe.a(poeVar) != null) {
                    poeVar = 0;
                }
                iIntValue = ((Number) poeVar).intValue();
            } else {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, "CallEngineTag", "calculateDelayByCallStartSource: callStartSource is null", null);
                    }
                }
                iIntValue = 0;
            }
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        boolean z3 = iIntValue > 0;
        wfe wfeVar = new wfe();
        gf1 gf1Var = this.d;
        os1 os1Var = new os1(this, hhgVar, wfeVar, 8);
        n61 n61Var = new n61(1, this, y85.class, "handleCallCreateError", "handleCallCreateError(Ljava/lang/Throwable;)V", 0, 15);
        ghg ghgVar2 = hhgVar.a;
        if (!(ghgVar2 instanceof ehg)) {
            z = z3;
            if (!(ghgVar2 instanceof chg)) {
                if (ghgVar2 instanceof dhg) {
                    dhg dhgVar = (dhg) ghgVar2;
                    y85Var = this;
                    hhgVar2 = hhgVar;
                    ff1VarF2 = gf1Var.f(dhgVar.a, dhgVar.c, hhgVar, dhgVar.b, z, os1Var, n61Var);
                    z = z;
                } else {
                    y85Var = this;
                    if (!(ghgVar2 instanceof fhg)) {
                        ore.o();
                        return;
                    }
                    phl phlVar = ((fhg) ghgVar2).a;
                    if (phlVar instanceof m32) {
                        hhgVar2 = hhgVar;
                        ff1VarF = gf1Var.a((m32) phlVar, hhgVar2, z, os1Var, n61Var);
                    } else if (phlVar instanceof k32) {
                        k32 k32Var = (k32) phlVar;
                        z2 = z;
                        hhgVar2 = hhgVar;
                        ff1VarC = gf1Var.c(k32Var, hhgVar2, k32Var.b, z2, os1Var, n61Var);
                    } else {
                        if (!(phlVar instanceof l32)) {
                            ore.o();
                            return;
                        }
                        l32 l32Var = (l32) phlVar;
                        ff1VarF = gf1Var.f(l32Var.a, l32Var.b, hhgVar, false, z, os1Var, n61Var);
                        hhgVar2 = hhgVar;
                        z = z;
                    }
                }
                y85Var.I(ff1VarF2, iIntValue);
                y85Var.P().d(hhgVar2.b);
                ((ac1) y85Var.L()).d(hhgVar2.c);
                if (z) {
                    y85Var.P().b.g.c(z41.a);
                    kglVar = ff1VarF2.a;
                    if (kglVar instanceof df1) {
                        y85 y85Var2 = y85Var;
                        y85Var2.u1.B(y85Var2, O1[2], yab.i0(y85Var.c, null, 2, new ht1(iIntValue, y85Var2, kglVar, (lq4) null, 9), 1));
                    }
                }
                wfeVar.a = ff1VarF2;
            }
            z2 = z;
            ff1VarC = gf1Var.c(((chg) ghgVar2).a, hhgVar, hhgVar.b, z2, os1Var, n61Var);
            y85Var = this;
            hhgVar2 = hhgVar;
            ff1VarF2 = ff1VarC;
            z = z2;
            y85Var.I(ff1VarF2, iIntValue);
            y85Var.P().d(hhgVar2.b);
            ((ac1) y85Var.L()).d(hhgVar2.c);
            if (z) {
                y85Var.P().b.g.c(z41.a);
                kglVar = ff1VarF2.a;
                if (kglVar instanceof df1) {
                    y85 y85Var3 = y85Var;
                    y85Var3.u1.B(y85Var3, O1[2], yab.i0(y85Var.c, null, 2, new ht1(iIntValue, y85Var3, kglVar, (lq4) null, 9), 1));
                }
            }
            wfeVar.a = ff1VarF2;
        }
        hhgVar2 = hhgVar;
        z = z3;
        ff1VarF = gf1Var.a(((ehg) ghgVar2).a, hhgVar2, z, os1Var, n61Var);
        y85Var = this;
        ff1VarF2 = ff1VarF;
        y85Var.I(ff1VarF2, iIntValue);
        y85Var.P().d(hhgVar2.b);
        ((ac1) y85Var.L()).d(hhgVar2.c);
        if (z) {
            y85Var.P().b.g.c(z41.a);
            kglVar = ff1VarF2.a;
            if (kglVar instanceof df1) {
                y85 y85Var4 = y85Var;
                y85Var4.u1.B(y85Var4, O1[2], yab.i0(y85Var.c, null, 2, new ht1(iIntValue, y85Var4, kglVar, (lq4) null, 9), 1));
            }
        }
        wfeVar.a = ff1VarF2;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x044e  */
    public final void a0() throws IllegalAccessException, InvocationTargetException {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        dz4 dz4VarA;
        Object value5;
        List list;
        List list2;
        ArrayList arrayList;
        Object next;
        a4c a4cVar;
        rb0 rb0Var;
        gm0.n("CallEngineTag", "release call data");
        tid tidVar = this.w1;
        if (tidVar != null) {
            ((zid) this.Y.getValue()).a(tidVar.a);
        }
        this.w1 = null;
        p3c p3cVar = this.u1;
        zv8[] zv8VarArr = O1;
        p3cVar.B(this, zv8VarArr[2], null);
        this.B1.set(false);
        qd1 qd1Var = (qd1) this.j.getValue();
        String strA = ns4.a(K().c);
        if (strA != null) {
            qd1Var.a.remove(strA);
        } else {
            qd1Var.getClass();
        }
        N().p(this.a);
        sgg sggVar = this.q1;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.q1 = null;
        sgg sggVar2 = this.o1;
        if (sggVar2 != null) {
            sggVar2.b(null);
        }
        this.o1 = null;
        d0(null);
        this.s1.set(null);
        this.v1.B(this, zv8VarArr[3], null);
        be1 be1Var = (be1) M().o.getValue();
        ((gue) this.J.getValue()).d(this);
        S().e(this.M1);
        S().e(this.L1);
        S().e((rnc) this.r.getValue());
        S().e((da1) this.E.getValue());
        S().e((to1) this.K.getValue());
        sgg sggVar3 = this.p1;
        if (sggVar3 != null) {
            sggVar3.b(null);
        }
        this.p1 = null;
        this.x1 = false;
        V().e();
        io5 io5Var = (io5) this.n.getValue();
        sgg sggVar4 = io5Var.e;
        if (sggVar4 != null) {
            sggVar4.b(null);
        }
        io5Var.e = null;
        ((d9b) io5Var.d.getValue()).k();
        ((unc) ((rnc) this.r.getValue())).clear();
        A().release();
        pe1 pe1VarM = M();
        pe1VarM.getClass();
        gm0.n("CallChatRepositoryTag", "release call chat state");
        sgg sggVar5 = pe1VarM.r;
        if (sggVar5 != null) {
            sggVar5.b(null);
        }
        pe1VarM.r = null;
        sgg sggVar6 = pe1VarM.s;
        if (sggVar6 != null) {
            sggVar6.b(null);
        }
        pe1VarM.s = null;
        p3c p3cVar2 = pe1VarM.q;
        zv8[] zv8VarArr2 = pe1.u;
        vo8 vo8Var = (vo8) p3cVar2.m(pe1VarM, zv8VarArr2[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        pe1VarM.q.B(pe1VarM, zv8VarArr2[0], null);
        vo8 vo8Var2 = (vo8) pe1VarM.t.m(pe1VarM, zv8VarArr2[1]);
        if (vo8Var2 != null) {
            vo8Var2.b(null);
        }
        pe1VarM.t.B(pe1VarM, zv8VarArr2[1], null);
        mjg mjgVar = pe1VarM.n;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, be1.n));
        mjg mjgVar2 = ((z3f) this.D.getValue()).b;
        do {
            value2 = mjgVar2.getValue();
            ((Boolean) value2).getClass();
        } while (!mjgVar2.h(value2, Boolean.FALSE));
        ya1 ya1Var = (ya1) ((da1) this.E.getValue());
        vo8 vo8Var3 = (vo8) ya1Var.p.m(ya1Var, ya1.w[0]);
        if (vo8Var3 != null) {
            vo8Var3.b(null);
        }
        sgg sggVar7 = ya1Var.o;
        if (sggVar7 != null) {
            sggVar7.b(null);
        }
        ya1Var.o = null;
        ya1Var.n.set(false);
        ParticipantStatesManager participantStatesManagerH = ya1Var.h();
        if (participantStatesManagerH != null) {
            participantStatesManagerH.removeHandListener((ParticipantStatesManager.Listener) ya1Var.g.getValue());
        }
        MediaMuteManager mediaMuteManagerG = ya1Var.g();
        if (mediaMuteManagerG != null) {
            mediaMuteManagerG.removeListener((va1) ya1Var.q.getValue());
        }
        ConversationFeatureManager conversationFeatureManagerI = ya1Var.i();
        if (conversationFeatureManagerI != null) {
            conversationFeatureManagerI.removeFeatureListener(oi1.b, (wa1) ya1Var.r.getValue());
        }
        ya1Var.h.set(new pw(0));
        mjg mjgVar3 = ya1Var.i;
        do {
            value3 = mjgVar3.getValue();
        } while (!mjgVar3.h(value3, cd.d));
        ya1Var.k.set(false);
        ya1Var.l.set(false);
        ya1Var.m.set(false);
        wo1 wo1Var = (wo1) ((to1) this.K.getValue());
        Conversation conversationA = ((f9) wo1Var.a.getValue()).a();
        ConversationFeatureManager featureManager = conversationA != null ? conversationA.getFeatureManager() : null;
        if (featureManager != null) {
            featureManager.removeFeatureListener(oi1.a, (uo1) wo1Var.g.getValue());
        }
        mjg mjgVar4 = wo1Var.h;
        Boolean bool = Boolean.FALSE;
        mjgVar4.getClass();
        mjgVar4.j(null, bool);
        wo1Var.f.set(false);
        vo8 vo8Var4 = (vo8) wo1Var.d.m(wo1Var, wo1.j[0]);
        if (vo8Var4 != null) {
            vo8Var4.b(null);
        }
        Conversation conversationA2 = D().a();
        if (conversationA2 != null) {
            conversationA2.getMediaConnectionManager().removeListener(S());
            conversationA2.getRecordManager().removeRecordListener((n4f) this.t.getValue());
            try {
                conversationA2.release();
                gm0.n("CallEngineTag", "Conversation released!");
            } catch (Throwable th) {
                gm0.V("CallEngineTag", th.getMessage(), th);
            }
        }
        ((n4f) this.t.getValue()).c(u4f.d);
        D().a.set(null);
        T().clear();
        jhd jhdVar = ((dz4) this.F1.getValue()).k;
        if (jhdVar == null || jhdVar.equals(jhd.e)) {
            mjg mjgVar5 = this.F1;
            do {
                value4 = mjgVar5.getValue();
                dz4 dz4Var = (dz4) value4;
                pi6 pi6Var = dz4Var.q;
                hi6 hi6Var = pi6Var instanceof hi6 ? (hi6) pi6Var : null;
                boolean z = (hi6Var != null ? hi6Var.a : null) == gi6.c;
                phl phlVar = dz4Var.a;
                if (dz4Var.i || z) {
                    phlVar = null;
                }
                dz4VarA = dz4.a(dz4.r, null, 0L, null, null, false, false, false, false, new jhd(ns4.a(dz4Var.c), phlVar, pi6Var, be1Var), false, false, false, null, false, null, 261119);
            } while (!mjgVar5.h(value4, dz4VarA));
            b95 b95Var = this.e;
            String str = this.a;
            ha9 ha9Var = this.b;
            je9 je9Var = je9.d;
            mjg mjgVar6 = b95Var.h;
            do {
                value5 = mjgVar6.getValue();
                list = (List) value5;
                list2 = list;
                arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (!cqk.d(((x02) obj).s(), str)) {
                        arrayList.add(obj);
                    }
                }
            } while (!mjgVar6.h(value5, arrayList));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (!cqk.d(((x02) obj2).s(), str)) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.size() != list.size()) {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, "CallsManager", c0a.l(arrayList2.size(), "onSessionReleased(", str, "): removing session, ", " left"), null);
                }
                mjg mjgVar7 = b95Var.f;
                mjgVar7.getClass();
                mjgVar7.j(null, dz4VarA);
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!cqk.d(((x02) next).s(), str));
                b95Var.s();
                if (arrayList2.isEmpty()) {
                    a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "CallsManager", "onSessionReleased(" + str + "): stopService for account=" + ha9Var, null);
                    }
                    y02 y02VarO = b95Var.o(ha9Var);
                    ac1 ac1Var = (ac1) y02VarO.b();
                    ac1Var.i.set(null);
                    rb0Var = (rb0) ac1Var.h.getAndSet(null);
                    if (rb0Var != null) {
                        rb0Var.release();
                    }
                    c51 c51Var = ac1Var.j;
                    p3c p3cVar3 = c51Var.f;
                    zv8[] zv8VarArr3 = c51.h;
                    p3cVar3.B(c51Var, zv8VarArr3[0], null);
                    c51Var.g.i(null);
                    c51Var.e = false;
                    gm0.n("CallAudioController", "CallAudioController released");
                    c51 c51Var2 = y02VarO.g().b;
                    c51Var2.f.B(c51Var2, zv8VarArr3[0], null);
                    c51Var2.g.i(null);
                    c51Var2.e = false;
                    y02VarO.c().d((Context) b95Var.e.getValue());
                } else {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4cVar.c(je9Var, "CallsManager", "onSessionReleased(" + str + "): stopService for account=" + ha9Var, null);
                            }
                            y02 y02VarO2 = b95Var.o(ha9Var);
                            ac1 ac1Var2 = (ac1) y02VarO2.b();
                            ac1Var2.i.set(null);
                            rb0Var = (rb0) ac1Var2.h.getAndSet(null);
                            if (rb0Var != null) {
                                rb0Var.release();
                            }
                            c51 c51Var3 = ac1Var2.j;
                            p3c p3cVar4 = c51Var3.f;
                            zv8[] zv8VarArr4 = c51.h;
                            p3cVar4.B(c51Var3, zv8VarArr4[0], null);
                            c51Var3.g.i(null);
                            c51Var3.e = false;
                            gm0.n("CallAudioController", "CallAudioController released");
                            c51 c51Var4 = y02VarO2.g().b;
                            c51Var4.f.B(c51Var4, zv8VarArr4[0], null);
                            c51Var4.g.i(null);
                            c51Var4.e = false;
                            y02VarO2.c().d((Context) b95Var.e.getValue());
                        } else if (cqk.d(((x02) it2.next()).l(), ha9Var)) {
                        }
                    }
                }
                x02 x02Var = (x02) ww3.t1(arrayList2);
                if (x02Var != null) {
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, "CallsManager", qv1.l("onSessionReleased(", str, "): restartForeground for ", x02Var.s()), null);
                    }
                    y02 y02VarO3 = b95Var.o(x02Var.l());
                    y02VarO3.c().a((Context) b95Var.e.getValue(), y02VarO3.d());
                }
            }
            Iterable iterable = (Iterable) b95Var.h.getValue();
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                b95Var.m.remove(ha9Var);
            } else {
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    if (cqk.d(((x02) it3.next()).l(), ha9Var)) {
                    }
                }
                b95Var.m.remove(ha9Var);
            }
        }
        this.y1.set(false);
        this.z1.set(false);
        this.A1.set(false);
        j72 j72Var = (j72) this.i.getValue();
        j72Var.a = null;
        j72Var.b = null;
        ic8 ic8VarR = R();
        ic8VarR.a = 1;
        ic8VarR.b = null;
        ic8VarR.c = false;
        ra8 ra8Var = (ra8) this.J1.getValue();
        ((rnf) ((onf) ra8Var.b.getValue())).d(ra8Var);
        ra8Var.d.set(null);
    }

    @Override // defpackage.x02
    public final mjg b() {
        return M().o;
    }

    public final void b0() {
        String strA = ns4.a(K().c);
        phl phlVar = K().a;
        sa2.d(O(), strA, "ANSWERED", (phlVar == null || !phlVar.b()) ? 1L : 2L, null, 24);
    }

    @Override // defpackage.x02
    public final float c() {
        ConversationParticipant me2;
        Conversation conversationQ;
        Conversation conversationQ2 = Q();
        if (conversationQ2 == null || (me2 = conversationQ2.getMe()) == null || (conversationQ = Q()) == null) {
            return 0.0f;
        }
        return conversationQ.getAdjustedAudioLevel(me2);
    }

    @Override // defpackage.x02
    public final void d(n61 n61Var, kj1 kj1Var) {
        String str = K().d;
        if (str != null && str.length() != 0) {
            if (str == null) {
                ore.p("Required value was null.");
                return;
            } else {
                n61Var.invoke(str);
                gm0.n("CallEngineTag", "join link already exist");
                return;
            }
        }
        String strA = ns4.a(K().c);
        if (strA == null) {
            gm0.n("CallEngineTag", "create p2p join link failed due to conversationId in null or empty");
            return;
        }
        sgg sggVar = this.o1;
        if (sggVar != null && sggVar.isActive()) {
            gm0.n("CallEngineTag", "create p2p join link already in progress");
            return;
        }
        this.o1 = yab.i0(this.c, ((n0c) W()).b(), 0, new vk4(7, (lq4) null, this, strA, kj1Var, n61Var), 2);
    }

    public final void d0(sgg sggVar) {
        this.r1.B(this, O1[0], sggVar);
    }

    @Override // defpackage.x02
    public final l92 e() {
        return S();
    }

    public final void e0() {
        ((gue) this.J.getValue()).c(this);
        S().f(this.L1);
        S().f((rnc) this.r.getValue());
        S().f((da1) this.E.getValue());
        S().f((to1) this.K.getValue());
        this.p1 = yab.i0(this.c, null, 0, new qy3(this, null, 7), 3);
    }

    @Override // defpackage.x02
    public final void f() {
        this.x1 = true;
    }

    public final void f0() {
        if (this.A1.compareAndSet(false, true)) {
            eqe eqeVarV = V();
            je9 je9Var = je9.d;
            if (eqeVarV.e == 3) {
                String name = eqe.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "startIncomingCall: skipped, current is: ".concat(pye.h(eqeVarV.e)), null);
                    return;
                }
                return;
            }
            eqeVarV.e = 3;
            sw1 sw1VarA = eqeVarV.a();
            int ringerMode = ((AudioManager) sw1VarA.e.getValue()).getRingerMode();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "RingtoneManagerTag", zo5.h(ringerMode, "startIncomingCall with ringer mode: "), null);
            }
            if (ringerMode == 1) {
                sw1VarA.c();
            } else {
                if (ringerMode != 2) {
                    return;
                }
                sw1VarA.b(sw1VarA.g.c, true, 2);
                sw1VarA.c();
            }
        }
    }

    @Override // defpackage.x02
    public final boolean g() {
        return R().b instanceof gc8;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x014c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0156  */
    /* JADX WARN: Code duplicated, block: B:61:0x0173 A[LOOP:0: B:59:0x016d->B:61:0x0173, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0181  */
    /* JADX WARN: Code duplicated, block: B:68:0x019e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [r66] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    public final void g0(Conversation conversation, ConversationEndReason conversationEndReason, jw5 jw5Var) {
        Object poeVar;
        boolean z;
        ?? arrayList;
        n92 n92Var;
        String conversationId;
        phl phlVar;
        boolean z2;
        Iterator it;
        t4e t4eVar = (t4e) this.I.getValue();
        boolean z3 = K().f;
        boolean shouldRateConversation = conversation.getRateManager().getShouldRateConversation();
        boolean z4 = this.y1.get();
        s4e s4eVar = (s4e) t4eVar;
        boolean z5 = true;
        if (z3) {
            ny8 ny8Var = s4eVar.a;
            ny8 ny8Var2 = s4eVar.b;
            String str = (String) ((g5d) ((gjf) ny8Var.getValue())).a.G1.a(e5d.S6[135]).i();
            if (str != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    poeVar = new u4e(jSONObject.optLong("delay", 86400L), jSONObject.optInt("limit", 10), jSONObject.optInt("sdk-limit", 10), jSONObject.optInt("duration", 10));
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                if (roe.a(poeVar) != null) {
                    String strConcat = "invalid rate call params json config ".concat(str);
                    gm0.V("RateCallParams", strConcat, new IllegalArgumentException(strConcat));
                }
                if (poeVar instanceof poe) {
                    poeVar = null;
                }
                u4e u4eVar = (u4e) poeVar;
                if (u4eVar != null) {
                    int i = ((nni) ny8Var2.getValue()).d.getInt("call.rate.indicator", 0);
                    int i2 = shouldRateConversation ? u4eVar.b : u4eVar.a;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (z4 && i2 - i <= 1 && u4eVar.e && conversationEndReason.equals(ConversationEndReason.Hangup.INSTANCE)) {
                        Long l = (Long) jw5Var.a().getValue();
                        boolean z6 = l != null && l.longValue() > ((long) u4eVar.c);
                        boolean z7 = (jCurrentTimeMillis - ((nni) ny8Var2.getValue()).d.getLong("call.rate.indicator.time", -1L)) / 1000 > u4eVar.d;
                        if (z6 && z7 && ((gue) s4eVar.c.getValue()).e()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        ((nni) ny8Var2.getValue()).d(0, "call.rate.indicator");
                        zr6 zr6Var = (zr6) ((nni) ny8Var2.getValue()).d.edit();
                        zr6Var.putLong("call.rate.indicator.time", jCurrentTimeMillis);
                        zr6Var.apply();
                    } else {
                        nni nniVar = (nni) ny8Var2.getValue();
                        nniVar.d(nniVar.d.getInt("call.rate.indicator", 0) + 1, "call.rate.indicator");
                    }
                }
            }
            if (z) {
                if (conversation.getRateManager().getShouldRateConversation()) {
                    List<RateHint> rateHints = conversation.getRateManager().getRateHints();
                    arrayList = new ArrayList(yw3.W0(rateHints, 10));
                    it = rateHints.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((RateHint) it.next()).getReason());
                    }
                } else {
                    arrayList = r66.a;
                }
                n92Var = (n92) this.s.getValue();
                conversationId = conversation.getConversationId();
                phlVar = K().a;
                if (phlVar == null && (!(phlVar instanceof m32))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!this.x1 && !conversation.isInitialVideoEnabled()) {
                    z5 = false;
                }
                if (((gue) n92Var.c.getValue()).e()) {
                    so1 so1Var = (so1) n92Var.b.getValue();
                    so1Var.getClass();
                    Intent intent = new Intent(so1Var.c(), (Class<?>) CallNotifierFixActivity.class);
                    intent.setAction("action-rate-call");
                    intent.putExtra("call_id", conversationId);
                    intent.putExtra("is_group", z2);
                    intent.putExtra("is_video", z5);
                    intent.putExtra("sdk_reasons", (String[]) ((Collection) arrayList).toArray(new String[0]));
                    intent.setFlags(268435456);
                    intent.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, so1Var.a.a);
                    so1Var.c().startActivity(intent);
                }
            }
            return;
        }
        s4eVar.getClass();
        z = false;
        if (z) {
            return;
        }
        if (conversation.getRateManager().getShouldRateConversation()) {
            List<RateHint> rateHints2 = conversation.getRateManager().getRateHints();
            arrayList = new ArrayList(yw3.W0(rateHints2, 10));
            it = rateHints2.iterator();
            while (it.hasNext()) {
                arrayList.add(((RateHint) it.next()).getReason());
            }
        } else {
            arrayList = r66.a;
        }
        n92Var = (n92) this.s.getValue();
        conversationId = conversation.getConversationId();
        phlVar = K().a;
        if (phlVar == null) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (!this.x1) {
            z5 = false;
        }
        if (((gue) n92Var.c.getValue()).e()) {
            so1 so1Var2 = (so1) n92Var.b.getValue();
            so1Var2.getClass();
            Intent intent2 = new Intent(so1Var2.c(), (Class<?>) CallNotifierFixActivity.class);
            intent2.setAction("action-rate-call");
            intent2.putExtra("call_id", conversationId);
            intent2.putExtra("is_group", z2);
            intent2.putExtra("is_video", z5);
            intent2.putExtra("sdk_reasons", (String[]) ((Collection) arrayList).toArray(new String[0]));
            intent2.setFlags(268435456);
            intent2.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, so1Var2.a.a);
            so1Var2.c().startActivity(intent2);
        }
    }

    @Override // defpackage.x02
    public final dnc getParticipants() {
        return T();
    }

    @Override // defpackage.ou
    public final void h(long j) {
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2 A[EDGE_INSN: B:33:0x00a2->B:47:0x00cf BREAK  A[LOOP:2: B:25:0x0084->B:84:0x0084]] */
    public final void h0(boolean z) {
        ConversationParticipant next;
        y85 y85Var;
        ConversationParticipant opponent;
        ParticipantId externalId;
        y85 y85Var2 = this;
        mi6 mi6Var = mi6.a;
        Conversation conversationQ = y85Var2.Q();
        if (conversationQ == null) {
            return;
        }
        phl phlVar = y85Var2.K().a;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = phlVar != null && ((phlVar instanceof m32) ^ true);
        boolean z5 = y85Var2.K().f;
        if (!z && z5) {
            mjg mjgVar = y85Var2.F1;
            while (true) {
                Object value = mjgVar.getValue();
                mjg mjgVar2 = mjgVar;
                if (mjgVar2.h(value, dz4.a(y85Var2.K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, mi6Var, 122847))) {
                    break;
                }
                z3 = true;
                mjgVar = mjgVar2;
                y85Var2 = this;
            }
        }
        if (z4) {
            ParticipantCollection participants = conversationQ.getParticipants();
            if (participants == null || !participants.isEmpty()) {
                for (ConversationParticipant conversationParticipant : participants) {
                    if (conversationParticipant.isUseable() && conversationParticipant.isCallAccepted()) {
                        if (!conversationQ.isMeInWaitingRoom()) {
                            z2 = true;
                            break;
                        }
                        break;
                    }
                }
            }
        } else {
            ParticipantCollection participants2 = conversationQ.getParticipants();
            if (participants2 != null && participants2.isEmpty()) {
                z2 = true;
                break;
            }
            Iterator<ConversationParticipant> it = participants2.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                    if (!next.isUseable()) {
                        break;
                    }
                } else {
                    z2 = true;
                    break;
                }
            } while (next.isCallAccepted());
        }
        if (z4) {
            y85Var = this;
        } else {
            Conversation conversationQ2 = Q();
            y85Var = this;
            y85Var.C1 = (conversationQ2 == null || (opponent = conversationQ2.getOpponent()) == null || (externalId = opponent.getExternalId()) == null) ? null : Long.valueOf(anc.a(externalId).a);
        }
        if (!z2) {
            return;
        }
        y85Var.A().start();
        p3c p3cVar = y85Var.t1;
        zv8[] zv8VarArr = O1;
        vo8 vo8Var = (vo8) p3cVar.m(y85Var, zv8VarArr[1]);
        if ((vo8Var == null || !vo8Var.isActive()) && !y85Var.K().i) {
            y85Var.t1.B(y85Var, zv8VarArr[1], yab.i0(y85Var.c, null, 2, new me1(y85Var, null), 1));
        }
        if (z4) {
            sa2 sa2VarO = y85Var.O();
            String strA = ns4.a(y85Var.K().c);
            Long lValueOf = Long.valueOf(conversationQ.getParticipants().size());
            sa2VarO.getClass();
            sa2.c(sa2VarO, "GROUP_CALL_JOIN", strA, null, lValueOf, null, null, true, null, 372);
        }
        mjg mjgVar3 = y85Var.F1;
        while (true) {
            Object value2 = mjgVar3.getValue();
            if (mjgVar3.h(value2, dz4.a(y85Var.K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, mi6Var, 122847))) {
                O().e = 6;
                ((unc) ((rnc) this.r.getValue())).rebindParticipantViews();
                return;
            }
            y85Var = this;
        }
    }

    @Override // defpackage.x02
    public final void i() {
        Conversation conversationQ = Q();
        if (conversationQ == null) {
            gm0.n("CallEngineTag", "hold(): no conversation");
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallEngineTag", zo5.s("hold(): requesting hold, isHeldByMe=", conversationQ.isHeldByMe()), null);
            }
        }
        mjg mjgVar = this.H1;
        Boolean bool = Boolean.TRUE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        N().f(this.a);
        conversationQ.requestHoldStateChange(true, new k85(this, conversationQ, 0));
    }

    @Override // defpackage.x02
    public final gjg isHeldByMe() {
        return this.I1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // defpackage.x02
    public final Object j(sv1 sv1Var, lq4 lq4Var) throws IllegalAccessException, InvocationTargetException {
        r85 r85Var;
        Object value;
        Object value2;
        sv1 sv1Var2 = sv1Var;
        je9 je9Var = je9.d;
        if (lq4Var instanceof r85) {
            r85Var = (r85) lq4Var;
            int i = r85Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                r85Var.g = i - Integer.MIN_VALUE;
            } else {
                r85Var = new r85(this, (nq4) lq4Var);
            }
        } else {
            r85Var = new r85(this, (nq4) lq4Var);
        }
        Object obj = r85Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = r85Var.g;
        if (i2 == 0) {
            ch3.d0(obj);
            eqe eqeVarV = V();
            eqeVarV.e = 0;
            eqeVarV.a().d();
            pe1 pe1VarM = M();
            r85Var.d = sv1Var2;
            r85Var.g = 1;
            if (pe1VarM.g(sv1Var2, r85Var) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sv1Var2 = r85Var.d;
            ch3.d0(obj);
        }
        mjg mjgVar = this.F1;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, dz4.a(K(), null, 0L, null, null, false, false, false, false, null, false, false, sv1Var2.m(), sv1Var2.k(), sv1Var2.b(), null, 147455)));
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", this + " create conversation for answer " + sv1Var2, null);
        }
        eo1 eo1Var = (eo1) this.G.getValue();
        eo1Var.getClass();
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        b9bVar.k("incoming_call", Boolean.TRUE);
        eo1Var.g = qrc.x(eo1Var, null, b9bVar, null, null, 13);
        ((kc8) this.H.getValue()).z(0);
        J(true, new Long(sv1Var2.f()), sv1Var2);
        be1 be1Var = (be1) M().o.getValue();
        CharSequence charSequenceJ = sv1Var2.j();
        boolean z = (((charSequenceJ == null || r5h.X0(charSequenceJ)) && (be1Var.c == null || be1Var.equals(be1.n))) || cqk.d(be1Var, be1.n) || ns4.b(sv1Var2.g())) ? false : true;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "CallEngineTag", zo5.q("Early check: canShowEarly=", ", hasCall=", z, C()), null);
        }
        if (z) {
            gm0.n("CallEngineTag", "Early incoming: setting up early UI");
            mjg mjgVar2 = this.F1;
            do {
                value2 = mjgVar2.getValue();
            } while (!mjgVar2.h(value2, new dz4(new m32(sv1Var2.f(), sv1Var2.g(), sv1Var2.a()), sv1Var2.g(), null, false, true, false, sv1Var2.m(), sv1Var2.k(), sv1Var2.b(), li6.a, 15994)));
            ic8 ic8VarR = R();
            ic8VarR.a = 2;
            ic8VarR.c = true;
            e0();
            boolean zA = sv1Var2.a();
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, "CallEngineTag", zo5.s("presentIncomingCall: hasCall=", C()), null);
            }
            Iterator it = this.e.l.iterator();
            while (it.hasNext()) {
                ((f22) it.next()).l();
            }
            ((n92) this.s.getValue()).a(be1Var, zA, this.a);
        }
        wfe wfeVar = new wfe();
        gf1 gf1Var = this.d;
        String str = this.a;
        if (r5h.X0(str)) {
            str = null;
        }
        String strL = sv1Var2.l();
        long jF = sv1Var2.f();
        boolean zA2 = sv1Var2.a();
        if (str == null) {
            ore.p("Required value was null.");
            return null;
        }
        bo boVar = new bo();
        boVar.b = jF;
        boVar.a = str;
        boVar.c = strL;
        ef1 ef1Var = new ef1(a92.a(gf1Var.a).answer(new nb(boVar, gf1Var, new os1(this, sv1Var2, wfeVar, 7), new w14(sv1Var2, 12, this), 1)));
        ifh ifhVar = ns4.b;
        ff1 ff1Var = new ff1(ef1Var, new m32(jF, str, zA2), true, 112);
        I(ff1Var, 0);
        wfeVar.a = ff1Var;
        return sbi.a;
    }

    @Override // defpackage.x02
    public final boolean k() {
        ic8 ic8VarR = R();
        if (!ic8VarR.c || ic8VarR.a != 2 || (R().b instanceof fc8)) {
            Conversation conversationA = D().a();
            boolean z = (conversationA == null || conversationA.isAnswered()) ? false : true;
            Conversation conversationA2 = D().a();
            boolean z2 = (conversationA2 == null || conversationA2.isCaller()) ? false : true;
            pi6 pi6Var = K().q;
            if ((pi6Var instanceof ii6) || (pi6Var instanceof hi6) || (pi6Var instanceof ki6) || !z || !z2 || K().i) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.x02
    public final ha9 l() {
        return this.b;
    }

    @Override // defpackage.x02
    public final boolean m() {
        Conversation conversationA = D().a();
        boolean z = conversationA != null && conversationA.isAnswered();
        Conversation conversationA2 = D().a();
        boolean z2 = conversationA2 != null && conversationA2.isCaller();
        pi6 pi6Var = K().q;
        return ((pi6Var instanceof ii6) || (pi6Var instanceof hi6) || (pi6Var instanceof ki6) || (!z && !z2 && !K().i && !(R().b instanceof fc8))) ? false : true;
    }

    @Override // defpackage.x02
    public final boolean n() {
        Conversation conversationQ = Q();
        if (conversationQ == null || !conversationQ.isHeldByMe()) {
            Collection collectionValues = ((enc) T().a().getValue()).c.values();
            if (collectionValues.isEmpty()) {
                return false;
            }
            Collection<tmc> collection = collectionValues;
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                for (tmc tmcVar : collection) {
                    if (!tmcVar.a.l() && !tmcVar.a.m()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.x02
    public final void o(boolean z) {
        if (z) {
            this.z1.set(true);
        }
        p(K().q instanceof oi6 ? it7.e : null);
    }

    @Override // defpackage.x02
    public final void p(it7 it7Var) {
        Object value;
        Object value2;
        it7 it7Var2 = it7Var;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallEngineTag", "hangup(): reason=" + it7Var2 + ", earlyStart=" + R() + ", state=" + K().q, null);
            }
        }
        this.u1.B(this, O1[2], null);
        ue1.h(N(), this.a);
        N().p(this.a);
        this.y1.set(true);
        ic8 ic8VarR = R();
        if (!ic8VarR.c || ic8VarR.a != 2) {
            mjg mjgVar = this.F1;
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, dz4.a(K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, null, 258047)));
            Conversation conversationQ = Q();
            if (conversationQ != null) {
                if (it7Var2 == null) {
                    it7Var2 = null;
                }
                conversationQ.hangup(new ht7(it7Var2));
                return;
            }
            return;
        }
        gm0.n("CallEngineTag", "hangup(): SDK not ready, early decline — hangup and release immediately");
        R().b = gc8.a;
        Conversation conversationQ2 = Q();
        if (conversationQ2 != null) {
            conversationQ2.hangup(new ht7(it7.c));
        }
        mjg mjgVar2 = this.F1;
        do {
            value2 = mjgVar2.getValue();
        } while (!mjgVar2.h(value2, dz4.a(K(), null, 0L, null, null, false, false, false, false, null, false, false, false, null, false, ii6.a, 131071)));
        this.e.n(this.a);
        V().e();
        a0();
    }

    @Override // defpackage.x02
    public final boolean q(sv1 sv1Var) {
        boolean z;
        Conversation conversationA;
        je9 je9Var = je9.d;
        long jF = sv1Var.f();
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", "showIncomingCall push=" + sv1Var, null);
        }
        Conversation conversationA2 = D().a();
        boolean z2 = conversationA2 == null || !conversationA2.isDestroyed();
        Conversation conversationA3 = D().a();
        boolean zIsAnswered = conversationA3 != null ? conversationA3.isAnswered() : false;
        dz4 dz4VarK = K();
        phl phlVar = dz4VarK.a;
        m32 m32Var = phlVar instanceof m32 ? (m32) phlVar : null;
        Long lValueOf = m32Var != null ? Long.valueOf(m32Var.a) : null;
        String str = dz4VarK.c;
        String strG = sv1Var.g();
        ifh ifhVar = ns4.b;
        boolean zD = cqk.d(str, strG);
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            Conversation conversationA4 = D().a();
            z = false;
            a4cVar2.c(je9Var, "CallEngineTag", z2 + " && " + jF + " == " + lValueOf + " && " + (conversationA4 != null && conversationA4.isCaller()), null);
        } else {
            z = false;
        }
        if (zD && z2) {
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, "CallEngineTag", this + " ignore repetitive push " + ns4.c(sv1Var.g()) + " current id " + ns4.c(dz4VarK.c), null);
                }
            }
            ((kc8) this.H.getValue()).z(1);
            return z;
        }
        if (z2 && lValueOf != null && jF == lValueOf.longValue() && (conversationA = D().a()) != null && conversationA.isCaller()) {
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, "CallEngineTag", this + " same incoming call userId=" + jF + " answered=" + zIsAnswered, null);
            }
            ((kc8) this.H.getValue()).z(2);
            if (!zIsAnswered) {
                phl phlVar2 = dz4VarK.a;
                B(phlVar2 != null ? phlVar2.b() : z);
            }
            O().e = 6;
            boolean z3 = z;
            yab.i0(this.c, null, z3 ? 1 : 0, new qh4(this, sv1Var, null, 12), 3);
            return z3;
        }
        return true;
    }

    @Override // defpackage.x02
    public final rf1 r() {
        return (rf1) this.K1.getValue();
    }

    @Override // defpackage.x02
    public final String s() {
        return this.a;
    }

    @Override // defpackage.x02
    public final void t() {
        V().e();
    }

    @Override // defpackage.x02
    public final n4f u() {
        return (n4f) this.t.getValue();
    }

    @Override // defpackage.x02
    public final void v() {
        Conversation conversationQ = Q();
        if (conversationQ == null) {
            gm0.n("CallEngineTag", "unhold(): no conversation");
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallEngineTag", zo5.s("unhold(): requesting unhold, isHeldByMe=", conversationQ.isHeldByMe()), null);
            }
        }
        mjg mjgVar = this.H1;
        Boolean bool = Boolean.FALSE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        N().r(this.a);
        conversationQ.requestHoldStateChange(false, new k85(this, conversationQ, 1));
    }

    @Override // defpackage.ou
    public final void w(long j) {
        if (V().a().a()) {
            return;
        }
        V().e();
    }

    @Override // defpackage.x02
    public final boolean x() {
        Conversation conversationA = D().a();
        pi6 pi6Var = K().q;
        return ((pi6Var instanceof ii6) || (pi6Var instanceof hi6) || (pi6Var instanceof ki6) || conversationA == null || !conversationA.isCaller() || conversationA.isAnswered() || K().i) ? false : true;
    }

    @Override // defpackage.x02
    public final void y() {
        mjg mjgVar;
        Object value;
        do {
            mjgVar = this.F1;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, dz4.a(K(), null, 0L, null, null, false, false, false, false, null, true, false, false, null, false, null, 258047)));
    }

    @Override // defpackage.x02
    public final gjg z() {
        return this.G1;
    }
}
