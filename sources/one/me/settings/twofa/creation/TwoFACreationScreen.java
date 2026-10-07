package one.me.settings.twofa.creation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.a8j;
import defpackage.a9i;
import defpackage.af7;
import defpackage.ayb;
import defpackage.b2f;
import defpackage.b6i;
import defpackage.b7i;
import defpackage.b9i;
import defpackage.bdc;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.i19;
import defpackage.j0i;
import defpackage.j8e;
import defpackage.j95;
import defpackage.jz;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nff;
import defpackage.np4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.pk8;
import defpackage.pq3;
import defpackage.ptf;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.rcc;
import defpackage.ruh;
import defpackage.rx8;
import defpackage.sgg;
import defpackage.t2g;
import defpackage.tre;
import defpackage.uw8;
import defpackage.v6i;
import defpackage.w6i;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.x6i;
import defpackage.y6i;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yw1;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0011¨\u0006\u0014"}, d2 = {"Lone/me/settings/twofa/creation/TwoFACreationScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "La9i;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "type", "step", "source", "trackId", "Lha9;", "localAccountId", "Lpk8;", "navData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lha9;Lpk8;)V", "w6i", "v6i", "settings-twofa"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TwoFACreationScreen extends Widget implements mc4, a9i {
    public static final /* synthetic */ zv8[] n = {new dwd(TwoFACreationScreen.class, "twoFAView", "getTwoFAView()Lone/me/settings/twofa/creation/TwoFAView;", 0), zo5.f(zfe.a, TwoFACreationScreen.class, "scrollContentView", "getScrollContentView()Landroid/widget/ScrollView;", 0), new dwd(TwoFACreationScreen.class, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(TwoFACreationScreen.class, "resendCodeTimerView", "getResendCodeTimerView()Landroid/widget/TextView;", 0), new dwd(TwoFACreationScreen.class, "resendCodeButton", "getResendCodeButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final wtc a;
    public final oi8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ks6 f;
    public final ny8 g;
    public final ny8 h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;

    public TwoFACreationScreen(Bundle bundle) {
        super(bundle);
        this.a = new wtc(m35getAccountScopeuqN4xOY());
        this.b = oi8.f;
        this.c = rx8.P(3, new yw1(5, bundle));
        this.d = rx8.P(3, new yw1(6, bundle));
        this.e = rx8.P(3, new yw1(7, bundle));
        final int i = 0;
        this.f = tre.G(this, new af7(this) { // from class: u6i
            public final /* synthetic */ TwoFACreationScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                TwoFACreationScreen twoFACreationScreen = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = TwoFACreationScreen.n;
                        int iOrdinal = twoFACreationScreen.r1().ordinal();
                        if (iOrdinal == 0) {
                            int iOrdinal2 = twoFACreationScreen.p1().ordinal();
                            if (iOrdinal2 == 0) {
                                return y3f.AUTH_2FA_PASSWORD_CREATE;
                            }
                            if (iOrdinal2 == 1) {
                                return y3f.AUTH_2FA_SUGGEST;
                            }
                            if (iOrdinal2 == 2) {
                                return y3f.AUTH_2FA_EMAIL;
                            }
                            if (iOrdinal2 == 3) {
                                return y3f.AUTH_2FA_EMAIL_CODE;
                            }
                            ore.o();
                            return null;
                        }
                        if (iOrdinal == 1) {
                            int iOrdinal3 = twoFACreationScreen.p1().ordinal();
                            if (iOrdinal3 == 0) {
                                return y3f.SETTINGS_2FA_PASSWORD_CHANGE;
                            }
                            if (iOrdinal3 == 1) {
                                return null;
                            }
                            if (iOrdinal3 == 2) {
                                return y3f.SETTINGS_2FA_CHANGE_EMAIL;
                            }
                            if (iOrdinal3 == 3) {
                                return y3f.SETTINGS_2FA_EMAIL_CODE;
                            }
                            ore.o();
                            return null;
                        }
                        if (iOrdinal != 2) {
                            ore.o();
                            return null;
                        }
                        int iOrdinal4 = twoFACreationScreen.p1().ordinal();
                        if (iOrdinal4 == 0) {
                            return y3f.SETTINGS_2FA_PASSWORD_RESET_INPUT_NEW;
                        }
                        if (iOrdinal4 == 1 || iOrdinal4 == 2 || iOrdinal4 == 3) {
                            return null;
                        }
                        ore.o();
                        return null;
                    default:
                        zv8[] zv8VarArr2 = TwoFACreationScreen.n;
                        return new nk8(twoFACreationScreen.getRouter(), twoFACreationScreen.getB().b());
                }
            }
        });
        final int i2 = 1;
        this.g = rx8.P(3, new af7(this) { // from class: u6i
            public final /* synthetic */ TwoFACreationScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                TwoFACreationScreen twoFACreationScreen = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = TwoFACreationScreen.n;
                        int iOrdinal = twoFACreationScreen.r1().ordinal();
                        if (iOrdinal == 0) {
                            int iOrdinal2 = twoFACreationScreen.p1().ordinal();
                            if (iOrdinal2 == 0) {
                                return y3f.AUTH_2FA_PASSWORD_CREATE;
                            }
                            if (iOrdinal2 == 1) {
                                return y3f.AUTH_2FA_SUGGEST;
                            }
                            if (iOrdinal2 == 2) {
                                return y3f.AUTH_2FA_EMAIL;
                            }
                            if (iOrdinal2 == 3) {
                                return y3f.AUTH_2FA_EMAIL_CODE;
                            }
                            ore.o();
                            return null;
                        }
                        if (iOrdinal == 1) {
                            int iOrdinal3 = twoFACreationScreen.p1().ordinal();
                            if (iOrdinal3 == 0) {
                                return y3f.SETTINGS_2FA_PASSWORD_CHANGE;
                            }
                            if (iOrdinal3 == 1) {
                                return null;
                            }
                            if (iOrdinal3 == 2) {
                                return y3f.SETTINGS_2FA_CHANGE_EMAIL;
                            }
                            if (iOrdinal3 == 3) {
                                return y3f.SETTINGS_2FA_EMAIL_CODE;
                            }
                            ore.o();
                            return null;
                        }
                        if (iOrdinal != 2) {
                            ore.o();
                            return null;
                        }
                        int iOrdinal4 = twoFACreationScreen.p1().ordinal();
                        if (iOrdinal4 == 0) {
                            return y3f.SETTINGS_2FA_PASSWORD_RESET_INPUT_NEW;
                        }
                        if (iOrdinal4 == 1 || iOrdinal4 == 2 || iOrdinal4 == 3) {
                            return null;
                        }
                        ore.o();
                        return null;
                    default:
                        zv8[] zv8VarArr2 = TwoFACreationScreen.n;
                        return new nk8(twoFACreationScreen.getRouter(), twoFACreationScreen.getB().b());
                }
            }
        });
        this.h = createViewModelLazy(b7i.class, new t2g(23, new j0i(this, 2, bundle)));
        this.i = viewBinding(R.id.oneme_settings_twofa_onboarding_content);
        this.j = viewBinding(R.id.oneme_settings_twofa_onboarding_scroll_content);
        this.k = viewBinding(R.id.oneme_settings_twofa_action);
        this.l = viewBinding(R.id.oneme_settings_twofa_verify_email_resend_timer);
        this.m = viewBinding(R.id.oneme_settings_twofa_verify_email_resend_action);
    }

    @Override // defpackage.a9i
    public final void Q(CharSequence charSequence) {
        b7i b7iVarS1 = s1();
        String string = charSequence.toString();
        b7iVarS1.getClass();
        b7iVarS1.z.B(b7iVarS1, b7i.G[1], a8j.t(b7iVarS1, null, new y6i(b7iVarS1, string, null, 0), 1));
    }

    @Override // defpackage.a9i
    public final void a(String str) {
        b7i b7iVarS1 = s1();
        if (str.length() == 0) {
            gm0.Y(b7iVarS1.h, "Add email step: Can't check code because is empty");
            return;
        }
        sgg sggVar = b7iVarS1.D;
        if (sggVar == null || !sggVar.isActive()) {
            b7iVarS1.D = a8j.t(b7iVarS1, ((n0c) b7iVarS1.E()).b(), new b2f(b7iVarS1, str, (lq4) null, 3), 2);
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        b7i b7iVarS1 = s1();
        b7iVarS1.getClass();
        if (i == R.id.oneme_settings_twofa_empty_email_confirmation_action || i != R.id.oneme_settings_twofa_empty_email_confirmation_skip) {
            return;
        }
        b7iVarS1.B(null);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.f;
    }

    public final cyb o1() {
        return (cyb) this.k.m(this, n[2]);
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
    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(R.id.oneme_settings_twofa_onboarding_root);
        frameLayout.setBackgroundColor(pq3.j.h(frameLayout).b().c);
        final int i = 0;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipToOutline(false);
        rcc rccVar = new rcc(frameLayout.getContext());
        rccVar.setId(R.id.oneme_settings_twofa_onboarding_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setBackgroundColor(0);
        final int i2 = 1;
        if (r1() == w6i.a) {
            rccVar.setTitle(rccVar.getContext().getString(R.string.oneme_settings_twofa_creation_toolbar_steps, Integer.valueOf(p1().ordinal() + 1)));
        }
        rccVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        rccVar.setTranslationZ(1000.0f);
        rccVar.setLeftActions(new wbc(new ptf(23, this)));
        frameLayout.addView(rccVar);
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.setId(R.id.oneme_settings_twofa_onboarding_scroll_content);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        b9i b9iVar = new b9i(scrollView.getContext());
        b9iVar.setId(R.id.oneme_settings_twofa_onboarding_content);
        b9iVar.setPadding(b9iVar.getPaddingLeft(), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), b9iVar.getPaddingRight(), b9iVar.getPaddingBottom());
        b9iVar.setListener(this);
        scrollView.addView(b9iVar);
        frameLayout.addView(scrollView);
        bdc.a(rccVar, new b6i(rccVar, scrollView, 1));
        if (p1() != v6i.b) {
            cyb cybVar = new cyb(frameLayout.getContext());
            cybVar.setId(R.id.oneme_settings_twofa_action);
            cybVar.setSize(ayb.g);
            cybVar.setAppearance(zxb.PRIMARY);
            cybVar.setText(p1() == v6i.a ? np4.q(cybVar.getContext(), R.string.oneme_settings_twofa_creation_password_action) : np4.q(cybVar.getContext(), R.string.oneme_settings_twofa_creation_other_action));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
            int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
            layoutParams.setMarginStart(iK);
            layoutParams.setMarginEnd(iK);
            layoutParams.bottomMargin = iK;
            cybVar.setLayoutParams(layoutParams);
            qe7.H(cybVar, 300L, new View.OnClickListener(this) { // from class: t6i
                public final /* synthetic */ TwoFACreationScreen b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i;
                    int i4 = 2;
                    TwoFACreationScreen twoFACreationScreen = this.b;
                    switch (i3) {
                        case 0:
                            zv8[] zv8VarArr = TwoFACreationScreen.n;
                            b7i b7iVarS1 = twoFACreationScreen.s1();
                            ylc inputTexts = twoFACreationScreen.q1().getInputTexts();
                            zv8[] zv8VarArr2 = b7i.G;
                            dq4 dq4Var = b7iVarS1.b;
                            CharSequence charSequence = (CharSequence) inputTexts.a;
                            CharSequence charSequence2 = (CharSequence) inputTexts.b;
                            int iOrdinal = b7iVarS1.d.ordinal();
                            lq4 lq4Var = null;
                            if (iOrdinal == 0) {
                                b7iVarS1.y.B(b7iVarS1, zv8VarArr2[0], yab.h0(dq4Var, ((n0c) b7iVarS1.E()).b(), 2, new xra(charSequence != null ? r5h.y1(charSequence) : null, b7iVarS1, charSequence2 != null ? r5h.y1(charSequence2) : null, lq4Var, 27)));
                                break;
                            } else if (iOrdinal == 1) {
                                b7iVarS1.A.B(b7iVarS1, zv8VarArr2[2], yab.h0(dq4Var, ((n0c) b7iVarS1.E()).b(), 2, new z6i(b7iVarS1, charSequence, null, 1)));
                                break;
                            } else if (iOrdinal == 2) {
                                if (charSequence != null && charSequence.length() != 0) {
                                    b7iVarS1.B.B(b7iVarS1, zv8VarArr2[3], yab.h0(dq4Var, ((n0c) b7iVarS1.E()).b(), 2, new z6i(b7iVarS1, charSequence, null, 0)));
                                    break;
                                } else if (b7iVarS1.c == w6i.a) {
                                    a8j.x(b7iVarS1.u, new j7i(new tnh(R.string.oneme_settings_twofa_creation_email_empty_confirmation_title), new tnh(R.string.oneme_settings_twofa_creation_email_empty_confirmation_description), xw3.P0(new kc4(R.id.oneme_settings_twofa_empty_email_confirmation_action, new tnh(R.string.oneme_settings_twofa_creation_email_empty_confirmation_email_action), 3, true, 3, 3), new kc4(R.id.oneme_settings_twofa_empty_email_confirmation_skip, new tnh(R.string.oneme_settings_twofa_creation_email_empty_confirmation_skip_action), i4, 32)), null));
                                    break;
                                }
                            } else if (iOrdinal != 3) {
                                ore.o();
                                break;
                            }
                            break;
                        default:
                            zv8[] zv8VarArr3 = TwoFACreationScreen.n;
                            b7i b7iVarS2 = twoFACreationScreen.s1();
                            b7iVarS2.C.B(b7iVarS2, b7i.G[4], yab.h0(b7iVarS2.b, ((n0c) b7iVarS2.E()).b(), 2, new ryf(b7iVarS2, null, 23)));
                            break;
                    }
                }
            });
            bdc.a(cybVar, new ruh(cybVar, 1, scrollView));
            frameLayout.addView(cybVar);
            return frameLayout;
        }
        TextView textView = new TextView(frameLayout.getContext());
        textView.setId(R.id.oneme_settings_twofa_verify_email_resend_timer);
        q9i.a(q9i.i, textView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 80);
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams2.setMarginStart(iK2);
        layoutParams2.setMarginEnd(iK2);
        layoutParams2.bottomMargin = iK2;
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        frameLayout.addView(textView);
        cyb cybVar2 = new cyb(frameLayout.getContext());
        cybVar2.setId(R.id.oneme_settings_twofa_verify_email_resend_action);
        cybVar2.setText(np4.q(cybVar2.getContext(), R.string.oneme_settings_twofa_creation_email_verify_resend_code));
        cybVar2.setAppearance(zxb.GHOST);
        cybVar2.setSize(ayb.j);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 80);
        int iK3 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams3.setMarginStart(iK3);
        layoutParams3.setMarginEnd(iK3);
        layoutParams3.bottomMargin = iK3;
        cybVar2.setLayoutParams(layoutParams3);
        qe7.H(cybVar2, 300L, new View.OnClickListener(this) { // from class: t6i
            public final /* synthetic */ TwoFACreationScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                int i4 = 2;
                TwoFACreationScreen twoFACreationScreen = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = TwoFACreationScreen.n;
                        b7i b7iVarS1 = twoFACreationScreen.s1();
                        ylc inputTexts = twoFACreationScreen.q1().getInputTexts();
                        zv8[] zv8VarArr2 = b7i.G;
                        dq4 dq4Var = b7iVarS1.b;
                        CharSequence charSequence = (CharSequence) inputTexts.a;
                        CharSequence charSequence2 = (CharSequence) inputTexts.b;
                        int iOrdinal = b7iVarS1.d.ordinal();
                        lq4 lq4Var = null;
                        if (iOrdinal == 0) {
                            b7iVarS1.y.B(b7iVarS1, zv8VarArr2[0], yab.h0(dq4Var, ((n0c) b7iVarS1.E()).b(), 2, new xra(charSequence != null ? r5h.y1(charSequence) : null, b7iVarS1, charSequence2 != null ? r5h.y1(charSequence2) : null, lq4Var, 27)));
                            break;
                        } else if (iOrdinal == 1) {
                            b7iVarS1.A.B(b7iVarS1, zv8VarArr2[2], yab.h0(dq4Var, ((n0c) b7iVarS1.E()).b(), 2, new z6i(b7iVarS1, charSequence, null, 1)));
                            break;
                        } else if (iOrdinal == 2) {
                            if (charSequence != null && charSequence.length() != 0) {
                                b7iVarS1.B.B(b7iVarS1, zv8VarArr2[3], yab.h0(dq4Var, ((n0c) b7iVarS1.E()).b(), 2, new z6i(b7iVarS1, charSequence, null, 0)));
                                break;
                            } else if (b7iVarS1.c == w6i.a) {
                                a8j.x(b7iVarS1.u, new j7i(new tnh(R.string.oneme_settings_twofa_creation_email_empty_confirmation_title), new tnh(R.string.oneme_settings_twofa_creation_email_empty_confirmation_description), xw3.P0(new kc4(R.id.oneme_settings_twofa_empty_email_confirmation_action, new tnh(R.string.oneme_settings_twofa_creation_email_empty_confirmation_email_action), 3, true, 3, 3), new kc4(R.id.oneme_settings_twofa_empty_email_confirmation_skip, new tnh(R.string.oneme_settings_twofa_creation_email_empty_confirmation_skip_action), i4, 32)), null));
                                break;
                            }
                        } else if (iOrdinal != 3) {
                            ore.o();
                            break;
                        }
                        break;
                    default:
                        zv8[] zv8VarArr3 = TwoFACreationScreen.n;
                        b7i b7iVarS2 = twoFACreationScreen.s1();
                        b7iVarS2.C.B(b7iVarS2, b7i.G[4], yab.h0(b7iVarS2.b, ((n0c) b7iVarS2.E()).b(), 2, new ryf(b7iVarS2, null, 23)));
                        break;
                }
            }
        });
        frameLayout.addView(cybVar2);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        lq4 lq4Var = null;
        n1g.N(new nff(this, lq4Var, 7), view);
        jz jzVar = new jz(s1().p, 13);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new x6i(lq4Var, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().v, getViewLifecycleOwner().f(), n09Var), new x6i(lq4Var, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().w, getViewLifecycleOwner().f(), n09Var), new x6i(lq4Var, this, 2), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().u, getViewLifecycleOwner().f(), n09Var), new x6i(lq4Var, this, i), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().t, getViewLifecycleOwner().f(), n09Var), new x6i(lq4Var, this, 4), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(uw8.f, getViewLifecycleOwner().f(), n09Var), new x6i(lq4Var, this, 5), i), getViewLifecycleScope());
    }

    public final v6i p1() {
        return (v6i) this.c.getValue();
    }

    public final b9i q1() {
        return (b9i) this.i.m(this, n[0]);
    }

    public final w6i r1() {
        return (w6i) this.d.getValue();
    }

    public final b7i s1() {
        return (b7i) this.h.getValue();
    }

    @Override // defpackage.a9i
    public final void t(CharSequence charSequence) {
        b7i b7iVarS1 = s1();
        String string = charSequence.toString();
        b7iVarS1.getClass();
        b7iVarS1.z.B(b7iVarS1, b7i.G[1], a8j.t(b7iVarS1, null, new y6i(b7iVarS1, string, null, 1), 1));
    }

    public TwoFACreationScreen(String str, String str2, String str3, String str4, ha9 ha9Var, pk8 pk8Var) {
        this(n1g.i(new ylc("creation_2fa_type_key", str), new ylc("creation_2fa_step_key", str2), new ylc("creation_2fa_source_key", str3), new ylc("creation_2fa_track_id_key", str4), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("creation_2fa_nav_data_key", pk8Var)));
    }

    public /* synthetic */ TwoFACreationScreen(String str, String str2, String str3, String str4, ha9 ha9Var, pk8 pk8Var, int i, j95 j95Var) {
        this(str, str2, str3, str4, ha9Var, (i & 32) != 0 ? null : pk8Var);
    }
}
