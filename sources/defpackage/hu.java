package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.media.MediaCodecInfo;
import android.os.Trace;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.PlaybackException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import org.webrtc.NativeLibraryLoader;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hu implements ttb, u8j, NativeLibraryLoader, ygh, tg4, k74, pag, r89, la5, hch, om0, otb, btb, q5c, gv9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hu(wf wfVar, b87 b87Var, w55 w55Var) {
        this.a = 16;
        this.b = wfVar;
        this.c = b87Var;
    }

    @Override // defpackage.k74
    public Object B(h74 h74Var) {
        int i = this.a;
        Object obj = this.c;
        String str = (String) this.b;
        switch (i) {
            case 9:
                v64 v64Var = (v64) obj;
                try {
                    Trace.beginSection(str);
                    return v64Var.f.B(h74Var);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) ((g85) h74Var).a(Context.class);
                int i2 = ((eu6) obj).a;
                String strValueOf = "";
                switch (i2) {
                    case 1:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 2:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 3:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        break;
                }
                return new wh0(str, strValueOf);
        }
    }

    @Override // defpackage.pag
    public void a(int i) {
        g45 g45Var = (g45) this.b;
        m45 m45Var = (m45) this.c;
        if (g45Var.y) {
            return;
        }
        j45 j45Var = (j45) m45Var.F(i);
        f45 f45Var = g45Var.x;
        if (f45Var != null) {
            t2f t2fVar = (t2f) f45Var;
            gm0.n(t2f.n, "day = " + j45Var);
            mjg mjgVar = t2fVar.h;
            x35 x35Var = (x35) mjgVar.getValue();
            if (x35Var == null) {
                gm0.Y(t2f.class.getName(), "Early return in onDayPick cuz of _dateTime.value is null");
            } else {
                if (cqk.d(x35Var.a, j45Var)) {
                    return;
                }
                mjgVar.j(null, x35.a(x35Var, j45Var, null, null, 6));
                t2fVar.E();
            }
        }
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        qw2 qw2Var = (qw2) this.b;
        rt2 rt2Var = (rt2) this.c;
        tw2 tw2Var = (tw2) obj;
        Map mapC = tw2Var.c();
        zed zedVar = qw2Var.p;
        mapC.remove(Long.valueOf(zedVar.a.t()));
        if (rt2Var.z0()) {
            Iterator it = Collections.singletonList(Long.valueOf(zedVar.a.t())).iterator();
            while (it.hasNext()) {
                tw2Var.T.remove((Long) it.next());
            }
        }
        qw2.B(tw2Var);
        tw2Var.y = 0L;
    }

    @Override // defpackage.ygh
    public void b(ugh ughVar, int i) {
        z9c z9cVar;
        boolean z;
        String strQ;
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 3:
                b1k b1kVar = (b1k) obj2;
                aac aacVar = (aac) obj;
                if (!((List) b1kVar.b).isEmpty()) {
                    View view = ughVar.b;
                    z9cVar = view instanceof z9c ? (z9c) view : null;
                    zl1 zl1Var = (zl1) ((List) b1kVar.b).get(i);
                    owb owbVar = new owb(String.valueOf(zl1Var.a), aacVar.getContext().getString(zl1Var.b), i == aacVar.getSelectedTabPosition() ? 1 : 2, new lwb(0), null, 64);
                    if (z9cVar == null) {
                        z9c z9cVar2 = new z9c(aacVar.getContext());
                        z9cVar2.setTabItem(owbVar);
                        ughVar.b(z9cVar2);
                    } else {
                        z9cVar.setTabItem(owbVar);
                    }
                    break;
                }
                break;
            case 8:
                aac aacVar2 = (aac) obj2;
                zo7 zo7Var = (zo7) obj;
                int selectedTabPosition = aacVar2.getSelectedTabPosition();
                View view2 = ughVar.b;
                z9cVar = view2 instanceof z9c ? (z9c) view2 : null;
                i43 i43Var = (i43) ((List) zo7Var.b).get(i);
                z = i == selectedTabPosition;
                Context context = aacVar2.getContext();
                int iOrdinal = i43Var.ordinal();
                if (iOrdinal == 0) {
                    strQ = np4.q(context, R.string.profile_chat_media_tab_photo_video);
                } else if (iOrdinal == 1) {
                    strQ = np4.q(context, R.string.profile_chat_media_tab_file);
                } else if (iOrdinal == 2) {
                    strQ = np4.q(context, R.string.profile_chat_media_tab_link);
                } else if (iOrdinal != 3) {
                    ore.o();
                } else {
                    strQ = np4.q(context, R.string.profile_chat_media_tab_audio);
                }
                owb owbVar2 = new owb(String.valueOf(i43Var.ordinal()), strQ, z ? 1 : 2, null, null, 72);
                if (z9cVar == null) {
                    z9c z9cVar3 = new z9c(aacVar2.getContext());
                    z9cVar3.setTabItem(owbVar2);
                    ughVar.b(z9cVar3);
                } else {
                    z9cVar.setTabItem(owbVar2);
                }
                break;
            default:
                er3 er3Var = (er3) obj2;
                aac aacVar3 = (aac) obj;
                View view3 = ughVar.b;
                z9cVar = view3 instanceof z9c ? (z9c) view3 : null;
                vj5 vj5Var = (vj5) wj5.a.get(i);
                z = i == aacVar3.getSelectedTabPosition();
                er3Var.getClass();
                owb owbVar3 = new owb(String.valueOf(vj5Var.a), vj5Var.b, z ? 1 : 2, null, null, 120);
                if (z9cVar == null) {
                    z9c z9cVar4 = new z9c(aacVar3.getContext());
                    z9cVar4.setTabItem(owbVar3);
                    ughVar.b(z9cVar4);
                } else {
                    z9cVar.setTabItem(owbVar3);
                }
                break;
        }
    }

    @Override // defpackage.gv9
    public void c(e38 e38Var, int i) {
        int i2 = this.a;
        Object obj = this.c;
        jv9 jv9Var = (jv9) this.b;
        switch (i2) {
            case 27:
                e38Var.k(jv9Var.c, i, ((ryh) obj).c());
                break;
            default:
                e38Var.f0(jv9Var.c, i, (Surface) obj);
                break;
        }
    }

    @Override // defpackage.la5
    public int d(MediaCodecInfo mediaCodecInfo) {
        String str = (String) this.b;
        ex3 ex3Var = (ex3) this.c;
        ex3Var.getClass();
        return y86.i(mediaCodecInfo, str, ex3Var) ? 0 : Integer.MAX_VALUE;
    }

    @Override // defpackage.q5c
    public String e(String str, String str2) {
        InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) this.b;
        r5c r5cVar = (r5c) this.c;
        zv8[] zv8VarArr = InviteByPhoneScreen.p;
        vtc vtcVar = (vtc) inviteByPhoneScreen.m.getValue();
        String code = r5cVar.getCode();
        int i = ((uu4) inviteByPhoneScreen.r1().p.a.getValue()).b;
        inviteByPhoneScreen.r1().d.getClass();
        return vd7.w(vtcVar, code, str2, str, i, (str.equals("GD") || str.equals("EG") || str.equals("CN")) ? false : true);
    }

    @Override // defpackage.hch
    public void f(dj0 dj0Var) {
        fe5 fe5Var = (fe5) this.b;
        ug7 ug7Var = (((ich) this.c).c.a() && dj0Var.d) ? ug7.c : ug7.b;
        pp5 pp5Var = fe5Var.a;
        xg7.d((AtomicBoolean) pp5Var.b, true);
        xg7.c((Thread) pp5Var.d);
        if (((ug7) pp5Var.m) != ug7Var) {
            pp5Var.m = ug7Var;
            pp5Var.u(pp5Var.a);
        }
    }

    @Override // defpackage.u8j
    public void i(float f, View view) {
        y8j y8jVar = (y8j) this.b;
        vm4 vm4Var = ((mp0) this.c).v;
        boolean z = vm4Var.l() > 1;
        int iK = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int i = iK + iK2;
        float f2 = f * (-i);
        if (y8jVar.getOrientation() == 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (view instanceof r1c) {
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.setMarginEnd(0);
            } else if (!z) {
                marginLayoutParams.setMarginStart(iK2);
                marginLayoutParams.setMarginEnd(iK2);
            } else if (y8jVar.getCurrentItem() == 0) {
                marginLayoutParams.setMarginStart(iK2);
                marginLayoutParams.setMarginEnd(i);
            } else if (y8jVar.getCurrentItem() == vm4Var.l() - 1) {
                marginLayoutParams.setMarginStart(i);
                marginLayoutParams.setMarginEnd(iK2);
            }
            view.setLayoutParams(marginLayoutParams);
            if (!z) {
                f2 = 0.0f;
            } else if (yab.g0(y8jVar)) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
        }
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 11:
                ((xf) obj).t((wf) obj3, (s2d) obj2);
                break;
            case 12:
                ((xf) obj).y((wf) obj3, (lwa) obj2);
                break;
            case 13:
                ((xf) obj).T0((wf) obj3, (fzh) obj2);
                break;
            case 14:
                ((xf) obj).O((wf) obj3, (PlaybackException) obj2);
                break;
            case 15:
                k4j k4jVar = (k4j) obj2;
                ((xf) obj).G((wf) obj3, k4jVar);
                int i2 = k4jVar.a;
                break;
            case 16:
                ((xf) obj).m0((wf) obj3, (b87) obj2);
                break;
            case 17:
                ((xf) obj).D((wf) obj3, (p70) obj2);
                break;
            case 18:
                ((xf) obj).U0((wf) obj3, (Exception) obj2);
                break;
            default:
                ((j3d) obj).S((ry9) obj3, ((Integer) obj2).intValue());
                break;
        }
    }

    @Override // defpackage.otb
    public void j(Task task) {
        ((FirebaseMessagingService) this.b).a((Intent) this.c);
    }

    @Override // org.webrtc.NativeLibraryLoader
    public boolean load(String str) {
        y3e y3eVar = (y3e) this.b;
        wab wabVar = (wab) this.c;
        y3eVar.log("CallsSdk", "loading " + str);
        boolean zA = cqk.d(str, "jingle_peerconnection_so") ? wabVar.a(vab.WEBRTC) : false;
        y3eVar.log("CallsSdk", qt4.n("loading ", str, " result: ", zA));
        if (zA) {
            return true;
        }
        throw new ji1(qv1.k("failed to load ", str), 0);
    }

    @Override // defpackage.ttb
    public void onFailure(Exception exc) {
        Activity activity = (Activity) this.b;
        ku kuVar = (ku) this.c;
        sb8.P(new va(kuVar, 7), activity, (String) kuVar.a.getValue());
    }

    @Override // defpackage.btb
    public ixj s(View view, ixj ixjVar) {
        return (ixj) ((tf7) this.b).i(view, ixjVar, (Rect) this.c);
    }

    public /* synthetic */ hu(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
