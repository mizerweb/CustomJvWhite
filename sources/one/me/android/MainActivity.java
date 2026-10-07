package one.me.android;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import defpackage.a4c;
import defpackage.ac1;
import defpackage.af7;
import defpackage.ay5;
import defpackage.b95;
import defpackage.bk9;
import defpackage.bpg;
import defpackage.br4;
import defpackage.by5;
import defpackage.c7k;
import defpackage.c9b;
import defpackage.cc1;
import defpackage.cg9;
import defpackage.cqk;
import defpackage.d7c;
import defpackage.d93;
import defpackage.dk9;
import defpackage.dq4;
import defpackage.dz7;
import defpackage.e93;
import defpackage.e9i;
import defpackage.ek9;
import defpackage.et3;
import defpackage.ev1;
import defpackage.f5d;
import defpackage.f9b;
import defpackage.fab;
import defpackage.fc9;
import defpackage.fk9;
import defpackage.fte;
import defpackage.fz6;
import defpackage.g3;
import defpackage.gc9;
import defpackage.gjg;
import defpackage.gk9;
import defpackage.gm0;
import defpackage.gu4;
import defpackage.gue;
import defpackage.gvb;
import defpackage.h9c;
import defpackage.ha9;
import defpackage.hk6;
import defpackage.hk9;
import defpackage.hve;
import defpackage.i19;
import defpackage.ifh;
import defpackage.il9;
import defpackage.j3;
import defpackage.jc9;
import defpackage.je9;
import defpackage.jz;
import defpackage.k42;
import defpackage.kc9;
import defpackage.kz;
import defpackage.lfh;
import defpackage.lq4;
import defpackage.lve;
import defpackage.ma8;
import defpackage.mfh;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n30;
import defpackage.n42;
import defpackage.na8;
import defpackage.nni;
import defpackage.no3;
import defpackage.np4;
import defpackage.nqc;
import defpackage.ny8;
import defpackage.o54;
import defpackage.o83;
import defpackage.o8c;
import defpackage.oc9;
import defpackage.oj1;
import defpackage.oug;
import defpackage.owh;
import defpackage.p90;
import defpackage.pi8;
import defpackage.pm1;
import defpackage.poe;
import defpackage.q1f;
import defpackage.qm1;
import defpackage.qv1;
import defpackage.qy8;
import defpackage.qzb;
import defpackage.r07;
import defpackage.r5h;
import defpackage.r7;
import defpackage.r8e;
import defpackage.rm1;
import defpackage.roe;
import defpackage.rx8;
import defpackage.s7f;
import defpackage.sb8;
import defpackage.sgg;
import defpackage.sm1;
import defpackage.t7;
import defpackage.tgb;
import defpackage.tp2;
import defpackage.tre;
import defpackage.u03;
import defpackage.ufe;
import defpackage.vbf;
import defpackage.vjg;
import defpackage.vm1;
import defpackage.vne;
import defpackage.w09;
import defpackage.w46;
import defpackage.w8c;
import defpackage.wk8;
import defpackage.wre;
import defpackage.wsc;
import defpackage.ww3;
import defpackage.ww8;
import defpackage.wxb;
import defpackage.x5;
import defpackage.xf2;
import defpackage.xm3;
import defpackage.xx5;
import defpackage.xx6;
import defpackage.y6;
import defpackage.y73;
import defpackage.y9;
import defpackage.yab;
import defpackage.yf2;
import defpackage.ym1;
import defpackage.yx5;
import defpackage.zed;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zx5;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.main.MainScreen;
import one.me.sdk.android.tools.locale.ResourceLangException;
import one.me.sdk.arch.Widget;
import one.me.sdk.transfer.upload.exceptions.UploadUnhandledException;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.exception.IssueKeyException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends t7 implements fte, y9, il9 {
    public static final /* synthetic */ int o1 = 0;
    public hve A;
    public final boolean B;
    public ym1 C;
    public final ny8 D;
    public Intent E;
    public final w46 F;
    public final u03 G;
    public final e93 H;
    public final ny8 I;
    public Uri J;
    public sgg K;
    public final vbf X;
    public final hk9 Y;
    public final hk9 Z;
    public sgg n1;
    public final String y = MainActivity.class.getName();
    public final qzb z;

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/android/MainActivity$a;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends IssueKeyException {
        public a(Throwable th) {
            super(2, "29436", null, th);
        }
    }

    static {
        e93 e93Var = e93.i;
        Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
        e93Var.getClass();
        e93Var.C(lValueOf, q1f.b);
    }

    public MainActivity() {
        r7 r7Var = r7.a;
        qzb qzbVar = new qzb(r7.d(ha9.b));
        this.z = qzbVar;
        this.B = true;
        this.D = rx8.P(3, new bk9(this, 2));
        this.F = (w46) qzbVar.getAccessor().c(255);
        this.G = (u03) qzbVar.getAccessor().c(19);
        this.H = (e93) qzbVar.getAccessor().c(20);
        this.I = qzbVar.getAccessor().d(328);
        w09 w09VarD0 = tre.d0(this);
        vbf vbfVar = new vbf();
        vbfVar.a = w09VarD0;
        vbfVar.b = vbf.class.getName();
        this.X = vbfVar;
        this.Y = new hk9(1, this);
        this.Z = new hk9(0, this);
    }

    public static boolean z(Intent intent) {
        String action;
        if (intent != null && (action = intent.getAction()) != null && !action.equals("android.intent.action.MAIN") && !action.equals("android.intent.action.SEND") && !action.equals("android.intent.action.SEND_MULTIPLE")) {
            String stringExtra = null;
            try {
                stringExtra = intent.getStringExtra("push_action");
            } catch (BadParcelableException e) {
                gm0.V(intent.getClass().getName(), "Got error during unparcel extras!", e);
            } catch (RuntimeException e2) {
                gm0.V(intent.getClass().getName(), "Got error during unparcel extras!", e2);
            }
            if (cqk.d(stringExtra, "push_action_open_chat")) {
                return true;
            }
        }
        return false;
    }

    public final void A() throws IllegalAccessException, InvocationTargetException {
        gm0.n(this.y, "onMainScreenTabChange");
        this.X.m(x(), getWindow(), null, null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    public final void B(Boolean bool) {
        br4 br4Var;
        int i;
        RootController rootControllerC = this.z.h().c();
        if (rootControllerC.u1().a.a.size() > 0) {
            br4Var = ((lve) ww3.B1(rootControllerC.u1().e())).a;
        } else {
            lve lveVar = (lve) ww3.D1(rootControllerC.w1().e());
            br4Var = lveVar != null ? lveVar.a : null;
        }
        Widget widget = br4Var instanceof Widget ? (Widget) br4Var : null;
        int orientation = widget != null ? widget.getOrientation() : -1;
        if (orientation != 0) {
            i = 1;
            if (orientation == 1 || orientation == 8 || orientation == 9 || orientation == 11 || orientation == 12 || orientation == 14) {
                i = orientation;
            } else {
                if (bool != null ? bool.booleanValue() : ((Boolean) ((f5d) this.z.d()).w().getValue()).booleanValue()) {
                    i = 2;
                }
            }
        } else {
            i = orientation;
        }
        if (getRequestedOrientation() != i) {
            setRequestedOrientation(i);
            String name = MainActivity.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbP = qv1.p("Orientation set to ", i, " (requested=", orientation, ", landscapeEnabled=");
                sbP.append(bool);
                sbP.append(")");
                a4cVar.c(je9Var, name, sbP.toString(), null);
            }
        }
    }

    @Override // androidx.fragment.app.b, defpackage.g74, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 102 || i2 == 0) {
            return;
        }
        qzb qzbVar = this.z;
        ((n30) qzbVar.getAccessor().c(563)).b();
        sb8.o0(this, qzbVar, new h9c(new w8c(R.drawable.icon_check), np4.q(this, R.string.oneme_contact_saved_snackbar_title), null, new o8c(0, 0, 0, 15)));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    @Override // defpackage.ar, defpackage.g74, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        String strB;
        String str;
        a4c a4cVar;
        super.onConfigurationChanged(configuration);
        fc9 fc9Var = (fc9) this.I.getValue();
        je9 je9Var = je9.d;
        boolean zE = ((gue) fc9Var.c.getValue()).e();
        if (Build.VERSION.SDK_INT >= 33) {
            Locale localeD = kc9.d(configuration.getLocales());
            strB = localeD != null ? localeD.toLanguageTag() : null;
        } else {
            strB = ((jc9) fc9Var.e.getValue()).b(this);
        }
        if (strB == null) {
            gm0.V(fc9Var.a, "can't get lang from configuration", new ResourceLangException("updateLangOnConfigurationChanged didn't get lang"));
            return;
        }
        String strF = kc9.f(strB);
        List list = gc9.a;
        if (!list.contains(strB)) {
            String language = Locale.forLanguageTag(strB).getLanguage();
            if (language.length() != 0) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (cqk.d(Locale.forLanguageTag((String) it.next()).getLanguage(), language)) {
                            }
                        } else if (kc9.b(this) == null) {
                            str = fc9Var.a;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4cVar.c(je9Var, str, qv1.l("onConfigurationChanged, unsupported rawConfigLang=", strB, ", no override set, forcing ", strF), null);
                            }
                            ((jc9) fc9Var.e.getValue()).d(this, strF);
                            ((o54) fc9Var.h.getValue()).a(true);
                            fc9Var.i = true;
                        }
                    }
                } else if (kc9.b(this) == null) {
                    str = fc9Var.a;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var, str, qv1.l("onConfigurationChanged, unsupported rawConfigLang=", strB, ", no override set, forcing ", strF), null);
                    }
                    ((jc9) fc9Var.e.getValue()).d(this, strF);
                    ((o54) fc9Var.h.getValue()).a(true);
                    fc9Var.i = true;
                }
            } else if (kc9.b(this) == null) {
                str = fc9Var.a;
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, qv1.l("onConfigurationChanged, unsupported rawConfigLang=", strB, ", no override set, forcing ", strF), null);
                }
                ((jc9) fc9Var.e.getValue()).d(this, strF);
                ((o54) fc9Var.h.getValue()).a(true);
                fc9Var.i = true;
            }
        }
        boolean zL0 = r5h.L0(strF, ((s7f) ((et3) fc9Var.d.getValue())).m(), false);
        boolean z = !zL0;
        if (!zL0) {
            ((o54) fc9Var.h.getValue()).a(true);
        }
        String str2 = fc9Var.a;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, zo5.s("onConfigurationChanged, isLangChanged: ", z), null);
        }
        if (fc9Var.i || (!zL0 && !zE)) {
            ((s7f) ((et3) fc9Var.d.getValue())).F(strF);
            fc9Var.i = false;
            fc9Var.a(strF);
            ((vne) fc9Var.f.getValue()).b();
            Intent intent = new Intent("action.LOCALE_CHANGED");
            intent.setPackage(((Context) fc9Var.b.getValue()).getPackageName());
            ((Context) fc9Var.b.getValue()).sendBroadcast(intent);
            recreate();
        }
        Intent intent2 = new Intent("action.CONFIGURATION_UPDATED");
        intent2.setPackage(((Context) fc9Var.b.getValue()).getPackageName());
        ((Context) fc9Var.b.getValue()).sendBroadcast(intent2);
    }

    @Override // defpackage.t7, androidx.fragment.app.b, defpackage.g74, android.app.Activity
    public final void onCreate(Bundle bundle) {
        yx5 zx5Var;
        Intent intent;
        Intent intent2;
        je9 je9Var = je9.d;
        yab.i0((gu4) ((ifh) this.z.g()).getValue(), null, 0, new fk9(this, null, 0), 3);
        String name = MainActivity.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, zo5.l(getIntent().getData(), "@deep_link: onCreate: intent.data = "), null);
        }
        e9i.B0(getIntent());
        Intent intent3 = getIntent();
        je9 je9Var2 = je9.f;
        if (z(intent3) || !this.z.a().b()) {
            u03 u03Var = this.G;
            String str = u03Var.g;
            owh owhVar = str != null ? new owh(str) : null;
            String str2 = owhVar != null ? owhVar.a : null;
            if (str2 == null) {
                String str3 = u03Var.b;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str3, "Invoked 'cancelCollectingColdStart', but traceId is null or empty!", null);
                }
            } else {
                u03 u03Var2 = u03.i;
                ((AtomicLong) u03Var2.h.b).set(0L);
                u03Var2.g = null;
                u03Var2.f.a(new nqc(str2));
            }
        } else if (!z(intent3)) {
            e93 e93Var = this.H;
            String str4 = e93Var.g;
            owh owhVar2 = str4 != null ? new owh(str4) : null;
            String str5 = owhVar2 != null ? owhVar2.a : null;
            if (str5 == null) {
                String str6 = e93Var.b;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, str6, "Invoked 'cancelCollectingColdStart', but traceId is null or empty!", null);
                }
            } else {
                e93 e93Var2 = e93.i;
                e93Var2.f.a(new nqc(str5));
                ((AtomicLong) e93Var2.h.b).set(0L);
                e93Var2.g = null;
            }
        }
        tp2 tp2VarA = oc9.a(this);
        tp2VarA.setId(R.id.root);
        int i = Build.VERSION.SDK_INT;
        getWindow().setSoftInputMode(i >= 30 ? 48 : 16);
        setContentView(tp2VarA);
        int i2 = xx5.a;
        lfh lfhVar = lfh.b;
        mfh mfhVar = new mfh(0, 0, lfhVar);
        mfh mfhVar2 = new mfh(xx5.a, xx5.b, lfhVar);
        View decorView = getWindow().getDecorView();
        boolean zBooleanValue = ((Boolean) lfhVar.invoke(decorView.getResources())).booleanValue();
        boolean zBooleanValue2 = ((Boolean) lfhVar.invoke(decorView.getResources())).booleanValue();
        if (i >= 30) {
            zx5Var = new by5();
        } else if (i >= 29) {
            zx5Var = new ay5();
        } else {
            zx5Var = i >= 28 ? new zx5() : new yx5();
        }
        yx5 yx5Var = zx5Var;
        yx5Var.b(mfhVar, mfhVar2, getWindow(), decorView, zBooleanValue, zBooleanValue2);
        yx5Var.a(getWindow());
        super.onCreate(bundle);
        wk8.d(getWindow(), !((Boolean) ((f9b) ((nni) this.z.getAccessor().c(161)).g.getValue()).getValue()).booleanValue());
        fc9 fc9Var = (fc9) this.I.getValue();
        fc9Var.getClass();
        String strA = kc9.a(this);
        String strF = strA != null ? kc9.f(strA) : null;
        String strB = ((jc9) fc9Var.e.getValue()).b(this);
        String strM = ((s7f) ((et3) fc9Var.d.getValue())).m();
        String str7 = fc9Var.a;
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var)) {
            StringBuilder sbQ = qv1.q("check if lang correct on activity creation: ", strF, " ", strB, " ");
            sbQ.append(strM);
            a4cVar4.c(je9Var, str7, sbQ.toString(), null);
        }
        if (!cqk.d(strF, strB)) {
            ((jc9) fc9Var.e.getValue()).d(this, strB);
            ((o54) fc9Var.h.getValue()).a(true);
            if (i < 33) {
                fc9Var.i = true;
            }
            fc9Var.a(strB);
        }
        if (cqk.d(strF, strB) && !cqk.d(strM, strB)) {
            String str8 = fc9Var.a;
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                a4cVar5.c(je9Var, str8, qv1.l("prefsLang current value=", strM, " new=", strB), null);
            }
            ((s7f) ((et3) fc9Var.d.getValue())).F(strB);
        }
        hve hveVarD = p90.d(this, tp2VarA, bundle);
        hveVarD.e = 1;
        hveVarD.S(false);
        this.A = hveVarD;
        qzb qzbVar = this.z;
        qzbVar.h().g(new qy8(this, sb8.y(this), qzbVar, new x5(bundle, 21, this), bundle, 2));
        sb8.p0(this, qzbVar, null);
        B(null);
        ym1 ym1Var = (ym1) this.z.getAccessor().c(875);
        d().a(this, ym1Var.H);
        k42 k42Var = ym1Var.a;
        dq4 dq4Var = ym1Var.v;
        gm0.n("PipAppController", "CallIndicatorAppController attached");
        ym1Var.n = this;
        mjg mjgVar = ym1Var.D;
        Boolean boolValueOf = Boolean.valueOf(isInPictureInPictureMode());
        mjgVar.getClass();
        mjgVar.j(null, boolValueOf);
        j(ym1Var.E);
        yf2 yf2Var = ym1Var.I;
        yf2Var.e = this;
        i19 i19Var = this.a;
        i19Var.a((xf2) yf2Var.f);
        ym1Var.h().a((sm1) ym1Var.G.getValue());
        ym1Var.y(true);
        if (ym1Var.u) {
            i19Var.a(ym1Var.J);
        }
        n42 n42Var = (n42) k42Var;
        n42Var.a.c((rm1) ym1Var.F.getValue());
        ym1Var.d.f(ym1Var);
        ym1Var.x = e9i.j0(new fz6(((ac1) ym1Var.c).j.d, new qm1(ym1Var, null, 1), 3), dq4Var);
        ufe ufeVar = new ufe();
        ufeVar.a = getResources().getConfiguration().orientation;
        pm1 pm1Var = new pm1(ufeVar, ym1Var, this);
        registerComponentCallbacks(pm1Var);
        ym1Var.y = pm1Var;
        ym1Var.z = e9i.j0(new fz6(n42Var.f, new qm1(ym1Var, null, 0), 3), dq4Var);
        ym1Var.A = e9i.j0(new fz6(e9i.M0(((b95) ym1Var.h.getValue()).j, new vm1((lq4) null, ym1Var, 0)), new y73(ym1Var, (lq4) null, 3), 3), dq4Var);
        this.C = ym1Var;
        e9i.j0(new fz6(((cg9) this.z.getAccessor().c(619)).stream(), new gk9(this, null, 0), 3), tre.d0(this));
        this.K = u(new jz(e9i.M0(((cg9) this.z.getAccessor().c(619)).stream(), new vm1((lq4) null, this, 9)), 13), new bk9(this, 0));
        yab.i0(tre.d0(this), null, 0, new fk9(this, null, 2), 3);
        e9i.j0(new fz6(this.F.a(), new gk9(this, null, 1), 3), tre.d0(this));
        if (((f5d) this.z.d()).m() && (intent = this.E) != null && ((intent2 = getIntent()) == null || (!cqk.d(intent.getAction(), intent2.getAction()) && !cqk.d(intent.getData(), intent2.getData())))) {
            qzb qzbVar2 = this.z;
            sb8.e(sb8.y(this), qzbVar2, intent);
            qzbVar2.h().g(new wre(this, qzbVar2, intent, 29));
            sb8.p0(this, qzbVar2, intent);
        }
        this.E = null;
        wxb wxbVar = wxb.a;
        setIntent(null);
        r8e r8eVar = ((tgb) this.z.getAccessor().d(1045).getValue()).c;
        i19 i19Var2 = this.a;
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19Var2, n09Var), new kz(this, null, 1), 3), tre.d0(this));
        e9i.j0(new fz6(n1g.v(((f5d) this.z.d()).w(), this.a, n09.c), new xm3(2, this, MainActivity.class, "updateOrientation", "updateOrientation(Ljava/lang/Boolean;)V", 4, 3), 3), tre.d0(this));
        e9i.j0(new fz6(n1g.v((gjg) ((nni) this.z.getAccessor().c(161)).g.getValue(), this.a, n09Var), new dk9(this, null, 0), 3), tre.d0(this));
        this.n1 = u(e9i.R(new jz(new r07(((zed) this.z.getAccessor().c(166)).a.u(), new jz(fab.e, 13), new ek9(3, null), 0), 13), new dk9(this, null, 1)), new bk9(this, 1));
        jc9 jc9Var = (jc9) this.z.getAccessor().d(78).getValue();
        s7f s7fVar = (s7f) jc9Var.a();
        gvb gvbVar = s7fVar.b0;
        zv8[] zv8VarArr = s7f.j0;
        if (((Boolean) gvbVar.m(s7fVar, zv8VarArr[50])).booleanValue()) {
            jc9Var.d(this, ((s7f) jc9Var.a()).m());
            recreate();
            s7f s7fVar2 = (s7f) jc9Var.a();
            s7fVar2.b0.B(s7fVar2, zv8VarArr[50], Boolean.FALSE);
            try {
                File file = new File(getFilesDir(), "locale_" + ((s7f) jc9Var.a()).m());
                new File(file.getPath() + ".new");
                new File(file.getPath() + ".bak");
                file.getName();
                file.createNewFile();
            } catch (IOException e) {
                gm0.V("LocaleHelper", "resetCustomLangFlag: io exception while updating lang file", e);
            } catch (SecurityException e2) {
                gm0.V("LocaleHelper", "resetCustomLangFlag: security exception while updating lang file", e2);
            }
            ((o54) this.z.getAccessor().d(HttpStatus.SC_NOT_MODIFIED).getValue()).a(true);
        }
    }

    @Override // defpackage.ar, androidx.fragment.app.b, android.app.Activity
    public final void onDestroy() throws IllegalAccessException, InvocationTargetException {
        i19 i19Var;
        super.onDestroy();
        ym1 ym1Var = this.C;
        if (ym1Var != null) {
            gm0.n("PipAppController", "CallIndicatorAppController dettached");
            MainActivity mainActivity = ym1Var.n;
            if (mainActivity == null) {
                mainActivity = null;
            }
            if (mainActivity != null) {
                mainActivity.o(ym1Var.E);
            }
            mjg mjgVar = ym1Var.D;
            Boolean bool = Boolean.FALSE;
            mjgVar.getClass();
            mjgVar.j(null, bool);
            yf2 yf2Var = ym1Var.I;
            MainActivity mainActivity2 = (MainActivity) yf2Var.e;
            if (mainActivity2 != null && (i19Var = mainActivity2.a) != null) {
                i19Var.f((xf2) yf2Var.f);
            }
            yf2Var.e = null;
            pm1 pm1Var = ym1Var.y;
            if (pm1Var != null) {
                MainActivity mainActivity3 = ym1Var.n;
                if (mainActivity3 != null) {
                    mainActivity3.unregisterComponentCallbacks(pm1Var);
                }
                ym1Var.y = null;
            }
            ym1Var.n = null;
            hk6 hk6Var = ym1Var.b;
            hk6Var.getClass();
            gm0.n("FakePipController", "release fake pip");
            hk6Var.j.B(hk6Var, hk6.k[0], null);
            hk6Var.b().e();
            ev1 ev1Var = hk6Var.i;
            if (ev1Var == null) {
                gm0.n("FakePipController", "release fake pip skipped, no pip view");
            } else {
                try {
                    WindowManager windowManagerC = hk6Var.c();
                    if (windowManagerC != null) {
                        windowManagerC.removeView(ev1Var);
                    }
                } catch (Throwable th) {
                    gm0.V("FakePipController", "can't remove fake pip view on release", th);
                }
                hk6Var.i = null;
            }
            ym1Var.h().M((sm1) ym1Var.G.getValue());
            ((n42) ym1Var.a).a.l.remove((rm1) ym1Var.F.getValue());
            ym1Var.d.e(ym1Var);
            sgg sggVar = ym1Var.w;
            if (sggVar != null) {
                sggVar.b(null);
            }
            ym1Var.w = null;
            sgg sggVar2 = ym1Var.x;
            if (sggVar2 != null) {
                sggVar2.b(null);
            }
            ym1Var.x = null;
            sgg sggVar3 = ym1Var.z;
            if (sggVar3 != null) {
                sggVar3.b(null);
            }
            ym1Var.z = null;
            sgg sggVar4 = ym1Var.A;
            if (sggVar4 != null) {
                sggVar4.b(null);
            }
            ym1Var.A = null;
            ym1Var.v();
        }
        qzb qzbVar = this.z;
        RootController rootControllerC = qzbVar.h().c();
        hve hveVarY1 = rootControllerC.y1();
        hk9 hk9Var = this.Y;
        hveVarY1.M(hk9Var);
        rootControllerC.w1().M(hk9Var);
        hve hveVarU1 = rootControllerC.u1();
        hk9 hk9Var2 = this.Z;
        hveVarU1.M(hk9Var2);
        rootControllerC.w1().M(hk9Var2);
        ((na8) qzbVar.getAccessor().c(332)).getClass();
        ma8 ma8Var = na8.b;
        if (ma8Var != null) {
            ma8Var.a();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) throws UploadUnhandledException.ChannelOpenException {
        bpg bpgVar;
        r7 r7Var = r7.a;
        Iterator it = r7.c().values().iterator();
        while (it.hasNext()) {
            ((oj1) ((ym1) new qzb(((y6) it.next()).a).getAccessor().c(875)).g.getValue()).a(keyEvent);
        }
        oug ougVar = (oug) d7c.a.getAccessor().c(952);
        ougVar.getClass();
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && (bpgVar = ougVar.a) != null)) {
            bpgVar.invoke();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.t7, defpackage.g74, android.app.Activity
    public final void onNewIntent(Intent intent) {
        boolean zBooleanValue;
        hve hveVar;
        Object poeVar;
        je9 je9Var = je9.f;
        je9 je9Var2 = je9.e;
        String str = this.y;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var3 = je9.d;
            if (a4cVar.b(je9Var3)) {
                a4cVar.c(je9Var3, str, "@deep_link: onNewIntent: intent.data = " + intent.getData() + ", taskId=" + getTaskId() + ", flags=" + intent.getFlags(), null);
            }
        }
        e9i.B0(intent);
        if (z(intent)) {
            e93 e93Var = this.H;
            d93 d93Var = d93.PUSH;
            e93Var.getClass();
            e93Var.C(null, p90.O(Integer.valueOf(d93Var.a()), "flow"));
        }
        super.onNewIntent(intent);
        if (((f5d) this.z.d()).m() && (hveVar = this.A) != null && hveVar.n()) {
            try {
                hve hveVar2 = this.A;
                if (hveVar2 == null) {
                    hveVar2 = null;
                }
                hveVar2.j();
                RootController rootControllerC = this.z.h().c();
                String str2 = this.y;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "onNewIntent: dialogsRouter.findSiblingRouters()=".concat(ww3.z1(rootControllerC.u1().j(), ",", "[", "]", dz7.d, 24)), null);
                }
                String name = MainActivity.class.getName();
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, name, "onNewIntent: fullScreenRouter.findSiblingRouters()=".concat(ww3.z1(rootControllerC.w1().j(), ",", "[", "]", dz7.f, 24)), null);
                }
                poeVar = Boolean.TRUE;
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                gm0.V(this.y, "fail to find siblingRouters", thA);
            }
            Boolean bool = Boolean.FALSE;
            if (poeVar instanceof poe) {
                poeVar = bool;
            }
            zBooleanValue = ((Boolean) poeVar).booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (((f5d) this.z.d()).m() && (this.a.d.compareTo(n09.c) < 0 || !zBooleanValue)) {
            this.E = intent;
            String str3 = this.y;
            OnNewIntentException onNewIntentException = new OnNewIntentException(null, 1, null);
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, str3, "fail no handle onNewIntent: " + intent, onNewIntentException);
                return;
            }
            return;
        }
        this.E = null;
        if (isFinishing() || isDestroyed()) {
            String str4 = this.y;
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                a4cVar5.c(je9Var, str4, zo5.q("Skip handleOnNewIntent: activity is finishing=", ", destroyed=", isFinishing(), isDestroyed()), null);
                return;
            }
            return;
        }
        try {
            qzb qzbVar = this.z;
            sb8.e(sb8.y(this), qzbVar, intent);
            qzbVar.h().g(new wre(this, qzbVar, intent, 29));
            sb8.p0(this, qzbVar, intent);
        } catch (Exception e) {
            gm0.V(this.y, "fail to handle onNewIntent", new OnNewIntentException(e));
        }
        wxb wxbVar = wxb.a;
        setIntent(null);
    }

    @Override // defpackage.t7, androidx.fragment.app.b, android.app.Activity
    public final void onPause() {
        super.onPause();
        c9b c9bVar = pi8.a;
        Object[] objArr = c9bVar.b;
        long[] jArr = c9bVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ((vjg) objArr[(i << 3) + i3]).g = true;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.g74, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        je9 je9Var = je9.d;
        super.onPictureInPictureModeChanged(z, configuration);
        String str = this.y;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, zo5.s("onPictureInPictureModeChanged: isInPictureInPictureMode=", z), null);
        }
        ym1 ym1Var = this.C;
        if (!z) {
            if (ym1Var != null) {
                ym1Var.p();
            }
        } else if (ym1Var != null && ym1Var.q() && ym1Var.f()) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "PipAppController", zo5.q("onEnteredPip called, hasCallActive=", ", activity=", ym1Var.g(), ym1Var.n != null), null);
            }
            ym1Var.a();
        }
    }

    @Override // androidx.fragment.app.b, defpackage.g74, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (kotlin.collections.a.N0(strArr, "android.permission.READ_CONTACTS")) {
            qzb qzbVar = this.z;
            if (((wsc) qzbVar.getAccessor().c(34)).c(wsc.g)) {
                ((n30) qzbVar.getAccessor().c(563)).b();
            }
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        Uri uri = (Uri) ((Parcelable) tre.f0(bundle, "deferred_uri", Uri.class));
        if (uri != null) {
            this.J = uri;
        }
    }

    @Override // defpackage.t7, androidx.fragment.app.b, android.app.Activity
    public final void onResume() {
        ym1 ym1Var;
        super.onResume();
        ((na8) this.z.getAccessor().c(332)).getClass();
        ma8 ma8Var = na8.b;
        if (ma8Var != null) {
            ma8Var.d(new g3(17, this));
        }
        pi8.a();
        if (!isInPictureInPictureMode() && (ym1Var = this.C) != null) {
            ym1Var.p();
        }
        wxb wxbVar = wxb.a;
    }

    @Override // defpackage.g74, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Uri uri = this.J;
        if (uri != null) {
            bundle.putParcelable("deferred_uri", uri);
        }
    }

    @Override // defpackage.t7, defpackage.ar, androidx.fragment.app.b, android.app.Activity
    public final void onStart() {
        super.onStart();
        y();
    }

    @Override // defpackage.t7, defpackage.ar, androidx.fragment.app.b, android.app.Activity
    public final void onStop() {
        super.onStop();
        ((na8) this.z.getAccessor().c(332)).getClass();
        if (na8.b != null) {
            ma8.c(new ww8(9, this));
        }
    }

    @Override // defpackage.g74, android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        ym1 ym1Var = this.C;
        if (ym1Var != null) {
            ym1Var.z(true);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) throws IllegalAccessException, InvocationTargetException {
        String str = this.y;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("onWindowFocusChanged ", z), null);
            }
        }
        super.onWindowFocusChanged(z);
        if (z) {
            pi8.a();
            this.X.m(x(), getWindow(), null, null);
        }
    }

    public final sgg u(xx6 xx6Var, af7 af7Var) {
        j3 j3Var = new j3(xx6Var, 26, this);
        MainScreen.u.getClass();
        return e9i.j0(new j3(new fz6(new jz(n1g.v(new r07(j3Var, MainScreen.w, new no3(3, null, 2), 0), this.a, n09.e), 13), new o83(this, af7Var, (lq4) null, 5), 3), 14, new one.me.android.a(3, null)), tre.d0(this));
    }

    public final cc1 v() {
        return (cc1) this.D.getValue();
    }

    public final RootController w() {
        hve hveVar = this.A;
        if (hveVar == null) {
            hveVar = null;
        }
        lve lveVar = (lve) ww3.D1(hveVar.e());
        br4 br4Var = lveVar != null ? lveVar.a : null;
        RootController rootController = br4Var instanceof RootController ? (RootController) br4Var : null;
        if (rootController == null || this.A == null) {
            return null;
        }
        return rootController;
    }

    public final br4 x() {
        RootController rootControllerW = w();
        if (rootControllerW != null) {
            return rootControllerW.x1();
        }
        return null;
    }

    public final void y() {
        ((na8) this.z.getAccessor().c(332)).getClass();
        ma8 ma8Var = na8.b;
        if (ma8Var != null) {
            ma8Var.b(this, new c7k(17, this));
        }
    }
}
