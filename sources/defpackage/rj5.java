package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import android.view.GestureDetector;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.io.File;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.mediaeditor.MediaEditScreen;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.net.ssl.tm.internal.ChainStrengthChecker$InvalidCertPkLengthException;
import one.me.sdk.net.ssl.tm.internal.ChainStrengthChecker$InvalidCertSigAlgorithmException;
import one.me.sdk.sections.SectionRecyclerWidget;
import one.me.settings.multilang.SettingsLocaleScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import one.me.stories.viewer.viewer.UserStoriesScreen;
import one.video.transcoder.exception.TranscoderException;
import one.video.transloader.task.TranscodeTask;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.rustore.sdk.metrics.MetricsException;

/* JADX INFO: loaded from: classes2.dex */
public final class rj5 implements ti, pc1, sf7, vc, aqg, yo4, rg4, b5j, f96, qbf, qsf, x15, qlg, i8c {
    public final /* synthetic */ int a;
    public Object b;

    public rj5(int i) {
        this.a = i;
        switch (i) {
            case 16:
                this.b = new ArrayList();
                break;
            case 17:
            default:
                this.b = rx8.P(2, new k82(6));
                break;
            case 18:
                this.b = new ConcurrentHashMap();
                break;
        }
    }

    @Override // defpackage.f96
    public boolean A() {
        MessagesListWidget messagesListWidget = (MessagesListWidget) this.b;
        zv8[] zv8VarArr = MessagesListWidget.T1;
        return messagesListWidget.F1().z2.a.getValue() != opa.d && ((opa) messagesListWidget.F1().y2.getValue()).b;
    }

    public void B(ArrayList arrayList) {
        r28 r28Var = (r28) this.b;
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h05 h05Var = (h05) it.next();
            arrayList2.add(new co8(iw8.i(h05Var.b).getBytes(pt2.a), h05Var.a));
        }
        ifh ifhVar = r28Var.b;
        String strX0 = s5h.x0("\n            DELETE FROM metrics_event_table\n            WHERE _id IN (\n                SELECT _id FROM metrics_event_table\n                WHERE uuid IN (" + ww3.z1(arrayList2, null, null, null, rl0.g, 31) + ")\n            )\n        ");
        try {
            ((SQLiteDatabase) ifhVar.getValue()).beginTransactionNonExclusive();
            ((SQLiteDatabase) ifhVar.getValue()).execSQL(strX0);
            ((SQLiteDatabase) ifhVar.getValue()).setTransactionSuccessful();
            ((SQLiteDatabase) ifhVar.getValue()).endTransaction();
        } catch (Throwable th) {
            try {
                throw new MetricsException.MetricsDbError("Interaction with database failed", th);
            } catch (Throwable th2) {
                ((SQLiteDatabase) ifhVar.getValue()).endTransaction();
                throw th2;
            }
        }
    }

    public void C(String str, String str2, pr6 pr6Var) {
        ((ArrayList) this.b).add(new w18(str, str2, (String) pr6Var.b, pr6Var));
    }

    public void E(String str, String str2) {
        ((ArrayList) this.b).add(new w18(str, null, null, new pr6(HTTP.PLAIN_TEXT_TYPE, 1, str2.getBytes(pt2.a))));
    }

    @Override // defpackage.x15
    public boolean F() {
        return true;
    }

    @Override // defpackage.aqg
    public Object G(int i) {
        if (i >= 0) {
            return (CharSequence) ((tc) this.b).invoke(Integer.valueOf(i));
        }
        return null;
    }

    @Override // defpackage.x15
    public long H() {
        return 0L;
    }

    public q36 I() {
        return new q36(String.format("------------%016x", Arrays.copyOf(new Object[]{Long.valueOf(i4e.b.f())}, 1)), ww3.T1((ArrayList) this.b));
    }

    @Override // defpackage.x15
    public long J(long j, long j2) {
        return 1L;
    }

    public xr6 K() {
        euc eucVar = (euc) this.b;
        String strConcat = ((Long) eucVar.b) == null ? " fileSizeLimit" : "";
        if (((Long) eucVar.c) == null) {
            strConcat = strConcat.concat(" durationLimitMillis");
        }
        if (((File) eucVar.d) == null) {
            strConcat = strConcat.concat(" file");
        }
        if (strConcat.isEmpty()) {
            return new xr6(new nh0(((Long) eucVar.b).longValue(), ((Long) eucVar.c).longValue(), (File) eucVar.d));
        }
        ore.k("Missing required properties:".concat(strConcat));
        return null;
    }

    public fi9 L(String str) {
        str.getClass();
        Object objComputeIfAbsent = ((ConcurrentHashMap) this.b).computeIfAbsent(str, new am(12, new x27(18)));
        objComputeIfAbsent.getClass();
        return (fi9) objComputeIfAbsent;
    }

    @Override // defpackage.qlg
    public void M(tlg tlgVar) {
        wmg wmgVar = (wmg) this.b;
        switch (wmgVar.a) {
            case 0:
                ((zw8) ((nj1) wmgVar.b).h).c(tlgVar);
                break;
            default:
                vog vogVar = ((bog) wmgVar.b).h;
                vogVar.getClass();
                tog togVar = tog.b;
                long j = tlgVar.a;
                StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) vogVar.a;
                zv8[] zv8VarArr = StickersShowcaseScreen.m;
                vv vvVar = stickersShowcaseScreen.a;
                zv8 zv8Var = StickersShowcaseScreen.m[0];
                long jLongValue = ((Number) vvVar.a(stickersShowcaseScreen)).longValue();
                o65 o65VarB = togVar.b();
                StringBuilder sbS = qt4.s(j, ":stickers/preview?sticker_id=", "&chat_id=");
                sbS.append(jLongValue);
                o65.c(o65VarB, sbS.toString(), null, null, 6);
                break;
        }
    }

    public void N(X509Certificate x509Certificate) throws ChainStrengthChecker$InvalidCertSigAlgorithmException, ChainStrengthChecker$InvalidCertPkLengthException {
        PublicKey publicKey = x509Certificate.getPublicKey();
        if (publicKey instanceof RSAPublicKey) {
            if (((RSAPublicKey) publicKey).getModulus().bitLength() < 1024) {
                throw new ChainStrengthChecker$InvalidCertPkLengthException("RSA modulus is < 1024 bits");
            }
        } else if (publicKey instanceof ECPublicKey) {
            if (((ECPublicKey) publicKey).getParams().getCurve().getField().getFieldSize() < 160) {
                throw new ChainStrengthChecker$InvalidCertPkLengthException("EC key field size is < 160 bits");
            }
        } else {
            if (!(publicKey instanceof DSAPublicKey)) {
                throw new ChainStrengthChecker$InvalidCertPkLengthException("Rejecting unknown key class ".concat(publicKey.getClass().getName()));
            }
            DSAParams params = ((DSAPublicKey) publicKey).getParams();
            int iBitLength = params.getP().bitLength();
            int iBitLength2 = params.getQ().bitLength();
            if (iBitLength < 1024 || iBitLength2 < 160) {
                throw new ChainStrengthChecker$InvalidCertPkLengthException("DSA key length is < (1024, 160) bits");
            }
        }
        String sigAlgOID = x509Certificate.getSigAlgOID();
        if (a.N0((String[]) ((ny8) this.b).getValue(), sigAlgOID)) {
            throw new ChainStrengthChecker$InvalidCertSigAlgorithmException(qv1.k("Signature uses an insecure hash function: ", sigAlgOID));
        }
    }

    public void O(TranscoderException transcoderException) {
        TranscodeTask transcodeTask = (TranscodeTask) this.b;
        boolean zB = transcodeTask.b();
        ze9 ze9Var = transcodeTask.a;
        if (zB) {
            ze9Var.s("TranscodeTask", new g0i(transcodeTask, 0), new bpg(17, transcoderException));
            return;
        }
        ze9Var.r("TranscodeTask", new yvg(18), new bpg(17, transcoderException));
        transcodeTask.i = null;
        transcodeTask.c(new b0i(transcoderException));
    }

    public void P() {
        ((ConcurrentHashMap) this.b).clear();
    }

    @Override // defpackage.aqg
    public void R(vpg vpgVar, int i) {
        ((co3) vpgVar).d.setText((CharSequence) G(i));
    }

    @Override // defpackage.qlg
    public void T(tlg tlgVar) {
        wmg wmgVar = (wmg) this.b;
        switch (wmgVar.a) {
            case 0:
                ((zw8) ((nj1) wmgVar.b).h).b(tlgVar);
                break;
            default:
                StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) ((bog) wmgVar.b).h.a;
                g4b g4bVarJ = ((h4b) stickersShowcaseScreen.d.getValue()).J(9);
                zog zogVarP1 = stickersShowcaseScreen.p1();
                long j = zogVarP1.c;
                if (j <= 0) {
                    ((h4b) zogVarP1.i.getValue()).B(f4b.EMPTY_CHAT, g4bVarJ);
                } else {
                    ae9.k((ae9) zogVarP1.k.getValue(), "sticker", "send_sticker", ouk.a(new ylc("screen", "showcase_webapp")), 8);
                    vkf vkfVar = new vkf(1, j, tlgVar.a);
                    vkfVar.g = g4bVarJ;
                    ((wzj) zogVarP1.h.getValue()).c(new wkf(vkfVar, (byte) 0));
                    a8j.x(zogVarP1.m, rt3.b);
                }
                ia8 ia8Var = (ia8) stickersShowcaseScreen.b.getAccessor().f();
                if (ia8Var != null) {
                    ia8Var.f(a.p1(new ha8[]{new ha8(fa8.SEND_5_MESSAGES, 1), new ha8(fa8.SEND_3_STICKERS, 1)}), y3f.CHAT);
                }
                break;
        }
    }

    @Override // defpackage.yo4
    public ContentInfo a() {
        return (ContentInfo) this.b;
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        oq8 oq8Var = (oq8) this.b;
        String str = ((ConversationParams) obj).id;
        if (str != null) {
            lml.c(oq8Var.j, str);
        }
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        String str = ((ll7) obj).a;
        if (str == null) {
            return new p64(3, new yi1());
        }
        js6 js6Var = (js6) this.b;
        return v7g.e(new xi1(js6Var, Uri.parse(str).buildUpon().appendQueryParameter("size", String.valueOf(js6Var.a.length())).build().toString()));
    }

    @Override // defpackage.x15
    public long b(long j) {
        return 0L;
    }

    @Override // defpackage.qsf
    public void c(long j) {
        String str = ((SettingsLocaleScreen) this.b).a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "onSettingsItemClick, id: "), null);
            }
        }
        SettingsLocaleScreen.o1((SettingsLocaleScreen) this.b, j);
    }

    @Override // defpackage.x15
    public long d(long j, long j2) {
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d0 A[RETURN] */
    @Override // defpackage.qbf
    public int e(int i) {
        Integer num;
        SectionRecyclerWidget sectionRecyclerWidget = (SectionRecyclerWidget) this.b;
        nee adapter = sectionRecyclerWidget.p1().getAdapter();
        if (adapter == null || i >= adapter.l() || i < 0) {
            return 0;
        }
        r84 r84Var = adapter instanceof r84 ? (r84) adapter : null;
        if (r84Var != null) {
            Pair pairG = r84Var.G(i);
            if (!cqk.d(pairG.first, sectionRecyclerWidget.getH())) {
                pairG = null;
            }
            if (pairG != null && (num = (Integer) pairG.second) != null) {
                i = num.intValue();
            } else if (!adapter.equals(sectionRecyclerWidget.getH())) {
                return 0;
            }
        } else if (!adapter.equals(sectionRecyclerWidget.getH())) {
            return 0;
        }
        Integer numValueOf = i <= 0 ? null : Integer.valueOf(((psf) sectionRecyclerWidget.getH().d.f.get(i - 1)).A());
        int iA = ((psf) sectionRecyclerWidget.getH().d.f.get(i)).A();
        Integer numValueOf2 = i != sectionRecyclerWidget.getH().d.f.size() - 1 ? Integer.valueOf(((psf) sectionRecyclerWidget.getH().d.f.get(i + 1)).A()) : null;
        if ((numValueOf == null || numValueOf.intValue() != iA) && (numValueOf2 == null || iA != numValueOf2.intValue())) {
            return 4;
        }
        if (numValueOf != null && numValueOf.intValue() == iA) {
            return (numValueOf2 != null && iA == numValueOf2.intValue()) ? 2 : 3;
        }
        return 1;
    }

    @Override // defpackage.f96
    public boolean f() {
        MessagesListWidget messagesListWidget = (MessagesListWidget) this.b;
        zv8[] zv8VarArr = MessagesListWidget.T1;
        return messagesListWidget.F1().z2.a.getValue() != opa.d && ((opa) messagesListWidget.F1().y2.getValue()).c;
    }

    @Override // defpackage.x15
    public long g(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.yo4
    public Bundle getExtras() {
        return ((ContentInfo) this.b).getExtras();
    }

    @Override // defpackage.yo4
    public int getFlags() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // defpackage.b5j
    public void h(int i) {
        MediaEditScreen mediaEditScreen = (MediaEditScreen) this.b;
        int iD = qt4.D(i);
        if (iD != 0) {
            if (iD != 1 && iD != 2) {
                if (iD != 3) {
                    ore.o();
                    return;
                } else {
                    zv8[] zv8VarArr = MediaEditScreen.w1;
                    a8j.x(mediaEditScreen.a2().A1, vw9.a);
                    return;
                }
            }
            zv8[] zv8VarArr2 = MediaEditScreen.w1;
            lx9 lx9VarA2 = mediaEditScreen.a2();
            a8j.x(lx9VarA2.A1, vw9.b);
            lx9VarA2.t1.B(lx9VarA2, lx9.F1[4], yab.h0(lx9VarA2.b, ((n0c) lx9VarA2.H()).a(), 2, new ax9(lx9VarA2, null, 2)));
        }
    }

    @Override // defpackage.x15
    public long i(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.x15
    public l4e j(long j) {
        return (l4e) this.b;
    }

    @Override // defpackage.b5j
    public void k(float f) {
        MediaEditScreen mediaEditScreen = (MediaEditScreen) this.b;
        zv8[] zv8VarArr = MediaEditScreen.w1;
        a8j.x(mediaEditScreen.a2().A1, new tw9(f));
    }

    @Override // defpackage.qsf
    public void l(long j, boolean z) {
        je9 je9Var = je9.d;
        String str = ((SettingsLocaleScreen) this.b).a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, zo5.j(j, "onSwitchClick, id: "), null);
        }
        if (z) {
            String str2 = ((SettingsLocaleScreen) this.b).a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, zo5.j(j, "onSwitchClick, checked, id: "), null);
            }
            SettingsLocaleScreen.o1((SettingsLocaleScreen) this.b, j);
        }
    }

    @Override // defpackage.b5j
    public void m(int i, float f) {
        MediaEditScreen mediaEditScreen = (MediaEditScreen) this.b;
        int iD = qt4.D(i);
        if (iD != 0) {
            if (iD == 1 || iD == 2) {
                zv8[] zv8VarArr = MediaEditScreen.w1;
                a8j.x(mediaEditScreen.a2().A1, vw9.c);
            } else if (iD != 3) {
                ore.o();
            } else {
                zv8[] zv8VarArr2 = MediaEditScreen.w1;
                a8j.x(mediaEditScreen.a2().A1, new uw9(f));
            }
        }
    }

    @Override // defpackage.x15
    public long n(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.f96
    public void o() {
        MessagesListWidget messagesListWidget = (MessagesListWidget) this.b;
        zv8[] zv8VarArr = MessagesListWidget.T1;
        jsa jsaVarF1 = messagesListWidget.F1();
        if (jcd.d(jsaVarF1.e0(), null, (rt2) jsaVarF1.w2.a.getValue(), 1)) {
            return;
        }
        jsaVarF1.Z().v();
    }

    @Override // defpackage.aqg
    public vpg p(ViewGroup viewGroup) {
        return new co3(new TextView(viewGroup.getContext()));
    }

    @Override // defpackage.yo4
    public int q() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // defpackage.yo4
    public ClipData r() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.x15
    public long s(long j) {
        return 1L;
    }

    @Override // defpackage.yo4
    public Uri t() {
        return ((ContentInfo) this.b).getLinkUri();
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ResolvedFeatureGroup(features=" + ((LinkedHashSet) this.b) + ')';
            case 11:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.vc
    public void u(fu1 fu1Var, boolean z) {
        CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) this.b;
        zv8[] zv8VarArr = CallOpponentsListWidget.v;
        ((ya1) ((da1) callOpponentsListWidget.p1().j.getValue())).e(fu1Var, z);
    }

    @Override // defpackage.f96
    public void v() {
        MessagesListWidget messagesListWidget = (MessagesListWidget) this.b;
        zv8[] zv8VarArr = MessagesListWidget.T1;
        jsa jsaVarF1 = messagesListWidget.F1();
        if (jcd.d(jsaVarF1.e0(), null, (rt2) jsaVarF1.w2.a.getValue(), 1)) {
            return;
        }
        jsaVarF1.Z().y();
    }

    @Override // defpackage.i8c
    public void w(j8c j8cVar) {
        if (j8cVar == j8c.e) {
            UserStoriesScreen userStoriesScreen = (UserStoriesScreen) this.b;
            zv8[] zv8VarArr = UserStoriesScreen.x1;
            userStoriesScreen.H1().C();
        }
    }

    @Override // defpackage.ti
    public si x(gj gjVar, Rect rect) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.b;
        if (animatedFactoryV2Impl.g == null) {
            animatedFactoryV2Impl.g = new ou7(15);
        }
        return new si(animatedFactoryV2Impl.g, gjVar, rect, animatedFactoryV2Impl.d);
    }

    @Override // defpackage.b5j
    public void y(float f, float f2) {
        MediaEditScreen mediaEditScreen = (MediaEditScreen) this.b;
        zv8[] zv8VarArr = MediaEditScreen.w1;
        lx9 lx9VarA2 = mediaEditScreen.a2();
        mjg mjgVar = lx9VarA2.J;
        Float fValueOf = Float.valueOf(f);
        mjgVar.getClass();
        mjgVar.j(null, fValueOf);
        mjg mjgVar2 = lx9VarA2.X;
        Float fValueOf2 = Float.valueOf(f2);
        mjgVar2.getClass();
        mjgVar2.j(null, fValueOf2);
    }

    @Override // defpackage.vc
    public void z() {
        cs1 cs1Var = cs1.b;
        cs1Var.getClass();
        o65.c(cs1Var.b(), ":call-admin-waiting-room", null, null, 6);
    }

    public /* synthetic */ rj5(int i, boolean z) {
        this.a = i;
    }

    public rj5(r28 r28Var, nv8 nv8Var, px8 px8Var, px8 px8Var2) {
        this.a = 21;
        this.b = r28Var;
    }

    public rj5(m38 m38Var) {
        this.a = 4;
        yab.s(m38Var);
        this.b = m38Var;
    }

    public /* synthetic */ rj5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public rj5(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 15;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public rj5(File file) {
        this.a = 14;
        euc eucVar = new euc(2, false);
        eucVar.b = 0L;
        eucVar.c = 0L;
        this.b = eucVar;
        eucVar.d = file;
    }

    public rj5(ContentInfo contentInfo) {
        this.a = 11;
        contentInfo.getClass();
        this.b = f82.C(contentInfo);
    }
}
