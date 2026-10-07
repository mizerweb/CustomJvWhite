package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import one.me.members.list.MembersListWidget;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zsj extends g6g {
    public final /* synthetic */ int f;
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsj(Executor executor, qlg qlgVar, occ occVar) {
        super(executor);
        this.f = 11;
        this.g = new phf(qlgVar, occVar, false, 3);
    }

    @Override // defpackage.g6g
    /* JADX INFO: renamed from: K */
    public void u(s7g s7gVar, int i) {
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                if (s7gVar instanceof wsj) {
                    wsj wsjVar = (wsj) s7gVar;
                    vsj vsjVar = (vsj) obj;
                    wsjVar.B((k79) F(i));
                    View view = wsjVar.a;
                    qe7.H(view, 300L, new jvf(wsjVar, 22, vsjVar));
                    ((atf) view).setOnSwitchCheckedListener(new uv2(wsjVar, 13, vsjVar));
                } else if (s7gVar instanceof xsj) {
                    xsj xsjVar = (xsj) s7gVar;
                    k79 k79Var = (k79) F(i);
                    ysj ysjVar = new ysj(1, (vsj) obj, vsj.class, "onItemClick", "onItemClick(Lone/me/webapp/model/WebAppsSectionItem;)V", 0, 0);
                    xsjVar.B(k79Var);
                    qe7.H(xsjVar.a, 300L, new jvf(xsjVar, 23, ysjVar));
                }
                break;
            case 1:
            case 2:
            case 6:
            case 11:
            default:
                super.u(s7gVar, i);
                break;
            case 3:
                O((qk4) s7gVar, i);
                break;
            case 4:
                P((xu4) s7gVar, i);
                break;
            case 5:
                Q((y37) s7gVar, i);
                break;
            case 7:
                R((g8a) s7gVar, i);
                break;
            case 8:
                k79 k79Var2 = (k79) this.d.f.get(i);
                if (k79Var2.getF() == 2 && (k79Var2 instanceof qeb)) {
                    ((q0g) ((reb) s7gVar).a).b.c();
                    break;
                } else if (k79Var2.getF() == 1 && (k79Var2 instanceof udb)) {
                    beb bebVar = (beb) s7gVar;
                    udb udbVar = (udb) k79Var2;
                    fz7 fz7Var = new fz7(1, (ceb) obj, ceb.class, "selectAvatar", "selectAvatar(Lone/me/login/common/avatars/NeuroAvatarModel;)V", 0, 13);
                    bebVar.B(udbVar);
                    qe7.H((l1c) bebVar.a, 300L, new aeb(fz7Var, 0, udbVar));
                    break;
                }
                break;
            case 9:
                S((u9e) s7gVar, i);
                break;
            case 10:
                if (!(s7gVar instanceof zqf)) {
                    s7gVar.B((k79) F(i));
                    break;
                } else {
                    zqf zqfVar = (zqf) s7gVar;
                    k79 k79Var3 = (k79) F(i);
                    ft0 ft0Var = (ft0) obj;
                    if (k79Var3 instanceof az0) {
                        zqfVar.B(k79Var3);
                        izb izbVar = (izb) zqfVar.a;
                        az0 az0Var = (az0) k79Var3;
                        if (az0Var.f) {
                            izbVar.n(null, (6 & 2) != 0 ? zxb.SECONDARY : zxb.GHOST, null, null);
                        } else {
                            izbVar.n(Integer.valueOf(R.drawable.icon_cross), (6 & 2) != 0 ? zxb.SECONDARY : zxb.GHOST, null, new xre(ft0Var, 9, az0Var));
                        }
                        qe7.H(izbVar, 300L, new aeb(ft0Var, 25, az0Var));
                        break;
                    }
                }
                break;
            case 12:
                T((eqh) s7gVar, i);
                break;
        }
    }

    public udb N(int i) {
        k79 k79Var = (k79) F(i);
        if (k79Var instanceof udb) {
            return (udb) k79Var;
        }
        return null;
    }

    public void O(qk4 qk4Var, int i) {
        ek4 ek4Var = (ek4) ((k79) F(i));
        j22 j22Var = new j22(22, this);
        uv2 uv2Var = new uv2(ek4Var, 1, this);
        w14 w14Var = new w14(ek4Var, 3, this);
        s81 s81Var = new s81(7, this);
        qk4Var.B(ek4Var);
        View view = qk4Var.a;
        qe7.H(view, 300L, new ee(w14Var, 22, ek4Var));
        izb izbVar = (izb) view;
        izbVar.setOnLongClickListener(new ro2(uv2Var, 2, ek4Var));
        if (!ek4Var.n || ek4Var.k) {
            ynh ynhVar = ek4Var.f;
            if (ynhVar != null) {
                CharSequence charSequenceC = ynhVar.c(izbVar.getContext().getResources());
                if (charSequenceC == null) {
                    ore.p("Required value was null.");
                    return;
                }
                izbVar.k(charSequenceC, new za2(j22Var, 27, ek4Var));
            } else {
                izbVar.i();
            }
        } else {
            izbVar.setCallButtons(new w14(s81Var, 4, ek4Var));
        }
        Boolean bool = ek4Var.m;
        izb izbVar2 = (izb) view;
        izbVar2.setSelectionEnabled(bool != null);
        izbVar2.setItemSelected(bool != null ? bool.booleanValue() : false);
    }

    public void P(xu4 xu4Var, int i) {
        x0c x0cVar = (x0c) ((k79) F(i));
        qyb qybVar = (qyb) this.g;
        View view = xu4Var.a;
        ((vu4) view).setCountryInfo(x0cVar);
        qe7.H(view, 300L, new ee(qybVar, 27, x0cVar));
    }

    public void Q(y37 y37Var, int i) {
        zmi zmiVar = (zmi) ((k79) F(i));
        n61 n61Var = (n61) this.g;
        ymi ymiVar = zmiVar.b;
        View view = y37Var.a;
        ymi ymiVar2 = ymi.a;
        if (ymiVar == ymiVar2) {
            ((TextView) view).setOnClickListener(null);
        } else {
            qe7.H(view, 300L, new x37(n61Var, zmiVar, 0));
        }
        if (ymiVar == ymiVar2) {
            ((TextView) view).setEnabled(false);
        }
        ((TextView) view).setText(zmiVar.c.a(y37Var));
    }

    public void R(g8a g8aVar, int i) {
        f8a f8aVar = (f8a) ((k79) F(i));
        fz7 fz7Var = new fz7(1, (MembersListWidget) this.g, h8a.class, "onMemberListActionClick", "onMemberListActionClick(I)V", 0, 4);
        g8aVar.B(f8aVar);
        qe7.H(g8aVar.a, 300L, new z36(fz7Var, 20, f8aVar));
    }

    public void S(u9e u9eVar, int i) {
        s9e s9eVar = (s9e) ((k79) F(i));
        fz7 fz7Var = new fz7(1, (yi3) this.g, yi3.class, "onRecentContactClick", "onRecentContactClick(Lone/me/chats/search/models/RecentContactModel;)V", 0, 21);
        u9eVar.B(s9eVar);
        qe7.H(u9eVar.a, 300L, new aeb(fz7Var, 20, s9eVar));
    }

    public void T(eqh eqhVar, int i) {
        aqh aqhVar = (aqh) this.d.f.get(i);
        fz7 fz7Var = new fz7(1, (fv) this.g, fv.class, "onThemeSelected", "onThemeSelected(Lone/me/appearancesettings/multitheme/model/ThemeItem;)V", 0, 27);
        eqhVar.B(aqhVar);
        qe7.H((cqh) eqhVar.a, 300L, new jvf(fz7Var, 16, aqhVar));
    }

    @Override // defpackage.y69, defpackage.nee
    public int l() {
        switch (this.f) {
            case 12:
                return this.d.f.size();
            default:
                return super.l();
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public int n(int i) {
        switch (this.f) {
            case 5:
                return o57.$EnumSwitchMapping$0[((zmi) ((k79) F(i))).b.ordinal()] == 1 ? R.id.oneme_folders_list_all_folder_view_type : R.id.oneme_folders_list_user_folder_view_type;
            case 8:
                return ((k79) this.d.f.get(i)).getF();
            case 11:
                return ((k79) F(i)).getF();
            default:
                return super.n(i);
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public /* bridge */ /* synthetic */ void u(lfe lfeVar, int i) {
        switch (this.f) {
            case 0:
                u((s7g) lfeVar, i);
                break;
            case 1:
            case 2:
            case 6:
            case 11:
            default:
                super.u(lfeVar, i);
                break;
            case 3:
                O((qk4) lfeVar, i);
                break;
            case 4:
                P((xu4) lfeVar, i);
                break;
            case 5:
                Q((y37) lfeVar, i);
                break;
            case 7:
                R((g8a) lfeVar, i);
                break;
            case 8:
                u((s7g) lfeVar, i);
                break;
            case 9:
                S((u9e) lfeVar, i);
                break;
            case 10:
                u((s7g) lfeVar, i);
                break;
            case 12:
                T((eqh) lfeVar, i);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nee
    public void v(lfe lfeVar, int i, List list) {
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 1:
                s7g s7gVar = (s7g) lfeVar;
                u(s7gVar, i);
                if (s7gVar instanceof u8) {
                    u8 u8Var = (u8) s7gVar;
                    r8 r8Var = (r8) ((k79) F(i));
                    u8Var.B(r8Var);
                    qe7.H(u8Var.a, 300L, new t8((v8) obj, 0, r8Var));
                } else {
                    s7gVar.B((k79) F(i));
                }
                break;
            case 2:
                s7g s7gVar2 = (s7g) lfeVar;
                u(s7gVar2, i);
                e5e e5eVar = s7gVar2 instanceof e5e ? (e5e) s7gVar2 : null;
                if (e5eVar != null) {
                    e5eVar.b((k79) F(i), (kx) obj);
                }
                break;
            case 3:
                qk4 qk4Var = (qk4) lfeVar;
                Object objD1 = ww3.D1(list);
                if (objD1 == null) {
                    O(qk4Var, i);
                } else if (objD1 instanceof dk4) {
                    Boolean bool = ((dk4) objD1).a;
                    izb izbVar = (izb) qk4Var.a;
                    izbVar.setSelectionEnabled(bool != null);
                    izbVar.setItemSelected(bool != null ? bool.booleanValue() : false);
                }
                break;
            case 9:
                u9e u9eVar = (u9e) lfeVar;
                View view = u9eVar.a;
                if (list.isEmpty()) {
                    S(u9eVar, i);
                } else {
                    for (Object obj2 : list) {
                        if (obj2 instanceof o9e) {
                            ((t9e) view).setAvatar(((o9e) obj2).a);
                        } else if (obj2 instanceof n9e) {
                            ((t9e) view).setAbbreviation(gm0.a(((n9e) obj2).a, Long.valueOf(u9eVar.e)));
                        } else if (obj2 instanceof p9e) {
                            ((t9e) view).setName(((p9e) obj2).a);
                        } else if (obj2 instanceof r9e) {
                            ((t9e) view).setVerified(((r9e) obj2).a);
                        } else if (obj2 instanceof q9e) {
                            ((t9e) view).setOnline(((q9e) obj2).a);
                        }
                    }
                }
                break;
            case 11:
                s7g s7gVar3 = (s7g) lfeVar;
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (it.next() instanceof slg) {
                            s7gVar3.C((k79) this.d.f.get(i), ww3.r1(list));
                            break;
                        }
                    }
                }
                u(s7gVar3, i);
                break;
            case 12:
                lfe lfeVar2 = (eqh) lfeVar;
                Object objD2 = ww3.D1(list);
                if (objD2 != null && (objD2 instanceof yph)) {
                    ((cqh) lfeVar2.a).setSelected(((yph) objD2).a);
                }
                u(lfeVar2, i);
                break;
            default:
                super.v(lfeVar, i, list);
                break;
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        switch (this.f) {
            case 0:
                if (i != R.id.webapp_root_settings_header) {
                    if (i == R.id.webapp_root_settings_transition) {
                        return new xsj(new atf(viewGroup.getContext()));
                    }
                    if (i == R.id.webapp_root_settings_switcher) {
                        return new wsj(new atf(viewGroup.getContext()));
                    }
                    String name = zsj.class.getName();
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, zo5.h(i, "unknown item viewType: "), null);
                        }
                    }
                    return new lvf(new View(viewGroup.getContext()), 10);
                }
                Context context = viewGroup.getContext();
                ViewGroup.LayoutParams weeVar = new wee(-1, -2);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setLayoutParams(weeVar);
                linearLayout.setOrientation(1);
                ImageView imageView = new ImageView(context);
                imageView.setBackground(new ShapeDrawable(new OvalShape()));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 54.0f), gm0.K(54.0f * yl5.d().getDisplayMetrics().density));
                layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
                layoutParams.bottomMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                layoutParams.gravity = 1;
                imageView.setLayoutParams(layoutParams);
                int iK = gm0.K(15.0f * yl5.d().getDisplayMetrics().density);
                imageView.setPadding(iK, iK, iK, iK);
                imageView.setImageResource(R.drawable.icon_services);
                n1g.N(new o23(3, null, 14), imageView);
                linearLayout.addView(imageView);
                int iK2 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                TextView textView = new TextView(context);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.leftMargin = iK2;
                layoutParams2.rightMargin = iK2;
                layoutParams2.bottomMargin = iK2;
                layoutParams2.gravity = 1;
                textView.setLayoutParams(layoutParams2);
                textView.setGravity(17);
                textView.setText(R.string.web_app_root_settings_header_title);
                q9i.a(q9i.f, textView);
                n1g.N(new yvf(3, null, 7), textView);
                linearLayout.addView(textView);
                TextView textView2 = new TextView(context);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.leftMargin = iK2;
                layoutParams3.rightMargin = iK2;
                layoutParams3.bottomMargin = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
                layoutParams3.gravity = 1;
                textView2.setLayoutParams(layoutParams3);
                textView2.setGravity(17);
                textView2.setText(R.string.web_app_root_settings_header_subtitle);
                q9i.a(q9i.i, textView2);
                n1g.N(new yvf(3, null, 8), textView2);
                linearLayout.addView(textView2);
                return new lvf(linearLayout, 9);
            case 1:
                return new u8(viewGroup.getContext());
            case 2:
                return i == R.id.media_editor_aspect_ratio_image_view_type ? new d58(viewGroup.getContext()) : new tj7(viewGroup.getContext());
            case 3:
                return new qk4(new izb(viewGroup.getContext(), false));
            case 4:
                return new xu4(new vu4(viewGroup.getContext()));
            case 5:
                ymi ymiVar = ymi.a;
                ymi ymiVar2 = i == R.id.oneme_folders_list_all_folder_view_type ? ymiVar : ymi.b;
                Context context2 = viewGroup.getContext();
                TextView textView3 = new TextView(context2);
                textView3.setLayoutParams(new wee(-1, -2));
                q9i.a(q9i.f, textView3);
                n1g.N(new dk6(3, null, 1), textView3);
                int iK3 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                if (ymiVar2 == ymiVar) {
                    textView3.setAlpha(0.35f);
                    textView3.setEnabled(false);
                    EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context2, R.drawable.ic_check_filled_24);
                    lvb.A0(enhancedVectorDrawable, "circle_background", c0a.h(pq3.j, context2).h);
                    textView3.setCompoundDrawablePadding(iK3);
                    ArrayList arrayList = soh.a;
                    textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(enhancedVectorDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                textView3.setGravity(16);
                int iK4 = gm0.K(18.0f * yl5.d().getDisplayMetrics().density);
                textView3.setPadding(iK3, iK4, iK3, iK4);
                l8j.a(textView3);
                return new y37(textView3);
            case 6:
                return new am0(7, new zrf(viewGroup.getContext()), (rj5) this.g);
            case 7:
                return new g8a(new atf(viewGroup.getContext()));
            case 8:
                if (i == 1) {
                    sdb sdbVar = new sdb(viewGroup.getContext());
                    sdbVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 64.0f), gm0.K(64.0f * yl5.d().getDisplayMetrics().density)));
                    return new beb(sdbVar);
                }
                if (i != 2) {
                    ahc.b(i, " is not supported in NeuroAvatarsAdapter", "Such viewType ");
                    return null;
                }
                q0g q0gVar = new q0g(viewGroup.getContext());
                int iK5 = gm0.K(64.0f * yl5.d().getDisplayMetrics().density);
                q0gVar.setLayoutParams(new ViewGroup.LayoutParams(iK5, iK5));
                q0gVar.setOutlineProvider(new nt4(iK5));
                q0gVar.setBackgroundColor(pq3.j.h(viewGroup).b().c);
                n1g.N(new np2(iK5, (lq4) null, 3), q0gVar);
                return new reb(q0gVar);
            case 9:
                return new u9e(new t9e(viewGroup.getContext()));
            case 10:
                return new zqf(new izb(viewGroup.getContext(), false));
            case 11:
                return phf.f((phf) this.g, viewGroup.getContext(), i, null, 12);
            default:
                return new eqh(new cqh(viewGroup.getContext()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zsj(ExecutorService executorService, Object obj, int i) {
        super(executorService);
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zsj(Object obj, Executor executor, int i) {
        super(executor);
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsj(rj5 rj5Var) {
        super(ForkJoinPool.commonPool());
        this.f = 6;
        this.g = rj5Var;
    }
}
