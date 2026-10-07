package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Build;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.media3.common.ParserException;
import androidx.media3.transformer.ExportException;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import one.me.android.root.RootController;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatmedia.viewer.video.BaseVideoViewerWidget;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.ringtone.player.MediaSource$SoundConfigException;
import one.me.vpnconnectedwarning.VpnConnectedWarningBottomSheet;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes4.dex */
public final class xva implements f7e, oca, op5, p52, aqg, g1d, ds7, jg7, teg, wsf, az4, z4a, z5g, igg {
    public final /* synthetic */ int a;
    public Object b;

    public xva(int i) {
        this.a = i;
        switch (i) {
            case 27:
                this.b = new ku8();
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    public static final xva D(fka fkaVar) {
        int iU;
        String strX;
        try {
            iU = ch3.U(fkaVar);
        } catch (Throwable th) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = fjf.a.iterator();
            while (it.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th);
                    accountInitializer.d().i().g().a(null, th);
                } catch (Throwable th2) {
                    gm0.V("Payload", "failed to collect exception", th2);
                }
            }
            int iD = qt4.D(pye.a);
            if (iD != 0) {
                if (iD == 1) {
                    throw th;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        long[] jArrC = null;
        for (int i = 0; i < iU; i++) {
            try {
                strX = ch3.X(fkaVar, null);
            } catch (Throwable th3) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = fjf.a.iterator();
                while (it2.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th3);
                        accountInitializer2.d().i().g().a(null, th3);
                    } catch (Throwable th4) {
                        gm0.V("Payload", "failed to collect exception", th4);
                    }
                }
                int iD2 = qt4.D(pye.a);
                if (iD2 != 0) {
                    if (iD2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    if (strX.equals("organizationIds")) {
                        jArrC = fjf.c(fkaVar);
                    } else {
                        try {
                            fkaVar.x();
                        } catch (Throwable th5) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                            Iterator it3 = fjf.a.iterator();
                            while (it3.hasNext()) {
                                AccountInitializer accountInitializer3 = ((n6) it3.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th5);
                                    accountInitializer3.d().i().g().a(null, th5);
                                } catch (Throwable th6) {
                                    gm0.V("Payload", "failed to collect exception", th6);
                                }
                            }
                            int iD3 = qt4.D(pye.a);
                            if (iD3 != 0) {
                                if (iD3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                        Iterator it4 = fjf.a.iterator();
                        while (it4.hasNext()) {
                            AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th7);
                                accountInitializer4.d().i().g().a(null, th7);
                            } catch (Throwable th8) {
                                gm0.V("Payload", "failed to collect exception", th8);
                            }
                        }
                        int iD4 = qt4.D(pye.a);
                        if (iD4 != 0) {
                            if (iD4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th7;
                        }
                    } catch (Throwable th9) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                        Iterator it5 = fjf.a.iterator();
                        while (it5.hasNext()) {
                            AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th9);
                                accountInitializer5.d().i().g().a(null, th9);
                            } catch (Throwable th10) {
                                gm0.V("Payload", "failed to collect exception", th10);
                            }
                        }
                        int iD5 = qt4.D(pye.a);
                        if (iD5 != 0) {
                            if (iD5 == 1) {
                                throw th9;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        if (jArrC != null) {
            return new xva(28, jArrC);
        }
        return null;
    }

    public int A(long j) {
        ArrayList arrayList = (ArrayList) this.b;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((bz4) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    public Surface B() {
        return (Surface) this.b;
    }

    public void C(int i, long j) throws ParserException {
        to9 to9Var = (to9) this.b;
        if (i == 240) {
            if (to9Var.z) {
                return;
            }
            to9Var.a(i);
            if (to9Var.H == -1) {
                to9Var.H = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (to9Var.z) {
                return;
            }
            to9Var.a(i);
            if (to9Var.G == -1) {
                to9Var.G = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                int i2 = (int) j;
                if (i2 == 1) {
                    to9Var.c(i);
                    to9Var.y.e = 2;
                    return;
                }
                if (i2 == 2) {
                    to9Var.c(i);
                    to9Var.y.e = 1;
                    return;
                } else if (i2 == 17) {
                    to9Var.c(i);
                    to9Var.y.e = 3;
                    return;
                } else if (i2 != 33) {
                    to9Var.c(i);
                    to9Var.y.e = -1;
                    return;
                } else {
                    to9Var.c(i);
                    to9Var.y.e = 5;
                    return;
                }
            case 136:
                to9Var.c(i);
                to9Var.y.Y = j == 1;
                return;
            case 155:
                to9Var.p1 = to9Var.j(j);
                return;
            case 159:
                to9Var.c(i);
                to9Var.y.Q = (int) j;
                return;
            case 176:
                to9Var.c(i);
                to9Var.y.n = (int) j;
                return;
            case 179:
                if (to9Var.z) {
                    return;
                }
                to9Var.a(i);
                to9Var.E = to9Var.j(j);
                return;
            case 186:
                to9Var.c(i);
                to9Var.y.o = (int) j;
                return;
            case 215:
                to9Var.c(i);
                to9Var.y.d = (int) j;
                return;
            case 231:
                to9Var.Y = to9Var.j(j);
                return;
            case 238:
                to9Var.w1 = (int) j;
                return;
            case 247:
                if (to9Var.z) {
                    return;
                }
                to9Var.a(i);
                to9Var.F = (int) j;
                return;
            case 251:
                to9Var.x1 = true;
                return;
            case 16871:
                to9Var.c(i);
                to9Var.y.h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw ParserException.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw ParserException.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw ParserException.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                to9Var.B = j + to9Var.s;
                return;
            case 21432:
                int i3 = (int) j;
                to9Var.c(i);
                if (i3 == 0) {
                    to9Var.y.y = 0;
                    return;
                }
                if (i3 == 1) {
                    to9Var.y.y = 2;
                    return;
                } else if (i3 == 3) {
                    to9Var.y.y = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    to9Var.y.y = 3;
                    return;
                }
            case 21680:
                to9Var.c(i);
                to9Var.y.q = (int) j;
                return;
            case 21682:
                to9Var.c(i);
                to9Var.y.s = (int) j;
                return;
            case 21690:
                to9Var.c(i);
                to9Var.y.r = (int) j;
                return;
            case 21930:
                to9Var.c(i);
                to9Var.y.X = j == 1;
                return;
            case 21938:
                to9Var.c(i);
                so9 so9Var = to9Var.y;
                so9Var.z = true;
                so9Var.p = (int) j;
                return;
            case 21998:
                to9Var.c(i);
                to9Var.y.g = (int) j;
                return;
            case 22186:
                to9Var.c(i);
                to9Var.y.T = j;
                return;
            case 22203:
                to9Var.c(i);
                to9Var.y.U = j;
                return;
            case 25188:
                to9Var.c(i);
                to9Var.y.R = (int) j;
                return;
            case 30114:
                to9Var.y1 = j;
                return;
            case 30321:
                to9Var.c(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    to9Var.y.t = 0;
                    return;
                }
                if (i4 == 1) {
                    to9Var.y.t = 1;
                    return;
                } else if (i4 == 2) {
                    to9Var.y.t = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    to9Var.y.t = 3;
                    return;
                }
            case 2352003:
                to9Var.c(i);
                to9Var.y.f = (int) j;
                return;
            case 2807729:
                to9Var.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        to9Var.c(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            to9Var.y.C = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            to9Var.y.C = 1;
                            return;
                        }
                    case 21946:
                        to9Var.c(i);
                        int iJ = ex3.j((int) j);
                        if (iJ != -1) {
                            to9Var.y.B = iJ;
                            return;
                        }
                        return;
                    case 21947:
                        to9Var.c(i);
                        to9Var.y.z = true;
                        int i6 = ex3.i((int) j);
                        if (i6 != -1) {
                            to9Var.y.A = i6;
                            return;
                        }
                        return;
                    case 21948:
                        to9Var.c(i);
                        to9Var.y.D = (int) j;
                        return;
                    case 21949:
                        to9Var.c(i);
                        to9Var.y.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // defpackage.f7e
    public void E(long j, s5e s5eVar) {
        String name = xva.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "onReactionSelected: " + j + " " + ((Object) s5eVar), null);
            }
        }
        MessagesSettingsScreen messagesSettingsScreen = (MessagesSettingsScreen) this.b;
        zv8[] zv8VarArr = MessagesSettingsScreen.p;
        bwa bwaVarQ1 = messagesSettingsScreen.q1();
        bwaVarQ1.getClass();
        bwaVarQ1.r.B(bwaVarQ1, bwa.s[2], a8j.t(bwaVarQ1, null, new awa(bwaVarQ1, s5eVar, (lq4) null, 0), 1));
    }

    public void F(long j, boolean z) {
        CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) this.b;
        er3 er3Var = CallHistoryPageScreen.l;
        boolean z2 = ((o5b) callHistoryPageScreen.r1().h.b.a.getValue()).a;
        CallHistoryPageScreen callHistoryPageScreen2 = (CallHistoryPageScreen) this.b;
        if (z2) {
            CallHistoryPageScreen.o1(callHistoryPageScreen2, j);
            return;
        }
        boolean zA = ((gbj) callHistoryPageScreen2.s1().r.getValue()).a();
        final int i = 0;
        final int i2 = 1;
        if (zA) {
            zv8[] zv8VarArr = BottomSheetWidget.t;
            VpnConnectedWarningBottomSheet vpnConnectedWarningBottomSheet = new VpnConnectedWarningBottomSheet(y3f.CALL_VPN_WARNING_SHEET, ((CallHistoryPageScreen) this.b).getC().b());
            br4 parentController = (CallHistoryPageScreen) this.b;
            vpnConnectedWarningBottomSheet.setTargetController(parentController);
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
            hve hveVarU1 = rootController != null ? rootController.u1() : null;
            if (hveVarU1 != null) {
                lve lveVar = new lve(vpnConnectedWarningBottomSheet, null, null, null, false, -1);
                p.k(false, lveVar, true, "BottomSheetWidget");
                hveVarU1.I(lveVar);
                return;
            }
            return;
        }
        kl1 kl1VarS1 = ((CallHistoryPageScreen) this.b).s1();
        na2 na2Var = na2.HISTORY;
        yw7 yw7VarD = kl1VarS1.D(j);
        final qw7 qw7Var = yw7VarD != null ? yw7VarD.k : null;
        if (yw7VarD != null && !cqk.d(qw7Var, pw7.a)) {
            ae9 ae9Var = (ae9) ((xl1) kl1VarS1.p.getValue()).a.getValue();
            ul9 ul9Var = new ul9();
            ul9Var.put("callType", z ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND);
            String strA = xl1.a(yw7VarD.k);
            if (strA != null) {
                ul9Var.put("dialogType", strA);
            }
            ul9Var.put("source", "history");
            ae9Var.g("RECALL_FROM_HISTORY", ul9Var.b());
        }
        if (qw7Var != null) {
            if (qw7Var instanceof ow7) {
                ow7 ow7Var = (ow7) qw7Var;
                if (jcd.d((jcd) kl1VarS1.q.getValue(), ((bi4) kl1VarS1.l.getValue()).e(ow7Var.a), null, 2)) {
                    a8j.x(kl1VarS1.y, sbi.a);
                    return;
                }
                String strA2 = ((os4) kl1VarS1.t.getValue()).a();
                kl1VarS1.d.m(Long.valueOf(j), strA2, ow7Var.a, z, new il1(qw7Var, strA2, z));
                kl1VarS1.B().e = 1;
                kl1VarS1.B().c = la2.a;
                kl1VarS1.B().j(strA2);
                kl1VarS1.B().g(na2Var, z);
                return;
            }
            if (qw7Var instanceof lw7) {
                lw7 lw7Var = (lw7) qw7Var;
                if (lw7Var.c) {
                    kl1VarS1.d.k(lw7Var.e, true, z, false, new af7() { // from class: jl1
                        @Override // defpackage.af7
                        public final Object invoke() {
                            int i3 = i;
                            sbi sbiVar = sbi.a;
                            qw7 qw7Var2 = qw7Var;
                            switch (i3) {
                                case 0:
                                    pk1.b.k(((lw7) qw7Var2).e);
                                    break;
                                default:
                                    pk1.b.k(((nw7) qw7Var2).a);
                                    break;
                            }
                            return sbiVar;
                        }
                    });
                    sa2 sa2VarB = kl1VarS1.B();
                    String strValueOf = String.valueOf(j);
                    sa2VarB.getClass();
                    sa2.c(sa2VarB, "GROUP_CALL_JOIN", strValueOf, null, null, null, null, true, null, 372);
                    return;
                }
            }
            if (qw7Var instanceof nw7) {
                kl1VarS1.d.k(((nw7) qw7Var).a, true, z, false, new af7() { // from class: jl1
                    @Override // defpackage.af7
                    public final Object invoke() {
                        int i3 = i2;
                        sbi sbiVar = sbi.a;
                        qw7 qw7Var2 = qw7Var;
                        switch (i3) {
                            case 0:
                                pk1.b.k(((lw7) qw7Var2).e);
                                break;
                            default:
                                pk1.b.k(((nw7) qw7Var2).a);
                                break;
                        }
                        return sbiVar;
                    }
                });
                kl1VarS1.B().e = 1;
                kl1VarS1.B().c = la2.c;
                kl1VarS1.B().g(na2Var, z);
            }
        }
    }

    @Override // defpackage.aqg
    public Object G(int i) {
        if (i >= 0) {
            return (CharSequence) ((tc) this.b).invoke(Integer.valueOf(i));
        }
        return null;
    }

    public void H(djh djhVar) {
        this.b = djhVar;
    }

    public void I(int i, long j, long j2) throws ParserException {
        to9 to9Var = (to9) this.b;
        to9Var.I1.getClass();
        if (i == 160) {
            to9Var.x1 = false;
            to9Var.y1 = 0L;
            return;
        }
        if (i == 174) {
            so9 so9Var = new so9();
            so9Var.n = -1;
            so9Var.o = -1;
            so9Var.p = -1;
            so9Var.q = -1;
            so9Var.r = -1;
            so9Var.s = 0;
            so9Var.t = -1;
            so9Var.u = 0.0f;
            so9Var.v = 0.0f;
            so9Var.w = 0.0f;
            so9Var.x = null;
            so9Var.y = -1;
            so9Var.z = false;
            so9Var.A = -1;
            so9Var.B = -1;
            so9Var.C = -1;
            so9Var.D = 1000;
            so9Var.E = 200;
            so9Var.F = -1.0f;
            so9Var.G = -1.0f;
            so9Var.H = -1.0f;
            so9Var.I = -1.0f;
            so9Var.J = -1.0f;
            so9Var.K = -1.0f;
            so9Var.L = -1.0f;
            so9Var.M = -1.0f;
            so9Var.N = -1.0f;
            so9Var.O = -1.0f;
            so9Var.Q = 1;
            so9Var.R = -1;
            so9Var.S = 8000;
            so9Var.T = 0L;
            so9Var.U = 0L;
            so9Var.W = false;
            so9Var.Y = true;
            so9Var.Z = "eng";
            to9Var.y = so9Var;
            so9Var.a = to9Var.w;
            return;
        }
        if (i == 183) {
            if (to9Var.z) {
                return;
            }
            to9Var.a(i);
            to9Var.F = -1;
            to9Var.G = -1L;
            to9Var.H = -1L;
            return;
        }
        if (i == 187) {
            if (to9Var.z) {
                return;
            }
            to9Var.a(i);
            to9Var.E = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            to9Var.A = -1;
            to9Var.B = -1L;
            return;
        }
        if (i == 20533) {
            to9Var.c(i);
            to9Var.y.i = true;
            return;
        }
        if (i == 21968) {
            to9Var.c(i);
            to9Var.y.z = true;
            return;
        }
        if (i == 408125543) {
            long j3 = to9Var.s;
            if (j3 != -1 && j3 != j) {
                throw ParserException.a(null, "Multiple Segment elements not supported");
            }
            to9Var.s = j;
            to9Var.r = j2;
            return;
        }
        if (i == 475249515) {
            if (to9Var.z) {
                return;
            }
            to9Var.D = true;
        } else if (i == 524531317 && !to9Var.z) {
            if (to9Var.d && to9Var.K != -1) {
                to9Var.J = true;
            } else {
                to9Var.I1.r(new vk0(to9Var.v));
                to9Var.z = true;
            }
        }
    }

    public void J(int i, String str) throws ParserException {
        to9 to9Var = (to9) this.b;
        if (i == 134) {
            to9Var.c(i);
            to9Var.y.c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                to9Var.w = str.equals("webm");
                return;
            }
            throw ParserException.a(null, "DocType " + str + " not supported");
        }
        if (i == 21358) {
            to9Var.c(i);
            to9Var.y.b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            to9Var.c(i);
            to9Var.y.Z = str;
        }
    }

    @Override // defpackage.aqg
    public void R(vpg vpgVar, int i) {
        ((u83) vpgVar).d.setText((CharSequence) G(i));
    }

    @Override // defpackage.f7e
    public List S(long j) {
        String name = xva.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.j(j, "onExpandReactions: "), null);
            }
        }
        MessagesSettingsScreen messagesSettingsScreen = (MessagesSettingsScreen) this.b;
        zv8[] zv8VarArr = MessagesSettingsScreen.p;
        return messagesSettingsScreen.q1().B();
    }

    @Override // defpackage.jg7
    public void a(Object obj) {
        b87 b87Var;
        Bitmap bitmap = (Bitmap) obj;
        ((f58) this.b).i = 50;
        a87 a87Var = new a87();
        a87Var.u = bitmap.getHeight();
        a87Var.t = bitmap.getWidth();
        a87Var.m = uya.n("image/raw");
        a87Var.C = ex3.i;
        b87 b87Var2 = new b87(a87Var);
        if (((f58) this.b).e && Build.VERSION.SDK_INT >= 34 && bitmap.hasGainmap()) {
            a87 a87VarA = b87Var2.a();
            a87VarA.m = uya.n("image/jpeg_r");
            b87Var = new b87(a87VarA);
        } else {
            b87Var = b87Var2;
        }
        try {
            ((f58) this.b).d.e(2, b87Var2);
            ((f58) this.b).f.submit(new d86(this, bitmap, b87Var, 8));
        } catch (RuntimeException e) {
            ((f58) this.b).d.b(ExportException.a(1000, e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    @Override // defpackage.az4
    public boolean c(bz4 bz4Var, long j) {
        boolean z;
        ArrayList arrayList = (ArrayList) this.b;
        long j2 = bz4Var.b;
        lvb.R(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = bz4Var.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((bz4) arrayList.get(size)).b) {
                arrayList.add(size + 1, bz4Var);
                return z;
            }
            if (((bz4) arrayList.get(size)).b <= j) {
                z = false;
            }
        }
        arrayList.add(0, bz4Var);
        return z;
    }

    @Override // defpackage.az4
    public void clear() {
        ((ArrayList) this.b).clear();
    }

    @Override // defpackage.oca
    public void f(yba ybaVar, boolean z) {
        if (ybaVar instanceof g7h) {
            ((g7h) ybaVar).z.l().d(false);
        }
        oca ocaVar = ((m8) this.b).e;
        if (ocaVar != null) {
            ocaVar.f(ybaVar, z);
        }
    }

    @Override // defpackage.p52
    public void h(fu1 fu1Var) {
        s22 s22Var = ((w22) this.b).t1;
        if (s22Var != null) {
            ((px1) s22Var).h(fu1Var);
        }
    }

    @Override // defpackage.p52
    public void i(fu1 fu1Var, Point point) {
        fu1 fu1Var2;
        s22 s22Var;
        w22 w22Var = (w22) this.b;
        qgc qgcVar = w22Var.r1;
        if (qgcVar == null || (fu1Var2 = qgcVar.c) == null || (s22Var = w22Var.t1) == null) {
            return;
        }
        CallScreen callScreen = ((px1) s22Var).a;
        l6m l6mVar = CallScreen.D1;
        callScreen.R1().R(fu1Var2, null);
    }

    @Override // defpackage.wsf
    public void j(long j, boolean z) {
        ProfileReactionsSettingsScreen profileReactionsSettingsScreen = (ProfileReactionsSettingsScreen) this.b;
        zv8[] zv8VarArr = ProfileReactionsSettingsScreen.p;
        jtd jtdVarP1 = profileReactionsSettingsScreen.p1();
        mjg mjgVar = jtdVarP1.n;
        Object value = mjgVar.getValue();
        la3 la3Var = value instanceof la3 ? (la3) value : null;
        la3 la3VarA = la3Var != null ? la3.a(la3Var, z, 0, null, false, false, 254) : null;
        mjgVar.setValue(la3VarA != null ? la3.a(la3VarA, false, 0, null, false, jtdVarP1.D(la3VarA), 223) : null);
    }

    @Override // defpackage.az4
    public c98 k(long j) {
        int iA = A(j);
        if (iA == 0) {
            a98 a98Var = c98.b;
            return ghe.e;
        }
        bz4 bz4Var = (bz4) ((ArrayList) this.b).get(iA - 1);
        long j2 = bz4Var.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return bz4Var.a;
        }
        a98 a98Var2 = c98.b;
        return ghe.e;
    }

    @Override // defpackage.az4
    public long l(long j) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty() || j < ((bz4) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((bz4) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                bz4 bz4Var = (bz4) arrayList.get(i - 1);
                long j3 = bz4Var.d;
                return (j3 == -9223372036854775807L || j3 > j) ? bz4Var.b : j3;
            }
        }
        bz4 bz4Var2 = (bz4) np4.n(arrayList);
        long j4 = bz4Var2.d;
        return (j4 == -9223372036854775807L || j < j4) ? bz4Var2.b : j4;
    }

    @Override // defpackage.oca
    public boolean m(yba ybaVar) {
        m8 m8Var = (m8) this.b;
        if (ybaVar == m8Var.c) {
            return false;
        }
        ((g7h) ybaVar).A.getClass();
        oca ocaVar = m8Var.e;
        if (ocaVar != null) {
            return ocaVar.m(ybaVar);
        }
        return false;
    }

    @Override // defpackage.p52
    public void n(fu1 fu1Var) {
        s22 s22Var = ((w22) this.b).t1;
        if (s22Var != null) {
            CallScreen callScreen = ((px1) s22Var).a;
            l6m l6mVar = CallScreen.D1;
            callScreen.R1().g.g(fu1Var);
        }
    }

    @Override // defpackage.az4
    public long o(long j) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((bz4) arrayList.get(0)).b) {
            return ((bz4) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            bz4 bz4Var = (bz4) arrayList.get(i);
            long j2 = bz4Var.b;
            long j3 = bz4Var.b;
            if (j < j2) {
                long j4 = ((bz4) arrayList.get(i - 1)).d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((bz4) np4.n(arrayList)).d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // defpackage.g1d
    public void onDestroy() {
        ((hk6) this.b).d();
    }

    @Override // defpackage.f7e
    public void onDismiss() {
        MessagesSettingsScreen messagesSettingsScreen = (MessagesSettingsScreen) this.b;
        View view = messagesSettingsScreen.n;
        if (view != null) {
            view.setClickable(false);
        }
        View view2 = messagesSettingsScreen.getView();
        if (view2 != null) {
            view2.postDelayed(new rda(3, messagesSettingsScreen), 300L);
        }
        messagesSettingsScreen.o1().setVisibility(8);
    }

    @Override // defpackage.jg7
    public void onFailure(Throwable th) {
        ((f58) this.b).d.b(ExportException.a(2000, th));
    }

    @Override // defpackage.aqg
    public vpg p(ViewGroup viewGroup) {
        return new u83(new TextView(viewGroup.getContext()));
    }

    @Override // defpackage.op5
    public void q() {
        BaseVideoViewerWidget baseVideoViewerWidget = (BaseVideoViewerWidget) this.b;
        zv8[] zv8VarArr = BaseVideoViewerWidget.j;
        a6j a6jVarQ1 = baseVideoViewerWidget.q1();
        if (a6jVarQ1 != null) {
            a6jVarQ1.y0();
        }
    }

    @Override // defpackage.op5
    public void r(long j) {
        BaseVideoViewerWidget baseVideoViewerWidget = (BaseVideoViewerWidget) this.b;
        zv8[] zv8VarArr = BaseVideoViewerWidget.j;
        a6j a6jVarQ1 = baseVideoViewerWidget.q1();
        if (a6jVarQ1 != null) {
            a6jVarQ1.I0(j);
        }
    }

    @Override // defpackage.ds7
    public String readLine() {
        return ((BufferedReader) this.b).readLine();
    }

    @Override // defpackage.wsf
    public void s(long j) {
    }

    @Override // defpackage.ds7
    public long skip(long j) {
        return ((BufferedReader) this.b).skip(j);
    }

    @Override // defpackage.z4a
    public boolean t(MediaPlayer mediaPlayer, Context context) {
        try {
            mediaPlayer.setDataSource((String) this.b);
            return true;
        } catch (IOException e) {
            gm0.X("SettingRingtoneViewModel", e, e.getMessage(), new Object[0]);
            return false;
        } catch (IllegalStateException e2) {
            gm0.X("SettingRingtoneViewModel", new MediaSource$SoundConfigException(e2), e2.getMessage(), new Object[0]);
            return false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 28:
                return c0a.k(((long[]) this.b).length, "Subject{organizationIds=", "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.p52
    public void u(fu1 fu1Var) {
        s22 s22Var = ((w22) this.b).t1;
        if (s22Var != null) {
            CallScreen callScreen = ((px1) s22Var).a;
            l6m l6mVar = CallScreen.D1;
            h02 h02VarR1 = callScreen.R1();
            ao1 ao1VarK = h02VarR1.K();
            Map map = (Map) h02VarR1.v.getValue();
            boolean z = ao1VarK.h;
            boolean z2 = ao1VarK.n;
            w82 w82Var = h02VarR1.e;
            fu1 fu1Var2 = ((l9) w82Var.r.a.getValue()).e.c;
            Object obj = null;
            if (z) {
                fu1Var2 = null;
            } else if (z2) {
                for (Object obj2 : map.keySet()) {
                    if (!cqk.d((fu1) obj2, fu1Var2)) {
                        obj = obj2;
                        break;
                    }
                }
                fu1Var2 = (fu1) obj;
            }
            w82Var.h(fu1Var2);
        }
    }

    @Override // defpackage.igg
    public hgg v() {
        return (ku8) this.b;
    }

    @Override // defpackage.p52
    public void w() {
        s22 s22Var = ((w22) this.b).t1;
        if (s22Var != null) {
            CallScreen callScreen = ((px1) s22Var).a;
            l6m l6mVar = CallScreen.D1;
            callScreen.R1().g.i();
        }
    }

    @Override // defpackage.az4
    public void x(long j) {
        ArrayList arrayList = (ArrayList) this.b;
        int iA = A(j);
        if (iA == 0) {
            return;
        }
        long j2 = ((bz4) arrayList.get(iA - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iA--;
        }
        arrayList.subList(0, iA).clear();
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0297  */
    public void y(int i, int i2, kj6 kj6Var) throws ParserException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        to9 to9Var = (to9) this.b;
        jrc jrcVar = to9Var.b;
        SparseArray sparseArray = to9Var.c;
        nmc nmcVar = to9Var.k;
        nmc nmcVar2 = to9Var.i;
        int i14 = 2;
        int i15 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (to9Var.n1 != 2) {
                    return;
                }
                so9 so9Var = (so9) sparseArray.get(to9Var.t1);
                int i16 = to9Var.w1;
                nmc nmcVar3 = to9Var.p;
                if (i16 != 4 || !"V_VP9".equals(so9Var.c)) {
                    kj6Var.E(i2);
                    return;
                } else {
                    nmcVar3.K(i2);
                    kj6Var.readFully(nmcVar3.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                to9Var.c(i);
                so9 so9Var2 = to9Var.y;
                int i17 = so9Var2.h;
                if (i17 != 1685485123 && i17 != 1685480259) {
                    kj6Var.E(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                so9Var2.P = bArr;
                kj6Var.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                to9Var.c(i);
                byte[] bArr2 = new byte[i2];
                to9Var.y.j = bArr2;
                kj6Var.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                kj6Var.readFully(bArr3, 0, i2);
                to9Var.c(i);
                to9Var.y.k = new jyh(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                Arrays.fill(nmcVar.a, (byte) 0);
                kj6Var.readFully(nmcVar.a, 4 - i2, i2);
                nmcVar.N(0);
                to9Var.A = (int) nmcVar.C();
                return;
            }
            if (i == 25506) {
                to9Var.c(i);
                byte[] bArr4 = new byte[i2];
                to9Var.y.l = bArr4;
                kj6Var.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw ParserException.a(null, "Unexpected id: " + i);
            }
            to9Var.c(i);
            byte[] bArr5 = new byte[i2];
            to9Var.y.x = bArr5;
            kj6Var.readFully(bArr5, 0, i2);
            return;
        }
        int i18 = 8;
        if (to9Var.n1 == 0) {
            to9Var.t1 = (int) jrcVar.w(kj6Var, false, true, 8);
            to9Var.u1 = jrcVar.c;
            to9Var.p1 = -9223372036854775807L;
            to9Var.n1 = 1;
            nmcVar2.K(0);
        }
        so9 so9Var3 = (so9) sparseArray.get(to9Var.t1);
        if (so9Var3 == null) {
            kj6Var.E(i2 - to9Var.u1);
            to9Var.n1 = 0;
            return;
        }
        so9Var3.a0.getClass();
        if (to9Var.n1 == 1) {
            to9Var.h(kj6Var, 3);
            int i19 = (nmcVar2.a[2] & 6) >> 1;
            if (i19 == 0) {
                to9Var.r1 = 1;
                int[] iArr2 = to9Var.s1;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                to9Var.s1 = iArr2;
                iArr2[0] = (i2 - to9Var.u1) - 3;
            } else {
                to9Var.h(kj6Var, 4);
                int i20 = (nmcVar2.a[3] & 255) + 1;
                to9Var.r1 = i20;
                int[] iArr3 = to9Var.s1;
                if (iArr3 == null) {
                    iArr3 = new int[i20];
                    i3 = 4;
                } else {
                    i3 = 4;
                    if (iArr3.length < i20) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i20)];
                    }
                }
                to9Var.s1 = iArr3;
                if (i19 == 2) {
                    int i21 = (i2 - to9Var.u1) - 4;
                    int i22 = to9Var.r1;
                    Arrays.fill(iArr3, 0, i22, i21 / i22);
                } else {
                    if (i19 == 1) {
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = i3;
                        while (true) {
                            i10 = to9Var.r1 - 1;
                            iArr = to9Var.s1;
                            if (i23 >= i10) {
                                break;
                            }
                            iArr[i23] = 0;
                            while (true) {
                                i11 = i25 + 1;
                                to9Var.h(kj6Var, i11);
                                int i26 = nmcVar2.a[i25] & 255;
                                int[] iArr4 = to9Var.s1;
                                i12 = iArr4[i23] + i26;
                                iArr4[i23] = i12;
                                if (i26 != 255) {
                                    break;
                                } else {
                                    i25 = i11;
                                }
                            }
                            i24 += i12;
                            i23++;
                            i25 = i11;
                        }
                        iArr[i10] = ((i2 - to9Var.u1) - i25) - i24;
                    } else {
                        if (i19 != 3) {
                            throw ParserException.a(null, "Unexpected lacing value: " + i19);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = i3;
                        while (true) {
                            int i30 = to9Var.r1 - 1;
                            int[] iArr5 = to9Var.s1;
                            if (i27 >= i30) {
                                i4 = i14;
                                i5 = i15;
                                iArr5[i30] = ((i2 - to9Var.u1) - i29) - i28;
                                break;
                            }
                            iArr5[i27] = i15;
                            int i31 = i29 + 1;
                            to9Var.h(kj6Var, i31);
                            if (nmcVar2.a[i29] == 0) {
                                throw ParserException.a(null, "No valid varint length mask found");
                            }
                            int i32 = i15;
                            while (true) {
                                if (i32 >= i18) {
                                    i6 = i18;
                                    i7 = i14;
                                    i8 = i15;
                                    j = 0;
                                    i9 = i31;
                                    break;
                                }
                                i6 = i18;
                                int i33 = 1 << (7 - i32);
                                i8 = i15;
                                if ((nmcVar2.a[i29] & i33) != 0) {
                                    i9 = i31 + i32;
                                    to9Var.h(kj6Var, i9);
                                    i7 = i14;
                                    j = (~i33) & nmcVar2.a[i29] & 255;
                                    while (i31 < i9) {
                                        j = (j << i6) | ((long) (nmcVar2.a[i31] & 255));
                                        i31++;
                                    }
                                    if (i27 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i32 * 7) + 6)) - 1;
                                    break;
                                }
                                i32++;
                                i15 = i8;
                                i18 = i6;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw ParserException.a(null, "EBML lacing sample size out of range.");
                            }
                            int i34 = (int) j;
                            int[] iArr6 = to9Var.s1;
                            if (i27 != 0) {
                                i34 += iArr6[i27 - 1];
                            }
                            iArr6[i27] = i34;
                            i28 += i34;
                            i27++;
                            i29 = i9;
                            i15 = i8;
                            i18 = i6;
                            i14 = i7;
                        }
                    }
                    byte[] bArr6 = nmcVar2.a;
                    to9Var.o1 = to9Var.j((bArr6[1] & 255) | (bArr6[i5] << 8)) + to9Var.Y;
                    if (so9Var3.e != 1 || (i == 163 && (nmcVar2.a[i4] & 128) == 128)) {
                        i13 = 1;
                    } else {
                        i13 = i5;
                    }
                    to9Var.v1 = i13;
                    to9Var.n1 = i4;
                    to9Var.q1 = i5;
                }
            }
            i4 = 2;
            i5 = 0;
            byte[] bArr7 = nmcVar2.a;
            to9Var.o1 = to9Var.j((bArr7[1] & 255) | (bArr7[i5] << 8)) + to9Var.Y;
            if (so9Var3.e != 1) {
                i13 = 1;
            } else {
                i13 = 1;
            }
            to9Var.v1 = i13;
            to9Var.n1 = i4;
            to9Var.q1 = i5;
        }
        if (i == 163) {
            while (true) {
                int i35 = to9Var.q1;
                if (i35 >= to9Var.r1) {
                    to9Var.n1 = 0;
                    return;
                }
                to9Var.d(so9Var3, ((long) ((to9Var.q1 * so9Var3.f) / 1000)) + to9Var.o1, to9Var.v1, to9Var.k(kj6Var, so9Var3, to9Var.s1[i35], false), 0);
                to9Var.q1++;
            }
        } else {
            while (true) {
                int i36 = to9Var.q1;
                if (i36 >= to9Var.r1) {
                    return;
                }
                int[] iArr7 = to9Var.s1;
                iArr7[i36] = to9Var.k(kj6Var, so9Var3, iArr7[i36], true);
                to9Var.q1++;
            }
        }
    }

    public Object z() {
        return (djh) this.b;
    }

    public /* synthetic */ xva(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ xva(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
