package one.me.webapp.rootscreen;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import defpackage.a4c;
import defpackage.a8g;
import defpackage.a8j;
import defpackage.ahj;
import defpackage.b9b;
import defpackage.bcc;
import defpackage.bdj;
import defpackage.boj;
import defpackage.c0a;
import defpackage.d4f;
import defpackage.dnj;
import defpackage.dp4;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.e9i;
import defpackage.es8;
import defpackage.f40;
import defpackage.f9b;
import defpackage.fz6;
import defpackage.fz7;
import defpackage.ghj;
import defpackage.gm0;
import defpackage.gnj;
import defpackage.gr4;
import defpackage.ha9;
import defpackage.hnj;
import defpackage.hr4;
import defpackage.hsc;
import defpackage.ht1;
import defpackage.hzi;
import defpackage.i7j;
import defpackage.idj;
import defpackage.ioj;
import defpackage.j11;
import defpackage.j8e;
import defpackage.j95;
import defpackage.jdj;
import defpackage.je9;
import defpackage.ju6;
import defpackage.jz;
import defpackage.khb;
import defpackage.koj;
import defpackage.ks6;
import defpackage.ldf;
import defpackage.lmc;
import defpackage.loj;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.lvb;
import defpackage.lve;
import defpackage.lzf;
import defpackage.mc4;
import defpackage.meh;
import defpackage.mjg;
import defpackage.moj;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n0e;
import defpackage.n1g;
import defpackage.nni;
import defpackage.noj;
import defpackage.np0;
import defpackage.ny8;
import defpackage.o1f;
import defpackage.obb;
import defpackage.oc9;
import defpackage.occ;
import defpackage.oi8;
import defpackage.ooj;
import defpackage.ore;
import defpackage.osi;
import defpackage.owh;
import defpackage.oyf;
import defpackage.p3c;
import defpackage.p90;
import defpackage.pb7;
import defpackage.pnh;
import defpackage.poe;
import defpackage.poi;
import defpackage.poj;
import defpackage.pq3;
import defpackage.pqj;
import defpackage.pzf;
import defpackage.q1f;
import defpackage.q40;
import defpackage.q6f;
import defpackage.qoj;
import defpackage.qpj;
import defpackage.qrc;
import defpackage.qsj;
import defpackage.qt4;
import defpackage.qyj;
import defpackage.rcc;
import defpackage.rdg;
import defpackage.rej;
import defpackage.rnh;
import defpackage.roe;
import defpackage.sgg;
import defpackage.skj;
import defpackage.soh;
import defpackage.svj;
import defpackage.tre;
import defpackage.ubf;
import defpackage.unj;
import defpackage.vmj;
import defpackage.vo8;
import defpackage.vp4;
import defpackage.vt3;
import defpackage.vv;
import defpackage.wbc;
import defpackage.wmj;
import defpackage.wpj;
import defpackage.wsc;
import defpackage.xbc;
import defpackage.xc0;
import defpackage.xme;
import defpackage.xmj;
import defpackage.xnj;
import defpackage.yab;
import defpackage.ybc;
import defpackage.ycc;
import defpackage.yfj;
import defpackage.ylc;
import defpackage.ymj;
import defpackage.z8b;
import defpackage.za9;
import defpackage.zfe;
import defpackage.zmj;
import defpackage.zo5;
import defpackage.zv8;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.a;
import one.me.sdk.arch.Widget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import org.apache.http.protocol.HTTP;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0011\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBc\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u000b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lone/me/webapp/rootscreen/WebAppRootScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lmc4;", "Lvp4;", "Loyf;", "Lhsc;", "Ln0e;", "Lobb;", "Lubf;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "botId", "Lbdj;", "entryPoint", "sourceId", "", "startParam", "", "isFullScreen", "hideCloseButton", "initialTitle", "", "requestCode", "Lha9;", "localAccountId", "(JLbdj;Ljava/lang/Long;Ljava/lang/String;ZZLjava/lang/String;ILha9;)V", "web-app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WebAppRootScreen extends SwipeWidget implements mc4, vp4, oyf, hsc, n0e, obb, ubf {
    public static final /* synthetic */ zv8[] G = {new z8b(WebAppRootScreen.class, "sourceId", "getSourceId()Ljava/lang/Long;"), zo5.e(zfe.a, WebAppRootScreen.class, "botId", "getBotId()J"), new z8b(WebAppRootScreen.class, "rawEntryPoint", "getRawEntryPoint()Ljava/lang/String;"), new z8b(WebAppRootScreen.class, "startParam", "getStartParam()Ljava/lang/String;"), new z8b(WebAppRootScreen.class, "isFullscreen", "isFullscreen()Z"), new z8b(WebAppRootScreen.class, "initialTitle", "getInitialTitle()Ljava/lang/String;"), new z8b(WebAppRootScreen.class, "hideCloseButton", "getHideCloseButton()Z"), new dwd(WebAppRootScreen.class, "requestCode", "getRequestCode()I", 0), new z8b(WebAppRootScreen.class, "shareDialogJob", "getShareDialogJob()Lkotlinx/coroutines/Job;"), new dwd(WebAppRootScreen.class, "webView", "getWebView()Lone/me/sdk/uikit/common/views/ScrollTrackingWebView;", 0), new dwd(WebAppRootScreen.class, "toolbarView", "getToolbarView()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public final j8e A;
    public final xme B;
    public final j8e C;
    public Bundle D;
    public ooj E;
    public final int F;
    public final vv d;
    public final vv e;
    public final vv f;
    public final vv g;
    public final vv h;
    public final vv i;
    public final vv j;
    public final vv k;
    public final ahj l;
    public final qsj m;
    public final ny8 n;
    public final ny8 o;
    public final String p;
    public zmj q;
    public final vt3 r;
    public final ny8 s;
    public yfj t;
    public final ks6 u;
    public final ny8 v;
    public final ny8 w;
    public final ny8 x;
    public final ny8 y;
    public final p3c z;

    public WebAppRootScreen(Bundle bundle) {
        super(bundle);
        Class<Long> cls = Long.class;
        this.d = new vv("source_id", cls);
        this.e = new vv("bot_id", cls);
        Class<String> cls2 = String.class;
        this.f = new vv("entry_point", cls2);
        this.g = new vv("start_param", cls2);
        Boolean bool = Boolean.FALSE;
        this.h = new vv(Boolean.class, bool, "is_full_screen");
        this.i = new vv("initial_title", cls2);
        this.j = new vv(Boolean.class, bool, "hide_close_btn");
        int i = 0;
        this.k = new vv(Integer.class, 0, "request_code_key");
        ahj ahjVar = new ahj(m35getAccountScopeuqN4xOY());
        this.l = ahjVar;
        qsj qsjVar = (qsj) ahjVar.getAccessor().c(211);
        this.m = qsjVar;
        this.n = ahjVar.getAccessor().d(1042);
        ahjVar.a();
        this.o = ahjVar.getAccessor().d(26);
        long jF1 = F1();
        qsjVar.getClass();
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        b9bVar.k("id", Long.valueOf(jF1));
        boolean z = ycc.c;
        int i2 = 1;
        if (ycc.c) {
            b9bVar.k("warm_init", 1);
        }
        qsjVar.g = qrc.x(qsjVar, null, b9bVar, null, null, 13);
        this.p = WebAppRootScreen.class.getName();
        this.q = new zmj(this);
        this.r = new vt3(7, this);
        this.s = createViewModelLazy(ioj.class, new hzi(5, new wmj(this, i)));
        this.u = tre.E(this, new wmj(this, i2), new occ(0, this, WebAppRootScreen.class, "buildScreenParams", "buildScreenParams()Lone/me/sdk/statistics/params/Params;", 0, 16));
        this.v = ahjVar.getAccessor().d(179);
        this.w = ahjVar.getAccessor().d(34);
        this.x = ahjVar.getAccessor().d(231);
        this.y = ahjVar.getAccessor().d(82);
        this.z = qyj.S();
        this.A = viewBinding(R.id.webapp_root_webview);
        this.B = p90.M(new wmj(this, 2));
        this.C = viewBinding(R.id.webapp_root_toolbar);
        this.F = 3;
    }

    public static final void D1(WebAppRootScreen webAppRootScreen, Intent intent, wpj wpjVar) {
        Object poeVar;
        ny8 ny8Var = webAppRootScreen.v;
        String str = webAppRootScreen.p;
        byte[] bArr = wpjVar.a;
        String str2 = wpjVar.c;
        String str3 = wpjVar.b;
        if (bArr == null) {
            intent.setType(HTTP.PLAIN_TEXT_TYPE);
            return;
        }
        String str4 = str3 == null ? "file" : str3;
        int i = 0;
        File fileK = null;
        while (true) {
            if (fileK != null && !fileK.exists()) {
                break;
            }
            if (i == 100) {
                fileK = null;
                break;
            } else {
                fileK = ((ju6) ny8Var.getValue()).k(str4.concat(i > 0 ? c0a.k(i, " (", ")") : ""));
                i++;
            }
        }
        if (fileK == null) {
            gm0.n(str, "getUniqueNewFile return null");
            return;
        }
        f40 f40Var = new f40(fileK, null);
        FileOutputStream fileOutputStreamF = f40Var.f();
        if (fileOutputStreamF == null) {
            gm0.Y(f40.class.getName(), "Early return in tryWrite cuz of startWrite() is null");
        } else {
            try {
                fileOutputStreamF.write(bArr);
                f40Var.b(fileOutputStreamF);
            } catch (Throwable th) {
                f40Var.a(fileOutputStreamF);
                throw th;
            }
        }
        if (str2 == null) {
            str2 = HTTP.PLAIN_TEXT_TYPE;
        }
        try {
            intent.setType(str2);
            if (str3 != null) {
                intent.putExtra("android.intent.extra.TITLE", str3);
            }
            Uri uriI = ((ju6) ny8Var.getValue()).i(webAppRootScreen.getContext(), fileK);
            dp4.c(uriI);
            intent.putExtra("android.intent.extra.STREAM", uriI);
            poeVar = intent.addFlags(1);
        } catch (Throwable th2) {
            poeVar = new poe(th2);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(str, "appendFile", thA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    public static void N1(rcc rccVar, boolean z) {
        osi osiVar;
        int iI0 = oc9.i0(soh.e(rccVar.getTitle()));
        if (z) {
            osi osiVarA = soh.a(rccVar.getTitle());
            if ((osiVarA != null ? osiVarA.a : 0) == iI0) {
                return;
            }
        }
        if (z) {
            osi osiVarA2 = soh.a(rccVar.getTitle());
            if ((osiVarA2 != null ? osiVarA2.a : 0) != iI0) {
                osiVar = new osi(rccVar.getContext(), iI0, ldf.r);
            } else {
                osiVar = null;
            }
        } else {
            osiVar = null;
        }
        soh.d(rccVar.getTitle(), osiVar);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final boolean A1() {
        if (getView() == null) {
            return true;
        }
        return K1().d;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Integer C1() {
        return Integer.valueOf(pq3.j.e(getContext()).m().b().g);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        String[] stringArray;
        ioj iojVarJ1 = J1();
        pzf pzfVar = iojVarJ1.A1;
        if (i == 1) {
            iojVarJ1.H();
            return;
        }
        if (i == R.id.web_app_root_choose_media_bottomsheet_gallery) {
            int i2 = bundle != null ? bundle.getInt("file_chooser_mode", 0) : 0;
            if (bundle == null || (stringArray = bundle.getStringArray("android.intent.extra.MIME_TYPES")) == null) {
                stringArray = ioj.W1;
            }
            iojVarJ1.G(new hnj(i2, stringArray));
            return;
        }
        if (i != R.id.web_app_root_choose_media_bottomsheet_camera) {
            if (i == R.id.web_app_root_choose_media_bottomsheet_file_manager) {
                iojVarJ1.G(new gnj(bundle != null ? bundle.getInt("file_chooser_mode", 0) : 0));
            }
        } else {
            idj idjVar = (idj) iojVarJ1.p.getValue();
            jdj jdjVar = iojVarJ1.D;
            if (jdjVar != null) {
                idjVar.a(5, jdjVar.a, jdjVar.b, jdjVar.c, jdjVar.d);
            }
            iojVarJ1.T();
        }
    }

    public final lmc E1() {
        long j = getArgs().getLong("bot_id");
        rdg rdgVar = rdg.WEBAPP_ID;
        return j == 0 ? new lmc(null, 0, rdgVar, null, null, null, 123) : new lmc(null, 0, rdgVar, Long.valueOf(j), null, null, 115);
    }

    public final long F1() {
        zv8 zv8Var = G[1];
        return ((Number) this.e.a(this)).longValue();
    }

    public final wsc G1() {
        return (wsc) this.w.getValue();
    }

    @Override // defpackage.mc4
    public final void H(Bundle bundle) {
        Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("dialog_id")) : null;
        if (numValueOf != null && numValueOf.intValue() == 5) {
            J1().J(false);
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            J1().M(false);
        }
    }

    public final e5d H1() {
        return (e5d) this.o.getValue();
    }

    public final rcc I1() {
        return (rcc) this.C.m(this, G[10]);
    }

    public final ioj J1() {
        return (ioj) this.s.getValue();
    }

    @Override // defpackage.oyf
    public final void K() {
        qpj qpjVar = J1().M1;
        if (qpjVar != null) {
            qpjVar.a(pqj.c);
        }
    }

    public final q6f K1() {
        return (q6f) this.A.m(this, G[9]);
    }

    public final boolean L1() {
        zv8 zv8Var = G[4];
        return ((Boolean) this.h.a(this)).booleanValue();
    }

    public final void M1(boolean z) {
        Object objPrevious;
        ArrayList arrayListE = getRouter().e();
        ListIterator listIterator = arrayListE.listIterator(arrayListE.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!(((lve) objPrevious).a instanceof pb7));
        lve lveVar = (lve) objPrevious;
        Object obj = lveVar != null ? lveVar.a : null;
        pb7 pb7Var = obj instanceof pb7 ? (pb7) obj : null;
        if (pb7Var != null) {
            zv8[] zv8VarArr = G;
            zv8 zv8Var = zv8VarArr[7];
            vv vvVar = this.k;
            if (((Number) vvVar.a(this)).intValue() == 0) {
                return;
            }
            int i = z ? -1 : 0;
            zv8 zv8Var2 = zv8VarArr[7];
            pb7Var.M0(((Number) vvVar.a(this)).intValue(), i, null);
        }
    }

    public final void O1(boolean z) {
        bcc xbcVar;
        rcc rccVarI1 = I1();
        if (z) {
            xbcVar = new wbc(new vmj(this, 1));
        } else {
            zv8 zv8Var = G[6];
            xbcVar = ((Boolean) this.j.a(this)).booleanValue() ? ybc.a : new xbc(new vmj(this, 2));
        }
        rccVarI1.setLeftActions(xbcVar);
    }

    @Override // defpackage.hsc
    public final void Y0(boolean z) {
        if (z || G1().c(wsc.n)) {
            return;
        }
        J1().Q();
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("dialog_id")) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            if (i != 1) {
                return;
            }
            ioj iojVarJ1 = J1();
            pzf pzfVar = iojVarJ1.A1;
            iojVarJ1.G(new dnj(false));
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            if (i == 1) {
                J1().N(true);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                J1().N(false);
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                J1().M(false);
                return;
            } else if (!bundle.getBoolean("storage_permission", false) || ((ju6) this.v.getValue()).a()) {
                J1().M(true);
                return;
            } else {
                G1().o(new svj(this, 1));
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            if (i == 1) {
                rej rejVarC = J1().C();
                yab.i0(rejVarC.c, ((n0c) rejVarC.e()).a(), 0, new q40((lq4) null, rejVarC, true), 2);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                rej rejVarC2 = J1().C();
                yab.i0(rejVarC2.c, ((n0c) rejVarC2.e()).a(), 0, new q40((lq4) null, rejVarC2, false), 2);
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 5) {
            if (i == 1) {
                J1().J(true);
            } else {
                if (i != 2) {
                    return;
                }
                J1().J(false);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getB() {
        if (L1()) {
            return oi8.f;
        }
        return new oi8(0, 0, 0, new j11(3, 3, false), 7);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.u;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final boolean o1() {
        ioj iojVarJ1 = J1();
        if (!((Boolean) iojVarJ1.K.getValue()).booleanValue()) {
            return true;
        }
        a8j.t(iojVarJ1, null, new boj(iojVarJ1, null, 1), 3);
        return false;
    }

    @Override // defpackage.br4
    public final void onActivityResult(int i, int i2, Intent intent) {
        lq4 lq4Var = null;
        if (i == 1373) {
            if (intent == null) {
                J1().Q();
                return;
            } else {
                ioj iojVarJ1 = J1();
                a8j.t(iojVarJ1, ((n0c) iojVarJ1.D()).a(), new ht1(iojVarJ1, i2, intent, lq4Var, 19), 2);
                return;
            }
        }
        if (i != 1555) {
            return;
        }
        if (i2 != -1) {
            J1().Q();
        } else {
            ioj iojVarJ2 = J1();
            yab.i0(iojVarJ2.b, ((n0c) iojVarJ2.D()).b(), 0, new poi(iojVarJ2, intent != null ? intent.getData() : null, (lq4) null), 2);
        }
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        ltb ltbVarH = getRouter().h();
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), J1().Z);
        }
        getRouter().a(this.r);
        WeakHashMap weakHashMap = i7j.a;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new xc0(22, this));
        } else if (soh.c(I1().getTitle())) {
            N1(I1(), true);
        }
        ioj iojVarJ1 = J1();
        iojVarJ1.p1 = true;
        ny8 ny8Var = iojVarJ1.s;
        if (iojVarJ1.q1 || !((Boolean) ((f9b) ((nni) ny8Var.getValue()).g.getValue()).getValue()).booleanValue()) {
            return;
        }
        ((f9b) ((nni) ny8Var.getValue()).g.getValue()).setValue(Boolean.FALSE);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, defpackage.br4
    public final void onChangeEnded(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeEnded(gr4Var, hr4Var);
        View view = getView();
        if (view == null) {
            return;
        }
        int iOrdinal = hr4Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            boolean zL1 = L1();
            a8g a8gVar = pq3.j;
            view.setBackgroundColor(zL1 ? a8gVar.e(getContext()).m().b().c : a8gVar.e(getContext()).m().b().g);
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, one.me.sdk.arch.Widget, defpackage.br4
    public final void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeStarted(gr4Var, hr4Var);
        View view = getView();
        if (view != null && xmj.$EnumSwitchMapping$0[hr4Var.ordinal()] == 1) {
            pq3.j.e(getContext()).m();
            view.setBackgroundColor(0);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        meh mehVar = new meh(getContext());
        mehVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        vmj vmjVar = new vmj(this, 3);
        LinearLayout linearLayout = new LinearLayout(mehVar.getContext());
        linearLayout.setId(R.id.webapp_root_frame);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (!L1()) {
            lvb.I(linearLayout);
        }
        vmjVar.invoke(linearLayout);
        mehVar.addView(linearLayout);
        return mehVar;
    }

    @Override // defpackage.br4
    public final void onDestroy() throws IllegalAccessException, InvocationTargetException {
        Window window;
        WindowManager.LayoutParams attributes;
        Activity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            attributes.screenBrightness = -1.0f;
            Window window2 = activity.getWindow();
            if (window2 != null) {
                window2.setAttributes(attributes);
            }
        }
        ioj iojVarJ1 = J1();
        boolean z = iojVarJ1.o1;
        p3c p3cVar = iojVarJ1.F;
        p3c p3cVar2 = iojVarJ1.E;
        if (!z) {
            es8 es8Var = iojVarJ1.J1;
            if (es8Var != null) {
                es8Var.b(new za9());
            }
            iojVarJ1.J1 = null;
            iojVarJ1.K1 = null;
            ConcurrentHashMap concurrentHashMap = iojVarJ1.P1;
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                ((Number) entry.getKey()).longValue();
                ((es8) entry.getValue()).b(new ghj());
            }
            concurrentHashMap.clear();
            sgg sggVar = iojVarJ1.Q1;
            if (sggVar != null) {
                sggVar.b(null);
            }
            iojVarJ1.Q1 = null;
            zv8[] zv8VarArr = ioj.V1;
            vo8 vo8Var = (vo8) p3cVar2.m(iojVarJ1, zv8VarArr[0]);
            if (vo8Var != null) {
                vo8Var.b(null);
            }
            p3cVar2.B(iojVarJ1, zv8VarArr[0], null);
            vo8 vo8Var2 = (vo8) p3cVar.m(iojVarJ1, zv8VarArr[1]);
            if (vo8Var2 != null) {
                vo8Var2.b(null);
            }
            p3cVar.B(iojVarJ1, zv8VarArr[1], null);
            iojVarJ1.O1 = null;
        }
        ioj iojVarJ2 = J1();
        if (iojVarJ2.o1) {
            return;
        }
        iojVarJ2.o1 = true;
        idj idjVar = (idj) iojVarJ2.p.getValue();
        jdj jdjVar = iojVarJ2.D;
        if (jdjVar != null) {
            idjVar.a(2, jdjVar.a, jdjVar.b, jdjVar.c, jdjVar.d);
        }
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ioj iojVarJ1 = J1();
        if (iojVarJ1.F1.d()) {
            ((skj) iojVarJ1.F1.getValue()).a();
        }
        this.q = null;
        K1().removeJavascriptInterface("WebViewHandler");
        if (J1().Y) {
            K1().removeJavascriptInterface("PrivateWebViewHandler");
        }
        K1().removeJavascriptInterface("AndroidPerf");
        this.B.b = khb.k;
        this.t = null;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        super.onDetach(view);
        J1().Z.e();
        getRouter().M(this.r);
        J1().p1 = false;
    }

    @Override // defpackage.vp4
    public final void onDismiss() {
        zv8[] zv8VarArr = G;
        zv8 zv8Var = zv8VarArr[8];
        p3c p3cVar = this.z;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[8], null);
        J1().Q();
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 157) {
            if (i != 158) {
                return;
            }
            ioj iojVarJ1 = J1();
            pzf pzfVar = iojVarJ1.A1;
            iojVarJ1.G(new xnj(strArr, iArr));
            return;
        }
        for (int i2 : iArr) {
            if (i2 != -1) {
                J1().M(true);
                return;
            }
        }
        J1().M(false);
        wsc wscVarG1 = G1();
        svj svjVar = new svj(this, 1);
        wscVarG1.getClass();
        wsc.t(svjVar, strArr, iArr, R.string.oneme_request_storage_permission_title, R.string.oneme_request_storage_permission_subtitle);
    }

    @Override // defpackage.br4
    public final void onRestoreViewState(View view, Bundle bundle) {
        ooj oojVar;
        koj kojVar;
        koj nojVar;
        je9 je9Var = je9.d;
        super.onRestoreViewState(view, bundle);
        if (((Boolean) H1().D().i()).booleanValue()) {
            qoj qojVar = (qoj) ((Parcelable) tre.f0(bundle, "web_view_model_state_key", qoj.class));
            if (qojVar != null) {
                String str = qojVar.a;
                boolean z = qojVar.b;
                String str2 = qojVar.c;
                boolean z2 = qojVar.f;
                boolean z3 = qojVar.g;
                int i = poj.$EnumSwitchMapping$0[qt4.D(qojVar.d)];
                if (i != 1) {
                    if (i == 2) {
                        nojVar = new noj(qojVar.e);
                    } else {
                        if (i != 3) {
                            ore.o();
                            return;
                        }
                        kojVar = loj.a;
                    }
                    oojVar = new ooj(str, z, nojVar, str2, z2, z3);
                } else {
                    kojVar = moj.a;
                }
                nojVar = kojVar;
                oojVar = new ooj(str, z, nojVar, str2, z2, z3);
            } else {
                oojVar = null;
            }
            this.E = oojVar;
            String str3 = this.p;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str3, "onRestoreViewState: " + this.E, null);
            }
            Bundle bundle2 = bundle.getBundle("web_view_state_key");
            if (bundle2 == null) {
                return;
            }
            ioj iojVarJ1 = J1();
            String str4 = iojVarJ1.C;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str4, "restoreWebView: " + iojVarJ1.g, null);
            }
            if (iojVarJ1.g != null) {
                iojVarJ1.T1.B(iojVarJ1, ioj.V1[4], null);
            }
            this.D = bundle2;
        }
    }

    @Override // defpackage.br4
    public final void onSaveViewState(View view, Bundle bundle) {
        qoj qojVar;
        int i;
        je9 je9Var = je9.d;
        super.onSaveViewState(view, bundle);
        if (((Boolean) H1().D().i()).booleanValue()) {
            String str = this.p;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onSaveViewState", null);
            }
            Bundle bundleI = n1g.i(new ylc[0]);
            K1().saveState(bundleI);
            bundle.putBundle("web_view_state_key", bundleI);
            ioj iojVarJ1 = J1();
            String url = K1().getUrl();
            ooj oojVar = (ooj) iojVarJ1.y1.a.getValue();
            if (oojVar != null) {
                koj kojVar = oojVar.c;
                String str2 = oojVar.a;
                boolean z = oojVar.b;
                String str3 = oojVar.d;
                String str4 = str3 == null ? url : str3;
                boolean z2 = oojVar.e;
                boolean z3 = oojVar.f;
                if (kojVar.equals(loj.a)) {
                    i = 3;
                } else if (kojVar.equals(moj.a)) {
                    i = 1;
                } else {
                    if (!(kojVar instanceof noj)) {
                        ore.o();
                        return;
                    }
                    i = 2;
                }
                qojVar = new qoj(str2, z, str4, i, kojVar instanceof noj ? ((noj) kojVar).a : false, z2, z3);
            } else {
                qojVar = null;
            }
            if (qojVar == null) {
                return;
            }
            String str5 = this.p;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str5, "onSaveViewState: " + qojVar, null);
            }
            bundle.putParcelable("web_view_model_state_key", qojVar);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        String string = bundle2.getString("start_param");
        String string2 = bundle2.getString("entry_point");
        ioj iojVarJ1 = J1();
        String str = iojVarJ1.C;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.w(qt4.t(iojVarJ1.c, "reload url with new params: botId=", ", initStartParam=", iojVarJ1.f), ", newStartParam=", string), null);
            }
        }
        iojVarJ1.T1.B(iojVarJ1, ioj.V1[4], null);
        ioj.P(iojVarJ1, string, string2, 4);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        qsj qsjVar = this.m;
        String str = qsjVar.g;
        lq4 lq4Var = null;
        owh owhVar = str != null ? new owh(str) : null;
        String str2 = owhVar != null ? owhVar.a : null;
        if (str2 == null || str2.length() == 0) {
            String str3 = qsjVar.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str3, "Invoked 'webapp_init', but traceId is null or empty!", null);
                }
            }
        } else {
            qrc.k(qsjVar, "init", 0, str2, false, null, null, 120);
        }
        jz jzVar = J1().w1;
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(jzVar, getViewLifecycleOwner().f(), n09Var), new ymj(lq4Var, this, 0), i), getViewLifecycleScope());
        this.t = new yfj(requireActivity(), new fz7(1, J1(), ioj.class, "onBiometrySuccess", "onBiometrySuccess(Landroidx/biometric/BiometricPrompt$CryptoObject;)V", 0, 29), new occ(0, J1(), ioj.class, "onBiometryFail", "onBiometryFail()V", 0, 15));
        e9i.j0(new fz6(n1g.v(J1().B1, getViewLifecycleOwner().f(), n09Var), new ymj(lq4Var, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(J1().C1, getViewLifecycleOwner().f(), n09Var), new ymj(lq4Var, this, 2), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v((lzf) J1().E1.getValue(), getViewLifecycleOwner().f(), n09Var), new ymj(lq4Var, this, i), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v((lzf) J1().G1.getValue(), getViewLifecycleOwner().f(), n09Var), new ymj(lq4Var, this, 4), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(J1().x1, getViewLifecycleOwner().f(), n09Var), new ymj(lq4Var, this, 5), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(J1().I1, 13), getViewLifecycleOwner().f(), n09Var), new ymj(lq4Var, this, 6), i), getViewLifecycleScope());
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    /* JADX INFO: renamed from: q1, reason: from getter */
    public final int getF() {
        return this.F;
    }

    @Override // defpackage.n0e
    public final void s0(o1f o1fVar) {
        mjg mjgVar = J1().H1;
        mjgVar.getClass();
        mjgVar.j(null, o1fVar);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    /* JADX INFO: renamed from: s1 */
    public final boolean getX() {
        return !L1();
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void t1(float f) {
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(pq3.j.e(getContext()).m().b().g);
        }
    }

    @Override // defpackage.obb
    public final lmc u0() {
        return E1();
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void w1(float f) {
        View view = getView();
        if (view != null) {
            pq3.j.e(getContext()).m();
            view.setBackgroundColor(0);
        }
    }

    @Override // defpackage.oyf
    public final void x(int i, int i2) {
        ioj iojVarJ1 = J1();
        qpj qpjVar = iojVarJ1.M1;
        if (qpjVar != null) {
            qpjVar.a(pqj.b);
        }
        iojVarJ1.G(new unj(new pnh(R.plurals.you_sent_messages, i2), new rnh(R.plurals.to_chats, i2, a.n1(new Object[]{Integer.valueOf(i2)}))));
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void x1() {
        View view = getView();
        if (view != null) {
            pq3.j.e(getContext()).m();
            view.setBackgroundColor(0);
        }
    }

    @Override // defpackage.ubf
    public final Object z0(lq4 lq4Var) {
        return Boolean.valueOf(J1().p1 && !J1().q1);
    }

    public /* synthetic */ WebAppRootScreen(long j, bdj bdjVar, Long l, String str, boolean z, boolean z2, String str2, int i, ha9 ha9Var, int i2, j95 j95Var) {
        this(j, bdjVar, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? null : str2, (i2 & np0.m) != 0 ? 0 : i, ha9Var);
    }

    public WebAppRootScreen(long j, bdj bdjVar, Long l, String str, boolean z, boolean z2, String str2, int i, ha9 ha9Var) {
        this(n1g.i(new ylc("bot_id", Long.valueOf(j)), new ylc("entry_point", bdjVar.a), new ylc("source_id", l), new ylc("start_param", str), new ylc("is_full_screen", Boolean.valueOf(z)), new ylc("hide_close_btn", Boolean.valueOf(z2)), new ylc("initial_title", str2), new ylc("request_code_key", Integer.valueOf(i)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
