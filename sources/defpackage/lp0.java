package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.profileedit.ProfileEditScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class lp0 extends g6g {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(ExecutorService executorService, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(executorService);
        this.f = 3;
        this.g = profileEditAdminPermissionsWidget;
        this.h = new vn7(25, this);
    }

    @Override // defpackage.g6g
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        switch (this.f) {
            case 0:
                ((mp0) s7gVar).B((bp0) ((k79) F(i)));
                break;
            case 1:
                N((rn7) s7gVar, i);
                break;
            case 2:
                O((wod) s7gVar, i);
                break;
            case 3:
                O((wod) s7gVar, i);
                break;
            default:
                O((wod) s7gVar, i);
                break;
        }
    }

    public void N(rn7 rn7Var, int i) {
        qn7 qn7Var = (qn7) ((k79) F(i));
        n61 n61Var = new n61(1, (pn7) this.h, pn7.class, "onGlobalContactClick", "onGlobalContactClick(Lone/me/contactlist/recyclerview/adapter/search/GlobalContactListItem;)V", 0, 28);
        rn7Var.B(qn7Var);
        izb izbVar = (izb) rn7Var.a;
        qe7.H(izbVar, 300L, new z36(n61Var, 8, qn7Var));
        izbVar.i();
    }

    public void O(wod wodVar, int i) {
        int i2 = this.f;
        Object obj = this.h;
        switch (i2) {
            case 2:
                vnd vndVar = (vnd) ((k79) F(i));
                wodVar.B(vndVar);
                if (vndVar instanceof xdf) {
                    ydf ydfVar = wodVar instanceof ydf ? (ydf) wodVar : null;
                    if (ydfVar != null) {
                        qe7.H(ydfVar.a, 300L, new aeb(ydfVar, 21, new nld(this, 0)));
                    }
                } else if (vndVar instanceof h1g) {
                    j1g j1gVar = wodVar instanceof j1g ? (j1g) wodVar : null;
                    if (j1gVar != null) {
                        j1gVar.w.addTextChangedListener(new rt1(j1gVar, 6, new nld(this, 1)));
                        qe7.H(j1gVar.A, 300L, new gwc(26, new old(this, 0)));
                        qe7.H(j1gVar.x, 300L, new gwc(27, new old(this, 1)));
                        qe7.H(j1gVar.y, 300L, new jvf(j1gVar, 3, new old(this, 2)));
                    }
                } else if (vndVar instanceof f8) {
                    e8 e8Var = wodVar instanceof e8 ? (e8) wodVar : null;
                    if (e8Var != null) {
                        View view = e8Var.a;
                        qe7.H(view, 300L, new d8(0, new k9d(this, 4, (f8) vndVar)));
                        ((atf) view).setOnSwitchListener((pld) obj);
                    }
                }
                break;
            case 3:
                vnd vndVar2 = (vnd) ((k79) F(i));
                wodVar.B(vndVar2);
                if (vndVar2 instanceof sj4) {
                    zl4 zl4Var = wodVar instanceof zl4 ? (zl4) wodVar : null;
                    if (zl4Var != null) {
                        qe7.H(zl4Var.a, 300L, new gwc(10, this));
                    }
                } else if (vndVar2 instanceof f8) {
                    e8 e8Var2 = wodVar instanceof e8 ? (e8) wodVar : null;
                    if (e8Var2 != null) {
                        View view2 = e8Var2.a;
                        ((atf) view2).setOnSwitchListener((vn7) obj);
                        qe7.H(view2, 300L, new d8(0, new k9d(this, 6, (f8) vndVar2)));
                    }
                } else if (vndVar2 instanceof ih5) {
                    hh5 hh5Var = wodVar instanceof hh5 ? (hh5) wodVar : null;
                    if (hh5Var != null) {
                        qe7.H(hh5Var.a, 300L, new d8(4, new a8d(12, this)));
                    }
                }
                break;
            default:
                vnd vndVar3 = (vnd) ((k79) F(i));
                wodVar.B(vndVar3);
                if (vndVar3 instanceof gw6) {
                    hw6 hw6Var = wodVar instanceof hw6 ? (hw6) wodVar : null;
                    if (hw6Var != null) {
                        hw6Var.u.addTextChangedListener(new rt1(new qod(this, 0), 2, hw6Var));
                    }
                } else if (vndVar3 instanceof yx8) {
                    zx8 zx8Var = wodVar instanceof zx8 ? (zx8) wodVar : null;
                    if (zx8Var != null) {
                        zx8Var.u.addTextChangedListener(new rt1(new qod(this, 1), 4, zx8Var));
                    }
                } else if (vndVar3 instanceof b83) {
                    c83 c83Var = wodVar instanceof c83 ? (c83) wodVar : null;
                    if (c83Var != null) {
                        c83Var.u.k(new tc(new qod(this, 2), 20, c83Var));
                    }
                } else if (vndVar3 instanceof ai5) {
                    gi5 gi5Var = wodVar instanceof gi5 ? (gi5) wodVar : null;
                    if (gi5Var != null) {
                        qod qodVar = new qod(this, 3);
                        ei5 ei5Var = (ei5) gi5Var.a;
                        nv4 nv4Var = new nv4(3, qodVar);
                        p1c p1cVar = ei5Var.j;
                        rt1 rt1Var = new rt1(nv4Var, 1, ei5Var);
                        p1cVar.addTextChangedListener(rt1Var);
                        bi5 bi5Var = new bi5(ei5Var, rt1Var);
                        b9b b9bVar = gi5Var.u;
                        bi5 bi5Var2 = (bi5) b9bVar.d("after_text_changed_releasable_id");
                        if (bi5Var2 != null) {
                            bi5Var2.a();
                        }
                        b9bVar.k("after_text_changed_releasable_id", bi5Var);
                    }
                } else if (vndVar3 instanceof zb8) {
                    ac8 ac8Var = wodVar instanceof ac8 ? (ac8) wodVar : null;
                    if (ac8Var != null) {
                        qe7.H(ac8Var.a, 300L, new o37(7, new rod(this, 0)));
                    }
                } else if (vndVar3 instanceof ih5) {
                    hh5 hh5Var2 = wodVar instanceof hh5 ? (hh5) wodVar : null;
                    if (hh5Var2 != null) {
                        qe7.H(hh5Var2.a, 300L, new d8(4, new rod(this, 1)));
                    }
                } else if (vndVar3 instanceof nj2) {
                    oj2 oj2Var = wodVar instanceof oj2 ? (oj2) wodVar : null;
                    if (oj2Var != null) {
                        qe7.H(oj2Var.u, 300L, new t8(11, new rod(this, 2)));
                    }
                } else if (vndVar3 instanceof f8) {
                    e8 e8Var3 = wodVar instanceof e8 ? (e8) wodVar : null;
                    if (e8Var3 != null) {
                        View view3 = e8Var3.a;
                        f8 f8Var = (f8) vndVar3;
                        qe7.H(view3, 300L, new d8(0, new k9d(this, 8, f8Var)));
                        if (f8Var.b.h instanceof ksf) {
                            ((atf) view3).setSwitchInterceptor(new qyb(11, this));
                        } else {
                            ((atf) view3).setSwitchInterceptor(null);
                        }
                        ((atf) view3).setOnSwitchListener((pld) obj);
                    }
                } else if (vndVar3 instanceof gh9) {
                    ih9 ih9Var = wodVar instanceof ih9 ? (ih9) wodVar : null;
                    if (ih9Var != null) {
                        qe7.H(ih9Var.a, 300L, new o37(16, new rod(this, 3)));
                    }
                }
                break;
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public int n(int i) {
        switch (this.f) {
            case 1:
                return R.id.oneme_contactlist_global_contact_view_type;
            case 2:
                return ((vnd) ((k79) F(i))).getF();
            case 3:
                return ((vnd) ((k79) F(i))).getF();
            case 4:
                return ((vnd) ((k79) F(i))).getF();
            default:
                return super.n(i);
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public final void u(lfe lfeVar, int i) {
        switch (this.f) {
            case 0:
                ((mp0) lfeVar).B((bp0) ((k79) F(i)));
                break;
            case 1:
                N((rn7) lfeVar, i);
                break;
            case 2:
                O((wod) lfeVar, i);
                break;
            case 3:
                O((wod) lfeVar, i);
                break;
            default:
                O((wod) lfeVar, i);
                break;
        }
    }

    @Override // defpackage.nee
    public void v(lfe lfeVar, int i, List list) {
        switch (this.f) {
            case 2:
                wod wodVar = (wod) lfeVar;
                if (list.isEmpty()) {
                    O(wodVar, i);
                } else {
                    for (Object obj : list) {
                        if (obj instanceof mod) {
                            mod modVar = (mod) obj;
                            if (modVar instanceof kod) {
                                j1g j1gVar = wodVar instanceof j1g ? (j1g) wodVar : null;
                                if (j1gVar != null) {
                                    j1gVar.H(((kod) obj).a);
                                }
                            } else if (modVar instanceof lod) {
                                e8 e8Var = wodVar instanceof e8 ? (e8) wodVar : null;
                                if (e8Var != null) {
                                    ((atf) e8Var.a).setChecked(((lod) obj).a);
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
            default:
                super.v(lfeVar, i, list);
                break;
            case 4:
                wod wodVar2 = (wod) lfeVar;
                if (list.isEmpty()) {
                    O(wodVar2, i);
                } else {
                    for (Object obj2 : list) {
                        if (obj2 instanceof mod) {
                            mod modVar2 = (mod) obj2;
                            if (modVar2 instanceof iod) {
                                hw6 hw6Var = wodVar2 instanceof hw6 ? (hw6) wodVar2 : null;
                                if (hw6Var != null) {
                                    hw6Var.H(((iod) obj2).a);
                                }
                            } else if (modVar2 instanceof jod) {
                                zx8 zx8Var = wodVar2 instanceof zx8 ? (zx8) wodVar2 : null;
                                if (zx8Var != null) {
                                    zx8Var.H(((jod) obj2).a);
                                }
                            } else if (modVar2 instanceof hod) {
                                c83 c83Var = wodVar2 instanceof c83 ? (c83) wodVar2 : null;
                                if (c83Var != null) {
                                    c83Var.H(((hod) obj2).a);
                                }
                            } else if (modVar2 instanceof lod) {
                                e8 e8Var2 = wodVar2 instanceof e8 ? (e8) wodVar2 : null;
                                if (e8Var2 != null) {
                                    ((atf) e8Var2.a).setChecked(((lod) obj2).a);
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                return new mp0(viewGroup.getContext(), (um4) obj, (kp0) this.h);
            case 1:
                return new rn7((j7c) obj, viewGroup.getContext());
            case 2:
                int i3 = i & 536870911;
                if (i3 == 8192) {
                    return new ydf(viewGroup.getContext());
                }
                if (i3 == 8) {
                    atf atfVar = new atf(viewGroup.getContext());
                    v1d v1dVar = new v1d(atfVar, 2);
                    atfVar.setModelItem(new ctf(8L, 0, new tnh(R.string.oneme_profile_edit_shortlink_title), null, null, new tnh(R.string.oneme_profile_edit_shortlink_description), null, null, null, false, null, 1752));
                    return v1dVar;
                }
                if (i3 == 16) {
                    return new j1g(viewGroup.getContext());
                }
                if (i3 == 2048) {
                    return new v1d(viewGroup.getContext());
                }
                if (i3 != 65536) {
                    if (i3 == 1024) {
                        return new e8(viewGroup.getContext());
                    }
                    ore.k(nbh.q(i, "unknown item viewType: "));
                    return null;
                }
                TextView textView = new TextView(viewGroup.getContext());
                v1d v1dVar2 = new v1d(textView, 0);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                textView.setGravity(17);
                textView.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
                q9i.a(q9i.i, textView);
                return v1dVar2;
            case 3:
                int i4 = i & 536870911;
                if (i4 == 1024) {
                    return new e8(viewGroup.getContext());
                }
                if (i4 == 2048 || i4 == 4096) {
                    return new v1d(viewGroup.getContext());
                }
                if (i4 == 32768) {
                    izb izbVar = new izb(viewGroup.getContext(), false);
                    zl4 zl4Var = new zl4(izbVar);
                    n1g.N(new n44(3, null, 1), izbVar);
                    return zl4Var;
                }
                if (i4 == 128) {
                    return new hh5(viewGroup.getContext());
                }
                ore.k(nbh.q(i, "unknown item viewType: "));
                return null;
            default:
                int i5 = i & 536870911;
                if (i5 == 1) {
                    return new hw6(viewGroup.getContext());
                }
                if (i5 == 2) {
                    return new zx8(viewGroup.getContext());
                }
                if (i5 == 131072) {
                    return new c83(viewGroup.getContext());
                }
                if (i5 == 4) {
                    return new gi5(viewGroup.getContext());
                }
                if (i5 == 64) {
                    return new ac8(viewGroup.getContext());
                }
                if (i5 == 128) {
                    return new hh5(viewGroup.getContext());
                }
                if (i5 == 256) {
                    return new oj2(viewGroup.getContext());
                }
                if (i5 == 512) {
                    cyb cybVar = new cyb(viewGroup.getContext());
                    ih9 ih9Var = new ih9(cybVar);
                    cybVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    cybVar.setSize(ayb.g);
                    cybVar.setAppearance(zxb.SECONDARY);
                    cybVar.setText(np4.q(cybVar.getContext(), R.string.oneme_profile_edit_logout_button));
                    return ih9Var;
                }
                if (i5 == 1024) {
                    return new e8(viewGroup.getContext());
                }
                if (i5 == 2048 || i5 == 4096) {
                    return new v1d(viewGroup.getContext());
                }
                ore.k(nbh.q(i, "unknown item viewType: "));
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lp0(Object obj, Object obj2, ExecutorService executorService, int i) {
        super(executorService);
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(ExecutorService executorService, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(executorService);
        this.f = 2;
        this.g = profileChangeLinkScreen;
        this.h = new pld(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(ExecutorService executorService, ProfileEditScreen profileEditScreen) {
        super(executorService);
        this.f = 4;
        this.g = profileEditScreen;
        this.h = new pld(1, this);
    }
}
