package one.me.login.confirm;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a4c;
import defpackage.a8j;
import defpackage.ayb;
import defpackage.bcc;
import defpackage.bdc;
import defpackage.ca2;
import defpackage.cc4;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ep7;
import defpackage.eph;
import defpackage.f00;
import defpackage.f7;
import defpackage.fb4;
import defpackage.fj3;
import defpackage.fz6;
import defpackage.g74;
import defpackage.gb4;
import defpackage.gc4;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.hb4;
import defpackage.hu4;
import defpackage.i20;
import defpackage.ib4;
import defpackage.j8e;
import defpackage.jb4;
import defpackage.je9;
import defpackage.jz;
import defpackage.kb4;
import defpackage.ks6;
import defpackage.ku6;
import defpackage.lq4;
import defpackage.m20;
import defpackage.mb4;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.np4;
import defpackage.nq4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ore;
import defpackage.p3c;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qb4;
import defpackage.qe7;
import defpackage.qyj;
import defpackage.r5h;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sbi;
import defpackage.sgg;
import defpackage.t3f;
import defpackage.tre;
import defpackage.vo8;
import defpackage.vv;
import defpackage.vz0;
import defpackage.wbc;
import defpackage.xhh;
import defpackage.ybc;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ynh;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zn3;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.a;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lone/me/login/confirm/ConfirmPhoneScreen;", "Lone/me/sdk/arch/Widget;", "", "Lcc4;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "verifyToken", "phone", "", "codeLength", "", "codeResendMillis", "countryNameCode", "Lt3f;", "scopeId", "(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Lt3f;)V", "login"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConfirmPhoneScreen extends Widget implements cc4, mc4 {
    public static final /* synthetic */ zv8[] z = {new dwd(ConfirmPhoneScreen.class, "verifyToken", "getVerifyToken()Ljava/lang/String;", 0), zo5.f(zfe.a, ConfirmPhoneScreen.class, "phone", "getPhone()Ljava/lang/String;", 0), new dwd(ConfirmPhoneScreen.class, "countryNameCode", "getCountryNameCode()Ljava/lang/String;", 0), new dwd(ConfirmPhoneScreen.class, "codeLength", "getCodeLength()I", 0), new dwd(ConfirmPhoneScreen.class, "timeLeft", "getTimeLeft()J", 0), new dwd(ConfirmPhoneScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(ConfirmPhoneScreen.class, "phoneDescTextView", "getPhoneDescTextView()Landroid/widget/TextView;", 0), new dwd(ConfirmPhoneScreen.class, "timerTextView", "getTimerTextView()Landroid/widget/TextView;", 0), new dwd(ConfirmPhoneScreen.class, "resendButton", "getResendButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(ConfirmPhoneScreen.class, "smsInputView", "getSmsInputView()Lone/me/sdk/codeinput/ConfirmSmsInputView;", 0), new z8b(ConfirmPhoneScreen.class, "loginAnimationJob", "getLoginAnimationJob()Lkotlinx/coroutines/Job;")};
    public final /* synthetic */ ku6 a;
    public final oi8 b;
    public final vv c;
    public final vv d;
    public final vv e;
    public final vv f;
    public final vv g;
    public final ca2 h;
    public final ks6 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final wbc m;
    public bcc n;
    public final j8e o;
    public final j8e p;
    public final j8e q;
    public final j8e r;
    public cyb s;
    public final ny8 t;
    public final j8e u;
    public TextView v;
    public final ny8 w;
    public AppCompatTextView x;
    public final p3c y;

    public ConfirmPhoneScreen(Bundle bundle) {
        super(bundle);
        this.a = new ku6(26);
        this.b = oi8.f;
        Class<String> cls = String.class;
        this.c = new vv("screen:confirm_phone:verify_token", cls);
        this.d = new vv("screen:confirm_phone:phone", cls);
        this.e = new vv("screen:confirm_phone:country_name_code", cls);
        this.f = new vv("screen:confirm_phone:code_length", Integer.class);
        this.g = new vv("screen:confirm_phone:code_resend", Long.class);
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.h = ca2Var;
        this.i = tre.G(this, new zn3(7));
        this.j = createViewModelLazy(qb4.class, new fj3(5, new hb4(this, 0)));
        this.k = rx8.P(3, new hb4(this, 1));
        this.l = ca2Var.a();
        wbc wbcVar = new wbc(new gb4(this, 1));
        this.m = wbcVar;
        this.n = wbcVar;
        this.o = viewBinding(R.id.oneme_login_confirm_toolbar);
        this.p = viewBinding(R.id.oneme_login_confirm_description);
        this.q = viewBinding(R.id.oneme_login_confirm_timer);
        this.r = viewBinding(R.id.oneme_login_confirm_resend_code);
        this.t = rx8.P(3, new hb4(this, 2));
        this.u = viewBinding(R.id.oneme_login_confirm_sms_input);
        this.w = rx8.P(3, new hb4(this, 3));
        this.y = qyj.S();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010c, code lost:
    
        if (defpackage.rx8.t(1000, r1) == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0131, code lost:
    
        if (defpackage.rx8.t(300, r1) == r2) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object o1(one.me.login.confirm.ConfirmPhoneScreen r10, defpackage.tbg r11, defpackage.lq4 r12) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.login.confirm.ConfirmPhoneScreen.o1(one.me.login.confirm.ConfirmPhoneScreen, tbg, lq4):java.lang.Object");
    }

    @Override // defpackage.cc4
    public final void a(String str) {
        qb4 qb4VarU1 = u1();
        qb4VarU1.getClass();
        String str2 = qb4.z;
        gm0.n(str2, "onCodeEntered");
        if (str.length() == 0) {
            gm0.Y(str2, "empty sms");
            return;
        }
        if (str.equals(qb4VarU1.v)) {
            gm0.Y(qb4.class.getName(), "Early return in onCodeEntered cuz of smsCode == processingCode");
            return;
        }
        a4c a4cVar = gm0.f;
        lq4 lq4Var = null;
        if (a4cVar != null) {
            je9 je9Var = je9.c;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "onCodeEntered, api pipeline started", null);
            }
        }
        qb4VarU1.v = str;
        qb4VarU1.x.B(qb4VarU1, qb4.y[0], (sgg) qb4VarU1.c.a(qb4VarU1.b, ((n0c) ((xhh) qb4VarU1.k.getValue())).b(), 2, new f00(qb4VarU1, str, lq4Var, 28)));
        this.n = ybc.a;
        ((rcc) this.o.m(this, z[5])).setLeftActions(this.n);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.oneme_login_sms_code_exceeded_ok_btn) {
            getRouter().D();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.i;
    }

    @Override // defpackage.br4
    public final boolean handleBack() {
        je9 je9Var = je9.c;
        if (cqk.d(this.n, this.m)) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ConfirmPhoneScreen", "handleBack", null);
            }
            getRouter().D();
            return true;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 == null || !a4cVar2.b(je9Var)) {
            return true;
        }
        a4cVar2.c(je9Var, "ConfirmPhoneScreen", "handleBack, skip", null);
        return true;
    }

    @Override // defpackage.br4
    public final void onActivityStopped(Activity activity) {
        Activity activity2 = getActivity();
        g74 g74Var = activity2 instanceof g74 ? (g74) activity2 : null;
        if (g74Var != null) {
            g74Var.a.f((mb4) this.t.getValue());
        }
        super.onActivityStopped(activity);
    }

    @Override // defpackage.br4
    public final void onAttach(View view) throws IllegalAccessException, InvocationTargetException {
        super.onAttach(view);
        s1().requestFocus();
        qb4 qb4VarU1 = u1();
        sgg sggVar = qb4VarU1.w;
        lq4 lq4Var = null;
        if (sggVar != null) {
            sggVar.b(null);
        }
        qb4VarU1.w = a8j.t(qb4VarU1, null, new i20(qb4VarU1, lq4Var, 11), 3);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String strW;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setId(R.id.oneme_login_confirm_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(this.n);
        linearLayout.setGravity(17);
        linearLayout.addView(rccVar);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(R.id.oneme_login_confirm_title);
        zv8[] zv8VarArr = z;
        zv8 zv8Var = zv8VarArr[2];
        if (cqk.d((String) this.e.a(this), "RU")) {
            strW = qe7.w(R.string.oneme_login_confirm_title_with_number_russian, getContext(), a.n1(new Object[]{q1()}));
        } else {
            strW = qe7.w(R.string.oneme_login_confirm_title_with_number_foreign, getContext(), a.n1(new Object[]{q1()}));
        }
        textView.setText(strW);
        q9i.a(q9i.c, textView);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0);
        textView.setLayoutParams(layoutParams);
        int i = 3;
        lq4 lq4Var = null;
        n1g.N(new f7(i, lq4Var, 13), textView);
        textView.setGravity(17);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(R.id.oneme_login_confirm_description);
        q9i.a(q9i.g, textView2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0);
        textView2.setLayoutParams(layoutParams2);
        n1g.N(new f7(i, lq4Var, 14), textView2);
        textView2.setGravity(17);
        linearLayout.addView(textView2);
        gc4 gc4Var = new gc4(linearLayout.getContext());
        gc4Var.setId(R.id.oneme_login_confirm_sms_input);
        gc4Var.setListener(this);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        gc4Var.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0);
        gc4Var.setLayoutParams(layoutParams3);
        bdc.a(gc4Var, new jb4(gc4Var, gc4Var, 0));
        gc4Var.setKeyboardOpen(new zn3(6));
        zv8 zv8Var2 = zv8VarArr[3];
        gc4Var.setCountCells(((Number) this.f.a(this)).intValue());
        linearLayout.setGravity(17);
        linearLayout.addView(gc4Var);
        View space = new Space(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, 0);
        layoutParams4.weight = 1.0f;
        space.setLayoutParams(layoutParams4);
        linearLayout.addView(space);
        TextView textView3 = new TextView(linearLayout.getContext());
        textView3.setId(R.id.oneme_login_confirm_timer);
        q9i.a(q9i.i, textView3);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        textView3.setLayoutParams(layoutParams5);
        n1g.N(new f7(i, lq4Var, 12), textView3);
        textView3.setGravity(17);
        linearLayout.addView(textView3);
        cyb cybVar = new cyb(linearLayout.getContext());
        cybVar.setId(R.id.oneme_login_confirm_resend_code);
        cybVar.setText(np4.q(getContext(), R.string.oneme_login_confirm_resend));
        cybVar.setAppearance(zxb.GHOST);
        cybVar.setSize(ayb.j);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        cybVar.setLayoutParams(layoutParams6);
        linearLayout.addView(cybVar);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        Activity activity = getActivity();
        g74 g74Var = activity instanceof g74 ? (g74) activity : null;
        if (g74Var != null) {
            g74Var.a.f((mb4) this.t.getValue());
        }
        w1();
        this.v = null;
        s1().setListener(null);
        this.s = null;
        super.onDestroyView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        lq4 lq4Var = null;
        eph ephVar = view instanceof eph ? (eph) view : null;
        if (ephVar != null) {
            ephVar.onThemeChanged(pq3.j.h(view));
        }
        zv8[] zv8VarArr = z;
        TextView textView = (TextView) this.p.m(this, zv8VarArr[6]);
        String strQ = np4.q(getContext(), R.string.oneme_login_confirm_description_confirm_codes);
        int i = 2;
        zv8 zv8Var = zv8VarArr[2];
        String strW = cqk.d((String) this.e.a(this), "RU") ? qe7.w(R.string.oneme_login_confirm_description_russian, getContext(), a.n1(new Object[]{strQ})) : qe7.w(R.string.oneme_login_confirm_description_foreign_with_chat_name, getContext(), a.n1(new Object[]{strQ}));
        int i2 = 0;
        int iV0 = r5h.V0(strW, strQ, 0, false, 6);
        CharSequence charSequence = strW;
        if (iV0 != -1) {
            SpannableString spannableStringValueOf = SpannableString.valueOf(strW);
            new vz0().a(spannableStringValueOf, iV0, strQ.length() + iV0);
            charSequence = spannableStringValueOf;
        }
        textView.setText(charSequence);
        qe7.H(r1(), 300L, new fb4(this, i2));
        s1().setOnAnimationEnded(new gb4(this, 0));
        int i3 = 3;
        e9i.j0(new fz6(n1g.v(u1().p, getViewLifecycleOwner().f(), n09.d), new kb4(null, this), i3), getViewLifecycleScope());
        e9i.j0(new fz6(u1().r, new kb4(this, lq4Var, 1), i3), getViewLifecycleScope());
        e9i.j0(new fz6(new jz(u1().s, 13), new kb4(this, lq4Var, i), i3), getViewLifecycleScope());
        e9i.j0(new fz6(u1().o, new m20(2, this, ConfirmPhoneScreen.class, "processSmsEvent", "processSmsEvent(Lone/me/login/confirm/SmsCodeResultEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 13), i3), getViewLifecycleScope());
        qb4 qb4VarU1 = u1();
        ep7 ep7Var = (ep7) qb4VarU1.l.getValue();
        ep7Var.g = qb4VarU1.d;
        ep7Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p1(TextView textView, int i, boolean z2, nq4 nq4Var) {
        ib4 ib4Var;
        if (nq4Var instanceof ib4) {
            ib4Var = (ib4) nq4Var;
            int i2 = ib4Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ib4Var.i = i2 - Integer.MIN_VALUE;
            } else {
                ib4Var = new ib4(this, nq4Var);
            }
        } else {
            ib4Var = new ib4(this, nq4Var);
        }
        Object obj = ib4Var.g;
        int i3 = ib4Var.i;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i3 == 0) {
            ch3.d0(obj);
            textView.setText(i);
            textView.setAlpha(0.0f);
            textView.animate().alpha(1.0f).setDuration(800L).start();
            ib4Var.d = textView;
            ib4Var.e = i;
            ib4Var.f = z2;
            ib4Var.i = 1;
            if (rx8.t(2800L, ib4Var) != hu4Var) {
            }
            return hu4Var;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = ib4Var.f;
        i = ib4Var.e;
        textView = ib4Var.d;
        ch3.d0(obj);
        if (!z2) {
            textView.animate().alpha(0.0f).setDuration(800L).start();
            ib4Var.d = null;
            ib4Var.e = i;
            ib4Var.f = z2;
            ib4Var.i = 2;
            if (rx8.t(800L, ib4Var) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }

    public final String q1() {
        zv8 zv8Var = z[1];
        return (String) this.d.a(this);
    }

    public final cyb r1() {
        return (cyb) this.r.m(this, z[8]);
    }

    public final gc4 s1() {
        return (gc4) this.u.m(this, z[9]);
    }

    public final TextView t1() {
        return (TextView) this.q.m(this, z[7]);
    }

    public final qb4 u1() {
        return (qb4) this.j.getValue();
    }

    public final void v1(String str) {
        boolean z2 = str != null;
        r1().setVisibility(!z2 ? 0 : 8);
        t1().setVisibility(z2 ? 0 : 8);
        r1().setAlpha(z2 ? 0.0f : 1.0f);
        t1().setAlpha(z2 ? 1.0f : 0.0f);
        if (str != null) {
            t1().setText(((String) this.w.getValue()) + " " + str);
        }
    }

    public final void w1() {
        zv8[] zv8VarArr = z;
        zv8 zv8Var = zv8VarArr[10];
        p3c p3cVar = this.y;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[10], null);
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.x);
        }
        this.x = null;
        v1((String) u1().r.a.getValue());
    }

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
    public final void x1(ynh ynhVar) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        if (this.v == null && ynhVar != null) {
            int iIndexOfChild = ((ViewGroup) getView()).indexOfChild(s1());
            TextView textView = new TextView(getContext());
            q9i.a(q9i.i, textView);
            textView.setTextColor(pq3.j.h(textView).getText().j);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
            textView.setLayoutParams(layoutParams);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            View view = getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.addView(textView, iIndexOfChild + 1);
            }
            this.v = textView;
        }
        float f = ynhVar != null ? 1.0f : 0.0f;
        TextView textView2 = this.v;
        if (textView2 != null) {
            textView2.setText(ynhVar != null ? ynhVar.b(getContext()) : null);
        }
        TextView textView3 = this.v;
        if (textView3 == null || (viewPropertyAnimatorAnimate = textView3.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(200L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f)) == null) {
            return;
        }
        viewPropertyAnimatorAlpha.start();
    }

    public ConfirmPhoneScreen(String str, String str2, int i, long j, String str3, t3f t3fVar) {
        this(n1g.i(new ylc("screen:confirm_phone:verify_token", str), new ylc("screen:confirm_phone:phone", str2), new ylc("screen:confirm_phone:code_length", Integer.valueOf(i)), new ylc("screen:confirm_phone:code_resend", Long.valueOf(j)), new ylc("screen:confirm_phone:country_name_code", str3), new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
