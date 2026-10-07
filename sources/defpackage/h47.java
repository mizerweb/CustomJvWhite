package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.members.list.MembersListWidget;
import one.me.profile.screens.media.ChatMediaListWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class h47 extends g6g {
    public final /* synthetic */ int f;
    public Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h47(ThreadsStateViewerScreen threadsStateViewerScreen, ExecutorService executorService) {
        super(executorService);
        this.f = 13;
        this.g = threadsStateViewerScreen;
    }

    @Override // defpackage.g6g
    /* JADX INFO: renamed from: K */
    public void u(s7g s7gVar, int i) {
        switch (this.f) {
            case 0:
                s7gVar.B((k79) F(i));
                break;
            case 1:
            case 7:
            case 10:
            default:
                super.u(s7gVar, i);
                break;
            case 2:
                fe feVar = (fe) s7gVar;
                oc ocVar = (oc) ((k79) F(i));
                m mVar = new m(9, this);
                feVar.B(ocVar);
                ((izb) feVar.a).setOnClickListener(new ee(mVar, 0, ocVar));
                break;
            case 3:
                N((x23) s7gVar, i);
                break;
            case 4:
                O((qn4) s7gVar, i);
                break;
            case 5:
                mv4 mv4Var = (mv4) s7gVar;
                lv4 lv4Var = (lv4) ((k79) F(i));
                nv4 nv4Var = new nv4(0, this);
                mv4Var.B(lv4Var);
                ((LinearLayout) mv4Var.a).setOnClickListener(new ee(nv4Var, 28, lv4Var));
                break;
            case 6:
                P((wz7) s7gVar, i);
                break;
            case 8:
                Q((m8a) s7gVar, i);
                break;
            case 9:
                R((o9d) s7gVar, i);
                break;
            case 11:
                if (s7gVar instanceof drf) {
                    drf drfVar = (drf) s7gVar;
                    k79 k79Var = (k79) F(i);
                    krf krfVar = (krf) this.g;
                    drfVar.B(k79Var);
                    nrf nrfVar = drfVar.u;
                    if (nrfVar != null && nrfVar.b == v7c.a) {
                        View view = drfVar.a;
                        if (krfVar != null) {
                            qe7.H(view, 300L, new aeb(krfVar, 26, nrfVar));
                        } else {
                            ((atf) view).setOnClickListener(null);
                        }
                    }
                }
                break;
            case 12:
                k3h k3hVar = (k3h) ((k79) F(i));
                View view2 = ((y3h) s7gVar).a;
                izb izbVar = (izb) view2;
                long j = k3hVar.a;
                izbVar.setId((int) j);
                CharSequence charSequence = k3hVar.b;
                izbVar.setTitle(charSequence);
                izbVar.j(j, charSequence, k3hVar.c);
                izbVar.setReaction(k3hVar.d);
                view2.setOnClickListener(new jvf(this, 11, k3hVar));
                break;
        }
    }

    public void N(x23 x23Var, int i) {
        x7a x7aVar = (x7a) ((k79) F(i));
        if (x7aVar instanceof t7a) {
            x23Var.H(x7aVar, new n61(1, (ChatMediaListWidget) this.g, w23.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 5), new m20(2, (ChatMediaListWidget) this.g, w23.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 6));
            return;
        }
        if (!(x7aVar instanceof u7a)) {
            if (x7aVar instanceof v7a) {
                x23Var.H(x7aVar, new n61(1, (ChatMediaListWidget) this.g, w23.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 8), new m20(2, (ChatMediaListWidget) this.g, w23.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 8));
                return;
            }
            if (x7aVar instanceof s7a) {
                x23Var.H(x7aVar, new n61(1, (ChatMediaListWidget) this.g, w23.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 9), new m20(2, (ChatMediaListWidget) this.g, w23.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 9));
                return;
            } else if (x7aVar instanceof w7a) {
                x23Var.H(x7aVar, new n61(1, (ChatMediaListWidget) this.g, w23.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 4), new m20(2, (ChatMediaListWidget) this.g, w23.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 5));
                return;
            } else {
                ore.o();
                return;
            }
        }
        p03 p03Var = x23Var instanceof p03 ? (p03) x23Var : null;
        if (p03Var != null) {
            u7a u7aVar = (u7a) x7aVar;
            n61 n61Var = new n61(1, (ChatMediaListWidget) this.g, w23.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 6);
            m20 m20Var = new m20(2, (ChatMediaListWidget) this.g, w23.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 7);
            n61 n61Var2 = new n61(1, (ChatMediaListWidget) this.g, w23.class, "onLinkLongClick", "onLinkLongClick(Lone/me/profile/screens/media/model/MediaUiMessage$Link;)V", 0, 7);
            v23 v23Var = (v23) p03Var.a;
            p03Var.B(u7aVar);
            qe7.H(v23Var, 300L, new ee(n61Var, 13, u7aVar));
            v23Var.setOnLongClickListener(new o03(m20Var, u7aVar, p03Var, 0));
            v23Var.setLinkOnLongClickListener(new ro2(n61Var2, 1, u7aVar));
            v23Var.setOnLinkClickListener(new ee(n61Var2, 14, u7aVar));
        }
    }

    public void O(qn4 qn4Var, int i) {
        pn4 pn4Var = (pn4) ((k79) F(i));
        kj1 kj1Var = new kj1(0, (nn4) this.g, nn4.class, "onButtonClick", "onButtonClick()V", 0, 13);
        qn4Var.B(pn4Var);
        qn4Var.I(pn4Var.b, kj1Var);
    }

    public void P(wz7 wz7Var, int i) {
        hz7 hz7Var = (hz7) this.d.f.get(i);
        fz7 fz7Var = new fz7(1, (cjf) this.g, cjf.class, "onSelected", "onSelected(Ljava/lang/String;)V", 0, 0);
        View view = wz7Var.a;
        vz7 vz7Var = (vz7) view;
        vz7Var.s.setText(hz7Var.a);
        vz7Var.setSelected(hz7Var.b.booleanValue());
        qe7.H((vz7) view, 300L, new z36(fz7Var, 10, hz7Var));
    }

    public void Q(m8a m8aVar, int i) {
        l8a l8aVar = (l8a) ((k79) F(i));
        m20 m20Var = (l8aVar.h || l8aVar.i) ? null : new m20(2, (MembersListWidget) this.g, b9a.class, "onMemberLongClick", "onMemberLongClick(JLandroid/view/View;)V", 0, 29);
        w14 w14Var = new w14(l8aVar, 28, this);
        m8aVar.B(l8aVar);
        izb izbVar = (izb) m8aVar.a;
        qe7.H(izbVar, 300L, new z36(w14Var, 21, l8aVar));
        if (m20Var != null) {
            izbVar.setOnLongClickListener(new ro2(m20Var, 4, l8aVar));
        } else {
            izbVar.setOnLongClickListener(null);
            izbVar.setLongClickable(false);
        }
        izbVar.i();
    }

    public void R(o9d o9dVar, int i) {
        e9d e9dVar = (e9d) ((k79) F(i));
        if (!(o9dVar instanceof f9d)) {
            if (!(o9dVar instanceof d8d)) {
                o9dVar.B(e9dVar);
                return;
            } else {
                qe7.H(((d8d) o9dVar).a, 300L, new gwc(4, new occ(0, (z8d) this.g, z8d.class, "onClosePollClick", "onClosePollClick()V", 0, 1)));
                return;
            }
        }
        View view = ((f9d) o9dVar).a;
        u9d u9dVar = (u9d) e9dVar;
        vx9 vx9Var = new vx9(this, 29, e9dVar);
        izb izbVar = (izb) view;
        izbVar.setTitle(u9dVar.e);
        izbVar.setSubtitle(u9dVar.f);
        tj0 tj0Var = u9dVar.c;
        izbVar.j(tj0Var.a, tj0Var.b, u9dVar.d);
        qe7.H(view, 300L, new gwc(6, vx9Var));
    }

    @Override // defpackage.g6g, defpackage.nee
    public int n(int i) {
        switch (this.f) {
            case 1:
                return ((k79) F(i)).getF();
            case 2:
            case 6:
            case 7:
            case 9:
            default:
                return super.n(i);
            case 3:
                return ((x7a) this.d.f.get(i)).getF();
            case 4:
                return R.id.oneme_contactlist_empty_search_result_view_type;
            case 5:
                return R.id.oneme_startconversation_create_button_view_type;
            case 8:
                return 1;
            case 10:
                return R.id.chats_search_recent_header_view_type;
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public void u(lfe lfeVar, int i) {
        switch (this.f) {
            case 0:
                u((s7g) lfeVar, i);
                break;
            case 1:
            case 7:
            case 10:
            default:
                super.u(lfeVar, i);
                break;
            case 2:
                fe feVar = (fe) lfeVar;
                oc ocVar = (oc) ((k79) F(i));
                m mVar = new m(9, this);
                feVar.B(ocVar);
                ((izb) feVar.a).setOnClickListener(new ee(mVar, 0, ocVar));
                break;
            case 3:
                N((x23) lfeVar, i);
                break;
            case 4:
                O((qn4) lfeVar, i);
                break;
            case 5:
                mv4 mv4Var = (mv4) lfeVar;
                lv4 lv4Var = (lv4) ((k79) F(i));
                nv4 nv4Var = new nv4(0, this);
                mv4Var.B(lv4Var);
                ((LinearLayout) mv4Var.a).setOnClickListener(new ee(nv4Var, 28, lv4Var));
                break;
            case 6:
                P((wz7) lfeVar, i);
                break;
            case 8:
                Q((m8a) lfeVar, i);
                break;
            case 9:
                R((o9d) lfeVar, i);
                break;
            case 11:
                u((s7g) lfeVar, i);
                break;
            case 12:
                k3h k3hVar = (k3h) ((k79) F(i));
                View view = ((y3h) lfeVar).a;
                izb izbVar = (izb) view;
                long j = k3hVar.a;
                izbVar.setId((int) j);
                CharSequence charSequence = k3hVar.b;
                izbVar.setTitle(charSequence);
                izbVar.j(j, charSequence, k3hVar.c);
                izbVar.setReaction(k3hVar.d);
                view.setOnClickListener(new jvf(this, 11, k3hVar));
                break;
        }
    }

    @Override // defpackage.nee
    public void v(lfe lfeVar, int i, List list) {
        switch (this.f) {
            case 4:
                qn4 qn4Var = (qn4) lfeVar;
                Object objT1 = ww3.t1(list);
                if (objT1 == null) {
                    O(qn4Var, i);
                } else if (objT1 instanceof on4) {
                    qn4Var.I(((on4) objT1).a, new kj1(0, (nn4) this.g, nn4.class, "onButtonClick", "onButtonClick()V", 0, 14));
                }
                break;
            case 5:
            default:
                super.v(lfeVar, i, list);
                break;
            case 6:
                wz7 wz7Var = (wz7) lfeVar;
                Object objD1 = ww3.D1(list);
                if (objD1 == null) {
                    P(wz7Var, i);
                } else if (objD1 instanceof gz7) {
                    ((vz7) wz7Var.a).setSelected(((gz7) objD1).a.booleanValue());
                }
                break;
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        switch (this.f) {
            case 0:
                if (i == R.id.oneme_folder_widget_view_type) {
                    return new am0(viewGroup.getContext(), new g47(this, 0));
                }
                if (i == R.id.oneme_big_folder_widget_view_type) {
                    return new am0(viewGroup.getContext(), new g47(this, 1), (byte) 0);
                }
                throw new IllegalStateException(("Not supported viewType " + i + " for " + h47.class.getName()).toString());
            case 1:
                zo7 zo7Var = (zo7) this.g;
                if (i == R.id.about_app_simple_cell_view_type) {
                    return new bt1(viewGroup.getContext(), zo7Var, 1);
                }
                if (i == R.id.send_report_view_type) {
                    return new bt1(viewGroup.getContext(), zo7Var, 2);
                }
                ore.p("Not supported viewType for AboutAppAdapter");
                return null;
            case 2:
                return new fe(new izb(viewGroup.getContext(), false));
            case 3:
                if (i == R.id.profile_media_view_type_photo_video) {
                    return new ju2(new w33(viewGroup.getContext()), 1);
                }
                if (i == R.id.profile_media_view_type_file) {
                    return new oy2(viewGroup.getContext());
                }
                if (i == R.id.profile_media_view_type_link) {
                    return new p03(new v23(viewGroup.getContext()));
                }
                if (i == R.id.profile_media_view_type_audio) {
                    return new ju2(new n13(viewGroup.getContext()), 0);
                }
                if (i == R.id.profile_media_view_type_video_msg) {
                    return new ju2(new j43(viewGroup.getContext()), 2);
                }
                ore.k("ChatMedia: wrong viewType");
                return null;
            case 4:
                r1c r1cVar = new r1c(viewGroup.getContext());
                qn4 qn4Var = new qn4(r1cVar);
                r1cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return qn4Var;
            case 5:
                return new mv4(viewGroup);
            case 6:
                return new wz7(new vz7(viewGroup.getContext()));
            case 7:
                return new am0((oo6) this.g, viewGroup.getContext());
            case 8:
                return new m8a(new izb(viewGroup.getContext(), true));
            case 9:
                int i2 = 536870911 & i;
                if (i2 == 1) {
                    return new c9d(new j9d(viewGroup.getContext()), 1);
                }
                if (i2 == 2) {
                    return new f9d(new izb(viewGroup.getContext(), false));
                }
                if (i2 == 4) {
                    return new n9d(viewGroup.getContext(), new fz7(1, (z8d) this.g, z8d.class, "onShowAllVotersClick", "onShowAllVotersClick(I)V", 0, 17));
                }
                if (i2 != 8) {
                    if (i2 == 16) {
                        return new c9d(new b9d(viewGroup.getContext()), 0);
                    }
                    ore.p(c0a.k(i, "Unknown view type ", "!"));
                    return null;
                }
                cyb cybVar = new cyb(viewGroup.getContext());
                d8d d8dVar = new d8d(cybVar);
                cybVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                cybVar.setText(np4.q(cybVar.getContext(), R.string.oneme_poll_result__finish_poll_button_title));
                cybVar.setSize(ayb.g);
                cybVar.setAppearance(zxb.SECONDARY);
                return d8dVar;
            case 10:
                return new z91(new nda(new occ(0, (ej3) this.g, ej3.class, "onClearClick", "onClearClick()V", 0, 2), viewGroup.getContext()), 14);
            case 11:
                if (i != R.id.settings_devices_recycler_header_viewtype) {
                    if (i == R.id.settings_devices_recycler_session_item_viewtype) {
                        return new drf(new atf(viewGroup.getContext()));
                    }
                    ore.k(nbh.q(i, "unknown item viewType: "));
                    return null;
                }
                e22 e22Var = new e22(viewGroup.getContext(), null);
                e22Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                e22Var.setOrientation(1);
                ImageView imageView = new ImageView(e22Var.getContext());
                int iK = gm0.K(56.0f * yl5.d().getDisplayMetrics().density);
                imageView.setBackground(new ShapeDrawable(new qfg(2.3d)));
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iK, iK);
                layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
                layoutParams.bottomMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                layoutParams.gravity = 1;
                imageView.setLayoutParams(layoutParams);
                imageView.setImageResource(R.drawable.icon_devices);
                n1g.N(new o23(3, null, 11), imageView);
                e22Var.addView(imageView);
                TextView textView = new TextView(e22Var.getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
                layoutParams2.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
                layoutParams2.bottomMargin = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                layoutParams2.gravity = 1;
                textView.setLayoutParams(layoutParams2);
                textView.setGravity(17);
                textView.setText(R.string.settings_devices_header_title);
                q9i.a(q9i.f, textView);
                n1g.N(new xc9(3, null, 21), textView);
                e22Var.addView(textView);
                TextView textView2 = new TextView(e22Var.getContext());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
                layoutParams3.rightMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                layoutParams3.bottomMargin = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
                layoutParams3.gravity = 1;
                textView2.setLayoutParams(layoutParams3);
                textView2.setGravity(17);
                textView2.setText(R.string.settings_devices_header_description);
                q9i.a(q9i.i, textView2);
                n1g.N(new xc9(3, null, 20), textView2);
                e22Var.addView(textView2);
                return new z91(e22Var, 21);
            case 12:
                izb izbVar = new izb(viewGroup.getContext(), false);
                izbVar.setCustomTheme(pq3.j.e(viewGroup.getContext()).j().b);
                return new y3h(izbVar);
            default:
                return new tp4(((ThreadsStateViewerScreen) this.g).getContext());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h47(Executor executor) {
        super(executor);
        this.f = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h47(ExecutorService executorService, Object obj, int i) {
        super(executorService);
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h47(Object obj, ExecutorService executorService, int i) {
        super(executorService);
        this.f = i;
        this.g = obj;
    }
}
