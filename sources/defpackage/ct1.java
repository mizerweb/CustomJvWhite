package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import java.util.concurrent.Executor;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ct1 extends g6g {
    public final x7j f;
    public final ha9 g;
    public final at1 h;
    public final af7 i;
    public final af7 j;
    public final af7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct1(x7j x7jVar, ha9 ha9Var, Executor executor, at1 at1Var, af7 af7Var, r22 r22Var, gj1 gj1Var, int i) {
        super(executor);
        r22Var = (i & 32) != 0 ? null : r22Var;
        gj1Var = (i & 64) != 0 ? null : gj1Var;
        this.f = x7jVar;
        this.g = ha9Var;
        this.h = at1Var;
        this.i = af7Var;
        this.j = r22Var;
        this.k = gj1Var;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        v(s7gVar, i, r66.a);
    }

    @Override // defpackage.nee
    /* JADX INFO: renamed from: N */
    public final void v(s7g s7gVar, int i, List list) {
        af7 af7Var;
        View view = s7gVar.a;
        if ((s7gVar instanceof zs1 ? (zs1) s7gVar : null) != null) {
            if (this.f != x7j.c) {
                ((zs1) s7gVar).v.setMode(q52.SMALL);
            } else if (l() == 1 && (af7Var = this.k) != null && ((Number) af7Var.invoke()).intValue() == 0) {
                ((zs1) s7gVar).v.setMode(q52.BIG_AVATAR);
            } else {
                ((zs1) s7gVar).v.setMode(q52.MIDDLE);
            }
        }
        int iP = P(view.getContext());
        if (view.getWidth() != iP || view.getHeight() != iP) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams.width = iP;
                layoutParams.height = iP;
                view.setLayoutParams(layoutParams);
            }
        }
        d20 d20Var = this.d;
        if (((jp1) d20Var.f.get(i)).getF() != 1) {
            s7gVar.B((k79) d20Var.f.get(i));
            return;
        }
        if (list.isEmpty()) {
            s7gVar.B((k79) d20Var.f.get(i));
            return;
        }
        zs1 zs1Var = (zs1) s7gVar;
        s52 s52Var = zs1Var.v;
        pu6 pu6Var = new pu6(yhf.m0(yhf.q0(new sw(1, list), new xk1(10)), i9.s));
        while (pu6Var.hasNext()) {
            fp1 fp1Var = (fp1) pu6Var.next();
            if (fp1Var instanceof bp1) {
                bp1 bp1Var = (bp1) fp1Var;
                s52Var.I(bp1Var.b, bp1Var.a);
            } else if (fp1Var instanceof cp1) {
                s52Var.setRaiseHand(((cp1) fp1Var).a);
            } else if (fp1Var instanceof zo1) {
                s52Var.H(((zo1) fp1Var).a, true);
            } else if (fp1Var instanceof ap1) {
                s52Var.D(((ap1) fp1Var).a);
            } else if (fp1Var instanceof dp1) {
                s52Var.E(((dp1) fp1Var).a);
            } else if (fp1Var instanceof xo1) {
                s52Var.setAvatar(((xo1) fp1Var).a);
            } else if (fp1Var instanceof yo1) {
                s52Var.setButtonAction(zs1Var.w ? e61.a(((yo1) fp1Var).a, 0, 7) : ((yo1) fp1Var).a);
            } else {
                if (!(fp1Var instanceof ep1)) {
                    ore.o();
                    return;
                }
                s52Var.setOpponentVideo(((ep1) fp1Var).a);
            }
        }
    }

    public final void O(List list, af7 af7Var) {
        I(list, af7Var != null ? new eq0(2, af7Var) : null);
    }

    public final int P(Context context) {
        int iOrdinal = this.f.ordinal();
        if (iOrdinal == 0) {
            return yl5.a(context) <= 360.0f ? gm0.K(96.0f * yl5.d().getDisplayMetrics().density) : gm0.K(120.0f * yl5.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 1) {
            return gm0.K(0.0f * yl5.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 2) {
            return -1;
        }
        ore.o();
        return 0;
    }

    @Override // defpackage.g6g, defpackage.nee
    public final int n(int i) {
        return ((jp1) this.d.f.get(i)).getF();
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
    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        int iP = P(viewGroup.getContext());
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(iP, iP));
        final int i2 = 1;
        a8g a8gVar = pq3.j;
        final int i3 = 4;
        at1 at1Var = this.h;
        final int i4 = 2;
        final int i5 = 3;
        if (i != 3) {
            if (i == 4) {
                View y62Var = new y62(viewGroup.getContext());
                y62Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.addView(y62Var);
                return new am0(3, frameLayout, y62Var);
            }
            s52 s52Var = new s52(viewGroup.getContext(), this.g);
            s52Var.setId(R.id.call_opponent);
            int iOrdinal = this.f.ordinal();
            q52 q52Var = q52.SMALL;
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal != 2) {
                    ore.o();
                    return null;
                }
                q52Var = q52.MIDDLE;
            }
            s52Var.setMode(q52Var);
            s52Var.setCustomTheme(a8gVar.l(s52Var).b);
            s52Var.setCallSpeakerMediator(this.j);
            s52Var.setVideoLayoutUpdatesControllerProvider(this.i);
            frameLayout.addView(s52Var, -1, -1);
            return new zs1(frameLayout, at1Var);
        }
        Context context = viewGroup.getContext();
        final o12 o12Var = new o12(context, null);
        o12Var.setBackgroundColor(a8gVar.l(o12Var).b.b().f);
        o7j.f(yl5.d().getDisplayMetrics().density * 20.0f, o12Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.call_invite_banner_title_btn);
        final int i6 = 0;
        appCompatTextView.setLayoutParams(new uf4(-1, 0));
        appCompatTextView.setGravity(17);
        q9i.a(q9i.b, appCompatTextView);
        appCompatTextView.setTextColor(a8gVar.l(appCompatTextView).b.getText().b);
        appCompatTextView.setText(R.string.call_item_join_by_link_preview_title);
        wue wueVar = new wue(context);
        wueVar.setId(R.id.call_invite_banner_close_btn);
        a8gVar.l(wueVar);
        wueVar.x(R.drawable.icon_cross, -1);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        wueVar.setIconScaleType(scaleType);
        wueVar.setAccessibility(Integer.valueOf(R.string.call_close_dialog_accessibility));
        wueVar.setMode(rue.f);
        wueVar.setImageSize(new sue(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(yl5.d().getDisplayMetrics().density * 32.0f)));
        qe7.H(wueVar, 300L, new View.OnClickListener() { // from class: m12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7 = i6;
                o12 o12Var2 = o12Var;
                switch (i7) {
                    case 0:
                        n12 n12Var = o12Var2.s;
                        if (n12Var != null) {
                            n12Var.d();
                        }
                        break;
                    case 1:
                        n12 n12Var2 = o12Var2.s;
                        if (n12Var2 != null) {
                            n12Var2.b();
                        }
                        break;
                    case 2:
                        n12 n12Var3 = o12Var2.s;
                        if (n12Var3 != null) {
                            n12Var3.e();
                        }
                        break;
                    case 3:
                        n12 n12Var4 = o12Var2.s;
                        if (n12Var4 != null) {
                            n12Var4.g();
                        }
                        break;
                    default:
                        n12 n12Var5 = o12Var2.s;
                        if (n12Var5 != null) {
                            n12Var5.f();
                        }
                        break;
                }
            }
        });
        wue wueVar2 = new wue(context);
        wueVar2.setId(R.id.call_invite_banner_copy_btn);
        rue rueVar = rue.a;
        wueVar2.setMode(rueVar);
        wueVar2.setImageSize(new sue(gm0.K(yl5.d().getDisplayMetrics().density * 56.0f), gm0.K(yl5.d().getDisplayMetrics().density * 56.0f)));
        wue.z(wueVar2, R.drawable.icon_copy_fill);
        wueVar2.setIconScaleType(scaleType);
        wueVar2.setTitle(new tnh(R.string.call_item_join_by_link_preview_copy));
        wueVar2.setAccessibility(Integer.valueOf(R.string.call_item_join_by_link_preview_copy));
        qe7.H(wueVar2, 300L, new View.OnClickListener() { // from class: m12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7 = i2;
                o12 o12Var2 = o12Var;
                switch (i7) {
                    case 0:
                        n12 n12Var = o12Var2.s;
                        if (n12Var != null) {
                            n12Var.d();
                        }
                        break;
                    case 1:
                        n12 n12Var2 = o12Var2.s;
                        if (n12Var2 != null) {
                            n12Var2.b();
                        }
                        break;
                    case 2:
                        n12 n12Var3 = o12Var2.s;
                        if (n12Var3 != null) {
                            n12Var3.e();
                        }
                        break;
                    case 3:
                        n12 n12Var4 = o12Var2.s;
                        if (n12Var4 != null) {
                            n12Var4.g();
                        }
                        break;
                    default:
                        n12 n12Var5 = o12Var2.s;
                        if (n12Var5 != null) {
                            n12Var5.f();
                        }
                        break;
                }
            }
        });
        wue wueVar3 = new wue(context);
        wueVar3.setId(R.id.call_invite_banner_share_btn);
        wueVar3.setMode(rueVar);
        wueVar3.setImageSize(new sue(gm0.K(yl5.d().getDisplayMetrics().density * 56.0f), gm0.K(yl5.d().getDisplayMetrics().density * 56.0f)));
        wue.z(wueVar3, R.drawable.icon_share_android);
        wueVar3.setIconScaleType(scaleType);
        wueVar3.setTitle(new tnh(R.string.call_item_join_by_link_preview_share));
        wueVar3.setAccessibility(Integer.valueOf(R.string.call_item_join_by_link_preview_share));
        qe7.H(wueVar3, 300L, new View.OnClickListener() { // from class: m12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7 = i4;
                o12 o12Var2 = o12Var;
                switch (i7) {
                    case 0:
                        n12 n12Var = o12Var2.s;
                        if (n12Var != null) {
                            n12Var.d();
                        }
                        break;
                    case 1:
                        n12 n12Var2 = o12Var2.s;
                        if (n12Var2 != null) {
                            n12Var2.b();
                        }
                        break;
                    case 2:
                        n12 n12Var3 = o12Var2.s;
                        if (n12Var3 != null) {
                            n12Var3.e();
                        }
                        break;
                    case 3:
                        n12 n12Var4 = o12Var2.s;
                        if (n12Var4 != null) {
                            n12Var4.g();
                        }
                        break;
                    default:
                        n12 n12Var5 = o12Var2.s;
                        if (n12Var5 != null) {
                            n12Var5.f();
                        }
                        break;
                }
            }
        });
        wue wueVar4 = new wue(context);
        wueVar4.setId(R.id.call_invite_banner_send_btn);
        wueVar4.setMode(rueVar);
        wueVar4.setImageSize(new sue(gm0.K(yl5.d().getDisplayMetrics().density * 56.0f), gm0.K(56.0f * yl5.d().getDisplayMetrics().density)));
        wue.z(wueVar4, R.drawable.icon_forward_fill);
        wueVar4.setIconScaleType(scaleType);
        wueVar4.setTitle(new tnh(R.string.call_item_join_by_link_preview_send));
        wueVar4.setAccessibility(Integer.valueOf(R.string.call_item_join_by_link_preview_send));
        qe7.H(wueVar4, 300L, new View.OnClickListener() { // from class: m12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7 = i5;
                o12 o12Var2 = o12Var;
                switch (i7) {
                    case 0:
                        n12 n12Var = o12Var2.s;
                        if (n12Var != null) {
                            n12Var.d();
                        }
                        break;
                    case 1:
                        n12 n12Var2 = o12Var2.s;
                        if (n12Var2 != null) {
                            n12Var2.b();
                        }
                        break;
                    case 2:
                        n12 n12Var3 = o12Var2.s;
                        if (n12Var3 != null) {
                            n12Var3.e();
                        }
                        break;
                    case 3:
                        n12 n12Var4 = o12Var2.s;
                        if (n12Var4 != null) {
                            n12Var4.g();
                        }
                        break;
                    default:
                        n12 n12Var5 = o12Var2.s;
                        if (n12Var5 != null) {
                            n12Var5.f();
                        }
                        break;
                }
            }
        });
        qe7.H(o12Var, 300L, new View.OnClickListener() { // from class: m12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7 = i3;
                o12 o12Var2 = o12Var;
                switch (i7) {
                    case 0:
                        n12 n12Var = o12Var2.s;
                        if (n12Var != null) {
                            n12Var.d();
                        }
                        break;
                    case 1:
                        n12 n12Var2 = o12Var2.s;
                        if (n12Var2 != null) {
                            n12Var2.b();
                        }
                        break;
                    case 2:
                        n12 n12Var3 = o12Var2.s;
                        if (n12Var3 != null) {
                            n12Var3.e();
                        }
                        break;
                    case 3:
                        n12 n12Var4 = o12Var2.s;
                        if (n12Var4 != null) {
                            n12Var4.g();
                        }
                        break;
                    default:
                        n12 n12Var5 = o12Var2.s;
                        if (n12Var5 != null) {
                            n12Var5.f();
                        }
                        break;
                }
            }
        });
        o12Var.addView(appCompatTextView);
        o12Var.addView(wueVar);
        o12Var.addView(wueVar2);
        o12Var.addView(wueVar3);
        o12Var.addView(wueVar4);
        eg4 eg4VarH = ch3.h(o12Var);
        int id = wueVar.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.g(id).d.H = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        eg4VarH.d(id, 7, 0, 7);
        eg4VarH.g(id).d.J = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        int id2 = appCompatTextView.getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 4, wueVar2.getId(), 3);
        eg4VarH.d(id2, 7, 0, 7);
        eg4VarH.g(id2).d.J = c0a.d(12.0f, yl5.d().getDisplayMetrics().density, 2) + wueVar.getImageSize().a;
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.g(id2).d.K = c0a.d(12.0f, yl5.d().getDisplayMetrics().density, 2) + wueVar.getImageSize().a;
        int id3 = wueVar2.getId();
        eg4VarH.d(id3, 3, appCompatTextView.getId(), 4);
        eg4VarH.g(id3).d.H = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.g(id3).d.K = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        eg4VarH.d(id3, 7, wueVar4.getId(), 6);
        eg4VarH.d(id3, 4, 0, 4);
        eg4VarH.g(id3).d.I = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        int id4 = wueVar4.getId();
        eg4VarH.d(id4, 3, wueVar2.getId(), 3);
        eg4VarH.d(id4, 6, wueVar2.getId(), 7);
        eg4VarH.d(id4, 7, wueVar3.getId(), 6);
        eg4VarH.d(id4, 4, wueVar2.getId(), 4);
        int id5 = wueVar3.getId();
        eg4VarH.d(id5, 3, wueVar4.getId(), 3);
        eg4VarH.d(id5, 6, wueVar4.getId(), 7);
        eg4VarH.d(id5, 7, 0, 7);
        eg4VarH.g(id5).d.J = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        eg4VarH.d(id5, 4, wueVar4.getId(), 4);
        eg4VarH.a(o12Var);
        o12Var.setId(R.id.call_copy_link_preview);
        o12Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(o12Var);
        return new bt1(frameLayout, at1Var);
    }
}
