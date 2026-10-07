package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.profile.ProfileScreen;
import org.webrtc.PeerConnection;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vtd implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileScreen b;

    public /* synthetic */ vtd(ProfileScreen profileScreen, int i) {
        this.a = i;
        this.b = profileScreen;
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
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        a8g a8gVar = pq3.j;
        ProfileScreen profileScreen = this.b;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) obj;
                ku8 ku8Var = ProfileScreen.B;
                kwb kwbVar = new kwb(linearLayout.getContext());
                kwbVar.setId(R.id.profile_screen_avatar_view);
                int iK = gm0.K(ProfileScreen.D * yl5.d().getDisplayMetrics().density);
                kwb.w(kwbVar, iK);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iK, iK);
                layoutParams.gravity = 1;
                layoutParams.topMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                kwbVar.setLayoutParams(layoutParams);
                linearLayout.addView(kwbVar);
                TextView textView = new TextView(linearLayout.getContext());
                textView.setId(R.id.profile_screen_expandedtitle_view);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
                layoutParams2.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
                layoutParams2.topMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                layoutParams2.gravity = 1;
                textView.setLayoutParams(layoutParams2);
                np4.C(textView, false);
                textView.setMaxLines(3);
                textView.setGravity(1);
                q9i.a(q9i.b, textView);
                textView.setTextColor(a8gVar.h(textView).getText().b);
                linearLayout.addView(textView);
                vtd vtdVar = new vtd(profileScreen, 1);
                LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                linearLayout2.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), linearLayout2.getPaddingBottom());
                linearLayout2.setOrientation(0);
                linearLayout2.setBackground(null);
                linearLayout2.setGravity(1);
                vtdVar.invoke(linearLayout2);
                linearLayout.addView(linearLayout2);
                break;
            case 1:
                LinearLayout linearLayout3 = (LinearLayout) obj;
                ku8 ku8Var2 = ProfileScreen.B;
                linearLayout3.addView(new b69(linearLayout3.getContext(), new rea(2, this.b, ProfileScreen.class, "copyLinkToClipboardWithNotif", "copyLinkToClipboardWithNotif(Ljava/lang/String;Lru/ok/tamtam/android/link/LinkType;)V", 0, 13)));
                AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout3.getContext());
                appCompatTextView.setId(R.id.profile_dot_divider_view);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
                layoutParams3.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
                appCompatTextView.setLayoutParams(layoutParams3);
                appCompatTextView.setText("·");
                appCompatTextView.setGravity(1);
                noh nohVar = q9i.i;
                q9i.a(nohVar, appCompatTextView);
                n1g.N(new uk6(3, (lq4) null), appCompatTextView);
                linearLayout3.addView(appCompatTextView);
                TextView textView2 = new TextView(linearLayout3.getContext());
                textView2.setId(R.id.profile_screen_expandedsubtitle_view);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
                textView2.setLayoutParams(layoutParams4);
                textView2.setGravity(1);
                q9i.a(nohVar, textView2);
                textView2.setTextColor(a8gVar.h(textView2).getText().d);
                linearLayout3.addView(textView2);
                break;
            case 2:
                et4 et4Var = (et4) obj;
                ku8 ku8Var3 = ProfileScreen.B;
                rq rqVar = new rq(et4Var.getContext());
                rqVar.setId(R.id.profile_screen_appbarlayout);
                rqVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                rqVar.setBackground(null);
                ku8 ku8Var4 = ProfileScreen.B;
                vtd vtdVar2 = new vtd(profileScreen, 4);
                rw3 rw3Var = new rw3(rqVar.getContext());
                pq pqVar = new pq();
                pqVar.a = 19;
                rw3Var.setLayoutParams(pqVar);
                rw3Var.setTitleEnabled(false);
                vtdVar2.invoke(rw3Var);
                rqVar.addView(rw3Var);
                et4Var.addView(rqVar);
                NestedScrollView nestedScrollView = new NestedScrollView(et4Var.getContext());
                bt4 bt4Var = new bt4(-1, -1);
                bt4Var.b(new AppBarLayout$ScrollingViewBehavior());
                nestedScrollView.setLayoutParams(bt4Var);
                vtd vtdVar3 = new vtd(profileScreen, 3);
                LinearLayout linearLayout4 = new LinearLayout(nestedScrollView.getContext());
                linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout4.setOrientation(1);
                vtdVar3.invoke(linearLayout4);
                nestedScrollView.addView(linearLayout4);
                et4Var.addView(nestedScrollView);
                break;
            case 3:
                LinearLayout linearLayout5 = (LinearLayout) obj;
                ku8 ku8Var5 = ProfileScreen.B;
                k96 k96Var = new k96(linearLayout5.getContext());
                k96Var.setId(R.id.profile_screen_recyclerview);
                k96Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                k96Var.setItemAnimator(null);
                k96Var.getContext();
                k96Var.setLayoutManager(new LinearLayoutManager());
                k96Var.setOverScrollMode(2);
                a aVar = new a();
                aVar.setMaxRecycledViews(1, 1);
                aVar.setMaxRecycledViews(2, 1);
                aVar.setMaxRecycledViews(np0.m, 1);
                aVar.setMaxRecycledViews(2097152, 1);
                aVar.setMaxRecycledViews(16777216, 1);
                aVar.setMaxRecycledViews(64, 1);
                aVar.setMaxRecycledViews(PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, 1);
                aVar.setMaxRecycledViews(32, 1);
                aVar.setMaxRecycledViews(16, 1);
                aVar.setMaxRecycledViews(8, 1);
                aVar.setMaxRecycledViews(65536, 1);
                aVar.setMaxRecycledViews(np0.r, 1);
                k96Var.setRecycledViewPool(aVar);
                wtc wtcVar = profileScreen.c;
                k96Var.setAdapter(new dud(wtcVar.getExecutors().a(), wtcVar.getAccessor().d(248), wtcVar.getAccessor().d(26), profileScreen));
                whc whcVar = new whc((jic) wtcVar.getAccessor().d(248).getValue(), (dud) k96Var.getAdapter(), ((e5d) wtcVar.getAccessor().d(26).getValue()).i());
                profileScreen.A = whcVar;
                k96Var.k(whcVar);
                k96Var.setClipToPadding(false);
                k96Var.setClipChildren(false);
                k96Var.setPager(new gl1(profileScreen, 9));
                f8b f8bVar = jj8.a;
                f8b f8bVar2 = new f8b(3);
                f8bVar2.h(1);
                f8bVar2.h(4);
                f8bVar2.h(2);
                fv9 fv9Var = new fv9(k96Var, 26, f8bVar2);
                qyb qybVar = new qyb(12, k96Var);
                k96Var.h(new sbf(a8gVar.h(k96Var), fv9Var, null, null, null, 60), -1);
                k96Var.h(new ty7(a8gVar.h(k96Var), qybVar), -1);
                k96Var.h(new ym9(e4m.a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), np0.o, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 1024, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), np0.r, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f)), e4m.a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 18.0f), gm0.K(yl5.d().getDisplayMetrics().density * 18.0f), gm0.K(yl5.d().getDisplayMetrics().density * 18.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 18.0f), gm0.K(yl5.d().getDisplayMetrics().density * 18.0f), gm0.K(yl5.d().getDisplayMetrics().density * 18.0f), gm0.K(yl5.d().getDisplayMetrics().density * 18.0f), gm0.K(yl5.d().getDisplayMetrics().density * 18.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 18.0f), gm0.K(yl5.d().getDisplayMetrics().density * 18.0f), gm0.K(yl5.d().getDisplayMetrics().density * 18.0f), np0.o, 0, 1024, 0, np0.r, gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 18.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(18.0f * yl5.d().getDisplayMetrics().density)), e4m.a(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), 0, gm0.K(6.0f * yl5.d().getDisplayMetrics().density), 0, 0, 0, 0, 0, 0, 0, 0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), np0.r, gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), np0.o, gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), 1024, gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(10.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(0.0f * yl5.d().getDisplayMetrics().density)), 1), -1);
                linearLayout5.addView(k96Var);
                View tp2Var = new tp2(linearLayout5.getContext());
                tp2Var.setId(R.id.profile_screen_memberlist_container);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams5.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
                layoutParams5.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
                layoutParams5.bottomMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                layoutParams5.topMargin = gm0.K(3.0f * yl5.d().getDisplayMetrics().density);
                tp2Var.setLayoutParams(layoutParams5);
                tp2Var.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 16.0f));
                n1g.N(new nb3(3, null, 1), tp2Var);
                linearLayout5.addView(tp2Var);
                break;
            default:
                rw3 rw3Var2 = (rw3) obj;
                ku8 ku8Var6 = ProfileScreen.B;
                skd skdVar = new skd(profileScreen);
                Toolbar toolbar = new Toolbar(rw3Var2.getContext());
                ow3 ow3Var = new ow3(-1, -2);
                ow3Var.a = 1;
                toolbar.setLayoutParams(ow3Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.s(0, 0);
                skdVar.invoke(toolbar);
                rw3Var2.addView(toolbar);
                vtd vtdVar4 = new vtd(profileScreen, 0);
                LinearLayout linearLayout6 = new LinearLayout(rw3Var2.getContext());
                linearLayout6.setId(R.id.profile_screen_collapsiblecontainerlinearlayout);
                ow3 ow3Var2 = new ow3(-1, -2);
                ow3Var2.a = 2;
                ((FrameLayout.LayoutParams) ow3Var2).bottomMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                linearLayout6.setLayoutParams(ow3Var2);
                linearLayout6.setOrientation(1);
                vtdVar4.invoke(linearLayout6);
                rw3Var2.addView(linearLayout6);
                break;
        }
        return sbiVar;
    }
}
