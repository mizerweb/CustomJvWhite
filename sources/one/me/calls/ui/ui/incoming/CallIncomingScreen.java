package one.me.calls.ui.ui.incoming;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a4c;
import defpackage.b95;
import defpackage.c52;
import defpackage.chb;
import defpackage.cm1;
import defpackage.d52;
import defpackage.dwd;
import defpackage.dz4;
import defpackage.e9i;
import defpackage.em1;
import defpackage.ev;
import defpackage.fz6;
import defpackage.g52;
import defpackage.ga2;
import defpackage.gm0;
import defpackage.gm1;
import defpackage.h;
import defpackage.hv7;
import defpackage.i19;
import defpackage.ifh;
import defpackage.j8e;
import defpackage.jc8;
import defpackage.je9;
import defpackage.jsc;
import defpackage.k42;
import defpackage.km1;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.m02;
import defpackage.md1;
import defpackage.mjg;
import defpackage.msc;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ns4;
import defpackage.ny8;
import defpackage.o7j;
import defpackage.ou7;
import defpackage.pq3;
import defpackage.r;
import defpackage.rx8;
import defpackage.sa2;
import defpackage.sfd;
import defpackage.svj;
import defpackage.sx1;
import defpackage.ufe;
import defpackage.ve1;
import defpackage.wsc;
import defpackage.x02;
import defpackage.yk1;
import defpackage.yp9;
import defpackage.ysc;
import defpackage.z2;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lone/me/calls/ui/ui/incoming/CallIncomingScreen;", "Lone/me/sdk/arch/Widget;", "Lchb;", "Lz4f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "ou7", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallIncomingScreen extends Widget implements chb, z4f {
    public static final ou7 m;
    public static final /* synthetic */ zv8[] n;
    public final sx1 a;
    public final h b;
    public final b95 c;
    public final ny8 d;
    public final ny8 e;
    public final j8e f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final jc8 k;
    public md1 l;

    static {
        dwd dwdVar = new dwd(CallIncomingScreen.class, "avatarView", "getAvatarView()Lone/me/calls/ui/view/CallUserLargeView;", 0);
        zfe.a.getClass();
        n = new zv8[]{dwdVar};
        m = new ou7(19);
    }

    public CallIncomingScreen(Bundle bundle) {
        super(bundle);
        sx1 sx1Var = new sx1(m35getAccountScopeuqN4xOY());
        this.a = sx1Var;
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.b = hVar;
        b95 b95VarA = new ga2(2).a();
        this.c = b95VarA;
        this.d = sx1Var.getAccessor().d(852);
        this.e = createViewModelLazy(km1.class, new r(19, new z2(this, 12, bundle)));
        this.f = viewBinding(R.id.call_incoming_avatar);
        ysc yscVar = ysc.a;
        this.g = yscVar.a();
        this.h = sx1Var.getAccessor().d(236);
        this.i = rx8.P(3, new yk1(1, this));
        this.j = hVar.getAccessor().d(61);
        this.k = (jc8) sx1Var.getAccessor().c(873);
        i19 i19VarF = this.lifecycleOwner.f();
        ny8 ny8VarA = yscVar.a();
        ifh ifhVarD = hVar.getAccessor().d(61);
        String string = bundle.getString("call_incoming_session_id");
        i19VarF.a(new hv7(ny8VarA, ifhVarD, this, b95VarA, string == null ? "" : string, (k42) hVar.getAccessor().d(66).getValue(), sx1Var.getAccessor().d(706), sx1Var.getAccessor().d(734)));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    public static final void o1(CallIncomingScreen callIncomingScreen) {
        callIncomingScreen.q1().p = true;
        b95 b95Var = callIncomingScreen.c;
        msc mscVarP1 = callIncomingScreen.p1();
        svj svjVar = (svj) callIncomingScreen.i.getValue();
        wsc wscVarB = mscVarP1.b();
        String[] strArr = wsc.k;
        boolean zC = false;
        if (!wscVarB.c(strArr)) {
            wsc wscVarB2 = mscVarP1.b();
            String[] strArr2 = wsc.i;
            if (wscVarB2.c(strArr2)) {
                wsc wscVarB3 = mscVarP1.b();
                String[] strArr3 = wsc.n;
                if (wscVarB3.c(strArr3)) {
                    if (mscVarP1.b().c(strArr2) && mscVarP1.b().c(wsc.n)) {
                        zC = mscVarP1.c(svjVar);
                    } else {
                        wsc wscVarB4 = mscVarP1.b();
                        wscVarB4.getClass();
                        wsc.h(wscVarB4, svjVar, strArr, 182, false, R.string.permissions_calls_audio_video_request, R.string.permissions_calls_audio_video_request_title, new jsc(R.drawable.calls_avd), null, 320);
                        zC = true;
                    }
                } else if (!mscVarP1.b().c(strArr3)) {
                    mscVarP1.b().p(svjVar);
                    zC = true;
                }
            } else {
                if (mscVarP1.b().c(strArr2)) {
                }
                wsc wscVarB5 = mscVarP1.b();
                wscVarB5.getClass();
                wsc.h(wscVarB5, svjVar, strArr, 182, false, R.string.permissions_calls_audio_video_request, R.string.permissions_calls_audio_video_request_title, new jsc(R.drawable.calls_avd), null, 320);
                zC = true;
            }
        }
        if (zC) {
            ((sa2) callIncomingScreen.h.getValue()).e(ns4.a(((dz4) ((x02) b95Var.i.a.getValue()).z().getValue()).c), "BEFORE_JOIN", ((dz4) ((x02) b95Var.i.a.getValue()).z().getValue()).i);
        } else {
            callIncomingScreen.q1().C(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0059  */
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
    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        d52 d52Var;
        ve1 ve1Var = new ve1(layoutInflater.getContext());
        ve1Var.setId(R.id.call_screen_incoming_container_id);
        ve1Var.setBackgroundColor(pq3.j.l(ve1Var).b.b().c);
        g52 g52Var = new g52(ve1Var.getContext(), getA().b());
        g52Var.setId(R.id.call_incoming_avatar);
        g52Var.setMode(c52.a);
        gm1 gm1Var = (gm1) q1().o.getValue();
        if (gm1Var instanceof em1) {
            em1 em1Var = (em1) gm1Var;
            if (em1Var.i || em1Var.k != null) {
                d52Var = d52.b;
            } else {
                d52Var = d52.c;
            }
        } else {
            d52Var = d52.b;
        }
        g52Var.setBackgroundState(d52Var);
        g52Var.setListener(new cm1(this));
        ve1Var.addView(g52Var, -1, -1);
        return ve1Var;
    }

    @Override // defpackage.br4
    public final void onDestroy() {
        super.onDestroy();
        ((m02) this.j.getValue()).a(requireActivity(), (k42) this.b.getAccessor().d(66).getValue());
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        if (!requireActivity().isChangingConfigurations()) {
            this.k.b = 0;
        }
        md1 md1Var = this.l;
        if (md1Var != null) {
            view.getContext().unregisterComponentCallbacks(md1Var);
        }
        this.l = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0012  */
    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        String[] strArr2;
        int[] iArr2;
        boolean zV;
        Object value;
        super.onRequestPermissionsResult(i, strArr, iArr);
        String name = CallIncomingScreen.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            strArr2 = strArr;
            iArr2 = iArr;
        } else {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbY = zo5.y(i, "incoming call permission: requestCode=", " permissions=");
                strArr2 = strArr;
                sbY.append(strArr2);
                sbY.append(" grantResults=");
                iArr2 = iArr;
                sbY.append(iArr2);
                a4cVar.c(je9Var, name, sbY.toString(), null);
            } else {
                strArr2 = strArr;
                iArr2 = iArr;
            }
        }
        p1().getClass();
        if (i == 160 || i == 182 || i == 159) {
            wsc wscVarB = p1().b();
            String[] strArr3 = wsc.i;
            if (wscVarB.c(strArr3)) {
                zV = true;
            } else {
                boolean z = i == 182 && !p1().b().c(wsc.n);
                zV = wsc.v((wsc) this.g.getValue(), (svj) this.i.getValue(), strArr2, iArr2, strArr3, z ? R.string.call_ask_permission_audio_video_denied_title : R.string.call_ask_permission_denied_title, z ? R.string.call_ask_permission_audio_video_denied_description : R.string.call_ask_permission_denied_description, 192);
            }
            boolean z2 = p1().b().c(wsc.n) && ((i == 182 || i == 159) || q1().p);
            if (zV) {
                q1().C(z2);
                return;
            }
            if (z2) {
                km1 km1VarQ1 = q1();
                Object value2 = km1VarQ1.o.getValue();
                em1 em1Var = value2 instanceof em1 ? (em1) value2 : null;
                if (em1Var == null) {
                    gm0.Y(km1.class.getName(), "Early return in enableCamera cuz of uiState.value as? CallIncomingState.Calling is null");
                    return;
                }
                mjg mjgVar = km1VarQ1.n;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, em1.a(em1Var, null, km1VarQ1.h.a(true) == yp9.b, null, null, null, false, null, null, 2045)));
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        o7j.d(requireActivity(), true);
        ltb ltbVarH = getRouter().h();
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), new ev(1, this));
        }
        e9i.j0(new fz6(n1g.v(q1().o, getViewLifecycleOwner().f(), n09.d), new sfd(28, (lq4) null, this), 3), getViewLifecycleScope());
        Context context = view.getContext();
        ufe ufeVar = new ufe();
        ufeVar.a = context.getResources().getConfiguration().orientation;
        md1 md1Var = new md1(ufeVar, this, 3);
        context.registerComponentCallbacks(md1Var);
        this.l = md1Var;
    }

    public final msc p1() {
        return (msc) this.d.getValue();
    }

    public final km1 q1() {
        return (km1) this.e.getValue();
    }
}
